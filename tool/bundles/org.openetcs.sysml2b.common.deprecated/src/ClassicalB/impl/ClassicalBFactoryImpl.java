/**
 */
package ClassicalB.impl;

import ClassicalB.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassicalBFactoryImpl extends EFactoryImpl implements ClassicalBFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassicalBFactory init() {
		try {
			ClassicalBFactory theClassicalBFactory = (ClassicalBFactory)EPackage.Registry.INSTANCE.getEFactory(ClassicalBPackage.eNS_URI);
			if (theClassicalBFactory != null) {
				return theClassicalBFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassicalBFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicalBFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClassicalBPackage.BABSTRACT_MACHINE: return createBAbstractMachine();
			case ClassicalBPackage.BREFINEMENT: return createBRefinement();
			case ClassicalBPackage.BIMPLEMENTATION: return createBImplementation();
			case ClassicalBPackage.PROJECT: return createProject();
			case ClassicalBPackage.BMODULE: return createBModule();
			case ClassicalBPackage.BOPERATION: return createBOperation();
			case ClassicalBPackage.BABSTRACT_VARIABLE: return createBAbstractVariable();
			case ClassicalBPackage.BINVARIANT: return createBInvariant();
			case ClassicalBPackage.BCONSTRAINT: return createBConstraint();
			case ClassicalBPackage.BSET: return createBSet();
			case ClassicalBPackage.BCONCRETE_CONSTANT: return createBConcreteConstant();
			case ClassicalBPackage.BABSTRACT_CONSTANT: return createBAbstractConstant();
			case ClassicalBPackage.BPROPERTY: return createBProperty();
			case ClassicalBPackage.BCONCRETE_VARIABLE: return createBConcreteVariable();
			case ClassicalBPackage.BASSERTION: return createBAssertion();
			case ClassicalBPackage.BINITIALIZATION: return createBInitialization();
			case ClassicalBPackage.BPARAMETER: return createBParameter();
			case ClassicalBPackage.BTYPE: return createBType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAbstractMachine createBAbstractMachine() {
		BAbstractMachineImpl bAbstractMachine = new BAbstractMachineImpl();
		return bAbstractMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BRefinement createBRefinement() {
		BRefinementImpl bRefinement = new BRefinementImpl();
		return bRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BImplementation createBImplementation() {
		BImplementationImpl bImplementation = new BImplementationImpl();
		return bImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BModule createBModule() {
		BModuleImpl bModule = new BModuleImpl();
		return bModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOperation createBOperation() {
		BOperationImpl bOperation = new BOperationImpl();
		return bOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAbstractVariable createBAbstractVariable() {
		BAbstractVariableImpl bAbstractVariable = new BAbstractVariableImpl();
		return bAbstractVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInvariant createBInvariant() {
		BInvariantImpl bInvariant = new BInvariantImpl();
		return bInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BConstraint createBConstraint() {
		BConstraintImpl bConstraint = new BConstraintImpl();
		return bConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSet createBSet() {
		BSetImpl bSet = new BSetImpl();
		return bSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BConcreteConstant createBConcreteConstant() {
		BConcreteConstantImpl bConcreteConstant = new BConcreteConstantImpl();
		return bConcreteConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAbstractConstant createBAbstractConstant() {
		BAbstractConstantImpl bAbstractConstant = new BAbstractConstantImpl();
		return bAbstractConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BProperty createBProperty() {
		BPropertyImpl bProperty = new BPropertyImpl();
		return bProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BConcreteVariable createBConcreteVariable() {
		BConcreteVariableImpl bConcreteVariable = new BConcreteVariableImpl();
		return bConcreteVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAssertion createBAssertion() {
		BAssertionImpl bAssertion = new BAssertionImpl();
		return bAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInitialization createBInitialization() {
		BInitializationImpl bInitialization = new BInitializationImpl();
		return bInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BParameter createBParameter() {
		BParameterImpl bParameter = new BParameterImpl();
		return bParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BType createBType() {
		BTypeImpl bType = new BTypeImpl();
		return bType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicalBPackage getClassicalBPackage() {
		return (ClassicalBPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassicalBPackage getPackage() {
		return ClassicalBPackage.eINSTANCE;
	}

} //ClassicalBFactoryImpl
