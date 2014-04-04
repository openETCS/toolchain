package de.fraunhofer.esk.openetcs.sysml2b.transformation

import ClassicalB.BAbstractVariable
import ClassicalB.BOperation
import ClassicalB.ClassicalBFactory
import ClassicalB.Project
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.papyrus.sysml.blocks.Block
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Operation
import org.eclipse.emf.common.util.BasicEMap
import ClassicalB.BType
import org.eclipse.uml2.uml.ParameterDirectionKind
import org.eclipse.papyrus.sysml.portandflows.FlowPort
import org.eclipse.papyrus.sysml.portandflows.FlowDirection
import ClassicalB.BParameter
import org.eclipse.uml2.uml.AggregationKind
import org.eclipse.uml2.uml.Property
import ClassicalB.BConcreteVariable
import ClassicalB.BInvariant
import ClassicalB.BAbstractMachine
import org.eclipse.uml2.uml.Parameter
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.Port

class MapToBModel {
	var ClassicalBFactory BFactory = ClassicalBFactory.eINSTANCE
	var TypeMap = new BasicEMap<String, BType>
	
	new() {
		// Create a null BType
		var btype = BFactory.createBType
		btype.name = "null"
		TypeMap.put("null", btype)
	}
	
	def Project create(Model model) {
		var project = BFactory.createProject
		
		for (block : model.getAllBlocks) {
			// SysML Block to BAbstractMachine
			var machine = mapToBMachine(block)
			project.machines.add(machine)
			
			// SysML Block Values to BConcreteVariables and BInvariants
			for (value : block.values) {
				var variable = mapToBConcreteVariable(value)
				var invariant = mapToBInvariant(value)

				machine.concreteVariables.add(variable)
				machine.invariants.add(invariant)
			}
			
			// SysML FlowPorts to BOperation
			for (port : block.flowPorts) {
				var operation = mapToBOperation(port)
				machine.operations.add(operation)
			}
			
			// SysML Operation to BOperation
			for (operation: block.ownedOperations) {
				var boperation = mapToBOperation(operation)
				machine.operations.add(boperation)
			}
		}
		
		return project
	}
	
	//
	// Maps SysML Block to ASM
	//
	def BAbstractMachine mapToBMachine(Block block) {
		var machine = BFactory.createBAbstractMachine
		machine.name = block.name

		return machine
	}
	
	/**
	 * Function returning the name of a SysML Block
	 * 
	 * @param block The block for which the function return the Name
	 * @return The name of the block
	 */
	def String name(Block block) {
		return block.base_Class.name
	}
	
	/**
	 * Function returning all Values of a SysML Block
	 * 
	 * @param block The block for which the function returns all Values
	 * @return List of Values
	 */
	def EList<Property> values(Block block) {
		var list = new BasicEList<Property>
		
		for (property : block.base_Class.ownedAttributes) {
			if (property.aggregation == AggregationKind.COMPOSITE_LITERAL && !(property instanceof Port) &&
				property.association == null) {
				list.add(property)
			}
		}
		
		return list
	}
	
	/**
	 * Function returning all Operation of a SysML Block
	 * 
	 * @param block The block for which the function returns all Operations
	 * @return List of Operations
	 */
	def EList<Operation> ownedOperations(Block block) {
		return block.base_Class.ownedOperations
	}
	
	/**
	 * Function returning all FlowPorts of SysML Block
	 * 
	 * @param block The block for which the function returns all FlowPorts
	 * @return List of FlowPorts
	 */
	def EList<FlowPort> flowPorts(Block block) {
		var list = new BasicEList<FlowPort>
		
		for (port : block.base_Class.ownedPorts) {
			var stereotype = port.getAppliedStereotype("SysML::PortAndFlows::FlowPort")

			if (stereotype != null) {
				list.add(port.getStereotypeApplication(stereotype) as FlowPort)
			}
		}
		
		return list
	}
	
	// ----------------------------------------------------------------------
	//
	// MAPPING FUNCTIONS
	//
	// ----------------------------------------------------------------------
	
