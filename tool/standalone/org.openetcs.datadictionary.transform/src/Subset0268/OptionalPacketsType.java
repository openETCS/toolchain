/**
 */
package Subset0268;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Packets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0268.OptionalPacketsType#getParcel <em>Parcel</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0268.Subset0268Package#getOptionalPacketsType()
 * @model extendedMetaData="name='OptionalPackets_._type' kind='elementOnly'"
 * @generated
 */
public interface OptionalPacketsType extends EObject {
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
	 * @see Subset0268.Subset0268Package#getOptionalPacketsType_Parcel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Parcel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParcelType> getParcel();

} // OptionalPacketsType
