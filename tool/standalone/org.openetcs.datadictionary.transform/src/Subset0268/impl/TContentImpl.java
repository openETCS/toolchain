/**
 */
package Subset0268.impl;

import Subset0268.OptionalPacketsType;
import Subset0268.ParcelType;
import Subset0268.Subset0268Package;
import Subset0268.TContent;
import Subset0268.TTlgVar;

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
 * An implementation of the model object '<em><b>TContent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0268.impl.TContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Subset0268.impl.TContentImpl#getTlgVar <em>Tlg Var</em>}</li>
 *   <li>{@link Subset0268.impl.TContentImpl#getParcel <em>Parcel</em>}</li>
 *   <li>{@link Subset0268.impl.TContentImpl#getOptionalPackets <em>Optional Packets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TContentImpl extends MinimalEObjectImpl.Container implements TContent {
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
	protected TContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0268Package.Literals.TCONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Subset0268Package.TCONTENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TTlgVar> getTlgVar() {
		return getGroup().list(Subset0268Package.Literals.TCONTENT__TLG_VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParcelType> getParcel() {
		return getGroup().list(Subset0268Package.Literals.TCONTENT__PARCEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionalPacketsType> getOptionalPackets() {
		return getGroup().list(Subset0268Package.Literals.TCONTENT__OPTIONAL_PACKETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0268Package.TCONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Subset0268Package.TCONTENT__TLG_VAR:
				return ((InternalEList<?>)getTlgVar()).basicRemove(otherEnd, msgs);
			case Subset0268Package.TCONTENT__PARCEL:
				return ((InternalEList<?>)getParcel()).basicRemove(otherEnd, msgs);
			case Subset0268Package.TCONTENT__OPTIONAL_PACKETS:
				return ((InternalEList<?>)getOptionalPackets()).basicRemove(otherEnd, msgs);
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
			case Subset0268Package.TCONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Subset0268Package.TCONTENT__TLG_VAR:
				return getTlgVar();
			case Subset0268Package.TCONTENT__PARCEL:
				return getParcel();
			case Subset0268Package.TCONTENT__OPTIONAL_PACKETS:
				return getOptionalPackets();
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
			case Subset0268Package.TCONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Subset0268Package.TCONTENT__TLG_VAR:
				getTlgVar().clear();
				getTlgVar().addAll((Collection<? extends TTlgVar>)newValue);
				return;
			case Subset0268Package.TCONTENT__PARCEL:
				getParcel().clear();
				getParcel().addAll((Collection<? extends ParcelType>)newValue);
				return;
			case Subset0268Package.TCONTENT__OPTIONAL_PACKETS:
				getOptionalPackets().clear();
				getOptionalPackets().addAll((Collection<? extends OptionalPacketsType>)newValue);
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
			case Subset0268Package.TCONTENT__GROUP:
				getGroup().clear();
				return;
			case Subset0268Package.TCONTENT__TLG_VAR:
				getTlgVar().clear();
				return;
			case Subset0268Package.TCONTENT__PARCEL:
				getParcel().clear();
				return;
			case Subset0268Package.TCONTENT__OPTIONAL_PACKETS:
				getOptionalPackets().clear();
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
			case Subset0268Package.TCONTENT__GROUP:
				return group != null && !group.isEmpty();
			case Subset0268Package.TCONTENT__TLG_VAR:
				return !getTlgVar().isEmpty();
			case Subset0268Package.TCONTENT__PARCEL:
				return !getParcel().isEmpty();
			case Subset0268Package.TCONTENT__OPTIONAL_PACKETS:
				return !getOptionalPackets().isEmpty();
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

} //TContentImpl
