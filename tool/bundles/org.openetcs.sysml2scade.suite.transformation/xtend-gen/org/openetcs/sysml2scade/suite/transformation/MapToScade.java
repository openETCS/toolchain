package org.openetcs.sysml2scade.suite.transformation;

import com.esterel.project.api.Project;
import com.esterel.scade.api.CallExpression;
import com.esterel.scade.api.ConstVar;
import com.esterel.scade.api.Equation;
import com.esterel.scade.api.Expression;
import com.esterel.scade.api.Flow;
import com.esterel.scade.api.IdExpression;
import com.esterel.scade.api.NamedType;
import com.esterel.scade.api.OpCall;
import com.esterel.scade.api.Operator;
import com.esterel.scade.api.OperatorKind;
import com.esterel.scade.api.Pragma;
import com.esterel.scade.api.ScadeFactory;
import com.esterel.scade.api.ScadePackage;
import com.esterel.scade.api.Type;
import com.esterel.scade.api.TypeExpression;
import com.esterel.scade.api.Variable;
import com.esterel.scade.api.pragmas.editor.Diagram;
import com.esterel.scade.api.pragmas.editor.Edge;
import com.esterel.scade.api.pragmas.editor.EditorPragmasFactory;
import com.esterel.scade.api.pragmas.editor.EditorPragmasPackage;
import com.esterel.scade.api.pragmas.editor.EquationGE;
import com.esterel.scade.api.pragmas.editor.NetDiagram;
import com.esterel.scade.api.pragmas.editor.Point;
import com.esterel.scade.api.pragmas.editor.PresentationElement;
import com.esterel.scade.api.pragmas.editor.Size;
import com.esterel.scade.api.pragmas.editor.util.EditorPragmasUtil;
import com.esterel.scade.api.util.ScadeModelReader;
import com.esterel.scade.api.util.ScadeModelWriter;
import com.google.common.base.Objects;
import de.cau.cs.kieler.core.alg.BasicProgressMonitor;
import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.kgraph.KPort;
import de.cau.cs.kieler.kiml.AbstractLayoutProvider;
import de.cau.cs.kieler.kiml.klayoutdata.KEdgeLayout;
import de.cau.cs.kieler.kiml.klayoutdata.KPoint;
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout;
import de.cau.cs.kieler.kiml.options.Direction;
import de.cau.cs.kieler.kiml.options.EdgeRouting;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.kiml.options.PortConstraints;
import de.cau.cs.kieler.kiml.options.PortLabelPlacement;
import de.cau.cs.kieler.kiml.options.PortSide;
import de.cau.cs.kieler.kiml.options.SizeConstraint;
import de.cau.cs.kieler.kiml.options.SizeOptions;
import de.cau.cs.kieler.kiml.util.KimlUtil;
import de.cau.cs.kieler.klay.layered.LayeredLayoutProvider;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.papyrus.sysml.portandflows.FlowDirection;
import org.eclipse.papyrus.sysml.portandflows.FlowPort;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.openetcs.sysml2scade.suite.transformation.Trace;

@SuppressWarnings("all")
public class MapToScade extends ScadeModelWriter {
  private final float GRAPHICAL_OFFSET = 50f;
  
  private final float OPERATOR_SPACING = 1500f;
  
  private final float PORT_SPACING = 500f;
  
  private final float PORT_HEIGHT = 300f;
  
  private final float PORT_WIDTH = 250f;
  
  private final float OPERATOR_MIN_HEIGHT = 1500f;
  
  private final float OPERATOR_MIN_WIDTH = 3000f;
  
  private final float OPERATOR_ASPECT_RATIO = 0.5f;
  
  private URI baseURI;
  
  private ResourceSet sysmlResourceSet;
  
  private ResourceSet scadeResourceSet;
  
  private XMLResource sysmlResource;
  
  private com.esterel.scade.api.Package sysmlPackage;
  
  private com.esterel.scade.api.Package scadeModel;
  
  private com.esterel.scade.api.Package typePackage;
  
  private ScadeFactory theScadeFactory;
  
  private EditorPragmasFactory theEditorPragmasFactory;
  
  private Project scadeProject;
  
  private AbstractLayoutProvider layoutProvider;
  
  private Map<Block, Operator> blockToOperatorMap;
  
  private Map<Variable, Variable> inputToVariableMap;
  
  private Map<FlowPort, Variable> flowportToOutputMap;
  
  private Map<FlowPort, Variable> flowportToInputMap;
  
  private Map<Variable, Equation> outputToEquationMap;
  
  private Trace tracefile;
  
  public MapToScade(final Model model, final IProject project, final Trace trace) {
    Resource _eResource = model.eResource();
    this.sysmlResource = ((XMLResource) _eResource);
    String _name = model.getName();
    this.initialize(project, _name, trace);
    com.esterel.scade.api.Package _iterateModel = this.iterateModel(model);
    this.sysmlPackage = _iterateModel;
  }
  
  public MapToScade(final Block block, final IProject project, final String name, final Trace trace) {
    Resource _eResource = block.eResource();
    this.sysmlResource = ((XMLResource) _eResource);
    this.initialize(project, name, trace);
    final HashMap<org.eclipse.uml2.uml.Package, com.esterel.scade.api.Package> sysmlToScadePkg = new HashMap<org.eclipse.uml2.uml.Package, com.esterel.scade.api.Package>();
    final HashMap<org.eclipse.uml2.uml.Package, Resource> sysmlToXScadePkg = new HashMap<org.eclipse.uml2.uml.Package, Resource>();
    org.eclipse.uml2.uml.Class _base_Class = block.getBase_Class();
    EObject _eContainer = _base_Class.eContainer();
    final org.eclipse.uml2.uml.Package package_ = ((org.eclipse.uml2.uml.Package) _eContainer);
    String _name = package_.getName();
    final com.esterel.scade.api.Package scadePackage = this.createScadePackage(_name);
    sysmlToScadePkg.put(package_, scadePackage);
    String _name_1 = package_.getName();
    final Resource resourcePackage = this.createXScade(_name_1);
    sysmlToXScadePkg.put(package_, resourcePackage);
    EList<EObject> _contents = resourcePackage.getContents();
    _contents.add(scadePackage);
    Operator operator = this.createOperatorInterface(block);
    this.createOperatorImplementation(operator);
    EList<Operator> _operators = scadePackage.getOperators();
    _operators.add(operator);
    this.blockToOperatorMap.put(block, operator);
    Iterable<Block> _nestedBlocks = this.getNestedBlocks(block);
    for (final Block nBlock : _nestedBlocks) {
      {
        org.eclipse.uml2.uml.Class _base_Class_1 = block.getBase_Class();
        EObject _eContainer_1 = _base_Class_1.eContainer();
        final org.eclipse.uml2.uml.Package pkg = ((org.eclipse.uml2.uml.Package) _eContainer_1);
        com.esterel.scade.api.Package scadePkg = sysmlToScadePkg.get(pkg);
        boolean _tripleEquals = (scadePkg == null);
        if (_tripleEquals) {
          String _name_2 = pkg.getName();
          com.esterel.scade.api.Package _createScadePackage = this.createScadePackage(_name_2);
          scadePkg = _createScadePackage;
          sysmlToScadePkg.put(pkg, scadePkg);
        }
        Resource resourcePkg = sysmlToXScadePkg.get(pkg);
        boolean _tripleEquals_1 = (resourcePkg == null);
        if (_tripleEquals_1) {
          String _name_3 = pkg.getName();
          Resource _createXScade = this.createXScade(_name_3);
          resourcePkg = _createXScade;
          EList<EObject> _contents_1 = resourcePkg.getContents();
          _contents_1.add(scadePkg);
          sysmlToXScadePkg.put(pkg, resourcePkg);
        }
        Operator op = this.createOperatorInterface(nBlock);
        this.createOperatorImplementation(op);
        EList<Operator> _operators_1 = scadePackage.getOperators();
        _operators_1.add(operator);
        this.blockToOperatorMap.put(block, operator);
      }
    }
    this.sysmlPackage = scadePackage;
  }
  
