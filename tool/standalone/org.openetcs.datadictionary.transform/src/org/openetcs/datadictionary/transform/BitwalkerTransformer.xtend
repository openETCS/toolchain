package org.openetcs.datadictionary.transform

import Subset0267.DocumentRoot
import Subset0267.TConditional
import Subset0267.TLoopDoWhile
import Subset0267.TLoopWhile
import Subset0267.TPacket
import Subset0267.util.Subset0267ResourceFactoryImpl
import Subset0268.OptionalPacketsType
import Subset0268.ParcelType
import Subset0268.TTlgVar
import Subset0268.util.Subset0268ResourceFactoryImpl
import java.util.regex.Pattern
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.command.AbstractCommand
import org.eclipse.emf.common.util.BasicEMap
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.WrappedException
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.FeatureMap
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.papyrus.infra.core.resource.ModelSet
import org.eclipse.papyrus.sysml.util.SysmlResource
import org.eclipse.papyrus.uml.tools.utils.PackageUtil
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.MessageConsole
import org.eclipse.ui.console.MessageConsoleStream
import org.eclipse.uml2.uml.DataType
import org.eclipse.uml2.uml.InstanceSpecification
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Profile
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.resource.UMLResource

import static extension org.openetcs.datadictionary.transform.BitwalkerTransformer.*

class BitwalkerTransformer implements ITransformer {

	private static val SYSML_VALUE_TYPE_STEREOTYPE = "SysML::Blocks::ValueType"
	private static val SYSML_DIMENSION_STEREOTYPE = "SysML::Blocks::Dimension"
	private static val SYSML_UNIT_STEREOTYPE = "SysML::Blocks::Unit"

	// model strings
	private static val NUMBER_PREFIX = "Number = "
	private static val TRANSMISSION_MEDIA_PREFIX = "TransmissionMedia = "
	private static val DETAILED_NAME_PREFIX = "DetailedName = "
	private static val DESCRIPTION_PREFIX = "Description = "
	private static val LENGTH_PREFIX = "Length = "
	private static val MIN_VAL_PREFIX = "MinVal = "
	private static val MAX_VAL_PREFIX = "MaxVal = "
	private static val FORMULA_PREFIX = "Formula = "
	private static val VALUE_PREFIX = "Value = "

	private static val OPTIONAL_PACKET_COMMENT = "Optional packet"
	private static val PARCEL_NAME_PREFIX = "parcel_"

	private static val DYNAMIC_FIELD_HEADER_COMMENT = "Dynamic field header"
	private static val DYNAMIC_FIELD_BODY_COMMENT = "Dynamic field body"
	private static val DYNAMIC_FIELD_BODY_NAME = "body"
	private static val DYNAMIC_FIELD_PREFIX = "DStruct"

	private static val CONDITONAL_FIELD_COMMENT = "Conditional field"
	private static val CONDITION_PREFIX = "Condition = "
	private static val CONDITIONAL_FIELD_PREFIX = "CStruct"

	private static val PRIMITIVE_PACKAGE_NAME = "Primitives"
	private static val PARCEL_TYPE_NAME = "Parcel_t"
	private static val PRIMITIVE_INT_TYPE_NAME = "Integer"
	private static val PRIMITIVE_REAL_TYPE_NAME = "Real"
	private static val PRIMITIVE_ENUM_TYPE_NAME = "enum"

	private static val VARIABLES_PACKAGE = "Variables"
	private static val TRACK_TO_TRAIN_PACKAGE = "TrackToTrain"
	private static val TRAIN_TO_TRACK_PACKAGE = "TrainToTrack"
	private static val OPTIONAL_PACKET_ATTRIBUTE_SUFFIX = "_Opt_"

	private static var SUBSET_NAME_0267 = "Subset-026-7"
	private static var SUBSET_NAME_0268 = "Subset-026-8"

	// invalid names in enumerations
	private static var invalidNames = #[""] //"spare", "unknown", "not known", "not valid", "reserved", "not used"]

