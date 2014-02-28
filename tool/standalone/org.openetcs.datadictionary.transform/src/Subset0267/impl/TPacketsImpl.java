/**
 */
package Subset0267.impl;

import Subset0267.Subset0267Package;
import Subset0267.TBothWays;
import Subset0267.TPackets;
import Subset0267.TTrackToTrain;
import Subset0267.TTrainToTrack;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPackets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0267.impl.TPacketsImpl#getTrackToTrain <em>Track To Train</em>}</li>
 *   <li>{@link Subset0267.impl.TPacketsImpl#getTrainToTrack <em>Train To Track</em>}</li>
 *   <li>{@link Subset0267.impl.TPacketsImpl#getBothWays <em>Both Ways</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPacketsImpl extends MinimalEObjectImpl.Container implements TPackets {
	/**
	 * The cached value of the '{@link #getTrackToTrain() <em>Track To Train</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackToTrain()
	 * @generated
	 * @ordered
	 */
	protected TTrackToTrain trackToTrain;

	/**
	 * The cached value of the '{@link #getTrainToTrack() <em>Train To Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainToTrack()
	 * @generated
	 * @ordered
	 */
	protected TTrainToTrack trainToTrack;

	/**
	 * The cached value of the '{@link #getBothWays() <em>Both Ways</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBothWays()
	 * @generated
	 * @ordered
	 */
	protected TBothWays bothWays;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPacketsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0267Package.Literals.TPACKETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrackToTrain getTrackToTrain() {
		return trackToTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackToTrain(TTrackToTrain newTrackToTrain, NotificationChain msgs) {
		TTrackToTrain oldTrackToTrain = trackToTrain;
		trackToTrain = newTrackToTrain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Subset0267Package.TPACKETS__TRACK_TO_TRAIN, oldTrackToTrain, newTrackToTrain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackToTrain(TTrackToTrain newTrackToTrain) {
		if (newTrackToTrain != trackToTrain) {
			NotificationChain msgs = null;
			if (trackToTrain != null)
				msgs = ((InternalEObject)trackToTrain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TPACKETS__TRACK_TO_TRAIN, null, msgs);
			if (newTrackToTrain != null)
				msgs = ((InternalEObject)newTrackToTrain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TPACKETS__TRACK_TO_TRAIN, null, msgs);
			msgs = basicSetTrackToTrain(newTrackToTrain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.TPACKETS__TRACK_TO_TRAIN, newTrackToTrain, newTrackToTrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrainToTrack getTrainToTrack() {
		return trainToTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrainToTrack(TTrainToTrack newTrainToTrack, NotificationChain msgs) {
		TTrainToTrack oldTrainToTrack = trainToTrack;
		trainToTrack = newTrainToTrack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Subset0267Package.TPACKETS__TRAIN_TO_TRACK, oldTrainToTrack, newTrainToTrack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainToTrack(TTrainToTrack newTrainToTrack) {
		if (newTrainToTrack != trainToTrack) {
			NotificationChain msgs = null;
			if (trainToTrack != null)
				msgs = ((InternalEObject)trainToTrack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TPACKETS__TRAIN_TO_TRACK, null, msgs);
			if (newTrainToTrack != null)
				msgs = ((InternalEObject)newTrainToTrack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TPACKETS__TRAIN_TO_TRACK, null, msgs);
			msgs = basicSetTrainToTrack(newTrainToTrack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.TPACKETS__TRAIN_TO_TRACK, newTrainToTrack, newTrainToTrack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBothWays getBothWays() {
		return bothWays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBothWays(TBothWays newBothWays, NotificationChain msgs) {
		TBothWays oldBothWays = bothWays;
		bothWays = newBothWays;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Subset0267Package.TPACKETS__BOTH_WAYS, oldBothWays, newBothWays);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBothWays(TBothWays newBothWays) {
		if (newBothWays != bothWays) {
			NotificationChain msgs = null;
			if (bothWays != null)
				msgs = ((InternalEObject)bothWays).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TPACKETS__BOTH_WAYS, null, msgs);
			if (newBothWays != null)
				msgs = ((InternalEObject)newBothWays).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TPACKETS__BOTH_WAYS, null, msgs);
			msgs = basicSetBothWays(newBothWays, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.TPACKETS__BOTH_WAYS, newBothWays, newBothWays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0267Package.TPACKETS__TRACK_TO_TRAIN:
				return basicSetTrackToTrain(null, msgs);
			case Subset0267Package.TPACKETS__TRAIN_TO_TRACK:
				return basicSetTrainToTrack(null, msgs);
			case Subset0267Package.TPACKETS__BOTH_WAYS:
				return basicSetBothWays(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Subset0267Package.TPACKETS__TRACK_TO_TRAIN:
				return getTrackToTrain();
			case Subset0267Package.TPACKETS__TRAIN_TO_TRACK:
				return getTrainToTrack();
			case Subset0267Package.TPACKETS__BOTH_WAYS:
				return getBothWays();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Subset0267Package.TPACKETS__TRACK_TO_TRAIN:
				setTrackToTrain((TTrackToTrain)newValue);
				return;
			case Subset0267Package.TPACKETS__TRAIN_TO_TRACK:
				setTrainToTrack((TTrainToTrack)newValue);
				return;
			case Subset0267Package.TPACKETS__BOTH_WAYS:
				setBothWays((TBothWays)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Subset0267Package.TPACKETS__TRACK_TO_TRAIN:
				setTrackToTrain((TTrackToTrain)null);
				return;
			case Subset0267Package.TPACKETS__TRAIN_TO_TRACK:
				setTrainToTrack((TTrainToTrack)null);
				return;
			case Subset0267Package.TPACKETS__BOTH_WAYS:
				setBothWays((TBothWays)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Subset0267Package.TPACKETS__TRACK_TO_TRAIN:
				return trackToTrain != null;
			case Subset0267Package.TPACKETS__TRAIN_TO_TRACK:
				return trainToTrack != null;
			case Subset0267Package.TPACKETS__BOTH_WAYS:
				return bothWays != null;
		}
		return super.eIsSet(featureID);
	}

} //TPacketsImpl
