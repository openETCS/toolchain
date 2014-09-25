/**
 */
package ClassicalB;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ClassicalB.ClassicalBFactory
 * @model kind="package"
 * @generated
 */
public interface ClassicalBPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ClassicalB";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://classicalb/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "classicalb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassicalBPackage eINSTANCE = ClassicalB.impl.ClassicalBPackageImpl.init();

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BModuleImpl <em>BModule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BModuleImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBModule()
	 * @generated
	 */
	int BMODULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMODULE__NAME = 0;

	/**
	 * The number of structural features of the '<em>BModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMODULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BAbstractMachineImpl <em>BAbstract Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BAbstractMachineImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBAbstractMachine()
	 * @generated
	 */
	int BABSTRACT_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__NAME = BMODULE__NAME;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__REFINEMENT = BMODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__CONSTRAINTS = BMODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__SEES = BMODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__INCLUDES = BMODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Promotes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__PROMOTES = BMODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__EXTENDS = BMODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__USES = BMODULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__SETS = BMODULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Concrete Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__CONCRETE_CONSTANTS = BMODULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Abstract Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__ABSTRACT_CONSTANTS = BMODULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__PROPERTIES = BMODULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Concrete Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__CONCRETE_VARIABLES = BMODULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Abstract Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__ABSTRACT_VARIABLES = BMODULE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__INVARIANTS = BMODULE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__ASSERTIONS = BMODULE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__INITIALIZATION = BMODULE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE__OPERATIONS = BMODULE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>BAbstract Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE_FEATURE_COUNT = BMODULE_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>BAbstract Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_MACHINE_OPERATION_COUNT = BMODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BRefinementImpl <em>BRefinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BRefinementImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBRefinement()
	 * @generated
	 */
	int BREFINEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREFINEMENT__NAME = BMODULE__NAME;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREFINEMENT__IMPLEMENTATION = BMODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BRefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREFINEMENT_FEATURE_COUNT = BMODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BRefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREFINEMENT_OPERATION_COUNT = BMODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BImplementationImpl <em>BImplementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BImplementationImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBImplementation()
	 * @generated
	 */
	int BIMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIMPLEMENTATION__NAME = BMODULE__NAME;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIMPLEMENTATION__IMPORTS = BMODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BImplementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIMPLEMENTATION_FEATURE_COUNT = BMODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BImplementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIMPLEMENTATION_OPERATION_COUNT = BMODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.ProjectImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MACHINES = 0;

	/**
	 * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REFINEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__IMPLEMENTATIONS = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BOperationImpl <em>BOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BOperationImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBOperation()
	 * @generated
	 */
	int BOPERATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>In Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOPERATION__IN_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOPERATION__OUT_PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>BOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BAbstractVariableImpl <em>BAbstract Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BAbstractVariableImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBAbstractVariable()
	 * @generated
	 */
	int BABSTRACT_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>BAbstract Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BAbstract Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BInvariantImpl <em>BInvariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BInvariantImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBInvariant()
	 * @generated
	 */
	int BINVARIANT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVARIANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVARIANT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>BInvariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVARIANT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BInvariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINVARIANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BConstraintImpl <em>BConstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BConstraintImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBConstraint()
	 * @generated
	 */
	int BCONSTRAINT = 8;

	/**
	 * The number of structural features of the '<em>BConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>BConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BSetImpl <em>BSet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BSetImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBSet()
	 * @generated
	 */
	int BSET = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSET__NAME = 0;

	/**
	 * The number of structural features of the '<em>BSet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BSet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BConcreteConstantImpl <em>BConcrete Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BConcreteConstantImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBConcreteConstant()
	 * @generated
	 */
	int BCONCRETE_CONSTANT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCRETE_CONSTANT__NAME = 0;

	/**
	 * The number of structural features of the '<em>BConcrete Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCRETE_CONSTANT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BConcrete Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCRETE_CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BAbstractConstantImpl <em>BAbstract Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BAbstractConstantImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBAbstractConstant()
	 * @generated
	 */
	int BABSTRACT_CONSTANT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_CONSTANT__NAME = 0;

	/**
	 * The number of structural features of the '<em>BAbstract Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_CONSTANT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BAbstract Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BABSTRACT_CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BPropertyImpl <em>BProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BPropertyImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBProperty()
	 * @generated
	 */
	int BPROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY__NAME = 0;

	/**
	 * The number of structural features of the '<em>BProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BConcreteVariableImpl <em>BConcrete Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BConcreteVariableImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBConcreteVariable()
	 * @generated
	 */
	int BCONCRETE_VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCRETE_VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>BConcrete Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCRETE_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BConcrete Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONCRETE_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BAssertionImpl <em>BAssertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BAssertionImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBAssertion()
	 * @generated
	 */
	int BASSERTION = 14;

	/**
	 * The number of structural features of the '<em>BAssertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASSERTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>BAssertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASSERTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BInitializationImpl <em>BInitialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BInitializationImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBInitialization()
	 * @generated
	 */
	int BINITIALIZATION = 15;

	/**
	 * The number of structural features of the '<em>BInitialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINITIALIZATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>BInitialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINITIALIZATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ClassicalB.impl.BParameterImpl <em>BParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BParameterImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBParameter()
	 * @generated
	 */
	int BPARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>BParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassicalB.impl.BTypeImpl <em>BType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassicalB.impl.BTypeImpl
	 * @see ClassicalB.impl.ClassicalBPackageImpl#getBType()
	 * @generated
	 */
	int BTYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>BType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ClassicalB.BAbstractMachine <em>BAbstract Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAbstract Machine</em>'.
	 * @see ClassicalB.BAbstractMachine
	 * @generated
	 */
	EClass getBAbstractMachine();

	/**
	 * Returns the meta object for the reference list '{@link ClassicalB.BAbstractMachine#getRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement</em>'.
	 * @see ClassicalB.BAbstractMachine#getRefinement()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Refinement();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see ClassicalB.BAbstractMachine#getConstraints()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link ClassicalB.BAbstractMachine#getSees <em>Sees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sees</em>'.
	 * @see ClassicalB.BAbstractMachine#getSees()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Sees();

	/**
	 * Returns the meta object for the reference list '{@link ClassicalB.BAbstractMachine#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see ClassicalB.BAbstractMachine#getIncludes()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Includes();

	/**
	 * Returns the meta object for the reference list '{@link ClassicalB.BAbstractMachine#getPromotes <em>Promotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Promotes</em>'.
	 * @see ClassicalB.BAbstractMachine#getPromotes()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Promotes();

	/**
	 * Returns the meta object for the reference list '{@link ClassicalB.BAbstractMachine#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see ClassicalB.BAbstractMachine#getExtends()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Extends();

	/**
	 * Returns the meta object for the reference list '{@link ClassicalB.BAbstractMachine#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see ClassicalB.BAbstractMachine#getUses()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sets</em>'.
	 * @see ClassicalB.BAbstractMachine#getSets()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Sets();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getConcreteConstants <em>Concrete Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concrete Constants</em>'.
	 * @see ClassicalB.BAbstractMachine#getConcreteConstants()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_ConcreteConstants();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getAbstractConstants <em>Abstract Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Constants</em>'.
	 * @see ClassicalB.BAbstractMachine#getAbstractConstants()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_AbstractConstants();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see ClassicalB.BAbstractMachine#getProperties()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getConcreteVariables <em>Concrete Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concrete Variables</em>'.
	 * @see ClassicalB.BAbstractMachine#getConcreteVariables()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_ConcreteVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getAbstractVariables <em>Abstract Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Variables</em>'.
	 * @see ClassicalB.BAbstractMachine#getAbstractVariables()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_AbstractVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see ClassicalB.BAbstractMachine#getInvariants()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Invariants();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see ClassicalB.BAbstractMachine#getAssertions()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Assertions();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initialization</em>'.
	 * @see ClassicalB.BAbstractMachine#getInitialization()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Initialization();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.BAbstractMachine#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see ClassicalB.BAbstractMachine#getOperations()
	 * @see #getBAbstractMachine()
	 * @generated
	 */
	EReference getBAbstractMachine_Operations();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BRefinement <em>BRefinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BRefinement</em>'.
	 * @see ClassicalB.BRefinement
	 * @generated
	 */
	EClass getBRefinement();

	/**
	 * Returns the meta object for the reference '{@link ClassicalB.BRefinement#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see ClassicalB.BRefinement#getImplementation()
	 * @see #getBRefinement()
	 * @generated
	 */
	EReference getBRefinement_Implementation();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BImplementation <em>BImplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BImplementation</em>'.
	 * @see ClassicalB.BImplementation
	 * @generated
	 */
	EClass getBImplementation();

	/**
	 * Returns the meta object for the reference list '{@link ClassicalB.BImplementation#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see ClassicalB.BImplementation#getImports()
	 * @see #getBImplementation()
	 * @generated
	 */
	EReference getBImplementation_Imports();

	/**
	 * Returns the meta object for class '{@link ClassicalB.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see ClassicalB.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.Project#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machines</em>'.
	 * @see ClassicalB.Project#getMachines()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Machines();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.Project#getRefinements <em>Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refinements</em>'.
	 * @see ClassicalB.Project#getRefinements()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Refinements();

	/**
	 * Returns the meta object for the containment reference list '{@link ClassicalB.Project#getImplementations <em>Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementations</em>'.
	 * @see ClassicalB.Project#getImplementations()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Implementations();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BModule <em>BModule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BModule</em>'.
	 * @see ClassicalB.BModule
	 * @generated
	 */
	EClass getBModule();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BModule#getName()
	 * @see #getBModule()
	 * @generated
	 */
	EAttribute getBModule_Name();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BOperation <em>BOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOperation</em>'.
	 * @see ClassicalB.BOperation
	 * @generated
	 */
	EClass getBOperation();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BOperation#getName()
	 * @see #getBOperation()
	 * @generated
	 */
	EAttribute getBOperation_Name();

	/**
	 * Returns the meta object for the reference list '{@link ClassicalB.BOperation#getInParameters <em>In Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Parameters</em>'.
	 * @see ClassicalB.BOperation#getInParameters()
	 * @see #getBOperation()
	 * @generated
	 */
	EReference getBOperation_InParameters();

	/**
	 * Returns the meta object for the reference list '{@link ClassicalB.BOperation#getOutParameters <em>Out Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Parameters</em>'.
	 * @see ClassicalB.BOperation#getOutParameters()
	 * @see #getBOperation()
	 * @generated
	 */
	EReference getBOperation_OutParameters();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BAbstractVariable <em>BAbstract Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAbstract Variable</em>'.
	 * @see ClassicalB.BAbstractVariable
	 * @generated
	 */
	EClass getBAbstractVariable();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BAbstractVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BAbstractVariable#getName()
	 * @see #getBAbstractVariable()
	 * @generated
	 */
	EAttribute getBAbstractVariable_Name();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BInvariant <em>BInvariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BInvariant</em>'.
	 * @see ClassicalB.BInvariant
	 * @generated
	 */
	EClass getBInvariant();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BInvariant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BInvariant#getName()
	 * @see #getBInvariant()
	 * @generated
	 */
	EAttribute getBInvariant_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BInvariant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ClassicalB.BInvariant#getType()
	 * @see #getBInvariant()
	 * @generated
	 */
	EAttribute getBInvariant_Type();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BConstraint <em>BConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BConstraint</em>'.
	 * @see ClassicalB.BConstraint
	 * @generated
	 */
	EClass getBConstraint();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BSet <em>BSet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSet</em>'.
	 * @see ClassicalB.BSet
	 * @generated
	 */
	EClass getBSet();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BSet#getName()
	 * @see #getBSet()
	 * @generated
	 */
	EAttribute getBSet_Name();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BConcreteConstant <em>BConcrete Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BConcrete Constant</em>'.
	 * @see ClassicalB.BConcreteConstant
	 * @generated
	 */
	EClass getBConcreteConstant();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BConcreteConstant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BConcreteConstant#getName()
	 * @see #getBConcreteConstant()
	 * @generated
	 */
	EAttribute getBConcreteConstant_Name();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BAbstractConstant <em>BAbstract Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAbstract Constant</em>'.
	 * @see ClassicalB.BAbstractConstant
	 * @generated
	 */
	EClass getBAbstractConstant();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BAbstractConstant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BAbstractConstant#getName()
	 * @see #getBAbstractConstant()
	 * @generated
	 */
	EAttribute getBAbstractConstant_Name();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BProperty <em>BProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BProperty</em>'.
	 * @see ClassicalB.BProperty
	 * @generated
	 */
	EClass getBProperty();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BProperty#getName()
	 * @see #getBProperty()
	 * @generated
	 */
	EAttribute getBProperty_Name();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BConcreteVariable <em>BConcrete Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BConcrete Variable</em>'.
	 * @see ClassicalB.BConcreteVariable
	 * @generated
	 */
	EClass getBConcreteVariable();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BConcreteVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BConcreteVariable#getName()
	 * @see #getBConcreteVariable()
	 * @generated
	 */
	EAttribute getBConcreteVariable_Name();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BAssertion <em>BAssertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BAssertion</em>'.
	 * @see ClassicalB.BAssertion
	 * @generated
	 */
	EClass getBAssertion();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BInitialization <em>BInitialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BInitialization</em>'.
	 * @see ClassicalB.BInitialization
	 * @generated
	 */
	EClass getBInitialization();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BParameter <em>BParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BParameter</em>'.
	 * @see ClassicalB.BParameter
	 * @generated
	 */
	EClass getBParameter();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BParameter#getName()
	 * @see #getBParameter()
	 * @generated
	 */
	EAttribute getBParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link ClassicalB.BParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ClassicalB.BParameter#getType()
	 * @see #getBParameter()
	 * @generated
	 */
	EReference getBParameter_Type();

	/**
	 * Returns the meta object for class '{@link ClassicalB.BType <em>BType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BType</em>'.
	 * @see ClassicalB.BType
	 * @generated
	 */
	EClass getBType();

	/**
	 * Returns the meta object for the attribute '{@link ClassicalB.BType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassicalB.BType#getName()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassicalBFactory getClassicalBFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BAbstractMachineImpl <em>BAbstract Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BAbstractMachineImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBAbstractMachine()
		 * @generated
		 */
		EClass BABSTRACT_MACHINE = eINSTANCE.getBAbstractMachine();

		/**
		 * The meta object literal for the '<em><b>Refinement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__REFINEMENT = eINSTANCE.getBAbstractMachine_Refinement();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__CONSTRAINTS = eINSTANCE.getBAbstractMachine_Constraints();

		/**
		 * The meta object literal for the '<em><b>Sees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__SEES = eINSTANCE.getBAbstractMachine_Sees();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__INCLUDES = eINSTANCE.getBAbstractMachine_Includes();

		/**
		 * The meta object literal for the '<em><b>Promotes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__PROMOTES = eINSTANCE.getBAbstractMachine_Promotes();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__EXTENDS = eINSTANCE.getBAbstractMachine_Extends();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__USES = eINSTANCE.getBAbstractMachine_Uses();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__SETS = eINSTANCE.getBAbstractMachine_Sets();

		/**
		 * The meta object literal for the '<em><b>Concrete Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__CONCRETE_CONSTANTS = eINSTANCE.getBAbstractMachine_ConcreteConstants();

		/**
		 * The meta object literal for the '<em><b>Abstract Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__ABSTRACT_CONSTANTS = eINSTANCE.getBAbstractMachine_AbstractConstants();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__PROPERTIES = eINSTANCE.getBAbstractMachine_Properties();

		/**
		 * The meta object literal for the '<em><b>Concrete Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__CONCRETE_VARIABLES = eINSTANCE.getBAbstractMachine_ConcreteVariables();

		/**
		 * The meta object literal for the '<em><b>Abstract Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__ABSTRACT_VARIABLES = eINSTANCE.getBAbstractMachine_AbstractVariables();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__INVARIANTS = eINSTANCE.getBAbstractMachine_Invariants();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__ASSERTIONS = eINSTANCE.getBAbstractMachine_Assertions();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__INITIALIZATION = eINSTANCE.getBAbstractMachine_Initialization();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BABSTRACT_MACHINE__OPERATIONS = eINSTANCE.getBAbstractMachine_Operations();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BRefinementImpl <em>BRefinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BRefinementImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBRefinement()
		 * @generated
		 */
		EClass BREFINEMENT = eINSTANCE.getBRefinement();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREFINEMENT__IMPLEMENTATION = eINSTANCE.getBRefinement_Implementation();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BImplementationImpl <em>BImplementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BImplementationImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBImplementation()
		 * @generated
		 */
		EClass BIMPLEMENTATION = eINSTANCE.getBImplementation();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIMPLEMENTATION__IMPORTS = eINSTANCE.getBImplementation_Imports();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.ProjectImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MACHINES = eINSTANCE.getProject_Machines();

		/**
		 * The meta object literal for the '<em><b>Refinements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__REFINEMENTS = eINSTANCE.getProject_Refinements();

		/**
		 * The meta object literal for the '<em><b>Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__IMPLEMENTATIONS = eINSTANCE.getProject_Implementations();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BModuleImpl <em>BModule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BModuleImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBModule()
		 * @generated
		 */
		EClass BMODULE = eINSTANCE.getBModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BMODULE__NAME = eINSTANCE.getBModule_Name();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BOperationImpl <em>BOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BOperationImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBOperation()
		 * @generated
		 */
		EClass BOPERATION = eINSTANCE.getBOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOPERATION__NAME = eINSTANCE.getBOperation_Name();

		/**
		 * The meta object literal for the '<em><b>In Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOPERATION__IN_PARAMETERS = eINSTANCE.getBOperation_InParameters();

		/**
		 * The meta object literal for the '<em><b>Out Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOPERATION__OUT_PARAMETERS = eINSTANCE.getBOperation_OutParameters();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BAbstractVariableImpl <em>BAbstract Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BAbstractVariableImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBAbstractVariable()
		 * @generated
		 */
		EClass BABSTRACT_VARIABLE = eINSTANCE.getBAbstractVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BABSTRACT_VARIABLE__NAME = eINSTANCE.getBAbstractVariable_Name();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BInvariantImpl <em>BInvariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BInvariantImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBInvariant()
		 * @generated
		 */
		EClass BINVARIANT = eINSTANCE.getBInvariant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINVARIANT__NAME = eINSTANCE.getBInvariant_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINVARIANT__TYPE = eINSTANCE.getBInvariant_Type();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BConstraintImpl <em>BConstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BConstraintImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBConstraint()
		 * @generated
		 */
		EClass BCONSTRAINT = eINSTANCE.getBConstraint();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BSetImpl <em>BSet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BSetImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBSet()
		 * @generated
		 */
		EClass BSET = eINSTANCE.getBSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BSET__NAME = eINSTANCE.getBSet_Name();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BConcreteConstantImpl <em>BConcrete Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BConcreteConstantImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBConcreteConstant()
		 * @generated
		 */
		EClass BCONCRETE_CONSTANT = eINSTANCE.getBConcreteConstant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCONCRETE_CONSTANT__NAME = eINSTANCE.getBConcreteConstant_Name();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BAbstractConstantImpl <em>BAbstract Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BAbstractConstantImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBAbstractConstant()
		 * @generated
		 */
		EClass BABSTRACT_CONSTANT = eINSTANCE.getBAbstractConstant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BABSTRACT_CONSTANT__NAME = eINSTANCE.getBAbstractConstant_Name();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BPropertyImpl <em>BProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BPropertyImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBProperty()
		 * @generated
		 */
		EClass BPROPERTY = eINSTANCE.getBProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPROPERTY__NAME = eINSTANCE.getBProperty_Name();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BConcreteVariableImpl <em>BConcrete Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BConcreteVariableImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBConcreteVariable()
		 * @generated
		 */
		EClass BCONCRETE_VARIABLE = eINSTANCE.getBConcreteVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCONCRETE_VARIABLE__NAME = eINSTANCE.getBConcreteVariable_Name();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BAssertionImpl <em>BAssertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BAssertionImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBAssertion()
		 * @generated
		 */
		EClass BASSERTION = eINSTANCE.getBAssertion();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BInitializationImpl <em>BInitialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BInitializationImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBInitialization()
		 * @generated
		 */
		EClass BINITIALIZATION = eINSTANCE.getBInitialization();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BParameterImpl <em>BParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BParameterImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBParameter()
		 * @generated
		 */
		EClass BPARAMETER = eINSTANCE.getBParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPARAMETER__NAME = eINSTANCE.getBParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPARAMETER__TYPE = eINSTANCE.getBParameter_Type();

		/**
		 * The meta object literal for the '{@link ClassicalB.impl.BTypeImpl <em>BType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassicalB.impl.BTypeImpl
		 * @see ClassicalB.impl.ClassicalBPackageImpl#getBType()
		 * @generated
		 */
		EClass BTYPE = eINSTANCE.getBType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__NAME = eINSTANCE.getBType_Name();

	}

} //ClassicalBPackage
