/**
 */
package Subset0267;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TVariable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0267.TVariable#getDetailedName <em>Detailed Name</em>}</li>
 *   <li>{@link Subset0267.TVariable#getDescription <em>Description</em>}</li>
 *   <li>{@link Subset0267.TVariable#getSpecs <em>Specs</em>}</li>
 *   <li>{@link Subset0267.TVariable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0267.Subset0267Package#getTVariable()
 * @model extendedMetaData="name='T_Variable' kind='elementOnly'"
 * @generated
 */
public interface TVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Detailed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detailed Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detailed Name</em>' attribute.
	 * @see #setDetailedName(String)
	 * @see Subset0267.Subset0267Package#getTVariable_DetailedName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DetailedName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDetailedName();

	/**
	 * Sets the value of the '{@link Subset0267.TVariable#getDetailedName <em>Detailed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailed Name</em>' attribute.
	 * @see #getDetailedName()
	 * @generated
	 */
	void setDetailedName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Subset0267.Subset0267Package#getTVariable_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Subset0267.TVariable#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Specs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specs</em>' containment reference.
	 * @see #setSpecs(SpecsType)
	 * @see Subset0267.Subset0267Package#getTVariable_Specs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Specs' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecsType getSpecs();

	/**
	 * Sets the value of the '{@link Subset0267.TVariable#getSpecs <em>Specs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specs</em>' containment reference.
	 * @see #getSpecs()
	 * @generated
	 */
	void setSpecs(SpecsType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Subset0267.Subset0267Package#getTVariable_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Subset0267.TVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TVariable