	// unit patterns
	private static var patternValueUnit = Pattern.compile(
		"^\\s*(?<value>(-?\\d(\\.\\d)*)+)\\s+(?<unit>(\\D(\\S+\\s*)*))$")
	private static var patternValueNoUnit = Pattern.compile("^\\s*(?<value>(-?\\d(\\.\\d)*)+)\\s*$")
	private static var unitCoerce = newHashMap('seconds' -> 's')

	// input files	
	private static val FILE_PREFIX = "file:///"
	private static String UML_FILE_EXTENSION = ".uml"

	// model generation
	private int mLogLevel;
	private var generatedTypes = new BasicEMap<String, Type>
	private var mUnitApplication = new BasicEMap<String, EObject>
	private ModelSet mModelSet
	private Model mModel
	private Package mUnitsPkg
	private Package mDimensionsPkg
	private Package mPrimitivePkg
	private val mKnownUnits = newHashMap()
	private val mKnownDimensions = newHashMap()

	// logging printing	
	private var String mConsoleName = "DataDictionary transform"
	private var MessageConsole mConsole = null;
	private var MessageConsoleStream mConsoleStream = null;

	/**
	 * Cleaning up the state.
	 */
	def clean() {
		generatedTypes = new BasicEMap<String, Type>
		mUnitApplication = new BasicEMap<String, EObject>
	}

