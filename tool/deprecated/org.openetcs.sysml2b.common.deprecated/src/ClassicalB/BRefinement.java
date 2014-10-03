/**
 */
package ClassicalB;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BRefinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ClassicalB.BRefinement#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ClassicalB.ClassicalBPackage#getBRefinement()
 * @model
 * @generated
 */
public interface BRefinement extends BModule {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(BImplementation)
	 * @see ClassicalB.ClassicalBPackage#getBRefinement_Implementation()
	 * @model
	 * @generated
	 */
	BImplementation getImplementation();

	/**
	 * Sets the value of the '{@link ClassicalB.BRefinement#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(BImplementation value);

} // BRefinement
