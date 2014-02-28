/**
 */
package Subset0268.impl;

import Subset0268.OptionalPacketsType;
import Subset0268.ParcelType;
import Subset0268.Subset0268Package;

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
 * An implementation of the model object '<em><b>Optional Packets Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0268.impl.OptionalPacketsTypeImpl#getParcel <em>Parcel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionalPacketsTypeImpl extends MinimalEObjectImpl.Container implements OptionalPacketsType {
	/**
	 * The cached value of the '{@link #getParcel() <em>Parcel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParcel()
	 * @generated
	 * @ordered
	 */
	protected EList<ParcelType> parcel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionalPacketsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0268Package.Literals.OPTIONAL_PACKETS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParcelType> getParcel() {
		if (parcel == null) {
			parcel = new EObjectContainmentEList<ParcelType>(ParcelType.class, this, Subset0268Package.OPTIONAL_PACKETS_TYPE__PARCEL);
		}
		return parcel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0268Package.OPTIONAL_PACKETS_TYPE__PARCEL:
				return ((InternalEList<?>)getParcel()).basicRemove(otherEnd, msgs);
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
			case Subset0268Package.OPTIONAL_PACKETS_TYPE__PARCEL:
				return getParcel();
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
			case Subset0268Package.OPTIONAL_PACKETS_TYPE__PARCEL:
				getParcel().clear();
				getParcel().addAll((Collection<? extends ParcelType>)newValue);
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
			case Subset0268Package.OPTIONAL_PACKETS_TYPE__PARCEL:
				getParcel().clear();
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
			case Subset0268Package.OPTIONAL_PACKETS_TYPE__PARCEL:
				return parcel != null && !parcel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OptionalPacketsTypeImpl
