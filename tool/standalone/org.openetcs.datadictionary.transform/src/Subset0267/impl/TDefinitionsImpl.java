/**
 */
package Subset0267.impl;

import Subset0267.Subset0267Package;
import Subset0267.TDefinitions;
import Subset0267.TPackets;
import Subset0267.TVardefVar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0267.impl.TDefinitionsImpl#getPackets <em>Packets</em>}</li>
 *   <li>{@link Subset0267.impl.TDefinitionsImpl#getVarDef <em>Var Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDefinitionsImpl extends MinimalEObjectImpl.Container implements TDefinitions {
	/**
	 * The cached value of the '{@link #getPackets() <em>Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackets()
	 * @generated
	 * @ordered
	 */
	protected TPackets packets;

	/**
	 * The cached value of the '{@link #getVarDef() <em>Var Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarDef()
	 * @generated
	 * @ordered
	 */
	protected TVardefVar varDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0267Package.Literals.TDEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackets getPackets() {
		return packets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackets(TPackets newPackets, NotificationChain msgs) {
		TPackets oldPackets = packets;
		packets = newPackets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Subset0267Package.TDEFINITIONS__PACKETS, oldPackets, newPackets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackets(TPackets newPackets) {
		if (newPackets != packets) {
			NotificationChain msgs = null;
			if (packets != null)
				msgs = ((InternalEObject)packets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TDEFINITIONS__PACKETS, null, msgs);
			if (newPackets != null)
				msgs = ((InternalEObject)newPackets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TDEFINITIONS__PACKETS, null, msgs);
			msgs = basicSetPackets(newPackets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.TDEFINITIONS__PACKETS, newPackets, newPackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVardefVar getVarDef() {
		return varDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarDef(TVardefVar newVarDef, NotificationChain msgs) {
		TVardefVar oldVarDef = varDef;
		varDef = newVarDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Subset0267Package.TDEFINITIONS__VAR_DEF, oldVarDef, newVarDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarDef(TVardefVar newVarDef) {
		if (newVarDef != varDef) {
			NotificationChain msgs = null;
			if (varDef != null)
				msgs = ((InternalEObject)varDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TDEFINITIONS__VAR_DEF, null, msgs);
			if (newVarDef != null)
				msgs = ((InternalEObject)newVarDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TDEFINITIONS__VAR_DEF, null, msgs);
			msgs = basicSetVarDef(newVarDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.TDEFINITIONS__VAR_DEF, newVarDef, newVarDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0267Package.TDEFINITIONS__PACKETS:
				return basicSetPackets(null, msgs);
			case Subset0267Package.TDEFINITIONS__VAR_DEF:
				return basicSetVarDef(null, msgs);
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
			case Subset0267Package.TDEFINITIONS__PACKETS:
				return getPackets();
			case Subset0267Package.TDEFINITIONS__VAR_DEF:
				return getVarDef();
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
			case Subset0267Package.TDEFINITIONS__PACKETS:
				setPackets((TPackets)newValue);
				return;
			case Subset0267Package.TDEFINITIONS__VAR_DEF:
				setVarDef((TVardefVar)newValue);
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
			case Subset0267Package.TDEFINITIONS__PACKETS:
				setPackets((TPackets)null);
				return;
			case Subset0267Package.TDEFINITIONS__VAR_DEF:
				setVarDef((TVardefVar)null);
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
			case Subset0267Package.TDEFINITIONS__PACKETS:
				return packets != null;
			case Subset0267Package.TDEFINITIONS__VAR_DEF:
				return varDef != null;
		}
		return super.eIsSet(featureID);
	}

} //TDefinitionsImpl
