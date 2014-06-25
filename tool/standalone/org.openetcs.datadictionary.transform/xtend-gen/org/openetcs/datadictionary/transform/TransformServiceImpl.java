package org.openetcs.datadictionary.transform;

import Subset0267.SpecialType;
import Subset0267.SpecsType;
import Subset0267.TConditional;
import Subset0267.TFormula;
import Subset0267.TIDNumber;
import Subset0267.TLength;
import Subset0267.TLoopDoWhile;
import Subset0267.TLoopWhile;
import Subset0267.TMaxVal;
import Subset0267.TMinVal;
import Subset0267.TValue;
import Subset0267.TVarLen;
import Subset0267.TVardefVar;
import Subset0267.TVariable;
import Subset0267.TVariables;
import Subset0267.util.Subset0267ResourceFactoryImpl;
import Subset0268.DocumentRoot;
import Subset0268.OptionalPacketsType;
import Subset0268.ParcelType;
import Subset0268.TContent;
import Subset0268.TDefinitions;
import Subset0268.TPacket;
import Subset0268.TPackets;
import Subset0268.TTlgVar;
import Subset0268.TTrackToTrain;
import Subset0268.TTrainToTrack;
import Subset0268.TTransmissionMedia;
import Subset0268.util.Subset0268ResourceFactoryImpl;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.ValueListIterator;
import org.eclipse.papyrus.sysml.SysmlPackage;
import org.eclipse.papyrus.sysml.blocks.BlocksPackage;
import org.eclipse.papyrus.sysml.util.SysmlResource;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPackage.Literals;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource.Factory;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.openetcs.datadictionary.transform.ITransformService;

@SuppressWarnings("all")
public class TransformServiceImpl implements ITransformService {
  private final static String NUMBER_PREFIX = "Number = ";
  
  private final static String TRANSMISSION_MEDIA_PREFIX = "TransmissionMedia = ";
  
  private final static String DETAILED_NAME_PREFIX = "DetailedName = ";
  
  private final static String DESCRIPTION_PREFIX = "Description = ";
  
  private final static String LENGTH_PREFIX = "Length = ";
  
  private final static String MIN_VAL_PREFIX = "MinVal = ";
  
  private final static String MAX_VAL_PREFIX = "MaxVal = ";
  
  private final static String FORMULA_PREFIX = "Formula = ";
  
  private final static String VALUE_PREFIX = "Value = ";
  
  private final static String OPTIONAL_PACKET_COMMENT = "Optional packet";
  
  private final static String PARCEL_NAME_PREFIX = "parcel_";
  
  private final static String DYNAMIC_FIELD_HEADER_COMMENT = "Dynamic field header";
  
  private final static String DYNAMIC_FIELD_BODY_COMMENT = "Dynamic field body";
  
  private final static String DYNAMIC_FIELD_BODY_NAME = "body";
  
  private final static String DYNAMIC_FIELD_PREFIX = "DStruct";
  
  private final static String CONDITONAL_FIELD_COMMENT = "Conditional field";
  
  private final static String CONDITION_PREFIX = "Condition = ";
  
  private final static String CONDITIONAL_FIELD_PREFIX = "CStruct";
  
  private final static String PRIMITIVE_PACKAGE_NAME = "__primitive__";
  
  private final static String PARCEL_TYPE_ID = "PARCEL";
  
  private final static String PARCEL_TYPE_NAME = "Parcel_t";
  
  private final static String PRIMITIVE_INT_TYPE_NAME = "int";
  
  private final static String PRIMITIVE_REAL_TYPE_NAME = "real";
  
  private final static String PRIMITIVE_ENUM_TYPE_NAME = "enum";
  
  private final static String VARIABLES_PACKAGE = "Variables";
  
  private final static String TRACK_TO_TRAIN_PACKAGE = "TrackToTrain";
  
  private final static String TRAIN_TO_TRACK_PACKAGE = "TrainToTrack";
  
  private final static String MODEL_NAME = "DataDictionary";
  
  private static String SUBSET_NAME_0267 = "Subset-026-7";
  
  private static String SUBSET_NAME_0268 = "Subset-026-8";
  
  private static List<String> invalidNames = Collections.<String>unmodifiableList(Lists.<String>newArrayList(""));
  
  private final static String FILE_PREFIX = "file:///";
  
  private BasicEMap<String,Type> generatedTypes = new Function0<BasicEMap<String,Type>>() {
    public BasicEMap<String,Type> apply() {
      BasicEMap<String,Type> _basicEMap = new BasicEMap<String, Type>();
      return _basicEMap;
    }
  }.apply();
  
  public BasicEMap<String,Type> clean() {
    BasicEMap<String,Type> _basicEMap = new BasicEMap<String, Type>();
    BasicEMap<String,Type> _generatedTypes = this.generatedTypes = _basicEMap;
    return _generatedTypes;
  }
  
