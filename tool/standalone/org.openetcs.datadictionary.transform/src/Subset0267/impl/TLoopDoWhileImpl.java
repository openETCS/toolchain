/**
 */
package Subset0267.impl;

import Subset0267.Subset0267Package;
import Subset0267.TConditional;
import Subset0267.TLoopDoWhile;
import Subset0267.TLoopWhile;
import Subset0267.TTlgVar;

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
 * An implementation of the model object '<em><b>TLoop Do While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0267.impl.TLoopDoWhileImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Subset0267.impl.TLoopDoWhileImpl#getTlgVar <em>Tlg Var</em>}</li>
 *   <li>{@link Subset0267.impl.TLoopDoWhileImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link Subset0267.impl.TLoopDoWhileImpl#getLoopWhile <em>Loop While</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TLoopDoWhileImpl extends MinimalEObjectImpl.Container implements TLoopDoWhile {
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
	protected TLoopDoWhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0267Package.Literals.TLOOP_DO_WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Subset0267Package.TLOOP_DO_WHILE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TTlgVar> getTlgVar() {
		return getGroup().list(Subset0267Package.Literals.TLOOP_DO_WHILE__TLG_VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TConditional> getConditional() {
		return getGroup().list(Subset0267Package.Literals.TLOOP_DO_WHILE__CONDITIONAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TLoopWhile> getLoopWhile() {
		return getGroup().list(Subset0267Package.Literals.TLOOP_DO_WHILE__LOOP_WHILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0267Package.TLOOP_DO_WHILE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Subset0267Package.TLOOP_DO_WHILE__TLG_VAR:
				return ((InternalEList<?>)getTlgVar()).basicRemove(otherEnd, msgs);
			case Subset0267Package.TLOOP_DO_WHILE__CONDITIONAL:
				return ((InternalEList<?>)getConditional()).basicRemove(otherEnd, msgs);
			case Subset0267Package.TLOOP_DO_WHILE__LOOP_WHILE:
				return ((InternalEList<?>)getLoopWhile()).basicRemove(otherEnd, msgs);
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
			case Subset0267Package.TLOOP_DO_WHILE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Subset0267Package.TLOOP_DO_WHILE__TLG_VAR:
				return getTlgVar();
			case Subset0267Package.TLOOP_DO_WHILE__CONDITIONAL:
				return getConditional();
			case Subset0267Package.TLOOP_DO_WHILE__LOOP_WHILE:
				return getLoopWhile();
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
			case Subset0267Package.TLOOP_DO_WHILE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Subset0267Package.TLOOP_DO_WHILE__TLG_VAR:
				getTlgVar().clear();
				getTlgVar().addAll((Collection<? extends TTlgVar>)newValue);
				return;
			case Subset0267Package.TLOOP_DO_WHILE__CONDITIONAL:
				getConditional().clear();
				getConditional().addAll((Collection<? extends TConditional>)newValue);
				return;
			case Subset0267Package.TLOOP_DO_WHILE__LOOP_WHILE:
				getLoopWhile().clear();
				getLoopWhile().addAll((Collection<? extends TLoopWhile>)newValue);
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
			case Subset0267Package.TLOOP_DO_WHILE__GROUP:
				getGroup().clear();
				return;
			case Subset0267Package.TLOOP_DO_WHILE__TLG_VAR:
				getTlgVar().clear();
				return;
			case Subset0267Package.TLOOP_DO_WHILE__CONDITIONAL:
				getConditional().clear();
				return;
			case Subset0267Package.TLOOP_DO_WHILE__LOOP_WHILE:
				getLoopWhile().clear();
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
			case Subset0267Package.TLOOP_DO_WHILE__GROUP:
				return group != null && !group.isEmpty();
			case Subset0267Package.TLOOP_DO_WHILE__TLG_VAR:
				return !getTlgVar().isEmpty();
			case Subset0267Package.TLOOP_DO_WHILE__CONDITIONAL:
				return !getConditional().isEmpty();
			case Subset0267Package.TLOOP_DO_WHILE__LOOP_WHILE:
				return !getLoopWhile().isEmpty();
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

} //TLoopDoWhileImpl
