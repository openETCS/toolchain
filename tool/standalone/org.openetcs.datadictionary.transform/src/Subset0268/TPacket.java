/**
 */
package Subset0268;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPacket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0268.TPacket#getDescription <em>Description</em>}</li>
 *   <li>{@link Subset0268.TPacket#getContent <em>Content</em>}</li>
 *   <li>{@link Subset0268.TPacket#getName <em>Name</em>}</li>
 *   <li>{@link Subset0268.TPacket#getNumber <em>Number</em>}</li>
 *   <li>{@link Subset0268.TPacket#getTransmissionMedia <em>Transmission Media</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0268.Subset0268Package#getTPacket()
 * @model extendedMetaData="name='T_Packet' kind='elementOnly'"
 * @generated
 */
public interface TPacket extends EObject {
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
	 * @see Subset0268.Subset0268Package#getTPacket_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Subset0268.TPacket#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(TContent)
	 * @see Subset0268.Subset0268Package#getTPacket_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Content' namespace='##targetNamespace'"
	 * @generated
	 */
	TContent getContent();

	/**
	 * Sets the value of the '{@link Subset0268.TPacket#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(TContent value);

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
	 * @see Subset0268.Subset0268Package#getTPacket_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Subset0268.TPacket#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigInteger)
	 * @see Subset0268.Subset0268Package#getTPacket_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='Number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link Subset0268.TPacket#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Transmission Media</b></em>' attribute.
	 * The literals are from the enumeration {@link Subset0268.TTransmissionMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Media</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Media</em>' attribute.
	 * @see Subset0268.TTransmissionMedia
	 * @see #isSetTransmissionMedia()
	 * @see #unsetTransmissionMedia()
	 * @see #setTransmissionMedia(TTransmissionMedia)
	 * @see Subset0268.Subset0268Package#getTPacket_TransmissionMedia()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='TransmissionMedia' namespace='##targetNamespace'"
	 * @generated
	 */
	TTransmissionMedia getTransmissionMedia();

	/**
	 * Sets the value of the '{@link Subset0268.TPacket#getTransmissionMedia <em>Transmission Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Media</em>' attribute.
	 * @see Subset0268.TTransmissionMedia
	 * @see #isSetTransmissionMedia()
	 * @see #unsetTransmissionMedia()
	 * @see #getTransmissionMedia()
	 * @generated
	 */
	void setTransmissionMedia(TTransmissionMedia value);

	/**
	 * Unsets the value of the '{@link Subset0268.TPacket#getTransmissionMedia <em>Transmission Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransmissionMedia()
	 * @see #getTransmissionMedia()
	 * @see #setTransmissionMedia(TTransmissionMedia)
	 * @generated
	 */
	void unsetTransmissionMedia();

	/**
	 * Returns whether the value of the '{@link Subset0268.TPacket#getTransmissionMedia <em>Transmission Media</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transmission Media</em>' attribute is set.
	 * @see #unsetTransmissionMedia()
	 * @see #getTransmissionMedia()
	 * @see #setTransmissionMedia(TTransmissionMedia)
	 * @generated
	 */
	boolean isSetTransmissionMedia();

} // TPacket
