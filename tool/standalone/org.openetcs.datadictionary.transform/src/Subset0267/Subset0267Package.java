/**
 */
package Subset0267;

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
 * @see Subset0267.Subset0267Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface Subset0267Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Subset0267";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.openetcs.datadictionary.transform/models/Subset_026_7.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Subset0267";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Subset0267Package eINSTANCE = Subset0267.impl.Subset0267PackageImpl.init();

	/**
	 * The meta object id for the '{@link Subset0267.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.DocumentRootImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Both Ways</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOTH_WAYS = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONDITIONAL = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFINITIONS = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Detailed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DETAILED_NAME = 10;

	/**
	 * The feature id for the '<em><b>ID Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID_NUMBER = 11;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LENGTH = 12;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST = 13;

	/**
	 * The feature id for the '<em><b>Loop Do While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOOP_DO_WHILE = 14;

	/**
	 * The feature id for the '<em><b>Loop While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOOP_WHILE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 16;

	/**
	 * The feature id for the '<em><b>Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKET = 17;

	/**
	 * The feature id for the '<em><b>Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKETS = 18;

	/**
	 * The feature id for the '<em><b>Special</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECIAL = 19;

	/**
	 * The feature id for the '<em><b>Specs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECS = 20;

	/**
	 * The feature id for the '<em><b>Tlg Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TLG_VAR = 21;

	/**
	 * The feature id for the '<em><b>Track To Train</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRACK_TO_TRAIN = 22;

	/**
	 * The feature id for the '<em><b>Train To Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRAIN_TO_TRACK = 23;

	/**
	 * The feature id for the '<em><b>Transmission Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSMISSION_MEDIA = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 25;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VARIABLE = 26;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VARIABLES = 27;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.ListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.ListTypeImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.SpecialTypeImpl <em>Special Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.SpecialTypeImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getSpecialType()
	 * @generated
	 */
	int SPECIAL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Special Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Special Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.SpecsTypeImpl <em>Specs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.SpecsTypeImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getSpecsType()
	 * @generated
	 */
	int SPECS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Special</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECS_TYPE__SPECIAL = 1;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECS_TYPE__FORMULA = 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECS_TYPE__LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECS_TYPE__MAX_VAL = 4;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECS_TYPE__MIN_VAL = 5;

	/**
	 * The number of structural features of the '<em>Specs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Specs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TBothWaysImpl <em>TBoth Ways</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TBothWaysImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTBothWays()
	 * @generated
	 */
	int TBOTH_WAYS = 4;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOTH_WAYS__LIST = 0;

	/**
	 * The feature id for the '<em><b>Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOTH_WAYS__PACKET = 1;

	/**
	 * The number of structural features of the '<em>TBoth Ways</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOTH_WAYS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TBoth Ways</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOTH_WAYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TConditionalImpl <em>TConditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TConditionalImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTConditional()
	 * @generated
	 */
	int TCONDITIONAL = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>TConditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TConditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TContentImpl <em>TContent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TContentImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTContent()
	 * @generated
	 */
	int TCONTENT = 6;

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
	 * The feature id for the '<em><b>Loop Do While</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT__LOOP_DO_WHILE = 2;

	/**
	 * The feature id for the '<em><b>Loop While</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT__LOOP_WHILE = 3;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT__CONDITIONAL = 4;

	/**
	 * The number of structural features of the '<em>TContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TDefinitionsImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTDefinitions()
	 * @generated
	 */
	int TDEFINITIONS = 7;

	/**
	 * The feature id for the '<em><b>Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__PACKETS = 0;

	/**
	 * The feature id for the '<em><b>Var Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__VAR_DEF = 1;

	/**
	 * The number of structural features of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TLoopDoWhileImpl <em>TLoop Do While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TLoopDoWhileImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTLoopDoWhile()
	 * @generated
	 */
	int TLOOP_DO_WHILE = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_DO_WHILE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Tlg Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_DO_WHILE__TLG_VAR = 1;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_DO_WHILE__CONDITIONAL = 2;

	/**
	 * The feature id for the '<em><b>Loop While</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_DO_WHILE__LOOP_WHILE = 3;

	/**
	 * The number of structural features of the '<em>TLoop Do While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_DO_WHILE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TLoop Do While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_DO_WHILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TLoopWhileImpl <em>TLoop While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TLoopWhileImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTLoopWhile()
	 * @generated
	 */
	int TLOOP_WHILE = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_WHILE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Tlg Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_WHILE__TLG_VAR = 1;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_WHILE__CONDITIONAL = 2;

	/**
	 * The number of structural features of the '<em>TLoop While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_WHILE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TLoop While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_WHILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TPacketImpl <em>TPacket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TPacketImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTPacket()
	 * @generated
	 */
	int TPACKET = 10;

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
	 * The meta object id for the '{@link Subset0267.impl.TPacketsImpl <em>TPackets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TPacketsImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTPackets()
	 * @generated
	 */
	int TPACKETS = 11;

	/**
	 * The feature id for the '<em><b>Track To Train</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKETS__TRACK_TO_TRAIN = 0;

	/**
	 * The feature id for the '<em><b>Train To Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKETS__TRAIN_TO_TRACK = 1;

	/**
	 * The feature id for the '<em><b>Both Ways</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKETS__BOTH_WAYS = 2;

	/**
	 * The number of structural features of the '<em>TPackets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKETS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TPackets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPACKETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TTlgVarImpl <em>TTlg Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TTlgVarImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTTlgVar()
	 * @generated
	 */
	int TTLG_VAR = 12;

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
	 * The number of structural features of the '<em>TTlg Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLG_VAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TTlg Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLG_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TTrackToTrainImpl <em>TTrack To Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TTrackToTrainImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTTrackToTrain()
	 * @generated
	 */
	int TTRACK_TO_TRAIN = 13;

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
	 * The meta object id for the '{@link Subset0267.impl.TTrainToTrackImpl <em>TTrain To Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TTrainToTrackImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTTrainToTrack()
	 * @generated
	 */
	int TTRAIN_TO_TRACK = 14;

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
	 * The meta object id for the '{@link Subset0267.impl.TVardefVarImpl <em>TVardef Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TVardefVarImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTVardefVar()
	 * @generated
	 */
	int TVARDEF_VAR = 15;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARDEF_VAR__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARDEF_VAR__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>TVardef Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARDEF_VAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TVardef Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARDEF_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TVariableImpl <em>TVariable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TVariableImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTVariable()
	 * @generated
	 */
	int TVARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Detailed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE__DETAILED_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Specs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE__SPECS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE__NAME = 3;

	/**
	 * The number of structural features of the '<em>TVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.impl.TVariablesImpl <em>TVariables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.impl.TVariablesImpl
	 * @see Subset0267.impl.Subset0267PackageImpl#getTVariables()
	 * @generated
	 */
	int TVARIABLES = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Loop Do While</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLES__LOOP_DO_WHILE = 1;

	/**
	 * The feature id for the '<em><b>Loop While</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLES__LOOP_WHILE = 2;

	/**
	 * The feature id for the '<em><b>Tlg Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLES__TLG_VAR = 3;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLES__CONDITIONAL = 4;

	/**
	 * The number of structural features of the '<em>TVariables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TVariables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TVARIABLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Subset0267.TFormula <em>TFormula</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TFormula
	 * @see Subset0267.impl.Subset0267PackageImpl#getTFormula()
	 * @generated
	 */
	int TFORMULA = 18;

	/**
	 * The meta object id for the '{@link Subset0267.TIDNumber <em>TID Number</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TIDNumber
	 * @see Subset0267.impl.Subset0267PackageImpl#getTIDNumber()
	 * @generated
	 */
	int TID_NUMBER = 19;

	/**
	 * The meta object id for the '{@link Subset0267.TLength <em>TLength</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TLength
	 * @see Subset0267.impl.Subset0267PackageImpl#getTLength()
	 * @generated
	 */
	int TLENGTH = 20;

	/**
	 * The meta object id for the '{@link Subset0267.TMaxVal <em>TMax Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TMaxVal
	 * @see Subset0267.impl.Subset0267PackageImpl#getTMaxVal()
	 * @generated
	 */
	int TMAX_VAL = 21;

	/**
	 * The meta object id for the '{@link Subset0267.TMinVal <em>TMin Val</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TMinVal
	 * @see Subset0267.impl.Subset0267PackageImpl#getTMinVal()
	 * @generated
	 */
	int TMIN_VAL = 22;

	/**
	 * The meta object id for the '{@link Subset0267.TTransmissionMedia <em>TTransmission Media</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TTransmissionMedia
	 * @see Subset0267.impl.Subset0267PackageImpl#getTTransmissionMedia()
	 * @generated
	 */
	int TTRANSMISSION_MEDIA = 23;

	/**
	 * The meta object id for the '{@link Subset0267.TValue <em>TValue</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TValue
	 * @see Subset0267.impl.Subset0267PackageImpl#getTValue()
	 * @generated
	 */
	int TVALUE = 24;

	/**
	 * The meta object id for the '{@link Subset0267.TVarLen <em>TVar Len</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TVarLen
	 * @see Subset0267.impl.Subset0267PackageImpl#getTVarLen()
	 * @generated
	 */
	int TVAR_LEN = 25;

	/**
	 * The meta object id for the '<em>TFormula Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TFormula
	 * @see Subset0267.impl.Subset0267PackageImpl#getTFormulaObject()
	 * @generated
	 */
	int TFORMULA_OBJECT = 26;

	/**
	 * The meta object id for the '<em>TID Number Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TIDNumber
	 * @see Subset0267.impl.Subset0267PackageImpl#getTIDNumberObject()
	 * @generated
	 */
	int TID_NUMBER_OBJECT = 27;

	/**
	 * The meta object id for the '<em>TLength Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TLength
	 * @see Subset0267.impl.Subset0267PackageImpl#getTLengthObject()
	 * @generated
	 */
	int TLENGTH_OBJECT = 28;

	/**
	 * The meta object id for the '<em>TMax Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TMaxVal
	 * @see Subset0267.impl.Subset0267PackageImpl#getTMaxValObject()
	 * @generated
	 */
	int TMAX_VAL_OBJECT = 29;

	/**
	 * The meta object id for the '<em>TMin Val Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TMinVal
	 * @see Subset0267.impl.Subset0267PackageImpl#getTMinValObject()
	 * @generated
	 */
	int TMIN_VAL_OBJECT = 30;

	/**
	 * The meta object id for the '<em>TTransmission Media Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TTransmissionMedia
	 * @see Subset0267.impl.Subset0267PackageImpl#getTTransmissionMediaObject()
	 * @generated
	 */
	int TTRANSMISSION_MEDIA_OBJECT = 31;

	/**
	 * The meta object id for the '<em>TValue Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TValue
	 * @see Subset0267.impl.Subset0267PackageImpl#getTValueObject()
	 * @generated
	 */
	int TVALUE_OBJECT = 32;

	/**
	 * The meta object id for the '<em>TVar Len Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Subset0267.TVarLen
	 * @see Subset0267.impl.Subset0267PackageImpl#getTVarLenObject()
	 * @generated
	 */
	int TVAR_LEN_OBJECT = 33;


	/**
	 * Returns the meta object for class '{@link Subset0267.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see Subset0267.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0267.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Subset0267.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link Subset0267.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see Subset0267.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link Subset0267.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see Subset0267.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getBothWays <em>Both Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Both Ways</em>'.
	 * @see Subset0267.DocumentRoot#getBothWays()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BothWays();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.DocumentRoot#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Subset0267.DocumentRoot#getComment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.DocumentRoot#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see Subset0267.DocumentRoot#getCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditional</em>'.
	 * @see Subset0267.DocumentRoot#getConditional()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Conditional();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see Subset0267.DocumentRoot#getContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Content();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see Subset0267.DocumentRoot#getDefinitions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Definitions();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Subset0267.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Description();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.DocumentRoot#getDetailedName <em>Detailed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detailed Name</em>'.
	 * @see Subset0267.DocumentRoot#getDetailedName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DetailedName();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.DocumentRoot#getIDNumber <em>ID Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID Number</em>'.
	 * @see Subset0267.DocumentRoot#getIDNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IDNumber();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.DocumentRoot#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see Subset0267.DocumentRoot#getLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Length();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see Subset0267.DocumentRoot#getList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_List();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getLoopDoWhile <em>Loop Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Do While</em>'.
	 * @see Subset0267.DocumentRoot#getLoopDoWhile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LoopDoWhile();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getLoopWhile <em>Loop While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop While</em>'.
	 * @see Subset0267.DocumentRoot#getLoopWhile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LoopWhile();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Subset0267.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getPacket <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packet</em>'.
	 * @see Subset0267.DocumentRoot#getPacket()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Packet();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getPackets <em>Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packets</em>'.
	 * @see Subset0267.DocumentRoot#getPackets()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Packets();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getSpecial <em>Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Special</em>'.
	 * @see Subset0267.DocumentRoot#getSpecial()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Special();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getSpecs <em>Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specs</em>'.
	 * @see Subset0267.DocumentRoot#getSpecs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Specs();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getTlgVar <em>Tlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tlg Var</em>'.
	 * @see Subset0267.DocumentRoot#getTlgVar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TlgVar();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getTrackToTrain <em>Track To Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Track To Train</em>'.
	 * @see Subset0267.DocumentRoot#getTrackToTrain()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TrackToTrain();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getTrainToTrack <em>Train To Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Train To Track</em>'.
	 * @see Subset0267.DocumentRoot#getTrainToTrack()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TrainToTrack();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.DocumentRoot#getTransmissionMedia <em>Transmission Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Media</em>'.
	 * @see Subset0267.DocumentRoot#getTransmissionMedia()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransmissionMedia();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Subset0267.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Value();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see Subset0267.DocumentRoot#getVariable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.DocumentRoot#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables</em>'.
	 * @see Subset0267.DocumentRoot#getVariables()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Variables();

	/**
	 * Returns the meta object for class '{@link Subset0267.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see Subset0267.ListType
	 * @generated
	 */
	EClass getListType();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.ListType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Subset0267.ListType#getName()
	 * @see #getListType()
	 * @generated
	 */
	EAttribute getListType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.ListType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Subset0267.ListType#getNumber()
	 * @see #getListType()
	 * @generated
	 */
	EAttribute getListType_Number();

	/**
	 * Returns the meta object for class '{@link Subset0267.SpecialType <em>Special Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Type</em>'.
	 * @see Subset0267.SpecialType
	 * @generated
	 */
	EClass getSpecialType();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.SpecialType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Subset0267.SpecialType#getDescription()
	 * @see #getSpecialType()
	 * @generated
	 */
	EAttribute getSpecialType_Description();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.SpecialType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Subset0267.SpecialType#getValue()
	 * @see #getSpecialType()
	 * @generated
	 */
	EAttribute getSpecialType_Value();

	/**
	 * Returns the meta object for class '{@link Subset0267.SpecsType <em>Specs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specs Type</em>'.
	 * @see Subset0267.SpecsType
	 * @generated
	 */
	EClass getSpecsType();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0267.SpecsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Subset0267.SpecsType#getGroup()
	 * @see #getSpecsType()
	 * @generated
	 */
	EAttribute getSpecsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.SpecsType#getSpecial <em>Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Special</em>'.
	 * @see Subset0267.SpecsType#getSpecial()
	 * @see #getSpecsType()
	 * @generated
	 */
	EReference getSpecsType_Special();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.SpecsType#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see Subset0267.SpecsType#getFormula()
	 * @see #getSpecsType()
	 * @generated
	 */
	EAttribute getSpecsType_Formula();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.SpecsType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see Subset0267.SpecsType#getLength()
	 * @see #getSpecsType()
	 * @generated
	 */
	EAttribute getSpecsType_Length();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.SpecsType#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Val</em>'.
	 * @see Subset0267.SpecsType#getMaxVal()
	 * @see #getSpecsType()
	 * @generated
	 */
	EAttribute getSpecsType_MaxVal();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.SpecsType#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Val</em>'.
	 * @see Subset0267.SpecsType#getMinVal()
	 * @see #getSpecsType()
	 * @generated
	 */
	EAttribute getSpecsType_MinVal();

	/**
	 * Returns the meta object for class '{@link Subset0267.TBothWays <em>TBoth Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBoth Ways</em>'.
	 * @see Subset0267.TBothWays
	 * @generated
	 */
	EClass getTBothWays();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TBothWays#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see Subset0267.TBothWays#getList()
	 * @see #getTBothWays()
	 * @generated
	 */
	EReference getTBothWays_List();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.TBothWays#getPacket <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packet</em>'.
	 * @see Subset0267.TBothWays#getPacket()
	 * @see #getTBothWays()
	 * @generated
	 */
	EReference getTBothWays_Packet();

	/**
	 * Returns the meta object for class '{@link Subset0267.TConditional <em>TConditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConditional</em>'.
	 * @see Subset0267.TConditional
	 * @generated
	 */
	EClass getTConditional();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0267.TConditional#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Subset0267.TConditional#getGroup()
	 * @see #getTConditional()
	 * @generated
	 */
	EAttribute getTConditional_Group();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0267.TConditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Condition</em>'.
	 * @see Subset0267.TConditional#getCondition()
	 * @see #getTConditional()
	 * @generated
	 */
	EAttribute getTConditional_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TConditional#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see Subset0267.TConditional#getVariables()
	 * @see #getTConditional()
	 * @generated
	 */
	EReference getTConditional_Variables();

	/**
	 * Returns the meta object for class '{@link Subset0267.TContent <em>TContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TContent</em>'.
	 * @see Subset0267.TContent
	 * @generated
	 */
	EClass getTContent();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0267.TContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Subset0267.TContent#getGroup()
	 * @see #getTContent()
	 * @generated
	 */
	EAttribute getTContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TContent#getTlgVar <em>Tlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tlg Var</em>'.
	 * @see Subset0267.TContent#getTlgVar()
	 * @see #getTContent()
	 * @generated
	 */
	EReference getTContent_TlgVar();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TContent#getLoopDoWhile <em>Loop Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Do While</em>'.
	 * @see Subset0267.TContent#getLoopDoWhile()
	 * @see #getTContent()
	 * @generated
	 */
	EReference getTContent_LoopDoWhile();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TContent#getLoopWhile <em>Loop While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop While</em>'.
	 * @see Subset0267.TContent#getLoopWhile()
	 * @see #getTContent()
	 * @generated
	 */
	EReference getTContent_LoopWhile();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TContent#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional</em>'.
	 * @see Subset0267.TContent#getConditional()
	 * @see #getTContent()
	 * @generated
	 */
	EReference getTContent_Conditional();

	/**
	 * Returns the meta object for class '{@link Subset0267.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDefinitions</em>'.
	 * @see Subset0267.TDefinitions
	 * @generated
	 */
	EClass getTDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.TDefinitions#getPackets <em>Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packets</em>'.
	 * @see Subset0267.TDefinitions#getPackets()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Packets();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.TDefinitions#getVarDef <em>Var Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var Def</em>'.
	 * @see Subset0267.TDefinitions#getVarDef()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_VarDef();

	/**
	 * Returns the meta object for class '{@link Subset0267.TLoopDoWhile <em>TLoop Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLoop Do While</em>'.
	 * @see Subset0267.TLoopDoWhile
	 * @generated
	 */
	EClass getTLoopDoWhile();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0267.TLoopDoWhile#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Subset0267.TLoopDoWhile#getGroup()
	 * @see #getTLoopDoWhile()
	 * @generated
	 */
	EAttribute getTLoopDoWhile_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TLoopDoWhile#getTlgVar <em>Tlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tlg Var</em>'.
	 * @see Subset0267.TLoopDoWhile#getTlgVar()
	 * @see #getTLoopDoWhile()
	 * @generated
	 */
	EReference getTLoopDoWhile_TlgVar();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TLoopDoWhile#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional</em>'.
	 * @see Subset0267.TLoopDoWhile#getConditional()
	 * @see #getTLoopDoWhile()
	 * @generated
	 */
	EReference getTLoopDoWhile_Conditional();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TLoopDoWhile#getLoopWhile <em>Loop While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop While</em>'.
	 * @see Subset0267.TLoopDoWhile#getLoopWhile()
	 * @see #getTLoopDoWhile()
	 * @generated
	 */
	EReference getTLoopDoWhile_LoopWhile();

	/**
	 * Returns the meta object for class '{@link Subset0267.TLoopWhile <em>TLoop While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLoop While</em>'.
	 * @see Subset0267.TLoopWhile
	 * @generated
	 */
	EClass getTLoopWhile();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0267.TLoopWhile#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Subset0267.TLoopWhile#getGroup()
	 * @see #getTLoopWhile()
	 * @generated
	 */
	EAttribute getTLoopWhile_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TLoopWhile#getTlgVar <em>Tlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tlg Var</em>'.
	 * @see Subset0267.TLoopWhile#getTlgVar()
	 * @see #getTLoopWhile()
	 * @generated
	 */
	EReference getTLoopWhile_TlgVar();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TLoopWhile#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional</em>'.
	 * @see Subset0267.TLoopWhile#getConditional()
	 * @see #getTLoopWhile()
	 * @generated
	 */
	EReference getTLoopWhile_Conditional();

	/**
	 * Returns the meta object for class '{@link Subset0267.TPacket <em>TPacket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPacket</em>'.
	 * @see Subset0267.TPacket
	 * @generated
	 */
	EClass getTPacket();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.TPacket#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Subset0267.TPacket#getDescription()
	 * @see #getTPacket()
	 * @generated
	 */
	EAttribute getTPacket_Description();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.TPacket#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see Subset0267.TPacket#getContent()
	 * @see #getTPacket()
	 * @generated
	 */
	EReference getTPacket_Content();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.TPacket#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Subset0267.TPacket#getName()
	 * @see #getTPacket()
	 * @generated
	 */
	EAttribute getTPacket_Name();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.TPacket#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Subset0267.TPacket#getNumber()
	 * @see #getTPacket()
	 * @generated
	 */
	EAttribute getTPacket_Number();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.TPacket#getTransmissionMedia <em>Transmission Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Media</em>'.
	 * @see Subset0267.TPacket#getTransmissionMedia()
	 * @see #getTPacket()
	 * @generated
	 */
	EAttribute getTPacket_TransmissionMedia();

	/**
	 * Returns the meta object for class '{@link Subset0267.TPackets <em>TPackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPackets</em>'.
	 * @see Subset0267.TPackets
	 * @generated
	 */
	EClass getTPackets();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.TPackets#getTrackToTrain <em>Track To Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Track To Train</em>'.
	 * @see Subset0267.TPackets#getTrackToTrain()
	 * @see #getTPackets()
	 * @generated
	 */
	EReference getTPackets_TrackToTrain();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.TPackets#getTrainToTrack <em>Train To Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Train To Track</em>'.
	 * @see Subset0267.TPackets#getTrainToTrack()
	 * @see #getTPackets()
	 * @generated
	 */
	EReference getTPackets_TrainToTrack();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.TPackets#getBothWays <em>Both Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Both Ways</em>'.
	 * @see Subset0267.TPackets#getBothWays()
	 * @see #getTPackets()
	 * @generated
	 */
	EReference getTPackets_BothWays();

	/**
	 * Returns the meta object for class '{@link Subset0267.TTlgVar <em>TTlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTlg Var</em>'.
	 * @see Subset0267.TTlgVar
	 * @generated
	 */
	EClass getTTlgVar();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.TTlgVar#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Subset0267.TTlgVar#getComment()
	 * @see #getTTlgVar()
	 * @generated
	 */
	EAttribute getTTlgVar_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.TTlgVar#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see Subset0267.TTlgVar#getLength()
	 * @see #getTTlgVar()
	 * @generated
	 */
	EAttribute getTTlgVar_Length();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.TTlgVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Subset0267.TTlgVar#getName()
	 * @see #getTTlgVar()
	 * @generated
	 */
	EAttribute getTTlgVar_Name();

	/**
	 * Returns the meta object for class '{@link Subset0267.TTrackToTrain <em>TTrack To Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTrack To Train</em>'.
	 * @see Subset0267.TTrackToTrain
	 * @generated
	 */
	EClass getTTrackToTrain();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TTrackToTrain#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see Subset0267.TTrackToTrain#getList()
	 * @see #getTTrackToTrain()
	 * @generated
	 */
	EReference getTTrackToTrain_List();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TTrackToTrain#getPacket <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packet</em>'.
	 * @see Subset0267.TTrackToTrain#getPacket()
	 * @see #getTTrackToTrain()
	 * @generated
	 */
	EReference getTTrackToTrain_Packet();

	/**
	 * Returns the meta object for class '{@link Subset0267.TTrainToTrack <em>TTrain To Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTrain To Track</em>'.
	 * @see Subset0267.TTrainToTrack
	 * @generated
	 */
	EClass getTTrainToTrack();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0267.TTrainToTrack#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Subset0267.TTrainToTrack#getGroup()
	 * @see #getTTrainToTrack()
	 * @generated
	 */
	EAttribute getTTrainToTrack_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TTrainToTrack#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see Subset0267.TTrainToTrack#getList()
	 * @see #getTTrainToTrack()
	 * @generated
	 */
	EReference getTTrainToTrack_List();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TTrainToTrack#getPacket <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packet</em>'.
	 * @see Subset0267.TTrainToTrack#getPacket()
	 * @see #getTTrainToTrack()
	 * @generated
	 */
	EReference getTTrainToTrack_Packet();

	/**
	 * Returns the meta object for class '{@link Subset0267.TVardefVar <em>TVardef Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVardef Var</em>'.
	 * @see Subset0267.TVardefVar
	 * @generated
	 */
	EClass getTVardefVar();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0267.TVardefVar#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Subset0267.TVardefVar#getGroup()
	 * @see #getTVardefVar()
	 * @generated
	 */
	EAttribute getTVardefVar_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TVardefVar#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see Subset0267.TVardefVar#getVariable()
	 * @see #getTVardefVar()
	 * @generated
	 */
	EReference getTVardefVar_Variable();

	/**
	 * Returns the meta object for class '{@link Subset0267.TVariable <em>TVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVariable</em>'.
	 * @see Subset0267.TVariable
	 * @generated
	 */
	EClass getTVariable();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.TVariable#getDetailedName <em>Detailed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detailed Name</em>'.
	 * @see Subset0267.TVariable#getDetailedName()
	 * @see #getTVariable()
	 * @generated
	 */
	EAttribute getTVariable_DetailedName();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.TVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Subset0267.TVariable#getDescription()
	 * @see #getTVariable()
	 * @generated
	 */
	EAttribute getTVariable_Description();

	/**
	 * Returns the meta object for the containment reference '{@link Subset0267.TVariable#getSpecs <em>Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specs</em>'.
	 * @see Subset0267.TVariable#getSpecs()
	 * @see #getTVariable()
	 * @generated
	 */
	EReference getTVariable_Specs();

	/**
	 * Returns the meta object for the attribute '{@link Subset0267.TVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Subset0267.TVariable#getName()
	 * @see #getTVariable()
	 * @generated
	 */
	EAttribute getTVariable_Name();

	/**
	 * Returns the meta object for class '{@link Subset0267.TVariables <em>TVariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TVariables</em>'.
	 * @see Subset0267.TVariables
	 * @generated
	 */
	EClass getTVariables();

	/**
	 * Returns the meta object for the attribute list '{@link Subset0267.TVariables#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Subset0267.TVariables#getGroup()
	 * @see #getTVariables()
	 * @generated
	 */
	EAttribute getTVariables_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TVariables#getLoopDoWhile <em>Loop Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Do While</em>'.
	 * @see Subset0267.TVariables#getLoopDoWhile()
	 * @see #getTVariables()
	 * @generated
	 */
	EReference getTVariables_LoopDoWhile();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TVariables#getLoopWhile <em>Loop While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop While</em>'.
	 * @see Subset0267.TVariables#getLoopWhile()
	 * @see #getTVariables()
	 * @generated
	 */
	EReference getTVariables_LoopWhile();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TVariables#getTlgVar <em>Tlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tlg Var</em>'.
	 * @see Subset0267.TVariables#getTlgVar()
	 * @see #getTVariables()
	 * @generated
	 */
	EReference getTVariables_TlgVar();

	/**
	 * Returns the meta object for the containment reference list '{@link Subset0267.TVariables#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional</em>'.
	 * @see Subset0267.TVariables#getConditional()
	 * @see #getTVariables()
	 * @generated
	 */
	EReference getTVariables_Conditional();

	/**
	 * Returns the meta object for enum '{@link Subset0267.TFormula <em>TFormula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TFormula</em>'.
	 * @see Subset0267.TFormula
	 * @generated
	 */
	EEnum getTFormula();

	/**
	 * Returns the meta object for enum '{@link Subset0267.TIDNumber <em>TID Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TID Number</em>'.
	 * @see Subset0267.TIDNumber
	 * @generated
	 */
	EEnum getTIDNumber();

	/**
	 * Returns the meta object for enum '{@link Subset0267.TLength <em>TLength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TLength</em>'.
	 * @see Subset0267.TLength
	 * @generated
	 */
	EEnum getTLength();

	/**
	 * Returns the meta object for enum '{@link Subset0267.TMaxVal <em>TMax Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMax Val</em>'.
	 * @see Subset0267.TMaxVal
	 * @generated
	 */
	EEnum getTMaxVal();

	/**
	 * Returns the meta object for enum '{@link Subset0267.TMinVal <em>TMin Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMin Val</em>'.
	 * @see Subset0267.TMinVal
	 * @generated
	 */
	EEnum getTMinVal();

	/**
	 * Returns the meta object for enum '{@link Subset0267.TTransmissionMedia <em>TTransmission Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TTransmission Media</em>'.
	 * @see Subset0267.TTransmissionMedia
	 * @generated
	 */
	EEnum getTTransmissionMedia();

	/**
	 * Returns the meta object for enum '{@link Subset0267.TValue <em>TValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TValue</em>'.
	 * @see Subset0267.TValue
	 * @generated
	 */
	EEnum getTValue();

	/**
	 * Returns the meta object for enum '{@link Subset0267.TVarLen <em>TVar Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TVar Len</em>'.
	 * @see Subset0267.TVarLen
	 * @generated
	 */
	EEnum getTVarLen();

	/**
	 * Returns the meta object for data type '{@link Subset0267.TFormula <em>TFormula Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TFormula Object</em>'.
	 * @see Subset0267.TFormula
	 * @model instanceClass="Subset0267.TFormula"
	 *        extendedMetaData="name='T_Formula:Object' baseType='T_Formula'"
	 * @generated
	 */
	EDataType getTFormulaObject();

	/**
	 * Returns the meta object for data type '{@link Subset0267.TIDNumber <em>TID Number Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TID Number Object</em>'.
	 * @see Subset0267.TIDNumber
	 * @model instanceClass="Subset0267.TIDNumber"
	 *        extendedMetaData="name='T_IDNumber:Object' baseType='T_IDNumber'"
	 * @generated
	 */
	EDataType getTIDNumberObject();

	/**
	 * Returns the meta object for data type '{@link Subset0267.TLength <em>TLength Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TLength Object</em>'.
	 * @see Subset0267.TLength
	 * @model instanceClass="Subset0267.TLength"
	 *        extendedMetaData="name='T_Length:Object' baseType='T_Length'"
	 * @generated
	 */
	EDataType getTLengthObject();

	/**
	 * Returns the meta object for data type '{@link Subset0267.TMaxVal <em>TMax Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMax Val Object</em>'.
	 * @see Subset0267.TMaxVal
	 * @model instanceClass="Subset0267.TMaxVal"
	 *        extendedMetaData="name='T_MaxVal:Object' baseType='T_MaxVal'"
	 * @generated
	 */
	EDataType getTMaxValObject();

	/**
	 * Returns the meta object for data type '{@link Subset0267.TMinVal <em>TMin Val Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMin Val Object</em>'.
	 * @see Subset0267.TMinVal
	 * @model instanceClass="Subset0267.TMinVal"
	 *        extendedMetaData="name='T_MinVal:Object' baseType='T_MinVal'"
	 * @generated
	 */
	EDataType getTMinValObject();

	/**
	 * Returns the meta object for data type '{@link Subset0267.TTransmissionMedia <em>TTransmission Media Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TTransmission Media Object</em>'.
	 * @see Subset0267.TTransmissionMedia
	 * @model instanceClass="Subset0267.TTransmissionMedia"
	 *        extendedMetaData="name='T_TransmissionMedia:Object' baseType='T_TransmissionMedia'"
	 * @generated
	 */
	EDataType getTTransmissionMediaObject();

	/**
	 * Returns the meta object for data type '{@link Subset0267.TValue <em>TValue Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TValue Object</em>'.
	 * @see Subset0267.TValue
	 * @model instanceClass="Subset0267.TValue"
	 *        extendedMetaData="name='T_Value:Object' baseType='T_Value'"
	 * @generated
	 */
	EDataType getTValueObject();

	/**
	 * Returns the meta object for data type '{@link Subset0267.TVarLen <em>TVar Len Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TVar Len Object</em>'.
	 * @see Subset0267.TVarLen
	 * @model instanceClass="Subset0267.TVarLen"
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
	Subset0267Factory getSubset0267Factory();

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
		 * The meta object literal for the '{@link Subset0267.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.DocumentRootImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Both Ways</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOTH_WAYS = eINSTANCE.getDocumentRoot_BothWays();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMMENT = eINSTANCE.getDocumentRoot_Comment();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONDITION = eINSTANCE.getDocumentRoot_Condition();

		/**
		 * The meta object literal for the '<em><b>Conditional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONDITIONAL = eINSTANCE.getDocumentRoot_Conditional();

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
		 * The meta object literal for the '<em><b>Loop Do While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOOP_DO_WHILE = eINSTANCE.getDocumentRoot_LoopDoWhile();

		/**
		 * The meta object literal for the '<em><b>Loop While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOOP_WHILE = eINSTANCE.getDocumentRoot_LoopWhile();

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
		 * The meta object literal for the '<em><b>Packets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PACKETS = eINSTANCE.getDocumentRoot_Packets();

		/**
		 * The meta object literal for the '<em><b>Special</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECIAL = eINSTANCE.getDocumentRoot_Special();

		/**
		 * The meta object literal for the '<em><b>Specs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECS = eINSTANCE.getDocumentRoot_Specs();

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
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VARIABLE = eINSTANCE.getDocumentRoot_Variable();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VARIABLES = eINSTANCE.getDocumentRoot_Variables();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.ListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.ListTypeImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getListType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getListType();

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
		 * The meta object literal for the '{@link Subset0267.impl.SpecialTypeImpl <em>Special Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.SpecialTypeImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getSpecialType()
		 * @generated
		 */
		EClass SPECIAL_TYPE = eINSTANCE.getSpecialType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_TYPE__DESCRIPTION = eINSTANCE.getSpecialType_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_TYPE__VALUE = eINSTANCE.getSpecialType_Value();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.SpecsTypeImpl <em>Specs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.SpecsTypeImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getSpecsType()
		 * @generated
		 */
		EClass SPECS_TYPE = eINSTANCE.getSpecsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECS_TYPE__GROUP = eINSTANCE.getSpecsType_Group();

		/**
		 * The meta object literal for the '<em><b>Special</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECS_TYPE__SPECIAL = eINSTANCE.getSpecsType_Special();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECS_TYPE__FORMULA = eINSTANCE.getSpecsType_Formula();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECS_TYPE__LENGTH = eINSTANCE.getSpecsType_Length();

		/**
		 * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECS_TYPE__MAX_VAL = eINSTANCE.getSpecsType_MaxVal();

		/**
		 * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECS_TYPE__MIN_VAL = eINSTANCE.getSpecsType_MinVal();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.TBothWaysImpl <em>TBoth Ways</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TBothWaysImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTBothWays()
		 * @generated
		 */
		EClass TBOTH_WAYS = eINSTANCE.getTBothWays();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOTH_WAYS__LIST = eINSTANCE.getTBothWays_List();

		/**
		 * The meta object literal for the '<em><b>Packet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOTH_WAYS__PACKET = eINSTANCE.getTBothWays_Packet();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.TConditionalImpl <em>TConditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TConditionalImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTConditional()
		 * @generated
		 */
		EClass TCONDITIONAL = eINSTANCE.getTConditional();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONDITIONAL__GROUP = eINSTANCE.getTConditional_Group();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONDITIONAL__CONDITION = eINSTANCE.getTConditional_Condition();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONDITIONAL__VARIABLES = eINSTANCE.getTConditional_Variables();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.TContentImpl <em>TContent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TContentImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTContent()
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
		 * The meta object literal for the '<em><b>Loop Do While</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONTENT__LOOP_DO_WHILE = eINSTANCE.getTContent_LoopDoWhile();

		/**
		 * The meta object literal for the '<em><b>Loop While</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONTENT__LOOP_WHILE = eINSTANCE.getTContent_LoopWhile();

		/**
		 * The meta object literal for the '<em><b>Conditional</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONTENT__CONDITIONAL = eINSTANCE.getTContent_Conditional();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TDefinitionsImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTDefinitions()
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
		 * The meta object literal for the '<em><b>Var Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__VAR_DEF = eINSTANCE.getTDefinitions_VarDef();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.TLoopDoWhileImpl <em>TLoop Do While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TLoopDoWhileImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTLoopDoWhile()
		 * @generated
		 */
		EClass TLOOP_DO_WHILE = eINSTANCE.getTLoopDoWhile();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLOOP_DO_WHILE__GROUP = eINSTANCE.getTLoopDoWhile_Group();

		/**
		 * The meta object literal for the '<em><b>Tlg Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLOOP_DO_WHILE__TLG_VAR = eINSTANCE.getTLoopDoWhile_TlgVar();

		/**
		 * The meta object literal for the '<em><b>Conditional</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLOOP_DO_WHILE__CONDITIONAL = eINSTANCE.getTLoopDoWhile_Conditional();

		/**
		 * The meta object literal for the '<em><b>Loop While</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLOOP_DO_WHILE__LOOP_WHILE = eINSTANCE.getTLoopDoWhile_LoopWhile();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.TLoopWhileImpl <em>TLoop While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TLoopWhileImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTLoopWhile()
		 * @generated
		 */
		EClass TLOOP_WHILE = eINSTANCE.getTLoopWhile();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLOOP_WHILE__GROUP = eINSTANCE.getTLoopWhile_Group();

		/**
		 * The meta object literal for the '<em><b>Tlg Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLOOP_WHILE__TLG_VAR = eINSTANCE.getTLoopWhile_TlgVar();

		/**
		 * The meta object literal for the '<em><b>Conditional</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLOOP_WHILE__CONDITIONAL = eINSTANCE.getTLoopWhile_Conditional();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.TPacketImpl <em>TPacket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TPacketImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTPacket()
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
		 * The meta object literal for the '{@link Subset0267.impl.TPacketsImpl <em>TPackets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TPacketsImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTPackets()
		 * @generated
		 */
		EClass TPACKETS = eINSTANCE.getTPackets();

		/**
		 * The meta object literal for the '<em><b>Track To Train</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKETS__TRACK_TO_TRAIN = eINSTANCE.getTPackets_TrackToTrain();

		/**
		 * The meta object literal for the '<em><b>Train To Track</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKETS__TRAIN_TO_TRACK = eINSTANCE.getTPackets_TrainToTrack();

		/**
		 * The meta object literal for the '<em><b>Both Ways</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPACKETS__BOTH_WAYS = eINSTANCE.getTPackets_BothWays();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.TTlgVarImpl <em>TTlg Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TTlgVarImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTTlgVar()
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
		 * The meta object literal for the '{@link Subset0267.impl.TTrackToTrainImpl <em>TTrack To Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TTrackToTrainImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTTrackToTrain()
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
		 * The meta object literal for the '{@link Subset0267.impl.TTrainToTrackImpl <em>TTrain To Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TTrainToTrackImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTTrainToTrack()
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
		 * The meta object literal for the '{@link Subset0267.impl.TVardefVarImpl <em>TVardef Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TVardefVarImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTVardefVar()
		 * @generated
		 */
		EClass TVARDEF_VAR = eINSTANCE.getTVardefVar();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TVARDEF_VAR__GROUP = eINSTANCE.getTVardefVar_Group();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVARDEF_VAR__VARIABLE = eINSTANCE.getTVardefVar_Variable();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.TVariableImpl <em>TVariable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TVariableImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTVariable()
		 * @generated
		 */
		EClass TVARIABLE = eINSTANCE.getTVariable();

		/**
		 * The meta object literal for the '<em><b>Detailed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TVARIABLE__DETAILED_NAME = eINSTANCE.getTVariable_DetailedName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TVARIABLE__DESCRIPTION = eINSTANCE.getTVariable_Description();

		/**
		 * The meta object literal for the '<em><b>Specs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVARIABLE__SPECS = eINSTANCE.getTVariable_Specs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TVARIABLE__NAME = eINSTANCE.getTVariable_Name();

		/**
		 * The meta object literal for the '{@link Subset0267.impl.TVariablesImpl <em>TVariables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.impl.TVariablesImpl
		 * @see Subset0267.impl.Subset0267PackageImpl#getTVariables()
		 * @generated
		 */
		EClass TVARIABLES = eINSTANCE.getTVariables();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TVARIABLES__GROUP = eINSTANCE.getTVariables_Group();

		/**
		 * The meta object literal for the '<em><b>Loop Do While</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVARIABLES__LOOP_DO_WHILE = eINSTANCE.getTVariables_LoopDoWhile();

		/**
		 * The meta object literal for the '<em><b>Loop While</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVARIABLES__LOOP_WHILE = eINSTANCE.getTVariables_LoopWhile();

		/**
		 * The meta object literal for the '<em><b>Tlg Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVARIABLES__TLG_VAR = eINSTANCE.getTVariables_TlgVar();

		/**
		 * The meta object literal for the '<em><b>Conditional</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TVARIABLES__CONDITIONAL = eINSTANCE.getTVariables_Conditional();

		/**
		 * The meta object literal for the '{@link Subset0267.TFormula <em>TFormula</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TFormula
		 * @see Subset0267.impl.Subset0267PackageImpl#getTFormula()
		 * @generated
		 */
		EEnum TFORMULA = eINSTANCE.getTFormula();

		/**
		 * The meta object literal for the '{@link Subset0267.TIDNumber <em>TID Number</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TIDNumber
		 * @see Subset0267.impl.Subset0267PackageImpl#getTIDNumber()
		 * @generated
		 */
		EEnum TID_NUMBER = eINSTANCE.getTIDNumber();

		/**
		 * The meta object literal for the '{@link Subset0267.TLength <em>TLength</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TLength
		 * @see Subset0267.impl.Subset0267PackageImpl#getTLength()
		 * @generated
		 */
		EEnum TLENGTH = eINSTANCE.getTLength();

		/**
		 * The meta object literal for the '{@link Subset0267.TMaxVal <em>TMax Val</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TMaxVal
		 * @see Subset0267.impl.Subset0267PackageImpl#getTMaxVal()
		 * @generated
		 */
		EEnum TMAX_VAL = eINSTANCE.getTMaxVal();

		/**
		 * The meta object literal for the '{@link Subset0267.TMinVal <em>TMin Val</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TMinVal
		 * @see Subset0267.impl.Subset0267PackageImpl#getTMinVal()
		 * @generated
		 */
		EEnum TMIN_VAL = eINSTANCE.getTMinVal();

		/**
		 * The meta object literal for the '{@link Subset0267.TTransmissionMedia <em>TTransmission Media</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TTransmissionMedia
		 * @see Subset0267.impl.Subset0267PackageImpl#getTTransmissionMedia()
		 * @generated
		 */
		EEnum TTRANSMISSION_MEDIA = eINSTANCE.getTTransmissionMedia();

		/**
		 * The meta object literal for the '{@link Subset0267.TValue <em>TValue</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TValue
		 * @see Subset0267.impl.Subset0267PackageImpl#getTValue()
		 * @generated
		 */
		EEnum TVALUE = eINSTANCE.getTValue();

		/**
		 * The meta object literal for the '{@link Subset0267.TVarLen <em>TVar Len</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TVarLen
		 * @see Subset0267.impl.Subset0267PackageImpl#getTVarLen()
		 * @generated
		 */
		EEnum TVAR_LEN = eINSTANCE.getTVarLen();

		/**
		 * The meta object literal for the '<em>TFormula Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TFormula
		 * @see Subset0267.impl.Subset0267PackageImpl#getTFormulaObject()
		 * @generated
		 */
		EDataType TFORMULA_OBJECT = eINSTANCE.getTFormulaObject();

		/**
		 * The meta object literal for the '<em>TID Number Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TIDNumber
		 * @see Subset0267.impl.Subset0267PackageImpl#getTIDNumberObject()
		 * @generated
		 */
		EDataType TID_NUMBER_OBJECT = eINSTANCE.getTIDNumberObject();

		/**
		 * The meta object literal for the '<em>TLength Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TLength
		 * @see Subset0267.impl.Subset0267PackageImpl#getTLengthObject()
		 * @generated
		 */
		EDataType TLENGTH_OBJECT = eINSTANCE.getTLengthObject();

		/**
		 * The meta object literal for the '<em>TMax Val Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TMaxVal
		 * @see Subset0267.impl.Subset0267PackageImpl#getTMaxValObject()
		 * @generated
		 */
		EDataType TMAX_VAL_OBJECT = eINSTANCE.getTMaxValObject();

		/**
		 * The meta object literal for the '<em>TMin Val Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TMinVal
		 * @see Subset0267.impl.Subset0267PackageImpl#getTMinValObject()
		 * @generated
		 */
		EDataType TMIN_VAL_OBJECT = eINSTANCE.getTMinValObject();

		/**
		 * The meta object literal for the '<em>TTransmission Media Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TTransmissionMedia
		 * @see Subset0267.impl.Subset0267PackageImpl#getTTransmissionMediaObject()
		 * @generated
		 */
		EDataType TTRANSMISSION_MEDIA_OBJECT = eINSTANCE.getTTransmissionMediaObject();

		/**
		 * The meta object literal for the '<em>TValue Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TValue
		 * @see Subset0267.impl.Subset0267PackageImpl#getTValueObject()
		 * @generated
		 */
		EDataType TVALUE_OBJECT = eINSTANCE.getTValueObject();

		/**
		 * The meta object literal for the '<em>TVar Len Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Subset0267.TVarLen
		 * @see Subset0267.impl.Subset0267PackageImpl#getTVarLenObject()
		 * @generated
		 */
		EDataType TVAR_LEN_OBJECT = eINSTANCE.getTVarLenObject();

	}

} //Subset0267Package
