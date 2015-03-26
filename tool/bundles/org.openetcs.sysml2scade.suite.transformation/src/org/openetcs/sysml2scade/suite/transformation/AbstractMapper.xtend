package org.openetcs.sysml2scade.suite.transformation

import com.esterel.project.api.Project
import com.esterel.scade.api.Annotable
import com.esterel.scade.api.CallExpression
import com.esterel.scade.api.Equation
import com.esterel.scade.api.NamedType
import com.esterel.scade.api.OpCall
import com.esterel.scade.api.Operator
import com.esterel.scade.api.OperatorKind
import com.esterel.scade.api.Package
import com.esterel.scade.api.ScadeFactory
import com.esterel.scade.api.ScadePackage
import com.esterel.scade.api.Type
import com.esterel.scade.api.Variable
import com.esterel.scade.api.pragmas.editor.util.EditorPragmasUtil
import com.esterel.scade.api.util.ScadeModelWriter
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
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
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Property

abstract class AbstractMapper extends ScadeModelWriter {
	protected static val INOUT_IN_NAME_PREFIX = "input_"
	protected static val INOUT_OUT_NAME_PREFIX = "output_"

	protected val ScadeFactory theScadeFactory

	protected val Model sysmlModel
	protected val ResourceSet sysmlResourceSet
	protected val URI baseURI
	protected val URI projectURI
	protected val Project scadeProject;
	protected val Package scadeModel
	protected val ResourceSet scadeResourceSet
	protected val Package typePackage

	protected val Map<String, EObject> oidToScadeElementMap

	protected val Trace tracefile;

	protected new(Model model, IProject project, Trace tracefile) {
		sysmlModel = model
		sysmlResourceSet = model.eResource.getResourceSet()
		baseURI = URI.createFileURI(project.getLocation().toOSString())
		projectURI = baseURI.appendSegment(model.name + ".etp")

		theScadeFactory = ScadePackage.eINSTANCE.getScadeFactory()
		scadeResourceSet = new ResourceSetImpl()
		scadeProject = loadProject()
		scadeModel = loadModel(projectURI, scadeResourceSet)
		this.typePackage = loadTypePackage()
		this.tracefile = tracefile
		oidToScadeElementMap = new HashMap<String, EObject>
	}

	protected abstract def Project loadProject()

	protected abstract def Package loadTypePackage()

	protected def saveProject(Project scadeProject) {

		// Put annotations in correct .ann file
		rearrangeAnnotations(scadeModel);

		// Ensure project contains appropriate FileRefs
		updateProjectWithModelFiles(scadeProject);

		// Save the project
		saveAll(scadeProject, null);

		tracefile.save()
	}

	protected def void searchForNewAndMovedElements(org.eclipse.uml2.uml.Package pkg, List<FlowPort> newPorts,
		List<Property> newProperties, List<EObject> moved, HashMap<String, LinkedList<Property>> blockInstances) {
		var scadePackage = oidToScadeElementMap.getBySourceID(pkg.UUID) as Package
		if (scadePackage === null) {
			scadePackage = createScadePackage(pkg.name);
			val resourcePackage = createXScade(pkg.name)
			resourcePackage.contents.add(scadePackage)
			oidToScadeElementMap.put(scadePackage.UUID, scadePackage)
			scadeModel.packages.add(scadePackage)
			val parentID = pkg.eContainer.UUID
			var parent = oidToScadeElementMap.getBySourceID(parentID) as Package
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
				scadePackage.operators.add(operator)
				oidToScadeElementMap.put(operator.UUID, operator)
				oidToScadeElementMap.putAll(operator.inputs.toMap[it.oid])
				oidToScadeElementMap.putAll(operator.outputs.toMap[it.oid])
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
			p.searchForNewAndMovedElements(newPorts, newProperties, moved, blockInstances)
		}
	}

	/**
	 * Add the SysML Ports stored in {@code ports} to the SCADE model
	 * 
	 * @param ports List of {@link FlowPort} which add to the model
	 */
	protected def addPorts(List<FlowPort> ports) {
		for (port : ports) {
			var operator = oidToScadeElementMap.getBySourceID(port.base_Port.eContainer.UUID) as Operator
			var type = createScadeType(port.type)
			if (port.direction == FlowDirection.OUT_VALUE) {
				var output = operator.addOutput(port.name, type)
				tracefile.addElement(port.UUID, operator.oid, output.oid)
				oidToScadeElementMap.put(output.oid, output)
			} else if (port.direction == FlowDirection.IN_VALUE) {
				var input = operator.addInput(port.name, operator.localsCount, type)
				tracefile.addElement(port.UUID, operator.oid, input.oid)
			} else if (port.direction == FlowDirection.INOUT_VALUE) {
				var input = operator.addInput(INOUT_IN_NAME_PREFIX + port.name, operator.localsCount, type)
				oidToScadeElementMap.put(input.oid, input)
				var output = operator.addOutput(INOUT_OUT_NAME_PREFIX + port.name, type)
				oidToScadeElementMap.put(output.oid, output)
				tracefile.addElement(port.UUID, operator.oid, input.oid, output.oid)
			}
		}
	}

