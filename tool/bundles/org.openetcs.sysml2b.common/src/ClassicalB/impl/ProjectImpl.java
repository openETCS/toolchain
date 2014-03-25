/**
 */
package ClassicalB.impl;

import ClassicalB.BAbstractMachine;
import ClassicalB.BImplementation;
import ClassicalB.BRefinement;
import ClassicalB.ClassicalBPackage;
import ClassicalB.Project;

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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ClassicalB.impl.ProjectImpl#getMachines <em>Machines</em>}</li>
 *   <li>{@link ClassicalB.impl.ProjectImpl#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link ClassicalB.impl.ProjectImpl#getImplementations <em>Implementations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The cached value of the '{@link #getMachines() <em>Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<BAbstractMachine> machines;

	/**
	 * The cached value of the '{@link #getRefinements() <em>Refinements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinements()
	 * @generated
	 * @ordered
	 */
	protected EList<BRefinement> refinements;

	/**
	 * The cached value of the '{@link #getImplementations() <em>Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<BImplementation> implementations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassicalBPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BAbstractMachine> getMachines() {
		if (machines == null) {
			machines = new EObjectContainmentEList<BAbstractMachine>(BAbstractMachine.class, this, ClassicalBPackage.PROJECT__MACHINES);
		}
		return machines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BRefinement> getRefinements() {
		if (refinements == null) {
			refinements = new EObjectContainmentEList<BRefinement>(BRefinement.class, this, ClassicalBPackage.PROJECT__REFINEMENTS);
		}
		return refinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BImplementation> getImplementations() {
		if (implementations == null) {
			implementations = new EObjectContainmentEList<BImplementation>(BImplementation.class, this, ClassicalBPackage.PROJECT__IMPLEMENTATIONS);
		}
		return implementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassicalBPackage.PROJECT__MACHINES:
				return ((InternalEList<?>)getMachines()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.PROJECT__REFINEMENTS:
				return ((InternalEList<?>)getRefinements()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.PROJECT__IMPLEMENTATIONS:
				return ((InternalEList<?>)getImplementations()).basicRemove(otherEnd, msgs);
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
			case ClassicalBPackage.PROJECT__MACHINES:
				return getMachines();
			case ClassicalBPackage.PROJECT__REFINEMENTS:
				return getRefinements();
			case ClassicalBPackage.PROJECT__IMPLEMENTATIONS:
				return getImplementations();
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
			case ClassicalBPackage.PROJECT__MACHINES:
				getMachines().clear();
				getMachines().addAll((Collection<? extends BAbstractMachine>)newValue);
				return;
			case ClassicalBPackage.PROJECT__REFINEMENTS:
				getRefinements().clear();
				getRefinements().addAll((Collection<? extends BRefinement>)newValue);
				return;
			case ClassicalBPackage.PROJECT__IMPLEMENTATIONS:
				getImplementations().clear();
				getImplementations().addAll((Collection<? extends BImplementation>)newValue);
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
			case ClassicalBPackage.PROJECT__MACHINES:
				getMachines().clear();
				return;
			case ClassicalBPackage.PROJECT__REFINEMENTS:
				getRefinements().clear();
				return;
			case ClassicalBPackage.PROJECT__IMPLEMENTATIONS:
				getImplementations().clear();
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
			case ClassicalBPackage.PROJECT__MACHINES:
				return machines != null && !machines.isEmpty();
			case ClassicalBPackage.PROJECT__REFINEMENTS:
				return refinements != null && !refinements.isEmpty();
			case ClassicalBPackage.PROJECT__IMPLEMENTATIONS:
				return implementations != null && !implementations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
