package org.openetcs.sysml2scade.suite.transformation;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.papyrus.sysml.portandflows.FlowPort;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

@SuppressWarnings("all")
public class MapToScade /* implements ScadeModelWriter  */{
  private URI baseURI;
  
  private ResourceSet sysmlResourceSet;
  
  private ResourceSet scadeResourceSet;
  
  private Model sysmlModel;
  
  private Package scadeModel;
  
  private Package typePackage;
  
  private /* ScadeFactory */Object theScadeFactory;
  
  private /* EditorPragmasFactory */Object theEditorPragmasFactory;
  
  private /* Project */Object scadeProject;
  
  private /* Map<Block,Operator> */Object blockToOperatorMap;
  
  public MapToScade(final Model model, final IProject project) {
    throw new Error("Unresolved compilation problems:"
      + "\nOperator cannot be resolved to a type."
      + "\nThe method or field ScadePackage is undefined for the type MapToScade"
      + "\nThe method or field EditorPragmasPackage is undefined for the type MapToScade"
      + "\nThe method createEmptyScadeProject is undefined for the type MapToScade"
      + "\nThe method loadModel is undefined for the type MapToScade"
      + "\nType mismatch: cannot convert from Package to EObject"
      + "\neINSTANCE cannot be resolved"
      + "\ngetScadeFactory cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ngetEditorPragmasFactory cannot be resolved");
  }
  
  public Resource createXScade(final String name) {
    String _plus = (name + ".xscade");
    final URI uriXscade = this.baseURI.appendSegment(_plus);
    return this.scadeResourceSet.createResource(uriXscade);
  }
  
