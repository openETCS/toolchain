package org.openetcs.sysml2scade.suite.transformation

import com.esterel.project.api.Project
import com.esterel.scade.api.CallExpression
import com.esterel.scade.api.Equation
import com.esterel.scade.api.IdExpression
import com.esterel.scade.api.NamedType
import com.esterel.scade.api.Operator
import com.esterel.scade.api.OperatorKind
import com.esterel.scade.api.Package
import com.esterel.scade.api.ScadeFactory
import com.esterel.scade.api.ScadePackage
import com.esterel.scade.api.Variable
import com.esterel.scade.api.pragmas.editor.EditorPragmasFactory
import com.esterel.scade.api.pragmas.editor.EditorPragmasPackage
import com.esterel.scade.api.pragmas.editor.EquationGE
import com.esterel.scade.api.pragmas.editor.NetDiagram
import com.esterel.scade.api.pragmas.editor.util.EditorPragmasUtil
import com.esterel.scade.api.util.ScadeModelWriter
import de.cau.cs.kieler.core.alg.BasicProgressMonitor
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.kiml.AbstractLayoutProvider
import de.cau.cs.kieler.kiml.klayoutdata.KEdgeLayout
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeLabelPlacement
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortLabelPlacement
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.kiml.options.SizeConstraint
import de.cau.cs.kieler.kiml.options.SizeOptions
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klay.layered.LayeredLayoutProvider
import java.util.EnumSet
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.Map
import java.util.Set
import org.eclipse.core.resources.IProject
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.papyrus.sysml.blocks.Block
import org.eclipse.papyrus.sysml.portandflows.FlowDirection
import org.eclipse.papyrus.sysml.portandflows.FlowPort
import org.eclipse.uml2.uml.Connector
import org.eclipse.uml2.uml.ConnectorEnd
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Type

class MapToScade extends ScadeModelWriter {

	private val GRAPHICAL_OFFSET = 50f
	private val OPERATOR_SPACING = 500f
	private val PORT_SPACING = 500f
	private val PORT_HEIGHT = 300f
	private val PORT_WIDTH = 250f
	private val OPERATOR_MIN_HEIGHT = 1500f
	private val OPERATOR_MIN_WIDTH = 3000f
	private val OPERATOR_ASPECT_RATIO = 0.5f

	private URI baseURI;
	private ResourceSet sysmlResourceSet;
	private ResourceSet scadeResourceSet;
	private Model sysmlModel;
	private Package scadeModel;
	private Package typePackage;
	private ScadeFactory theScadeFactory;
	private EditorPragmasFactory theEditorPragmasFactory;
	private Project scadeProject;
	private AbstractLayoutProvider layoutProvider
	private Map<Block, Operator> blockToOperatorMap;
	private Map<Operator, NetDiagram> operatorToNetDiagramMap;
	private Map<Variable, Variable> inputToVariableMap;
	private Map<FlowPort, Variable> flowportToOutputMap;
	private Map<FlowPort, Variable> flowportToInputMap;
	private Map<Variable, EquationGE> portsToGraphicalMap;
	private Map<Variable, Equation> outputToEquationMap;

	new(Model model, IProject project) {
		sysmlModel = model;
		sysmlResourceSet = sysmlModel.eResource().getResourceSet();
		scadeResourceSet = new ResourceSetImpl();
		baseURI = URI.createFileURI(project.getLocation().toOSString());
		val projectURI = baseURI.appendSegment(sysmlModel.getName() + ".etp");
		theScadeFactory = ScadePackage.eINSTANCE.getScadeFactory()
		theEditorPragmasFactory = EditorPragmasPackage.eINSTANCE.getEditorPragmasFactory();
		blockToOperatorMap = new HashMap<Block, Operator>()
		operatorToNetDiagramMap = new HashMap<Operator, NetDiagram>()
		layoutProvider = new LayeredLayoutProvider()

		inputToVariableMap = new HashMap<Variable, Variable>()
		flowportToOutputMap = new HashMap<FlowPort, Variable>()
		flowportToInputMap = new HashMap<FlowPort, Variable>()
		portsToGraphicalMap = new HashMap<Variable, EquationGE>()
		outputToEquationMap = new HashMap<Variable, Equation>()

		// Create empty SCADE project
		scadeProject = createEmptyScadeProject(projectURI, scadeResourceSet);

		// Load the create SCADE project
		scadeModel = loadModel(projectURI, scadeResourceSet);

		typePackage = createScadePackage("DataDictionary")
		val resource = createXScade("DataDictionary")
		resource.getContents().add(typePackage)
	}

