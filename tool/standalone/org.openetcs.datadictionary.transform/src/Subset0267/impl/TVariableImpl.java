/**
 */
package Subset0267.impl;

import Subset0267.SpecsType;
import Subset0267.Subset0267Package;
import Subset0267.TVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TVariable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0267.impl.TVariableImpl#getDetailedName <em>Detailed Name</em>}</li>
 *   <li>{@link Subset0267.impl.TVariableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Subset0267.impl.TVariableImpl#getSpecs <em>Specs</em>}</li>
 *   <li>{@link Subset0267.impl.TVariableImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TVariableImpl extends MinimalEObjectImpl.Container implements TVariable {
	/**
	 * The default value of the '{@link #getDetailedName() <em>Detailed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedName()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailedName() <em>Detailed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedName()
	 * @generated
	 * @ordered
	 */
	protected String detailedName = DETAILED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecs() <em>Specs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecs()
	 * @generated
	 * @ordered
	 */
	protected SpecsType specs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0267Package.Literals.TVARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailedName() {
		return detailedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailedName(String newDetailedName) {
		String oldDetailedName = detailedName;
		detailedName = newDetailedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.TVARIABLE__DETAILED_NAME, oldDetailedName, detailedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.TVARIABLE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecsType getSpecs() {
		return specs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecs(SpecsType newSpecs, NotificationChain msgs) {
		SpecsType oldSpecs = specs;
		specs = newSpecs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Subset0267Package.TVARIABLE__SPECS, oldSpecs, newSpecs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecs(SpecsType newSpecs) {
		if (newSpecs != specs) {
			NotificationChain msgs = null;
			if (specs != null)
				msgs = ((InternalEObject)specs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TVARIABLE__SPECS, null, msgs);
			if (newSpecs != null)
				msgs = ((InternalEObject)newSpecs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Subset0267Package.TVARIABLE__SPECS, null, msgs);
			msgs = basicSetSpecs(newSpecs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.TVARIABLE__SPECS, newSpecs, newSpecs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.TVARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0267Package.TVARIABLE__SPECS:
				return basicSetSpecs(null, msgs);
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
			case Subset0267Package.TVARIABLE__DETAILED_NAME:
				return getDetailedName();
			case Subset0267Package.TVARIABLE__DESCRIPTION:
				return getDescription();
			case Subset0267Package.TVARIABLE__SPECS:
				return getSpecs();
			case Subset0267Package.TVARIABLE__NAME:
				return getName();
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
			case Subset0267Package.TVARIABLE__DETAILED_NAME:
				setDetailedName((String)newValue);
				return;
			case Subset0267Package.TVARIABLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Subset0267Package.TVARIABLE__SPECS:
				setSpecs((SpecsType)newValue);
				return;
			case Subset0267Package.TVARIABLE__NAME:
				setName((String)newValue);
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
			case Subset0267Package.TVARIABLE__DETAILED_NAME:
				setDetailedName(DETAILED_NAME_EDEFAULT);
				return;
			case Subset0267Package.TVARIABLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Subset0267Package.TVARIABLE__SPECS:
				setSpecs((SpecsType)null);
				return;
			case Subset0267Package.TVARIABLE__NAME:
				setName(NAME_EDEFAULT);
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
			case Subset0267Package.TVARIABLE__DETAILED_NAME:
				return DETAILED_NAME_EDEFAULT == null ? detailedName != null : !DETAILED_NAME_EDEFAULT.equals(detailedName);
			case Subset0267Package.TVARIABLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Subset0267Package.TVARIABLE__SPECS:
				return specs != null;
			case Subset0267Package.TVARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (detailedName: ");
		result.append(detailedName);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TVariableImpl
