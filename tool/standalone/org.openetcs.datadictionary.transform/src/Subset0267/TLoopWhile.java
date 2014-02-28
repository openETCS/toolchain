/**
 */
package Subset0267;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLoop While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0267.TLoopWhile#getGroup <em>Group</em>}</li>
 *   <li>{@link Subset0267.TLoopWhile#getTlgVar <em>Tlg Var</em>}</li>
 *   <li>{@link Subset0267.TLoopWhile#getConditional <em>Conditional</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0267.Subset0267Package#getTLoopWhile()
 * @model extendedMetaData="name='T_LoopWhile' kind='elementOnly'"
 * @generated
 */
public interface TLoopWhile extends EObject {
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
	 * @see Subset0267.Subset0267Package#getTLoopWhile_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Tlg Var</b></em>' containment reference list.
	 * The list contents are of type {@link Subset0267.TTlgVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tlg Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tlg Var</em>' containment reference list.
	 * @see Subset0267.Subset0267Package#getTLoopWhile_TlgVar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TlgVar' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<TTlgVar> getTlgVar();

	/**
	 * Returns the value of the '<em><b>Conditional</b></em>' containment reference list.
	 * The list contents are of type {@link Subset0267.TConditional}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional</em>' containment reference list.
	 * @see Subset0267.Subset0267Package#getTLoopWhile_Conditional()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Conditional' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<TConditional> getConditional();

} // TLoopWhile