	/**
	 * Transfers the {@link Property}s in {@code properties} to SCADE
	 */
	protected def void addEquations(List<Property> properties, Map<String, LinkedList<Property>> blockInstances) {
		for (property : properties) {
			var parentID = property.eContainer.UUID
			var parent = oidToScadeElementMap.getBySourceID(parentID) as Operator
			var instances = blockInstances.get(parentID)
			if (instances === null) {
				instances = new LinkedList
				blockInstances.put(parentID, instances)
			}
			instances.add(property)
			var operator = oidToScadeElementMap.getBySourceID(property.block.base_Class.UUID) as Operator
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
			oidToScadeElementMap.put(equation.oid, equation)
			tracefile.addElement(property.UUID, property.eContainer.UUID, equation.oid)
		}
	}

	/**
	 * Utility function for easy access to elements which should have only one representation in a SCADE model
	 */
	protected def <R> R getBySourceID(Map<String, R> map, String sourceID) {
		return map.get(tracefile.getTargetIDs(sourceID)?.findFirst[map.containsKey(it)])
	}

	/**
	 * Creates a new {@link Resource} with the given name and "xscade" as ending.
	 * 
	 * @param name The name of the created Resource
	 * @return The created Resource
	 */
	protected def Resource createXScade(String name) {
		val uriXscade = baseURI.appendSegment(name + ".xscade");
		return scadeResourceSet.createResource(uriXscade);
	}

	/**
	 * Creates and initializes a new {@link Package} with the given name.
	 * 
	 * @param name The name of the created Package
	 * @return The created Package
	 */
	protected def Package createScadePackage(String name) {
		val pkg = theScadeFactory.createPackage()
		pkg.setName(name)
		EditorPragmasUtil.setOid(pkg, EcoreUtil.generateUUID());
		return pkg
	}

	/**
	 * Transforms an {@link Block} to an {@link Operator}
	 * 
	 * @param block The Block which is transformed
	 * @return The created Operator
	 */
	private def createOperatorInterface(Block block) {
		val operator = theScadeFactory.createOperator();
		operator.setName(block.name);
		operator.setKind(OperatorKind.NODE_LITERAL);
		EditorPragmasUtil.setOid(operator, EcoreUtil.generateUUID());
		var blockID = block.base_Class.UUID
		tracefile.addElement(blockID, block.base_Class.eContainer.UUID, operator.oid)
		var local_count = 1
		for (port : block.flowPorts) {
			var type = createScadeType(port.type)

			// Create the port
			if (port.direction.value == FlowDirection.OUT_VALUE) {
				var output = operator.addOutput(port.name, type)
				tracefile.addElement(port.UUID, blockID, output.oid)
			} else if (port.direction.value == FlowDirection.IN_VALUE) {
				var input = operator.addInput(port.name, local_count, type)
				local_count++
				tracefile.addElement(port.UUID, blockID, input.oid)
			} else if (port.direction.value == FlowDirection.INOUT_VALUE) {
				var input = operator.addInput(INOUT_IN_NAME_PREFIX + port.name, local_count, type)
				var output = operator.addOutput(INOUT_OUT_NAME_PREFIX + port.name, type)
				local_count++
				tracefile.addElement(port.UUID, blockID, input.oid, output.oid)
			}
		}
		return operator;
	}

