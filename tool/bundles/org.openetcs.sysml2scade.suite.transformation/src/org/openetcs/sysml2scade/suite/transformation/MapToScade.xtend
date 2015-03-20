package org.openetcs.sysml2scade.suite.transformation

import com.esterel.project.api.Project
import com.esterel.scade.api.Annotable
import com.esterel.scade.api.CallExpression
import com.esterel.scade.api.Equation
import com.esterel.scade.api.IdExpression
import com.esterel.scade.api.NamedType
import com.esterel.scade.api.OpCall
import com.esterel.scade.api.Operator
import com.esterel.scade.api.OperatorKind
import com.esterel.scade.api.Package
import com.esterel.scade.api.ScadeFactory
import com.esterel.scade.api.ScadePackage
import com.esterel.scade.api.Variable
import com.esterel.scade.api.pragmas.editor.Edge
import com.esterel.scade.api.pragmas.editor.EditorPragmasFactory
import com.esterel.scade.api.pragmas.editor.EditorPragmasPackage
import com.esterel.scade.api.pragmas.editor.EquationGE
import com.esterel.scade.api.pragmas.editor.NetDiagram
import com.esterel.scade.api.pragmas.editor.PresentationElement
import com.esterel.scade.api.pragmas.editor.util.EditorPragmasUtil
import com.esterel.scade.api.util.ScadeModelReader
import com.esterel.scade.api.util.ScadeModelWriter
import de.cau.cs.kieler.core.alg.BasicProgressMonitor
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.math.KVector
import de.cau.cs.kieler.core.math.KVectorChain
import de.cau.cs.kieler.kiml.AbstractLayoutProvider
import de.cau.cs.kieler.kiml.klayoutdata.KEdgeLayout
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortLabelPlacement
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.kiml.options.SizeConstraint
import de.cau.cs.kieler.kiml.options.SizeOptions
import de.cau.cs.kieler.kiml.util.FixedLayoutProvider
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klay.layered.LayeredLayoutProvider
import java.util.EnumSet
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.core.resources.IProject
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.papyrus.sysml.blocks.Block
import org.eclipse.papyrus.sysml.portandflows.FlowDirection
import org.eclipse.papyrus.sysml.portandflows.FlowPort
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Connector
import org.eclipse.uml2.uml.ConnectorEnd
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Type
import org.eclipse.xtext.xbase.lib.Functions.Function1

class MapToScade extends ScadeModelWriter {

	private val GRAPHICAL_OFFSET = 50f
	private val OPERATOR_SPACING = 500f
	private val PORT_SPACING = 500f
	private val PORT_HEIGHT = 300f
	private val PORT_WIDTH = 250f
	private val OPERATOR_MIN_HEIGHT = 1500f
	private val OPERATOR_MIN_WIDTH = 3000f
	private val OPERATOR_ASPECT_RATIO = 0.5f

	private static val INOUT_IN_NAME_PREFIX = "input_"
	private static val INOUT_OUT_NAME_PREFIX = "output_"

	private URI baseURI;
	private ResourceSet sysmlResourceSet;
	private ResourceSet scadeResourceSet;
	private XMLResource sysmlResource;
	private Package sysmlPackage;
	private Package scadeModel;
	private Package typePackage;
	private ScadeFactory theScadeFactory;
	private EditorPragmasFactory theEditorPragmasFactory;
	private Project scadeProject;
	private AbstractLayoutProvider layoutProvider
	private Map<Block, Operator> blockToOperatorMap;
	private Map<Variable, Variable> inputToVariableMap;
	private Map<FlowPort, Variable> flowportToOutputMap;
	private Map<FlowPort, Variable> flowportToInputMap;
	private Map<Variable, Equation> outputToEquationMap;

	private Trace tracefile;

	new(Model model, IProject project, Trace trace, Boolean update) {
		sysmlResource = model.eResource as XMLResource
		initialize(project, trace)
		if (update) {
			loadProject(project, model.name)
			val packages = new HashMap<String, Package>
			val operators = new HashMap<String, Operator>
			scadeModel.packages.forEach [
				packages.put(it.oid, it)
				it.operators.forEach[operators.put(it.oid, it)]
			]

		} else {
			newProject(project, model.name)
		}
	}

	new(Block block, IProject project, String name, Trace trace) {
		sysmlResource = block.eResource as XMLResource
		initialize(project, trace)
		newProject(project, name)

		val sysmlToScadePkg = new HashMap<org.eclipse.uml2.uml.Package, Package>()
		val sysmlToXScadePkg = new HashMap<org.eclipse.uml2.uml.Package, Resource>()
		val package = block.base_Class.eContainer as org.eclipse.uml2.uml.Package
		val scadePackage = createScadePackage(package.name)
		sysmlToScadePkg.put(package, scadePackage)
		val resourcePackage = createXScade(package.name)
		sysmlToXScadePkg.put(package, resourcePackage)
		resourcePackage.contents.add(scadePackage)
		var operator = createOperatorInterface(block)
		createOperatorImplementation(operator)
		scadePackage.operators.add(operator)
		blockToOperatorMap.put(block, operator)
		for (nBlock : block.nestedBlocks) {
			val pkg = block.base_Class.eContainer as org.eclipse.uml2.uml.Package
			var scadePkg = sysmlToScadePkg.get(pkg)
			if (scadePkg === null) {
				scadePkg = createScadePackage(pkg.name)
				sysmlToScadePkg.put(pkg, scadePkg)
			}
			var resourcePkg = sysmlToXScadePkg.get(pkg)
			if (resourcePkg === null) {
				resourcePkg = createXScade(pkg.name)
				resourcePkg.contents.add(scadePkg)
				sysmlToXScadePkg.put(pkg, resourcePkg)
			}
			var op = createOperatorInterface(nBlock)
			createOperatorImplementation(op)
			scadePackage.operators.add(operator)
			blockToOperatorMap.put(block, operator)
		}
		sysmlPackage = scadePackage
	}

	def private void initialize(IProject project, Trace trace) {
		sysmlResourceSet = sysmlResource.getResourceSet();
		scadeResourceSet = new ResourceSetImpl();
		theScadeFactory = ScadePackage.eINSTANCE.getScadeFactory()
		theEditorPragmasFactory = EditorPragmasPackage.eINSTANCE.getEditorPragmasFactory();

		blockToOperatorMap = new HashMap<Block, Operator>()
		layoutProvider = new LayeredLayoutProvider()
		inputToVariableMap = new HashMap<Variable, Variable>()
		flowportToOutputMap = new HashMap<FlowPort, Variable>()
		flowportToInputMap = new HashMap<FlowPort, Variable>()
		outputToEquationMap = new HashMap<Variable, Equation>()
		tracefile = trace
	}

	def private void newProject(IProject project, String projectName) {
		baseURI = URI.createFileURI(project.getLocation().toOSString());
		val projectURI = baseURI.appendSegment(projectName + ".etp");

		// Create empty SCADE project
		scadeProject = createEmptyScadeProject(projectURI, scadeResourceSet);

		// Load the create SCADE project
		scadeModel = loadModel(projectURI, scadeResourceSet);
		typePackage = createScadePackage("DataDictionary")

		val resource = createXScade("DataDictionary")
		resource.getContents().add(typePackage)
	}

	def private void loadProject(IProject project, String projectName) {
		baseURI = URI.createFileURI(project.getLocation().toOSString());
		val projectURI = baseURI.appendSegment(projectName + ".etp");
		scadeProject = ScadeModelReader.getProject(projectURI, scadeResourceSet)
		scadeModel = ScadeModelReader.loadModel(projectURI, scadeResourceSet)
		typePackage = scadeModel.packages.findFirst["DataDictionary".equals(it.name)]
	}

	/**
	 * Creates a new {@link org.eclipse.emf.ecore.resource.Resource} with the given name and "xscade" as ending.
	 * 
	 * @param name The name of the created Resource
	 * @return The created Resource
	 */
	def Resource createXScade(String name) {
		val uriXscade = baseURI.appendSegment(name + ".xscade");
		return scadeResourceSet.createResource(uriXscade);
	}

	/**
	 * Creates and initializes a new {@link com.esterel.scade.api.Package} with the given name.
	 * 
	 * @param name The name of the created Package
	 * @return The created Package
	 */
	def Package createScadePackage(String name) {
		val pkg = theScadeFactory.createPackage()
		pkg.setName(name)
		EditorPragmasUtil.setOid(pkg, EcoreUtil.generateUUID());
		return pkg
	}

	def Package iterateModel(org.eclipse.uml2.uml.Package pkg) {
		val scadePackage = createScadePackage(pkg.name)
		val resourcePackage = createXScade(pkg.name)
		resourcePackage.getContents().add(scadePackage)
		tracefile.addElement(pkg.UUID, pkg.eContainer.UUID, scadePackage.oid)

		for (block : pkg.getBlocks) {

			// Each Block is mapped to operator
			val operator = createOperatorInterface(block);
			createOperatorImplementation(operator);
			scadePackage.getOperators().add(operator);

			// Build list of generated blocks and operators
			blockToOperatorMap.put(block, operator)
		}
		for (p : pkg.nestedPackages) {
			scadePackage.getPackages().add(iterateModel(p))
		}

		return scadePackage
	}

