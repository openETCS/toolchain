/**
 */
package ClassicalB.impl;

import ClassicalB.BAbstractConstant;
import ClassicalB.BAbstractMachine;
import ClassicalB.BAbstractVariable;
import ClassicalB.BAssertion;
import ClassicalB.BConcreteConstant;
import ClassicalB.BConcreteVariable;
import ClassicalB.BConstraint;
import ClassicalB.BImplementation;
import ClassicalB.BInitialization;
import ClassicalB.BInvariant;
import ClassicalB.BModule;
import ClassicalB.BOperation;
import ClassicalB.BParameter;
import ClassicalB.BProperty;
import ClassicalB.BRefinement;
import ClassicalB.BSet;
import ClassicalB.BType;
import ClassicalB.ClassicalBFactory;
import ClassicalB.ClassicalBPackage;
import ClassicalB.Project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassicalBPackageImpl extends EPackageImpl implements ClassicalBPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bAbstractMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bAbstractVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bInvariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bConcreteConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bAbstractConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bConcreteVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bInitializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ClassicalB.ClassicalBPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassicalBPackageImpl() {
		super(eNS_URI, ClassicalBFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ClassicalBPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassicalBPackage init() {
		if (isInited) return (ClassicalBPackage)EPackage.Registry.INSTANCE.getEPackage(ClassicalBPackage.eNS_URI);

		// Obtain or create and register package
		ClassicalBPackageImpl theClassicalBPackage = (ClassicalBPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassicalBPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassicalBPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theClassicalBPackage.createPackageContents();

		// Initialize created meta-data
		theClassicalBPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClassicalBPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassicalBPackage.eNS_URI, theClassicalBPackage);
		return theClassicalBPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAbstractMachine() {
		return bAbstractMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Refinement() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Constraints() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Sees() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Includes() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Promotes() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Extends() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Uses() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Sets() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_ConcreteConstants() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_AbstractConstants() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Properties() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_ConcreteVariables() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_AbstractVariables() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Invariants() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Assertions() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Initialization() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAbstractMachine_Operations() {
		return (EReference)bAbstractMachineEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBRefinement() {
		return bRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBRefinement_Implementation() {
		return (EReference)bRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBImplementation() {
		return bImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBImplementation_Imports() {
		return (EReference)bImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Machines() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Refinements() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Implementations() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBModule() {
		return bModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBModule_Name() {
		return (EAttribute)bModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOperation() {
		return bOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBOperation_Name() {
		return (EAttribute)bOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOperation_InParameters() {
		return (EReference)bOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOperation_OutParameters() {
		return (EReference)bOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAbstractVariable() {
		return bAbstractVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBAbstractVariable_Name() {
		return (EAttribute)bAbstractVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBInvariant() {
		return bInvariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBInvariant_Name() {
		return (EAttribute)bInvariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBInvariant_Type() {
		return (EAttribute)bInvariantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBConstraint() {
		return bConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBSet() {
		return bSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSet_Name() {
		return (EAttribute)bSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBConcreteConstant() {
		return bConcreteConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBConcreteConstant_Name() {
		return (EAttribute)bConcreteConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAbstractConstant() {
		return bAbstractConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBAbstractConstant_Name() {
		return (EAttribute)bAbstractConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBProperty() {
		return bPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBProperty_Name() {
		return (EAttribute)bPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBConcreteVariable() {
		return bConcreteVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBConcreteVariable_Name() {
		return (EAttribute)bConcreteVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAssertion() {
		return bAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBInitialization() {
		return bInitializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBParameter() {
		return bParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBParameter_Name() {
		return (EAttribute)bParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBParameter_Type() {
		return (EReference)bParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBType() {
		return bTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBType_Name() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicalBFactory getClassicalBFactory() {
		return (ClassicalBFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bAbstractMachineEClass = createEClass(BABSTRACT_MACHINE);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__REFINEMENT);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__CONSTRAINTS);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__SEES);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__INCLUDES);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__PROMOTES);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__EXTENDS);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__USES);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__SETS);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__CONCRETE_CONSTANTS);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__ABSTRACT_CONSTANTS);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__PROPERTIES);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__CONCRETE_VARIABLES);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__ABSTRACT_VARIABLES);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__INVARIANTS);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__ASSERTIONS);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__INITIALIZATION);
		createEReference(bAbstractMachineEClass, BABSTRACT_MACHINE__OPERATIONS);

		bRefinementEClass = createEClass(BREFINEMENT);
		createEReference(bRefinementEClass, BREFINEMENT__IMPLEMENTATION);

		bImplementationEClass = createEClass(BIMPLEMENTATION);
		createEReference(bImplementationEClass, BIMPLEMENTATION__IMPORTS);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__MACHINES);
		createEReference(projectEClass, PROJECT__REFINEMENTS);
		createEReference(projectEClass, PROJECT__IMPLEMENTATIONS);

		bModuleEClass = createEClass(BMODULE);
		createEAttribute(bModuleEClass, BMODULE__NAME);

		bOperationEClass = createEClass(BOPERATION);
		createEAttribute(bOperationEClass, BOPERATION__NAME);
		createEReference(bOperationEClass, BOPERATION__IN_PARAMETERS);
		createEReference(bOperationEClass, BOPERATION__OUT_PARAMETERS);

		bAbstractVariableEClass = createEClass(BABSTRACT_VARIABLE);
		createEAttribute(bAbstractVariableEClass, BABSTRACT_VARIABLE__NAME);

		bInvariantEClass = createEClass(BINVARIANT);
		createEAttribute(bInvariantEClass, BINVARIANT__NAME);
		createEAttribute(bInvariantEClass, BINVARIANT__TYPE);

		bConstraintEClass = createEClass(BCONSTRAINT);

		bSetEClass = createEClass(BSET);
		createEAttribute(bSetEClass, BSET__NAME);

		bConcreteConstantEClass = createEClass(BCONCRETE_CONSTANT);
		createEAttribute(bConcreteConstantEClass, BCONCRETE_CONSTANT__NAME);

		bAbstractConstantEClass = createEClass(BABSTRACT_CONSTANT);
		createEAttribute(bAbstractConstantEClass, BABSTRACT_CONSTANT__NAME);

		bPropertyEClass = createEClass(BPROPERTY);
		createEAttribute(bPropertyEClass, BPROPERTY__NAME);

		bConcreteVariableEClass = createEClass(BCONCRETE_VARIABLE);
		createEAttribute(bConcreteVariableEClass, BCONCRETE_VARIABLE__NAME);

		bAssertionEClass = createEClass(BASSERTION);

		bInitializationEClass = createEClass(BINITIALIZATION);

		bParameterEClass = createEClass(BPARAMETER);
		createEAttribute(bParameterEClass, BPARAMETER__NAME);
		createEReference(bParameterEClass, BPARAMETER__TYPE);

		bTypeEClass = createEClass(BTYPE);
		createEAttribute(bTypeEClass, BTYPE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bAbstractMachineEClass.getESuperTypes().add(this.getBModule());
		bRefinementEClass.getESuperTypes().add(this.getBModule());
		bImplementationEClass.getESuperTypes().add(this.getBModule());

		// Initialize classes, features, and operations; add parameters
		initEClass(bAbstractMachineEClass, BAbstractMachine.class, "BAbstractMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBAbstractMachine_Refinement(), this.getBRefinement(), null, "refinement", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Constraints(), this.getBConstraint(), null, "constraints", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Sees(), this.getBModule(), null, "sees", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Includes(), this.getBModule(), null, "includes", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Promotes(), this.getBOperation(), null, "promotes", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Extends(), this.getBModule(), null, "extends", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Uses(), this.getBModule(), null, "uses", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Sets(), this.getBSet(), null, "sets", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_ConcreteConstants(), this.getBConcreteConstant(), null, "concreteConstants", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_AbstractConstants(), this.getBAbstractConstant(), null, "abstractConstants", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Properties(), this.getBProperty(), null, "properties", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_ConcreteVariables(), this.getBConcreteVariable(), null, "concreteVariables", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_AbstractVariables(), this.getBAbstractVariable(), null, "abstractVariables", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Invariants(), this.getBInvariant(), null, "invariants", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Assertions(), this.getBAssertion(), null, "assertions", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Initialization(), this.getBInitialization(), null, "initialization", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBAbstractMachine_Operations(), this.getBOperation(), null, "operations", null, 0, -1, BAbstractMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bRefinementEClass, BRefinement.class, "BRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBRefinement_Implementation(), this.getBImplementation(), null, "implementation", null, 0, 1, BRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bImplementationEClass, BImplementation.class, "BImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBImplementation_Imports(), this.getBModule(), null, "imports", null, 0, -1, BImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Machines(), this.getBAbstractMachine(), null, "machines", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Refinements(), this.getBRefinement(), null, "refinements", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Implementations(), this.getBImplementation(), null, "implementations", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bModuleEClass, BModule.class, "BModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBModule_Name(), ecorePackage.getEString(), "Name", null, 0, 1, BModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bOperationEClass, BOperation.class, "BOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, BOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOperation_InParameters(), this.getBParameter(), null, "inParameters", null, 0, -1, BOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBOperation_OutParameters(), this.getBParameter(), null, "outParameters", null, 0, -1, BOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bAbstractVariableEClass, BAbstractVariable.class, "BAbstractVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBAbstractVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, BAbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bInvariantEClass, BInvariant.class, "BInvariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBInvariant_Name(), ecorePackage.getEString(), "name", null, 0, 1, BInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBInvariant_Type(), ecorePackage.getEString(), "type", null, 0, 1, BInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bConstraintEClass, BConstraint.class, "BConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bSetEClass, BSet.class, "BSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, BSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bConcreteConstantEClass, BConcreteConstant.class, "BConcreteConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBConcreteConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, BConcreteConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bAbstractConstantEClass, BAbstractConstant.class, "BAbstractConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBAbstractConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, BAbstractConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bPropertyEClass, BProperty.class, "BProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, BProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bConcreteVariableEClass, BConcreteVariable.class, "BConcreteVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBConcreteVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, BConcreteVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bAssertionEClass, BAssertion.class, "BAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bInitializationEClass, BInitialization.class, "BInitialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bParameterEClass, BParameter.class, "BParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, BParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBParameter_Type(), this.getBType(), null, "type", null, 0, 1, BParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bTypeEClass, BType.class, "BType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBType_Name(), ecorePackage.getEString(), "name", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ClassicalBPackageImpl