	def createXScade(String name) {
		val uriXscade = baseURI.appendSegment(name + ".xscade");
		return scadeResourceSet.createResource(uriXscade);
	}

	def Package createScadePackage(String name) {
		val pkg = theScadeFactory.createPackage()
		pkg.setName(name)
		return pkg
	}

	def Package iterateModel(org.eclipse.uml2.uml.Package pkg) {
		val scadePackage = createScadePackage(pkg.name)
		val resourcePackage = createXScade(pkg.name)
		resourcePackage.getContents().add(scadePackage)

		for (block : pkg.getBlocks) {

			// Each Block is mapped to operator
			val operator = createOperatorInterface(block);
			val diagram = createScadeDiagram(operator);
			createOperatorImplementation(operator, diagram);
			scadePackage.getOperators().add(operator);

			// Build list of generated blocks and operators
			blockToOperatorMap.put(block, operator)
			operatorToNetDiagramMap.put(operator, diagram)
		}
		for (p : pkg.nestedPackages) {
			scadePackage.getPackages().add(iterateModel(p))
		}

		return scadePackage
	}

	def createOperatorImplementation(Operator operator, NetDiagram diagram) {
		var i = 1;
		var y_pos = 5;

		for (input : operator.getInputs()) {

			// Consider using the definedType directly instead of searching for it
			var variable = createNamedTypeVariable("_L" + i, (input.getType() as NamedType).getType());
			operator.getLocals().add(variable);
			inputToVariableMap.put(input, variable)

			var equation = theScadeFactory.createEquation();
			EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID());
			equation.getLefts().add(variable);

			var idexpression = theScadeFactory.createIdExpression();
			idexpression.setPath(input);

			equation.setRight(idexpression);
			operator.getData().add(equation);

			// Graphical
			var equation_ge = theEditorPragmasFactory.createEquationGE();
			equation_ge.setEquation(equation);
			portsToGraphicalMap.put(input, equation_ge)

			var point = theEditorPragmasFactory.createPoint();
			point.setX(100);
			point.setY(y_pos);
			equation_ge.setPosition(point);

			var size = theEditorPragmasFactory.createSize();
			size.setWidth(508);
			size.setHeight(500);
			equation_ge.setSize(size);

			diagram.getPresentationElements().add(equation_ge);

			i = i + 1;
			y_pos = y_pos + 1000;
		}
		y_pos = 5
		for (output : operator.getOutputs()) {
			var equation = theScadeFactory.createEquation();
			EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID());
			equation.getLefts().add(output);
			operator.getData().add(equation);

			// Graphical
			var equation_ge = theEditorPragmasFactory.createEquationGE();
			equation_ge.setEquation(equation);
			outputToEquationMap.put(output, equation)
			portsToGraphicalMap.put(output, equation_ge)

			var point = theEditorPragmasFactory.createPoint();
			point.setX(10000);
			point.setY(y_pos);
			equation_ge.setPosition(point);

			var size = theEditorPragmasFactory.createSize();
			size.setWidth(508);
			size.setHeight(500);
			equation_ge.setSize(size);

			diagram.getPresentationElements().add(equation_ge);

