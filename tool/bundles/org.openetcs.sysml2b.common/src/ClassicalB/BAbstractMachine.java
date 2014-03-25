/**
 */
package ClassicalB;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BAbstract Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ClassicalB.BAbstractMachine#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getSees <em>Sees</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getIncludes <em>Includes</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getPromotes <em>Promotes</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getExtends <em>Extends</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getUses <em>Uses</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getSets <em>Sets</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getConcreteConstants <em>Concrete Constants</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getAbstractConstants <em>Abstract Constants</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getProperties <em>Properties</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getConcreteVariables <em>Concrete Variables</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getAbstractVariables <em>Abstract Variables</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link ClassicalB.BAbstractMachine#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine()
 * @model
 * @generated
 */
public interface BAbstractMachine extends BModule {
	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' reference list.
	 * The list contents are of type {@link ClassicalB.BRefinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Refinement()
	 * @model
	 * @generated
	 */
	EList<BRefinement> getRefinement();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<BConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Sees</b></em>' reference list.
	 * The list contents are of type {@link ClassicalB.BModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sees</em>' reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Sees()
	 * @model
	 * @generated
	 */
	EList<BModule> getSees();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link ClassicalB.BModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Includes()
	 * @model
	 * @generated
	 */
	EList<BModule> getIncludes();

	/**
	 * Returns the value of the '<em><b>Promotes</b></em>' reference list.
	 * The list contents are of type {@link ClassicalB.BOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promotes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promotes</em>' reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Promotes()
	 * @model
	 * @generated
	 */
	EList<BOperation> getPromotes();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link ClassicalB.BModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Extends()
	 * @model
	 * @generated
	 */
	EList<BModule> getExtends();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link ClassicalB.BModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Uses()
	 * @model
	 * @generated
	 */
	EList<BModule> getUses();

	/**
	 * Returns the value of the '<em><b>Sets</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Sets()
	 * @model containment="true"
	 * @generated
	 */
	EList<BSet> getSets();

	/**
	 * Returns the value of the '<em><b>Concrete Constants</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BConcreteConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Constants</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_ConcreteConstants()
	 * @model containment="true"
	 * @generated
	 */
	EList<BConcreteConstant> getConcreteConstants();

	/**
	 * Returns the value of the '<em><b>Abstract Constants</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BAbstractConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Constants</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_AbstractConstants()
	 * @model containment="true"
	 * @generated
	 */
	EList<BAbstractConstant> getAbstractConstants();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<BProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Concrete Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BConcreteVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Variables</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_ConcreteVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<BConcreteVariable> getConcreteVariables();

	/**
	 * Returns the value of the '<em><b>Abstract Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BAbstractVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Variables</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_AbstractVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<BAbstractVariable> getAbstractVariables();

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BInvariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariants</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Invariants()
	 * @model containment="true"
	 * @generated
	 */
	EList<BInvariant> getInvariants();

	/**
	 * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BAssertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertions</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Assertions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BAssertion> getAssertions();

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BInitialization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Initialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<BInitialization> getInitialization();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getBAbstractMachine_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BOperation> getOperations();

} // BAbstractMachine
