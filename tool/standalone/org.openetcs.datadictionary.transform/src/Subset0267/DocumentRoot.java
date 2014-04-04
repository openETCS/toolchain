/**
 */
package Subset0267;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0267.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getBothWays <em>Both Ways</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getComment <em>Comment</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getCondition <em>Condition</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getConditional <em>Conditional</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getContent <em>Content</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getDetailedName <em>Detailed Name</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getIDNumber <em>ID Number</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getLength <em>Length</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getList <em>List</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getLoopDoWhile <em>Loop Do While</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getLoopWhile <em>Loop While</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getPacket <em>Packet</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getPackets <em>Packets</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getSpecial <em>Special</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getSpecs <em>Specs</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getTlgVar <em>Tlg Var</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getTrackToTrain <em>Track To Train</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getTrainToTrack <em>Train To Track</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getTransmissionMedia <em>Transmission Media</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getVariable <em>Variable</em>}</li>
 *   <li>{@link Subset0267.DocumentRoot#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0267.Subset0267Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see Subset0267.Subset0267Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see Subset0267.Subset0267Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Both Ways</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Both Ways</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Both Ways</em>' containment reference.
	 * @see #setBothWays(TBothWays)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_BothWays()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BothWays' namespace='##targetNamespace'"
	 * @generated
	 */
	TBothWays getBothWays();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getBothWays <em>Both Ways</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Both Ways</em>' containment reference.
	 * @see #getBothWays()
	 * @generated
	 */
	void setBothWays(TBothWays value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Comment()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Condition()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional</em>' containment reference.
	 * @see #setConditional(TConditional)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Conditional()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Conditional' namespace='##targetNamespace'"
	 * @generated
	 */
	TConditional getConditional();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getConditional <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional</em>' containment reference.
	 * @see #getConditional()
	 * @generated
	 */
	void setConditional(TConditional value);

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
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Content()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Content' namespace='##targetNamespace'"
	 * @generated
	 */
	TContent getContent();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(TContent value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(TDefinitions)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Definitions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	TDefinitions getDefinitions();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getDefinitions <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitions</em>' containment reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(TDefinitions value);

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
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see Subset0267.Subset0267Package#getDocumentRoot_DetailedName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DetailedName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDetailedName();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getDetailedName <em>Detailed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailed Name</em>' attribute.
	 * @see #getDetailedName()
	 * @generated
	 */
	void setDetailedName(String value);

	/**
	 * Returns the value of the '<em><b>ID Number</b></em>' attribute.
	 * The literals are from the enumeration {@link Subset0267.TIDNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Number</em>' attribute.
	 * @see Subset0267.TIDNumber
	 * @see #setIDNumber(TIDNumber)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_IDNumber()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IDNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	TIDNumber getIDNumber();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getIDNumber <em>ID Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Number</em>' attribute.
	 * @see Subset0267.TIDNumber
	 * @see #getIDNumber()
	 * @generated
	 */
	void setIDNumber(TIDNumber value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * The literals are from the enumeration {@link Subset0267.TLength}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see Subset0267.TLength
	 * @see #setLength(TLength)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Length()
	 * @model default="5" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Length' namespace='##targetNamespace'"
	 * @generated
	 */
	TLength getLength();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see Subset0267.TLength
	 * @see #getLength()
	 * @generated
	 */
	void setLength(TLength value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(ListType)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_List()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='List' namespace='##targetNamespace'"
	 * @generated
	 */
	ListType getList();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(ListType value);

	/**
	 * Returns the value of the '<em><b>Loop Do While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Do While</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Do While</em>' containment reference.
	 * @see #setLoopDoWhile(TLoopDoWhile)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_LoopDoWhile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LoopDoWhile' namespace='##targetNamespace'"
	 * @generated
	 */
	TLoopDoWhile getLoopDoWhile();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getLoopDoWhile <em>Loop Do While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Do While</em>' containment reference.
	 * @see #getLoopDoWhile()
	 * @generated
	 */
	void setLoopDoWhile(TLoopDoWhile value);

	/**
	 * Returns the value of the '<em><b>Loop While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop While</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop While</em>' containment reference.
	 * @see #setLoopWhile(TLoopWhile)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_LoopWhile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LoopWhile' namespace='##targetNamespace'"
	 * @generated
	 */
	TLoopWhile getLoopWhile();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getLoopWhile <em>Loop While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop While</em>' containment reference.
	 * @see #getLoopWhile()
	 * @generated
	 */
	void setLoopWhile(TLoopWhile value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"N_ITER"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Name()
	 * @model default="N_ITER" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet</em>' containment reference.
	 * @see #setPacket(TPacket)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Packet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Packet' namespace='##targetNamespace'"
	 * @generated
	 */
	TPacket getPacket();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getPacket <em>Packet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet</em>' containment reference.
	 * @see #getPacket()
	 * @generated
	 */
	void setPacket(TPacket value);

	/**
	 * Returns the value of the '<em><b>Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packets</em>' containment reference.
	 * @see #setPackets(TPackets)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Packets()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Packets' namespace='##targetNamespace'"
	 * @generated
	 */
	TPackets getPackets();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getPackets <em>Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packets</em>' containment reference.
	 * @see #getPackets()
	 * @generated
	 */
	void setPackets(TPackets value);

	/**
	 * Returns the value of the '<em><b>Special</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special</em>' containment reference.
	 * @see #setSpecial(SpecialType)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Special()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Special' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecialType getSpecial();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getSpecial <em>Special</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special</em>' containment reference.
	 * @see #getSpecial()
	 * @generated
	 */
	void setSpecial(SpecialType value);

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
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Specs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Specs' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecsType getSpecs();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getSpecs <em>Specs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specs</em>' containment reference.
	 * @see #getSpecs()
	 * @generated
	 */
	void setSpecs(SpecsType value);

	/**
	 * Returns the value of the '<em><b>Tlg Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tlg Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tlg Var</em>' containment reference.
	 * @see #setTlgVar(TTlgVar)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_TlgVar()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TlgVar' namespace='##targetNamespace'"
	 * @generated
	 */
	TTlgVar getTlgVar();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getTlgVar <em>Tlg Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tlg Var</em>' containment reference.
	 * @see #getTlgVar()
	 * @generated
	 */
	void setTlgVar(TTlgVar value);

	/**
	 * Returns the value of the '<em><b>Track To Train</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track To Train</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track To Train</em>' containment reference.
	 * @see #setTrackToTrain(TTrackToTrain)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_TrackToTrain()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TrackToTrain' namespace='##targetNamespace'"
	 * @generated
	 */
	TTrackToTrain getTrackToTrain();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getTrackToTrain <em>Track To Train</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track To Train</em>' containment reference.
	 * @see #getTrackToTrain()
	 * @generated
	 */
	void setTrackToTrain(TTrackToTrain value);

	/**
	 * Returns the value of the '<em><b>Train To Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Train To Track</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train To Track</em>' containment reference.
	 * @see #setTrainToTrack(TTrainToTrack)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_TrainToTrack()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TrainToTrack' namespace='##targetNamespace'"
	 * @generated
	 */
	TTrainToTrack getTrainToTrack();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getTrainToTrack <em>Train To Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train To Track</em>' containment reference.
	 * @see #getTrainToTrack()
	 * @generated
	 */
	void setTrainToTrack(TTrainToTrack value);

	/**
	 * Returns the value of the '<em><b>Transmission Media</b></em>' attribute.
	 * The literals are from the enumeration {@link Subset0267.TTransmissionMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Media</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Media</em>' attribute.
	 * @see Subset0267.TTransmissionMedia
	 * @see #setTransmissionMedia(TTransmissionMedia)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_TransmissionMedia()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransmissionMedia' namespace='##targetNamespace'"
	 * @generated
	 */
	TTransmissionMedia getTransmissionMedia();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getTransmissionMedia <em>Transmission Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Media</em>' attribute.
	 * @see Subset0267.TTransmissionMedia
	 * @see #getTransmissionMedia()
	 * @generated
	 */
	void setTransmissionMedia(TTransmissionMedia value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Value()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(TVariable)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Variable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Variable' namespace='##targetNamespace'"
	 * @generated
	 */
	TVariable getVariable();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(TVariable value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference.
	 * @see #setVariables(TVariables)
	 * @see Subset0267.Subset0267Package#getDocumentRoot_Variables()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Variables' namespace='##targetNamespace'"
	 * @generated
	 */
	TVariables getVariables();

	/**
	 * Sets the value of the '{@link Subset0267.DocumentRoot#getVariables <em>Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables</em>' containment reference.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(TVariables value);

} // DocumentRoot