	/**
	 * Adds a new {@link Variable} as output to {@code operator} with {@code name} as name and {@code type} as type,
	 * and initializes a new {@link Equation} for the created output to {@code operator}. After this the new output is
	 * returned.
	 * 
	 * @param operator The operator on which the output is added
	 * @param name The name of the output
	 * @param type The type of the output
	 * @return The new output
	 */
	private def Variable addOutput(Operator operator, String name, Type type) {
		var output = createNamedTypeVariable(name, type)
		operator.outputs.add(output)
		var equation = theScadeFactory.createEquation();
		EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID());
		equation.getLefts().add(output);
		operator.getData().add(equation)
		oidToScadeElementMap.put(equation.oid, equation)
		return output
	}

	/**
	 * Adds a new {@link Variable} as input to {@code operator} with {@code name} as name and {@code type} as type,
	 * and initializes a new {@link Equation} for the created input to {@code operator}. After this the new input
	 * is returned
	 * 
	 * @param operator The operator on which the input is added
	 * @param name The name of the input
	 * @param type The type of the input
	 * @return The new input
	 */
	private def Variable addInput(Operator operator, String name, int locals_count, Type type) {
		var input = createNamedTypeVariable(name, type)
		operator.inputs.add(input)
		var variable = createNamedTypeVariable("_L" + locals_count, type)
		operator.getLocals().add(variable);

		var equation = theScadeFactory.createEquation();
		EditorPragmasUtil.setOid(equation, EcoreUtil.generateUUID());
		equation.getLefts().add(variable);

		var idexpression = theScadeFactory.createIdExpression();
		idexpression.setPath(input);

		equation.setRight(idexpression);
		operator.getData().add(equation)
		oidToScadeElementMap.put(equation.oid, equation)
		return input
	}

	/**
	 * Creates a new object of type {@link Variable} with the given name and type
	 * 
	 * @param name The name for the created Variable
	 * @param type The type of the Variable
	 * @return The created Variable
	 */
	private def Variable createNamedTypeVariable(String name, Type type) {

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
	 * Returns a {@link Type} on basis of the given {@link org.eclipse.uml2.uml.Type} by searching 
	 * for a {@link Type} with the same name in {@link MapToScade#typePackage} or creating a new
	 * {@link Type} if does not exist yet.
	 * If {@code uml_type} is null, or it has no name "int" is used as standard name.
	 * 
	 * @param uml_type {@link org.eclipse.uml2.uml.Type} for which the {@link Type} is created
	 * @return The resulting {@link Type}
	 */
	protected def createScadeType(org.eclipse.uml2.uml.Type uml_type) {
		var type_name = "int"

		if (uml_type != null && uml_type.name != null) {
			type_name = uml_type.name
		}

		var scade_type = findObject(typePackage, type_name, ScadePackage.Literals.TYPE) as Type

		// If we dont have the type, create
		if (scade_type == null) {
			scade_type = theScadeFactory.createType()
			scade_type.name = type_name
			typePackage.getTypes().add(scade_type)
		}

		return scade_type
	}

	protected def static String getUUID(EObject object) {
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
	 * Returns all {@link Block} references which are owned by {@code pkg}. This is done by
	 * filtering the list returned by {@link Element#getOwnedElements()}.
	 * 
	 * @see Element#getOwnedElements()
	 * 
	 * @param pkg The owner of the Blocks
	 * @return List of Blocks owned by {@code pkg}
	 */
	private def static EList<Block> getBlocks(Element pkg) {
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
	 * Function returning all FlowPorts of SysML Block
	 * 
	 * @param block The block for which the function returns all FlowPorts
	 * @return List of FlowPorts
	 */
	private def static List<FlowPort> getFlowPorts(Block block) {
		var list = new BasicEList<FlowPort>

		for (port : block.base_Class.ownedPorts) {
			var stereotype = port.getAppliedStereotype("SysML::PortAndFlows::FlowPort")

			if (stereotype != null) {
				list.add(port.getStereotypeApplication(stereotype) as FlowPort)
			}
		}

		return list
	}

	/**
	 * Retrieves all Properties which has the "SysML::Blocks::Block" stereotype applied from a Block.
	 */
	private def static List<Property> getNestedBlocksAsProperties(Block block) {
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
	 * Retrieves the Block from a property with the Block stereotype application. If does not exist {@code null} is returned.
	 * 
	 * @param property The property from which to retrieve the Block
	 * @return The Block stereotype application
	 */
	private def static Block getBlock(Property property) {
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
	 * Function returning the name of a SysML Block
	 * 
	 * @param block The block for which the function return the Name
	 * @return The name of the block
	 */
	private def static String getName(Block block) {
		return block.base_Class.name
	}

	/**
	 * Function returning the name of a Port
	 * 
	 * @param port The port for which the function return the Name
	 * @return The name of the port
	 */
	protected def static String getName(FlowPort port) {
		return port.base_Port.name
	}

	/**
	 * Function returning the type of a Port
	 * 
	 * @param port The port for which the function return the type
	 * @return The type of the port
	 */
	protected def static org.eclipse.uml2.uml.Type getType(FlowPort port) {
		return port.base_Port.type
	}

	/**
	 * Generated local variables are named after the schema: "_L" + number. This function returns the highest number for
	 * {@code operator} as integer or one as default.
	 * 
	 * @param operator The operator for which to compute the number
	 * @return The highest number used for {@code operator} with the naming schema for generated local variables
	 */
	private def static int getLocalsCount(Operator operator) {
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
}
