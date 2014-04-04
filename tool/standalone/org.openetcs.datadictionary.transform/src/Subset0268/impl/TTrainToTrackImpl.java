/**
 */
package Subset0268.impl;

import Subset0268.ListType;
import Subset0268.Subset0268Package;
import Subset0268.TPacket;
import Subset0268.TTrainToTrack;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTrain To Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0268.impl.TTrainToTrackImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Subset0268.impl.TTrainToTrackImpl#getList <em>List</em>}</li>
 *   <li>{@link Subset0268.impl.TTrainToTrackImpl#getPacket <em>Packet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TTrainToTrackImpl extends MinimalEObjectImpl.Container implements TTrainToTrack {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTrainToTrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0268Package.Literals.TTRAIN_TO_TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Subset0268Package.TTRAIN_TO_TRACK__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getGroup().list(Subset0268Package.Literals.TTRAIN_TO_TRACK__LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPacket> getPacket() {
		return getGroup().list(Subset0268Package.Literals.TTRAIN_TO_TRACK__PACKET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0268Package.TTRAIN_TO_TRACK__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Subset0268Package.TTRAIN_TO_TRACK__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Subset0268Package.TTRAIN_TO_TRACK__PACKET:
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
			case Subset0268Package.TTRAIN_TO_TRACK__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Subset0268Package.TTRAIN_TO_TRACK__LIST:
				return getList();
			case Subset0268Package.TTRAIN_TO_TRACK__PACKET:
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
			case Subset0268Package.TTRAIN_TO_TRACK__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Subset0268Package.TTRAIN_TO_TRACK__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Subset0268Package.TTRAIN_TO_TRACK__PACKET:
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
			case Subset0268Package.TTRAIN_TO_TRACK__GROUP:
				getGroup().clear();
				return;
			case Subset0268Package.TTRAIN_TO_TRACK__LIST:
				getList().clear();
				return;
			case Subset0268Package.TTRAIN_TO_TRACK__PACKET:
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
			case Subset0268Package.TTRAIN_TO_TRACK__GROUP:
				return group != null && !group.isEmpty();
			case Subset0268Package.TTRAIN_TO_TRACK__LIST:
				return !getList().isEmpty();
			case Subset0268Package.TTRAIN_TO_TRACK__PACKET:
				return !getPacket().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //TTrainToTrackImpl
