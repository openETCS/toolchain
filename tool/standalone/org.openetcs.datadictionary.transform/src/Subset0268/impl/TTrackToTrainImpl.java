/**
 */
package Subset0268.impl;

import Subset0268.ListType;
import Subset0268.Subset0268Package;
import Subset0268.TPacket;
import Subset0268.TTrackToTrain;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTrack To Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0268.impl.TTrackToTrainImpl#getList <em>List</em>}</li>
 *   <li>{@link Subset0268.impl.TTrackToTrainImpl#getPacket <em>Packet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TTrackToTrainImpl extends MinimalEObjectImpl.Container implements TTrackToTrain {
	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected EList<ListType> list;

	/**
	 * The cached value of the '{@link #getPacket() <em>Packet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacket()
	 * @generated
	 * @ordered
	 */
	protected EList<TPacket> packet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTrackToTrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0268Package.Literals.TTRACK_TO_TRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		if (list == null) {
			list = new EObjectContainmentEList<ListType>(ListType.class, this, Subset0268Package.TTRACK_TO_TRAIN__LIST);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPacket> getPacket() {
		if (packet == null) {
			packet = new EObjectContainmentEList<TPacket>(TPacket.class, this, Subset0268Package.TTRACK_TO_TRAIN__PACKET);
		}
		return packet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0268Package.TTRACK_TO_TRAIN__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Subset0268Package.TTRACK_TO_TRAIN__PACKET:
				return ((InternalEList<?>)getPacket()).basicRemove(otherEnd, msgs);
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
			case Subset0268Package.TTRACK_TO_TRAIN__LIST:
				return getList();
			case Subset0268Package.TTRACK_TO_TRAIN__PACKET:
				return getPacket();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Subset0268Package.TTRACK_TO_TRAIN__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Subset0268Package.TTRACK_TO_TRAIN__PACKET:
				getPacket().clear();
				getPacket().addAll((Collection<? extends TPacket>)newValue);
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
			case Subset0268Package.TTRACK_TO_TRAIN__LIST:
				getList().clear();
				return;
			case Subset0268Package.TTRACK_TO_TRAIN__PACKET:
				getPacket().clear();
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
			case Subset0268Package.TTRACK_TO_TRAIN__LIST:
				return list != null && !list.isEmpty();
			case Subset0268Package.TTRACK_TO_TRAIN__PACKET:
				return packet != null && !packet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TTrackToTrainImpl
