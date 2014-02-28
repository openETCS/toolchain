/**
 */
package Subset0268;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TContent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0268.TContent#getGroup <em>Group</em>}</li>
 *   <li>{@link Subset0268.TContent#getTlgVar <em>Tlg Var</em>}</li>
 *   <li>{@link Subset0268.TContent#getParcel <em>Parcel</em>}</li>
 *   <li>{@link Subset0268.TContent#getOptionalPackets <em>Optional Packets</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0268.Subset0268Package#getTContent()
 * @model extendedMetaData="name='T_Content' kind='elementOnly'"
 * @generated
 */
public interface TContent extends EObject {
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
	 * @see Subset0268.Subset0268Package#getTContent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Tlg Var</b></em>' containment reference list.
	 * The list contents are of type {@link Subset0268.TTlgVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tlg Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tlg Var</em>' containment reference list.
	 * @see Subset0268.Subset0268Package#getTContent_TlgVar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TlgVar' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<TTlgVar> getTlgVar();

	/**
	 * Returns the value of the '<em><b>Parcel</b></em>' containment reference list.
	 * The list contents are of type {@link Subset0268.ParcelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parcel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parcel</em>' containment reference list.
	 * @see Subset0268.Subset0268Package#getTContent_Parcel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Parcel' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<ParcelType> getParcel();

	/**
	 * Returns the value of the '<em><b>Optional Packets</b></em>' containment reference list.
	 * The list contents are of type {@link Subset0268.OptionalPacketsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Packets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Packets</em>' containment reference list.
	 * @see Subset0268.Subset0268Package#getTContent_OptionalPackets()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OptionalPackets' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<OptionalPacketsType> getOptionalPackets();

} // TContent