	/**
	 * Map a SysML Operation to a BOperation
	 * 
	 * @param operation The operation to map to a BOperation
	 * @return The created BOperation
	 */
	def BOperation mapToBOperation(Operation operation) {
		var boperation = BFactory.createBOperation

		boperation.name = operation.name

		for (parameter : operation.ownedParameters) {
			var bparameter = mapToBParameter(parameter)

			if (parameter.direction == ParameterDirectionKind.OUT_LITERAL) {
				boperation.outParameters.add(bparameter)
			} else if (parameter.direction == ParameterDirectionKind.IN_LITERAL) {
				boperation.inParameters.add(bparameter)
			}
		}

		return boperation
	}

	def BParameter mapToBParameter(FlowPort port) {
		return createParameter(port.name, port.type)
	}
	
	def String name(FlowPort port) {
		return port.base_Port.name
	}
	
	def Type type(FlowPort port) {
		return port.base_Port.type
	}

	def BParameter mapToBParameter(Parameter parameter) {
		return createParameter(parameter.name, parameter.type)
	}
	
	def BParameter createParameter(String name, Type type) {
		var parameter = BFactory.createBParameter
		
		parameter.name = name
		parameter.type = getBType(type)
		
		return parameter
	}
	
	// Returns BType with name if already created, otherwise create a new BType
	def BType getBType(Type type) {
		if (type != null) {
			var btype = TypeMap.get(type.name)

			if (btype == null) {
				btype = BFactory.createBType
				btype.name = type.name
				TypeMap.put(type.name, btype)
			}
			
			return btype
		} else {
			return TypeMap.get("null")
		}
	}
		
	/**
	 * Maps a SysML FlowPort to a BOperation
	 * 
	 * @param port The flow port to map to a BOperation
	 * @return The created BOperation
	 */
	def BOperation mapToBOperation(FlowPort port) {
		var operation = BFactory.createBOperation
		operation.name = port.name
		
		var parameter = mapToBParameter(port)
		
		// As the flow port data has no name and we dont want to use the 
		// port name as argument name
		parameter.name = "data" 

		if (port.direction.value == FlowDirection.OUT_VALUE) {
			operation.outParameters.add(parameter)
		} else if (port.direction.value == FlowDirection.IN_VALUE) {
			operation.inParameters.add(parameter)
		} else {
			// No support for in/out ports
		}
		
		return operation;
	}

	/**
	 * Maps a UML property to a BInvariant
	 * 
	 * @param property The property to map to a BInvariant
	 * @return The created BInvariant
	 */
	def BInvariant mapToBInvariant(Property property) {
		var invariant = BFactory.createBInvariant

		invariant.name = property.name

		var String typename
		if (property.type != null) {
			typename = property.type.name
		} else {
			typename = 'null'
		}

		invariant.type = typename

		return invariant
	}

	/**
	 * Maps a UML property to a BConcreteVariable
	 * 
	 * @param property The property to map to a BConcreteVariable
	 * @return The created BConcreteVariable
	 */
	def BConcreteVariable mapToBConcreteVariable(Property property) {
		var variable = BFactory.createBConcreteVariable

		variable.name = property.name

		return variable
	}

	def createInvariant(String name, String type) {
		var invariant = BFactory.createBInvariant
		invariant.name = name
		invariant.type = type
		
		return invariant
	}
	
	def createConcreteVariable(String name) {
		var variable = BFactory.createBConcreteVariable
		variable.name = name
		
		return variable
	}
	
	def BOperation createOperation(String name) {
		var operation = BFactory.createBOperation
		operation.name = name
		
		return operation
	}
	
	def EList<BAbstractVariable> getAbstractVariables(Block block) {
		var list = new BasicEList<BAbstractVariable>
		
		// for (Property p : block.base_Class.)
		
		return list
	}
	
	def EList<BOperation> getAllOperations(Block block) {
		var list = new BasicEList<BOperation>
		
		// Get all UML operations
		for (Operation o : block.base_Class.operations) {
			var bop = BFactory.createBOperation
			bop.name = o.name
		}
		
		return list
	}
	
	def EList<Block> getAllBlocks(Model model) {
		var list = new BasicEList<Block>
		
		for (Element element: model.allOwnedElements) {
			var stereotype = element.getAppliedStereotype("SysML::Blocks::Block") 
			if (stereotype != null) {
				list.add(element.getStereotypeApplication(stereotype) as Block)
			}
		}
		
		return list
	}
}