/**
 */
package Subset0268.impl;

import Subset0268.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Subset0268FactoryImpl extends EFactoryImpl implements Subset0268Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Subset0268Factory init() {
		try {
			Subset0268Factory theSubset0268Factory = (Subset0268Factory)EPackage.Registry.INSTANCE.getEFactory(Subset0268Package.eNS_URI);
			if (theSubset0268Factory != null) {
				return theSubset0268Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Subset0268FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset0268FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Subset0268Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Subset0268Package.LIST_TYPE: return createListType();
			case Subset0268Package.OPTIONAL_PACKETS_TYPE: return createOptionalPacketsType();
			case Subset0268Package.PARCEL_TYPE: return createParcelType();
			case Subset0268Package.TCONTENT: return createTContent();
			case Subset0268Package.TDEFINITIONS: return createTDefinitions();
			case Subset0268Package.TPACKET: return createTPacket();
			case Subset0268Package.TPACKETS: return createTPackets();
			case Subset0268Package.TTLG_VAR: return createTTlgVar();
			case Subset0268Package.TTRACK_TO_TRAIN: return createTTrackToTrain();
			case Subset0268Package.TTRAIN_TO_TRACK: return createTTrainToTrack();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Subset0268Package.TLENGTH:
				return createTLengthFromString(eDataType, initialValue);
			case Subset0268Package.TTRANSMISSION_MEDIA:
				return createTTransmissionMediaFromString(eDataType, initialValue);
			case Subset0268Package.TVAR_LEN:
				return createTVarLenFromString(eDataType, initialValue);
			case Subset0268Package.TLENGTH_OBJECT:
				return createTLengthObjectFromString(eDataType, initialValue);
			case Subset0268Package.TTRANSMISSION_MEDIA_OBJECT:
				return createTTransmissionMediaObjectFromString(eDataType, initialValue);
			case Subset0268Package.TVAR_LEN_OBJECT:
				return createTVarLenObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Subset0268Package.TLENGTH:
				return convertTLengthToString(eDataType, instanceValue);
			case Subset0268Package.TTRANSMISSION_MEDIA:
				return convertTTransmissionMediaToString(eDataType, instanceValue);
			case Subset0268Package.TVAR_LEN:
				return convertTVarLenToString(eDataType, instanceValue);
			case Subset0268Package.TLENGTH_OBJECT:
				return convertTLengthObjectToString(eDataType, instanceValue);
			case Subset0268Package.TTRANSMISSION_MEDIA_OBJECT:
				return convertTTransmissionMediaObjectToString(eDataType, instanceValue);
			case Subset0268Package.TVAR_LEN_OBJECT:
				return convertTVarLenObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalPacketsType createOptionalPacketsType() {
		OptionalPacketsTypeImpl optionalPacketsType = new OptionalPacketsTypeImpl();
		return optionalPacketsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcelType createParcelType() {
		ParcelTypeImpl parcelType = new ParcelTypeImpl();
		return parcelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TContent createTContent() {
		TContentImpl tContent = new TContentImpl();
		return tContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDefinitions createTDefinitions() {
		TDefinitionsImpl tDefinitions = new TDefinitionsImpl();
		return tDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPacket createTPacket() {
		TPacketImpl tPacket = new TPacketImpl();
		return tPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackets createTPackets() {
		TPacketsImpl tPackets = new TPacketsImpl();
		return tPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTlgVar createTTlgVar() {
		TTlgVarImpl tTlgVar = new TTlgVarImpl();
		return tTlgVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrackToTrain createTTrackToTrain() {
		TTrackToTrainImpl tTrackToTrain = new TTrackToTrainImpl();
		return tTrackToTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrainToTrack createTTrainToTrack() {
		TTrainToTrackImpl tTrainToTrack = new TTrainToTrackImpl();
		return tTrainToTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLength createTLengthFromString(EDataType eDataType, String initialValue) {
		TLength result = TLength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransmissionMedia createTTransmissionMediaFromString(EDataType eDataType, String initialValue) {
		TTransmissionMedia result = TTransmissionMedia.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTransmissionMediaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVarLen createTVarLenFromString(EDataType eDataType, String initialValue) {
		TVarLen result = TVarLen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTVarLenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLength createTLengthObjectFromString(EDataType eDataType, String initialValue) {
		return createTLengthFromString(Subset0268Package.Literals.TLENGTH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTLengthObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTLengthToString(Subset0268Package.Literals.TLENGTH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransmissionMedia createTTransmissionMediaObjectFromString(EDataType eDataType, String initialValue) {
		return createTTransmissionMediaFromString(Subset0268Package.Literals.TTRANSMISSION_MEDIA, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTransmissionMediaObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTTransmissionMediaToString(Subset0268Package.Literals.TTRANSMISSION_MEDIA, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVarLen createTVarLenObjectFromString(EDataType eDataType, String initialValue) {
		return createTVarLenFromString(Subset0268Package.Literals.TVAR_LEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTVarLenObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTVarLenToString(Subset0268Package.Literals.TVAR_LEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset0268Package getSubset0268Package() {
		return (Subset0268Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Subset0268Package getPackage() {
		return Subset0268Package.eINSTANCE;
	}

} //Subset0268FactoryImpl
