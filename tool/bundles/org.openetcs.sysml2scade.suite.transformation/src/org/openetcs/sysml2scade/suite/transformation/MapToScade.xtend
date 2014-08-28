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
import org.eclipse.uml2.uml.Type
import org.eclipse.emf.ecore.resource.ResourceSet
import com.esterel.scade.api.ScadeFactory
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.core.resources.IProject
import com.esterel.project.api.Project
import com.esterel.scade.api.NamedType

class MapToScade extends ScadeModelWriter {
	
	private URI baseURI;
	private ResourceSet sysmlResourceSet;
	private ResourceSet scadeResourceSet;
	private Model sysmlModel;
	private Package scadeModel;
	private ScadeFactory theScadeFactory;
	private Project scadeProject;
	
	new(Model model, IProject project) {
		sysmlModel = model;
		sysmlResourceSet = sysmlModel.eResource().getResourceSet();
		scadeResourceSet = new ResourceSetImpl();
		baseURI = URI.createFileURI(project.getLocation().toOSString());
		val projectURI = baseURI.appendSegment(sysmlModel.getName() + ".etp");
		theScadeFactory = ScadePackage.eINSTANCE.getScadeFactory()
		
		// Create empty SCADE project
		scadeProject = createEmptyScadeProject(projectURI, scadeResourceSet);
		
		// Load the create SCADE project
		scadeModel = loadModel(projectURI, scadeResourceSet);
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
			// Create xscade file
			//val resourceXscade = createXScade(block.name)
			
			// Each Block is mapped to operator
			val operator = theScadeFactory.createOperator();
			operator.setName(block.name);
			operator.setKind(OperatorKind.NODE_LITERAL);

			
			// SysML FlowPorts to operator variables
			for (port : block.flowPorts) {
				
				// Really ugly, but ternary operator seems not to exist
				var type_name = "int"
				
				if (port.type != null && port.type.name != null) {
					type_name = port.type.name
				}
				
				var type = findObject(scadeModel, type_name, ScadePackage.Literals.TYPE) as com.esterel.scade.api.Type
				
				// If we dont have the type, create
				if (type == null) {
					type = theScadeFactory.createType()
					type.name = port.type.name
					scadeModel.getTypes().add(type)
					//resourcePackage.getContents().add(type)
				} 
				
				// Set type to variable
				val portType = theScadeFactory.createNamedType()
				portType.setType(type)
				
				// Create the port
				if (port.direction.value == FlowDirection.OUT_VALUE) {
					operator.getInput().add(createVariable(port.name, portType))
				} else if (port.direction.value == FlowDirection.IN_VALUE) {
					operator.getOutput().add(createVariable(port.name, portType))
				} else if (port.direction.value == FlowDirection.INOUT_VALUE) {
					operator.getInput().add(createVariable("input_" + port.name, portType))
					operator.getOutput().add(createVariable("output_" + port.name, portType))
				}
			}
			
			scadePackage.getOperators().add(operator)
			
			//resourcePackage.getContents().add(operator);
		}
		
		for (p : pkg.nestedPackages) {
			scadePackage.getPackages().add(iterateModel(p))
		}
		
		return scadePackage
	}
	
	def createVariable(String name, NamedType type) {
		val variable = theScadeFactory.createVariable()
		variable.setName(name)
		variable.setType(type)
		
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
		
		// Put annotations in correct .ann file
		rearrangeAnnotations(scadeModel);
		
		// Ensure project contains appropriate FileRefs
		updateProjectWithModelFiles(scadeProject);
		
		// Save the project
		saveAll(scadeProject, null);
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