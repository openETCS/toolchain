/**
 */
package Subset0267;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTrack To Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0267.TTrackToTrain#getList <em>List</em>}</li>
 *   <li>{@link Subset0267.TTrackToTrain#getPacket <em>Packet</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0267.Subset0267Package#getTTrackToTrain()
 * @model extendedMetaData="name='T_TrackToTrain' kind='elementOnly'"
 * @generated
 */
public interface TTrackToTrain extends EObject {
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
	 * @see Subset0267.Subset0267Package#getTTrackToTrain_List()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='List' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ListType> getList();

	/**
	 * Returns the value of the '<em><b>Packet</b></em>' containment reference list.
	 * The list contents are of type {@link Subset0267.TPacket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet</em>' containment reference list.
	 * @see Subset0267.Subset0267Package#getTTrackToTrain_Packet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Packet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TPacket> getPacket();

} // TTrackToTrain