	def createOperatorImplementation(Operator operator) {
		var i = 1;

		for (input : operator.getInputs()) {

			// Consider using the definedType directly instead of searching for it
			var type = (input.getType() as NamedType).type
			var variable = createNamedTypeVariable("_L" + i, type)
			operator.getLocals().add(variable);
			inputToVariableMap.put(input, variable)

			var equation = theScadeFactory.createEquation();
			EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID());
			equation.getLefts().add(variable);

			var idexpression = theScadeFactory.createIdExpression();
			idexpression.setPath(input);

			equation.setRight(idexpression);
			operator.getData().add(equation);

			i = i + 1;
		}
		for (output : operator.getOutputs()) {
			var equation = theScadeFactory.createEquation();
			EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID());
			equation.getLefts().add(output);
			operator.getData().add(equation);
			outputToEquationMap.put(output, equation)
		}
	}

	/**
	 * Creates and initializes an empty {@link com.esterel.scade.api.pragmas.editor.NetDiagram} and adds it to
	 * the given {@link com.esterel.scade.api.Operator}
	 * 
	 * @param operator The Operator for which the diagram is created
	 * @return The created Diagram
	 */
	def NetDiagram createScadeDiagram(Operator operator) {
		val operator_pragma = theEditorPragmasFactory.createOperator();
		operator.getPragmas().add(operator_pragma);
		operator_pragma.setNodeKind("graphical");
		val operator_diagram = theEditorPragmasFactory.createNetDiagram();
		operator_diagram.setName(operator.name + "_diagram");
		operator_diagram.setFormat("A4 (210 297)");
		operator_diagram.setLandscape(true);
		operator_pragma.getDiagrams().add(operator_diagram);

		return operator_diagram;
	}

	/**
	 * Transforms an {@link org.eclipse.papyrus.sysml.blocks.Block} to an {@link com.esterel.scade.api.Operator}
	 * 
	 * @param block The Block which is transformed
	 * @return The created Operator
	 */
	def createOperatorInterface(Block block) {
		val operator = theScadeFactory.createOperator();
		operator.setName(block.name);
		operator.setKind(OperatorKind.NODE_LITERAL);
		EditorPragmasUtil.setOid(operator, EcoreUtil.generateUUID());
		var blockID = block.base_Class.UUID
		tracefile.addElement(blockID, block.base_Class.eContainer.UUID, operator.oid)
		for (port : block.flowPorts) {
			var type = createScadeType(port.type)

			// Create the port
			if (port.direction.value == FlowDirection.OUT_VALUE) {
				var variable = createNamedTypeVariable(port.name, type)
				operator.getOutputs().add(variable)
				flowportToOutputMap.put(port, variable)
				tracefile.addElement(port.UUID, blockID, variable.oid)
			} else if (port.direction.value == FlowDirection.IN_VALUE) {
				var variable = createNamedTypeVariable(port.name, type)
				operator.getInputs().add(variable)
				flowportToInputMap.put(port, variable)
				tracefile.addElement(port.UUID, blockID, variable.oid)
			} else if (port.direction.value == FlowDirection.INOUT_VALUE) {
				var input = createNamedTypeVariable(INOUT_IN_NAME_PREFIX + port.name, type)
				operator.getInputs().add(input)
				flowportToInputMap.put(port, input)
				var output = createNamedTypeVariable(INOUT_OUT_NAME_PREFIX + port.name, type)
				operator.getOutputs().add(output)
				flowportToOutputMap.put(port, output)
				tracefile.addElement(port.UUID, blockID, input.oid, output.oid)
			}
		}
		return operator;
	}

	/**
	 * Returns a {@link com.esterel.scade.api.Type} on basis of the given {@link org.eclipse.uml2.uml.Type} by searching 
	 * for a {@link com.esterel.scade.api.Type} with the same name in {@link MapToScade#typePackage} or creating a new
	 * {@link com.esterel.scade.api.Type} if does not exist yet.
	 * If {@code uml_type} is null, or it has no name "int" is used as standard name.
	 * 
	 * @param uml_type {@link org.eclipse.uml2.uml.Type} for which the {@link com.esterel.scade.api.Type} is created
	 * @return The resulting {@link com.esterel.scade.api.Type}
	 */
	def createScadeType(Type uml_type) {
		var type_name = "int"

		if (uml_type != null && uml_type.name != null) {
			type_name = uml_type.name
		}

		var scade_type = findObject(typePackage, type_name, ScadePackage.Literals.TYPE) as com.esterel.scade.api.Type

		// If we dont have the type, create
		if (scade_type == null) {
			scade_type = theScadeFactory.createType()
			scade_type.name = type_name
			typePackage.getTypes().add(scade_type)
		}

		return scade_type
	}

	/**
	 * Creates a new object of type {@link com.esterel.scade.api.Variable} with the given name and type
	 * 
	 * @param name The name for the created Variable
	 * @param type The type of the Variable
	 * @return The created Variable
	 */
	def Variable createNamedTypeVariable(String name, com.esterel.scade.api.Type type) {

		// Create NamedType
		val namedType = theScadeFactory.createNamedType()
		namedType.setType(type)

		// Create Variable
		val variable = theScadeFactory.createVariable()
		variable.setName(name)
		variable.setType(namedType)
		EditorPragmasUtil.setOid(variable, EcoreUtil.generateUUID())

		return variable
	}

	/**
	 * Returns all {@link org.eclipse.papyrus.sysml.blocks.Block} references which are owned by {@code pkg}. This is done by
	 * filtering the list returned by {@link org.eclipse.uml2.uml.Element#getOwnedElements()}.
	 * 
	 * @see org.eclipse.uml2.uml.Element#getOwnedElements()
	 * 
	 * @param pkg The owner of the Blocks
	 * @return List of Blocks owned by {@code pkg}
	 */
	def EList<Block> getBlocks(Element pkg) {
		var list = new BasicEList<Block>

		for (Element element : pkg.ownedElements) {
			var stereotype = element.getAppliedStereotype("SysML::Blocks::Block")
			if (stereotype != null) {
				list.add(element.getStereotypeApplication(stereotype) as Block)
			}
		}

		return list
	}

	/**
	 * Transfers {@code model} to SCADE by creating an empty SCADE project and use the update mechanism to transfer the contents.
	 * 
	 * @param model The {@link org.eclipse.uml2.uml.Model} which to transfer
	 */
	def void fillModel(Model model) {
		sysmlPackage = createScadePackage(scadeModel.name)
		scadeModel.getPackages().add(typePackage)
		scadeModel.getPackages().add(sysmlPackage)

		var newPorts = new LinkedList<FlowPort>
		var newProperties = new LinkedList<Property>
		var blockInstances = new HashMap<String, LinkedList<Property>>
		var modelElements = new HashMap
		model.searchForNewAndMovedElements(modelElements, newPorts, newProperties, new LinkedList, blockInstances)
		addPorts(newPorts, modelElements)
		addEquations(newProperties, modelElements, blockInstances)

		addConnectors(modelElements)
		createGraphical(modelElements.values.filter[it instanceof Operator].map[it as Operator])

		tracefile.save

		// Put annotations in correct .ann file
		rearrangeAnnotations(scadeModel);

		// Ensure project contains appropriate FileRefs
		updateProjectWithModelFiles(scadeProject);

		// Save the project
		saveAll(scadeProject, null);
	}

	/**
	 * Adds the connectors to a newly created SCADE model.
	 * 
	 * @param scadeElements A map from the OIDs to all Packages, Operators, Ports and Equations of the SCADE model
	 */
	def addConnectors(HashMap<String, EObject> scadeElements) {
		var connectors = sysmlResourceSet.allContents.filter[it instanceof Connector].map[it as Connector]
		var inEnds = new LinkedList<ConnectorEnd>
		while (connectors.hasNext) {
			var connector = connectors.next
			var end = connector.ends.get(0)
			var direction = end.flowPort.direction.value
			if (direction == FlowDirection.INOUT_VALUE) {
				inEnds.addAll(connector.ends)
			} else if ((direction == FlowDirection.IN_VALUE) == (end.partWithPort != null)) {
				inEnds.add(end)
			} else {
				inEnds.add(end.oppositeEnd)
			}
		}
		for (end : inEnds) {
			var idexpression = fetchIdexpression(scadeElements, end)
			var Variable local
			val oppositeEnd = end.oppositeEnd
			if (oppositeEnd.partWithPort == null) {
				val operator = scadeElements.getBySourceID(oppositeEnd.flowPort.base_Port.eContainer.UUID) as Operator
				val input = scadeElements.get(
					tracefile.getTargetIDs(oppositeEnd.flowPort.UUID).findFirst [
					operator.inputs.contains(scadeElements.get(it))
				]) as Variable
				var equation = operator.data.findFirst [
					if (it instanceof Equation) {
						var expression = it.right
						if (expression instanceof IdExpression) {
							return expression.path.name == input.name
						}
					}
					return false
				] as Equation
				local = equation.lefts.get(0)
			} else {
				val operator = scadeElements.getBySourceID(oppositeEnd.flowPort.base_Port.eContainer.UUID) as Operator
				var ids = tracefile.getTargetIDs(oppositeEnd.flowPort.UUID)
				var index = -1
				for (var i = 0; index == -1 && i < ids.size; i++) {
					index = operator.outputs.indexOf(scadeElements.get(ids.get(i)))
				}
				val equation = scadeElements.getBySourceID(oppositeEnd.partWithPort.UUID) as Equation
				local = equation.lefts.get(index)
			}
			idexpression.path = local
		}
	}

	/**
	 * Retrieves the {@link com.esterel.scade.api.IdExpression} which represents the {@code end} parameter in the SCADE model.
	 * 
	 * @param scadeElements
	 * @param end The end for which the counterpart is fetched
	 * @return {@link com.esterel.scade.api.IdExpression} which is searched
	 */
	private def IdExpression fetchIdexpression(Map<String, EObject> scadeElements, ConnectorEnd end) {
		if (end.partWithPort == null) {
			val operator = scadeElements.getBySourceID(end.flowPort.base_Port.eContainer.UUID) as Operator
			var id = tracefile.getTargetIDs(end.flowPort.UUID).findFirst [
				operator.outputs.contains(scadeElements.get(it))
			]
			val output = scadeElements.get(id) as Variable
			var equation = operator.data.findFirst [
				if (it instanceof Equation) {
					return output.name == it.lefts.get(0)?.name
				}
				return false
			] as Equation
			if (equation.right == null) {
				var idexpression = theScadeFactory.createIdExpression
				equation.right = idexpression
				return idexpression
			} else {
				return equation.right as IdExpression
			}
		} else {
			val operator = scadeElements.getBySourceID(end.flowPort.base_Port.eContainer.UUID) as Operator
			var ids = tracefile.getTargetIDs(end.flowPort.UUID)
			var index = -1
			for (var i = 0; index == -1 && i < ids.size; i++) {
				index = operator.inputs.indexOf(scadeElements.get(ids.get(i)))
			}
			val equation = scadeElements.getBySourceID(end.partWithPort.UUID) as Equation
			return (equation.right as CallExpression).callParameters.get(index) as IdExpression
		}
	}

	def void fillScadeModel() {
		//scadeModel.getPackages().add(sysmlPackage)
		scadeModel.getPackages().add(typePackage)

		createHierarchy()
		createGraphical(blockToOperatorMap.values)

		tracefile.save

		// Put annotations in correct .ann file
		rearrangeAnnotations(scadeModel);

		// Ensure project contains appropriate FileRefs
		updateProjectWithModelFiles(scadeProject);

		// Save the project
		saveAll(scadeProject, null);
	}

	def createHierarchy() {
		for (entry : blockToOperatorMap.entrySet()) {
			var block = entry.key
			var operator = entry.value
			var name = 1;
			var locals_counter = operator.locals.size + 1

			var propertyToEquationMap = new HashMap<Property, Equation>()
			var equationToOutputToVariableMap = new HashMap<Equation, HashMap<Variable, Variable>>()
			var equationToOperatorMap = new HashMap<Equation, Operator>()
			var equationToCallMap = new HashMap<Equation, CallExpression>()
			var propertyToInputToConnectorendMap = new HashMap<Property, HashMap<Variable, ConnectorEnd>>()
			var outputToConnectorendMap = new HashMap<Variable, ConnectorEnd>()

			for (property : block.nestedBlocksAsProperties) {
				locals_counter = addOperatorCall(property, propertyToEquationMap, name, operator, equationToOperatorMap,
					equationToCallMap, locals_counter, equationToOutputToVariableMap)
				name++
			}
			mapConnectorends(block.base_Class.ownedConnectors, propertyToEquationMap, outputToConnectorendMap,
				propertyToInputToConnectorendMap)

			// Connect the outputs of block with the corresponding inputs
			for (destination : operator.outputs) {
				var end = outputToConnectorendMap.get(destination)
				var port = end.flowPort
				if (port != null) {
					var equation = propertyToEquationMap.get(end.partWithPort)
					if (end.partWithPort == null) {
						var input = flowportToInputMap.get(port)
						var source = inputToVariableMap.get(input)
						connectWithOutput(source, destination);
					} else if (equationToOutputToVariableMap.containsKey(equation)) {
						var sourcePort = flowportToOutputMap.get(port)
						var source = equationToOutputToVariableMap.get(equation, sourcePort)
						connectWithOutput(source, destination)
					}
				}
			}
			for (property : propertyToInputToConnectorendMap.keySet) {
				var equation = propertyToEquationMap.get(property)
				var op = equationToOperatorMap.get(equation)
				var call_expression = equationToCallMap.get(equation)
				var map = propertyToInputToConnectorendMap.get(property)
				if (op != null && map != null) {
					var dst_index = 1
					for (destination : op.inputs) {
						var end = map.get(destination)
						var port = end.flowPort
						if (port != null) {
							if (end.partWithPort == null) {
								var source = flowportToInputMap.get(port)
								var variable = inputToVariableMap.get(source)
								connectWithOperator(variable, call_expression)
							} else {
								var eq = propertyToEquationMap.get(end.partWithPort)
								var sourcePort = flowportToOutputMap.get(port)
								var source = equationToOutputToVariableMap.get(eq, sourcePort)
								connectWithOperator(source, call_expression)
							}
						} else {
							call_expression.callParameters.add(theScadeFactory.createIdExpression())
						}
						dst_index = dst_index + 1
					}
				}
			}
		}
	}

	def int addOperatorCall(Property property, HashMap<Property, Equation> propertyToEquationMap, int name,
		Operator operator, HashMap<Equation, Operator> equationToOperatorMap,
		HashMap<Equation, CallExpression> equationToCallMap, int locals_counter,
		HashMap<Equation, HashMap<Variable, Variable>> equationToOutputToVariableMap) {

		var nblock = property.block
		var equation = theScadeFactory.createEquation()
		var counter = locals_counter

		EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID())
		propertyToEquationMap.put(property, equation)
		tracefile.addElement(property.UUID, property.eContainer.UUID, equation.oid)

		var op = blockToOperatorMap.get(nblock)
		if (op != null) {
			var call_expression = theScadeFactory.createCallExpression()
			var call = theScadeFactory.createOpCall();
			call.setName(name.toString)
			call.setOperator(op)
			call_expression.setOperator(call)
			equation.setRight(call_expression)
			operator.getData().add(equation)
			equationToOperatorMap.put(equation, op)
			equationToCallMap.put(equation, call_expression)

			for (output : op.outputs) {
				var variable = createNamedTypeVariable("_L" + counter, (output.getType() as NamedType).getType());
				operator.getLocals().add(variable);
				equation.lefts.add(variable)
				equationToOutputToVariableMap.put(equation, output, variable)
				counter = counter + 1
			}
		} else {
			propertyToEquationMap.remove(property)
		}
		return counter
	}

	def mapConnectorends(EList<Connector> list, HashMap<Property, Equation> propertyToEquationMap,
		HashMap<Variable, ConnectorEnd> outputToConnectorendMap,
		HashMap<Property, HashMap<Variable, ConnectorEnd>> propertyToInputToConnectorendMap) {
		for (connector : list) {
			var end1 = connector.ends.get(0)
			var end2 = connector.ends.get(1)
			if (propertyToEquationMap.containsKey(end1.partWithPort) ||
				propertyToEquationMap.containsKey(end2.partWithPort)) {
				var port = end1.flowPort
				if ((port.direction.value == FlowDirection.IN_VALUE ||
					port.direction.value == FlowDirection.INOUT_VALUE) && end1.partWithPort != null) {
						propertyToInputToConnectorendMap.put(end1.partWithPort, flowportToInputMap.get(port), end2)
				}
				if ((port.direction.value == FlowDirection.OUT_VALUE ||
					port.direction.value == FlowDirection.INOUT_VALUE) && end1.partWithPort == null) {
						outputToConnectorendMap.put(flowportToOutputMap.get(port), end2)
				}

				port = end2.flowPort
				if ((port.direction.value == FlowDirection.IN_VALUE ||
					port.direction.value == FlowDirection.INOUT_VALUE) && end2.partWithPort != null) {
						propertyToInputToConnectorendMap.put(end2.partWithPort, flowportToInputMap.get(port), end1)
				}
				if ((port.direction.value == FlowDirection.OUT_VALUE ||
					port.direction.value == FlowDirection.INOUT_VALUE) && end2.partWithPort == null) {
						outputToConnectorendMap.put(flowportToOutputMap.get(port), end1)
				}
			}
			if (port != null && (port.direction.value == FlowDirection.OUT_VALUE ||
				port.direction.value == FlowDirection.INOUT_VALUE) && end1.partWithPort == null) {
				outputToConnectorendMap.put(flowportToOutputMap.get(port), end2)
			}

			port = end2.flowPort
			if (port != null && (port.direction.value == FlowDirection.IN_VALUE ||
				port.direction.value == FlowDirection.INOUT_VALUE) && end2.partWithPort != null) {
				propertyToInputToConnectorendMap.put(end2.partWithPort, flowportToInputMap.get(port), end1)
			}
			if (port != null && (port.direction.value == FlowDirection.OUT_VALUE ||
				port.direction.value == FlowDirection.INOUT_VALUE) && end2.partWithPort == null) {
				outputToConnectorendMap.put(flowportToOutputMap.get(port), end1)
			}

		//}
		}
	}

	/**
	 * Generates for all Operators in {@code operators} a diagram by generating a KIELER diagram, layouting it with KIELER and
	 * then transforming it to a SCADE diagram.
	 * 
	 * @param opeators The operators for which to generate a diagram
	 */
	def createGraphical(Iterable<Operator> operators) {
		for (operator : operators) {
			var inputMap = new HashMap<Variable, Equation>()
			var outputMap = new HashMap<Variable, Equation>()
			var callList = new LinkedList<Equation>()
			for (elem : operator.data) {
				var equation = elem as Equation
				if (equation.lefts.size == 1 && operator.outputs.contains(equation.lefts.get(0))) {
					outputMap.put(equation.lefts.get(0), equation)
				} else if (equation.right instanceof IdExpression) {
					inputMap.put((equation.right as IdExpression).path as Variable, equation)
				} else {
					callList.add(equation)
				}
			}

			var portToEquation = new HashMap<KPort, Equation>()
			var localsToSourcePort = new HashMap<Variable, KPort>()
			var callToNode = new HashMap<Equation, KNode>()
			var pNode = KimlUtil.createInitializedNode()
			var portToIndex = new HashMap<KPort, Integer>()

			for (var i = 0; i < operator.inputs.size; i++) {
				var input = operator.inputs.get(i)
				var port = KimlUtil.createInitializedPort()
				port.setNode(pNode)
				port.setSide(PortSide.WEST)
				var portLabel = KimlUtil.createInitializedLabel(port)
				portLabel.setText(input.name)
				var equation = inputMap.get(input)
				portToEquation.put(port, equation)
				portToIndex.put(port, 1)
				localsToSourcePort.put(equation.lefts.get(0), port)
			}
			for (equation : callList) {
				var cNode = KimlUtil.createInitializedNode()
				cNode.setParent(pNode)
				callToNode.put(equation, cNode)
				for (var i = 0; i < equation.lefts.size; i++) {
					var output = equation.lefts.get(i)
					var port = KimlUtil.createInitializedPort()
					port.setNode(cNode)
					port.setSide(PortSide.EAST)
					localsToSourcePort.put(output, port)
					portToEquation.put(port, equation)
					portToIndex.put(port, i + 1)
				}
			}
			for (var i = 0; i < operator.outputs.size; i++) {
				var output = operator.outputs.get(i)
				var port = KimlUtil.createInitializedPort()
				port.setNode(pNode)
				port.setSide(PortSide.EAST)
				var portLabel = KimlUtil.createInitializedLabel(port)
				portLabel.setText(output.name)
				var equation = outputMap.get(output)
				portToEquation.put(port, equation)
				portToIndex.put(port, 1)
				var idExpression = equation.right
				if (idExpression != null) {
					var source = (idExpression as IdExpression).path as Variable
					if (source != null) {
						localsToSourcePort.get(source).addEdgeTo(port)
					}
				}
			}
			for (equation : callList) {
				var parameters = (equation.right as CallExpression).callParameters
				for (var i = parameters.size; i > 0; i--) {
					var expression = parameters.get(i - 1) as IdExpression
					var cNode = callToNode.get(equation)
					var port = KimlUtil.createInitializedPort()
					port.setNode(cNode)
					port.setSide(PortSide.WEST)
					portToEquation.put(port, equation)
					portToIndex.put(port, i)
					var source = expression.path
					if (source != null) {
						localsToSourcePort.get(source).addEdgeTo(port)
					}
				}
			}
			pNode.addLayoutOptions
			var progressMonitor = new BasicProgressMonitor()
			layoutProvider.doLayout(pNode, progressMonitor)
			var diagram = createScadeDiagram(operator)
			diagram.fillDiagram(pNode, callToNode, portToEquation, portToIndex)
		}
	}

	/**
	 * Transforms a layouted KIELER graph to a {@link com.esterel.scade.api.pragmas.editor.NetDiagram}.
	 * 
	 * @param diagram The NetDiagram which is filled with content
	 * @param pNode The KNode Which is representing the Operator for which a diagram is generated
	 * @param callToNode A map linking Equation with CallExpression to KNode
	 * @param portToEquation A map linking KPort to Equation which represents the ports
	 * @param portToIndex A map mapping the KPort to their indexes
	 */
	def fillDiagram(NetDiagram diagram, KNode pNode, Map<Equation, KNode> callToNode,
		Map<KPort, Equation> portToEquation, Map<KPort, Integer> portToIndex) {
		var equationToGraphical = new HashMap<Equation, EquationGE>()
		for (entry : callToNode.entrySet) {
			var equation = entry.key
			var node = entry.value.getData(typeof(KShapeLayout))
			var graphical = equation.createEquationGE(node.xpos as int, node.ypos as int, node.width as int,
				node.height as int)
			diagram.presentationElements.add(graphical)
			equationToGraphical.put(equation, graphical)
		}
		for (port : pNode.ports) {
			if (port.edges.size > 0) {
				var equation = portToEquation.get(port)
				var layout = port.getData(typeof(KShapeLayout))
				var graphical = equation.createEquationGE(layout.xpos as int, layout.ypos as int, layout.width as int,
					layout.height as int)
				diagram.presentationElements.add(graphical)
				equationToGraphical.put(equation, graphical)
			}
		}
		var edgesList = new LinkedList<KEdge>()
		for (edge : pNode.incomingEdges) {
			edgesList.add(edge)
		}
		for (cNode : pNode.children) {
			for (edge : cNode.incomingEdges) {
				edgesList.add(edge)
			}
		}
		for (kEdge : edgesList) {
			var sEdge = theEditorPragmasFactory.createEdge
			var srcPort = kEdge.sourcePort
			var dstPort = kEdge.targetPort
			sEdge.setLeftVarIndex(portToIndex.get(srcPort))
			sEdge.setRightExprIndex(portToIndex.get(dstPort))
			sEdge.setSrcEquation(equationToGraphical.get(portToEquation.get(srcPort)))
			sEdge.setDstEquation(equationToGraphical.get(portToEquation.get(dstPort)))
			var layout = kEdge.getData(typeof(KEdgeLayout))

			var point = theEditorPragmasFactory.createPoint()
			point.setX(layout.sourcePoint.x as int)
			point.setY(layout.sourcePoint.y as int)
			sEdge.positions.add(point)
			var previousPoint = point
			for (bendPoint : layout.bendPoints) {
				point = theEditorPragmasFactory.createPoint()
				point.setX(bendPoint.x as int)
				point.setY(bendPoint.y as int)
				if (previousPoint.x != point.x || previousPoint.y != point.y) {
					sEdge.positions.add(point)
					previousPoint = point
				}
			}
			point = theEditorPragmasFactory.createPoint()
			point.setX(layout.targetPoint.x as int)
			point.setY(layout.targetPoint.y as int)
			if (previousPoint.x != point.x || previousPoint.y != point.y) {
				sEdge.positions.add(point)
			}
			diagram.presentationElements.add(sEdge)
		}
	}

	/**
	 * Updates a SCADE model according to the {@code model} by calling the various methods for deleting, creating, updating and moving
	 * the different elements of the model. After this new diagrams are generated. This does not apply to elements of type 
	 * {@link org.eclipse.uml2.uml.Connector}.
	 * 
	 * @param model
	 */
	def progressUpdate(Model model) {
		var modelElements = mapScadeModel()
		var removed = new LinkedList<String>
		for (id : tracefile.getAllSourceIDs()) {
			if (sysmlResource.getEObject(id) === null) {
				removed.add(id)
			}
		}
		var newPorts = new LinkedList<FlowPort>
		var newProperties = new LinkedList<Property>
		var moved = new LinkedList<EObject>
		var blockInstances = new HashMap<String, LinkedList<Property>>
		model.searchForNewAndMovedElements(modelElements, newPorts, newProperties, moved, blockInstances)
		var dispensableVariables = deleteElements(removed, modelElements, blockInstances)
		for (id : removed) {
			tracefile.removeElement(id)
		}
		updateElements(modelElements, blockInstances)
		addPorts(newPorts, modelElements)
		addEquations(newProperties, modelElements, blockInstances)
		dispensableVariables.addAll(moveElements(moved, modelElements, blockInstances))
		cleanupLocals(dispensableVariables)
		updateGraphical()

		// Put annotations in correct .ann file
		rearrangeAnnotations(scadeModel);

		// Ensure project contains appropriate FileRefs
		updateProjectWithModelFiles(scadeProject);

		// Save the project
		saveAll(scadeProject, null);

		tracefile.save()
	}

	/**
	 * Puts all packages, operators, ports and equations of {@link MapToScade#scadeModel} into a map with their OIDs as key and the
	 * element itself as value
	 * 
	 * @return Map containing all elements of the currently loaded SCADE model
	 */
	private def mapScadeModel() {
		var map = new HashMap<String, EObject>
		var packages = new LinkedList<Package>
		packages.addAll(scadeModel.packages)
		var Package package
		while (packages.size > 0) {
			package = packages.pop()
			packages.addAll(package.packages)
			map.put(package.oid, package)
			for (operator : package.operators) {
				map.put(operator.oid, operator)
				for (input : operator.inputs) {
					map.put(input.oid, input)
				}
				for (output : operator.outputs) {
					map.put(output.oid, output)
				}
				for (equation : operator.data) {
					map.put(equation.oid, equation)
				}
			}
		}
		return map
	}

	private def void searchForNewAndMovedElements(org.eclipse.uml2.uml.Package pkg, Map<String, EObject> modelElements,
		List<FlowPort> newPorts, List<Property> newProperties, List<EObject> moved,
		HashMap<String, LinkedList<Property>> blockInstances) {
		var scadePackage = modelElements.getBySourceID(pkg.UUID) as Package
		if (scadePackage === null) {
			scadePackage = createScadePackage(pkg.name);
			val resourcePackage = createXScade(pkg.name)
			resourcePackage.contents.add(scadePackage)
			modelElements.put(scadePackage.UUID, scadePackage)
			scadeModel.packages.add(scadePackage)
			val parentID = pkg.eContainer.UUID
			var parent = modelElements.getBySourceID(parentID) as Package
			tracefile.addElement(pkg.UUID, parentID, scadePackage.oid)
			if (parent != null) {
				parent.packages.add(scadePackage)
			}
		} else if (tracefile.getParentID(pkg.UUID) != pkg.eContainer.UUID) {
			moved.add(pkg);
		}
		for (block : pkg.blocks) {
			var blockID = block.base_Class.UUID
			if (!tracefile.isTransferred(blockID)) {
				var operator = createOperatorInterface(block);
				createOperatorImplementation(operator);
				scadePackage.operators.add(operator)
				modelElements.put(operator.UUID, operator)
				modelElements.putAll(operator.inputs.toMap[it.oid])
				modelElements.putAll(operator.outputs.toMap[it.oid])
			} else if (tracefile.getParentID(blockID) != block.base_Class.eContainer.UUID) {
				moved.add(block)
			}
			for (port : block.flowPorts) {
				var portID = port.UUID
				if (!tracefile.isTransferred(portID)) {
					newPorts.add(port)
				} else if (tracefile.getParentID(portID) != port.base_Port.eContainer.UUID) {
					moved.add(port)
				}
			}
			for (property : block.nestedBlocksAsProperties) {
				var list = blockInstances.get(property.block.base_Class.UUID)
				if (list === null) {
					list = new LinkedList<Property>
					blockInstances.put(property.block.base_Class.UUID, list)
				}
				list.add(property)
				var id = property.UUID
				if (!tracefile.isTransferred(id)) {
					newProperties.add(property)
				} else if (tracefile.getParentID(id) != property.eContainer.UUID) {
					moved.add(property)
				}
			}
		}
		for (p : pkg.nestedPackages) {
			p.searchForNewAndMovedElements(modelElements, newPorts, newProperties, moved, blockInstances)
		}
	}

	/**
	 * Utility function for easy access to elements which should have only one representation in a SCADE model
	 */
	def <R> R getBySourceID(Map<String, R> map, String sourceID) {
		return map.get(tracefile.getTargetIDs(sourceID)?.findFirst[map.containsKey(it)])
	}

	private def deleteElements(List<String> removed, Map<String, EObject> modelElements,
		HashMap<String, LinkedList<Property>> blockInstances) {
		val dispensableVariables = new LinkedList<Variable>
		for (id : removed) {
			var targets = tracefile.getTargetIDs(id)
			for (target : targets) {
				val scadeObject = modelElements.get(target)
				if (scadeObject instanceof Package) {
					scadeObject.owningPackage.packages.remove(scadeObject)
				} else if (scadeObject instanceof Operator) {
					scadeObject.owningPackage.operators.remove(scadeObject)
				} else if (scadeObject instanceof Variable) {
					var operator = scadeObject.operator
					var parent = tracefile.getParentID(id)
					val index = Math.max(operator.outputs.indexOf(scadeObject), operator.inputs.indexOf(scadeObject))
					if (operator.outputs.remove(scadeObject)) {
						operator.removeEquation(operator.data.findFirst [
							it instanceof Equation && (it as Equation).lefts.get(0) instanceof Variable &&
								(it as Equation).lefts.get(0).name == scadeObject.name
						] as Equation)
						blockInstances.get(parent)?.forEach [
							(modelElements.getBySourceID(it.UUID) as Equation).removeOutput(index)
						]
					} else if (operator.inputs.remove(scadeObject)) {
						dispensableVariables.addAll(operator.removeEquation(operator.data.findFirst [
							it instanceof Equation && (it as Equation).right instanceof IdExpression &&
								((it as Equation).right as IdExpression).path.name == scadeObject.name
						] as Equation))
						blockInstances.get(parent)?.forEach [
							(modelElements.getBySourceID(it.UUID) as Equation).removeInput(index)
						]
					}
				} else if (scadeObject instanceof Equation) {
					var operator = modelElements.getBySourceID(tracefile.getParentID(id)) as Operator
					dispensableVariables.addAll(operator.removeEquation(scadeObject))
				}
			}
		}
		return dispensableVariables
	}


	/**
	 * Removes the output at {@code index} from {@code equation} and in its graphical representation.
	 * 
	 * @param equation The equation from which to remove the output
	 * @param The index of the output
	 */
	private def void removeOutput(Equation equation, int index) {
		equation.lefts.remove(index)
		val ge_index = index + 1
		(equation.owner as Operator).removeGraphical [
			if (it instanceof Edge) {
				if (it.srcEquation.equation.oid == equation.oid) {
					if (it.leftVarIndex == ge_index) {
						return true
					} else if (it.leftVarIndex > ge_index) {
						it.leftVarIndex = it.leftVarIndex - 1
					}
				}
			}
			return false
		]
	}

	/**
	 * Removes the input at {@code index} from {@code equation} and in its graphical representation.
	 * 
	 * @param equation The equation from which to remove the input
	 * @param The index of the input
	 */
	private def removeInput(Equation equation, int index) {
		val expression = (equation.right as CallExpression).callParameters.remove(index) as IdExpression
		val parent = equation.owner as Operator
		parent.removeGraphical [
			if (it instanceof Edge) {
				if (it.dstEquation.equation.oid == equation.oid) {
					if (it.rightExprIndex == index + 1) {
						return true
					} else if (it.rightExprIndex > index + 1) {
						it.rightExprIndex = it.rightExprIndex - 1
					}
				}
			}
			return false
		]
		return parent.locals.findFirst[it.name == expression.path.name]
	}

	/**
	 * Removes {@code equation} from {@code parent}, the corresponding {@link com.esterel.scade.api.pragmas.editor.EquationGE} and
	 * all objects of type {@link com.esterel.scade.api.pragmas.editor.Edge} connected to it. Furthermore all the
	 * {@link com.esterel.scade.api.Variable} which represents the outputs of {@code equation} are returned.
	 * 
	 * @param parent The operator from which to remove {@code equation}
	 * @param equation The equation which to remove
	 * @return List of {@link com.esterel.scade.api.Variable} which represents the outputs of {@code equation}
	 */
	private def List<Variable> removeEquation(Operator parent, Equation equation) {
		parent.data.remove(equation)
		var params = new HashSet<String>
		for (left : equation.lefts) {
			params.add(left.name)
		}
		var dispensable = new LinkedList<Variable>
		for (local : parent.locals) {
			if (params.contains(local.name)) {
				dispensable.add(local)
			}
		}
		parent.removeGraphical [
			if (it instanceof EquationGE) {
				return it.equation.oid == equation.oid
			} else if (it instanceof Edge) {
				return it.srcEquation.equation.oid == equation.oid || it.dstEquation.equation.oid == equation.oid
			}
			return false
		]
		return dispensable
	}

	/**
	 * Iterates over all PresentationElements of {@code operator} and applies {@code predicate} to them. If {@predicate} returns
	 * {@code true} the element is removed. The PresentationElements may be altered by {@code predicate}.
	 * 
	 * @param operator The operator which elements are iterated
	 * @param predicate The predicate which determinants if an element is removed. May apply changes to elements
	 */
	private def void removeGraphical(Operator operator, Function1<PresentationElement, Boolean> predicate) {
		for (pragma : operator.pragmas) {
			if (pragma instanceof com.esterel.scade.api.pragmas.editor.Operator) {
				for (diagram : pragma.diagrams) {
					for (var iterator = diagram.presentationElements.iterator; iterator.hasNext;) {
						var element = iterator.next
						if (predicate.apply(element)) {
							iterator.remove
						}
					}
				}
			}
		}
	}

	/**
	 * Fetches all sourceIDs from {@link MapToScade#tracefile} and iterates over their targets, comparing the source and target objects
	 * and updating the target object if they differ. In the current state this applies to the names of packages, operators and ports
	 * and the types of ports.
	 */
	private def updateElements(Map<String, EObject> scadeElements, Map<String, LinkedList<Property>> blockInstances) {
		var elementIds = tracefile.getAllSourceIDs
		for (sourceID : elementIds) {
			var sysmlElement = sysmlResource.getEObject(sourceID)
			for (targetID : tracefile.getTargetIDs(sourceID)) {
				if (sysmlElement instanceof org.eclipse.uml2.uml.Package) {
					var pkg = scadeElements.get(targetID) as Package
					pkg.name = sysmlElement.name
				} else if (sysmlElement instanceof Class) {
					val operator = scadeElements.get(targetID) as Operator
					if (operator.name != sysmlElement.name) {
						blockInstances.get(sourceID)?.forEach [
							var eq = (scadeElements.getBySourceID(it.UUID) as Equation)
							var opc = (eq.right as CallExpression).operator as OpCall
							opc.operator = operator
						]
						operator.name = sysmlElement.name
					}
				} else if (sysmlElement instanceof FlowPort) {
					val port = scadeElements.get(targetID) as Variable
					updatePort(port, sysmlElement, blockInstances.get(tracefile.getParentID(sysmlElement.UUID)),
						scadeElements)
				}
			}
		}
	}

	/**
	 * Compares the SCADE port with the SysML port and updates {@code port} if they differ.
	 * @see MapToScade#updateElements
	 */
	private def void updatePort(Variable port, FlowPort sysmlElement, List<Property> blockInstances,
		Map<String, EObject> scadeElements) {
		var parent = port.owner as Operator
		val sysmlType = createScadeType(sysmlElement.type)
		val scadeType = (port.type as NamedType).type
		if (parent.outputs.contains(port)) {
			val name = if (sysmlElement.direction.value == FlowDirection.INOUT_VALUE) {
					INOUT_OUT_NAME_PREFIX + sysmlElement.name
				} else {
					sysmlElement.name;
				}
			if (port.name != name || scadeType != sysmlType) {
				val equation = parent.data.findFirst [
					it instanceof Equation && (it as Equation).lefts.get(0).name == port.name
				] as Equation
				equation.lefts.get(0).name = name
				port.name = name
				var namedType = theScadeFactory.createNamedType
				namedType.setType(sysmlType)
				var local = parent.locals.findFirst [
					it.name == (equation.right as IdExpression)?.path?.name
				]
				if (local != null) {
					local.type = namedType
				}
				port.type = namedType;
			}
		} else if (parent.inputs.contains(port)) {
			val name = if (sysmlElement.direction.value == FlowDirection.INOUT_VALUE) {
					INOUT_IN_NAME_PREFIX + sysmlElement.name
				} else {
					sysmlElement.name;
				}
			if (port.name != name || scadeType != sysmlType) {
				val equation = parent.data.findFirst [
					if (it instanceof Equation && (it as Equation).right instanceof IdExpression) {
						return ((it as Equation).right as IdExpression).path.name == port.name
					}
					return false
				] as Equation
				(equation.right as IdExpression).path.name = name
				var namedType = theScadeFactory.createNamedType
				namedType.setType(sysmlType)
				var local = parent.locals.findFirst[it.name == equation.lefts.get(0).name]
				if (local != null) {
					local.type = namedType
				}
				port.name = name
				port.type = namedType;
			}
		}
	}

	/**
	 * Add the SysML Ports stored in {@code ports} to the SCADE model
	 * 
	 * @param ports List of {@link org.eclipse.papyrus.sysml.portandflows.FlowPort} which add to the model
	 */
	def addPorts(LinkedList<FlowPort> ports, HashMap<String, EObject> scadeElements) {
		for (port : ports) {
			var operator = scadeElements.getBySourceID(port.base_Port.eContainer.UUID) as Operator
			var type = createScadeType(port.type)
			if (port.direction == FlowDirection.OUT_VALUE) {
				var oid = operator.addOutput(port.name, type)
				tracefile.addElement(port.UUID, operator.oid, oid)
			} else if (port.direction == FlowDirection.IN_VALUE) {
				var oid = operator.addInput(port.name, operator.localsCount, type)
				tracefile.addElement(port.UUID, operator.oid, oid)
			} else if (port.direction == FlowDirection.INOUT_VALUE) {
				var inOid = operator.addInput(INOUT_IN_NAME_PREFIX + port.name, operator.localsCount, type)
				var outOid = operator.addOutput(INOUT_OUT_NAME_PREFIX + port.name, type)
				tracefile.addElement(port.UUID, operator.oid, inOid, outOid)
			}
		}
	}

	/**
	 * Adds a new {@link com.esterel.scade.api.Variable} as output to {@code operator} with {@code name} as name and {@code type} as type,
	 * and initializes a new {@link com.esterel.scade.api.Equation} for the created output to {@code operator}. After this the new output is
	 * returned.
	 * 
	 * @param operator The operator on which the output is added
	 * @param name The name of the output
	 * @param type The type of the output
	 * @return The new output
	 */
	def String addOutput(Operator operator, String name, com.esterel.scade.api.Type type) {
		var output = createNamedTypeVariable(name, type)
		operator.outputs.add(output)
		var equation = theScadeFactory.createEquation();
		EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID());
		equation.getLefts().add(output);
		operator.getData().add(equation)
		return output.oid
	}

	/**
	 * Adds a new {@link com.esterel.scade.api.Variable} as input to {@code operator} with {@code name} as name and {@code type} as type,
	 * and initializes a new {@link com.esterel.scade.api.Equation} for the created input to {@code operator}. After this the new input
	 * is returned
	 * 
	 * @param operator The operator on which the input is added
	 * @param name The name of the input
	 * @param type The type of the input
	 * @return The new input
	 */
	def String addInput(Operator operator, String name, int locals_count, com.esterel.scade.api.Type type) {
		var input = createNamedTypeVariable(name, type)
		operator.inputs.add(input)
		var variable = createNamedTypeVariable("_L" + locals_count, type)
		operator.getLocals().add(variable);
		inputToVariableMap.put(input, variable)

		var equation = theScadeFactory.createEquation();
		EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID());
		equation.getLefts().add(variable);

		var idexpression = theScadeFactory.createIdExpression();
		idexpression.setPath(input);

		equation.setRight(idexpression);
		operator.getData().add(equation)
		return input.oid
	}

	/**
	 * Generated local variables are named after the schema: "_L" + number. This function returns the highest number for
	 * {@code operator} as integer or one as default.
	 * 
	 * @param operator The operator for which to compute the number
	 * @return The highest number used for {@code operator} with the naming schema for generated local variables
	 */
	private def int getLocalsCount(Operator operator) {
		var int locals_count = 1
		for (local : operator.locals) {
			try {
				locals_count = Math.max(Integer.parseInt(local.name.replaceFirst("^\\_L", "")), locals_count)
			} catch (NumberFormatException e) {
				// Do nothing
			}
		}
		return locals_count
	}

	/**
	 * Transfers the {@link org.eclipse.uml2.uml.Property}s in {@code properties} to SCADE
	 */
	private def void addEquations(List<Property> properties, Map<String, EObject> scadeElements,
		Map<String, LinkedList<Property>> blockInstances) {
		for (property : properties) {
			var parentID = property.eContainer.UUID
			var parent = scadeElements.getBySourceID(parentID) as Operator
			var instances = blockInstances.get(parentID)
			if (instances === null) {
				instances = new LinkedList
				blockInstances.put(parentID, instances)
			}
			instances.add(property)
			var operator = scadeElements.getBySourceID(property.block.base_Class.UUID) as Operator
			var equation = theScadeFactory.createEquation();
			EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID());
			var call_expression = theScadeFactory.createCallExpression()
			var call = theScadeFactory.createOpCall()
			call.setOperator(operator)
			call_expression.setOperator(call)
			equation.setRight(call_expression)
			var locals_count = parent.localsCount + 1
			var call_name = 1
			for (eq : parent.data) {

				try {
					var ce = (eq as Equation).right as CallExpression
					if (ce != null) {
						call_name = Math.max(Integer.parseInt((ce.operator as OpCall).name), call_name)
					}
				} catch (NumberFormatException e) {
					// Do nothing
				} catch (ClassCastException e) {
				}
			}
			call_name = call_name + 1
			call.name = call_name.toString
			for (output : operator.outputs) {
				var variable = createNamedTypeVariable("_L" + locals_count, (output.getType() as NamedType).getType());
				parent.getLocals().add(variable);
				equation.lefts.add(variable)
				locals_count++
			}
			for (input : operator.inputs) {
				call_expression.callParameters.add(theScadeFactory.createIdExpression())
			}
			parent.data.add(equation)
			scadeElements.put(equation.oid, equation)
			tracefile.addElement(property.UUID, property.eContainer.UUID, equation.oid)
		}
	}

	/**
	 * Moves {@link com.esterel.scade.api.Package}s and {@link com.esterel.scade.api.Operator}s within a SCADE model according
	 * to their changed positions in the SysML model. As neither {@link org.eclipse.uml2.uml.Property}s nor
	 * {@link org.eclipse.papyrus.sysml.portandflows.FlowPort}s can be moved within the SysML model their representations in the
	 * SCADE model are not processed.
	 */
	private def moveElements(List<EObject> moved, Map<String, EObject> scadeElements,
		HashMap<String, LinkedList<Property>> blockInstances) {
		var idList = moved.map [
			if (it instanceof Block) {
				return it.base_Class.UUID
			}
			it.UUID
		]
		var dispensable = deleteElements(idList, scadeElements, new HashMap<String, LinkedList<Property>>)
		for (element : moved) {
			if (element instanceof org.eclipse.uml2.uml.Package) {
				var scadePkg = scadeElements.getBySourceID(element.UUID) as Package
				var scadeParent = scadeElements.getBySourceID(element.eContainer.UUID) as Package
				scadeParent.packages.add(scadePkg)
				tracefile.removeElement(element.UUID)
				tracefile.addElement(element.UUID, element.eContainer.UUID, scadePkg.oid)
			} else if (element instanceof Block) {
				val operator = scadeElements.getBySourceID(element.base_Class.UUID) as Operator
				val scadeParent = scadeElements.getBySourceID(element.base_Class.eContainer.UUID) as Package
				scadeParent.operators.add(operator)
				tracefile.moveElement(element.base_Class.UUID, element.base_Class.eContainer.UUID)
				blockInstances.get(element.base_Class.UUID)?.forEach [
					var equation = scadeElements.getBySourceID(it.UUID) as Equation
					var opCall = (equation.right as CallExpression).operator as OpCall;
					opCall.setOperator(operator)
				]
			}
		}
		return dispensable
	}

	/**
	 * Removes all occurrences from the {@link com.esterel.scade.api.Variable}s in {@code list} from the SCADE model.
	 * 
	 * @param list The list of local variables to delete, the value returned by {@link Variable#getOwner()} should not be null.
	 */
	private def cleanupLocals(List<Variable> list) {
		var map = new HashMap<Operator, Set<String>>
		for (local : list) {
			var set = map.get(local.owner)
			if (set == null) {
				set = new HashSet<String>
				map.put(local.owner as Operator, set)
			}
			set.add(local.name)
		}
		for (entry : map.entrySet) {
			for (var iterator = entry.key.locals.iterator; iterator.hasNext;) {
				var element = iterator.next
				if (entry.value.contains(element.name)) {
					iterator.remove
				}
			}
			for (equation : entry.key.data.filter[it instanceof Equation].map[it as Equation]) {
				for (expression : equation.lefts) {
					if (expression instanceof IdExpression &&
						entry.value.contains((expression as IdExpression).path.name)) {
						(expression as IdExpression).path = null
					}
				}
				if (equation.right instanceof IdExpression) {
					var expression = (equation as Equation).right as IdExpression
					if (expression.path != null && entry.value.contains(expression.path.name)) {
						expression.path = null
					}
				}
			}
		}
	}

	/**
	 * Removes the old diagram and generates a new for all {@link com.esterel.scade.api.Operators} in the SCADE model. This is done by
	 * using the interactive mode from KIELER, which tries to alter of elements which are already layouted as little as possible.
	 * 
	 * @see de.cau.cs.kieler.kiml.options.LayoutOptions#INTERACTIVE
	 */
	private def updateGraphical() {
		var fixedProvider = new FixedLayoutProvider
		for (operator : scadeModel.operators) {
			var equationGEs = new HashMap<String, EquationGE>
			var edges = new LinkedList<Edge>
			for (pragma : operator.pragmas) {
				if (pragma instanceof com.esterel.scade.api.pragmas.editor.Operator) {
					for (diagram : pragma.diagrams) {
						for (element : diagram.presentationElements) {
							if (element instanceof EquationGE) {
								equationGEs.put(element.equation.oid, element)
							} else if (element instanceof Edge) {
								edges.add(element)
							}
						}
					}
				}
			}
			var portNames = new HashSet(operator.inputs.map[it.name])
			portNames.addAll(operator.outputs.map[it.name])
			var portToEquation = new HashMap<String, Equation>
			var callList = new LinkedList<Equation>
			for (element : operator.data.filter[it instanceof Equation].map[it as Equation]) {
				var equation = element
				if (portNames.contains(equation.lefts.get(0).name)) {
					portToEquation.put(equation.lefts.get(0).name, equation)
				} else if (equation.right instanceof IdExpression) {
					var name = (equation.right as IdExpression).path.name
					if (portNames.contains(name)) {
						portToEquation.put(name, equation)
					} else {
						callList.add(equation)
					}
				} else {
					callList.add(equation)
				}
			}
			var pNode = KimlUtil.createInitializedNode
			var portEquationToKPort = new HashMap<String, KPort>
			var kportToEquation = new HashMap<KPort, Equation>
			for (input : operator.inputs) {
				var port = KimlUtil.createInitializedPort()
				port.setNode(pNode)
				port.setSide(PortSide.WEST)
				var portLabel = KimlUtil.createInitializedLabel(port)
				portLabel.setText(input.name)
				portEquationToKPort.put(portToEquation.get(input.name).oid, port)
				kportToEquation.put(port, portToEquation.get(input.name))
			}
			for (output : operator.outputs) {
				var port = KimlUtil.createInitializedPort()
				port.setNode(pNode)
				port.setSide(PortSide.EAST)
				var portLabel = KimlUtil.createInitializedLabel(port)
				portLabel.setText(output.name)
				portEquationToKPort.put(portToEquation.get(output.name).oid, port)
				kportToEquation.put(port, portToEquation.get(output.name))
			}
			var equationToInputIndexToKPort = new HashMap<String, HashMap<Integer, KPort>>
			var equationToOutputIndexToKPort = new HashMap<String, HashMap<Integer, KPort>>
			var equationToKNode = new HashMap<Equation, KNode>
			for (equation : callList) {
				var cNode = KimlUtil.createInitializedNode()
				cNode.setParent(pNode)
				equationToKNode.put(equation, cNode)
				for (var i = 0; i < equation.lefts.size; i++) {
					var port = KimlUtil.createInitializedPort()
					port.setNode(cNode)
					port.setSide(PortSide.EAST)
					equationToOutputIndexToKPort.put(equation.oid, i, port)
				}
				for (var i = 0; i < (equation.right as CallExpression).callParameters.size; i++) {
					var port = KimlUtil.createInitializedPort()
					port.setNode(cNode)
					port.setSide(PortSide.WEST)
					equationToInputIndexToKPort.put(equation.oid, i, port)
				}
			}
			var scadeEdgeToKEdge = new HashMap<Edge, KEdge>
			var portToIndex = new HashMap<KPort, Integer>
			for (edge : edges) {
				var srcOid = edge.srcEquation.equation.oid
				var source = if (portEquationToKPort.containsKey(srcOid)) {
						portEquationToKPort.get(srcOid)
					} else {
						equationToOutputIndexToKPort.get(srcOid, edge.leftVarIndex)
					}
				portToIndex.put(source, edge.leftVarIndex)
				var dstOid = edge.dstEquation.equation.oid
				var destination = if (portEquationToKPort.containsKey(dstOid)) {
						portEquationToKPort.get(srcOid)
					} else {
						equationToInputIndexToKPort.get(dstOid, edge.rightExprIndex)
					}
				portToIndex.put(destination, edge.rightExprIndex)
				scadeEdgeToKEdge.put(edge, source.addEdgeTo(destination))
			}
			pNode.addLayoutOptions
			for (entry : scadeEdgeToKEdge.entrySet) {
				var vectorChain = new KVectorChain
				for (position : entry.key.positions) {
					vectorChain.add(position.x, position.y)
				}
				entry.value.getData(typeof(KEdgeLayout)).setProperty(LayoutOptions.BEND_POINTS, vectorChain)
			}
			for (entry : equationToKNode.entrySet) {
				var equationGE = equationGEs.get(entry.key.oid)
				var layout = entry.value.getData(typeof(KShapeLayout))
				var position = equationGE.position
				layout.setProperty(LayoutOptions.POSITION, new KVector(position.x, position.y))
				layout.setProperty(LayoutOptions.MIN_WIDTH, equationGE.size.width as float)
				layout.setProperty(LayoutOptions.MIN_HEIGHT, equationGE.size.height as float)
			}

			// Set existing elements to their positions
			fixedProvider.doLayout(pNode, new BasicProgressMonitor)

			// Layout only elements without layout
			pNode.getData(typeof(KShapeLayout)).setProperty(LayoutOptions.INTERACTIVE, true)

			// Actual layout
			layoutProvider.doLayout(pNode, new BasicProgressMonitor)
			operator.pragmas.findFirst [
				if (it instanceof com.esterel.scade.api.pragmas.editor.Operator) {
					if (it.diagrams.size > 0) {
						it.diagrams.remove(0)
						return true
					}
				}
				return false
			]
			operator.createScadeDiagram.fillDiagram(pNode, equationToKNode, kportToEquation, portToIndex)
		}
	}

	/**
	 * Bundles the setting of the different {@link de.cau.cs.kieler.kiml.options.LayoutOptions} which are applied in one function.
	 * Different options are applied to {@code pNode}, its ports and its child nodes.
	 * 
	 * @param pNode The parent node to which and on its children the layout options are applied.
	 */
	def addLayoutOptions(KNode pNode) {
		var pLayout = pNode.getData(typeof(KShapeLayout))
		pLayout.setProperty(LayoutOptions.DIRECTION, Direction.RIGHT)
		pLayout.setProperty(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL)
		pLayout.setProperty(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
		pLayout.setProperty(LayoutOptions.SIZE_CONSTRAINT, SizeConstraint.free)
		pLayout.setProperty(LayoutOptions.SIZE_OPTIONS, EnumSet.of(SizeOptions.COMPUTE_INSETS))
		pLayout.setProperty(LayoutOptions.SPACING, this.OPERATOR_SPACING)
		pLayout.setProperty(LayoutOptions.ALGORITHM, "DataFlow")
		pLayout.setProperty(LayoutOptions.PORT_LABEL_PLACEMENT, PortLabelPlacement.INSIDE)
		pLayout.setProperty(LayoutOptions.PORT_SPACING, this.PORT_SPACING)
		pLayout.setProperty(LayoutOptions.BORDER_SPACING, this.GRAPHICAL_OFFSET)

		for (port : pNode.ports) {
			var portLayout = port.getData(typeof(KShapeLayout))
			portLayout.setProperty(LayoutOptions.SIZE_CONSTRAINT, SizeConstraint.fixed)
			portLayout.setProperty(LayoutOptions.OFFSET, (PORT_WIDTH + GRAPHICAL_OFFSET) * (-1))
			portLayout.setHeight(this.PORT_HEIGHT)
			portLayout.setWidth(this.PORT_WIDTH)
		}

		for (cNode : pNode.children) {
			var cLayout = cNode.getData(typeof(KShapeLayout))
			cLayout.setProperty(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER)
			cLayout.setProperty(LayoutOptions.SIZE_CONSTRAINT, SizeConstraint.free)
			cLayout.setProperty(LayoutOptions.SIZE_OPTIONS,
				EnumSet.of(SizeOptions.COMPUTE_INSETS, SizeOptions.MINIMUM_SIZE_ACCOUNTS_FOR_INSETS))
			cLayout.setProperty(LayoutOptions.MIN_WIDTH, this.OPERATOR_MIN_WIDTH)
			cLayout.setProperty(LayoutOptions.MIN_HEIGHT, this.OPERATOR_MIN_HEIGHT)
			cLayout.setProperty(LayoutOptions.PORT_SPACING, this.OPERATOR_MIN_HEIGHT / 5)
			cLayout.setProperty(LayoutOptions.BORDER_SPACING, this.OPERATOR_MIN_HEIGHT / 5)
			cLayout.setProperty(LayoutOptions.ASPECT_RATIO, this.OPERATOR_ASPECT_RATIO)
		}
	}

	/**
	 * Creates and returns a new {@link com.esterel.scade.api.pragmas.editor.EquationGE} for {@code equation} with {@code xpos}
	 * and {@code ypos} as position, and {@code width} and {@code height} as size.
	 * 
	 * @param equation The equation for which to create the {@link com.esterel.scade.api.pragmas.editor.EquationGE}
	 * @param xpos The x position of the created EquationGE
	 * @param ypos The y position of the created EquationGE
	 * @param width The width of the created EquationGE
	 * @param height The height of the created EquationGE
	 * @return The created {@link com.esterel.scade.api.pragmas.editor.EquationGE}
	 */
	def createEquationGE(Equation equation, int xpos, int ypos, int width, int height) {
		var equation_ge = theEditorPragmasFactory.createEquationGE();
		equation_ge.setEquation(equation);
		var point = theEditorPragmasFactory.createPoint();
		point.setX(xpos);
		point.setY(ypos);
		equation_ge.setPosition(point);
		var size = theEditorPragmasFactory.createSize();
		size.setWidth(width);
		size.setHeight(height);
		equation_ge.setSize(size)
		return equation_ge
	}

	/**
	 * Sets the side of {@code port} to {@code side}
	 * 
	 * @param port The port for which to set the side
	 * @param side The side which to set
	 */
	def void setSide(KPort port, PortSide side) {
		var portLayout = port.getData(typeof(KShapeLayout))
		portLayout.setProperty(LayoutOptions.PORT_SIDE, side)
	}

	/**
	 * Adds a {@link de.cau.cs.kieler.core.kgraph.KEdge} from {@code source} to {@code target} and returns it.
	 * 
	 * @param source The source port
	 * @param target The target port
	 * @return The created Edge
	 */
	def KEdge addEdgeTo(KPort source, KPort target) {
		var edge = KimlUtil.createInitializedEdge()
		edge.setTargetPort(target)
		edge.setTarget(target.node)
		target.getEdges().add(edge)
		edge.setSourcePort(source)
		edge.setSource(source.node)
		source.getEdges().add(edge)
		return edge
	}

	/**
	 * Creates a new {@link com.esterel.scade.api.IdExpression} with {@code source} as path and adds it to {@code call}
	 * 
	 * @param source The path of created IdExpression
	 * @param call The CallExpression where the created IdExpression is added to.
	 */
	def connectWithOperator(Variable source, CallExpression call) {
		var idexpression = theScadeFactory.createIdExpression()
		idexpression.setPath(source)
		call.callParameters.add(idexpression)
	}

	def void connectWithOutput(Variable source, Variable destination) {
		var equation = outputToEquationMap.get(destination)
		var idexpression = theScadeFactory.createIdExpression();
		idexpression.setPath(source);
		equation.setRight(idexpression);
		equation.getLefts.add(destination)
	}

	/**
	 * Retrieves the Block from a property with the Block stereotype application. If does not exist {@code null} is returned.
	 * 
	 * @param property The property from which to retrieve the Block
	 * @return The Block stereotype application
	 */
	private def Block getBlock(Property property) {
		var type = property.type
		if (type != null) {
			var stereotype = type.getAppliedStereotype("SysML::Blocks::Block")
			if (stereotype != null) {
				return property.type.getStereotypeApplication(stereotype) as Block
			}
		}
		return null
	}

	/**
	 * Retrieves the FlowPort to which {@code end} is connected.
	 */
	def FlowPort getFlowPort(ConnectorEnd end) {
		if (end != null && end.role != null) {
			var stereotype = end.role.getAppliedStereotype("SysML::PortAndFlows::FlowPort")
			if (stereotype != null) {
				return end.role.getStereotypeApplication(stereotype) as FlowPort
			}
		}
		return null
	}

	/**
	 * Retrieves the opposite end from the Connector which is the owner of {@code end}
	 */
	def ConnectorEnd getOppositeEnd(ConnectorEnd end) {
		var list = (end.eContainer as Connector).ends
		if (list.get(0) == end) {
			return list.get(1)
		}
		return list.get(0)
	}

	/**
	 * Puts an element in a HashMap within a Map. If the inner map does not exist yet it will be created.
	 * 
	 * @param <KEY1> The type of the key of the outer map
	 * @param <KEY2> The type of the key of the inner map
	 * @param <ELEM> The type of the element which to put in the inner map
	 * @param map The outer map
	 * @param key1 The key for the outer map
	 * @param key2 The key for the inner map
	 * @param element The element which to add
	 */
	def <KEY1, KEY2, ELEM> put(Map<KEY1, HashMap<KEY2, ELEM>> map, KEY1 key1, KEY2 key2, ELEM element) {
		if (!map.containsKey(key1)) {
			map.put(key1, new HashMap<KEY2, ELEM>())
		}
		map.get(key1).put(key2, element)
	}

	/**
	 * Function returning an element of a map within a map using two keys.
	 * 
	 * @param <M> The type of the nested Map
	 * @param <KEY1> The type of the keys of the outer map
	 * @param <KEY2> The type of the keys of the inner map
	 * @param <ELEM> The type of the returning element
	 * @param map The outer map
	 * @param key1 The key for the outer map
	 * @param key2 The key for the inner map
	 * @return The element which to get or null if does not exist
	 */
	def <M extends Map<KEY2, ELEM>, KEY1, KEY2, ELEM> ELEM get(Map<KEY1, M> map, KEY1 key1, KEY2 key2) {
		if (map != null && key1 != null && key2 != null) {
			var innerMap = map.get(key1)
			if (innerMap != null) {
				return innerMap.get(key2)
			}
		}
		return null
	}

	/**
	 * Retrieves all Properties which has the "SysML::Blocks::Block" stereotype applied from a Block.
	 */
	def EList<Property> getNestedBlocksAsProperties(Block block) {
		var list = new BasicEList<Property>
		for (property : block.base_Class.ownedAttributes) {
			var type = property.type
			if (type != null) {
				var stereotype = type.getAppliedStereotype("SysML::Blocks::Block")

				if (stereotype != null) {
					list.add(property)
				}
			}
		}
		return list
	}

	/**
	 * Retrieves all nested Blocks of a Block
	 */
	def Iterable<Block> getNestedBlocks(Block block) {
		var set = new HashSet<Block>()
		for (property : block.base_Class.ownedAttributes) {
			var type = property.type
			if (type != null) {
				var stereotype = type.getAppliedStereotype("SysML::Blocks::Block")
				if (stereotype != null) {
					set.add(type.getStereotypeApplication(stereotype) as Block);
				}
			}
		}
		return set
	}

	def String getUUID(EObject object) {
		if (object === null) {
			return null
		} else if (object instanceof Annotable) {
			return object.oid
		} else if (object instanceof Block) {
			return object.base_Class.UUID
		}
		return (object.eResource as XMLResource).getID(object)
	}

	/**
	 * Function returning all blocks of a SysML Model
	 * 
	 * @param model The model for which the function return the blocks
	 * @return A list of all blocks of the model
	 */
	def static EList<Block> getAllBlocks(Model model) {
		var list = new BasicEList<Block>

		for (Element element : model.allOwnedElements) {
			var stereotype = element.getAppliedStereotype("SysML::Blocks::Block")
			if (stereotype != null) {
				list.add(element.getStereotypeApplication(stereotype) as Block)
			}
		}
		return list
	}

	/**
	 * Function returning the name of a SysML Block
	 * 
	 * @param block The block for which the function return the Name
	 * @return The name of the block
	 */
	def static String name(Block block) {
		return block.base_Class.name
	}

	/**
	 * Function returning the name of a Port
	 * 
	 * @param port The port for which the function return the Name
	 * @return The name of the port
	 */
	def static String name(FlowPort port) {
		return port.base_Port.name
	}

	/**
	 * Function returning the type of a Port
	 * 
	 * @param port The port for which the function return the type
	 * @return The type of the port
	 */
	def static Type type(FlowPort port) {
		return port.base_Port.type
	}

	/**
	 * Function returning all FlowPorts of SysML Block
	 * 
	 * @param block The block for which the function returns all FlowPorts
	 * @return List of FlowPorts
	 */
	def static EList<FlowPort> flowPorts(Block block) {
		var list = new BasicEList<FlowPort>

		for (port : block.base_Class.ownedPorts) {
			var stereotype = port.getAppliedStereotype("SysML::PortAndFlows::FlowPort")

			if (stereotype != null) {
				list.add(port.getStereotypeApplication(stereotype) as FlowPort)
			}
		}

		return list
	}
}
