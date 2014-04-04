/**
 */
package Subset0267;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPackets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0267.TPackets#getTrackToTrain <em>Track To Train</em>}</li>
 *   <li>{@link Subset0267.TPackets#getTrainToTrack <em>Train To Track</em>}</li>
 *   <li>{@link Subset0267.TPackets#getBothWays <em>Both Ways</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0267.Subset0267Package#getTPackets()
 * @model extendedMetaData="name='T_Packets' kind='elementOnly'"
 * @generated
 */
public interface TPackets extends EObject {
	/**
	 * Returns the value of the '<em><b>Track To Train</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track To Train</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track To Train</em>' containment reference.
	 * @see #setTrackToTrain(TTrackToTrain)
	 * @see Subset0267.Subset0267Package#getTPackets_TrackToTrain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TrackToTrain' namespace='##targetNamespace'"
	 * @generated
	 */
	TTrackToTrain getTrackToTrain();

	/**
	 * Sets the value of the '{@link Subset0267.TPackets#getTrackToTrain <em>Track To Train</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track To Train</em>' containment reference.
	 * @see #getTrackToTrain()
	 * @generated
	 */
	void setTrackToTrain(TTrackToTrain value);

	/**
	 * Returns the value of the '<em><b>Train To Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Train To Track</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train To Track</em>' containment reference.
	 * @see #setTrainToTrack(TTrainToTrack)
	 * @see Subset0267.Subset0267Package#getTPackets_TrainToTrack()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TrainToTrack' namespace='##targetNamespace'"
	 * @generated
	 */
	TTrainToTrack getTrainToTrack();

	/**
	 * Sets the value of the '{@link Subset0267.TPackets#getTrainToTrack <em>Train To Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train To Track</em>' containment reference.
	 * @see #getTrainToTrack()
	 * @generated
	 */
	void setTrainToTrack(TTrainToTrack value);

	/**
	 * Returns the value of the '<em><b>Both Ways</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Both Ways</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Both Ways</em>' containment reference.
	 * @see #setBothWays(TBothWays)
	 * @see Subset0267.Subset0267Package#getTPackets_BothWays()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BothWays' namespace='##targetNamespace'"
	 * @generated
	 */
	TBothWays getBothWays();

	/**
	 * Sets the value of the '{@link Subset0267.TPackets#getBothWays <em>Both Ways</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Both Ways</em>' containment reference.
	 * @see #getBothWays()
	 * @generated
	 */
	void setBothWays(TBothWays value);

} // TPackets
