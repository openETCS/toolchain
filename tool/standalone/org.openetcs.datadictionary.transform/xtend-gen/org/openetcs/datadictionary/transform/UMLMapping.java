package org.openetcs.datadictionary.transform;

import Subset0267.SpecialType;
import Subset0267.SpecsType;
import Subset0267.TVardefVar;
import Subset0267.TVariable;
import Subset0267.util.Subset0267ResourceFactoryImpl;
import Subset0268.DocumentRoot;
import Subset0268.TContent;
import Subset0268.TDefinitions;
import Subset0268.TPacket;
import Subset0268.TPackets;
import Subset0268.TTlgVar;
import Subset0268.TTrackToTrain;
import Subset0268.TTrainToTrack;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource.Factory;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class UMLMapping {
  private static BasicEMap<String,Type> generatedTypes = new Function0<BasicEMap<String,Type>>() {
    public BasicEMap<String,Type> apply() {
      BasicEMap<String,Type> _basicEMap = new BasicEMap<String, Type>();
      return _basicEMap;
    }
  }.apply();
  
  private static List<String> invalidNames = Collections.<String>unmodifiableList(Lists.<String>newArrayList("spare", "unknown", "not known", "not valid", "reserved", "not used"));
  
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
    TDefinitions _definitions = dictionary.getDefinitions();
    TPackets _packets = _definitions.getPackets();
    TTrackToTrain _trackToTrain = _packets.getTrackToTrain();
    EList<TPacket> _packet = _trackToTrain.getPacket();
    TDefinitions _definitions_1 = dictionary.getDefinitions();
    TPackets _packets_1 = _definitions_1.getPackets();
    TTrainToTrack _trainToTrack = _packets_1.getTrainToTrack();
    EList<TPacket> _packet_1 = _trainToTrack.getPacket();
    Iterable<TPacket> _plus = Iterables.<TPacket>concat(_packet, _packet_1);
    for (final TPacket v : _plus) {
      {
        String _name = v.getName();
        String _description = v.getDescription();
        DataType dataType = UMLMapping.createDataType(pkg, _name, _description);
        TContent _content = v.getContent();
        EList<TTlgVar> _tlgVar = _content.getTlgVar();
        for (final TTlgVar t : _tlgVar) {
          String _name_1 = t.getName();
          String _name_2 = t.getName();
          Type _get = UMLMapping.generatedTypes.get(_name_2);
          String _comment = t.getComment();
          UMLMapping.createAttribute(dataType, _name_1, _get, _comment);
        }
      }
    }
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
        String _description = v.getDescription();
        PrimitiveType primitiveType = UMLMapping.createPrimitiveType(pkg, _name, _description);
        String _name_1 = primitiveType.getName();
        UMLMapping.generatedTypes.put(_name_1, primitiveType);
      } else {
        String _name_2 = v.getName();
        String _description_1 = v.getDescription();
        Enumeration enumeratedType = UMLMapping.createEnumeratedType(pkg, _name_2, _description_1);
        String _name_3 = enumeratedType.getName();
        UMLMapping.generatedTypes.put(_name_3, enumeratedType);
        SpecsType _specs_2 = v.getSpecs();
        EList<SpecialType> _special_2 = _specs_2.getSpecial();
        for (final SpecialType s : _special_2) {
          String _description_2 = s.getDescription();
          boolean _isValidName = UMLMapping.isValidName(_description_2);
          if (_isValidName) {
            String _description_3 = s.getDescription();
            enumeratedType.createOwnedLiteral(_description_3);
          }
        }
      }
    }
    Subset0267.TDefinitions _definitions_1 = dictionary.getDefinitions();
    Subset0267.TPackets _packets = _definitions_1.getPackets();
    Subset0267.TTrackToTrain _trackToTrain = _packets.getTrackToTrain();
    EList<Subset0267.TPacket> _packet = _trackToTrain.getPacket();
    Subset0267.TDefinitions _definitions_2 = dictionary.getDefinitions();
    Subset0267.TPackets _packets_1 = _definitions_2.getPackets();
    Subset0267.TTrainToTrack _trainToTrack = _packets_1.getTrainToTrack();
    EList<Subset0267.TPacket> _packet_1 = _trainToTrack.getPacket();
    Iterable<Subset0267.TPacket> _plus = Iterables.<Subset0267.TPacket>concat(_packet, _packet_1);
    for (final Subset0267.TPacket v_1 : _plus) {
      {
        String _name_4 = v_1.getName();
        String _description_4 = v_1.getDescription();
        DataType dataType = UMLMapping.createDataType(pkg, _name_4, _description_4);
        Subset0267.TContent _content = v_1.getContent();
        EList<Subset0267.TTlgVar> _tlgVar = _content.getTlgVar();
        for (final Subset0267.TTlgVar t : _tlgVar) {
          String _name_5 = t.getName();
          String _name_6 = t.getName();
          Type _get = UMLMapping.generatedTypes.get(_name_6);
          String _comment = t.getComment();
          UMLMapping.createAttribute(dataType, _name_5, _get, _comment);
        }
      }
    }
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
  
  public static Boolean createAttribute(final DataType dataType, final String name, final Type type, final String comment) {
    Boolean _xblockexpression = null;
    {
      Property attribute = dataType.createOwnedAttribute(name, type);
      Boolean _addComment = UMLMapping.addComment(attribute, comment);
      _xblockexpression = (_addComment);
    }
    return _xblockexpression;
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
  
  public static DataType createDataType(final org.eclipse.uml2.uml.Package pkg, final String name, final String comment) {
    EClass _dataType = UMLPackage.eINSTANCE.getDataType();
    PackageableElement _createPackagedElement = pkg.createPackagedElement(name, _dataType);
    DataType dataType = ((DataType) _createPackagedElement);
    UMLMapping.addComment(dataType, comment);
    return dataType;
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
