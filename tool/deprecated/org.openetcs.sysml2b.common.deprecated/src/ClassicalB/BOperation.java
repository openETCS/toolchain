/**
 */
package ClassicalB;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ClassicalB.BOperation#getName <em>Name</em>}</li>
 *   <li>{@link ClassicalB.BOperation#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link ClassicalB.BOperation#getOutParameters <em>Out Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see ClassicalB.ClassicalBPackage#getBOperation()
 * @model
 * @generated
 */
public interface BOperation extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ClassicalB.ClassicalBPackage#getBOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ClassicalB.BOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Parameters</b></em>' reference list.
	 * The list contents are of type {@link ClassicalB.BParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Parameters</em>' reference list.
	 * @see ClassicalB.ClassicalBPackage#getBOperation_InParameters()
	 * @model
	 * @generated
	 */
	EList<BParameter> getInParameters();

	/**
	 * Returns the value of the '<em><b>Out Parameters</b></em>' reference list.
	 * The list contents are of type {@link ClassicalB.BParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Parameters</em>' reference list.
	 * @see ClassicalB.ClassicalBPackage#getBOperation_OutParameters()
	 * @model
	 * @generated
	 */
	EList<BParameter> getOutParameters();
} // BOperation
