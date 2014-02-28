/**
 */
package Subset0268;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Subset0268.Subset0268Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface Subset0268Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Subset0268";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.openetcs.datadictionary.transform/models/Subset_026_8.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Subset0268";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Subset0268Package eINSTANCE = Subset0268.impl.Subset0268PackageImpl.init();

	/**
	 * The meta object id for the '{@link Subset0268.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.DocumentRootImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFINITIONS = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Detailed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DETAILED_NAME = 7;

	/**
	 * The feature id for the '<em><b>ID Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID_NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LENGTH = 9;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 11;

	/**
	 * The feature id for the '<em><b>Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKET = 12;

	/**
	 * The feature id for the '<em><b>Packet Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKET_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKETS = 14;

	/**
	 * The feature id for the '<em><b>Parcel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARCEL = 15;

	/**
	 * The feature id for the '<em><b>Tlg Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TLG_VAR = 16;

	/**
	 * The feature id for the '<em><b>Track To Train</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRACK_TO_TRAIN = 17;

	/**
	 * The feature id for the '<em><b>Train To Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRAIN_TO_TRACK = 18;

	/**
	 * The feature id for the '<em><b>Transmission Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSMISSION_MEDIA = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 20;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.impl.ListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.ListTypeImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__MEDIA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__NUMBER = 2;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.impl.OptionalPacketsTypeImpl <em>Optional Packets Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.OptionalPacketsTypeImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getOptionalPacketsType()
	 * @generated
	 */
	int OPTIONAL_PACKETS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parcel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_PACKETS_TYPE__PARCEL = 0;

	/**
	 * The number of structural features of the '<em>Optional Packets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_PACKETS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Optional Packets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_PACKETS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.impl.ParcelTypeImpl <em>Parcel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.ParcelTypeImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getParcelType()
	 * @generated
	 */
	int PARCEL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_TYPE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_TYPE__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Parcel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parcel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.impl.TContentImpl <em>TContent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.TContentImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getTContent()
	 * @generated
	 */
	int TCONTENT = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Tlg Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT__TLG_VAR = 1;

	/**
	 * The feature id for the '<em><b>Parcel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT__PARCEL = 2;

	/**
	 * The feature id for the '<em><b>Optional Packets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT__OPTIONAL_PACKETS = 3;

	/**
	 * The number of structural features of the '<em>TContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.TDefinitionsImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getTDefinitions()
	 * @generated
	 */
	int TDEFINITIONS = 5;

	/**
	 * The feature id for the '<em><b>Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__PACKETS = 0;

	/**
	 * The number of structural features of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.impl.TPacketImpl <em>TPacket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.TPacketImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getTPacket()
	 * @generated
	 */
	int TPACKET = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKET__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKET__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKET__NAME = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKET__NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Transmission Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKET__TRANSMISSION_MEDIA = 4;

	/**
	 * The number of structural features of the '<em>TPacket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TPacket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.impl.TPacketsImpl <em>TPackets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.TPacketsImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getTPackets()
	 * @generated
	 */
	int TPACKETS = 7;

	/**
	 * The feature id for the '<em><b>Train To Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKETS__TRAIN_TO_TRACK = 0;

	/**
	 * The feature id for the '<em><b>Track To Train</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKETS__TRACK_TO_TRAIN = 1;

	/**
	 * The number of structural features of the '<em>TPackets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKETS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TPackets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.impl.TTlgVarImpl <em>TTlg Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.TTlgVarImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getTTlgVar()
	 * @generated
	 */
	int TTLG_VAR = 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLG_VAR__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLG_VAR__LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLG_VAR__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLG_VAR__TYPE = 3;

	/**
	 * The number of structural features of the '<em>TTlg Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLG_VAR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TTlg Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLG_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.impl.TTrackToTrainImpl <em>TTrack To Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.TTrackToTrainImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getTTrackToTrain()
	 * @generated
	 */
	int TTRACK_TO_TRAIN = 9;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRACK_TO_TRAIN__LIST = 0;

	/**
	 * The feature id for the '<em><b>Packet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRACK_TO_TRAIN__PACKET = 1;

	/**
	 * The number of structural features of the '<em>TTrack To Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRACK_TO_TRAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TTrack To Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRACK_TO_TRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.impl.TTrainToTrackImpl <em>TTrain To Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.impl.TTrainToTrackImpl
	 * @see Subset0268.impl.Subset0268PackageImpl#getTTrainToTrack()
	 * @generated
	 */
	int TTRAIN_TO_TRACK = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRAIN_TO_TRACK__GROUP = 0;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRAIN_TO_TRACK__LIST = 1;

	/**
	 * The feature id for the '<em><b>Packet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRAIN_TO_TRACK__PACKET = 2;

	/**
	 * The number of structural features of the '<em>TTrain To Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRAIN_TO_TRACK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TTrain To Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRAIN_TO_TRACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0268.TLength <em>TLength</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.TLength
	 * @see Subset0268.impl.Subset0268PackageImpl#getTLength()
	 * @generated
	 */
	int TLENGTH = 11;

	/**
	 * The meta object id for the '{@link Subset0268.TTransmissionMedia <em>TTransmission Media</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.TTransmissionMedia
	 * @see Subset0268.impl.Subset0268PackageImpl#getTTransmissionMedia()
	 * @generated
	 */
	int TTRANSMISSION_MEDIA = 12;

	/**
	 * The meta object id for the '{@link Subset0268.TVarLen <em>TVar Len</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.TVarLen
	 * @see Subset0268.impl.Subset0268PackageImpl#getTVarLen()
	 * @generated
	 */
	int TVAR_LEN = 13;

	/**
	 * The meta object id for the '<em>TLength Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.TLength
	 * @see Subset0268.impl.Subset0268PackageImpl#getTLengthObject()
	 * @generated
	 */
	int TLENGTH_OBJECT = 14;

	/**
	 * The meta object id for the '<em>TTransmission Media Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.TTransmissionMedia
	 * @see Subset0268.impl.Subset0268PackageImpl#getTTransmissionMediaObject()
	 * @generated
	 */
	int TTRANSMISSION_MEDIA_OBJECT = 15;

	/**
	 * The meta object id for the '<em>TVar Len Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0268.TVarLen
	 * @see Subset0268.impl.Subset0268PackageImpl#getTVarLenObject()
	 * @generated
	 */
	int TVAR_LEN_OBJECT = 16;


	/**
	 * Returns the meta object for class '{@link Subset0268.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see Subset0268.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0268.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Subset0268.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link Subset0268.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see Subset0268.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link Subset0268.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see Subset0268.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.DocumentRoot#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Subset0268.DocumentRoot#getComment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.DocumentRoot#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see Subset0268.DocumentRoot#getContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Content();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.DocumentRoot#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see Subset0268.DocumentRoot#getDefinitions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Definitions();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Subset0268.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Description();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.DocumentRoot#getDetailedName <em>Detailed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detailed Name</em>'.
	 * @see Subset0268.DocumentRoot#getDetailedName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DetailedName();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.DocumentRoot#getIDNumber <em>ID Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Number</em>'.
	 * @see Subset0268.DocumentRoot#getIDNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IDNumber();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.DocumentRoot#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see Subset0268.DocumentRoot#getLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Length();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.DocumentRoot#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see Subset0268.DocumentRoot#getList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_List();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Subset0268.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.DocumentRoot#getPacket <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packet</em>'.
	 * @see Subset0268.DocumentRoot#getPacket()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Packet();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.DocumentRoot#getPacketNumber <em>Packet Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Number</em>'.
	 * @see Subset0268.DocumentRoot#getPacketNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PacketNumber();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.DocumentRoot#getPackets <em>Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packets</em>'.
	 * @see Subset0268.DocumentRoot#getPackets()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Packets();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.DocumentRoot#getParcel <em>Parcel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parcel</em>'.
	 * @see Subset0268.DocumentRoot#getParcel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Parcel();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.DocumentRoot#getTlgVar <em>Tlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tlg Var</em>'.
	 * @see Subset0268.DocumentRoot#getTlgVar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TlgVar();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.DocumentRoot#getTrackToTrain <em>Track To Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Track To Train</em>'.
	 * @see Subset0268.DocumentRoot#getTrackToTrain()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TrackToTrain();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.DocumentRoot#getTrainToTrack <em>Train To Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Train To Track</em>'.
	 * @see Subset0268.DocumentRoot#getTrainToTrack()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TrainToTrack();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.DocumentRoot#getTransmissionMedia <em>Transmission Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Media</em>'.
	 * @see Subset0268.DocumentRoot#getTransmissionMedia()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransmissionMedia();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Subset0268.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Value();

	/**
	 * Returns the meta object for class '{@link Subset0268.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see Subset0268.ListType
	 * @generated
	 */
	EClass getListType();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.ListType#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media</em>'.
	 * @see Subset0268.ListType#getMedia()
	 * @see #getListType()
	 * @generated
	 */
	EAttribute getListType_Media();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.ListType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Subset0268.ListType#getName()
	 * @see #getListType()
	 * @generated
	 */
	EAttribute getListType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.ListType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Subset0268.ListType#getNumber()
	 * @see #getListType()
	 * @generated
	 */
	EAttribute getListType_Number();

	/**
	 * Returns the meta object for class '{@link Subset0268.OptionalPacketsType <em>Optional Packets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Packets Type</em>'.
	 * @see Subset0268.OptionalPacketsType
	 * @generated
	 */
	EClass getOptionalPacketsType();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0268.OptionalPacketsType#getParcel <em>Parcel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parcel</em>'.
	 * @see Subset0268.OptionalPacketsType#getParcel()
	 * @see #getOptionalPacketsType()
	 * @generated
	 */
	EReference getOptionalPacketsType_Parcel();

	/**
	 * Returns the meta object for class '{@link Subset0268.ParcelType <em>Parcel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcel Type</em>'.
	 * @see Subset0268.ParcelType
	 * @generated
	 */
	EClass getParcelType();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.ParcelType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Subset0268.ParcelType#getComment()
	 * @see #getParcelType()
	 * @generated
	 */
	EAttribute getParcelType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.ParcelType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Subset0268.ParcelType#getNumber()
	 * @see #getParcelType()
	 * @generated
	 */
	EAttribute getParcelType_Number();

	/**
	 * Returns the meta object for class '{@link Subset0268.TContent <em>TContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TContent</em>'.
	 * @see Subset0268.TContent
	 * @generated
	 */
	EClass getTContent();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0268.TContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Subset0268.TContent#getGroup()
	 * @see #getTContent()
	 * @generated
	 */
	EAttribute getTContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0268.TContent#getTlgVar <em>Tlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tlg Var</em>'.
	 * @see Subset0268.TContent#getTlgVar()
	 * @see #getTContent()
	 * @generated
	 */
	EReference getTContent_TlgVar();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0268.TContent#getParcel <em>Parcel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parcel</em>'.
	 * @see Subset0268.TContent#getParcel()
	 * @see #getTContent()
	 * @generated
	 */
	EReference getTContent_Parcel();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0268.TContent#getOptionalPackets <em>Optional Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optional Packets</em>'.
	 * @see Subset0268.TContent#getOptionalPackets()
	 * @see #getTContent()
	 * @generated
	 */
	EReference getTContent_OptionalPackets();

	/**
	 * Returns the meta object for class '{@link Subset0268.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDefinitions</em>'.
	 * @see Subset0268.TDefinitions
	 * @generated
	 */
	EClass getTDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.TDefinitions#getPackets <em>Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packets</em>'.
	 * @see Subset0268.TDefinitions#getPackets()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Packets();

	/**
	 * Returns the meta object for class '{@link Subset0268.TPacket <em>TPacket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPacket</em>'.
	 * @see Subset0268.TPacket
	 * @generated
	 */
	EClass getTPacket();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.TPacket#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Subset0268.TPacket#getDescription()
	 * @see #getTPacket()
	 * @generated
	 */
	EAttribute getTPacket_Description();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.TPacket#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see Subset0268.TPacket#getContent()
	 * @see #getTPacket()
	 * @generated
	 */
	EReference getTPacket_Content();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.TPacket#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Subset0268.TPacket#getName()
	 * @see #getTPacket()
	 * @generated
	 */
	EAttribute getTPacket_Name();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.TPacket#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Subset0268.TPacket#getNumber()
	 * @see #getTPacket()
	 * @generated
	 */
	EAttribute getTPacket_Number();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.TPacket#getTransmissionMedia <em>Transmission Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Media</em>'.
	 * @see Subset0268.TPacket#getTransmissionMedia()
	 * @see #getTPacket()
	 * @generated
	 */
	EAttribute getTPacket_TransmissionMedia();

	/**
	 * Returns the meta object for class '{@link Subset0268.TPackets <em>TPackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPackets</em>'.
	 * @see Subset0268.TPackets
	 * @generated
	 */
	EClass getTPackets();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.TPackets#getTrainToTrack <em>Train To Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Train To Track</em>'.
	 * @see Subset0268.TPackets#getTrainToTrack()
	 * @see #getTPackets()
	 * @generated
	 */
	EReference getTPackets_TrainToTrack();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0268.TPackets#getTrackToTrain <em>Track To Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Track To Train</em>'.
	 * @see Subset0268.TPackets#getTrackToTrain()
	 * @see #getTPackets()
	 * @generated
	 */
	EReference getTPackets_TrackToTrain();

	/**
	 * Returns the meta object for class '{@link Subset0268.TTlgVar <em>TTlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTlg Var</em>'.
	 * @see Subset0268.TTlgVar
	 * @generated
	 */
	EClass getTTlgVar();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.TTlgVar#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Subset0268.TTlgVar#getComment()
	 * @see #getTTlgVar()
	 * @generated
	 */
	EAttribute getTTlgVar_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.TTlgVar#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see Subset0268.TTlgVar#getLength()
	 * @see #getTTlgVar()
	 * @generated
	 */
	EAttribute getTTlgVar_Length();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.TTlgVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Subset0268.TTlgVar#getName()
	 * @see #getTTlgVar()
	 * @generated
	 */
	EAttribute getTTlgVar_Name();

	/**
	 * Returns the meta object for the attribute '{@link Subset0268.TTlgVar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Subset0268.TTlgVar#getType()
	 * @see #getTTlgVar()
	 * @generated
	 */
	EAttribute getTTlgVar_Type();

	/**
	 * Returns the meta object for class '{@link Subset0268.TTrackToTrain <em>TTrack To Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTrack To Train</em>'.
	 * @see Subset0268.TTrackToTrain
	 * @generated
	 */
	EClass getTTrackToTrain();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0268.TTrackToTrain#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see Subset0268.TTrackToTrain#getList()
	 * @see #getTTrackToTrain()
	 * @generated
	 */
	EReference getTTrackToTrain_List();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0268.TTrackToTrain#getPacket <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packet</em>'.
	 * @see Subset0268.TTrackToTrain#getPacket()
	 * @see #getTTrackToTrain()
	 * @generated
	 */
	EReference getTTrackToTrain_Packet();

	/**
	 * Returns the meta object for class '{@link Subset0268.TTrainToTrack <em>TTrain To Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTrain To Track</em>'.
	 * @see Subset0268.TTrainToTrack
	 * @generated
	 */
	EClass getTTrainToTrack();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0268.TTrainToTrack#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Subset0268.TTrainToTrack#getGroup()
	 * @see #getTTrainToTrack()
	 * @generated
	 */
	EAttribute getTTrainToTrack_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0268.TTrainToTrack#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see Subset0268.TTrainToTrack#getList()
	 * @see #getTTrainToTrack()
	 * @generated
	 */
	EReference getTTrainToTrack_List();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0268.TTrainToTrack#getPacket <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packet</em>'.
	 * @see Subset0268.TTrainToTrack#getPacket()
	 * @see #getTTrainToTrack()
	 * @generated
	 */
	EReference getTTrainToTrack_Packet();

	/**
	 * Returns the meta object for enum '{@link Subset0268.TLength <em>TLength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TLength</em>'.
	 * @see Subset0268.TLength
	 * @generated
	 */
	EEnum getTLength();

	/**
	 * Returns the meta object for enum '{@link Subset0268.TTransmissionMedia <em>TTransmission Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TTransmission Media</em>'.
	 * @see Subset0268.TTransmissionMedia
	 * @generated
	 */
	EEnum getTTransmissionMedia();

	/**
	 * Returns the meta object for enum '{@link Subset0268.TVarLen <em>TVar Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TVar Len</em>'.
	 * @see Subset0268.TVarLen
	 * @generated
	 */
	EEnum getTVarLen();

	/**
	 * Returns the meta object for data type '{@link Subset0268.TLength <em>TLength Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TLength Object</em>'.
	 * @see Subset0268.TLength
	 * @model instanceClass="Subset0268.TLength"
	 *        extendedMetaData="name='T_Length:Object' baseType='T_Length'"
	 * @generated
	 */
	EDataType getTLengthObject();

	/**
	 * Returns the meta object for data type '{@link Subset0268.TTransmissionMedia <em>TTransmission Media Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TTransmission Media Object</em>'.
	 * @see Subset0268.TTransmissionMedia
	 * @model instanceClass="Subset0268.TTransmissionMedia"
	 *        extendedMetaData="name='T_TransmissionMedia:Object' baseType='T_TransmissionMedia'"
	 * @generated
	 */
	EDataType getTTransmissionMediaObject();

	/**
	 * Returns the meta object for data type '{@link Subset0268.TVarLen <em>TVar Len Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TVar Len Object</em>'.
	 * @see Subset0268.TVarLen
	 * @model instanceClass="Subset0268.TVarLen"
	 *        extendedMetaData="name='T_VarLen:Object' baseType='T_VarLen'"
	 * @generated
	 */
	EDataType getTVarLenObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Subset0268Factory getSubset0268Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Subset0268.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.DocumentRootImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMMENT = eINSTANCE.getDocumentRoot_Comment();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTENT = eINSTANCE.getDocumentRoot_Content();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEFINITIONS = eINSTANCE.getDocumentRoot_Definitions();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>Detailed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DETAILED_NAME = eINSTANCE.getDocumentRoot_DetailedName();

		/**
		 * The meta object literal for the '<em><b>ID Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID_NUMBER = eINSTANCE.getDocumentRoot_IDNumber();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LENGTH = eINSTANCE.getDocumentRoot_Length();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIST = eINSTANCE.getDocumentRoot_List();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Packet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PACKET = eINSTANCE.getDocumentRoot_Packet();

		/**
		 * The meta object literal for the '<em><b>Packet Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PACKET_NUMBER = eINSTANCE.getDocumentRoot_PacketNumber();

		/**
		 * The meta object literal for the '<em><b>Packets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PACKETS = eINSTANCE.getDocumentRoot_Packets();

		/**
		 * The meta object literal for the '<em><b>Parcel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARCEL = eINSTANCE.getDocumentRoot_Parcel();

		/**
		 * The meta object literal for the '<em><b>Tlg Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TLG_VAR = eINSTANCE.getDocumentRoot_TlgVar();

		/**
		 * The meta object literal for the '<em><b>Track To Train</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRACK_TO_TRAIN = eINSTANCE.getDocumentRoot_TrackToTrain();

		/**
		 * The meta object literal for the '<em><b>Train To Track</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRAIN_TO_TRACK = eINSTANCE.getDocumentRoot_TrainToTrack();

		/**
		 * The meta object literal for the '<em><b>Transmission Media</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSMISSION_MEDIA = eINSTANCE.getDocumentRoot_TransmissionMedia();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VALUE = eINSTANCE.getDocumentRoot_Value();

		/**
		 * The meta object literal for the '{@link Subset0268.impl.ListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.ListTypeImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getListType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_TYPE__MEDIA = eINSTANCE.getListType_Media();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_TYPE__NAME = eINSTANCE.getListType_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_TYPE__NUMBER = eINSTANCE.getListType_Number();

		/**
		 * The meta object literal for the '{@link Subset0268.impl.OptionalPacketsTypeImpl <em>Optional Packets Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.OptionalPacketsTypeImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getOptionalPacketsType()
		 * @generated
		 */
		EClass OPTIONAL_PACKETS_TYPE = eINSTANCE.getOptionalPacketsType();

		/**
		 * The meta object literal for the '<em><b>Parcel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_PACKETS_TYPE__PARCEL = eINSTANCE.getOptionalPacketsType_Parcel();

		/**
		 * The meta object literal for the '{@link Subset0268.impl.ParcelTypeImpl <em>Parcel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.ParcelTypeImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getParcelType()
		 * @generated
		 */
		EClass PARCEL_TYPE = eINSTANCE.getParcelType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL_TYPE__COMMENT = eINSTANCE.getParcelType_Comment();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL_TYPE__NUMBER = eINSTANCE.getParcelType_Number();

		/**
		 * The meta object literal for the '{@link Subset0268.impl.TContentImpl <em>TContent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.TContentImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getTContent()
		 * @generated
		 */
		EClass TCONTENT = eINSTANCE.getTContent();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONTENT__GROUP = eINSTANCE.getTContent_Group();

		/**
		 * The meta object literal for the '<em><b>Tlg Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONTENT__TLG_VAR = eINSTANCE.getTContent_TlgVar();

		/**
		 * The meta object literal for the '<em><b>Parcel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONTENT__PARCEL = eINSTANCE.getTContent_Parcel();

		/**
		 * The meta object literal for the '<em><b>Optional Packets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONTENT__OPTIONAL_PACKETS = eINSTANCE.getTContent_OptionalPackets();

		/**
		 * The meta object literal for the '{@link Subset0268.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.TDefinitionsImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getTDefinitions()
		 * @generated
		 */
		EClass TDEFINITIONS = eINSTANCE.getTDefinitions();

		/**
		 * The meta object literal for the '<em><b>Packets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__PACKETS = eINSTANCE.getTDefinitions_Packets();

		/**
		 * The meta object literal for the '{@link Subset0268.impl.TPacketImpl <em>TPacket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.TPacketImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getTPacket()
		 * @generated
		 */
		EClass TPACKET = eINSTANCE.getTPacket();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPACKET__DESCRIPTION = eINSTANCE.getTPacket_Description();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKET__CONTENT = eINSTANCE.getTPacket_Content();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPACKET__NAME = eINSTANCE.getTPacket_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPACKET__NUMBER = eINSTANCE.getTPacket_Number();

		/**
		 * The meta object literal for the '<em><b>Transmission Media</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPACKET__TRANSMISSION_MEDIA = eINSTANCE.getTPacket_TransmissionMedia();

		/**
		 * The meta object literal for the '{@link Subset0268.impl.TPacketsImpl <em>TPackets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.TPacketsImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getTPackets()
		 * @generated
		 */
		EClass TPACKETS = eINSTANCE.getTPackets();

		/**
		 * The meta object literal for the '<em><b>Train To Track</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKETS__TRAIN_TO_TRACK = eINSTANCE.getTPackets_TrainToTrack();

		/**
		 * The meta object literal for the '<em><b>Track To Train</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKETS__TRACK_TO_TRAIN = eINSTANCE.getTPackets_TrackToTrain();

		/**
		 * The meta object literal for the '{@link Subset0268.impl.TTlgVarImpl <em>TTlg Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.TTlgVarImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getTTlgVar()
		 * @generated
		 */
		EClass TTLG_VAR = eINSTANCE.getTTlgVar();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTLG_VAR__COMMENT = eINSTANCE.getTTlgVar_Comment();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTLG_VAR__LENGTH = eINSTANCE.getTTlgVar_Length();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTLG_VAR__NAME = eINSTANCE.getTTlgVar_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTLG_VAR__TYPE = eINSTANCE.getTTlgVar_Type();

		/**
		 * The meta object literal for the '{@link Subset0268.impl.TTrackToTrainImpl <em>TTrack To Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.TTrackToTrainImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getTTrackToTrain()
		 * @generated
		 */
		EClass TTRACK_TO_TRAIN = eINSTANCE.getTTrackToTrain();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTRACK_TO_TRAIN__LIST = eINSTANCE.getTTrackToTrain_List();

		/**
		 * The meta object literal for the '<em><b>Packet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTRACK_TO_TRAIN__PACKET = eINSTANCE.getTTrackToTrain_Packet();

		/**
		 * The meta object literal for the '{@link Subset0268.impl.TTrainToTrackImpl <em>TTrain To Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.impl.TTrainToTrackImpl
		 * @see Subset0268.impl.Subset0268PackageImpl#getTTrainToTrack()
		 * @generated
		 */
		EClass TTRAIN_TO_TRACK = eINSTANCE.getTTrainToTrack();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTRAIN_TO_TRACK__GROUP = eINSTANCE.getTTrainToTrack_Group();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTRAIN_TO_TRACK__LIST = eINSTANCE.getTTrainToTrack_List();

		/**
		 * The meta object literal for the '<em><b>Packet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTRAIN_TO_TRACK__PACKET = eINSTANCE.getTTrainToTrack_Packet();

		/**
		 * The meta object literal for the '{@link Subset0268.TLength <em>TLength</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.TLength
		 * @see Subset0268.impl.Subset0268PackageImpl#getTLength()
		 * @generated
		 */
		EEnum TLENGTH = eINSTANCE.getTLength();

		/**
		 * The meta object literal for the '{@link Subset0268.TTransmissionMedia <em>TTransmission Media</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.TTransmissionMedia
		 * @see Subset0268.impl.Subset0268PackageImpl#getTTransmissionMedia()
		 * @generated
		 */
		EEnum TTRANSMISSION_MEDIA = eINSTANCE.getTTransmissionMedia();

		/**
		 * The meta object literal for the '{@link Subset0268.TVarLen <em>TVar Len</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.TVarLen
		 * @see Subset0268.impl.Subset0268PackageImpl#getTVarLen()
		 * @generated
		 */
		EEnum TVAR_LEN = eINSTANCE.getTVarLen();

		/**
		 * The meta object literal for the '<em>TLength Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.TLength
		 * @see Subset0268.impl.Subset0268PackageImpl#getTLengthObject()
		 * @generated
		 */
		EDataType TLENGTH_OBJECT = eINSTANCE.getTLengthObject();

		/**
		 * The meta object literal for the '<em>TTransmission Media Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.TTransmissionMedia
		 * @see Subset0268.impl.Subset0268PackageImpl#getTTransmissionMediaObject()
		 * @generated
		 */
		EDataType TTRANSMISSION_MEDIA_OBJECT = eINSTANCE.getTTransmissionMediaObject();

		/**
		 * The meta object literal for the '<em>TVar Len Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0268.TVarLen
		 * @see Subset0268.impl.Subset0268PackageImpl#getTVarLenObject()
		 * @generated
		 */
		EDataType TVAR_LEN_OBJECT = eINSTANCE.getTVarLenObject();

	}

} //Subset0268Package
