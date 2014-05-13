package org.openetcs.datadictionary.transform

import Subset0267.TConditional
import Subset0267.TLoopDoWhile
import Subset0267.TLoopWhile
import Subset0267.TTlgVar
import Subset0267.util.Subset0267ResourceFactoryImpl
import Subset0268.DocumentRoot
import Subset0268.ParcelType
import Subset0268.util.Subset0268ResourceFactoryImpl
import java.io.IOException
import org.eclipse.emf.common.util.BasicEMap
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.WrappedException
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.FeatureMap
import org.eclipse.uml2.uml.DataType
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.resource.UMLResource

class TransformServiceImpl implements ITransformService {
//	private static var SysMLProfile = null

	private static val NUMBER_PREFIX 				= "Number = "
	private static val TRANSMISSION_MEDIA_PREFIX 	= "TransmissionMedia = "
	private static val DETAILED_NAME_PREFIX 		= "DetailedName = "
	private static val DESCRIPTION_PREFIX 			= "Description = "
	private static val LENGTH_PREFIX 				= "Length = "
	private static val MIN_VAL_PREFIX 				= "MinVal = "
	private static val MAX_VAL_PREFIX 				= "MaxVal = "
	private static val FORMULA_PREFIX 				= "Formula = "
	private static val VALUE_PREFIX 				= "Value = "
	
	private static val OPTIONAL_PACKET_COMMENT 		= "Optional packet"
	private static val PARCEL_NAME_PREFIX 			= "parcel_"
	
	private static val DYNAMIC_FIELD_HEADER_COMMENT = "Dynamic field header"
	private static val DYNAMIC_FIELD_BODY_COMMENT 	= "Dynamic field body"
	private static val DYNAMIC_FIELD_BODY_NAME 		= "body"
	private static val DYNAMIC_FIELD_PREFIX 		= "DStruct"
	
	private static val CONDITONAL_FIELD_COMMENT 	= "Conditional field"
	private static val CONDITION_PREFIX 			= "Condition = "
	private static val CONDITIONAL_FIELD_PREFIX 	= "CStruct"
	
	private static val PRIMITIVE_PACKAGE_NAME 		= "__primitive__"
	private static val PARCEL_TYPE_ID 				= "PARCEL"
	private static val PARCEL_TYPE_NAME 			= "Parcel_t"
	private static val PRIMITIVE_INT_TYPE_NAME 		= "int"
	private static val PRIMITIVE_REAL_TYPE_NAME 	= "real"
	private static val PRIMITIVE_ENUM_TYPE_NAME 	= "enum"
	
	private static val VARIABLES_PACKAGE			= "Variables"
	private static val TRACK_TO_TRAIN_PACKAGE 		= "TrackToTrain"
	private static val TRAIN_TO_TRACK_PACKAGE 		= "TrainToTrack"

		
	private static val MODEL_NAME 					= "DataDictionary"
		
	private static var SUBSET_NAME_0267 			= "Subset-026-7"
	private static var SUBSET_NAME_0268 			= "Subset-026-8"
	