	/**
	 * Run the transformation.
	 * 
	 * Creates a project containing a SysML model, then populates it with data from provided subset files.
	 * 
	 * @param projectName name of the project
	 * @param modelName	 name of the model
	 * @param files array of subset files
	 * @param monitor progress monitor
	 * @param log_level logging level to be used.
	 * @return true on success
	 */
	override boolean transform(String projectName, String modelName, String[] files, IProgressMonitor monitor,
		int log_level) {
		mLogLevel = log_level;
		clean()

		if (mConsole != null) {
			ConsolePlugin.getDefault().consoleManager.removeConsoles(#[mConsole])
		}

		mConsole = new MessageConsole(mConsoleName, null);
		mConsole.activate()
		ConsolePlugin.getDefault().consoleManager.addConsoles(#[mConsole])
		mConsoleStream = mConsole.newMessageStream()

		transformImpl(projectName, modelName, files, monitor)
		save(monitor)
		return true;
	}

	/**
	 * Run the transformation.
	 * 
	 * Creates a project containing a SysML model, then populates it with data from provided subset files.
	 * 
	 * @param projectName name of the project
	 * @param modelName	 name of the model
	 * @param files array of subset files
	 * @param monitor progress monitor
	 */
	def void transformImpl(String projectName, String modelName, String[] files, IProgressMonitor monitor) {
		val String baseURI = "platform:/resource/" + projectName + "/" + modelName

		val IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		val IProject project = root.getProject(projectName);
		try {
			project.create(monitor);
		} catch (CoreException e) {
		}
		project.open(monitor);

		mModelSet = PapyrusModelUtils.createNew(baseURI)
		val editingDomain = mModelSet.transactionalEditingDomain

		// create model
		val command = new AbstractCommand() {
			override prepare() { return true }

			override redo() { execute(); }

			override execute() {
				val uri = URI.createURI(baseURI.concat(UML_FILE_EXTENSION));
				val resource = mModelSet.getResource(uri, false);

				mModel = UMLFactory.eINSTANCE.createModel();
				mModel.setName(modelName);
				resource.getContents().add(mModel);

				val umlStdProfile = PackageUtil.loadPackage(URI.createURI(UMLResource.UML2_PROFILE_URI), mModelSet) as Profile;
				mModel.applyProfile(umlStdProfile);

				val sysml = PackageUtil.loadPackage(URI.createURI(SysmlResource.SYSML_PROFILE_URI), mModelSet) as Profile;
				if (sysml != null) {
					PackageUtil.applyProfile(mModel, sysml, true);
				}

				mUnitsPkg = mModel.createNestedPackage("Units");
				mDimensionsPkg = mModel.createNestedPackage("Dimensions");
				mPrimitivePkg = mModel.createNestedPackage(PRIMITIVE_PACKAGE_NAME)

				val distance = mDimensionsPkg.createOwnedDimension("distance")
				val duration = mDimensionsPkg.createOwnedDimension("duration")
				val acceleration = mDimensionsPkg.createOwnedDimension("acceleration")
				val velocity = mDimensionsPkg.createOwnedDimension("velocity")

				val m = mUnitsPkg.createOwnedUnit("m")
				val cm = mUnitsPkg.createOwnedUnit("cm")
				val km = mUnitsPkg.createOwnedUnit("km")
				val ms2 = mUnitsPkg.createOwnedUnit("m/s**2")
				val s = mUnitsPkg.createOwnedUnit("s")
				val days = mUnitsPkg.createOwnedUnit("days")
				val mh = mUnitsPkg.createOwnedUnit("m/h")
				val kmh = mUnitsPkg.createOwnedUnit("km/h")
				mUnitsPkg.createOwnedUnit("per mil")

				m.setDimension(distance)
				cm.setDimension(distance)
				km.setDimension(distance)
				ms2.setDimension(acceleration)
				s.setDimension(duration)
				days.setDimension(duration)
				mh.setDimension(velocity)
				kmh.setDimension(velocity)

				mPrimitivePkg.createImportedUMLPrimitiveTypeExt(PRIMITIVE_INT_TYPE_NAME)
				mPrimitivePkg.createImportedUMLPrimitiveTypeExt(PRIMITIVE_REAL_TYPE_NAME)

				mPrimitivePkg.createOwnedPrimitiveTypeExt(PRIMITIVE_ENUM_TYPE_NAME)
				mPrimitivePkg.createOwnedPrimitiveTypeExt(PARCEL_TYPE_NAME)
			}
		};
		editingDomain.commandStack.execute(command)

		for (file : files) {
			val input = FILE_PREFIX + file;
			val output_path = file.substring(0, file.lastIndexOf('.')) + ".uml";
			val output = FILE_PREFIX + output_path;

			Verb("input " + input)
			Verb("output " + output)

			var transformed = false;
			try {
				Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("xml", new Subset0267ResourceFactoryImpl)
				transformSubset267(SUBSET_NAME_0267, input)
				Info("transform success (" + SUBSET_NAME_0267 + ")")
				transformed = true;
			} catch (WrappedException e) {
			}

			try {
				Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("xml", new Subset0268ResourceFactoryImpl)
				transformSubset268(SUBSET_NAME_0268, input)
				System.out.println("transform success (" + SUBSET_NAME_0268 + ")")
				transformed = true;
			} catch (WrappedException e) {
			}

			if (!transformed) {
				Warn("Unknown subset " + file)
			}
		}
	}

	/**
	 * Imports a UML primitive type into the package.
	 * 
	 * @param pkg target package
	 * @param name primitive type name
	 * @return imported type
	 */
	def createImportedUMLPrimitiveTypeExt(Package pkg, String name) {
		if (generatedTypes.contains(name))
			throw new RuntimeException
		val type = importUMLPrimitiveType(name)
		pkg.createElementImport(type)
		generatedTypes.put(name, type)
		return type
	}

	/**
	 * Creates an owned primitive type.
	 * 
	 * @param pkg target package
	 * @param name primitive type name
	 * @return created
	 */
	def createOwnedPrimitiveTypeExt(Package pkg, String name) {
		if (generatedTypes.contains(name))
			throw new RuntimeException
		val type = pkg.createOwnedPrimitiveType(name)
		generatedTypes.put(name, type)
		return type
	}

	/**
	 * Set a dimension for a ValueType.
	 * 
	 * @param value_type target type
	 * @param dimension dimension to be set
	 */
	def setDimension(InstanceSpecification value_type, Object dimension) {
		value_type.setValue(value_type.getAppliedStereotype(SYSML_UNIT_STEREOTYPE), "dimension", dimension)
	}

	/**
	 * Create an owned Unit block.
	 * 
	 * The instance object is an InstanceSpecification, this method also updates mUnitApplication and mKnownUnits maps.
	 * 
	 * @param pkg target package
	 * @param name unit name
	 * @return unit stereotype application
	 */
	def createOwnedUnit(Package pkg, String name) {
		val instanceSpec = UMLFactory.eINSTANCE.createInstanceSpecification();
		instanceSpec.name = name

		val editingDomain = mModelSet.transactionalEditingDomain

		editingDomain.commandStack.execute(
			AddCommand.create(editingDomain, pkg, UMLPackage.PACKAGE__PACKAGED_ELEMENT, instanceSpec))

		val stereotype = instanceSpec.getApplicableStereotype(SYSML_UNIT_STEREOTYPE);
		val application = instanceSpec.applyStereotype(stereotype)

		mUnitApplication.put(name, application)
		mKnownUnits.put(name, instanceSpec);
		return instanceSpec
	}

	/**
	 * Create an owned Dimension block.
	 * 
	 * The instance object is an InstanceSpecification, this method also updates mKnownDimensions map.
	 * 
	 * @param pkg target package
	 * @param name dimension name
	 * @return dimension stereotype application	  
	 */
	def createOwnedDimension(Package pkg, String name) {
		val instanceSpec = UMLFactory.eINSTANCE.createInstanceSpecification();
		instanceSpec.name = name

		val editingDomain = mModelSet.transactionalEditingDomain

		editingDomain.commandStack.execute(
			AddCommand.create(editingDomain, pkg, UMLPackage.PACKAGE__PACKAGED_ELEMENT, instanceSpec))

		val stereotype = instanceSpec.getApplicableStereotype(SYSML_DIMENSION_STEREOTYPE);
		val application = instanceSpec.applyStereotype(stereotype)

		mKnownDimensions.put(name, instanceSpec);
		return application
	}

	/**
	 * Get the data dictionary from bitwalker file.
	 * 
	 * @param file filename
	 * @return model object
	 */
	def getDatadictionary(String file) {
		var resourceSet = new ResourceSetImpl
		var uri = URI.createURI(file);
		var resource = resourceSet.getResource(uri, true);
		var model = resource.contents.get(0)
		return model;
	}

	/**
	 * Subset 268 transformation entry point.
	 * 
	 * @param subset_name subset name that will be used as package name.
	 * @param file subset file to load and transform.
	 */
	def transformSubset268(String subset_name, String file) {
		val dictionary = getDatadictionary(file) as Subset0268.DocumentRoot

		val command = new AbstractCommand() {
			override prepare() { return true }

			override redo() { execute(); }

			override execute() {
				var root_pkg = mModel.createNestedPackage(subset_name)

				var pkg = root_pkg.createNestedPackage(TRAIN_TO_TRACK_PACKAGE)
				pkg.createPackets0268(dictionary.definitions.packets.trainToTrack.packet)

				pkg = root_pkg.createNestedPackage(TRACK_TO_TRAIN_PACKAGE)
				pkg.createPackets0268(dictionary.definitions.packets.trackToTrain.packet)
			}
		}
		mModelSet.transactionalEditingDomain.commandStack.execute(command)
	}

	/**
	 * Subset 268 auxiliary function that populates the package with packets.
	 * 
	 * @param pkg target package.
	 * @param packets packets to transform. 
	 */
	def createPackets0268(Package pkg, EList<Subset0268.TPacket> packets) {
		for (v : packets) {
			var optional = 1
			var parcel_num = 1
			var typeName = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier(v.name)
			var typePrefix = identifier(v.name)
			var dataType = pkg.createDataType(typeName)
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
					TTlgVar: {
						val type = elt.type;
						val String type_name = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier(type)
						val generated_type = generatedTypes.get(type_name)
						if (generated_type == null) {
							Warn("Generated type null for " + v.name + " with type " + type)
						}
						dataType.createAttribute(elt.name, generated_type, elt.comment)
					}
					OptionalPacketsType: {
						val name = typePrefix + optionalPacketAttributeSuffix(optional)
						var type_id = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier(name)

						val optional_datatype = pkg.createDataType(type_id)
						optional_datatype.addComment(OPTIONAL_PACKET_COMMENT)

						dataType.createAttribute(name, optional_datatype, OPTIONAL_PACKET_COMMENT)

						generatedTypes.put(type_id, optional_datatype)
						elt.parcel.forEach [ sub_elt, num |
							createParcel(optional_datatype, sub_elt, num + 1)
						]
						optional += 1
					}
					ParcelType: {
						createParcel(dataType, elt, parcel_num)
						parcel_num = parcel_num + 1
					}
				}
			}
		}
	}

