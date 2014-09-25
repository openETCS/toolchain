/**
 */
package ClassicalB;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ClassicalB.Project#getMachines <em>Machines</em>}</li>
 *   <li>{@link ClassicalB.Project#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link ClassicalB.Project#getImplementations <em>Implementations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ClassicalB.ClassicalBPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Machines</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BAbstractMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machines</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getProject_Machines()
	 * @model containment="true"
	 * @generated
	 */
	EList<BAbstractMachine> getMachines();

	/**
	 * Returns the value of the '<em><b>Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BRefinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinements</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getProject_Refinements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BRefinement> getRefinements();

	/**
	 * Returns the value of the '<em><b>Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link ClassicalB.BImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementations</em>' containment reference list.
	 * @see ClassicalB.ClassicalBPackage#getProject_Implementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BImplementation> getImplementations();

} // Project