  private void initialize(final IProject project, final String projectName, final Trace trace) {
    ResourceSet _resourceSet = this.sysmlResource.getResourceSet();
    this.sysmlResourceSet = _resourceSet;
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    this.scadeResourceSet = _resourceSetImpl;
    IPath _location = project.getLocation();
    String _oSString = _location.toOSString();
    URI _createFileURI = URI.createFileURI(_oSString);
    this.baseURI = _createFileURI;
    final URI projectURI = this.baseURI.appendSegment((projectName + ".etp"));
    ScadeFactory _scadeFactory = ScadePackage.eINSTANCE.getScadeFactory();
    this.theScadeFactory = _scadeFactory;
    EditorPragmasFactory _editorPragmasFactory = EditorPragmasPackage.eINSTANCE.getEditorPragmasFactory();
    this.theEditorPragmasFactory = _editorPragmasFactory;
    HashMap<Block, Operator> _hashMap = new HashMap<Block, Operator>();
    this.blockToOperatorMap = _hashMap;
    LayeredLayoutProvider _layeredLayoutProvider = new LayeredLayoutProvider();
    this.layoutProvider = _layeredLayoutProvider;
    HashMap<Variable, Variable> _hashMap_1 = new HashMap<Variable, Variable>();
    this.inputToVariableMap = _hashMap_1;
    HashMap<FlowPort, Variable> _hashMap_2 = new HashMap<FlowPort, Variable>();
    this.flowportToOutputMap = _hashMap_2;
    HashMap<FlowPort, Variable> _hashMap_3 = new HashMap<FlowPort, Variable>();
    this.flowportToInputMap = _hashMap_3;
    HashMap<Variable, Equation> _hashMap_4 = new HashMap<Variable, Equation>();
    this.outputToEquationMap = _hashMap_4;
    Project _createEmptyScadeProject = ScadeModelWriter.createEmptyScadeProject(projectURI, this.scadeResourceSet);
    this.scadeProject = _createEmptyScadeProject;
    com.esterel.scade.api.Package _loadModel = ScadeModelReader.loadModel(projectURI, this.scadeResourceSet);
    this.scadeModel = _loadModel;
    com.esterel.scade.api.Package _createScadePackage = this.createScadePackage("DataDictionary");
    this.typePackage = _createScadePackage;
    final Resource resource = this.createXScade("DataDictionary");
    EList<EObject> _contents = resource.getContents();
    _contents.add(this.typePackage);
    this.tracefile = trace;
  }
  
  public Resource createXScade(final String name) {
    final URI uriXscade = this.baseURI.appendSegment((name + ".xscade"));
    return this.scadeResourceSet.createResource(uriXscade);
  }
  
  public com.esterel.scade.api.Package createScadePackage(final String name) {
    final com.esterel.scade.api.Package pkg = this.theScadeFactory.createPackage();
    pkg.setName(name);
    return pkg;
  }
  
  public com.esterel.scade.api.Package iterateModel(final org.eclipse.uml2.uml.Package pkg) {
    String _name = pkg.getName();
    final com.esterel.scade.api.Package scadePackage = this.createScadePackage(_name);
    String _name_1 = pkg.getName();
    final Resource resourcePackage = this.createXScade(_name_1);
    EList<EObject> _contents = resourcePackage.getContents();
    _contents.add(scadePackage);
    EList<Block> _blocks = this.getBlocks(pkg);
    for (final Block block : _blocks) {
      {
        final Operator operator = this.createOperatorInterface(block);
        this.createOperatorImplementation(operator);
        EList<Operator> _operators = scadePackage.getOperators();
        _operators.add(operator);
        this.blockToOperatorMap.put(block, operator);
      }
    }
    EList<org.eclipse.uml2.uml.Package> _nestedPackages = pkg.getNestedPackages();
    for (final org.eclipse.uml2.uml.Package p : _nestedPackages) {
      EList<com.esterel.scade.api.Package> _packages = scadePackage.getPackages();
      com.esterel.scade.api.Package _iterateModel = this.iterateModel(p);
      _packages.add(_iterateModel);
    }
    return scadePackage;
  }
  
  public void createOperatorImplementation(final Operator operator) {
    int i = 1;
    EList<Variable> _inputs = operator.getInputs();
    for (final Variable input : _inputs) {
      {
        TypeExpression _type = input.getType();
        Type type = ((NamedType) _type).getType();
        Variable variable = this.createNamedTypeVariable(("_L" + Integer.valueOf(i)), type);
        EList<Variable> _locals = operator.getLocals();
        _locals.add(variable);
        this.inputToVariableMap.put(input, variable);
        Equation equation = this.theScadeFactory.createEquation();
        String _generateUUID = EcoreUtil.generateUUID();
        EditorPragmasUtil.setOid(equation, _generateUUID);
        EList<Variable> _lefts = equation.getLefts();
        _lefts.add(variable);
        IdExpression idexpression = this.theScadeFactory.createIdExpression();
        idexpression.setPath(input);
        equation.setRight(idexpression);
        EList<Flow> _data = operator.getData();
        _data.add(equation);
        i = (i + 1);
      }
    }
    EList<Variable> _outputs = operator.getOutputs();
    for (final Variable output : _outputs) {
      {
        Equation equation = this.theScadeFactory.createEquation();
        String _generateUUID = EcoreUtil.generateUUID();
        EditorPragmasUtil.setOid(equation, _generateUUID);
        EList<Variable> _lefts = equation.getLefts();
        _lefts.add(output);
        EList<Flow> _data = operator.getData();
        _data.add(equation);
        this.outputToEquationMap.put(output, equation);
      }
    }
  }
  
  public NetDiagram createScadeDiagram(final Operator operator) {
    final com.esterel.scade.api.pragmas.editor.Operator operator_pragma = this.theEditorPragmasFactory.createOperator();
    EList<Pragma> _pragmas = operator.getPragmas();
    _pragmas.add(operator_pragma);
    operator_pragma.setNodeKind("graphical");
    final NetDiagram operator_diagram = this.theEditorPragmasFactory.createNetDiagram();
    String _name = operator.getName();
    String _plus = (_name + "_diagram");
    operator_diagram.setName(_plus);
    operator_diagram.setFormat("A4 (210 297)");
    operator_diagram.setLandscape(true);
    EList<Diagram> _diagrams = operator_pragma.getDiagrams();
    _diagrams.add(operator_diagram);
    return operator_diagram;
  }
  
