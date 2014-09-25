/**
 */
package ClassicalB;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BImplementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ClassicalB.BImplementation#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see ClassicalB.ClassicalBPackage#getBImplementation()
 * @model
 * @generated
 */
public interface BImplementation extends BModule {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link ClassicalB.BModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see ClassicalB.ClassicalBPackage#getBImplementation_Imports()
	 * @model
	 * @generated
	 */
	EList<BModule> getImports();

} // BImplementation
