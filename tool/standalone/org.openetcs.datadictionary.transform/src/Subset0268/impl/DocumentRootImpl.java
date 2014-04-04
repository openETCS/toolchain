/**
 */
package Subset0268.impl;

import Subset0268.DocumentRoot;
import Subset0268.ListType;
import Subset0268.ParcelType;
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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getContent <em>Content</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getDetailedName <em>Detailed Name</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getIDNumber <em>ID Number</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getPacket <em>Packet</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getPacketNumber <em>Packet Number</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getPackets <em>Packets</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getParcel <em>Parcel</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getTlgVar <em>Tlg Var</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getTrackToTrain <em>Track To Train</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getTrainToTrack <em>Train To Track</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getTransmissionMedia <em>Transmission Media</em>}</li>
 *   <li>{@link Subset0268.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDetailedName() <em>Detailed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedName()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIDNumber() <em>ID Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final TLength LENGTH_EDEFAULT = TLength._5;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPacketNumber() <em>Packet Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PACKET_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransmissionMedia() <em>Transmission Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionMedia()
	 * @generated
	 * @ordered
	 */
	protected static final TTransmissionMedia TRANSMISSION_MEDIA_EDEFAULT = TTransmissionMedia.ANY;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0268Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Subset0268Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Subset0268Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Subset0268Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TContent getContent() {
		return (TContent)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(TContent newContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0268Package.Literals.DOCUMENT_ROOT__CONTENT, newContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(TContent newContent) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDefinitions getDefinitions() {
		return (TDefinitions)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__DEFINITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(TDefinitions newDefinitions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0268Package.Literals.DOCUMENT_ROOT__DEFINITIONS, newDefinitions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitions(TDefinitions newDefinitions) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__DEFINITIONS, newDefinitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailedName() {
		return (String)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__DETAILED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailedName(String newDetailedName) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__DETAILED_NAME, newDetailedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIDNumber() {
		return (BigInteger)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__ID_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIDNumber(BigInteger newIDNumber) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__ID_NUMBER, newIDNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLength getLength() {
		return (TLength)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(TLength newLength) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType getList() {
		return (ListType)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(ListType newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0268Package.Literals.DOCUMENT_ROOT__LIST, newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(ListType newList) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__LIST, newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPacket getPacket() {
		return (TPacket)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__PACKET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPacket(TPacket newPacket, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0268Package.Literals.DOCUMENT_ROOT__PACKET, newPacket, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacket(TPacket newPacket) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__PACKET, newPacket);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPacketNumber() {
		return (BigInteger)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__PACKET_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketNumber(BigInteger newPacketNumber) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__PACKET_NUMBER, newPacketNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackets getPackets() {
		return (TPackets)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__PACKETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackets(TPackets newPackets, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0268Package.Literals.DOCUMENT_ROOT__PACKETS, newPackets, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackets(TPackets newPackets) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__PACKETS, newPackets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcelType getParcel() {
		return (ParcelType)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__PARCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParcel(ParcelType newParcel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0268Package.Literals.DOCUMENT_ROOT__PARCEL, newParcel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParcel(ParcelType newParcel) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__PARCEL, newParcel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTlgVar getTlgVar() {
		return (TTlgVar)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__TLG_VAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTlgVar(TTlgVar newTlgVar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0268Package.Literals.DOCUMENT_ROOT__TLG_VAR, newTlgVar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTlgVar(TTlgVar newTlgVar) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__TLG_VAR, newTlgVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrackToTrain getTrackToTrain() {
		return (TTrackToTrain)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__TRACK_TO_TRAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackToTrain(TTrackToTrain newTrackToTrain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0268Package.Literals.DOCUMENT_ROOT__TRACK_TO_TRAIN, newTrackToTrain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackToTrain(TTrackToTrain newTrackToTrain) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__TRACK_TO_TRAIN, newTrackToTrain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrainToTrack getTrainToTrack() {
		return (TTrainToTrack)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__TRAIN_TO_TRACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrainToTrack(TTrainToTrack newTrainToTrack, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0268Package.Literals.DOCUMENT_ROOT__TRAIN_TO_TRACK, newTrainToTrack, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainToTrack(TTrainToTrack newTrainToTrack) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__TRAIN_TO_TRACK, newTrainToTrack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransmissionMedia getTransmissionMedia() {
		return (TTransmissionMedia)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__TRANSMISSION_MEDIA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionMedia(TTransmissionMedia newTransmissionMedia) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__TRANSMISSION_MEDIA, newTransmissionMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)getMixed().get(Subset0268Package.Literals.DOCUMENT_ROOT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		((FeatureMap.Internal)getMixed()).set(Subset0268Package.Literals.DOCUMENT_ROOT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0268Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Subset0268Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Subset0268Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Subset0268Package.DOCUMENT_ROOT__CONTENT:
				return basicSetContent(null, msgs);
			case Subset0268Package.DOCUMENT_ROOT__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case Subset0268Package.DOCUMENT_ROOT__LIST:
				return basicSetList(null, msgs);
			case Subset0268Package.DOCUMENT_ROOT__PACKET:
				return basicSetPacket(null, msgs);
			case Subset0268Package.DOCUMENT_ROOT__PACKETS:
				return basicSetPackets(null, msgs);
			case Subset0268Package.DOCUMENT_ROOT__PARCEL:
				return basicSetParcel(null, msgs);
			case Subset0268Package.DOCUMENT_ROOT__TLG_VAR:
				return basicSetTlgVar(null, msgs);
			case Subset0268Package.DOCUMENT_ROOT__TRACK_TO_TRAIN:
				return basicSetTrackToTrain(null, msgs);
			case Subset0268Package.DOCUMENT_ROOT__TRAIN_TO_TRACK:
				return basicSetTrainToTrack(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Subset0268Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Subset0268Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Subset0268Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Subset0268Package.DOCUMENT_ROOT__COMMENT:
				return getComment();
			case Subset0268Package.DOCUMENT_ROOT__CONTENT:
				return getContent();
			case Subset0268Package.DOCUMENT_ROOT__DEFINITIONS:
				return getDefinitions();
			case Subset0268Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case Subset0268Package.DOCUMENT_ROOT__DETAILED_NAME:
				return getDetailedName();
			case Subset0268Package.DOCUMENT_ROOT__ID_NUMBER:
				return getIDNumber();
			case Subset0268Package.DOCUMENT_ROOT__LENGTH:
				return getLength();
			case Subset0268Package.DOCUMENT_ROOT__LIST:
				return getList();
			case Subset0268Package.DOCUMENT_ROOT__NAME:
				return getName();
			case Subset0268Package.DOCUMENT_ROOT__PACKET:
				return getPacket();
			case Subset0268Package.DOCUMENT_ROOT__PACKET_NUMBER:
				return getPacketNumber();
			case Subset0268Package.DOCUMENT_ROOT__PACKETS:
				return getPackets();
			case Subset0268Package.DOCUMENT_ROOT__PARCEL:
				return getParcel();
			case Subset0268Package.DOCUMENT_ROOT__TLG_VAR:
				return getTlgVar();
			case Subset0268Package.DOCUMENT_ROOT__TRACK_TO_TRAIN:
				return getTrackToTrain();
			case Subset0268Package.DOCUMENT_ROOT__TRAIN_TO_TRACK:
				return getTrainToTrack();
			case Subset0268Package.DOCUMENT_ROOT__TRANSMISSION_MEDIA:
				return getTransmissionMedia();
			case Subset0268Package.DOCUMENT_ROOT__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Subset0268Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__COMMENT:
				setComment((String)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__CONTENT:
				setContent((TContent)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__DEFINITIONS:
				setDefinitions((TDefinitions)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__DETAILED_NAME:
				setDetailedName((String)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__ID_NUMBER:
				setIDNumber((BigInteger)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__LENGTH:
				setLength((TLength)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__LIST:
				setList((ListType)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__PACKET:
				setPacket((TPacket)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__PACKET_NUMBER:
				setPacketNumber((BigInteger)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__PACKETS:
				setPackets((TPackets)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__PARCEL:
				setParcel((ParcelType)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__TLG_VAR:
				setTlgVar((TTlgVar)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__TRACK_TO_TRAIN:
				setTrackToTrain((TTrackToTrain)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__TRAIN_TO_TRACK:
				setTrainToTrack((TTrainToTrack)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__TRANSMISSION_MEDIA:
				setTransmissionMedia((TTransmissionMedia)newValue);
				return;
			case Subset0268Package.DOCUMENT_ROOT__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Subset0268Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Subset0268Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Subset0268Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Subset0268Package.DOCUMENT_ROOT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Subset0268Package.DOCUMENT_ROOT__CONTENT:
				setContent((TContent)null);
				return;
			case Subset0268Package.DOCUMENT_ROOT__DEFINITIONS:
				setDefinitions((TDefinitions)null);
				return;
			case Subset0268Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Subset0268Package.DOCUMENT_ROOT__DETAILED_NAME:
				setDetailedName(DETAILED_NAME_EDEFAULT);
				return;
			case Subset0268Package.DOCUMENT_ROOT__ID_NUMBER:
				setIDNumber(ID_NUMBER_EDEFAULT);
				return;
			case Subset0268Package.DOCUMENT_ROOT__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case Subset0268Package.DOCUMENT_ROOT__LIST:
				setList((ListType)null);
				return;
			case Subset0268Package.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Subset0268Package.DOCUMENT_ROOT__PACKET:
				setPacket((TPacket)null);
				return;
			case Subset0268Package.DOCUMENT_ROOT__PACKET_NUMBER:
				setPacketNumber(PACKET_NUMBER_EDEFAULT);
				return;
			case Subset0268Package.DOCUMENT_ROOT__PACKETS:
				setPackets((TPackets)null);
				return;
			case Subset0268Package.DOCUMENT_ROOT__PARCEL:
				setParcel((ParcelType)null);
				return;
			case Subset0268Package.DOCUMENT_ROOT__TLG_VAR:
				setTlgVar((TTlgVar)null);
				return;
			case Subset0268Package.DOCUMENT_ROOT__TRACK_TO_TRAIN:
				setTrackToTrain((TTrackToTrain)null);
				return;
			case Subset0268Package.DOCUMENT_ROOT__TRAIN_TO_TRACK:
				setTrainToTrack((TTrainToTrack)null);
				return;
			case Subset0268Package.DOCUMENT_ROOT__TRANSMISSION_MEDIA:
				setTransmissionMedia(TRANSMISSION_MEDIA_EDEFAULT);
				return;
			case Subset0268Package.DOCUMENT_ROOT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Subset0268Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Subset0268Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Subset0268Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Subset0268Package.DOCUMENT_ROOT__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case Subset0268Package.DOCUMENT_ROOT__CONTENT:
				return getContent() != null;
			case Subset0268Package.DOCUMENT_ROOT__DEFINITIONS:
				return getDefinitions() != null;
			case Subset0268Package.DOCUMENT_ROOT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case Subset0268Package.DOCUMENT_ROOT__DETAILED_NAME:
				return DETAILED_NAME_EDEFAULT == null ? getDetailedName() != null : !DETAILED_NAME_EDEFAULT.equals(getDetailedName());
			case Subset0268Package.DOCUMENT_ROOT__ID_NUMBER:
				return ID_NUMBER_EDEFAULT == null ? getIDNumber() != null : !ID_NUMBER_EDEFAULT.equals(getIDNumber());
			case Subset0268Package.DOCUMENT_ROOT__LENGTH:
				return getLength() != LENGTH_EDEFAULT;
			case Subset0268Package.DOCUMENT_ROOT__LIST:
				return getList() != null;
			case Subset0268Package.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case Subset0268Package.DOCUMENT_ROOT__PACKET:
				return getPacket() != null;
			case Subset0268Package.DOCUMENT_ROOT__PACKET_NUMBER:
				return PACKET_NUMBER_EDEFAULT == null ? getPacketNumber() != null : !PACKET_NUMBER_EDEFAULT.equals(getPacketNumber());
			case Subset0268Package.DOCUMENT_ROOT__PACKETS:
				return getPackets() != null;
			case Subset0268Package.DOCUMENT_ROOT__PARCEL:
				return getParcel() != null;
			case Subset0268Package.DOCUMENT_ROOT__TLG_VAR:
				return getTlgVar() != null;
			case Subset0268Package.DOCUMENT_ROOT__TRACK_TO_TRAIN:
				return getTrackToTrain() != null;
			case Subset0268Package.DOCUMENT_ROOT__TRAIN_TO_TRACK:
				return getTrainToTrack() != null;
			case Subset0268Package.DOCUMENT_ROOT__TRANSMISSION_MEDIA:
				return getTransmissionMedia() != TRANSMISSION_MEDIA_EDEFAULT;
			case Subset0268Package.DOCUMENT_ROOT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