  public String transform(final String file) {
    String outFile = this.transformImpl(file);
    this.clean();
    return outFile;
  }
  
  private static Stereotype gstereotype = null;
  
  private static Stereotype gdatatype = null;
  
  private static Profile SysMLProfile;
  
  private static Profile BlocksProfile;
  
  public String transformImpl(final String file) {
    final String input = (TransformServiceImpl.FILE_PREFIX + file);
    int _lastIndexOf = file.lastIndexOf(".");
    String _substring = file.substring(0, _lastIndexOf);
    final String output_path = (_substring + ".uml");
    final String output = (TransformServiceImpl.FILE_PREFIX + output_path);
    String _plus = ("input " + input);
    System.out.println(_plus);
    String _plus_1 = ("output " + output);
    System.out.println(_plus_1);
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSetImpl resourceSet = _resourceSetImpl;
    URIConverter _uRIConverter = resourceSet.getURIConverter();
    Map<URI,URI> uriMap = _uRIConverter.getURIMap();
    URI SysmlProfileUri = URI.createURI(SysmlResource.SYSML_PROFILE_URI);
    Registry _packageRegistry = resourceSet.getPackageRegistry();
    _packageRegistry.put(SysmlPackage.eNS_URI, SysmlPackage.eINSTANCE);
    Registry _packageRegistry_1 = resourceSet.getPackageRegistry();
    _packageRegistry_1.put(BlocksPackage.eNS_URI, BlocksPackage.eINSTANCE);
    org.eclipse.emf.ecore.resource.Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
    Map<String,Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
    _extensionToFactoryMap.put(UMLResource.FILE_EXTENSION, 
      Factory.INSTANCE);
    URI _createURI = URI.createURI(UMLResource.LIBRARIES_PATHMAP);
    URI _createURI_1 = URI.createURI(SysmlResource.LIBRARIES_PATHMAP);
    uriMap.put(_createURI, _createURI_1);
    URI _createURI_2 = URI.createURI(UMLResource.PROFILES_PATHMAP);
    URI _createURI_3 = URI.createURI(SysmlResource.PROFILES_PATHMAP);
    uriMap.put(_createURI_2, _createURI_3);
    Profile _load = UMLUtil.<Profile>load(resourceSet, SysmlProfileUri, Literals.PROFILE);
    TransformServiceImpl.SysMLProfile = _load;
    Stereotype _stereotype = TransformServiceImpl.getStereotype(TransformServiceImpl.SysMLProfile, "ValueType");
    TransformServiceImpl.gstereotype = _stereotype;
    String _plus_2 = ("ValueType Stereotype" + TransformServiceImpl.gstereotype);
    System.out.println(_plus_2);
    final Model umlModel = TransformServiceImpl.createUMLModel();
    umlModel.applyProfile(TransformServiceImpl.SysMLProfile);
    umlModel.setName(TransformServiceImpl.MODEL_NAME);
    Map<String,Object> _extensionToFactoryMap_1 = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap_1.put(UMLResource.FILE_EXTENSION, 
      Factory.INSTANCE);
    try {
      Map<String,Object> _extensionToFactoryMap_2 = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      Subset0267ResourceFactoryImpl _subset0267ResourceFactoryImpl = new Subset0267ResourceFactoryImpl();
      _extensionToFactoryMap_2.put("xml", _subset0267ResourceFactoryImpl);
      this.transformSubset267(umlModel, TransformServiceImpl.SUBSET_NAME_0267, input);
      String _plus_3 = ("transform success (" + TransformServiceImpl.SUBSET_NAME_0267);
      String _plus_4 = (_plus_3 + ")");
      System.out.println(_plus_4);
      this.save(umlModel, output);
      return output_path;
    } catch (final Throwable _t) {
      if (_t instanceof WrappedException) {
        final WrappedException e = (WrappedException)_t;
        String _plus_5 = ("transform failure (" + TransformServiceImpl.SUBSET_NAME_0267);
        String _plus_6 = (_plus_5 + ")");
        System.out.println(_plus_6);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    try {
      Map<String,Object> _extensionToFactoryMap_3 = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      Subset0268ResourceFactoryImpl _subset0268ResourceFactoryImpl = new Subset0268ResourceFactoryImpl();
      _extensionToFactoryMap_3.put("xml", _subset0268ResourceFactoryImpl);
      this.transformSubset268(umlModel, TransformServiceImpl.SUBSET_NAME_0268, input);
      String _plus_7 = ("transform success (" + TransformServiceImpl.SUBSET_NAME_0268);
      String _plus_8 = (_plus_7 + ")");
      System.out.println(_plus_8);
      this.save(umlModel, output);
      return output_path;
    } catch (final Throwable _t_1) {
      if (_t_1 instanceof WrappedException) {
        final WrappedException e_1 = (WrappedException)_t_1;
        String _plus_9 = ("transform failure (" + TransformServiceImpl.SUBSET_NAME_0268);
        String _plus_10 = (_plus_9 + ")");
        System.out.println(_plus_10);
      } else {
        throw Exceptions.sneakyThrow(_t_1);
      }
    }
    return null;
  }
  
  public EObject getDatadictionary(final String file) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSetImpl resourceSet = _resourceSetImpl;
    URI uri = URI.createURI(file);
    Resource resource = resourceSet.getResource(uri, true);
    EList<EObject> _contents = resource.getContents();
    EObject model = _contents.get(0);
    return model;
  }
  
  public void transformSubset268(final Model umlModel, final String subset_name, final String file) {
    EObject _datadictionary = this.getDatadictionary(file);
    final DocumentRoot dictionary = ((DocumentRoot) _datadictionary);
    org.eclipse.uml2.uml.Package primitive_pkg = umlModel.createNestedPackage(TransformServiceImpl.PRIMITIVE_PACKAGE_NAME);
    PrimitiveType _createOwnedPrimitiveType = primitive_pkg.createOwnedPrimitiveType(TransformServiceImpl.PRIMITIVE_INT_TYPE_NAME);
    this.generatedTypes.put("int", _createOwnedPrimitiveType);
    PrimitiveType _createOwnedPrimitiveType_1 = primitive_pkg.createOwnedPrimitiveType(TransformServiceImpl.PRIMITIVE_REAL_TYPE_NAME);
    this.generatedTypes.put("real", _createOwnedPrimitiveType_1);
    PrimitiveType _createOwnedPrimitiveType_2 = primitive_pkg.createOwnedPrimitiveType(TransformServiceImpl.PRIMITIVE_ENUM_TYPE_NAME);
    this.generatedTypes.put("enum", _createOwnedPrimitiveType_2);
    PrimitiveType _createOwnedPrimitiveType_3 = primitive_pkg.createOwnedPrimitiveType(TransformServiceImpl.PARCEL_TYPE_NAME);
    this.generatedTypes.put(TransformServiceImpl.PARCEL_TYPE_ID, _createOwnedPrimitiveType_3);
    org.eclipse.uml2.uml.Package root_pkg = umlModel.createNestedPackage(subset_name);
    org.eclipse.uml2.uml.Package pkg = root_pkg.createNestedPackage(TransformServiceImpl.TRAIN_TO_TRACK_PACKAGE);
    TDefinitions _definitions = dictionary.getDefinitions();
    TPackets _packets = _definitions.getPackets();
    TTrainToTrack _trainToTrack = _packets.getTrainToTrack();
    EList<TPacket> _packet = _trainToTrack.getPacket();
    this.createPackets0268(pkg, _packet);
    org.eclipse.uml2.uml.Package _createNestedPackage = root_pkg.createNestedPackage(TransformServiceImpl.TRACK_TO_TRAIN_PACKAGE);
    pkg = _createNestedPackage;
    TDefinitions _definitions_1 = dictionary.getDefinitions();
    TPackets _packets_1 = _definitions_1.getPackets();
    TTrackToTrain _trackToTrain = _packets_1.getTrackToTrain();
    EList<TPacket> _packet_1 = _trackToTrain.getPacket();
    this.createPackets0268(pkg, _packet_1);
  }
  
  public void createPackets0268(final org.eclipse.uml2.uml.Package pkg, final EList<TPacket> packets) {
    for (final TPacket v : packets) {
      {
        int optional = 1;
        int parcel_num = 1;
        String _name = v.getName();
        String typeName = TransformServiceImpl.type_identifier(_name);
        String _name_1 = v.getName();
        String typePrefix = TransformServiceImpl.identifier(_name_1);
        DataType dataType = TransformServiceImpl.createDataType(pkg, typeName);
        String _description = v.getDescription();
        boolean _isValid = TransformServiceImpl.isValid(_description);
        if (_isValid) {
          String _description_1 = v.getDescription();
          TransformServiceImpl.addComment(dataType, _description_1);
        }
        BigInteger _number = v.getNumber();
        String _string = _number.toString();
        String _plus = (TransformServiceImpl.NUMBER_PREFIX + _string);
        TransformServiceImpl.addComment(dataType, _plus);
        TTransmissionMedia _transmissionMedia = v.getTransmissionMedia();
        String _string_1 = _transmissionMedia.toString();
        String _plus_1 = (TransformServiceImpl.TRANSMISSION_MEDIA_PREFIX + _string_1);
        TransformServiceImpl.addComment(dataType, _plus_1);
        TContent _content = v.getContent();
        FeatureMap fmap = _content.getGroup();
        ValueListIterator<Object> iter = fmap.valueListIterator();
        boolean _hasNext = iter.hasNext();
        boolean _while = _hasNext;
        while (_while) {
          {
            Object elt = iter.next();
            boolean _matched = false;
            if (!_matched) {
              if (elt instanceof TTlgVar) {
                final TTlgVar _tTlgVar = (TTlgVar)elt;
                _matched=true;
                final String type = _tTlgVar.getType();
                String _name_2 = _tTlgVar.getName();
                Type _get = this.generatedTypes.get(type);
                String _comment = _tTlgVar.getComment();
                TransformServiceImpl.createAttribute(dataType, _name_2, _get, _comment);
              }
            }
            if (!_matched) {
              if (elt instanceof OptionalPacketsType) {
                final OptionalPacketsType _optionalPacketsType = (OptionalPacketsType)elt;
                _matched=true;
                String _string_2 = Integer.valueOf(optional).toString();
                String _plus_2 = (typePrefix + _string_2);
                String type_id = TransformServiceImpl.type_identifier(_plus_2);
                final DataType optional_datatype = TransformServiceImpl.createDataType(pkg, type_id);
                TransformServiceImpl.addComment(optional_datatype, TransformServiceImpl.OPTIONAL_PACKET_COMMENT);
                this.generatedTypes.put(type_id, optional_datatype);
                EList<ParcelType> _parcel = _optionalPacketsType.getParcel();
                final Procedure2<ParcelType,Integer> _function = new Procedure2<ParcelType,Integer>() {
                  public void apply(final ParcelType sub_elt, final Integer num) {
                    int _plus = ((num).intValue() + 1);
                    TransformServiceImpl.this.createParcel(optional_datatype, sub_elt, _plus);
                  }
                };
                IterableExtensions.<ParcelType>forEach(_parcel, _function);
              }
            }
            if (!_matched) {
              if (elt instanceof ParcelType) {
                final ParcelType _parcelType = (ParcelType)elt;
                _matched=true;
                this.createParcel(dataType, _parcelType, parcel_num);
                int _plus_2 = (parcel_num + 1);
                parcel_num = _plus_2;
              }
            }
          }
          boolean _hasNext_1 = iter.hasNext();
          _while = _hasNext_1;
        }
      }
    }
  }
  
  public Property createParcel(final DataType type, final ParcelType elt, final int num) {
    String _plus = (TransformServiceImpl.PARCEL_NAME_PREFIX + Integer.valueOf(num));
    Type _get = this.generatedTypes.get(TransformServiceImpl.PARCEL_TYPE_ID);
    String _comment = elt.getComment();
    Property parcel = TransformServiceImpl.createAttribute(type, _plus, _get, _comment);
    BigInteger _number = elt.getNumber();
    String _plus_1 = (TransformServiceImpl.NUMBER_PREFIX + _number);
    TransformServiceImpl.addComment(parcel, _plus_1);
    return parcel;
  }
  
  public void transformSubset267(final Model umlModel, final String subset_name, final String file) {
    EObject _datadictionary = this.getDatadictionary(file);
    final Subset0267.DocumentRoot dictionary = ((Subset0267.DocumentRoot) _datadictionary);
    org.eclipse.uml2.uml.Package subsetPkg = umlModel.createNestedPackage(subset_name);
    org.eclipse.uml2.uml.Package variablesPkg = subsetPkg.createNestedPackage(TransformServiceImpl.VARIABLES_PACKAGE);
    Subset0267.TDefinitions _definitions = dictionary.getDefinitions();
    TVardefVar _varDef = _definitions.getVarDef();
    EList<TVariable> _variable = _varDef.getVariable();
    for (final TVariable v : _variable) {
      boolean _or = false;
      SpecsType _specs = v.getSpecs();
      EList<SpecialType> _special = _specs.getSpecial();
      boolean _isEmpty = _special.isEmpty();
      if (_isEmpty) {
        _or = true;
      } else {
        SpecsType _specs_1 = v.getSpecs();
        EList<SpecialType> _special_1 = _specs_1.getSpecial();
        int _length = ((Object[])Conversions.unwrapArray(_special_1, Object.class)).length;
        boolean _lessEqualsThan = (_length <= 1);
        _or = (_isEmpty || _lessEqualsThan);
      }
      if (_or) {
        String _name = v.getName();
        String _type_identifier = TransformServiceImpl.type_identifier(_name);
        DataType primitiveType = TransformServiceImpl.createDataType(variablesPkg, _type_identifier);
        UMLUtil.safeApplyStereotype(primitiveType, TransformServiceImpl.gstereotype);
        String _detailedName = v.getDetailedName();
        boolean _isValid = TransformServiceImpl.isValid(_detailedName);
        if (_isValid) {
          String _detailedName_1 = v.getDetailedName();
          String _plus = (TransformServiceImpl.DETAILED_NAME_PREFIX + _detailedName_1);
          TransformServiceImpl.addComment(primitiveType, _plus);
        }
        String _description = v.getDescription();
        boolean _isValid_1 = TransformServiceImpl.isValid(_description);
        if (_isValid_1) {
          String _description_1 = v.getDescription();
          String _plus_1 = (TransformServiceImpl.DESCRIPTION_PREFIX + _description_1);
          TransformServiceImpl.addComment(primitiveType, _plus_1);
        }
        SpecsType specs = v.getSpecs();
        TVarLen _length_1 = specs.getLength();
        String _string = _length_1.toString();
        String _plus_2 = (TransformServiceImpl.LENGTH_PREFIX + _string);
        TransformServiceImpl.addComment(primitiveType, _plus_2);
        boolean _isSetMinVal = specs.isSetMinVal();
        if (_isSetMinVal) {
          TMinVal _minVal = specs.getMinVal();
          String _string_1 = _minVal.toString();
          String _plus_3 = (TransformServiceImpl.MIN_VAL_PREFIX + _string_1);
          TransformServiceImpl.addComment(primitiveType, _plus_3);
        }
        boolean _isSetMaxVal = specs.isSetMaxVal();
        if (_isSetMaxVal) {
          TMaxVal _maxVal = specs.getMaxVal();
          String _string_2 = _maxVal.toString();
          String _plus_4 = (TransformServiceImpl.MAX_VAL_PREFIX + _string_2);
          TransformServiceImpl.addComment(primitiveType, _plus_4);
        }
        boolean _isSetFormula = specs.isSetFormula();
        if (_isSetFormula) {
          TFormula _formula = specs.getFormula();
          String _string_3 = _formula.toString();
          String _plus_5 = (TransformServiceImpl.FORMULA_PREFIX + _string_3);
          TransformServiceImpl.addComment(primitiveType, _plus_5);
        }
        String _name_1 = primitiveType.getName();
        this.generatedTypes.put(_name_1, primitiveType);
      } else {
        String _name_2 = v.getName();
        String _type_identifier_1 = TransformServiceImpl.type_identifier(_name_2);
        Enumeration enumeratedType = variablesPkg.createOwnedEnumeration(_type_identifier_1);
        String _detailedName_2 = v.getDetailedName();
        boolean _isValid_2 = TransformServiceImpl.isValid(_detailedName_2);
        if (_isValid_2) {
          String _detailedName_3 = v.getDetailedName();
          String _plus_6 = (TransformServiceImpl.DETAILED_NAME_PREFIX + _detailedName_3);
          TransformServiceImpl.addComment(enumeratedType, _plus_6);
        }
        String _description_2 = v.getDescription();
        boolean _isValid_3 = TransformServiceImpl.isValid(_description_2);
        if (_isValid_3) {
          String _description_3 = v.getDescription();
          String _plus_7 = (TransformServiceImpl.DESCRIPTION_PREFIX + _description_3);
          TransformServiceImpl.addComment(enumeratedType, _plus_7);
        }
        String _name_3 = enumeratedType.getName();
        this.generatedTypes.put(_name_3, enumeratedType);
        SpecsType _specs_2 = v.getSpecs();
        EList<SpecialType> _special_2 = _specs_2.getSpecial();
        for (final SpecialType s : _special_2) {
          String _description_4 = s.getDescription();
          boolean _isValidName = TransformServiceImpl.isValidName(_description_4);
          if (_isValidName) {
            String _description_5 = s.getDescription();
            String _identifier = TransformServiceImpl.identifier(_description_5);
            EnumerationLiteral literal = enumeratedType.createOwnedLiteral(_identifier);
            String _description_6 = s.getDescription();
            String _plus_8 = (TransformServiceImpl.DESCRIPTION_PREFIX + _description_6);
            TransformServiceImpl.addComment(literal, _plus_8);
            TValue _value = s.getValue();
            String _string_4 = _value.toString();
            String _plus_9 = (TransformServiceImpl.VALUE_PREFIX + _string_4);
            TransformServiceImpl.addComment(literal, _plus_9);
          }
        }
      }
    }
    org.eclipse.uml2.uml.Package trainToTrackPkg = subsetPkg.createNestedPackage(TransformServiceImpl.TRAIN_TO_TRACK_PACKAGE);
    Subset0267.TDefinitions _definitions_1 = dictionary.getDefinitions();
    Subset0267.TPackets _packets = _definitions_1.getPackets();
    Subset0267.TTrainToTrack _trainToTrack = _packets.getTrainToTrack();
    EList<Subset0267.TPacket> _packet = _trainToTrack.getPacket();
    this.createPackets0267(trainToTrackPkg, _packet);
    org.eclipse.uml2.uml.Package trackToTrainPkg = subsetPkg.createNestedPackage(TransformServiceImpl.TRACK_TO_TRAIN_PACKAGE);
    Subset0267.TDefinitions _definitions_2 = dictionary.getDefinitions();
    Subset0267.TPackets _packets_1 = _definitions_2.getPackets();
    Subset0267.TTrackToTrain _trackToTrain = _packets_1.getTrackToTrain();
    EList<Subset0267.TPacket> _packet_1 = _trackToTrain.getPacket();
    this.createPackets0267(trackToTrainPkg, _packet_1);
  }
  
  public void createPackets0267(final org.eclipse.uml2.uml.Package pkg, final EList<Subset0267.TPacket> packets) {
    for (final Subset0267.TPacket v : packets) {
      {
        String _name = v.getName();
        String typeName = TransformServiceImpl.type_identifier(_name);
        String _name_1 = v.getName();
        String typePrefix = TransformServiceImpl.identifier(_name_1);
        DataType dataType = TransformServiceImpl.createDataType(pkg, typeName);
        String _description = v.getDescription();
        boolean _isValid = TransformServiceImpl.isValid(_description);
        if (_isValid) {
          String _description_1 = v.getDescription();
          TransformServiceImpl.addComment(dataType, _description_1);
        }
        TIDNumber _number = v.getNumber();
        String _string = _number.toString();
        String _plus = (TransformServiceImpl.NUMBER_PREFIX + _string);
        TransformServiceImpl.addComment(dataType, _plus);
        Subset0267.TTransmissionMedia _transmissionMedia = v.getTransmissionMedia();
        String _string_1 = _transmissionMedia.toString();
        String _plus_1 = (TransformServiceImpl.TRANSMISSION_MEDIA_PREFIX + _string_1);
        TransformServiceImpl.addComment(dataType, _plus_1);
        Subset0267.TContent _content = v.getContent();
        FeatureMap _group = _content.getGroup();
        this.createContent(pkg, dataType, _group, typePrefix, null);
      }
    }
  }
  
  public void createContent(final org.eclipse.uml2.uml.Package pkg, final DataType type, final FeatureMap fmap, final String prefix, final String skip) {
    int dyn_cpt = 0;
    int con_cpt = 0;
    ValueListIterator<Object> iter = fmap.valueListIterator();
    boolean _hasNext = iter.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        Object elt = iter.next();
        boolean _matched = false;
        if (!_matched) {
          if (elt instanceof Subset0267.TTlgVar) {
            final Subset0267.TTlgVar _tTlgVar = (Subset0267.TTlgVar)elt;
            _matched=true;
            String _name = _tTlgVar.getName();
            boolean _notEquals = (!Objects.equal(_name, skip));
            if (_notEquals) {
              String _name_1 = _tTlgVar.getName();
              String _identifier = TransformServiceImpl.identifier(_name_1);
              String _name_2 = _tTlgVar.getName();
              String _type_identifier = TransformServiceImpl.type_identifier(_name_2);
              Type _get = this.generatedTypes.get(_type_identifier);
              String _comment = _tTlgVar.getComment();
              Property attr = TransformServiceImpl.createAttribute(type, _identifier, _get, _comment);
              TLength _length = _tTlgVar.getLength();
              String _string = _length.toString();
              String _plus = (TransformServiceImpl.LENGTH_PREFIX + _string);
              TransformServiceImpl.addComment(attr, _plus);
            }
          }
        }
        if (!_matched) {
          if (elt instanceof TLoopDoWhile) {
            final TLoopDoWhile _tLoopDoWhile = (TLoopDoWhile)elt;
            _matched=true;
            int _plus = (dyn_cpt + 1);
            dyn_cpt = _plus;
            String _string = Integer.valueOf(dyn_cpt).toString();
            String loop_name = (TransformServiceImpl.DYNAMIC_FIELD_PREFIX + _string);
            String loop_type_prefix = TransformServiceImpl.type_extend(prefix, loop_name);
            String loop_type_name = TransformServiceImpl.type_identifier(loop_type_prefix);
            FeatureMap _group = _tLoopDoWhile.getGroup();
            DataType loop_type = this.createLoop(pkg, loop_type_prefix, _group);
            this.generatedTypes.put(loop_type_name, loop_type);
            Property attr = type.createOwnedAttribute(loop_name, loop_type);
            TransformServiceImpl.addComment(attr, TransformServiceImpl.DYNAMIC_FIELD_HEADER_COMMENT);
          }
        }
        if (!_matched) {
          if (elt instanceof TLoopWhile) {
            final TLoopWhile _tLoopWhile = (TLoopWhile)elt;
            _matched=true;
            int _plus = (dyn_cpt + 1);
            dyn_cpt = _plus;
            String _string = Integer.valueOf(dyn_cpt).toString();
            String loop_name = (TransformServiceImpl.DYNAMIC_FIELD_PREFIX + _string);
            String loop_type_prefix = TransformServiceImpl.type_extend(prefix, loop_name);
            String loop_type_name = TransformServiceImpl.type_identifier(loop_type_prefix);
            FeatureMap _group = _tLoopWhile.getGroup();
            DataType loop_type = this.createLoop(pkg, loop_type_prefix, _group);
            this.generatedTypes.put(loop_type_name, loop_type);
            Property attr = type.createOwnedAttribute(loop_name, loop_type);
            TransformServiceImpl.addComment(attr, TransformServiceImpl.DYNAMIC_FIELD_HEADER_COMMENT);
          }
        }
        if (!_matched) {
          if (elt instanceof TConditional) {
            final TConditional _tConditional = (TConditional)elt;
            _matched=true;
            int _plus = (con_cpt + 1);
            con_cpt = _plus;
            String _string = Integer.valueOf(con_cpt).toString();
            String con_name = (TransformServiceImpl.CONDITIONAL_FIELD_PREFIX + _string);
            String con_type_prefix = TransformServiceImpl.type_extend(prefix, con_name);
            String con_type_name = TransformServiceImpl.type_identifier(con_type_prefix);
            DataType con_type = TransformServiceImpl.createDataType(pkg, con_type_name);
            TransformServiceImpl.addComment(con_type, TransformServiceImpl.CONDITONAL_FIELD_COMMENT);
            this.generatedTypes.put(con_type_name, type);
            Property attr = type.createOwnedAttribute(con_name, con_type);
            TransformServiceImpl.addComment(attr, TransformServiceImpl.CONDITONAL_FIELD_COMMENT);
            EList<String> _condition = _tConditional.getCondition();
            String _string_1 = _condition.toString();
            String _plus_1 = (TransformServiceImpl.CONDITION_PREFIX + _string_1);
            TransformServiceImpl.addComment(attr, _plus_1);
            EList<TVariables> _variables = _tConditional.getVariables();
            for (final TVariables evar : _variables) {
              FeatureMap _group = evar.getGroup();
              this.createContent(pkg, con_type, _group, con_type_prefix, null);
            }
          }
        }
      }
      boolean _hasNext_1 = iter.hasNext();
      _while = _hasNext_1;
    }
  }
  
  public DataType createLoop(final org.eclipse.uml2.uml.Package pkg, final String loop_type_prefix, final FeatureMap fmap) {
    String type_id = TransformServiceImpl.type_identifier(loop_type_prefix);
    DataType type = TransformServiceImpl.createDataType(pkg, type_id);
    TransformServiceImpl.addComment(type, TransformServiceImpl.DYNAMIC_FIELD_HEADER_COMMENT);
    this.generatedTypes.put(type_id, type);
    ValueListIterator<Object> iter = fmap.valueListIterator();
    boolean break_ = false;
    boolean _and = false;
    boolean _hasNext = iter.hasNext();
    if (!_hasNext) {
      _and = false;
    } else {
      boolean _not = (!break_);
      _and = (_hasNext && _not);
    }
    boolean _while = _and;
    while (_while) {
      {
        Object elt = iter.next();
        boolean _matched = false;
        if (!_matched) {
          if (elt instanceof Subset0267.TTlgVar) {
            final Subset0267.TTlgVar _tTlgVar = (Subset0267.TTlgVar)elt;
            _matched=true;
            String _name = _tTlgVar.getName();
            boolean _startsWith = _name.startsWith("N_ITER");
            if (_startsWith) {
              break_ = true;
              String _name_1 = _tTlgVar.getName();
              String _type_identifier = TransformServiceImpl.type_identifier("N_ITER");
              Type _get = this.generatedTypes.get(_type_identifier);
              Property attr = type.createOwnedAttribute(_name_1, _get);
              String _comment = _tTlgVar.getComment();
              boolean _isValid = TransformServiceImpl.isValid(_comment);
              if (_isValid) {
                String _comment_1 = _tTlgVar.getComment();
                TransformServiceImpl.addComment(attr, _comment_1);
              }
              TLength _length = _tTlgVar.getLength();
              String _string = _length.toString();
              String _plus = (TransformServiceImpl.LENGTH_PREFIX + _string);
              TransformServiceImpl.addComment(attr, _plus);
              String body_prefix = TransformServiceImpl.type_extend(loop_type_prefix, TransformServiceImpl.DYNAMIC_FIELD_BODY_NAME);
              String body_type_name = TransformServiceImpl.type_identifier(body_prefix);
              DataType body_type = TransformServiceImpl.createDataType(pkg, body_type_name);
              TransformServiceImpl.addComment(body_type, TransformServiceImpl.DYNAMIC_FIELD_BODY_COMMENT);
              Property body_attr = type.createOwnedAttribute(TransformServiceImpl.DYNAMIC_FIELD_BODY_NAME, body_type, 33, 33);
              TransformServiceImpl.addComment(body_attr, TransformServiceImpl.DYNAMIC_FIELD_BODY_COMMENT);
              this.generatedTypes.put(body_type_name, body_type);
              String _name_2 = _tTlgVar.getName();
              this.createContent(pkg, body_type, fmap, body_prefix, _name_2);
            }
          }
        }
      }
      boolean _and_1 = false;
      boolean _hasNext_1 = iter.hasNext();
      if (!_hasNext_1) {
        _and_1 = false;
      } else {
        boolean _not_1 = (!break_);
        _and_1 = (_hasNext_1 && _not_1);
      }
      _while = _and_1;
    }
    return type;
  }
  
  public void save(final Model model, final String output) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    final ResourceSetImpl resourceSet = _resourceSetImpl;
    URI _createURI = URI.createURI(output);
    final Resource res = resourceSet.createResource(_createURI);
    EList<EObject> _contents = res.getContents();
    _contents.add(model);
    try {
      Map<Object,Object> _emptyMap = CollectionLiterals.<Object, Object>emptyMap();
      res.save(_emptyMap);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static String identifier(final String str) {
    String tmp = str;
    int opar = str.indexOf("(");
    int _minus = (-1);
    boolean _notEquals = (opar != _minus);
    if (_notEquals) {
      String _substring = str.substring(0, opar);
      tmp = _substring;
    }
    return tmp.replaceAll("\\W", "_");
  }
  
  public static String type_extend(final String str1, final String str2) {
    String _plus = (str1 + "_");
    return (_plus + str2);
  }
  
  public static String type_identifier(final String str) {
    String _identifier = TransformServiceImpl.identifier(str);
    String _replaceAll = _identifier.replaceAll("\\W", "_");
    return (_replaceAll + "_t");
  }
  
  public static boolean isValidName(final String name) {
    for (final String i : TransformServiceImpl.invalidNames) {
      boolean _equalsIgnoreCase = name.equalsIgnoreCase(i);
      if (_equalsIgnoreCase) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean isValid(final String comment) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(comment, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(comment, ""));
      _and = (_notEquals && _notEquals_1);
    }
    return _and;
  }
  
  public static Property createAttribute(final DataType dataType, final String name, final Type type, final String comment) {
    Property attribute = dataType.createOwnedAttribute(name, type);
    boolean _notEquals = (!Objects.equal(comment, null));
    if (_notEquals) {
      TransformServiceImpl.addComment(attribute, comment);
    }
    return attribute;
  }
  
  public static Enumeration createEnumeratedType(final org.eclipse.uml2.uml.Package pkg, final String name, final String comment) {
    Enumeration enumeratedType = pkg.createOwnedEnumeration(name);
    TransformServiceImpl.addComment(enumeratedType, comment);
    return enumeratedType;
  }
  
  public static PrimitiveType createPrimitiveType(final org.eclipse.uml2.uml.Package pkg, final String name, final String comment) {
    PrimitiveType primitiveType = pkg.createOwnedPrimitiveType(name);
    TransformServiceImpl.addComment(primitiveType, comment);
    return primitiveType;
  }
  
  public static DataType createDataType(final org.eclipse.uml2.uml.Package pkg, final String name) {
    EClass _dataType = UMLPackage.eINSTANCE.getDataType();
    PackageableElement _createPackagedElement = pkg.createPackagedElement(name, _dataType);
    return ((DataType) _createPackagedElement);
  }
  
  public static Boolean addComment(final NamedElement element, final String comment) {
    Boolean _xifexpression = null;
    boolean _notEquals = (!Objects.equal(comment, null));
    if (_notEquals) {
      boolean _xblockexpression = false;
      {
        Comment elementComment = element.createOwnedComment();
        elementComment.setBody(comment);
        EList<Element> _annotatedElements = elementComment.getAnnotatedElements();
        boolean _add = _annotatedElements.add(element);
        _xblockexpression = (_add);
      }
      _xifexpression = Boolean.valueOf(_xblockexpression);
    }
    return _xifexpression;
  }
  
  public static Model createUMLModel() {
    return UMLFactory.eINSTANCE.createModel();
  }
  
  public static Profile getProfile(final org.eclipse.uml2.uml.Package pack, final String name) {
    EList<Element> _allOwnedElements = pack.allOwnedElements();
    for (final Element e : _allOwnedElements) {
      boolean _matched = false;
      if (!_matched) {
        if (e instanceof Profile) {
          final Profile _profile = (Profile)e;
          _matched=true;
          String _name = _profile.getName();
          boolean _equals = Objects.equal(_name, name);
          if (_equals) {
            return _profile;
          }
        }
      }
    }
    return null;
  }
  
  public static Stereotype getStereotype(final org.eclipse.uml2.uml.Package pack, final String name) {
    EList<Element> _allOwnedElements = pack.allOwnedElements();
    for (final Element e : _allOwnedElements) {
      boolean _matched = false;
      if (!_matched) {
        if (e instanceof Stereotype) {
          final Stereotype _stereotype = (Stereotype)e;
          _matched=true;
          String _name = _stereotype.getName();
          boolean _equals = Objects.equal(_name, name);
          if (_equals) {
            return _stereotype;
          }
        }
      }
    }
    return null;
  }
}
