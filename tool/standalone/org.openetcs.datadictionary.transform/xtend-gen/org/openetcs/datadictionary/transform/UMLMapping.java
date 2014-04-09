package org.openetcs.datadictionary.transform;

import Subset0267.SpecialType;
import Subset0267.SpecsType;
import Subset0267.TConditional;
import Subset0267.TContent;
import Subset0267.TDefinitions;
import Subset0267.TFormula;
import Subset0267.TIDNumber;
import Subset0267.TLength;
import Subset0267.TLoopDoWhile;
import Subset0267.TLoopWhile;
import Subset0267.TMaxVal;
import Subset0267.TMinVal;
import Subset0267.TPacket;
import Subset0267.TPackets;
import Subset0267.TTlgVar;
import Subset0267.TTrackToTrain;
import Subset0267.TTrainToTrack;
import Subset0267.TTransmissionMedia;
import Subset0267.TValue;
import Subset0267.TVarLen;
import Subset0267.TVardefVar;
import Subset0267.TVariable;
import Subset0267.TVariables;
import Subset0267.util.Subset0267ResourceFactoryImpl;
import Subset0268.DocumentRoot;
import Subset0268.util.Subset0268ResourceFactoryImpl;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.ValueListIterator;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class UMLMapping {
  private static Object SysMLProfile = null;
  
  private static BasicEMap<String,Type> generatedTypes = new Function0<BasicEMap<String,Type>>() {
    public BasicEMap<String,Type> apply() {
      BasicEMap<String,Type> _basicEMap = new BasicEMap<String, Type>();
      return _basicEMap;
    }
  }.apply();
  
  private static List<String> invalidNames = Collections.<String>unmodifiableList(Lists.<String>newArrayList("spare", "unknown", "not known", "not valid", "reserved", "not used"));
  
  private static ResourceSetImpl resourceSet = new Function0<ResourceSetImpl>() {
    public ResourceSetImpl apply() {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      return _resourceSetImpl;
    }
  }.apply();
  
  public static org.eclipse.uml2.uml.Package loadPackage(final URI uri) throws Exception {
    try {
      Resource resource = UMLMapping.resourceSet.getResource(uri, true);
      EList<EObject> _contents = resource.getContents();
      Object _objectByType = EcoreUtil.getObjectByType(_contents, Literals.PACKAGE);
      return ((org.eclipse.uml2.uml.Package) _objectByType);
    } catch (final Throwable _t) {
      if (_t instanceof WrappedException) {
        final WrappedException we = (WrappedException)_t;
        String _message = we.getMessage();
        InputOutput.<String>println(_message);
        System.exit(1);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
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
  
  public static void main(final String[] args) {
    final Model umlModel = UMLMapping.createUMLModel();
    umlModel.setName("DataDictionary");
    org.eclipse.uml2.uml.Package package267 = umlModel.createNestedPackage("Subset-026-7");
    org.eclipse.uml2.uml.Package package268 = umlModel.createNestedPackage("Subset-026-8");
    Map<String,Object> _extensionToFactoryMap = Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put(UMLResource.FILE_EXTENSION, Factory.INSTANCE);
    Map<String,Object> _extensionToFactoryMap_1 = Registry.INSTANCE.getExtensionToFactoryMap();
    Subset0267ResourceFactoryImpl _subset0267ResourceFactoryImpl = new Subset0267ResourceFactoryImpl();
    _extensionToFactoryMap_1.put("xml", _subset0267ResourceFactoryImpl);
    UMLMapping.transformSubset267(package267, "models/Subset_026_7.xml");
    Map<String,Object> _extensionToFactoryMap_2 = Registry.INSTANCE.getExtensionToFactoryMap();
    Subset0268ResourceFactoryImpl _subset0268ResourceFactoryImpl = new Subset0268ResourceFactoryImpl();
    _extensionToFactoryMap_2.put("xml", _subset0268ResourceFactoryImpl);
    UMLMapping.transformSubset268(package268, "models/Subset_026_8.xml");
    UMLMapping.save(umlModel);
  }
  
  public static void transformSubset268(final org.eclipse.uml2.uml.Package pkg, final String file) {
    final DocumentRoot dictionary = UMLMapping.getDatadictionary268(file);
  }
  
  public static DocumentRoot getDatadictionary268(final String file) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSetImpl resourceSet = _resourceSetImpl;
    URI uri = URI.createURI(file);
    Resource resource = resourceSet.getResource(uri, true);
    EList<EObject> _contents = resource.getContents();
    EObject model = _contents.get(0);
    return ((DocumentRoot) model);
  }
  
  public static void transformSubset267(final org.eclipse.uml2.uml.Package pkg, final String file) {
    final Subset0267.DocumentRoot dictionary = UMLMapping.getDatadictionary267(file);
    TDefinitions _definitions = dictionary.getDefinitions();
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
        String _identifier = UMLMapping.identifier(_name);
        PrimitiveType primitiveType = pkg.createOwnedPrimitiveType(_identifier);
        String _detailedName = v.getDetailedName();
        boolean _isValid = UMLMapping.isValid(_detailedName);
        if (_isValid) {
          String _detailedName_1 = v.getDetailedName();
          String _plus = ("DetailedName = " + _detailedName_1);
          UMLMapping.addComment(primitiveType, _plus);
        }
        String _description = v.getDescription();
        boolean _isValid_1 = UMLMapping.isValid(_description);
        if (_isValid_1) {
          String _description_1 = v.getDescription();
          String _plus_1 = ("Description = " + _description_1);
          UMLMapping.addComment(primitiveType, _plus_1);
        }
        SpecsType specs = v.getSpecs();
        TVarLen _length_1 = specs.getLength();
        String _string = _length_1.toString();
        String _plus_2 = ("Length = " + _string);
        UMLMapping.addComment(primitiveType, _plus_2);
        boolean _isSetMinVal = specs.isSetMinVal();
        if (_isSetMinVal) {
          TMinVal _minVal = specs.getMinVal();
          String _string_1 = _minVal.toString();
          String _plus_3 = ("MinVal = " + _string_1);
          UMLMapping.addComment(primitiveType, _plus_3);
        }
        boolean _isSetMaxVal = specs.isSetMaxVal();
        if (_isSetMaxVal) {
          TMaxVal _maxVal = specs.getMaxVal();
          String _string_2 = _maxVal.toString();
          String _plus_4 = ("MaxVal = " + _string_2);
          UMLMapping.addComment(primitiveType, _plus_4);
        }
        boolean _isSetFormula = specs.isSetFormula();
        if (_isSetFormula) {
          TFormula _formula = specs.getFormula();
          String _string_3 = _formula.toString();
          String _plus_5 = ("Formula = " + _string_3);
          UMLMapping.addComment(primitiveType, _plus_5);
        }
        String _name_1 = primitiveType.getName();
        UMLMapping.generatedTypes.put(_name_1, primitiveType);
      } else {
        String _name_2 = v.getName();
        String _identifier_1 = UMLMapping.identifier(_name_2);
        Enumeration enumeratedType = pkg.createOwnedEnumeration(_identifier_1);
        String _detailedName_2 = v.getDetailedName();
        boolean _isValid_2 = UMLMapping.isValid(_detailedName_2);
        if (_isValid_2) {
          String _detailedName_3 = v.getDetailedName();
          String _plus_6 = ("DetailedName = " + _detailedName_3);
          UMLMapping.addComment(enumeratedType, _plus_6);
        }
        String _description_2 = v.getDescription();
        boolean _isValid_3 = UMLMapping.isValid(_description_2);
        if (_isValid_3) {
          String _description_3 = v.getDescription();
          String _plus_7 = ("Description = " + _description_3);
          UMLMapping.addComment(enumeratedType, _plus_7);
        }
        String _name_3 = enumeratedType.getName();
        UMLMapping.generatedTypes.put(_name_3, enumeratedType);
        SpecsType _specs_2 = v.getSpecs();
        EList<SpecialType> _special_2 = _specs_2.getSpecial();
        for (final SpecialType s : _special_2) {
          String _description_4 = s.getDescription();
          boolean _isValidName = UMLMapping.isValidName(_description_4);
          if (_isValidName) {
            String _description_5 = s.getDescription();
            String _identifier_2 = UMLMapping.identifier(_description_5);
            EnumerationLiteral literal = enumeratedType.createOwnedLiteral(_identifier_2);
            String _description_6 = s.getDescription();
            String _plus_8 = ("Description = " + _description_6);
            UMLMapping.addComment(literal, _plus_8);
            TValue _value = s.getValue();
            String _string_4 = _value.toString();
            String _plus_9 = ("Value = " + _string_4);
            UMLMapping.addComment(literal, _plus_9);
          }
        }
      }
    }
    TDefinitions _definitions_1 = dictionary.getDefinitions();
    TPackets _packets = _definitions_1.getPackets();
    TTrackToTrain _trackToTrain = _packets.getTrackToTrain();
    EList<TPacket> _packet = _trackToTrain.getPacket();
    TDefinitions _definitions_2 = dictionary.getDefinitions();
    TPackets _packets_1 = _definitions_2.getPackets();
    TTrainToTrack _trainToTrack = _packets_1.getTrainToTrack();
    EList<TPacket> _packet_1 = _trainToTrack.getPacket();
    Iterable<TPacket> _plus_10 = Iterables.<TPacket>concat(_packet, _packet_1);
    for (final TPacket v_1 : _plus_10) {
      {
        String _name_4 = v_1.getName();
        String typeName = UMLMapping.identifier(_name_4);
        DataType dataType = UMLMapping.createDataType(pkg, typeName);
        String _description_7 = v_1.getDescription();
        boolean _isValid_4 = UMLMapping.isValid(_description_7);
        if (_isValid_4) {
          String _description_8 = v_1.getDescription();
          UMLMapping.addComment(dataType, _description_8);
        }
        TIDNumber _number = v_1.getNumber();
        String _string_5 = _number.toString();
        String _plus_11 = ("Number = " + _string_5);
        UMLMapping.addComment(dataType, _plus_11);
        TTransmissionMedia _transmissionMedia = v_1.getTransmissionMedia();
        String _string_6 = _transmissionMedia.toString();
        String _plus_12 = ("TransmissionMedia = " + _string_6);
        UMLMapping.addComment(dataType, _plus_12);
        TContent _content = v_1.getContent();
        FeatureMap _group = _content.getGroup();
        UMLMapping.createContent(pkg, dataType, _group, typeName, null);
      }
    }
  }
  
  public static void createContent(final org.eclipse.uml2.uml.Package pkg, final DataType type, final FeatureMap fmap, final String prefix, final String skip) {
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
          if (elt instanceof TTlgVar) {
            final TTlgVar _tTlgVar = (TTlgVar)elt;
            _matched=true;
            String _name = _tTlgVar.getName();
            boolean _notEquals = (!Objects.equal(_name, skip));
            if (_notEquals) {
              String _name_1 = _tTlgVar.getName();
              String _name_2 = _tTlgVar.getName();
              Type _get = UMLMapping.generatedTypes.get(_name_2);
              String _comment = _tTlgVar.getComment();
              Property attr = UMLMapping.createAttribute(type, _name_1, _get, _comment);
              TLength _length = _tTlgVar.getLength();
              String _string = _length.toString();
              String _plus = ("Length = " + _string);
              UMLMapping.addComment(attr, _plus);
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
            String loop_name = ("DStruct" + _string);
            String _plus_1 = (prefix + "_");
            String loop_type_name = (_plus_1 + loop_name);
            FeatureMap _group = _tLoopDoWhile.getGroup();
            DataType loop_type = UMLMapping.createLoop(pkg, loop_type_name, _group);
            UMLMapping.generatedTypes.put(loop_type_name, loop_type);
            Property attr = type.createOwnedAttribute(loop_name, loop_type);
            UMLMapping.addComment(attr, "Dynamic field header");
          }
        }
        if (!_matched) {
          if (elt instanceof TLoopWhile) {
            final TLoopWhile _tLoopWhile = (TLoopWhile)elt;
            _matched=true;
            int _plus = (dyn_cpt + 1);
            dyn_cpt = _plus;
            String _string = Integer.valueOf(dyn_cpt).toString();
            String loop_name = ("DStruct" + _string);
            String _plus_1 = (prefix + "_");
            String loop_type_name = (_plus_1 + loop_name);
            FeatureMap _group = _tLoopWhile.getGroup();
            DataType loop_type = UMLMapping.createLoop(pkg, loop_type_name, _group);
            UMLMapping.generatedTypes.put(loop_type_name, loop_type);
            Property attr = type.createOwnedAttribute(loop_name, loop_type);
            UMLMapping.addComment(attr, "Dynamic field header");
          }
        }
        if (!_matched) {
          if (elt instanceof TConditional) {
            final TConditional _tConditional = (TConditional)elt;
            _matched=true;
            int _plus = (con_cpt + 1);
            con_cpt = _plus;
            String _string = Integer.valueOf(con_cpt).toString();
            String con_name = ("CStruct" + _string);
            String _plus_1 = (prefix + "_");
            String con_type_name = (_plus_1 + con_name);
            DataType con_type = UMLMapping.createDataType(pkg, con_type_name);
            UMLMapping.addComment(con_type, "Conditional field");
            UMLMapping.generatedTypes.put(con_type_name, type);
            Property attr = type.createOwnedAttribute(con_name, con_type);
            UMLMapping.addComment(attr, "Conditional field");
            EList<String> _condition = _tConditional.getCondition();
            String _string_1 = _condition.toString();
            String _plus_2 = ("Condition = " + _string_1);
            UMLMapping.addComment(attr, _plus_2);
            EList<TVariables> _variables = _tConditional.getVariables();
            for (final TVariables evar : _variables) {
              FeatureMap _group = evar.getGroup();
              UMLMapping.createContent(pkg, con_type, _group, con_type_name, null);
            }
          }
        }
      }
      boolean _hasNext_1 = iter.hasNext();
      _while = _hasNext_1;
    }
  }
  
  public static DataType createLoop(final org.eclipse.uml2.uml.Package pkg, final String loop_type_name, final FeatureMap fmap) {
    DataType type = UMLMapping.createDataType(pkg, loop_type_name);
    UMLMapping.addComment(type, "Dynamic block header");
    UMLMapping.generatedTypes.put(loop_type_name, type);
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
          if (elt instanceof TTlgVar) {
            final TTlgVar _tTlgVar = (TTlgVar)elt;
            _matched=true;
            String _name = _tTlgVar.getName();
            boolean _startsWith = _name.startsWith("N_ITER");
            if (_startsWith) {
              break_ = true;
              String _name_1 = _tTlgVar.getName();
              Type _get = UMLMapping.generatedTypes.get("N_ITER");
              Property attr = type.createOwnedAttribute(_name_1, _get);
              String _comment = _tTlgVar.getComment();
              boolean _isValid = UMLMapping.isValid(_comment);
              if (_isValid) {
                String _comment_1 = _tTlgVar.getComment();
                UMLMapping.addComment(attr, _comment_1);
              }
              TLength _length = _tTlgVar.getLength();
              String _string = _length.toString();
              String _plus = ("Length = " + _string);
              UMLMapping.addComment(attr, _plus);
              String body_name = (loop_type_name + "_Body");
              DataType body_type = UMLMapping.createDataType(pkg, body_name);
              UMLMapping.addComment(body_type, "Dynamic field body");
              Property body_attr = type.createOwnedAttribute("body", body_type, 33, 33);
              UMLMapping.addComment(body_attr, "Dynamic field body");
              UMLMapping.generatedTypes.put(body_name, body_type);
              String _name_2 = _tTlgVar.getName();
              UMLMapping.createContent(pkg, body_type, fmap, body_name, _name_2);
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
  
  public static Object createConditional(final org.eclipse.uml2.uml.Package pkg, final String con_type_name, final FeatureMap fmap) {
    return null;
  }
  
  public static String identifier(final String str) {
    return str.replaceAll("\\W", "_");
  }
  
  public static boolean isValidName(final String name) {
    for (final String i : UMLMapping.invalidNames) {
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
    UMLMapping.addComment(attribute, comment);
    return attribute;
  }
  
  public static Enumeration createEnumeratedType(final org.eclipse.uml2.uml.Package pkg, final String name, final String comment) {
    Enumeration enumeratedType = pkg.createOwnedEnumeration(name);
    UMLMapping.addComment(enumeratedType, comment);
    return enumeratedType;
  }
  
  public static PrimitiveType createPrimitiveType(final org.eclipse.uml2.uml.Package pkg, final String name, final String comment) {
    PrimitiveType primitiveType = pkg.createOwnedPrimitiveType(name);
    UMLMapping.addComment(primitiveType, comment);
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
  
  public static Subset0267.DocumentRoot getDatadictionary267(final String file) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSetImpl resourceSet = _resourceSetImpl;
    URI uri = URI.createURI(file);
    Resource resource = resourceSet.getResource(uri, true);
    EList<EObject> _contents = resource.getContents();
    EObject model = _contents.get(0);
    return ((Subset0267.DocumentRoot) model);
  }
  
  public static Model createUMLModel() {
    return UMLFactory.eINSTANCE.createModel();
  }
  
  public static void save(final Model model) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    final ResourceSetImpl resourceSet = _resourceSetImpl;
    URI _createURI = URI.createURI("generated/models/DataDictionary.library.uml");
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
}
