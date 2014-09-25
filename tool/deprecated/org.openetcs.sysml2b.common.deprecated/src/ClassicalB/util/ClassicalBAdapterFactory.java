/**
 */
package ClassicalB.util;

import ClassicalB.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ClassicalB.ClassicalBPackage
 * @generated
 */
public class ClassicalBAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassicalBPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicalBAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClassicalBPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassicalBSwitch<Adapter> modelSwitch =
		new ClassicalBSwitch<Adapter>() {
			@Override
			public Adapter caseBAbstractMachine(BAbstractMachine object) {
				return createBAbstractMachineAdapter();
			}
			@Override
			public Adapter caseBRefinement(BRefinement object) {
				return createBRefinementAdapter();
			}
			@Override
			public Adapter caseBImplementation(BImplementation object) {
				return createBImplementationAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseBModule(BModule object) {
				return createBModuleAdapter();
			}
			@Override
			public Adapter caseBOperation(BOperation object) {
				return createBOperationAdapter();
			}
			@Override
			public Adapter caseBAbstractVariable(BAbstractVariable object) {
				return createBAbstractVariableAdapter();
			}
			@Override
			public Adapter caseBInvariant(BInvariant object) {
				return createBInvariantAdapter();
			}
			@Override
			public Adapter caseBConstraint(BConstraint object) {
				return createBConstraintAdapter();
			}
			@Override
			public Adapter caseBSet(BSet object) {
				return createBSetAdapter();
			}
			@Override
			public Adapter caseBConcreteConstant(BConcreteConstant object) {
				return createBConcreteConstantAdapter();
			}
			@Override
			public Adapter caseBAbstractConstant(BAbstractConstant object) {
				return createBAbstractConstantAdapter();
			}
			@Override
			public Adapter caseBProperty(BProperty object) {
				return createBPropertyAdapter();
			}
			@Override
			public Adapter caseBConcreteVariable(BConcreteVariable object) {
				return createBConcreteVariableAdapter();
			}
			@Override
			public Adapter caseBAssertion(BAssertion object) {
				return createBAssertionAdapter();
			}
			@Override
			public Adapter caseBInitialization(BInitialization object) {
				return createBInitializationAdapter();
			}
			@Override
			public Adapter caseBParameter(BParameter object) {
				return createBParameterAdapter();
			}
			@Override
			public Adapter caseBType(BType object) {
				return createBTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BAbstractMachine <em>BAbstract Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BAbstractMachine
	 * @generated
	 */
	public Adapter createBAbstractMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BRefinement <em>BRefinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BRefinement
	 * @generated
	 */
	public Adapter createBRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BImplementation <em>BImplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BImplementation
	 * @generated
	 */
	public Adapter createBImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BModule <em>BModule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BModule
	 * @generated
	 */
	public Adapter createBModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BOperation <em>BOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BOperation
	 * @generated
	 */
	public Adapter createBOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BAbstractVariable <em>BAbstract Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BAbstractVariable
	 * @generated
	 */
	public Adapter createBAbstractVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BInvariant <em>BInvariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BInvariant
	 * @generated
	 */
	public Adapter createBInvariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BConstraint <em>BConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BConstraint
	 * @generated
	 */
	public Adapter createBConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BSet <em>BSet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BSet
	 * @generated
	 */
	public Adapter createBSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BConcreteConstant <em>BConcrete Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BConcreteConstant
	 * @generated
	 */
	public Adapter createBConcreteConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BAbstractConstant <em>BAbstract Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BAbstractConstant
	 * @generated
	 */
	public Adapter createBAbstractConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BProperty <em>BProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BProperty
	 * @generated
	 */
	public Adapter createBPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BConcreteVariable <em>BConcrete Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BConcreteVariable
	 * @generated
	 */
	public Adapter createBConcreteVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BAssertion <em>BAssertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BAssertion
	 * @generated
	 */
	public Adapter createBAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BInitialization <em>BInitialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BInitialization
	 * @generated
	 */
	public Adapter createBInitializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BParameter <em>BParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BParameter
	 * @generated
	 */
	public Adapter createBParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassicalB.BType <em>BType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassicalB.BType
	 * @generated
	 */
	public Adapter createBTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ClassicalBAdapterFactory
