/**
 */
package Subset0268.impl;

import Subset0268.DocumentRoot;
import Subset0268.ListType;
import Subset0268.OptionalPacketsType;
import Subset0268.ParcelType;
import Subset0268.Subset0268Factory;
import Subset0268.Subset0268Package;
import Subset0268.TContent;
import Subset0268.TDefinitions;
import Subset0268.TLength;
import Subset0268.TPacket;
import Subset0268.TPackets;
import Subset0268.TTlgVar;
import Subset0268.TTrackToTrain;
import Subset0268.TTrainToTrack;
import Subset0268.TTransmissionMedia;
import Subset0268.TVarLen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Subset0268PackageImpl extends EPackageImpl implements Subset0268Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalPacketsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parcelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPacketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTlgVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTrackToTrainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTrainToTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tLengthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tTransmissionMediaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tVarLenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tLengthObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tTransmissionMediaObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tVarLenObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Subset0268.Subset0268Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Subset0268PackageImpl() {
		super(eNS_URI, Subset0268Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Subset0268Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Subset0268Package init() {
		if (isInited) return (Subset0268Package)EPackage.Registry.INSTANCE.getEPackage(Subset0268Package.eNS_URI);

		// Obtain or create and register package
		Subset0268PackageImpl theSubset0268Package = (Subset0268PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Subset0268PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Subset0268PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSubset0268Package.createPackageContents();

		// Initialize created meta-data
		theSubset0268Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubset0268Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Subset0268Package.eNS_URI, theSubset0268Package);
		return theSubset0268Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Comment() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Content() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Definitions() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Description() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DetailedName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IDNumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Length() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_List() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Name() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Packet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PacketNumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Packets() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Parcel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TlgVar() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TrackToTrain() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TrainToTrack() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransmissionMedia() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Value() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListType() {
		return listTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListType_Media() {
		return (EAttribute)listTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListType_Name() {
		return (EAttribute)listTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListType_Number() {
		return (EAttribute)listTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionalPacketsType() {
		return optionalPacketsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalPacketsType_Parcel() {
		return (EReference)optionalPacketsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParcelType() {
		return parcelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcelType_Comment() {
		return (EAttribute)parcelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcelType_Number() {
		return (EAttribute)parcelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTContent() {
		return tContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTContent_Group() {
		return (EAttribute)tContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTContent_TlgVar() {
		return (EReference)tContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTContent_Parcel() {
		return (EReference)tContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTContent_OptionalPackets() {
		return (EReference)tContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDefinitions() {
		return tDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_Packets() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPacket() {
		return tPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPacket_Description() {
		return (EAttribute)tPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPacket_Content() {
		return (EReference)tPacketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPacket_Name() {
		return (EAttribute)tPacketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPacket_Number() {
		return (EAttribute)tPacketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPacket_TransmissionMedia() {
		return (EAttribute)tPacketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPackets() {
		return tPacketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackets_TrainToTrack() {
		return (EReference)tPacketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackets_TrackToTrain() {
		return (EReference)tPacketsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTlgVar() {
		return tTlgVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTlgVar_Comment() {
		return (EAttribute)tTlgVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTlgVar_Length() {
		return (EAttribute)tTlgVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTlgVar_Name() {
		return (EAttribute)tTlgVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTlgVar_Type() {
		return (EAttribute)tTlgVarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTrackToTrain() {
		return tTrackToTrainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTTrackToTrain_List() {
		return (EReference)tTrackToTrainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTTrackToTrain_Packet() {
		return (EReference)tTrackToTrainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTrainToTrack() {
		return tTrainToTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTrainToTrack_Group() {
		return (EAttribute)tTrainToTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTTrainToTrack_List() {
		return (EReference)tTrainToTrackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTTrainToTrack_Packet() {
		return (EReference)tTrainToTrackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTLength() {
		return tLengthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTTransmissionMedia() {
		return tTransmissionMediaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTVarLen() {
		return tVarLenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTLengthObject() {
		return tLengthObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTTransmissionMediaObject() {
		return tTransmissionMediaObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTVarLenObject() {
		return tVarLenObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset0268Factory getSubset0268Factory() {
		return (Subset0268Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COMMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEFINITIONS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DETAILED_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID_NUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LENGTH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKET);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PACKET_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKETS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARCEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TLG_VAR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRACK_TO_TRAIN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRAIN_TO_TRACK);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSMISSION_MEDIA);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VALUE);

		listTypeEClass = createEClass(LIST_TYPE);
		createEAttribute(listTypeEClass, LIST_TYPE__MEDIA);
		createEAttribute(listTypeEClass, LIST_TYPE__NAME);
		createEAttribute(listTypeEClass, LIST_TYPE__NUMBER);

		optionalPacketsTypeEClass = createEClass(OPTIONAL_PACKETS_TYPE);
		createEReference(optionalPacketsTypeEClass, OPTIONAL_PACKETS_TYPE__PARCEL);

		parcelTypeEClass = createEClass(PARCEL_TYPE);
		createEAttribute(parcelTypeEClass, PARCEL_TYPE__COMMENT);
		createEAttribute(parcelTypeEClass, PARCEL_TYPE__NUMBER);

		tContentEClass = createEClass(TCONTENT);
		createEAttribute(tContentEClass, TCONTENT__GROUP);
		createEReference(tContentEClass, TCONTENT__TLG_VAR);
		createEReference(tContentEClass, TCONTENT__PARCEL);
		createEReference(tContentEClass, TCONTENT__OPTIONAL_PACKETS);

		tDefinitionsEClass = createEClass(TDEFINITIONS);
		createEReference(tDefinitionsEClass, TDEFINITIONS__PACKETS);

		tPacketEClass = createEClass(TPACKET);
		createEAttribute(tPacketEClass, TPACKET__DESCRIPTION);
		createEReference(tPacketEClass, TPACKET__CONTENT);
		createEAttribute(tPacketEClass, TPACKET__NAME);
		createEAttribute(tPacketEClass, TPACKET__NUMBER);
		createEAttribute(tPacketEClass, TPACKET__TRANSMISSION_MEDIA);

		tPacketsEClass = createEClass(TPACKETS);
		createEReference(tPacketsEClass, TPACKETS__TRAIN_TO_TRACK);
		createEReference(tPacketsEClass, TPACKETS__TRACK_TO_TRAIN);

		tTlgVarEClass = createEClass(TTLG_VAR);
		createEAttribute(tTlgVarEClass, TTLG_VAR__COMMENT);
		createEAttribute(tTlgVarEClass, TTLG_VAR__LENGTH);
		createEAttribute(tTlgVarEClass, TTLG_VAR__NAME);
		createEAttribute(tTlgVarEClass, TTLG_VAR__TYPE);

		tTrackToTrainEClass = createEClass(TTRACK_TO_TRAIN);
		createEReference(tTrackToTrainEClass, TTRACK_TO_TRAIN__LIST);
		createEReference(tTrackToTrainEClass, TTRACK_TO_TRAIN__PACKET);

		tTrainToTrackEClass = createEClass(TTRAIN_TO_TRACK);
		createEAttribute(tTrainToTrackEClass, TTRAIN_TO_TRACK__GROUP);
		createEReference(tTrainToTrackEClass, TTRAIN_TO_TRACK__LIST);
		createEReference(tTrainToTrackEClass, TTRAIN_TO_TRACK__PACKET);

		// Create enums
		tLengthEEnum = createEEnum(TLENGTH);
		tTransmissionMediaEEnum = createEEnum(TTRANSMISSION_MEDIA);
		tVarLenEEnum = createEEnum(TVAR_LEN);

		// Create data types
		tLengthObjectEDataType = createEDataType(TLENGTH_OBJECT);
		tTransmissionMediaObjectEDataType = createEDataType(TTRANSMISSION_MEDIA_OBJECT);
		tVarLenObjectEDataType = createEDataType(TVAR_LEN_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Comment(), theXMLTypePackage.getString(), "comment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Content(), this.getTContent(), null, "content", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Definitions(), this.getTDefinitions(), null, "definitions", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Description(), theXMLTypePackage.getString(), "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DetailedName(), theXMLTypePackage.getString(), "detailedName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IDNumber(), theXMLTypePackage.getInteger(), "iDNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Length(), this.getTLength(), "length", "5", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_List(), this.getListType(), null, "list", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Name(), theXMLTypePackage.getString(), "name", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Packet(), this.getTPacket(), null, "packet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PacketNumber(), theXMLTypePackage.getInteger(), "packetNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Packets(), this.getTPackets(), null, "packets", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Parcel(), this.getParcelType(), null, "parcel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TlgVar(), this.getTTlgVar(), null, "tlgVar", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TrackToTrain(), this.getTTrackToTrain(), null, "trackToTrain", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TrainToTrack(), this.getTTrainToTrack(), null, "trainToTrack", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransmissionMedia(), this.getTTransmissionMedia(), "transmissionMedia", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Value(), theXMLTypePackage.getString(), "value", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(listTypeEClass, ListType.class, "ListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListType_Media(), theXMLTypePackage.getString(), "media", null, 1, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListType_Number(), theXMLTypePackage.getInt(), "number", null, 1, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionalPacketsTypeEClass, OptionalPacketsType.class, "OptionalPacketsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionalPacketsType_Parcel(), this.getParcelType(), null, "parcel", null, 1, -1, OptionalPacketsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parcelTypeEClass, ParcelType.class, "ParcelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParcelType_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, ParcelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcelType_Number(), theXMLTypePackage.getInteger(), "number", null, 1, 1, ParcelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tContentEClass, TContent.class, "TContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTContent_TlgVar(), this.getTTlgVar(), null, "tlgVar", null, 0, -1, TContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTContent_Parcel(), this.getParcelType(), null, "parcel", null, 0, -1, TContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTContent_OptionalPackets(), this.getOptionalPacketsType(), null, "optionalPackets", null, 0, -1, TContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tDefinitionsEClass, TDefinitions.class, "TDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDefinitions_Packets(), this.getTPackets(), null, "packets", null, 1, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPacketEClass, TPacket.class, "TPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTPacket_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, TPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPacket_Content(), this.getTContent(), null, "content", null, 1, 1, TPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPacket_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPacket_Number(), theXMLTypePackage.getInteger(), "number", null, 1, 1, TPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPacket_TransmissionMedia(), this.getTTransmissionMedia(), "transmissionMedia", null, 1, 1, TPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPacketsEClass, TPackets.class, "TPackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPackets_TrainToTrack(), this.getTTrainToTrack(), null, "trainToTrack", null, 1, 1, TPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackets_TrackToTrain(), this.getTTrackToTrain(), null, "trackToTrain", null, 1, 1, TPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTlgVarEClass, TTlgVar.class, "TTlgVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTlgVar_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, TTlgVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTlgVar_Length(), theXMLTypePackage.getInteger(), "length", null, 1, 1, TTlgVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTlgVar_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TTlgVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTlgVar_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, TTlgVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTrackToTrainEClass, TTrackToTrain.class, "TTrackToTrain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTTrackToTrain_List(), this.getListType(), null, "list", null, 1, -1, TTrackToTrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTTrackToTrain_Packet(), this.getTPacket(), null, "packet", null, 1, -1, TTrackToTrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTrainToTrackEClass, TTrainToTrack.class, "TTrainToTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTrainToTrack_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TTrainToTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTTrainToTrack_List(), this.getListType(), null, "list", null, 1, -1, TTrainToTrack.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTTrainToTrack_Packet(), this.getTPacket(), null, "packet", null, 1, -1, TTrainToTrack.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tLengthEEnum, TLength.class, "TLength");
		addEEnumLiteral(tLengthEEnum, TLength._);
		addEEnumLiteral(tLengthEEnum, TLength._1);
		addEEnumLiteral(tLengthEEnum, TLength._2);
		addEEnumLiteral(tLengthEEnum, TLength._3);
		addEEnumLiteral(tLengthEEnum, TLength._4);
		addEEnumLiteral(tLengthEEnum, TLength._5);
		addEEnumLiteral(tLengthEEnum, TLength._6);
		addEEnumLiteral(tLengthEEnum, TLength._7);
		addEEnumLiteral(tLengthEEnum, TLength._8);
		addEEnumLiteral(tLengthEEnum, TLength._9);
		addEEnumLiteral(tLengthEEnum, TLength._10);
		addEEnumLiteral(tLengthEEnum, TLength._1014);
		addEEnumLiteral(tLengthEEnum, TLength._12);
		addEEnumLiteral(tLengthEEnum, TLength._13);
		addEEnumLiteral(tLengthEEnum, TLength._14);
		addEEnumLiteral(tLengthEEnum, TLength._15);
		addEEnumLiteral(tLengthEEnum, TLength._20);
		addEEnumLiteral(tLengthEEnum, TLength._24);
		addEEnumLiteral(tLengthEEnum, TLength._32);
		addEEnumLiteral(tLengthEEnum, TLength._64);

		initEEnum(tTransmissionMediaEEnum, TTransmissionMedia.class, "TTransmissionMedia");
		addEEnumLiteral(tTransmissionMediaEEnum, TTransmissionMedia.ANY);
		addEEnumLiteral(tTransmissionMediaEEnum, TTransmissionMedia.BALISE);
		addEEnumLiteral(tTransmissionMediaEEnum, TTransmissionMedia.LOOP);
		addEEnumLiteral(tTransmissionMediaEEnum, TTransmissionMedia.RBC);
		addEEnumLiteral(tTransmissionMediaEEnum, TTransmissionMedia.RIU);
		addEEnumLiteral(tTransmissionMediaEEnum, TTransmissionMedia.RBCRIU);
		addEEnumLiteral(tTransmissionMediaEEnum, TTransmissionMedia.BALISE_LOOP);
		addEEnumLiteral(tTransmissionMediaEEnum, TTransmissionMedia.BALISE_RBC);
		addEEnumLiteral(tTransmissionMediaEEnum, TTransmissionMedia.BALISE_RBCRIU);
		addEEnumLiteral(tTransmissionMediaEEnum, TTransmissionMedia.BALISE_LOOP_RIU);

		initEEnum(tVarLenEEnum, TVarLen.class, "TVarLen");
		addEEnumLiteral(tVarLenEEnum, TVarLen._);
		addEEnumLiteral(tVarLenEEnum, TVarLen._1BIT);
		addEEnumLiteral(tVarLenEEnum, TVarLen._2BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._3BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._4BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._5BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._6BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._7BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._8BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._9BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._10_BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._1014_BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._12_BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._13_BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._14_BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._15_BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._16_BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._20_BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._24_BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._32_BITS);
		addEEnumLiteral(tVarLenEEnum, TVarLen._64_BITS);

		// Initialize data types
		initEDataType(tLengthObjectEDataType, TLength.class, "TLengthObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tTransmissionMediaObjectEDataType, TTransmissionMedia.class, "TTransmissionMediaObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tVarLenObjectEDataType, TVarLen.class, "TVarLenObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Content(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Content",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Definitions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Definitions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DetailedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DetailedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IDNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Length(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Length",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "List",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Packet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PacketNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PacketNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Packets(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packets",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Parcel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Parcel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TlgVar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TlgVar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TrackToTrain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TrackToTrain",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TrainToTrack(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TrainToTrack",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransmissionMedia(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransmissionMedia",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (listTypeEClass, 
		   source, 
		   new String[] {
			 "name", "List_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getListType_Media(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Media",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getListType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getListType_Number(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (optionalPacketsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OptionalPackets_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOptionalPacketsType_Parcel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Parcel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (parcelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Parcel_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getParcelType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParcelType_Number(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tContentEClass, 
		   source, 
		   new String[] {
			 "name", "T_Content",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTContent_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTContent_TlgVar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TlgVar",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTContent_Parcel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Parcel",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTContent_OptionalPackets(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OptionalPackets",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (tDefinitionsEClass, 
		   source, 
		   new String[] {
			 "name", "T_Definitions",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTDefinitions_Packets(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packets",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tLengthEEnum, 
		   source, 
		   new String[] {
			 "name", "T_Length"
		   });		
		addAnnotation
		  (tLengthObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "T_Length:Object",
			 "baseType", "T_Length"
		   });		
		addAnnotation
		  (tPacketEClass, 
		   source, 
		   new String[] {
			 "name", "T_Packet",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTPacket_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTPacket_Content(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Content",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTPacket_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTPacket_Number(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTPacket_TransmissionMedia(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TransmissionMedia",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tPacketsEClass, 
		   source, 
		   new String[] {
			 "name", "T_Packets",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTPackets_TrainToTrack(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TrainToTrack",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTPackets_TrackToTrain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TrackToTrain",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tTlgVarEClass, 
		   source, 
		   new String[] {
			 "name", "T_TlgVar",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getTTlgVar_Comment(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTTlgVar_Length(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Length",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTTlgVar_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTTlgVar_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tTrackToTrainEClass, 
		   source, 
		   new String[] {
			 "name", "T_TrackToTrain",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTTrackToTrain_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "List",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTTrackToTrain_Packet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tTrainToTrackEClass, 
		   source, 
		   new String[] {
			 "name", "T_TrainToTrack",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTTrainToTrack_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTTrainToTrack_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "List",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTTrainToTrack_Packet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packet",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (tTransmissionMediaEEnum, 
		   source, 
		   new String[] {
			 "name", "T_TransmissionMedia"
		   });		
		addAnnotation
		  (tTransmissionMediaObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "T_TransmissionMedia:Object",
			 "baseType", "T_TransmissionMedia"
		   });		
		addAnnotation
		  (tVarLenEEnum, 
		   source, 
		   new String[] {
			 "name", "T_VarLen"
		   });		
		addAnnotation
		  (tVarLenObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "T_VarLen:Object",
			 "baseType", "T_VarLen"
		   });
	}

} //Subset0268PackageImpl