  public Operator createOperatorInterface(final Block block) {
    final Operator operator = this.theScadeFactory.createOperator();
    String _name = MapToScade.name(block);
    operator.setName(_name);
    operator.setKind(OperatorKind.NODE_LITERAL);
    String _generateUUID = EcoreUtil.generateUUID();
    EditorPragmasUtil.setOid(operator, _generateUUID);
    String _uUID = this.getUUID(block);
    String _oid = operator.getOid();
    this.tracefile.addElement(_uUID, _oid);
    EList<FlowPort> _flowPorts = MapToScade.flowPorts(block);
    for (final FlowPort port : _flowPorts) {
      {
        org.eclipse.uml2.uml.Type _type = MapToScade.type(port);
        Type type = this.createScadeType(_type);
        FlowDirection _direction = port.getDirection();
        int _value = _direction.getValue();
        boolean _equals = (_value == FlowDirection.OUT_VALUE);
        if (_equals) {
          String _name_1 = MapToScade.name(port);
          Variable variable = this.createNamedTypeVariable(_name_1, type);
          EList<Variable> _outputs = operator.getOutputs();
          _outputs.add(variable);
          this.flowportToOutputMap.put(port, variable);
          String _uUID_1 = this.getUUID(port);
          String _oid_1 = variable.getOid();
          this.tracefile.addElement(_uUID_1, _oid_1);
        } else {
          FlowDirection _direction_1 = port.getDirection();
          int _value_1 = _direction_1.getValue();
          boolean _equals_1 = (_value_1 == FlowDirection.IN_VALUE);
          if (_equals_1) {
            String _name_2 = MapToScade.name(port);
            Variable variable_1 = this.createNamedTypeVariable(_name_2, type);
            EList<Variable> _inputs = operator.getInputs();
            _inputs.add(variable_1);
            this.flowportToInputMap.put(port, variable_1);
            String _uUID_2 = this.getUUID(port);
            String _oid_2 = variable_1.getOid();
            this.tracefile.addElement(_uUID_2, _oid_2);
          } else {
            FlowDirection _direction_2 = port.getDirection();
            int _value_2 = _direction_2.getValue();
            boolean _equals_2 = (_value_2 == FlowDirection.INOUT_VALUE);
            if (_equals_2) {
              String _name_3 = MapToScade.name(port);
              String _plus = ("input_" + _name_3);
              Variable variable_2 = this.createNamedTypeVariable(_plus, type);
              EList<Variable> _inputs_1 = operator.getInputs();
              _inputs_1.add(variable_2);
              this.flowportToInputMap.put(port, variable_2);
              String _uUID_3 = this.getUUID(port);
              String _oid_3 = variable_2.getOid();
              this.tracefile.addElement(_uUID_3, _oid_3);
              String _name_4 = MapToScade.name(port);
              String _plus_1 = ("output_" + _name_4);
              Variable _createNamedTypeVariable = this.createNamedTypeVariable(_plus_1, type);
              variable_2 = _createNamedTypeVariable;
              EList<Variable> _outputs_1 = operator.getOutputs();
              _outputs_1.add(variable_2);
              this.flowportToOutputMap.put(port, variable_2);
              String _uUID_4 = this.getUUID(port);
              String _oid_4 = variable_2.getOid();
              this.tracefile.addElement(_uUID_4, _oid_4);
            }
          }
        }
      }
    }
    return operator;
  }
  
  public Type createScadeType(final org.eclipse.uml2.uml.Type uml_type) {
    String type_name = "int";
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(uml_type, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _name = uml_type.getName();
      boolean _notEquals_1 = (!Objects.equal(_name, null));
      _and = _notEquals_1;
    }
    if (_and) {
      String _name_1 = uml_type.getName();
      type_name = _name_1;
    }
    EObject _findObject = ScadeModelReader.findObject(this.typePackage, type_name, ScadePackage.Literals.TYPE);
    Type scade_type = ((Type) _findObject);
    boolean _equals = Objects.equal(scade_type, null);
    if (_equals) {
      Type _createType = this.theScadeFactory.createType();
      scade_type = _createType;
      scade_type.setName(type_name);
      EList<Type> _types = this.typePackage.getTypes();
      _types.add(scade_type);
    }
    return scade_type;
  }
  
  public Variable createNamedTypeVariable(final String name, final Type type) {
    final NamedType namedType = this.theScadeFactory.createNamedType();
    namedType.setType(type);
    final Variable variable = this.theScadeFactory.createVariable();
    variable.setName(name);
    variable.setType(namedType);
    String _generateUUID = EcoreUtil.generateUUID();
    EditorPragmasUtil.setOid(variable, _generateUUID);
    return variable;
  }
  