			i = i + 1;
			y_pos = y_pos + 1000;
		}
	}

	def createScadeDiagram(Operator operator) {
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

	def createOperatorInterface(Block block) {
		val operator = theScadeFactory.createOperator();
		operator.setName(block.name);
		operator.setKind(OperatorKind.NODE_LITERAL);

		for (port : block.flowPorts) {
			var type = createScadeType(port.type)

			// Create the port
			if (port.direction.value == FlowDirection.OUT_VALUE) {
				var variable = createNamedTypeVariable(port.name, type)
				operator.getOutputs().add(variable)
				flowportToOutputMap.put(port, variable)
			} else if (port.direction.value == FlowDirection.IN_VALUE) {
				var variable = createNamedTypeVariable(port.name, type)
				operator.getInputs().add(variable)
				flowportToInputMap.put(port, variable)
			} else if (port.direction.value == FlowDirection.INOUT_VALUE) {
				var variable = createNamedTypeVariable("input_" + port.name, type)
				operator.getInputs().add(variable)
				flowportToInputMap.put(port, variable)
				variable = createNamedTypeVariable("output_" + port.name, type)
				operator.getOutputs().add(variable)
				flowportToOutputMap.put(port, variable)
			}
		}
		return operator;
	}

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

	def createNamedTypeVariable(String name, com.esterel.scade.api.Type type) {

		// Create NamedType
		val namedType = theScadeFactory.createNamedType()
		namedType.setType(type)

		// Create Variable
		val variable = theScadeFactory.createVariable()
		variable.setName(name)
		variable.setType(namedType)

		return variable
	}

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

	def void fillScadeModel() {
		val pkg = iterateModel(sysmlModel)
		scadeModel.getPackages().add(pkg)
		scadeModel.getPackages().add(typePackage)

		createHierarchy()
		createGraphical()

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
			var diagram = operatorToNetDiagramMap.get(operator);
			var y_pos = 5

			var propertyToEquationMap = new HashMap<Property, Equation>()
			var equationToOutputToVariableMap = new HashMap<Equation, HashMap<Variable, Variable>>()
			var equationToOperatorMap = new HashMap<Equation, Operator>()
			var equationToCallMap = new HashMap<Equation, CallExpression>()
			var equationToGraphicalMap = new HashMap<Equation, EquationGE>()
			var propertyToInputToConnectorendMap = new HashMap<Property, HashMap<Variable, ConnectorEnd>>()
			var outputToConnectorendMap = new HashMap<Variable, ConnectorEnd>()

			for (property : block.nestedBlocksAsProperties) {
				locals_counter = addOperatorCall(property, propertyToEquationMap, name, operator, equationToOperatorMap,
					equationToCallMap, locals_counter, equationToOutputToVariableMap, equationToGraphicalMap, y_pos)
				y_pos = y_pos + 4000
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
						connectWithOutput(source, 1, portsToGraphicalMap.get(input), destination, diagram);
					} else if (equationToOutputToVariableMap.containsKey(equation)) {
						var sourcePort = flowportToOutputMap.get(port)
						var source = equationToOutputToVariableMap.get(equation, sourcePort)
						var src_index = equationToOperatorMap.get(equation).outputs.indexOf(
							flowportToOutputMap.get(port)) + 1
						connectWithOutput(source, src_index, equationToGraphicalMap.get(equation), destination,
							diagram)
					}
				}
			}
			for (property : propertyToInputToConnectorendMap.keySet) {
				var equation = propertyToEquationMap.get(property)
				var equation_ge = equationToGraphicalMap.get(equation)
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
								connectWithOperator(variable, 1, portsToGraphicalMap.get(source), dst_index, equation_ge,
									call_expression, diagram)
							} else {
								var eq = propertyToEquationMap.get(end.partWithPort)
								var source = equationToOutputToVariableMap.get(eq, flowportToOutputMap.get(port))
								connectWithOperator(source, equationToOperatorMap.get(eq).outputs.indexOf(source) + 1,
									equationToGraphicalMap.get(eq), dst_index, equation_ge, call_expression, diagram)
							}
						}
						dst_index = dst_index + 1
					}
					diagram.getPresentationElements().add(equationToGraphicalMap.get(equation));
					name = name + 1
				}
			}
		}
	}

	def int addOperatorCall(Property property, HashMap<Property, Equation> propertyToEquationMap, int name,
		Operator operator, HashMap<Equation, Operator> equationToOperatorMap,
		HashMap<Equation, CallExpression> equationToCallMap, int locals_counter,
		HashMap<Equation, HashMap<Variable, Variable>> equationToOutputToVariableMap,
		HashMap<Equation, EquationGE> equationToGraphicalMap, int y_pos) {

		var stereotype = property.type.getAppliedStereotype("SysML::Blocks::Block")
		var nblock = property.type.getStereotypeApplication(stereotype) as Block
		var equation = theScadeFactory.createEquation()
		var counter = locals_counter

		EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID())
		propertyToEquationMap.put(property, equation)

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

			// Graphical
			var equation_ge = theEditorPragmasFactory.createEquationGE();
			equation_ge.setEquation(equation);
			equationToGraphicalMap.put(equation, equation_ge)

			var point = theEditorPragmasFactory.createPoint();
			point.setX(5000);
			point.setY(y_pos);
			equation_ge.setPosition(point);

			var size = theEditorPragmasFactory.createSize();
			size.setWidth(4000);
			size.setHeight(3000);
			equation_ge.setSize(size)
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
		}
	}

	def createGraphical() {
		for (operator : blockToOperatorMap.values) {
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

	def fillDiagram(NetDiagram diagram, KNode pNode, Map<Equation, KNode> callToNode, Map<KPort, Equation> portToEquation,
		Map<KPort, Integer> portToIndex) {
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

	def void setSide(KPort port, PortSide side) {
		var portLayout = port.getData(typeof(KShapeLayout))
		portLayout.setProperty(LayoutOptions.PORT_SIDE, side)
	}

	def addEdgeTo(KPort source, KPort target) {
		var edge = KimlUtil.createInitializedEdge()
		edge.setTargetPort(target)
		edge.setTarget(target.node)
		target.getEdges().add(edge)
		edge.setSourcePort(source)
		edge.setSource(source.node)
		source.getEdges().add(edge)
	}

	def connectWithOperator(Variable source, int src_index, EquationGE src_ge, int dst_index, EquationGE dst_ge,
		CallExpression call, NetDiagram diagram) {
		var idexpression = theScadeFactory.createIdExpression()
		idexpression.setPath(source)
		call.callParameters.add(idexpression)
		var edge = theEditorPragmasFactory.createEdge()
		edge.setLeftVarIndex(src_index)
		edge.setRightExprIndex(dst_index)
		edge.setSrcEquation(src_ge)
		edge.setDstEquation(dst_ge)
		diagram.presentationElements.add(edge)
	}

	def void connectWithOutput(Variable source, int src_index, EquationGE source_ge, Variable destination,
		NetDiagram diagram) {
		var equation = outputToEquationMap.get(destination)
		var idexpression = theScadeFactory.createIdExpression();
		idexpression.setPath(source);
		equation.setRight(idexpression);
		equation.getLefts.add(destination)
		var equation_ge = portsToGraphicalMap.get(destination)
		diagram.presentationElements.add(equation_ge)
		var edge = theEditorPragmasFactory.createEdge();
		edge.setLeftVarIndex(src_index)
		edge.setRightExprIndex(1)
		edge.setSrcEquation(source_ge)
		edge.setDstEquation(equation_ge)
		diagram.presentationElements.add(edge)
	}

	def FlowPort getFlowPort(ConnectorEnd end) {
		if (end != null && end.role != null) {
			var stereotype = end.role.getAppliedStereotype("SysML::PortAndFlows::FlowPort")
			if (stereotype != null) {
				return end.role.getStereotypeApplication(stereotype) as FlowPort
			}
		}
		return null
	}

	def ConnectorEnd getOppositeEnd(ConnectorEnd end) {
		var list = (end.eContainer as Connector).ends
		if (list.get(0) == end) {
			return list.get(1)
		}
		return list.get(0)
	}

	def <KEY1, KEY2, ELEM> put(Map<KEY1, HashMap<KEY2, ELEM>> map, KEY1 key1, KEY2 key2, ELEM element) {
		if (!map.containsKey(key1)) {
			map.put(key1, new HashMap<KEY2, ELEM>())
		}
		map.get(key1).put(key2, element)
	}

	def <KEY1, KEY2, ELEM> ELEM get(Map<KEY1, HashMap<KEY2, ELEM>> map, KEY1 key1, KEY2 key2) {
		if (map != null && key1 != null && key2 != null) {
			var innerMap = map.get(key1)
			if (innerMap != null) {
				return innerMap.get(key2)
			}
		}
		return null
	}

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

	def static String name(FlowPort port) {
		return port.base_Port.name
	}

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
