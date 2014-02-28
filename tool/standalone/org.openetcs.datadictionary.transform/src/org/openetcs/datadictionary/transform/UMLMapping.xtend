package org.openetcs.datadictionary.transform

import Subset0267.util.Subset0267ResourceFactoryImpl
import Subset0268.util.Subset0268ResourceFactoryImpl
import java.io.IOException
import org.eclipse.emf.common.util.BasicEMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.uml2.uml.DataType
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.resource.UMLResource
import org.eclipse.uml2.uml.Model

class UMLMapping {
	private static var generatedTypes = new BasicEMap<String, Type>
	private static var invalidNames = #[ 
		"spare",
		"unknown",
		"not known",
		"not valid",
		"reserved",
		"not used"]
	
	def public static void main(String[] args) {
		val umlModel = createUMLModel
		umlModel.setName("DataDictionary")
		var package267 = umlModel.createNestedPackage("Subset-026-7")
		var package268 = umlModel.createNestedPackage("Subset-026-8")
		
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE)
		
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("xml",new Subset0267ResourceFactoryImpl);
		transformSubset267(package267, "models/Subset_026_7.xml")
		
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("xml",new Subset0268ResourceFactoryImpl);
		transformSubset268(package268, "models/Subset_026_8.xml")
		
		save(umlModel)
	}
	
	def static transformSubset268(Package pkg, String file) {
		val dictionary = getDatadictionary268(file)
		
		for (v : dictionary.definitions.packets.trackToTrain.packet + dictionary.definitions.packets.trainToTrack.packet) {
			var dataType = pkg.createDataType(v.name, v.description)
			
			for (t : v.content.tlgVar) {
				dataType.createAttribute(t.name, generatedTypes.get(t.name), t.comment)
			}
		}			
	}
	
	def static getDatadictionary268(String file) {
		var resourceSet = new ResourceSetImpl();
		var uri = URI.createURI(file);
		var resource = resourceSet.getResource(uri, true);
		var model = resource.contents.get(0)
		return model as Subset0268.DocumentRoot;
	}
	
	def static transformSubset267(Package pkg, String file) {
		val dictionary = getDatadictionary267(file)
		
		// Transform variables to primitive type or enumerated type
		// The decision depends on the "Special" field in "Specs
		for (v : dictionary.definitions.varDef.variable) {
			
			// If special is empty or less than 1 we have a primitive type
			if (v.specs.special.empty || v.specs.special.length <= 1) {
				var primitiveType = pkg.createPrimitiveType(v.name, v.description)
				generatedTypes.put(primitiveType.name, primitiveType)
			} else {
				var enumeratedType = pkg.createEnumeratedType(v.name, v.description)
				generatedTypes.put(enumeratedType.name, enumeratedType)
				
				for (s : v.specs.special) {
					if (s.description.isValidName) {
						enumeratedType.createOwnedLiteral(s.description)
					}
				}
			}
		}
		
		// Transform all packets to UML Types
		for (v : dictionary.definitions.packets.trackToTrain.packet + dictionary.definitions.packets.trainToTrack.packet) {
			var dataType = pkg.createDataType(v.name, v.description)
			
			for (t : v.content.tlgVar) {
				dataType.createAttribute(t.name, generatedTypes.get(t.name), t.comment)
			}
		}
	}
	
	def static boolean isValidName(String name) {
		for (i : invalidNames) {
			if (name.equalsIgnoreCase(i)) {
				return false
			}
		}
		return true
	}
	
	def static createAttribute(DataType dataType, String name, Type type, String comment) {
		var attribute = dataType.createOwnedAttribute(name, type)
		attribute.addComment(comment)
	}
	
	def static createEnumeratedType(Package pkg, String name, String comment) {
		var enumeratedType = pkg.createOwnedEnumeration(name)
		enumeratedType.addComment(comment)
		
		return enumeratedType		
	}
	
	def static createPrimitiveType(Package pkg, String name, String comment) {
		var primitiveType = pkg.createOwnedPrimitiveType(name)
		primitiveType.addComment(comment)
		
		return primitiveType
	}
	
	def static createDataType(Package pkg, String name, String comment) {
		var dataType = pkg.createPackagedElement(name, UMLPackage.eINSTANCE.dataType) as DataType
		dataType.addComment(comment)
		
		return dataType
	}
	
	def static addComment(NamedElement element, String comment) {
		if (comment != null) {
			var elementComment = element.createOwnedComment
			elementComment.setBody(comment)
			elementComment.annotatedElements.add(element)
		}
	}
	
	def static getDatadictionary267(String file) {
		var resourceSet = new ResourceSetImpl();
		var uri = URI.createURI(file);
		var resource = resourceSet.getResource(uri, true);
		var model = resource.contents.get(0)
		return model as Subset0267.DocumentRoot;
	}
	
	def static createUMLModel () {
		return UMLFactory.eINSTANCE.createModel
	}
	
	def static save(Model model) {
		val resourceSet = new ResourceSetImpl()
		val res = resourceSet.createResource(URI.createURI("generated/models/DataDictionary.library.uml"))
		res.getContents().add(model)

		try {
			res.save(emptyMap);
		} catch (IOException e) {
			e.printStackTrace()
		}
	}		
}