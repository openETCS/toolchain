/**
 */
package ClassicalB.util;

import ClassicalB.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ClassicalB.ClassicalBPackage
 * @generated
 */
public class ClassicalBSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassicalBPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicalBSwitch() {
		if (modelPackage == null) {
			modelPackage = ClassicalBPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ClassicalBPackage.BABSTRACT_MACHINE: {
				BAbstractMachine bAbstractMachine = (BAbstractMachine)theEObject;
				T result = caseBAbstractMachine(bAbstractMachine);
				if (result == null) result = caseBModule(bAbstractMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BREFINEMENT: {
				BRefinement bRefinement = (BRefinement)theEObject;
				T result = caseBRefinement(bRefinement);
				if (result == null) result = caseBModule(bRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BIMPLEMENTATION: {
				BImplementation bImplementation = (BImplementation)theEObject;
				T result = caseBImplementation(bImplementation);
				if (result == null) result = caseBModule(bImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BMODULE: {
				BModule bModule = (BModule)theEObject;
				T result = caseBModule(bModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BOPERATION: {
				BOperation bOperation = (BOperation)theEObject;
				T result = caseBOperation(bOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BABSTRACT_VARIABLE: {
				BAbstractVariable bAbstractVariable = (BAbstractVariable)theEObject;
				T result = caseBAbstractVariable(bAbstractVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BINVARIANT: {
				BInvariant bInvariant = (BInvariant)theEObject;
				T result = caseBInvariant(bInvariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BCONSTRAINT: {
				BConstraint bConstraint = (BConstraint)theEObject;
				T result = caseBConstraint(bConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BSET: {
				BSet bSet = (BSet)theEObject;
				T result = caseBSet(bSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BCONCRETE_CONSTANT: {
				BConcreteConstant bConcreteConstant = (BConcreteConstant)theEObject;
				T result = caseBConcreteConstant(bConcreteConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BABSTRACT_CONSTANT: {
				BAbstractConstant bAbstractConstant = (BAbstractConstant)theEObject;
				T result = caseBAbstractConstant(bAbstractConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BPROPERTY: {
				BProperty bProperty = (BProperty)theEObject;
				T result = caseBProperty(bProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BCONCRETE_VARIABLE: {
				BConcreteVariable bConcreteVariable = (BConcreteVariable)theEObject;
				T result = caseBConcreteVariable(bConcreteVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BASSERTION: {
				BAssertion bAssertion = (BAssertion)theEObject;
				T result = caseBAssertion(bAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BINITIALIZATION: {
				BInitialization bInitialization = (BInitialization)theEObject;
				T result = caseBInitialization(bInitialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BPARAMETER: {
				BParameter bParameter = (BParameter)theEObject;
				T result = caseBParameter(bParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassicalBPackage.BTYPE: {
				BType bType = (BType)theEObject;
				T result = caseBType(bType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAbstract Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAbstract Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAbstractMachine(BAbstractMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BRefinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BRefinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBRefinement(BRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BImplementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BImplementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBImplementation(BImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BModule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BModule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBModule(BModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOperation(BOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAbstract Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAbstract Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAbstractVariable(BAbstractVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BInvariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BInvariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBInvariant(BInvariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BConstraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBConstraint(BConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSet(BSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BConcrete Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BConcrete Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBConcreteConstant(BConcreteConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAbstract Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAbstract Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAbstractConstant(BAbstractConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBProperty(BProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BConcrete Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BConcrete Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBConcreteVariable(BConcreteVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAssertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAssertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAssertion(BAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BInitialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BInitialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBInitialization(BInitialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBParameter(BParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBType(BType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ClassicalBSwitch
