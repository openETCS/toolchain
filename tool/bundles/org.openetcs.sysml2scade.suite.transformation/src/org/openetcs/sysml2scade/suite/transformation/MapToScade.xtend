package org.openetcs.sysml2scade.suite.transformation

import com.esterel.scade.api.Package;
import com.esterel.scade.api.util.ScadeModelWriter
import org.eclipse.uml2.uml.Model
import org.eclipse.emf.common.util.URI
import com.esterel.scade.api.ScadePackage
import org.eclipse.emf.common.util.EList
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Property
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.papyrus.sysml.blocks.Block
import com.esterel.scade.api.OperatorKind
import org.eclipse.papyrus.sysml.portandflows.FlowPort
import org.eclipse.papyrus.sysml.portandflows.FlowDirection
import org.eclipse.uml2.uml.Type
import org.eclipse.emf.ecore.resource.ResourceSet
import com.esterel.scade.api.ScadeFactory
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.core.resources.IProject
import com.esterel.project.api.Project
import com.esterel.scade.api.NamedType
import com.esterel.scade.api.Operator
import com.esterel.scade.api.pragmas.editor.EditorPragmasFactory
import com.esterel.scade.api.pragmas.editor.EditorPragmasPackage
import com.esterel.scade.api.pragmas.editor.NetDiagram
import com.esterel.scade.api.pragmas.editor.util.EditorPragmasUtil
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.Map
import java.util.Map.Entry
import java.util.AbstractMap.SimpleEntry
import java.util.HashMap
import com.esterel.scade.api.Variable

class MapToScade extends ScadeModelWriter {
	
	private URI baseURI;
	private ResourceSet sysmlResourceSet;
	private ResourceSet scadeResourceSet;
	private Model sysmlModel;
	private Package scadeModel;
	private Package typePackage;
	private ScadeFactory theScadeFactory;
	private EditorPragmasFactory theEditorPragmasFactory;
	private Project scadeProject;
	private Map<Block, Operator> blockToOperatorMap;
	private Map<Operator, NetDiagram> operatorToNetDiagramMap;
	
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

		for (block: pkg.getBlocks) {			
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

		for (input : operator.getInput()) {
			// Consider using the definedType directly instead of searching for it
			var variable = createNamedTypeVariable("_L"+i, input.getType().getDefinedType());
			operator.getLocals().add(variable);
			
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
			
			var point = theEditorPragmasFactory.createPoint();
			point.setX(100);
			point.setY(y_pos);
			equation_ge.setPosition(point);
			
			var size  = theEditorPragmasFactory.createSize();
			size.setWidth(508);
			size.setHeight(500);
			equation_ge.setSize(size);
			
			diagram.getPresentationElements().add(equation_ge);
			
			i = i + 1;
			y_pos = y_pos + 1000;
		}
		y_pos = 5
		for (output : operator.getOutput()) {
			var variable = createNamedTypeVariable("_L"+i, output.getType().getDefinedType());
			operator.getLocals().add(variable);
			
			var equation = theScadeFactory.createEquation();
			EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID());
			equation.getLefts().add(output);
			
			var idexpression = theScadeFactory.createIdExpression();
			idexpression.setPath(variable);
			
			equation.setRight(idexpression);
			operator.getData().add(equation);
			
			// Graphical
			var equation_ge = theEditorPragmasFactory.createEquationGE();
			equation_ge.setEquation(equation);
			
			var point = theEditorPragmasFactory.createPoint();
			point.setX(10000);
			point.setY(y_pos);
			equation_ge.setPosition(point);
			
			var size  = theEditorPragmasFactory.createSize();
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
		operator.getPragma().add(operator_pragma);
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



			// SysML FlowPorts to operator variables
			for (port : block.flowPorts) {
				var type = createScadeType(port.type)				
				
				// Create the port
				if (port.direction.value == FlowDirection.OUT_VALUE) {
					operator.getOutput().add(createNamedTypeVariable(port.name, type))
				} else if (port.direction.value == FlowDirection.IN_VALUE) {
					operator.getInput().add(createNamedTypeVariable(port.name, type))
				} else if (port.direction.value == FlowDirection.INOUT_VALUE) {
					operator.getInput().add(createNamedTypeVariable("input_" + port.name, type))
					operator.getOutput().add(createNamedTypeVariable("output_" + port.name, type))
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
		
		for (Element element: pkg.ownedElements) {
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
		
		// Put annotations in correct .ann file
		rearrangeAnnotations(scadeModel);
		
		// Ensure project contains appropriate FileRefs
		updateProjectWithModelFiles(scadeProject);
		
		// Save the project
		saveAll(scadeProject, null);
	}
	
	def createHierarchy() {
		for (entry: blockToOperatorMap.entrySet()) {
			var block = entry.key
			var operator = entry.value
			var name = 1;
			var diagram = operatorToNetDiagramMap.get(operator);
			var y_pos = 5
			
			for (nblock : block.getNestedBlocks()) {
				// Create equation
				var equation = theScadeFactory.createEquation()
				EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID())
				
				// Create Call expression
				var call_expression = theScadeFactory.createCallExpression()
				
				// Create function call
				var call = theScadeFactory.createOpCall();
				call.setName(name.toString)
				
				var op = blockToOperatorMap.get(nblock)
				call.setOperator(op)
				
				// Set function call to call expression
				call_expression.setOperator(call)
				
				var idexpression = theScadeFactory.createIdExpression()
				call_expression.getCallParameters().add(idexpression)
				
				// Set call expression to right side of equation
				equation.setRight(call_expression)
				
				// Set equation to operator
				operator.getData().add(equation)
				
				// Graphical
				var equation_ge = theEditorPragmasFactory.createEquationGE();
				equation_ge.setEquation(equation);
				
				var point = theEditorPragmasFactory.createPoint();
				point.setX(5000);
				point.setY(y_pos);
				equation_ge.setPosition(point);
				
				var size  = theEditorPragmasFactory.createSize();
				size.setWidth(4000);
				size.setHeight(3000);
				equation_ge.setSize(size);
				
				diagram.getPresentationElements().add(equation_ge);
				
				name = name + 1
				y_pos = y_pos + 4000
			}
		}
	}
	
	def EList<Block> getNestedBlocks(Block block) {
		var list = new BasicEList<Block>
		
		for (Property property:block.base_Class.ownedAttributes) {
			var type = property.type
			
			if (type != null) {			
				var stereotype = type.getAppliedStereotype("SysML::Blocks::Block")
				
				if (stereotype != null) {
					list.add(property.getStereotypeApplication(stereotype) as Block)
				}	
			}
		}
		
		return list
	}

	def static EList<Block> getAllBlocks(Model model) {
		var list = new BasicEList<Block>
		
		for (Element element: model.allOwnedElements) {
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