  public Package createScadePackage(final String name) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreatePackage cannot be resolved"
      + "\nsetName cannot be resolved");
  }
  
  public Package iterateModel(final org.eclipse.uml2.uml.Package pkg) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getOperators is undefined for the type MapToScade"
      + "\nThe static method getPackages() should be accessed in a static way"
      + "\nType mismatch: cannot convert from Package to EObject"
      + "\nadd cannot be resolved");
  }
  
  public void createOperatorImplementation(final /* Operator */Object operator, final /* NetDiagram */Object diagram) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getType is undefined for the type MapToScade"
      + "\nThe method or field EditorPragmasUtil is undefined for the type MapToScade"
      + "\ngetInput cannot be resolved"
      + "\ngetDefinedType cannot be resolved"
      + "\ngetLocals cannot be resolved"
      + "\nadd cannot be resolved"
      + "\ncreateEquation cannot be resolved"
      + "\nsetOid cannot be resolved"
      + "\ngetLefts cannot be resolved"
      + "\nadd cannot be resolved"
      + "\ncreateIdExpression cannot be resolved"
      + "\nsetPath cannot be resolved"
      + "\nsetRight cannot be resolved"
      + "\ngetData cannot be resolved"
      + "\nadd cannot be resolved"
      + "\ncreateEquationGE cannot be resolved"
      + "\nsetEquation cannot be resolved"
      + "\ncreatePoint cannot be resolved"
      + "\nsetX cannot be resolved"
      + "\nsetY cannot be resolved"
      + "\nsetPosition cannot be resolved"
      + "\ncreateSize cannot be resolved"
      + "\nsetWidth cannot be resolved"
      + "\nsetHeight cannot be resolved"
      + "\nsetSize cannot be resolved"
      + "\ngetPresentationElements cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public Object createScadeDiagram(final /* Operator */Object operator) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateOperator cannot be resolved"
      + "\ngetPragma cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nsetNodeKind cannot be resolved"
      + "\ncreateNetDiagram cannot be resolved"
      + "\nsetName cannot be resolved"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nsetFormat cannot be resolved"
      + "\nsetLandscape cannot be resolved"
      + "\ngetDiagrams cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public Object createOperatorInterface(final Block block) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field OperatorKind is undefined for the type MapToScade"
      + "\ncreateOperator cannot be resolved"
      + "\nsetName cannot be resolved"
      + "\nsetKind cannot be resolved"
      + "\nNODE_LITERAL cannot be resolved"
      + "\ngetOutput cannot be resolved"
      + "\nadd cannot be resolved"
      + "\ngetInput cannot be resolved"
      + "\nadd cannot be resolved"
      + "\ngetInput cannot be resolved"
      + "\nadd cannot be resolved"
      + "\ngetOutput cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public Type createScadeType(final Type uml_type) {
    throw new Error("Unresolved compilation problems:"
      + "\ncom.esterel.scade.api.Type cannot be resolved to a type."
      + "\nThe method findObject is undefined for the type MapToScade"
      + "\nThe method or field ScadePackage is undefined for the type MapToScade"
      + "\nThe method getTypes is undefined for the type MapToScade"
      + "\nLiterals cannot be resolved"
      + "\nTYPE cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncreateType cannot be resolved"
      + "\nname cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public Object createNamedTypeVariable(final String name, final /* com.esterel.scade.api.Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateNamedType cannot be resolved"
      + "\nsetType cannot be resolved"
      + "\ncreateVariable cannot be resolved"
      + "\nsetName cannot be resolved"
      + "\nsetType cannot be resolved");
  }
  
  public EList<Block> getBlocks(final Element pkg) {
    BasicEList<Block> _basicEList = new BasicEList<Block>();
    BasicEList<Block> list = _basicEList;
    EList<Element> _ownedElements = pkg.getOwnedElements();
    for (final Element element : _ownedElements) {
      {
        Stereotype stereotype = element.getAppliedStereotype("SysML::Blocks::Block");
        boolean _notEquals = (!Objects.equal(stereotype, null));
        if (_notEquals) {
          EObject _stereotypeApplication = element.getStereotypeApplication(stereotype);
          list.add(((Block) _stereotypeApplication));
        }
      }
    }
    return list;
  }
  
  public void fillScadeModel() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method rearrangeAnnotations is undefined for the type MapToScade"
      + "\nThe method updateProjectWithModelFiles is undefined for the type MapToScade"
      + "\nThe method saveAll is undefined for the type MapToScade"
      + "\nThe static method getPackages() should be accessed in a static way"
      + "\nThe static method getPackages() should be accessed in a static way");
  }
  
  public void createHierarchy() {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateEquation cannot be resolved"
      + "\ncreateCallExpression cannot be resolved"
      + "\ncreateOpCall cannot be resolved"
      + "\nsetName cannot be resolved"
      + "\nsetOperator cannot be resolved"
      + "\nsetOperator cannot be resolved"
      + "\nsetRight cannot be resolved"
      + "\ngetData cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public EList<Block> getNestedBlocks(final Block block) {
    BasicEList<Block> _basicEList = new BasicEList<Block>();
    BasicEList<Block> list = _basicEList;
    org.eclipse.uml2.uml.Class _base_Class = block.getBase_Class();
    EList<Property> _ownedAttributes = _base_Class.getOwnedAttributes();
    for (final Property property : _ownedAttributes) {
      {
        Type type = property.getType();
        boolean _notEquals = (!Objects.equal(type, null));
        if (_notEquals) {
          Stereotype stereotype = type.getAppliedStereotype("SysML::Blocks::Block");
          boolean _notEquals_1 = (!Objects.equal(stereotype, null));
          if (_notEquals_1) {
            EObject _stereotypeApplication = property.getStereotypeApplication(stereotype);
            list.add(((Block) _stereotypeApplication));
          }
        }
      }
    }
    return list;
  }
  
  public static EList<Block> getAllBlocks(final Model model) {
    BasicEList<Block> _basicEList = new BasicEList<Block>();
    BasicEList<Block> list = _basicEList;
    EList<Element> _allOwnedElements = model.allOwnedElements();
    for (final Element element : _allOwnedElements) {
      {
        Stereotype stereotype = element.getAppliedStereotype("SysML::Blocks::Block");
        boolean _notEquals = (!Objects.equal(stereotype, null));
        if (_notEquals) {
          EObject _stereotypeApplication = element.getStereotypeApplication(stereotype);
          list.add(((Block) _stereotypeApplication));
        }
      }
    }
    return list;
  }
  
  /**
   * Function returning the name of a SysML Block
   * 
   * @param block The block for which the function return the Name
   * @return The name of the block
   */
  public static String name(final Block block) {
    org.eclipse.uml2.uml.Class _base_Class = block.getBase_Class();
    return _base_Class.getName();
  }
  
  public static String name(final FlowPort port) {
    Port _base_Port = port.getBase_Port();
    return _base_Port.getName();
  }
  
  public static Type type(final FlowPort port) {
    Port _base_Port = port.getBase_Port();
    return _base_Port.getType();
  }
  
  /**
   * Function returning all FlowPorts of SysML Block
   * 
   * @param block The block for which the function returns all FlowPorts
   * @return List of FlowPorts
   */
  public static EList<FlowPort> flowPorts(final Block block) {
    BasicEList<FlowPort> _basicEList = new BasicEList<FlowPort>();
    BasicEList<FlowPort> list = _basicEList;
    org.eclipse.uml2.uml.Class _base_Class = block.getBase_Class();
    EList<Port> _ownedPorts = _base_Class.getOwnedPorts();
    for (final Port port : _ownedPorts) {
      {
        Stereotype stereotype = port.getAppliedStereotype("SysML::PortAndFlows::FlowPort");
        boolean _notEquals = (!Objects.equal(stereotype, null));
        if (_notEquals) {
          EObject _stereotypeApplication = port.getStereotypeApplication(stereotype);
          list.add(((FlowPort) _stereotypeApplication));
        }
      }
    }
    return list;
  }
}
