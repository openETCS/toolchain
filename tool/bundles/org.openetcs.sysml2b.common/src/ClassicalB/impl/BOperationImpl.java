/**
 */
package ClassicalB.impl;

import ClassicalB.BOperation;
import ClassicalB.BParameter;
import ClassicalB.ClassicalBPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ClassicalB.impl.BOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ClassicalB.impl.BOperationImpl#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link ClassicalB.impl.BOperationImpl#getOutParameters <em>Out Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BOperationImpl extends MinimalEObjectImpl.Container implements BOperation {
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
	 * The cached value of the '{@link #getInParameters() <em>In Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<BParameter> inParameters;
	/**
	 * The cached value of the '{@link #getOutParameters() <em>Out Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<BParameter> outParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassicalBPackage.Literals.BOPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassicalBPackage.BOPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BParameter> getInParameters() {
		if (inParameters == null) {
			inParameters = new EObjectResolvingEList<BParameter>(BParameter.class, this, ClassicalBPackage.BOPERATION__IN_PARAMETERS);
		}
		return inParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BParameter> getOutParameters() {
		if (outParameters == null) {
			outParameters = new EObjectResolvingEList<BParameter>(BParameter.class, this, ClassicalBPackage.BOPERATION__OUT_PARAMETERS);
		}
		return outParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassicalBPackage.BOPERATION__NAME:
				return getName();
			case ClassicalBPackage.BOPERATION__IN_PARAMETERS:
				return getInParameters();
			case ClassicalBPackage.BOPERATION__OUT_PARAMETERS:
				return getOutParameters();
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
			case ClassicalBPackage.BOPERATION__NAME:
				setName((String)newValue);
				return;
			case ClassicalBPackage.BOPERATION__IN_PARAMETERS:
				getInParameters().clear();
				getInParameters().addAll((Collection<? extends BParameter>)newValue);
				return;
			case ClassicalBPackage.BOPERATION__OUT_PARAMETERS:
				getOutParameters().clear();
				getOutParameters().addAll((Collection<? extends BParameter>)newValue);
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
			case ClassicalBPackage.BOPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassicalBPackage.BOPERATION__IN_PARAMETERS:
				getInParameters().clear();
				return;
			case ClassicalBPackage.BOPERATION__OUT_PARAMETERS:
				getOutParameters().clear();
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
			case ClassicalBPackage.BOPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassicalBPackage.BOPERATION__IN_PARAMETERS:
				return inParameters != null && !inParameters.isEmpty();
			case ClassicalBPackage.BOPERATION__OUT_PARAMETERS:
				return outParameters != null && !outParameters.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BOperationImpl