	private static var invalidNames = #[ 
		"spare",
		"unknown",
		"not known",
		"not valid",
		"reserved",
		"not used"]
		
	private static val FILE_PREFIX = "file:///"
	
	////////////////////////////////////////////////////////////////////////////////
	
	private var generatedTypes 	= new BasicEMap<String, Type>		
			
	def clean() {
		generatedTypes = new BasicEMap<String, Type>
	}
	
	override String transform(String file) {
		var outFile = transformImpl(file)
		clean()	
		return outFile
	}
	
	def String transformImpl(String file) {
		val input =  FILE_PREFIX + file;
		val output_path = file.substring(0, file.lastIndexOf('.')) + ".uml";
		val output = FILE_PREFIX + output_path;
		
		System.out.println("input " + input)
		System.out.println("output " + output)
		
//		
//		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);		
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
//		val SysMLProfileUri = URI.createURI("models/SysML.profile.uml")	
//		var uriMap = resourceSet.getURIConverter().getURIMap();		
//		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP),  SysMLProfileUri.appendSegment("libraries").appendSegment(""));
//		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), SysMLProfileUri.appendSegment("metamodels").appendSegment(""));
//		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP),   SysMLProfileUri.appendSegment("profiles").appendSegment(""));
//		
					
		val umlModel = createUMLModel

//		
//		val SysMLProfile = loadPackage(SysMLProfileUri) as Profile;		
//		umlModel.applyProfile(SysMLProfile)
//		
					
		umlModel.setName(MODEL_NAME)		
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE)
												
		try {
			Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("xml", new Subset0267ResourceFactoryImpl)			
			transformSubset267(umlModel, SUBSET_NAME_0267, input)			
			System.out.println("transform success (" + SUBSET_NAME_0267 + ")")
			save(umlModel, output);
			return output_path
		} catch (WrappedException e) {
			System.out.println("transform failure (" + SUBSET_NAME_0267 + ")")
		}
		
		try {
			Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("xml", new Subset0268ResourceFactoryImpl)
			transformSubset268(umlModel, SUBSET_NAME_0268, input)
			System.out.println("transform success (" + SUBSET_NAME_0268 + ")")
			save(umlModel, output);	
			return output_path 
		} catch (WrappedException e) {
			System.out.println("transform failure (" + SUBSET_NAME_0268 + ")")
		}
			
		return null;
	}
		
    def getDatadictionary(String file) {
    	var resourceSet = new ResourceSetImpl
		var uri = URI.createURI(file);
		var resource = resourceSet.getResource(uri, true);
		var model = resource.contents.get(0)
		return model;
	}
 
 	def transformSubset268(Model umlModel, String subset_name, String file) {		
		val dictionary = getDatadictionary(file) as DocumentRoot
				
		var primitive_pkg = umlModel.createNestedPackage(PRIMITIVE_PACKAGE_NAME)		
		generatedTypes.put("int",  			primitive_pkg.createOwnedPrimitiveType(PRIMITIVE_INT_TYPE_NAME))
		generatedTypes.put("real", 			primitive_pkg.createOwnedPrimitiveType(PRIMITIVE_REAL_TYPE_NAME))
		generatedTypes.put("enum", 			primitive_pkg.createOwnedPrimitiveType(PRIMITIVE_ENUM_TYPE_NAME))
		generatedTypes.put(PARCEL_TYPE_ID, 	primitive_pkg.createOwnedPrimitiveType(PARCEL_TYPE_NAME))
				
		var root_pkg = umlModel.createNestedPackage(subset_name)	
				
		var pkg = root_pkg.createNestedPackage(TRAIN_TO_TRACK_PACKAGE)		
		pkg.createPackets0268( dictionary.definitions.packets.trainToTrack.packet )
		
		pkg = root_pkg.createNestedPackage(TRACK_TO_TRAIN_PACKAGE)		
		pkg.createPackets0268( dictionary.definitions.packets.trackToTrain.packet )
	}
	
	def createPackets0268(Package pkg, EList<Subset0268.TPacket> packets) {
		for (v : packets) {
			var optional   	= 1
			var parcel_num  = 1
			var typeName   	= type_identifier(v.name)
			var typePrefix 	= identifier(v.name)
			var dataType   	= pkg.createDataType(typeName)
			if (isValid(v.description)) {
				dataType.addComment(v.description)
			}
			dataType.addComment(NUMBER_PREFIX + v.number.toString())
			dataType.addComment(TRANSMISSION_MEDIA_PREFIX + v.transmissionMedia.toString())
						
			var fmap = v.content.group
			var iter = fmap.valueListIterator
			while (iter.hasNext) {
				var elt = iter.next
				switch elt {
					Subset0268.TTlgVar : {
						val type = elt.type; 
						dataType.createAttribute(elt.name, generatedTypes.get(type), elt.comment)
					}
					Subset0268.OptionalPacketsType : {
						var type_id = type_identifier(typePrefix + optional.toString())
						val optional_datatype = pkg.createDataType(type_id)
						optional_datatype.addComment(OPTIONAL_PACKET_COMMENT)
						
						generatedTypes.put(type_id, optional_datatype)						
						elt.parcel.forEach[sub_elt, num |
							createParcel(optional_datatype, sub_elt, num + 1)
						]
					}
					Subset0268.ParcelType : {
						createParcel(dataType, elt, parcel_num)
						parcel_num = parcel_num + 1
					}
				}
			}
		}		
	}
	
	def createParcel(DataType type, ParcelType elt, int num) {
		var parcel = type.createAttribute(PARCEL_NAME_PREFIX + num, generatedTypes.get(PARCEL_TYPE_ID), elt.comment)
		parcel.addComment(NUMBER_PREFIX + elt.number)
		return parcel
	}
	
	def transformSubset267(Model umlModel, String subset_name, String file) {
		val dictionary = getDatadictionary(file) as Subset0267.DocumentRoot		
		var subsetPkg = umlModel.createNestedPackage(subset_name)
		
		// Transform variables to primitive type or enumerated type
		// The decision depends on the "Special" field in "Specs
		var variablesPkg = subsetPkg.createNestedPackage(VARIABLES_PACKAGE)		
		for (v : dictionary.definitions.varDef.variable) {
			
			// If special is empty or less than 1 we have a primitive type
			if (v.specs.special.empty || v.specs.special.length <= 1) {
				var primitiveType = variablesPkg.createOwnedPrimitiveType(type_identifier(v.name))
				if (isValid(v.detailedName)) {					
					primitiveType.addComment(DETAILED_NAME_PREFIX + v.detailedName)					
				}		
				if (isValid(v.description)) {
					primitiveType.addComment(DESCRIPTION_PREFIX + v.description)					
				}		
				
				var specs = v.specs; 
				primitiveType.addComment(LENGTH_PREFIX + specs.length.toString())					
						
				if (specs.setMinVal) {
					primitiveType.addComment(MIN_VAL_PREFIX + specs.minVal.toString())					
				}		
				if (specs.setMaxVal) {
					primitiveType.addComment(MAX_VAL_PREFIX + specs.maxVal.toString())					
				}
				if (specs.setFormula) {
					primitiveType.addComment(FORMULA_PREFIX + specs.formula.toString())					
				}
		
				generatedTypes.put(primitiveType.name, primitiveType)				
				
			} else {
				var enumeratedType = variablesPkg.createOwnedEnumeration(type_identifier(v.name))
				if (isValid(v.detailedName)) {
					enumeratedType.addComment(DETAILED_NAME_PREFIX + v.detailedName)					
				}		
				if (isValid(v.description)) {
					enumeratedType.addComment(DESCRIPTION_PREFIX + v.description)					
				}				
				generatedTypes.put(enumeratedType.name, enumeratedType)
				
				for (s : v.specs.special) {
					if (s.description.isValidName) {
						var literal = enumeratedType.createOwnedLiteral(identifier(s.description))
						literal.addComment(DESCRIPTION_PREFIX + s.description)
						literal.addComment(VALUE_PREFIX + s.value.toString)
					}
				}
			}
		}
				
		var trainToTrackPkg = subsetPkg.createNestedPackage(TRAIN_TO_TRACK_PACKAGE)		
		trainToTrackPkg.createPackets0267( dictionary.definitions.packets.trainToTrack.packet )
		
		var trackToTrainPkg = subsetPkg.createNestedPackage(TRACK_TO_TRAIN_PACKAGE)		
		trackToTrainPkg.createPackets0267( dictionary.definitions.packets.trackToTrain.packet )		
	}
	
	def void createPackets0267(Package pkg, EList<Subset0267.TPacket> packets) {
		for (v : packets) {
			var typeName   = type_identifier(v.name)
			var typePrefix = identifier(v.name)
			var dataType = pkg.createDataType(typeName)
			if (isValid(v.description)) {
				dataType.addComment(v.description)
			}
			dataType.addComment(NUMBER_PREFIX + v.number.toString())
			dataType.addComment(TRANSMISSION_MEDIA_PREFIX + v.transmissionMedia.toString())
			
			pkg.createContent(dataType, v.content.group, typePrefix, null)
		}
	}
	
	def void createContent(Package pkg, DataType type, FeatureMap fmap, String prefix, String skip) {
		var dyn_cpt = 0
		var con_cpt = 0
		
		var iter = fmap.valueListIterator
		while (iter.hasNext) {
			var elt = iter.next
			switch elt {
			TTlgVar : {
				if (elt.name != skip) {
					var attr = type.createAttribute(identifier(elt.name), generatedTypes.get(type_identifier(elt.name)), elt.comment)
					attr.addComment(LENGTH_PREFIX + elt.length.toString())
				}					
			}
			TLoopDoWhile : {
				dyn_cpt = dyn_cpt + 1
				var loop_name = DYNAMIC_FIELD_PREFIX + dyn_cpt.toString()
				var loop_type_prefix = type_extend(prefix, loop_name)
				var loop_type_name   = type_identifier(loop_type_prefix)
				var loop_type = pkg.createLoop(loop_type_prefix, elt.group)
				generatedTypes.put(loop_type_name, loop_type)
				var attr = type.createOwnedAttribute(loop_name, loop_type)				
				attr.addComment(DYNAMIC_FIELD_HEADER_COMMENT)				
			}
			TLoopWhile : {
				dyn_cpt = dyn_cpt + 1				
				var loop_name = DYNAMIC_FIELD_PREFIX + dyn_cpt.toString()
				var loop_type_prefix = type_extend(prefix, loop_name)
				var loop_type_name   = type_identifier(loop_type_prefix)
				var loop_type = pkg.createLoop(loop_type_prefix, elt.group)
				generatedTypes.put(loop_type_name, loop_type)
				var attr = type.createOwnedAttribute(loop_name, loop_type)
				attr.addComment(DYNAMIC_FIELD_HEADER_COMMENT)
			}
			TConditional : {
				con_cpt = con_cpt + 1				
				var con_name = CONDITIONAL_FIELD_PREFIX + con_cpt.toString()
				var con_type_prefix = type_extend(prefix, con_name)
				var con_type_name   = type_identifier(con_type_prefix)
				var con_type = pkg.createDataType(con_type_name)
				con_type.addComment(CONDITONAL_FIELD_COMMENT)
				generatedTypes.put(con_type_name, type)
				var attr = type.createOwnedAttribute(con_name, con_type)
				attr.addComment(CONDITONAL_FIELD_COMMENT)
				attr.addComment(CONDITION_PREFIX + elt.condition.toString())
				for (evar : elt.variables) {
					pkg.createContent(con_type, evar.group, con_type_prefix, null)					
				}
			}
			}			
		}		
	}
	
	def createLoop(Package pkg, String loop_type_prefix, FeatureMap fmap) {
		var type_id = type_identifier(loop_type_prefix)
		var type    = pkg.createDataType(type_id)
				
		type.addComment(DYNAMIC_FIELD_HEADER_COMMENT)
		generatedTypes.put(type_id, type)		
		// find N_ITER
		var iter = fmap.valueListIterator
		var break = false
		while (iter.hasNext && !break) {
			var elt = iter.next
			switch elt {
				TTlgVar : {
					if (elt.name.startsWith("N_ITER")) {
						break = true
						var attr = type.createOwnedAttribute(elt.name, generatedTypes.get(type_identifier("N_ITER")))
						if (isValid(elt.comment)) {
							attr.addComment(elt.comment)
						}
						attr.addComment(LENGTH_PREFIX + elt.length.toString())
						// body
						var body_prefix = type_extend(loop_type_prefix, DYNAMIC_FIELD_BODY_NAME)
						var body_type_name = type_identifier(body_prefix)
						var body_type = pkg.createDataType(body_type_name)				
						body_type.addComment(DYNAMIC_FIELD_BODY_COMMENT)
						var body_attr = type.createOwnedAttribute(DYNAMIC_FIELD_BODY_NAME, body_type, 33, 33)
						body_attr.addComment(DYNAMIC_FIELD_BODY_COMMENT)
						generatedTypes.put(body_type_name, body_type)
						pkg.createContent(body_type, fmap, body_prefix, elt.name)
					}
				}
			}
		}
		return type		
	}
	
	def save(Model model, String output) {
		val resourceSet = new ResourceSetImpl()
		val res = resourceSet.createResource(URI.createURI(output))
		res.getContents().add(model)

		try {
			res.save(emptyMap);
		} catch (IOException e) {
			e.printStackTrace()
		}
	}	
	
	def static identifier(String str) {
		var tmp = str
		var opar = str.indexOf("(")	
		if ( opar != -1 ) {
			tmp = str.substring(0, opar)
		}
		return tmp.replaceAll("\\W", '_')
	}
	
	def static type_extend(String str1, String str2) {
		return str1 + '_' + str2
	}
	
	def static type_identifier(String str) {
		return identifier(str).replaceAll("\\W", '_') + '_t'
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
		if (comment != null) {
			attribute.addComment(comment)			
		}
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
	
	def static createUMLModel () {
		return UMLFactory.eINSTANCE.createModel
	}			
	
//	def static Profile getProfile(Package pack, String name) {              
// 		for (e : pack.allOwnedElements()) {
//			switch e {
//				Profile : {
//					if (e.getName() == name)
//						return e;
//				}
//			}			
//		}
//        return null;
//    }
//    
//    def Package loadPackage(URI uri) throws Exception {		
//		try {
//			var resource = resourceSet.getResource(uri, true);
//			return EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PACKAGE) as Package;
//        } catch (WrappedException we) {
//            println(we.getMessage())
//            System.exit(1)
//        }
//        return null
//    }    
// 
//	def static Stereotype getStereotype(Package pack, String name) 
//	{
// 		for (e : pack.allOwnedElements()) {
// 			switch e {
// 				Stereotype :
//					if (e.getName() == name) {
//						return e
//					}		
// 			}
//		}
//        return null;
//	}		
}