	/**
	 * Create a parcel type.
	 * 
	 * @param type owner data type.
	 * @param elt parcel type Bitwalker node.
	 * @param num parcel index in data type.
	 * @return new parcel type. 
	 */
	def createParcel(DataType type, ParcelType elt, int num) {
		var parcel = type.createAttribute(PARCEL_NAME_PREFIX + num, generatedTypes.get(PARCEL_TYPE_NAME), elt.comment)
		parcel.addComment(NUMBER_PREFIX + elt.number)
		return parcel
	}

	/**
	 * Suffix for packet attributes.
	 * 
	 * @param id index in data type.
	 * @return suffix String.
	 */
	def optionalPacketAttributeSuffix(int id) {
		return OPTIONAL_PACKET_ATTRIBUTE_SUFFIX + id.toString();
	}

	/**
	 * Subset 267 transformation entry point.
	 * 
	 * @param subset_name subset name that will be used as package name.
	 * @param file subset file to load and transform.
	 */
	def transformSubset267(String subset_name, String inputFile) {
		val dictionary = getDatadictionary(inputFile) as DocumentRoot

		val command = new AbstractCommand() {
			override prepare() { return true }

			override redo() { execute(); }

			override execute() {
				var subsetPkg = mModel.createNestedPackage(subset_name)

				// Transform variables to primitive type or enumerated type
				// The decision depends on the "Special" field in "Specs
				var variablesPkg = subsetPkg.createNestedPackage(VARIABLES_PACKAGE)
				for (v : dictionary.definitions.varDef.variable) {

					// If special is empty or less than 1 we have a primitive type
					if (v.specs.special.empty || v.specs.special.length <= 1) {

						var primitiveType = variablesPkg.createDataType(typeIdentifier(v.name))
						val valueTypeStereotype = primitiveType.getApplicableStereotype(SYSML_VALUE_TYPE_STEREOTYPE)
						primitiveType.applyStereotype(valueTypeStereotype)

						if (isValid(v.detailedName)) {
							primitiveType.addComment(DETAILED_NAME_PREFIX + v.detailedName)
						}
						if (isValid(v.description)) {
							primitiveType.addComment(DESCRIPTION_PREFIX + v.description)
						}

						val specs = v.specs;
						primitiveType.addComment(LENGTH_PREFIX + specs.length.toString())

						var String min_val = null
						var String max_val = null
						var String min_unit = null
						var String max_unit = null

						// extract min val
						if (specs.setMinVal) {
							val value_unit = extractValueUnit(specs.minVal.toString());
							min_val = value_unit.value
							min_unit = value_unit.key
							if (min_unit != null) {
								Info(v.name + " min val has unit " + min_unit + " ( " + specs.minVal.toString() + " )")
							}
						}

						// extract max val
						if (specs.setMaxVal) {
							val value_unit = extractValueUnit(specs.maxVal.toString());
							max_val = value_unit.value
							max_unit = value_unit.key
							if (max_unit != null) {
								Info(v.name + " max val has unit " + max_unit + " ( " + specs.maxVal.toString() + " )")
							}
						}

						// inconsistency check
						if (min_unit != max_unit) {
							if (min_val != null && min_val.isZero()) {
								Warn(
									"inconsistency in units for variable " + v.name + " casting 0 form " + min_unit +
										" to " + max_unit)
								min_unit = max_unit
							} else {
								Warn(
									"inconsistency in units for variable " + v.name + "( " + min_unit + " and " +
										max_unit + " )")
							}
						}

						// notify if no unit found
						if (min_val != null && min_unit == null) {
							Warn(v.name + " min val has no unit ( " + specs.minVal.toString() + " )")
						}
						if (max_val != null && max_unit == null) {
							Warn(v.name + " max val has no unit ( " + specs.maxVal.toString() + " )")
						}

						if (min_val != null) {
							if (min_unit != null) {
								primitiveType.addComment(MIN_VAL_PREFIX + min_val.toString() + " " + min_unit.toString())
							} else {
								primitiveType.addComment(MIN_VAL_PREFIX + specs.minVal.toString())
							}
						}

						if (max_val != null) {
							if (max_unit != null) {
								primitiveType.addComment(MAX_VAL_PREFIX + max_val.toString() + " " + max_unit.toString())
							} else {
								primitiveType.addComment(MAX_VAL_PREFIX + specs.maxVal.toString())
							}
						}

						if (max_unit != null) {
							primitiveType.setValueTypeUnit(max_unit)
						}

						if (specs.setFormula) {
							primitiveType.addComment(FORMULA_PREFIX + specs.formula.toString())
						}

						generatedTypes.put(primitiveType.name, primitiveType)

					} else {
						var enumeratedType = variablesPkg.createOwnedEnumeration(typeIdentifier(v.name))
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
				trainToTrackPkg.createPackets0267(dictionary.definitions.packets.trainToTrack.packet)

				var trackToTrainPkg = subsetPkg.createNestedPackage(TRACK_TO_TRAIN_PACKAGE)
				trackToTrainPkg.createPackets0267(dictionary.definitions.packets.trackToTrain.packet)
			}
		}
		mModelSet.transactionalEditingDomain.commandStack.execute(command);
	}

	/**
	 * Set the unit of a value type.
	 * 
	 * @param type the data type.
	 * @param unit name of the unit. 
	 */
	def setValueTypeUnit(DataType type, String unit) {
		type.setValue(type.getAppliedStereotype(SYSML_VALUE_TYPE_STEREOTYPE), "unit", mUnitApplication.get(unit));

	}

	/**
	 * String utility function that extracts the unit.
	 * 
	 * Uses patternValueUnit and patternValueNoUnit patterns for parsing.
	 * 
	 * @param string string to be parsed.
	 * @return a pair unit -> value.
	 */
	def extractValueUnit(String string) {
		var String value = null
		var String unit = null

		var matcher = patternValueUnit.matcher(string)
		if (matcher.matches()) {
			value = matcher.group("value")
			unit = matcher.group("unit")
			if (!mKnownUnits.containsKey(unit)) {
				val unitNew = unitCoerce.get(unit);
				if (unitNew != null) {
					Info("coercion from unit " + unit + " to unit " + unitNew)
					unit = unitNew
				} else {
					Warn("unknown unit " + unit)
				}
			}
		} else {
			matcher = patternValueNoUnit.matcher(string)
			if (matcher.matches()) {
				value = matcher.group("value")
			}
		}
		return (unit -> value)
	}

	/**
	 * Subset 267 auxiliary function that populates the package with packets.
	 * 
	 * @param pkg target package.
	 * @param packets packets to transform. 
	 */
	def void createPackets0267(Package pkg, EList<TPacket> packets) {
		for (v : packets) {
			var typeName = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier(v.name)
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

	/**
	 * Subset 267 auxiliary function that populates a DataType with its content.
	 * 
	 * @param pkg owner package, may be used to create auxiliary blocks.
	 * @param type data type
	 * @param fmap Bitwalker node feature map.
	 * @param prefix prefix used for auxiliary types.
	 * @param skip skip this element name.
	 */
	def void createContent(Package pkg, DataType type, FeatureMap fmap, String prefix, String skip) {
		var dyn_cpt = 0
		var con_cpt = 0

		var iter = fmap.valueListIterator
		while (iter.hasNext) {
			var elt = iter.next
			switch elt {
				TTlgVar: {
					if (elt.name != skip) {
						val name = escapeString(elt.name)
						var attr = type.createAttribute(identifier(name),
							generatedTypes.get(org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier(name)), elt.comment)
						attr.addComment(LENGTH_PREFIX + elt.length.toString())
					}
				}
				TLoopDoWhile: {
					dyn_cpt = dyn_cpt + 1
					var loop_name = DYNAMIC_FIELD_PREFIX + dyn_cpt.toString()
					var loop_type_prefix = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeConcat(prefix, loop_name)
					var loop_type_name = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier(loop_type_prefix)
					var loop_type = pkg.createLoop(loop_type_prefix, elt.group)
					generatedTypes.put(loop_type_name, loop_type)
					var attr = type.createOwnedAttribute(loop_name, loop_type)
					attr.addComment(DYNAMIC_FIELD_HEADER_COMMENT)
				}
				TLoopWhile: {
					dyn_cpt = dyn_cpt + 1
					var loop_name = DYNAMIC_FIELD_PREFIX + dyn_cpt.toString()
					var loop_type_prefix = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeConcat(prefix, loop_name)
					var loop_type_name = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier(loop_type_prefix)
					var loop_type = pkg.createLoop(loop_type_prefix, elt.group)
					generatedTypes.put(loop_type_name, loop_type)
					var attr = type.createOwnedAttribute(loop_name, loop_type)
					attr.addComment(DYNAMIC_FIELD_HEADER_COMMENT)
				}
				TConditional: {
					con_cpt = con_cpt + 1
					var con_name = CONDITIONAL_FIELD_PREFIX + con_cpt.toString()
					var con_type_prefix = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeConcat(prefix, con_name)
					var con_type_name = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier(con_type_prefix)
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

	/**
	 * String utility function that removes braces and parentheses.
	 * 
	 * @param str string to be escaped.
	 * @return escaped string. 
	 */
	def escapeString(String str) {
		return str.replaceAll("[\\(\\)]", "");
	}

	/**
	 * Subset 267 auxiliary function that creates Loops.
	 * 
	 * @param pkg owner package used to create auxiliary types.
	 * @param loop_type_prefix loop prefix.
	 * @param fmap loop feature map.
	 * @return root data type for the loop.
	 */
	def createLoop(Package pkg, String loop_type_prefix, FeatureMap fmap) {
		var type_id = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier(loop_type_prefix)
		var type = pkg.createDataType(type_id)

		type.addComment(DYNAMIC_FIELD_HEADER_COMMENT)
		generatedTypes.put(type_id, type)

		// find N_ITER
		var iter = fmap.valueListIterator
		var break = false
		while (iter.hasNext && !break) {
			var elt = iter.next
			switch elt {
				TTlgVar: {
					if (elt.name.startsWith("N_ITER")) {
						break = true
						var attr = type.createOwnedAttribute(elt.name, generatedTypes.get(org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier("N_ITER")))
						if (isValid(elt.comment)) {
							attr.addComment(elt.comment)
						}
						attr.addComment(LENGTH_PREFIX + elt.length.toString())

						// body
						var body_prefix = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeConcat(loop_type_prefix, DYNAMIC_FIELD_BODY_NAME)
						var body_type_name = org.openetcs.datadictionary.transform.BitwalkerTransformer.typeIdentifier(body_prefix)
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

	/**
	 * Save the model.
	 * 
	 * @monitor progress monitor.
	 */
	def save(IProgressMonitor monitor) {

		//var wb = PlatformUI.getWorkbench();
		//var ps = wb.getProgressService();
		//ps.busyCursorWhile( [ IProgressMonitor monitor |
		mModelSet.save(monitor);

	//])
	}

	/** 
	 * String utility function that returns an identifier.
	 * 
	 * @param str string to be transformed.
	 * @return identifier string.
	 */
	def static identifier(String str) {
		var tmp = str
		var opar = str.indexOf("(")
		if (opar != -1) {
			tmp = str.substring(0, opar)
		}
		return tmp.replaceAll("\\W", '_')
	}

	/** 
	 * String utility function that concatenates two types.
	 * 
	 * @param str1 first string.
	 * @param str2 second string.
	 * @return concatenation string.
	 */	
	def static typeConcat(String str1, String str2) {
		return str1 + '_' + str2
	}

	/**
	 * String utility function that creates a type identifier.
	 * 
	 * @param str type string to be translated.
	 * @return type identifier string.
	 */
	def static typeIdentifier(String str) {
		switch str {
			case "int": return PRIMITIVE_INT_TYPE_NAME
			case "real": return PRIMITIVE_REAL_TYPE_NAME
			case "enum": return PRIMITIVE_ENUM_TYPE_NAME
			default: return identifier(str).replaceAll("\\W", '_') + '_t'
		}
	}

	/**
	 * String utility function that checks if a name is valid (uses invalidNames list).
	 * 
	 * @param str string to be checked
	 * @return true if valid, false otherwise.
	 */
	def static boolean isValidName(String str) {
		for (i : invalidNames) {
			if (str.equalsIgnoreCase(i)) {
				return false
			}
		}
		return true
	}

	/**
	 * String utility function that checks if a string is valid (not null nor empty).
	 * 
	 * @param str string to be checked.
	 * @return true if valid, false otherwise. 
	 */
	def static isValid(String str) {
		return (str != null) && (str != "")
	}

	/**
	 * DataType extension function that creates a commented attribute.
	 * 
	 * @param dataType owner data type.
	 * @param name attribute name.
	 * @param type attribute type.
	 * @param comment comment to be attached (attached if is valid).
	 * @return created attribute. 
	 */
	def static createAttribute(DataType dataType, String name, Type type, String comment) {
		var attribute = dataType.createOwnedAttribute(name, type)
		if (comment != null) {
			attribute.addComment(comment)
		}
		return attribute
	}

	/**
	 * Package extension function that creates a commented enumeration type.
	 * 
	 * @param pkg owner package.
	 * @param name enumeration name.
	 * @param comment comment to be attached.
	 * @return created enumeration type. 
	 */
	def static createEnumeratedType(Package pkg, String name, String comment) {
		var enumeratedType = pkg.createOwnedEnumeration(name)
		enumeratedType.addComment(comment)

		return enumeratedType
	}

	/**
	 * Package extension function that creates a commented primitive type.
	 * 
	 * @param pkg owner package.
	 * @param name primitive type name.
	 * @param comment comment to be attached.
	 * @return created primitive type.
	 */
	def static createPrimitiveType(Package pkg, String name, String comment) {
		var primitiveType = pkg.createOwnedPrimitiveType(name)
		primitiveType.addComment(comment)
		return primitiveType
	}

	/**
	 * Package extension function that creates a data type.
	 * 
	 * @param pkg owner package.
	 * @param name data type name. 
	 * @return created data type.
	 */
	def static createDataType(Package pkg, String name) {
		return pkg.createPackagedElement(name, UMLPackage.eINSTANCE.getDataType()) as DataType
	}

	/**
	 * NamedElement extension function that adds a comment.
	 * 
	 * @param element owner named element.
	 * @param comment comment to be added.
	 */
	def static addComment(NamedElement element, String comment) {
		if (comment != null) {
			var elementComment = element.createOwnedComment
			elementComment.setBody(comment)
			elementComment.annotatedElements.add(element)
		}
	}

	/** String utility function that checks if a string represents Zero.
	 * 
	 * @param s string to be tested.
	 * @return true if 0 or 0.0, false otherwise.
	 */
	def static isZero(String str) {
		if (str.contains('.')) {
			return Float.valueOf(str).floatValue() == 0.0;
		} else {
			return Integer.valueOf(str).longValue() == 0;
		}
	}

	/**
	 * Import a UML primitive type.
	 * 
	 * @param name primitive type name.
	 * @return imported primitive type.
	 */
	def importUMLPrimitiveType(String name) {		
		var Package umlLibrary = null;
		val uri = URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI)
		try {
			val Resource resource = mModelSet.getResource(uri, true);
			umlLibrary = EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PACKAGE) as Package;
		} catch (WrappedException we) {
		}
		if (umlLibrary == null)
			return null;
		val primitiveType = umlLibrary.getOwnedType(name);
		return primitiveType;
	}

	/**
	 * Write a log message based on a logging level.
	 * 
	 * If the current logging level is above level then prints prefix + message on console stream.
	 * 
	 * @param log prefix to be used.
	 * @param level logging level.
	 */
	def Log(String prefix, String message, int level) {
		if (mLogLevel >= level) {
			mConsoleStream.println(prefix + " " + message);
		}
	}

	/**
	 * Log an error message.
	 * 
	 * @param message message to log.
	 */
	def Error(String message) { Log("[E]", message, LOG_ERROR) }

	/**
	 * Log an warning message.
	 * 
	 * @param message message to log.
	 */
	def Warn(String message) { Log("[W]", message, LOG_WARN) }

	/**
	 * Log an info message.
	 * 
	 * @param message message to log.
	 */
	def Info(String message) { Log("[I]", message, LOG_INFO) }

	/**
	 * Log a verbose message.
	 * 
	 * @param message message to log.
	 */
	def Verb(String message) { Log("[V]", message, LOG_VERBOSE) }
}
