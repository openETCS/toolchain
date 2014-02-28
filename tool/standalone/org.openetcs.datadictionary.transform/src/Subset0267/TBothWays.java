/**
 */
package Subset0267;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TBoth Ways</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0267.TBothWays#getList <em>List</em>}</li>
 *   <li>{@link Subset0267.TBothWays#getPacket <em>Packet</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0267.Subset0267Package#getTBothWays()
 * @model extendedMetaData="name='T_BothWays' kind='elementOnly'"
 * @generated
 */
public interface TBothWays extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link Subset0267.ListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see Subset0267.Subset0267Package#getTBothWays_List()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='List' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ListType> getList();

	/**
	 * Returns the value of the '<em><b>Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet</em>' containment reference.
	 * @see #setPacket(TPacket)
	 * @see Subset0267.Subset0267Package#getTBothWays_Packet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Packet' namespace='##targetNamespace'"
	 * @generated
	 */
	TPacket getPacket();

	/**
	 * Sets the value of the '{@link Subset0267.TBothWays#getPacket <em>Packet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet</em>' containment reference.
	 * @see #getPacket()
	 * @generated
	 */
	void setPacket(TPacket value);

} // TBothWays
