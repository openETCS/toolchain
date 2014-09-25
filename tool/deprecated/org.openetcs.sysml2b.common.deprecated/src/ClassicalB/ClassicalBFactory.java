/**
 */
package ClassicalB;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ClassicalB.ClassicalBPackage
 * @generated
 */
public interface ClassicalBFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassicalBFactory eINSTANCE = ClassicalB.impl.ClassicalBFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BAbstract Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BAbstract Machine</em>'.
	 * @generated
	 */
	BAbstractMachine createBAbstractMachine();

	/**
	 * Returns a new object of class '<em>BRefinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BRefinement</em>'.
	 * @generated
	 */
	BRefinement createBRefinement();

	/**
	 * Returns a new object of class '<em>BImplementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BImplementation</em>'.
	 * @generated
	 */
	BImplementation createBImplementation();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>BModule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BModule</em>'.
	 * @generated
	 */
	BModule createBModule();

	/**
	 * Returns a new object of class '<em>BOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOperation</em>'.
	 * @generated
	 */
	BOperation createBOperation();

	/**
	 * Returns a new object of class '<em>BAbstract Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BAbstract Variable</em>'.
	 * @generated
	 */
	BAbstractVariable createBAbstractVariable();

	/**
	 * Returns a new object of class '<em>BInvariant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BInvariant</em>'.
	 * @generated
	 */
	BInvariant createBInvariant();

	/**
	 * Returns a new object of class '<em>BConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BConstraint</em>'.
	 * @generated
	 */
	BConstraint createBConstraint();

	/**
	 * Returns a new object of class '<em>BSet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BSet</em>'.
	 * @generated
	 */
	BSet createBSet();

	/**
	 * Returns a new object of class '<em>BConcrete Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BConcrete Constant</em>'.
	 * @generated
	 */
	BConcreteConstant createBConcreteConstant();

	/**
	 * Returns a new object of class '<em>BAbstract Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BAbstract Constant</em>'.
	 * @generated
	 */
	BAbstractConstant createBAbstractConstant();

	/**
	 * Returns a new object of class '<em>BProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BProperty</em>'.
	 * @generated
	 */
	BProperty createBProperty();

	/**
	 * Returns a new object of class '<em>BConcrete Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BConcrete Variable</em>'.
	 * @generated
	 */
	BConcreteVariable createBConcreteVariable();

	/**
	 * Returns a new object of class '<em>BAssertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BAssertion</em>'.
	 * @generated
	 */
	BAssertion createBAssertion();

	/**
	 * Returns a new object of class '<em>BInitialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BInitialization</em>'.
	 * @generated
	 */
	BInitialization createBInitialization();

	/**
	 * Returns a new object of class '<em>BParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BParameter</em>'.
	 * @generated
	 */
	BParameter createBParameter();

	/**
	 * Returns a new object of class '<em>BType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BType</em>'.
	 * @generated
	 */
	BType createBType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClassicalBPackage getClassicalBPackage();

} //ClassicalBFactory
