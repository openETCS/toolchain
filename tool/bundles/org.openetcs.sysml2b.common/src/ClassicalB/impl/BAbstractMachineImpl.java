/**
 */
package ClassicalB.impl;

import ClassicalB.BAbstractConstant;
import ClassicalB.BAbstractMachine;
import ClassicalB.BAbstractVariable;
import ClassicalB.BAssertion;
import ClassicalB.BConcreteConstant;
import ClassicalB.BConcreteVariable;
import ClassicalB.BConstraint;
import ClassicalB.BInitialization;
import ClassicalB.BInvariant;
import ClassicalB.BModule;
import ClassicalB.BOperation;
import ClassicalB.BProperty;
import ClassicalB.BRefinement;
import ClassicalB.BSet;
import ClassicalB.ClassicalBPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BAbstract Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getSees <em>Sees</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getPromotes <em>Promotes</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getConcreteConstants <em>Concrete Constants</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getAbstractConstants <em>Abstract Constants</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getConcreteVariables <em>Concrete Variables</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getAbstractVariables <em>Abstract Variables</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link ClassicalB.impl.BAbstractMachineImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BAbstractMachineImpl extends BModuleImpl implements BAbstractMachine {
	/**
	 * The cached value of the '{@link #getRefinement() <em>Refinement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinement()
	 * @generated
	 * @ordered
	 */
	protected EList<BRefinement> refinement;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<BConstraint> constraints;

	/**
	 * The cached value of the '{@link #getSees() <em>Sees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSees()
	 * @generated
	 * @ordered
	 */
	protected EList<BModule> sees;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<BModule> includes;

	/**
	 * The cached value of the '{@link #getPromotes() <em>Promotes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotes()
	 * @generated
	 * @ordered
	 */
	protected EList<BOperation> promotes;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<BModule> extends_;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<BModule> uses;

	/**
	 * The cached value of the '{@link #getSets() <em>Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSets()
	 * @generated
	 * @ordered
	 */
	protected EList<BSet> sets;

	/**
	 * The cached value of the '{@link #getConcreteConstants() <em>Concrete Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcreteConstant> concreteConstants;

	/**
	 * The cached value of the '{@link #getAbstractConstants() <em>Abstract Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<BAbstractConstant> abstractConstants;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<BProperty> properties;

	/**
	 * The cached value of the '{@link #getConcreteVariables() <em>Concrete Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcreteVariable> concreteVariables;

	/**
	 * The cached value of the '{@link #getAbstractVariables() <em>Abstract Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<BAbstractVariable> abstractVariables;

	/**
	 * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariants()
	 * @generated
	 * @ordered
	 */
	protected EList<BInvariant> invariants;

	/**
	 * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertions()
	 * @generated
	 * @ordered
	 */
	protected EList<BAssertion> assertions;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected EList<BInitialization> initialization;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<BOperation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BAbstractMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassicalBPackage.Literals.BABSTRACT_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BRefinement> getRefinement() {
		if (refinement == null) {
			refinement = new EObjectResolvingEList<BRefinement>(BRefinement.class, this, ClassicalBPackage.BABSTRACT_MACHINE__REFINEMENT);
		}
		return refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<BConstraint>(BConstraint.class, this, ClassicalBPackage.BABSTRACT_MACHINE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BModule> getSees() {
		if (sees == null) {
			sees = new EObjectResolvingEList<BModule>(BModule.class, this, ClassicalBPackage.BABSTRACT_MACHINE__SEES);
		}
		return sees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BModule> getIncludes() {
		if (includes == null) {
			includes = new EObjectResolvingEList<BModule>(BModule.class, this, ClassicalBPackage.BABSTRACT_MACHINE__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BOperation> getPromotes() {
		if (promotes == null) {
			promotes = new EObjectResolvingEList<BOperation>(BOperation.class, this, ClassicalBPackage.BABSTRACT_MACHINE__PROMOTES);
		}
		return promotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BModule> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<BModule>(BModule.class, this, ClassicalBPackage.BABSTRACT_MACHINE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BModule> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<BModule>(BModule.class, this, ClassicalBPackage.BABSTRACT_MACHINE__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BSet> getSets() {
		if (sets == null) {
			sets = new EObjectContainmentEList<BSet>(BSet.class, this, ClassicalBPackage.BABSTRACT_MACHINE__SETS);
		}
		return sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BConcreteConstant> getConcreteConstants() {
		if (concreteConstants == null) {
			concreteConstants = new EObjectContainmentEList<BConcreteConstant>(BConcreteConstant.class, this, ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_CONSTANTS);
		}
		return concreteConstants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BAbstractConstant> getAbstractConstants() {
		if (abstractConstants == null) {
			abstractConstants = new EObjectContainmentEList<BAbstractConstant>(BAbstractConstant.class, this, ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_CONSTANTS);
		}
		return abstractConstants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<BProperty>(BProperty.class, this, ClassicalBPackage.BABSTRACT_MACHINE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BConcreteVariable> getConcreteVariables() {
		if (concreteVariables == null) {
			concreteVariables = new EObjectContainmentEList<BConcreteVariable>(BConcreteVariable.class, this, ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_VARIABLES);
		}
		return concreteVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BAbstractVariable> getAbstractVariables() {
		if (abstractVariables == null) {
			abstractVariables = new EObjectContainmentEList<BAbstractVariable>(BAbstractVariable.class, this, ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_VARIABLES);
		}
		return abstractVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BInvariant> getInvariants() {
		if (invariants == null) {
			invariants = new EObjectContainmentEList<BInvariant>(BInvariant.class, this, ClassicalBPackage.BABSTRACT_MACHINE__INVARIANTS);
		}
		return invariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BAssertion> getAssertions() {
		if (assertions == null) {
			assertions = new EObjectContainmentEList<BAssertion>(BAssertion.class, this, ClassicalBPackage.BABSTRACT_MACHINE__ASSERTIONS);
		}
		return assertions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BInitialization> getInitialization() {
		if (initialization == null) {
			initialization = new EObjectContainmentEList<BInitialization>(BInitialization.class, this, ClassicalBPackage.BABSTRACT_MACHINE__INITIALIZATION);
		}
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<BOperation>(BOperation.class, this, ClassicalBPackage.BABSTRACT_MACHINE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassicalBPackage.BABSTRACT_MACHINE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.BABSTRACT_MACHINE__SETS:
				return ((InternalEList<?>)getSets()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_CONSTANTS:
				return ((InternalEList<?>)getConcreteConstants()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_CONSTANTS:
				return ((InternalEList<?>)getAbstractConstants()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.BABSTRACT_MACHINE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_VARIABLES:
				return ((InternalEList<?>)getConcreteVariables()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_VARIABLES:
				return ((InternalEList<?>)getAbstractVariables()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.BABSTRACT_MACHINE__INVARIANTS:
				return ((InternalEList<?>)getInvariants()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.BABSTRACT_MACHINE__ASSERTIONS:
				return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.BABSTRACT_MACHINE__INITIALIZATION:
				return ((InternalEList<?>)getInitialization()).basicRemove(otherEnd, msgs);
			case ClassicalBPackage.BABSTRACT_MACHINE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case ClassicalBPackage.BABSTRACT_MACHINE__REFINEMENT:
				return getRefinement();
			case ClassicalBPackage.BABSTRACT_MACHINE__CONSTRAINTS:
				return getConstraints();
			case ClassicalBPackage.BABSTRACT_MACHINE__SEES:
				return getSees();
			case ClassicalBPackage.BABSTRACT_MACHINE__INCLUDES:
				return getIncludes();
			case ClassicalBPackage.BABSTRACT_MACHINE__PROMOTES:
				return getPromotes();
			case ClassicalBPackage.BABSTRACT_MACHINE__EXTENDS:
				return getExtends();
			case ClassicalBPackage.BABSTRACT_MACHINE__USES:
				return getUses();
			case ClassicalBPackage.BABSTRACT_MACHINE__SETS:
				return getSets();
			case ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_CONSTANTS:
				return getConcreteConstants();
			case ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_CONSTANTS:
				return getAbstractConstants();
			case ClassicalBPackage.BABSTRACT_MACHINE__PROPERTIES:
				return getProperties();
			case ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_VARIABLES:
				return getConcreteVariables();
			case ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_VARIABLES:
				return getAbstractVariables();
			case ClassicalBPackage.BABSTRACT_MACHINE__INVARIANTS:
				return getInvariants();
			case ClassicalBPackage.BABSTRACT_MACHINE__ASSERTIONS:
				return getAssertions();
			case ClassicalBPackage.BABSTRACT_MACHINE__INITIALIZATION:
				return getInitialization();
			case ClassicalBPackage.BABSTRACT_MACHINE__OPERATIONS:
				return getOperations();
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
			case ClassicalBPackage.BABSTRACT_MACHINE__REFINEMENT:
				getRefinement().clear();
				getRefinement().addAll((Collection<? extends BRefinement>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends BConstraint>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__SEES:
				getSees().clear();
				getSees().addAll((Collection<? extends BModule>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends BModule>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__PROMOTES:
				getPromotes().clear();
				getPromotes().addAll((Collection<? extends BOperation>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends BModule>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends BModule>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__SETS:
				getSets().clear();
				getSets().addAll((Collection<? extends BSet>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_CONSTANTS:
				getConcreteConstants().clear();
				getConcreteConstants().addAll((Collection<? extends BConcreteConstant>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_CONSTANTS:
				getAbstractConstants().clear();
				getAbstractConstants().addAll((Collection<? extends BAbstractConstant>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends BProperty>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_VARIABLES:
				getConcreteVariables().clear();
				getConcreteVariables().addAll((Collection<? extends BConcreteVariable>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_VARIABLES:
				getAbstractVariables().clear();
				getAbstractVariables().addAll((Collection<? extends BAbstractVariable>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__INVARIANTS:
				getInvariants().clear();
				getInvariants().addAll((Collection<? extends BInvariant>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__ASSERTIONS:
				getAssertions().clear();
				getAssertions().addAll((Collection<? extends BAssertion>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__INITIALIZATION:
				getInitialization().clear();
				getInitialization().addAll((Collection<? extends BInitialization>)newValue);
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends BOperation>)newValue);
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
			case ClassicalBPackage.BABSTRACT_MACHINE__REFINEMENT:
				getRefinement().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__SEES:
				getSees().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__INCLUDES:
				getIncludes().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__PROMOTES:
				getPromotes().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__EXTENDS:
				getExtends().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__USES:
				getUses().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__SETS:
				getSets().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_CONSTANTS:
				getConcreteConstants().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_CONSTANTS:
				getAbstractConstants().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__PROPERTIES:
				getProperties().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_VARIABLES:
				getConcreteVariables().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_VARIABLES:
				getAbstractVariables().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__INVARIANTS:
				getInvariants().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__ASSERTIONS:
				getAssertions().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__INITIALIZATION:
				getInitialization().clear();
				return;
			case ClassicalBPackage.BABSTRACT_MACHINE__OPERATIONS:
				getOperations().clear();
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
			case ClassicalBPackage.BABSTRACT_MACHINE__REFINEMENT:
				return refinement != null && !refinement.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__SEES:
				return sees != null && !sees.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__INCLUDES:
				return includes != null && !includes.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__PROMOTES:
				return promotes != null && !promotes.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__USES:
				return uses != null && !uses.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__SETS:
				return sets != null && !sets.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_CONSTANTS:
				return concreteConstants != null && !concreteConstants.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_CONSTANTS:
				return abstractConstants != null && !abstractConstants.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__CONCRETE_VARIABLES:
				return concreteVariables != null && !concreteVariables.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__ABSTRACT_VARIABLES:
				return abstractVariables != null && !abstractVariables.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__INVARIANTS:
				return invariants != null && !invariants.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__ASSERTIONS:
				return assertions != null && !assertions.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__INITIALIZATION:
				return initialization != null && !initialization.isEmpty();
			case ClassicalBPackage.BABSTRACT_MACHINE__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BAbstractMachineImpl