  public EList<Block> getBlocks(final Element pkg) {
    BasicEList<Block> list = new BasicEList<Block>();
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
    try {
      EList<com.esterel.scade.api.Package> _packages = this.scadeModel.getPackages();
      _packages.add(this.sysmlPackage);
      EList<com.esterel.scade.api.Package> _packages_1 = this.scadeModel.getPackages();
      _packages_1.add(this.typePackage);
      this.createHierarchy();
      this.createGraphical();
      this.tracefile.save();
      ScadeModelWriter.rearrangeAnnotations(this.scadeModel);
      ScadeModelWriter.updateProjectWithModelFiles(this.scadeProject);
      ScadeModelWriter.saveAll(this.scadeProject, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * TODO JUnit later
   */
  public void createHierarchy() {
    Set<Map.Entry<Block, Operator>> _entrySet = this.blockToOperatorMap.entrySet();
    for (final Map.Entry<Block, Operator> entry : _entrySet) {
      {
        Block block = entry.getKey();
        Operator operator = entry.getValue();
        int name = 1;
        EList<Variable> _locals = operator.getLocals();
        int _size = _locals.size();
        int locals_counter = (_size + 1);
        HashMap<Property, Equation> propertyToEquationMap = new HashMap<Property, Equation>();
        HashMap<Equation, HashMap<Variable, Variable>> equationToOutputToVariableMap = new HashMap<Equation, HashMap<Variable, Variable>>();
        HashMap<Equation, Operator> equationToOperatorMap = new HashMap<Equation, Operator>();
        HashMap<Equation, CallExpression> equationToCallMap = new HashMap<Equation, CallExpression>();
        HashMap<Property, HashMap<Variable, ConnectorEnd>> propertyToInputToConnectorendMap = new HashMap<Property, HashMap<Variable, ConnectorEnd>>();
        HashMap<Variable, ConnectorEnd> outputToConnectorendMap = new HashMap<Variable, ConnectorEnd>();
        EList<Property> _nestedBlocksAsProperties = this.getNestedBlocksAsProperties(block);
        for (final Property property : _nestedBlocksAsProperties) {
          {
            int _addOperatorCall = this.addOperatorCall(property, propertyToEquationMap, name, operator, equationToOperatorMap, equationToCallMap, locals_counter, equationToOutputToVariableMap);
            locals_counter = _addOperatorCall;
            name++;
          }
        }
        org.eclipse.uml2.uml.Class _base_Class = block.getBase_Class();
        EList<Connector> _ownedConnectors = _base_Class.getOwnedConnectors();
        this.mapConnectorends(_ownedConnectors, propertyToEquationMap, outputToConnectorendMap, propertyToInputToConnectorendMap);
        EList<Variable> _outputs = operator.getOutputs();
        for (final Variable destination : _outputs) {
          {
            ConnectorEnd end = outputToConnectorendMap.get(destination);
            FlowPort port = this.getFlowPort(end);
            boolean _notEquals = (!Objects.equal(port, null));
            if (_notEquals) {
              Property _partWithPort = end.getPartWithPort();
              Equation equation = propertyToEquationMap.get(_partWithPort);
              Property _partWithPort_1 = end.getPartWithPort();
              boolean _equals = Objects.equal(_partWithPort_1, null);
              if (_equals) {
                Variable input = this.flowportToInputMap.get(port);
                Variable source = this.inputToVariableMap.get(input);
                this.connectWithOutput(source, destination);
              } else {
                boolean _containsKey = equationToOutputToVariableMap.containsKey(equation);
                if (_containsKey) {
                  Variable sourcePort = this.flowportToOutputMap.get(port);
                  Variable source_1 = this.<HashMap<Variable, Variable>, Equation, Variable, Variable>get(equationToOutputToVariableMap, equation, sourcePort);
                  this.connectWithOutput(source_1, destination);
                }
              }
            }
          }
        }
        Set<Property> _keySet = propertyToInputToConnectorendMap.keySet();
        for (final Property property_1 : _keySet) {
          {
            Equation equation = propertyToEquationMap.get(property_1);
            Operator op = equationToOperatorMap.get(equation);
            CallExpression call_expression = equationToCallMap.get(equation);
            HashMap<Variable, ConnectorEnd> map = propertyToInputToConnectorendMap.get(property_1);
            boolean _and = false;
            boolean _notEquals = (!Objects.equal(op, null));
            if (!_notEquals) {
              _and = false;
            } else {
              boolean _notEquals_1 = (!Objects.equal(map, null));
              _and = _notEquals_1;
            }
            if (_and) {
              int dst_index = 1;
              EList<Variable> _inputs = op.getInputs();
              for (final Variable destination_1 : _inputs) {
                {
                  ConnectorEnd end = map.get(destination_1);
                  FlowPort port = this.getFlowPort(end);
                  boolean _notEquals_2 = (!Objects.equal(port, null));
                  if (_notEquals_2) {
                    Property _partWithPort = end.getPartWithPort();
                    boolean _equals = Objects.equal(_partWithPort, null);
                    if (_equals) {
                      Variable source = this.flowportToInputMap.get(port);
                      Variable variable = this.inputToVariableMap.get(source);
                      this.connectWithOperator(variable, call_expression);
                    } else {
                      Property _partWithPort_1 = end.getPartWithPort();
                      Equation eq = propertyToEquationMap.get(_partWithPort_1);
                      Variable sourcePort = this.flowportToOutputMap.get(port);
                      Variable source_1 = this.<HashMap<Variable, Variable>, Equation, Variable, Variable>get(equationToOutputToVariableMap, eq, sourcePort);
                      this.connectWithOperator(source_1, call_expression);
                    }
                  } else {
                    EList<Expression> _callParameters = call_expression.getCallParameters();
                    IdExpression _createIdExpression = this.theScadeFactory.createIdExpression();
                    _callParameters.add(_createIdExpression);
                  }
                  dst_index = (dst_index + 1);
                }
              }
              name = (name + 1);
            }
          }
        }
      }
    }
  }
  
  /**
   * TODO JUnit now
   */
  public int addOperatorCall(final Property property, final HashMap<Property, Equation> propertyToEquationMap, final int name, final Operator operator, final HashMap<Equation, Operator> equationToOperatorMap, final HashMap<Equation, CallExpression> equationToCallMap, final int locals_counter, final HashMap<Equation, HashMap<Variable, Variable>> equationToOutputToVariableMap) {
    org.eclipse.uml2.uml.Type _type = property.getType();
    Stereotype stereotype = _type.getAppliedStereotype("SysML::Blocks::Block");
    org.eclipse.uml2.uml.Type _type_1 = property.getType();
    EObject _stereotypeApplication = _type_1.getStereotypeApplication(stereotype);
    Block nblock = ((Block) _stereotypeApplication);
    Equation equation = this.theScadeFactory.createEquation();
    int counter = locals_counter;
    String _generateUUID = EcoreUtil.generateUUID();
    EditorPragmasUtil.setOid(equation, _generateUUID);
    propertyToEquationMap.put(property, equation);
    Operator op = this.blockToOperatorMap.get(nblock);
    boolean _notEquals = (!Objects.equal(op, null));
    if (_notEquals) {
      CallExpression call_expression = this.theScadeFactory.createCallExpression();
      OpCall call = this.theScadeFactory.createOpCall();
      String _string = Integer.valueOf(name).toString();
      call.setName(_string);
      call.setOperator(op);
      call_expression.setOperator(call);
      equation.setRight(call_expression);
      EList<Flow> _data = operator.getData();
      _data.add(equation);
      equationToOperatorMap.put(equation, op);
      equationToCallMap.put(equation, call_expression);
      EList<Variable> _outputs = op.getOutputs();
      for (final Variable output : _outputs) {
        {
          TypeExpression _type_2 = output.getType();
          Type _type_3 = ((NamedType) _type_2).getType();
          Variable variable = this.createNamedTypeVariable(("_L" + Integer.valueOf(counter)), _type_3);
          EList<Variable> _locals = operator.getLocals();
          _locals.add(variable);
          EList<Variable> _lefts = equation.getLefts();
          _lefts.add(variable);
          this.<Equation, Variable, Variable>put(equationToOutputToVariableMap, equation, output, variable);
          counter = (counter + 1);
        }
      }
    } else {
      propertyToEquationMap.remove(property);
    }
    return counter;
  }
  
  public void mapConnectorends(final EList<Connector> list, final HashMap<Property, Equation> propertyToEquationMap, final HashMap<Variable, ConnectorEnd> outputToConnectorendMap, final HashMap<Property, HashMap<Variable, ConnectorEnd>> propertyToInputToConnectorendMap) {
    for (final Connector connector : list) {
      {
        EList<ConnectorEnd> _ends = connector.getEnds();
        ConnectorEnd end1 = _ends.get(0);
        EList<ConnectorEnd> _ends_1 = connector.getEnds();
        ConnectorEnd end2 = _ends_1.get(1);
        FlowPort port = this.getFlowPort(end1);
        boolean _and = false;
        boolean _and_1 = false;
        boolean _notEquals = (!Objects.equal(port, null));
        if (!_notEquals) {
          _and_1 = false;
        } else {
          boolean _or = false;
          FlowDirection _direction = port.getDirection();
          int _value = _direction.getValue();
          boolean _equals = (_value == FlowDirection.IN_VALUE);
          if (_equals) {
            _or = true;
          } else {
            FlowDirection _direction_1 = port.getDirection();
            int _value_1 = _direction_1.getValue();
            boolean _equals_1 = (_value_1 == FlowDirection.INOUT_VALUE);
            _or = _equals_1;
          }
          _and_1 = _or;
        }
        if (!_and_1) {
          _and = false;
        } else {
          Property _partWithPort = end1.getPartWithPort();
          boolean _notEquals_1 = (!Objects.equal(_partWithPort, null));
          _and = _notEquals_1;
        }
        if (_and) {
          Property _partWithPort_1 = end1.getPartWithPort();
          Variable _get = this.flowportToInputMap.get(port);
          this.<Property, Variable, ConnectorEnd>put(propertyToInputToConnectorendMap, _partWithPort_1, _get, end2);
        }
        boolean _and_2 = false;
        boolean _and_3 = false;
        boolean _notEquals_2 = (!Objects.equal(port, null));
        if (!_notEquals_2) {
          _and_3 = false;
        } else {
          boolean _or_1 = false;
          FlowDirection _direction_2 = port.getDirection();
          int _value_2 = _direction_2.getValue();
          boolean _equals_2 = (_value_2 == FlowDirection.OUT_VALUE);
          if (_equals_2) {
            _or_1 = true;
          } else {
            FlowDirection _direction_3 = port.getDirection();
            int _value_3 = _direction_3.getValue();
            boolean _equals_3 = (_value_3 == FlowDirection.INOUT_VALUE);
            _or_1 = _equals_3;
          }
          _and_3 = _or_1;
        }
        if (!_and_3) {
          _and_2 = false;
        } else {
          Property _partWithPort_2 = end1.getPartWithPort();
          boolean _equals_4 = Objects.equal(_partWithPort_2, null);
          _and_2 = _equals_4;
        }
        if (_and_2) {
          Variable _get_1 = this.flowportToOutputMap.get(port);
          outputToConnectorendMap.put(_get_1, end2);
        }
        FlowPort _flowPort = this.getFlowPort(end2);
        port = _flowPort;
        boolean _and_4 = false;
        boolean _and_5 = false;
        boolean _notEquals_3 = (!Objects.equal(port, null));
        if (!_notEquals_3) {
          _and_5 = false;
        } else {
          boolean _or_2 = false;
          FlowDirection _direction_4 = port.getDirection();
          int _value_4 = _direction_4.getValue();
          boolean _equals_5 = (_value_4 == FlowDirection.IN_VALUE);
          if (_equals_5) {
            _or_2 = true;
          } else {
            FlowDirection _direction_5 = port.getDirection();
            int _value_5 = _direction_5.getValue();
            boolean _equals_6 = (_value_5 == FlowDirection.INOUT_VALUE);
            _or_2 = _equals_6;
          }
          _and_5 = _or_2;
        }
        if (!_and_5) {
          _and_4 = false;
        } else {
          Property _partWithPort_3 = end2.getPartWithPort();
          boolean _notEquals_4 = (!Objects.equal(_partWithPort_3, null));
          _and_4 = _notEquals_4;
        }
        if (_and_4) {
          Property _partWithPort_4 = end2.getPartWithPort();
          Variable _get_2 = this.flowportToInputMap.get(port);
          this.<Property, Variable, ConnectorEnd>put(propertyToInputToConnectorendMap, _partWithPort_4, _get_2, end1);
        }
        boolean _and_6 = false;
        boolean _and_7 = false;
        boolean _notEquals_5 = (!Objects.equal(port, null));
        if (!_notEquals_5) {
          _and_7 = false;
        } else {
          boolean _or_3 = false;
          FlowDirection _direction_6 = port.getDirection();
          int _value_6 = _direction_6.getValue();
          boolean _equals_7 = (_value_6 == FlowDirection.OUT_VALUE);
          if (_equals_7) {
            _or_3 = true;
          } else {
            FlowDirection _direction_7 = port.getDirection();
            int _value_7 = _direction_7.getValue();
            boolean _equals_8 = (_value_7 == FlowDirection.INOUT_VALUE);
            _or_3 = _equals_8;
          }
          _and_7 = _or_3;
        }
        if (!_and_7) {
          _and_6 = false;
        } else {
          Property _partWithPort_5 = end2.getPartWithPort();
          boolean _equals_9 = Objects.equal(_partWithPort_5, null);
          _and_6 = _equals_9;
        }
        if (_and_6) {
          Variable _get_3 = this.flowportToOutputMap.get(port);
          outputToConnectorendMap.put(_get_3, end1);
        }
      }
    }
  }
  
  public void createGraphical() {
    Collection<Operator> _values = this.blockToOperatorMap.values();
    for (final Operator operator : _values) {
      {
        HashMap<Variable, Equation> inputMap = new HashMap<Variable, Equation>();
        HashMap<Variable, Equation> outputMap = new HashMap<Variable, Equation>();
        LinkedList<Equation> callList = new LinkedList<Equation>();
        EList<Flow> _data = operator.getData();
        for (final Flow elem : _data) {
          {
            Equation equation = ((Equation) elem);
            boolean _and = false;
            EList<Variable> _lefts = equation.getLefts();
            int _size = _lefts.size();
            boolean _equals = (_size == 1);
            if (!_equals) {
              _and = false;
            } else {
              EList<Variable> _outputs = operator.getOutputs();
              EList<Variable> _lefts_1 = equation.getLefts();
              Variable _get = _lefts_1.get(0);
              boolean _contains = _outputs.contains(_get);
              _and = _contains;
            }
            if (_and) {
              EList<Variable> _lefts_2 = equation.getLefts();
              Variable _get_1 = _lefts_2.get(0);
              outputMap.put(_get_1, equation);
            } else {
              Expression _right = equation.getRight();
              if ((_right instanceof IdExpression)) {
                Expression _right_1 = equation.getRight();
                ConstVar _path = ((IdExpression) _right_1).getPath();
                inputMap.put(((Variable) _path), equation);
              } else {
                callList.add(equation);
              }
            }
          }
        }
        HashMap<KPort, Equation> portToEquation = new HashMap<KPort, Equation>();
        HashMap<Variable, KPort> localsToSourcePort = new HashMap<Variable, KPort>();
        HashMap<Equation, KNode> callToNode = new HashMap<Equation, KNode>();
        KNode pNode = KimlUtil.createInitializedNode();
        HashMap<KPort, Integer> portToIndex = new HashMap<KPort, Integer>();
        for (int i = 0; (i < operator.getInputs().size()); i++) {
          {
            EList<Variable> _inputs = operator.getInputs();
            Variable input = _inputs.get(i);
            KPort port = KimlUtil.createInitializedPort();
            port.setNode(pNode);
            this.setSide(port, PortSide.WEST);
            KLabel portLabel = KimlUtil.createInitializedLabel(port);
            String _name = input.getName();
            portLabel.setText(_name);
            Equation equation = inputMap.get(input);
            portToEquation.put(port, equation);
            portToIndex.put(port, Integer.valueOf(1));
            EList<Variable> _lefts = equation.getLefts();
            Variable _get = _lefts.get(0);
            localsToSourcePort.put(_get, port);
          }
        }
        for (final Equation equation : callList) {
          {
            KNode cNode = KimlUtil.createInitializedNode();
            cNode.setParent(pNode);
            callToNode.put(equation, cNode);
            for (int i = 0; (i < equation.getLefts().size()); i++) {
              {
                EList<Variable> _lefts = equation.getLefts();
                Variable output = _lefts.get(i);
                KPort port = KimlUtil.createInitializedPort();
                port.setNode(cNode);
                this.setSide(port, PortSide.EAST);
                localsToSourcePort.put(output, port);
                portToEquation.put(port, equation);
                portToIndex.put(port, Integer.valueOf((i + 1)));
              }
            }
          }
        }
        for (int i = 0; (i < operator.getOutputs().size()); i++) {
          {
            EList<Variable> _outputs = operator.getOutputs();
            Variable output = _outputs.get(i);
            KPort port = KimlUtil.createInitializedPort();
            port.setNode(pNode);
            this.setSide(port, PortSide.EAST);
            KLabel portLabel = KimlUtil.createInitializedLabel(port);
            String _name = output.getName();
            portLabel.setText(_name);
            Equation equation_1 = outputMap.get(output);
            portToEquation.put(port, equation_1);
            portToIndex.put(port, Integer.valueOf(1));
            Expression idExpression = equation_1.getRight();
            boolean _notEquals = (!Objects.equal(idExpression, null));
            if (_notEquals) {
              ConstVar _path = ((IdExpression) idExpression).getPath();
              Variable source = ((Variable) _path);
              boolean _notEquals_1 = (!Objects.equal(source, null));
              if (_notEquals_1) {
                KPort _get = localsToSourcePort.get(source);
                this.addEdgeTo(_get, port);
              }
            }
          }
        }
        for (final Equation equation_1 : callList) {
          {
            Expression _right = equation_1.getRight();
            EList<Expression> parameters = ((CallExpression) _right).getCallParameters();
            for (int i = parameters.size(); (i > 0); i--) {
              {
                Expression _get = parameters.get((i - 1));
                IdExpression expression = ((IdExpression) _get);
                KNode cNode = callToNode.get(equation_1);
                KPort port = KimlUtil.createInitializedPort();
                port.setNode(cNode);
                this.setSide(port, PortSide.WEST);
                portToEquation.put(port, equation_1);
                portToIndex.put(port, Integer.valueOf(i));
                ConstVar source = expression.getPath();
                boolean _notEquals = (!Objects.equal(source, null));
                if (_notEquals) {
                  KPort _get_1 = localsToSourcePort.get(source);
                  this.addEdgeTo(_get_1, port);
                }
              }
            }
          }
        }
        this.addLayoutOptions(pNode);
        BasicProgressMonitor progressMonitor = new BasicProgressMonitor();
        this.layoutProvider.doLayout(pNode, progressMonitor);
        NetDiagram diagram = this.createScadeDiagram(operator);
        this.fillDiagram(diagram, pNode, callToNode, portToEquation, portToIndex);
      }
    }
  }
  
  public void fillDiagram(final NetDiagram diagram, final KNode pNode, final Map<Equation, KNode> callToNode, final Map<KPort, Equation> portToEquation, final Map<KPort, Integer> portToIndex) {
    HashMap<Equation, EquationGE> equationToGraphical = new HashMap<Equation, EquationGE>();
    Set<Map.Entry<Equation, KNode>> _entrySet = callToNode.entrySet();
    for (final Map.Entry<Equation, KNode> entry : _entrySet) {
      {
        Equation equation = entry.getKey();
        KNode _value = entry.getValue();
        KShapeLayout node = _value.<KShapeLayout>getData(KShapeLayout.class);
        float _xpos = node.getXpos();
        float _ypos = node.getYpos();
        float _width = node.getWidth();
        float _height = node.getHeight();
        EquationGE graphical = this.createEquationGE(equation, ((int) _xpos), ((int) _ypos), ((int) _width), 
          ((int) _height));
        EList<PresentationElement> _presentationElements = diagram.getPresentationElements();
        _presentationElements.add(graphical);
        equationToGraphical.put(equation, graphical);
      }
    }
    EList<KPort> _ports = pNode.getPorts();
    for (final KPort port : _ports) {
      EList<KEdge> _edges = port.getEdges();
      int _size = _edges.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        Equation equation = portToEquation.get(port);
        KShapeLayout layout = port.<KShapeLayout>getData(KShapeLayout.class);
        float _xpos = layout.getXpos();
        float _ypos = layout.getYpos();
        float _width = layout.getWidth();
        float _height = layout.getHeight();
        EquationGE graphical = this.createEquationGE(equation, ((int) _xpos), ((int) _ypos), ((int) _width), 
          ((int) _height));
        EList<PresentationElement> _presentationElements = diagram.getPresentationElements();
        _presentationElements.add(graphical);
        equationToGraphical.put(equation, graphical);
      }
    }
    LinkedList<KEdge> edgesList = new LinkedList<KEdge>();
    EList<KEdge> _incomingEdges = pNode.getIncomingEdges();
    for (final KEdge edge : _incomingEdges) {
      edgesList.add(edge);
    }
    EList<KNode> _children = pNode.getChildren();
    for (final KNode cNode : _children) {
      EList<KEdge> _incomingEdges_1 = cNode.getIncomingEdges();
      for (final KEdge edge_1 : _incomingEdges_1) {
        edgesList.add(edge_1);
      }
    }
    for (final KEdge kEdge : edgesList) {
      {
        Edge sEdge = this.theEditorPragmasFactory.createEdge();
        KPort srcPort = kEdge.getSourcePort();
        KPort dstPort = kEdge.getTargetPort();
        Integer _get = portToIndex.get(srcPort);
        sEdge.setLeftVarIndex((_get).intValue());
        Integer _get_1 = portToIndex.get(dstPort);
        sEdge.setRightExprIndex((_get_1).intValue());
        Equation _get_2 = portToEquation.get(srcPort);
        EquationGE _get_3 = equationToGraphical.get(_get_2);
        sEdge.setSrcEquation(_get_3);
        Equation _get_4 = portToEquation.get(dstPort);
        EquationGE _get_5 = equationToGraphical.get(_get_4);
        sEdge.setDstEquation(_get_5);
        KEdgeLayout layout_1 = kEdge.<KEdgeLayout>getData(KEdgeLayout.class);
        Point point = this.theEditorPragmasFactory.createPoint();
        KPoint _sourcePoint = layout_1.getSourcePoint();
        float _x = _sourcePoint.getX();
        point.setX(((int) _x));
        KPoint _sourcePoint_1 = layout_1.getSourcePoint();
        float _y = _sourcePoint_1.getY();
        point.setY(((int) _y));
        EList<Point> _positions = sEdge.getPositions();
        _positions.add(point);
        Point previousPoint = point;
        EList<KPoint> _bendPoints = layout_1.getBendPoints();
        for (final KPoint bendPoint : _bendPoints) {
          {
            Point _createPoint = this.theEditorPragmasFactory.createPoint();
            point = _createPoint;
            float _x_1 = bendPoint.getX();
            point.setX(((int) _x_1));
            float _y_1 = bendPoint.getY();
            point.setY(((int) _y_1));
            boolean _or = false;
            int _x_2 = previousPoint.getX();
            int _x_3 = point.getX();
            boolean _notEquals = (_x_2 != _x_3);
            if (_notEquals) {
              _or = true;
            } else {
              int _y_2 = previousPoint.getY();
              int _y_3 = point.getY();
              boolean _notEquals_1 = (_y_2 != _y_3);
              _or = _notEquals_1;
            }
            if (_or) {
              EList<Point> _positions_1 = sEdge.getPositions();
              _positions_1.add(point);
              previousPoint = point;
            }
          }
        }
        Point _createPoint = this.theEditorPragmasFactory.createPoint();
        point = _createPoint;
        KPoint _targetPoint = layout_1.getTargetPoint();
        float _x_1 = _targetPoint.getX();
        point.setX(((int) _x_1));
        KPoint _targetPoint_1 = layout_1.getTargetPoint();
        float _y_1 = _targetPoint_1.getY();
        point.setY(((int) _y_1));
        boolean _or = false;
        int _x_2 = previousPoint.getX();
        int _x_3 = point.getX();
        boolean _notEquals = (_x_2 != _x_3);
        if (_notEquals) {
          _or = true;
        } else {
          int _y_2 = previousPoint.getY();
          int _y_3 = point.getY();
          boolean _notEquals_1 = (_y_2 != _y_3);
          _or = _notEquals_1;
        }
        if (_or) {
          EList<Point> _positions_1 = sEdge.getPositions();
          _positions_1.add(point);
        }
        EList<PresentationElement> _presentationElements_1 = diagram.getPresentationElements();
        _presentationElements_1.add(sEdge);
      }
    }
  }
  
  public void addLayoutOptions(final KNode pNode) {
    KShapeLayout pLayout = pNode.<KShapeLayout>getData(KShapeLayout.class);
    pLayout.<Direction>setProperty(LayoutOptions.DIRECTION, Direction.RIGHT);
    pLayout.<EdgeRouting>setProperty(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL);
    pLayout.<PortConstraints>setProperty(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE);
    EnumSet<SizeConstraint> _free = SizeConstraint.free();
    pLayout.<EnumSet<SizeConstraint>>setProperty(LayoutOptions.SIZE_CONSTRAINT, _free);
    EnumSet<SizeOptions> _of = EnumSet.<SizeOptions>of(SizeOptions.COMPUTE_INSETS);
    pLayout.<EnumSet<SizeOptions>>setProperty(LayoutOptions.SIZE_OPTIONS, _of);
    pLayout.<Float>setProperty(LayoutOptions.SPACING, Float.valueOf(this.OPERATOR_SPACING));
    pLayout.<String>setProperty(LayoutOptions.ALGORITHM, "DataFlow");
    pLayout.<PortLabelPlacement>setProperty(LayoutOptions.PORT_LABEL_PLACEMENT, PortLabelPlacement.INSIDE);
    pLayout.<Float>setProperty(LayoutOptions.PORT_SPACING, Float.valueOf(this.PORT_SPACING));
    pLayout.<Float>setProperty(LayoutOptions.BORDER_SPACING, Float.valueOf(this.GRAPHICAL_OFFSET));
    EList<KPort> _ports = pNode.getPorts();
    for (final KPort port : _ports) {
      {
        KShapeLayout portLayout = port.<KShapeLayout>getData(KShapeLayout.class);
        EnumSet<SizeConstraint> _fixed = SizeConstraint.fixed();
        portLayout.<EnumSet<SizeConstraint>>setProperty(LayoutOptions.SIZE_CONSTRAINT, _fixed);
        portLayout.<Float>setProperty(LayoutOptions.OFFSET, Float.valueOf(((this.PORT_WIDTH + this.GRAPHICAL_OFFSET) * (-1))));
        portLayout.setHeight(this.PORT_HEIGHT);
        portLayout.setWidth(this.PORT_WIDTH);
      }
    }
    EList<KNode> _children = pNode.getChildren();
    for (final KNode cNode : _children) {
      {
        KShapeLayout cLayout = cNode.<KShapeLayout>getData(KShapeLayout.class);
        cLayout.<PortConstraints>setProperty(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER);
        EnumSet<SizeConstraint> _free_1 = SizeConstraint.free();
        cLayout.<EnumSet<SizeConstraint>>setProperty(LayoutOptions.SIZE_CONSTRAINT, _free_1);
        EnumSet<SizeOptions> _of_1 = EnumSet.<SizeOptions>of(SizeOptions.COMPUTE_INSETS, SizeOptions.MINIMUM_SIZE_ACCOUNTS_FOR_INSETS);
        cLayout.<EnumSet<SizeOptions>>setProperty(LayoutOptions.SIZE_OPTIONS, _of_1);
        cLayout.<Float>setProperty(LayoutOptions.MIN_WIDTH, Float.valueOf(this.OPERATOR_MIN_WIDTH));
        cLayout.<Float>setProperty(LayoutOptions.MIN_HEIGHT, Float.valueOf(this.OPERATOR_MIN_HEIGHT));
        cLayout.<Float>setProperty(LayoutOptions.PORT_SPACING, Float.valueOf((this.OPERATOR_MIN_HEIGHT / 5)));
        cLayout.<Float>setProperty(LayoutOptions.BORDER_SPACING, Float.valueOf((this.OPERATOR_MIN_HEIGHT / 5)));
        cLayout.<Float>setProperty(LayoutOptions.ASPECT_RATIO, Float.valueOf(this.OPERATOR_ASPECT_RATIO));
      }
    }
  }
  
  public EquationGE createEquationGE(final Equation equation, final int xpos, final int ypos, final int width, final int height) {
    EquationGE equation_ge = this.theEditorPragmasFactory.createEquationGE();
    equation_ge.setEquation(equation);
    Point point = this.theEditorPragmasFactory.createPoint();
    point.setX(xpos);
    point.setY(ypos);
    equation_ge.setPosition(point);
    Size size = this.theEditorPragmasFactory.createSize();
    size.setWidth(width);
    size.setHeight(height);
    equation_ge.setSize(size);
    return equation_ge;
  }
  
  public void setSide(final KPort port, final PortSide side) {
    KShapeLayout portLayout = port.<KShapeLayout>getData(KShapeLayout.class);
    portLayout.<PortSide>setProperty(LayoutOptions.PORT_SIDE, side);
  }
  
  public boolean addEdgeTo(final KPort source, final KPort target) {
    boolean _xblockexpression = false;
    {
      KEdge edge = KimlUtil.createInitializedEdge();
      edge.setTargetPort(target);
      KNode _node = target.getNode();
      edge.setTarget(_node);
      EList<KEdge> _edges = target.getEdges();
      _edges.add(edge);
      edge.setSourcePort(source);
      KNode _node_1 = source.getNode();
      edge.setSource(_node_1);
      EList<KEdge> _edges_1 = source.getEdges();
      _xblockexpression = _edges_1.add(edge);
    }
    return _xblockexpression;
  }
  
  public boolean connectWithOperator(final Variable source, final CallExpression call) {
    boolean _xblockexpression = false;
    {
      IdExpression idexpression = this.theScadeFactory.createIdExpression();
      idexpression.setPath(source);
      EList<Expression> _callParameters = call.getCallParameters();
      _xblockexpression = _callParameters.add(idexpression);
    }
    return _xblockexpression;
  }
  
  public void connectWithOutput(final Variable source, final Variable destination) {
    Equation equation = this.outputToEquationMap.get(destination);
    IdExpression idexpression = this.theScadeFactory.createIdExpression();
    idexpression.setPath(source);
    equation.setRight(idexpression);
    EList<Variable> _lefts = equation.getLefts();
    _lefts.add(destination);
  }
  
  public FlowPort getFlowPort(final ConnectorEnd end) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(end, null));
    if (!_notEquals) {
      _and = false;
    } else {
      ConnectableElement _role = end.getRole();
      boolean _notEquals_1 = (!Objects.equal(_role, null));
      _and = _notEquals_1;
    }
    if (_and) {
      ConnectableElement _role_1 = end.getRole();
      Stereotype stereotype = _role_1.getAppliedStereotype("SysML::PortAndFlows::FlowPort");
      boolean _notEquals_2 = (!Objects.equal(stereotype, null));
      if (_notEquals_2) {
        ConnectableElement _role_2 = end.getRole();
        EObject _stereotypeApplication = _role_2.getStereotypeApplication(stereotype);
        return ((FlowPort) _stereotypeApplication);
      }
    }
    return null;
  }
  
