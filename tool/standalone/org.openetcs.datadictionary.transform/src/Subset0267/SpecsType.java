/**
 */
package Subset0267;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0267.SpecsType#getGroup <em>Group</em>}</li>
 *   <li>{@link Subset0267.SpecsType#getSpecial <em>Special</em>}</li>
 *   <li>{@link Subset0267.SpecsType#getFormula <em>Formula</em>}</li>
 *   <li>{@link Subset0267.SpecsType#getLength <em>Length</em>}</li>
 *   <li>{@link Subset0267.SpecsType#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link Subset0267.SpecsType#getMinVal <em>Min Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0267.Subset0267Package#getSpecsType()
 * @model extendedMetaData="name='Specs_._type' kind='elementOnly'"
 * @generated
 */
public interface SpecsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see Subset0267.Subset0267Package#getSpecsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Special</b></em>' containment reference list.
	 * The list contents are of type {@link Subset0267.SpecialType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special</em>' containment reference list.
	 * @see Subset0267.Subset0267Package#getSpecsType_Special()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Special' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<SpecialType> getSpecial();

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * The literals are from the enumeration {@link Subset0267.TFormula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see Subset0267.TFormula
	 * @see #isSetFormula()
	 * @see #unsetFormula()
	 * @see #setFormula(TFormula)
	 * @see Subset0267.Subset0267Package#getSpecsType_Formula()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Formula' namespace='##targetNamespace'"
	 * @generated
	 */
	TFormula getFormula();

	/**
	 * Sets the value of the '{@link Subset0267.SpecsType#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see Subset0267.TFormula
	 * @see #isSetFormula()
	 * @see #unsetFormula()
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(TFormula value);

	/**
	 * Unsets the value of the '{@link Subset0267.SpecsType#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormula()
	 * @see #getFormula()
	 * @see #setFormula(TFormula)
	 * @generated
	 */
	void unsetFormula();

	/**
	 * Returns whether the value of the '{@link Subset0267.SpecsType#getFormula <em>Formula</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Formula</em>' attribute is set.
	 * @see #unsetFormula()
	 * @see #getFormula()
	 * @see #setFormula(TFormula)
	 * @generated
	 */
	boolean isSetFormula();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The literals are from the enumeration {@link Subset0267.TVarLen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see Subset0267.TVarLen
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(TVarLen)
	 * @see Subset0267.Subset0267Package#getSpecsType_Length()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Length' namespace='##targetNamespace'"
	 * @generated
	 */
	TVarLen getLength();

	/**
	 * Sets the value of the '{@link Subset0267.SpecsType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see Subset0267.TVarLen
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	void setLength(TVarLen value);

	/**
	 * Unsets the value of the '{@link Subset0267.SpecsType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(TVarLen)
	 * @generated
	 */
	void unsetLength();

	/**
	 * Returns whether the value of the '{@link Subset0267.SpecsType#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(TVarLen)
	 * @generated
	 */
	boolean isSetLength();

	/**
	 * Returns the value of the '<em><b>Max Val</b></em>' attribute.
	 * The literals are from the enumeration {@link Subset0267.TMaxVal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Val</em>' attribute.
	 * @see Subset0267.TMaxVal
	 * @see #isSetMaxVal()
	 * @see #unsetMaxVal()
	 * @see #setMaxVal(TMaxVal)
	 * @see Subset0267.Subset0267Package#getSpecsType_MaxVal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='MaxVal' namespace='##targetNamespace'"
	 * @generated
	 */
	TMaxVal getMaxVal();

	/**
	 * Sets the value of the '{@link Subset0267.SpecsType#getMaxVal <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Val</em>' attribute.
	 * @see Subset0267.TMaxVal
	 * @see #isSetMaxVal()
	 * @see #unsetMaxVal()
	 * @see #getMaxVal()
	 * @generated
	 */
	void setMaxVal(TMaxVal value);

	/**
	 * Unsets the value of the '{@link Subset0267.SpecsType#getMaxVal <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxVal()
	 * @see #getMaxVal()
	 * @see #setMaxVal(TMaxVal)
	 * @generated
	 */
	void unsetMaxVal();

	/**
	 * Returns whether the value of the '{@link Subset0267.SpecsType#getMaxVal <em>Max Val</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Val</em>' attribute is set.
	 * @see #unsetMaxVal()
	 * @see #getMaxVal()
	 * @see #setMaxVal(TMaxVal)
	 * @generated
	 */
	boolean isSetMaxVal();

	/**
	 * Returns the value of the '<em><b>Min Val</b></em>' attribute.
	 * The literals are from the enumeration {@link Subset0267.TMinVal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Val</em>' attribute.
	 * @see Subset0267.TMinVal
	 * @see #isSetMinVal()
	 * @see #unsetMinVal()
	 * @see #setMinVal(TMinVal)
	 * @see Subset0267.Subset0267Package#getSpecsType_MinVal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='MinVal' namespace='##targetNamespace'"
	 * @generated
	 */
	TMinVal getMinVal();

	/**
	 * Sets the value of the '{@link Subset0267.SpecsType#getMinVal <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Val</em>' attribute.
	 * @see Subset0267.TMinVal
	 * @see #isSetMinVal()
	 * @see #unsetMinVal()
	 * @see #getMinVal()
	 * @generated
	 */
	void setMinVal(TMinVal value);

	/**
	 * Unsets the value of the '{@link Subset0267.SpecsType#getMinVal <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinVal()
	 * @see #getMinVal()
	 * @see #setMinVal(TMinVal)
	 * @generated
	 */
	void unsetMinVal();

	/**
	 * Returns whether the value of the '{@link Subset0267.SpecsType#getMinVal <em>Min Val</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Val</em>' attribute is set.
	 * @see #unsetMinVal()
	 * @see #getMinVal()
	 * @see #setMinVal(TMinVal)
	 * @generated
	 */
	boolean isSetMinVal();

} // SpecsType
