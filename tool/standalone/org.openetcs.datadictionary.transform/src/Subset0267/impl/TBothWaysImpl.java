/**
 */
package Subset0267.impl;

import Subset0267.ListType;
import Subset0267.Subset0267Package;
import Subset0267.TBothWays;
import Subset0267.TPacket;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TBoth Ways</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0267.impl.TBothWaysImpl#getList <em>List</em>}</li>
 *   <li>{@link Subset0267.impl.TBothWaysImpl#getPacket <em>Packet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TBothWaysImpl extends MinimalEObjectImpl.Container implements TBothWays {
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
	 * The cached value of the '{@link #getPacket() <em>Packet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacket()
	 * @generated
	 * @ordered
	 */
	protected TPacket packet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBothWaysImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0267Package.Literals.TBOTH_WAYS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		if (list == null) {
			list = new EObjectContainmentEList<ListType>(ListType.class, this, Subset0267Package.TBOTH_WAYS__LIST);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPacket getPacket() {
		return packet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPacket(TPacket newPacket, NotificationChain msgs) {
		TPacket oldPacket = packet;
		packet = newPacket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Subset0267Package.TBOTH_WAYS__PACKET, oldPacket, newPacket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacket(TPacket newPacket) {
		if (newPacket != packet) {
			NotificationChain msgs = null;
			if (packet != null)
				msgs = ((InternalEObject)packet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TBOTH_WAYS__PACKET, null, msgs);
			if (newPacket != null)
				msgs = ((InternalEObject)newPacket).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TBOTH_WAYS__PACKET, null, msgs);
			msgs = basicSetPacket(newPacket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.TBOTH_WAYS__PACKET, newPacket, newPacket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0267Package.TBOTH_WAYS__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Subset0267Package.TBOTH_WAYS__PACKET:
				return basicSetPacket(null, msgs);
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
			case Subset0267Package.TBOTH_WAYS__LIST:
				return getList();
			case Subset0267Package.TBOTH_WAYS__PACKET:
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
			case Subset0267Package.TBOTH_WAYS__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case Subset0267Package.TBOTH_WAYS__PACKET:
				setPacket((TPacket)newValue);
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
			case Subset0267Package.TBOTH_WAYS__LIST:
				getList().clear();
				return;
			case Subset0267Package.TBOTH_WAYS__PACKET:
				setPacket((TPacket)null);
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
			case Subset0267Package.TBOTH_WAYS__LIST:
				return list != null && !list.isEmpty();
			case Subset0267Package.TBOTH_WAYS__PACKET:
				return packet != null;
		}
		return super.eIsSet(featureID);
	}

} //TBothWaysImpl