  public ConnectorEnd getOppositeEnd(final ConnectorEnd end) {
    EObject _eContainer = end.eContainer();
    EList<ConnectorEnd> list = ((Connector) _eContainer).getEnds();
    ConnectorEnd _get = list.get(0);
    boolean _equals = Objects.equal(_get, end);
    if (_equals) {
      return list.get(1);
    }
    return list.get(0);
  }
  
  /**
   * Puts an element in a HashMap within a Map. If the inner map does not exist it will be created
   * 
   * @param <KEY1> The type of the key of the outer map
   * @param <KEY2> The type of the key of the inner map
   * @param <ELEM> The type of the element which to put in the inner map
   * @param map The outer map
   * @param key1 The key for the outer map
   * @param key2 The key for the inner map
   * @param element The element which to add
   */
  public <KEY1 extends Object, KEY2 extends Object, ELEM extends Object> ELEM put(final Map<KEY1, HashMap<KEY2, ELEM>> map, final KEY1 key1, final KEY2 key2, final ELEM element) {
    ELEM _xblockexpression = null;
    {
      boolean _containsKey = map.containsKey(key1);
      boolean _not = (!_containsKey);
      if (_not) {
        HashMap<KEY2, ELEM> _hashMap = new HashMap<KEY2, ELEM>();
        map.put(key1, _hashMap);
      }
      HashMap<KEY2, ELEM> _get = map.get(key1);
      _xblockexpression = _get.put(key2, element);
    }
    return _xblockexpression;
  }
  
