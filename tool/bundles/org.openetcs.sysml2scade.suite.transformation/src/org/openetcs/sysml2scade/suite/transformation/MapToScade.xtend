package org.openetcs.sysml2scade.suite.transformation

import com.esterel.scade.api.Package;
import com.esterel.scade.api.util.ScadeModelWriter
import org.eclipse.uml2.uml.Model
import org.eclipse.emf.common.util.URI
import com.esterel.scade.api.ScadePackage
import org.eclipse.emf.common.util.EList
import org.eclipse.uml2.uml.Element
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.papyrus.sysml.blocks.Block
import com.esterel.scade.api.OperatorKind
import org.eclipse.papyrus.sysml.portandflows.FlowPort
import org.eclipse.papyrus.sysml.portandflows.FlowDirection

class MapToScade extends ScadeModelWriter {
	def static void fillScadeModel(Package mainModel, Model sysmlModel, URI baseURI) {
		val resourceSet = mainModel.eResource().getResourceSet()
		val theScadeFactory = ScadePackage.eINSTANCE.getScadeFactory()
		
		val typeInt = findObject(mainModel, "int", ScadePackage.Literals.TYPE) as com.esterel.scade.api.Type
		
		for (block : sysmlModel.getAllBlocks) {
			// Create xscade file
			val uriXscade = baseURI.appendSegment(block.name + ".xscade");
			val resourceXscade = resourceSet.createResource(uriXscade);
			
			// Each Block is mapped to operator
			val operator = theScadeFactory.createOperator();
			operator.setName(block.name);
			operator.setKind(OperatorKind.NODE_LITERAL);

			
			// SysML FlowPorts to operator variables
			for (port : block.flowPorts) {
				val variable = theScadeFactory.createVariable()
				val type = theScadeFactory.createNamedType()
				variable.setName(port.name)
				type.setType(typeInt)
				variable.setType(type)
				
				if (port.direction.value == FlowDirection.OUT_VALUE) {
					operator.getInput().add(variable)
				} else {
					// TODO: What if we have INOUT_VALUE?
					operator.getOutput().add(variable)
				}
			}
			
			mainModel.getOperators().add(operator)
			resourceXscade.getContents().add(operator);
		}
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