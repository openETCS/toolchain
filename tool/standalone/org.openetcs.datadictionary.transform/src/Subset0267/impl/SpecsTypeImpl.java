/**
 */
package Subset0267.impl;

import Subset0267.SpecialType;
import Subset0267.SpecsType;
import Subset0267.Subset0267Package;
import Subset0267.TFormula;
import Subset0267.TMaxVal;
import Subset0267.TMinVal;
import Subset0267.TVarLen;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0267.impl.SpecsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Subset0267.impl.SpecsTypeImpl#getSpecial <em>Special</em>}</li>
 *   <li>{@link Subset0267.impl.SpecsTypeImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link Subset0267.impl.SpecsTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Subset0267.impl.SpecsTypeImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link Subset0267.impl.SpecsTypeImpl#getMinVal <em>Min Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecsTypeImpl extends MinimalEObjectImpl.Container implements SpecsType {
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
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final TFormula FORMULA_EDEFAULT = TFormula._002;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected TFormula formula = FORMULA_EDEFAULT;

	/**
	 * This is true if the Formula attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formulaESet;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final TVarLen LENGTH_EDEFAULT = TVarLen._;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected TVarLen length = LENGTH_EDEFAULT;

	/**
	 * This is true if the Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lengthESet;

	/**
	 * The default value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected static final TMaxVal MAX_VAL_EDEFAULT = TMaxVal._;

	/**
	 * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected TMaxVal maxVal = MAX_VAL_EDEFAULT;

	/**
	 * This is true if the Max Val attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxValESet;

	/**
	 * The default value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected static final TMinVal MIN_VAL_EDEFAULT = TMinVal._327680_KM;

	/**
	 * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected TMinVal minVal = MIN_VAL_EDEFAULT;

	/**
	 * This is true if the Min Val attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minValESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0267Package.Literals.SPECS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Subset0267Package.SPECS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecialType> getSpecial() {
		return getGroup().list(Subset0267Package.Literals.SPECS_TYPE__SPECIAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFormula getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(TFormula newFormula) {
		TFormula oldFormula = formula;
		formula = newFormula == null ? FORMULA_EDEFAULT : newFormula;
		boolean oldFormulaESet = formulaESet;
		formulaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.SPECS_TYPE__FORMULA, oldFormula, formula, !oldFormulaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormula() {
		TFormula oldFormula = formula;
		boolean oldFormulaESet = formulaESet;
		formula = FORMULA_EDEFAULT;
		formulaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Subset0267Package.SPECS_TYPE__FORMULA, oldFormula, FORMULA_EDEFAULT, oldFormulaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormula() {
		return formulaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVarLen getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(TVarLen newLength) {
		TVarLen oldLength = length;
		length = newLength == null ? LENGTH_EDEFAULT : newLength;
		boolean oldLengthESet = lengthESet;
		lengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.SPECS_TYPE__LENGTH, oldLength, length, !oldLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLength() {
		TVarLen oldLength = length;
		boolean oldLengthESet = lengthESet;
		length = LENGTH_EDEFAULT;
		lengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Subset0267Package.SPECS_TYPE__LENGTH, oldLength, LENGTH_EDEFAULT, oldLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLength() {
		return lengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMaxVal getMaxVal() {
		return maxVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVal(TMaxVal newMaxVal) {
		TMaxVal oldMaxVal = maxVal;
		maxVal = newMaxVal == null ? MAX_VAL_EDEFAULT : newMaxVal;
		boolean oldMaxValESet = maxValESet;
		maxValESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.SPECS_TYPE__MAX_VAL, oldMaxVal, maxVal, !oldMaxValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxVal() {
		TMaxVal oldMaxVal = maxVal;
		boolean oldMaxValESet = maxValESet;
		maxVal = MAX_VAL_EDEFAULT;
		maxValESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Subset0267Package.SPECS_TYPE__MAX_VAL, oldMaxVal, MAX_VAL_EDEFAULT, oldMaxValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxVal() {
		return maxValESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMinVal getMinVal() {
		return minVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVal(TMinVal newMinVal) {
		TMinVal oldMinVal = minVal;
		minVal = newMinVal == null ? MIN_VAL_EDEFAULT : newMinVal;
		boolean oldMinValESet = minValESet;
		minValESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0267Package.SPECS_TYPE__MIN_VAL, oldMinVal, minVal, !oldMinValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinVal() {
		TMinVal oldMinVal = minVal;
		boolean oldMinValESet = minValESet;
		minVal = MIN_VAL_EDEFAULT;
		minValESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Subset0267Package.SPECS_TYPE__MIN_VAL, oldMinVal, MIN_VAL_EDEFAULT, oldMinValESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinVal() {
		return minValESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0267Package.SPECS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Subset0267Package.SPECS_TYPE__SPECIAL:
				return ((InternalEList<?>)getSpecial()).basicRemove(otherEnd, msgs);
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
			case Subset0267Package.SPECS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Subset0267Package.SPECS_TYPE__SPECIAL:
				return getSpecial();
			case Subset0267Package.SPECS_TYPE__FORMULA:
				return getFormula();
			case Subset0267Package.SPECS_TYPE__LENGTH:
				return getLength();
			case Subset0267Package.SPECS_TYPE__MAX_VAL:
				return getMaxVal();
			case Subset0267Package.SPECS_TYPE__MIN_VAL:
				return getMinVal();
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
			case Subset0267Package.SPECS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Subset0267Package.SPECS_TYPE__SPECIAL:
				getSpecial().clear();
				getSpecial().addAll((Collection<? extends SpecialType>)newValue);
				return;
			case Subset0267Package.SPECS_TYPE__FORMULA:
				setFormula((TFormula)newValue);
				return;
			case Subset0267Package.SPECS_TYPE__LENGTH:
				setLength((TVarLen)newValue);
				return;
			case Subset0267Package.SPECS_TYPE__MAX_VAL:
				setMaxVal((TMaxVal)newValue);
				return;
			case Subset0267Package.SPECS_TYPE__MIN_VAL:
				setMinVal((TMinVal)newValue);
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
			case Subset0267Package.SPECS_TYPE__GROUP:
				getGroup().clear();
				return;
			case Subset0267Package.SPECS_TYPE__SPECIAL:
				getSpecial().clear();
				return;
			case Subset0267Package.SPECS_TYPE__FORMULA:
				unsetFormula();
				return;
			case Subset0267Package.SPECS_TYPE__LENGTH:
				unsetLength();
				return;
			case Subset0267Package.SPECS_TYPE__MAX_VAL:
				unsetMaxVal();
				return;
			case Subset0267Package.SPECS_TYPE__MIN_VAL:
				unsetMinVal();
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
			case Subset0267Package.SPECS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Subset0267Package.SPECS_TYPE__SPECIAL:
				return !getSpecial().isEmpty();
			case Subset0267Package.SPECS_TYPE__FORMULA:
				return isSetFormula();
			case Subset0267Package.SPECS_TYPE__LENGTH:
				return isSetLength();
			case Subset0267Package.SPECS_TYPE__MAX_VAL:
				return isSetMaxVal();
			case Subset0267Package.SPECS_TYPE__MIN_VAL:
				return isSetMinVal();
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
		result.append(", formula: ");
		if (formulaESet) result.append(formula); else result.append("<unset>");
		result.append(", length: ");
		if (lengthESet) result.append(length); else result.append("<unset>");
		result.append(", maxVal: ");
		if (maxValESet) result.append(maxVal); else result.append("<unset>");
		result.append(", minVal: ");
		if (minValESet) result.append(minVal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SpecsTypeImpl
