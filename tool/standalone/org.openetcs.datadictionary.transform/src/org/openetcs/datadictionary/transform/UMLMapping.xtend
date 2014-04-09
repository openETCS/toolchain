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
import org.eclipse.uml2.uml.Profile
import org.eclipse.uml2.uml.Stereotype
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.resource.UMLResource
import org.eclipse.uml2.uml.Model
import org.eclipse.emf.ecore.util.FeatureMap
import Subset0267.TTlgVar
import Subset0267.TLoopDoWhile
import Subset0267.TLoopWhile
import Subset0267.TConditional
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.common.util.WrappedException

class UMLMapping {
	private static var SysMLProfile = null
	private static var generatedTypes = new BasicEMap<String, Type>
	private static var invalidNames = #[ 
		"spare",
		"unknown",
		"not known",
		"not valid",
		"reserved",
		"not used"]
	private static var resourceSet = new ResourceSetImpl;	
	
	def static Package loadPackage(URI uri) throws Exception {		
		try {
			var resource = resourceSet.getResource(uri, true);
			return EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PACKAGE) as Package;
        } catch (WrappedException we) {
            println(we.getMessage())
            System.exit(1)
        }
        return null
    }
 
	def static Profile getProfile(Package pack, String name) {              
 		for (e : pack.allOwnedElements()) {
			switch e {
				Profile : {
					if (e.getName() == name)
						return e;
				}
			}			
		}
        return null;
    }
 
	def static Stereotype getStereotype(Package pack, String name) 
	{
 		for (e : pack.allOwnedElements()) {
 			switch e {
 				Stereotype :
					if (e.getName() == name) {
						return e
					}		
 			}
		}
        return null;
	}
 	
	def public static void main(String[] args) {
		/*
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		val SysMLProfileUri = URI.createURI("models/SysML.profile.uml")	
		var uriMap = resourceSet.getURIConverter().getURIMap();		
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP),  SysMLProfileUri.appendSegment("libraries").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), SysMLProfileUri.appendSegment("metamodels").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP),   SysMLProfileUri.appendSegment("profiles").appendSegment(""));
		*/
		val umlModel = createUMLModel
		// val SysMLProfile = loadPackage(SysMLProfileUri) as Profile;		
		// umlModel.applyProfile(SysMLProfile)
				
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
		
		/*for (v : dictionary.definitions.packets.trackToTrain.packet + dictionary.definitions.packets.trainToTrack.packet) {
			var dataType = pkg.createDataType(v.name, v.description)
			
			for (t : v.content.tlgVar) {
				dataType.createAttribute(t.name, generatedTypes.get(t.name), t.comment)
			}
		}*/			
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
				var primitiveType = pkg.createOwnedPrimitiveType(identifier(v.name))
				if (isValid(v.detailedName)) {
					primitiveType.addComment("DetailedName = " + v.detailedName)					
				}		
				if (isValid(v.description)) {
					primitiveType.addComment("Description = " + v.description)					
				}		
				
				var specs = v.specs;
				primitiveType.addComment("Length = " + specs.length.toString())					
						
				if (specs.setMinVal) {
					primitiveType.addComment("MinVal = " + specs.minVal.toString())					
				}		
				if (specs.setMaxVal) {
					primitiveType.addComment("MaxVal = " + specs.maxVal.toString())					
				}
				if (specs.setFormula) {
					primitiveType.addComment("Formula = " + specs.formula.toString())					
				}
		
				generatedTypes.put(primitiveType.name, primitiveType)				
				
			} else {
				var enumeratedType = pkg.createOwnedEnumeration(identifier(v.name))
				if (isValid(v.detailedName)) {
					enumeratedType.addComment("DetailedName = " + v.detailedName)					
				}		
				if (isValid(v.description)) {
					enumeratedType.addComment("Description = " + v.description)					
				}				
				generatedTypes.put(enumeratedType.name, enumeratedType)
				
				for (s : v.specs.special) {
					if (s.description.isValidName) {
						var literal = enumeratedType.createOwnedLiteral(identifier(s.description))
						literal.addComment("Description = " + s.description)
						literal.addComment("Value = " + s.value.toString)
					}
				}
			}
		}
		
		// Transform all packets to UML Types
		for (v : dictionary.definitions.packets.trackToTrain.packet + dictionary.definitions.packets.trainToTrack.packet) {
			var typeName = identifier(v.name)
			var dataType = pkg.createDataType(typeName)
			if (isValid(v.description)) {
				dataType.addComment(v.description)
			}
			dataType.addComment("Number = " + v.number.toString())
			dataType.addComment("TransmissionMedia = " + v.transmissionMedia.toString())
			
			pkg.createContent(dataType, v.content.group, typeName, null)
					
			
		}
	}
	
	def static createContent(Package pkg, DataType type, FeatureMap fmap, String prefix, String skip) {
		var dyn_cpt = 0
		var con_cpt = 0
		
		var iter = fmap.valueListIterator
		while (iter.hasNext) {
			var elt = iter.next
			switch elt {
			TTlgVar : {
				if (elt.name != skip) {
					var attr = type.createAttribute(elt.name, generatedTypes.get(elt.name), elt.comment)
					attr.addComment("Length = " + elt.length.toString())
				}					
			}
			TLoopDoWhile : {
				dyn_cpt = dyn_cpt + 1
				var loop_name = "DStruct" + dyn_cpt.toString()
				var loop_type_name = prefix + '_' + loop_name
				var loop_type = pkg.createLoop(loop_type_name, elt.group)
				generatedTypes.put(loop_type_name, loop_type)
				var attr = type.createOwnedAttribute(loop_name, loop_type)
				attr.addComment("Dynamic field header")				
			}
			TLoopWhile : {
				dyn_cpt = dyn_cpt + 1				
				var loop_name = "DStruct" + dyn_cpt.toString()
				var loop_type_name = prefix + '_' + loop_name
				var loop_type = pkg.createLoop(loop_type_name, elt.group)
				generatedTypes.put(loop_type_name, loop_type)
				var attr = type.createOwnedAttribute(loop_name, loop_type)
				attr.addComment("Dynamic field header")
			}
			TConditional : {
				con_cpt = con_cpt + 1
				var con_name = "CStruct" + con_cpt.toString()
				var con_type_name = prefix + '_' + con_name
				var con_type = pkg.createDataType(con_type_name)
				con_type.addComment("Conditional field")
				generatedTypes.put(con_type_name, type)
				var attr = type.createOwnedAttribute(con_name, con_type)
				attr.addComment("Conditional field")
				attr.addComment("Condition = " + elt.condition.toString())
				for (evar : elt.variables) {
					pkg.createContent(con_type, evar.group, con_type_name, null)					
				}
			}
			}			
		}		
	}
	
	def static createLoop(Package pkg, String loop_type_name, FeatureMap fmap) {
		var type = pkg.createDataType(loop_type_name)
		type.addComment("Dynamic block header")
		generatedTypes.put(loop_type_name, type)		
		// find N_ITER
		var iter = fmap.valueListIterator
		var break = false
		while (iter.hasNext && !break) {
			var elt = iter.next
			switch elt {
				TTlgVar : {
					if (elt.name.startsWith("N_ITER")) {
						break = true
						var attr = type.createOwnedAttribute(elt.name, generatedTypes.get("N_ITER"))
						if (isValid(elt.comment)) {
							attr.addComment(elt.comment)
						}
						attr.addComment("Length = " + elt.length.toString())
						// body
						var body_name = loop_type_name + "_Body"
						var body_type = pkg.createDataType(body_name)
						body_type.addComment("Dynamic field body")
						var body_attr = type.createOwnedAttribute("body", body_type, 33, 33)
						body_attr.addComment("Dynamic field body")
						generatedTypes.put(body_name, body_type)
						pkg.createContent(body_type, fmap, body_name, elt.name)
					}
				}
			}
		}
		return type		
	}
	
	def static createConditional(Package pkg, String con_type_name, FeatureMap fmap) {
		
	}
	
	
	def static identifier(String str) {
		return str.replaceAll("\\W", '_')
	}
	
	def static boolean isValidName(String name) {
		for (i : invalidNames) {
			if (name.equalsIgnoreCase(i)) {
				return false
			}
		}
		return true
	}
	
	def static isValid(String comment) {
		return (comment != null) && (comment != "")
	}
	
	def static createAttribute(DataType dataType, String name, Type type, String comment) {
		var attribute = dataType.createOwnedAttribute(name, type)
		attribute.addComment(comment)
		return attribute
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

	def static createDataType(Package pkg, String name) {
		return pkg.createPackagedElement(name, UMLPackage.eINSTANCE.dataType) as DataType
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