  /**
   * Function returning an element of a map within a map using two keys or null if does not exist
   * 
   * @param <M> The type of the nested Map
   * @param <KEY1> The type of the keys of the outer map
   * @param <KEY2> The type of the keys of the inner map
   * @param <ELEM> The type of the returning element
   * @param map The outer map
   * @param key1 The key for the outer map
   * @param key2 The key for the inner map
   * @return The element which to get or null if does not exist
   */
  public <M extends Map<KEY2, ELEM>, KEY1 extends Object, KEY2 extends Object, ELEM extends Object> ELEM get(final Map<KEY1, M> map, final KEY1 key1, final KEY2 key2) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(map, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(key1, null));
      _and_1 = _notEquals_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _notEquals_2 = (!Objects.equal(key2, null));
      _and = _notEquals_2;
    }
    if (_and) {
      M innerMap = map.get(key1);
      boolean _notEquals_3 = (!Objects.equal(innerMap, null));
      if (_notEquals_3) {
        return innerMap.get(key2);
      }
    }
    return null;
  }
  
  public EList<Property> getNestedBlocksAsProperties(final Block block) {
    BasicEList<Property> list = new BasicEList<Property>();
    org.eclipse.uml2.uml.Class _base_Class = block.getBase_Class();
    EList<Property> _ownedAttributes = _base_Class.getOwnedAttributes();
    for (final Property property : _ownedAttributes) {
      {
        org.eclipse.uml2.uml.Type type = property.getType();
        boolean _notEquals = (!Objects.equal(type, null));
        if (_notEquals) {
          Stereotype stereotype = type.getAppliedStereotype("SysML::Blocks::Block");
          boolean _notEquals_1 = (!Objects.equal(stereotype, null));
          if (_notEquals_1) {
            list.add(property);
          }
        }
      }
    }
    return list;
  }
  
  public Iterable<Block> getNestedBlocks(final Block block) {
    HashSet<Block> set = new HashSet<Block>();
    org.eclipse.uml2.uml.Class _base_Class = block.getBase_Class();
    EList<Property> _ownedAttributes = _base_Class.getOwnedAttributes();
    for (final Property property : _ownedAttributes) {
      {
        org.eclipse.uml2.uml.Type type = property.getType();
        boolean _notEquals = (!Objects.equal(type, null));
        if (_notEquals) {
          Stereotype stereotype = type.getAppliedStereotype("SysML::Blocks::Block");
          boolean _notEquals_1 = (!Objects.equal(stereotype, null));
          if (_notEquals_1) {
            EObject _stereotypeApplication = type.getStereotypeApplication(stereotype);
            set.add(((Block) _stereotypeApplication));
          }
        }
      }
    }
    return set;
  }
  
  public String getUUID(final EObject object) {
    return this.sysmlResource.getID(object);
  }
  
  /**
   * Function returning all blocks of a SysML Model
   * 
   * @param model The model for which the function return the blocks
   * @return A list of all blocks of the model
   */
  public static EList<Block> getAllBlocks(final Model model) {
    BasicEList<Block> list = new BasicEList<Block>();
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
  
  /**
   * Function returning the name of a Port
   * 
   * @param port The port for which the function return the Name
   * @return The name of the port
   */
  public static String name(final FlowPort port) {
    Port _base_Port = port.getBase_Port();
    return _base_Port.getName();
  }
  
  /**
   * Function returning the type of a Port
   * 
   * @param port The port for which the function return the type
   * @return The type of the port
   */
  public static org.eclipse.uml2.uml.Type type(final FlowPort port) {
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
    BasicEList<FlowPort> list = new BasicEList<FlowPort>();
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
