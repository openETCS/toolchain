/**
 */
package Subset0267.impl;

import Subset0267.DocumentRoot;
import Subset0267.ListType;
import Subset0267.SpecialType;
import Subset0267.SpecsType;
import Subset0267.Subset0267Package;
import Subset0267.TBothWays;
import Subset0267.TConditional;
import Subset0267.TContent;
import Subset0267.TDefinitions;
import Subset0267.TIDNumber;
import Subset0267.TLength;
import Subset0267.TLoopDoWhile;
import Subset0267.TLoopWhile;
import Subset0267.TPacket;
import Subset0267.TPackets;
import Subset0267.TTlgVar;
import Subset0267.TTrackToTrain;
import Subset0267.TTrainToTrack;
import Subset0267.TTransmissionMedia;
import Subset0267.TVariable;
import Subset0267.TVariables;

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
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getBothWays <em>Both Ways</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getContent <em>Content</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getDetailedName <em>Detailed Name</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getIDNumber <em>ID Number</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getLoopDoWhile <em>Loop Do While</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getLoopWhile <em>Loop While</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getPacket <em>Packet</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getPackets <em>Packets</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getSpecial <em>Special</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getSpecs <em>Specs</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getTlgVar <em>Tlg Var</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getTrackToTrain <em>Track To Train</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getTrainToTrack <em>Train To Track</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getTransmissionMedia <em>Transmission Media</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link Subset0267.impl.DocumentRootImpl#getVariables <em>Variables</em>}</li>
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
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

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
	protected static final TIDNumber ID_NUMBER_EDEFAULT = TIDNumber._0;

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
	protected static final String NAME_EDEFAULT = "N_ITER";

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
		return Subset0267Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Subset0267Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Subset0267Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Subset0267Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBothWays getBothWays() {
		return (TBothWays)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__BOTH_WAYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBothWays(TBothWays newBothWays, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__BOTH_WAYS, newBothWays, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBothWays(TBothWays newBothWays) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__BOTH_WAYS, newBothWays);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return (String)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConditional getConditional() {
		return (TConditional)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__CONDITIONAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditional(TConditional newConditional, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__CONDITIONAL, newConditional, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditional(TConditional newConditional) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__CONDITIONAL, newConditional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TContent getContent() {
		return (TContent)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(TContent newContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__CONTENT, newContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(TContent newContent) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDefinitions getDefinitions() {
		return (TDefinitions)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__DEFINITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(TDefinitions newDefinitions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__DEFINITIONS, newDefinitions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitions(TDefinitions newDefinitions) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__DEFINITIONS, newDefinitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailedName() {
		return (String)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__DETAILED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailedName(String newDetailedName) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__DETAILED_NAME, newDetailedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIDNumber getIDNumber() {
		return (TIDNumber)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__ID_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIDNumber(TIDNumber newIDNumber) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__ID_NUMBER, newIDNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLength getLength() {
		return (TLength)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(TLength newLength) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType getList() {
		return (ListType)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(ListType newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__LIST, newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(ListType newList) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__LIST, newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLoopDoWhile getLoopDoWhile() {
		return (TLoopDoWhile)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__LOOP_DO_WHILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopDoWhile(TLoopDoWhile newLoopDoWhile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__LOOP_DO_WHILE, newLoopDoWhile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopDoWhile(TLoopDoWhile newLoopDoWhile) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__LOOP_DO_WHILE, newLoopDoWhile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLoopWhile getLoopWhile() {
		return (TLoopWhile)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__LOOP_WHILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopWhile(TLoopWhile newLoopWhile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__LOOP_WHILE, newLoopWhile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopWhile(TLoopWhile newLoopWhile) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__LOOP_WHILE, newLoopWhile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPacket getPacket() {
		return (TPacket)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__PACKET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPacket(TPacket newPacket, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__PACKET, newPacket, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacket(TPacket newPacket) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__PACKET, newPacket);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackets getPackets() {
		return (TPackets)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__PACKETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackets(TPackets newPackets, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__PACKETS, newPackets, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackets(TPackets newPackets) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__PACKETS, newPackets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialType getSpecial() {
		return (SpecialType)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__SPECIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecial(SpecialType newSpecial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__SPECIAL, newSpecial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecial(SpecialType newSpecial) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__SPECIAL, newSpecial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecsType getSpecs() {
		return (SpecsType)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__SPECS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecs(SpecsType newSpecs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__SPECS, newSpecs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecs(SpecsType newSpecs) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__SPECS, newSpecs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTlgVar getTlgVar() {
		return (TTlgVar)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__TLG_VAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTlgVar(TTlgVar newTlgVar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__TLG_VAR, newTlgVar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTlgVar(TTlgVar newTlgVar) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__TLG_VAR, newTlgVar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrackToTrain getTrackToTrain() {
		return (TTrackToTrain)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__TRACK_TO_TRAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackToTrain(TTrackToTrain newTrackToTrain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__TRACK_TO_TRAIN, newTrackToTrain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackToTrain(TTrackToTrain newTrackToTrain) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__TRACK_TO_TRAIN, newTrackToTrain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTrainToTrack getTrainToTrack() {
		return (TTrainToTrack)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__TRAIN_TO_TRACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrainToTrack(TTrainToTrack newTrainToTrack, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__TRAIN_TO_TRACK, newTrainToTrack, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainToTrack(TTrainToTrack newTrainToTrack) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__TRAIN_TO_TRACK, newTrainToTrack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransmissionMedia getTransmissionMedia() {
		return (TTransmissionMedia)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__TRANSMISSION_MEDIA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionMedia(TTransmissionMedia newTransmissionMedia) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__TRANSMISSION_MEDIA, newTransmissionMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVariable getVariable() {
		return (TVariable)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__VARIABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(TVariable newVariable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__VARIABLE, newVariable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(TVariable newVariable) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__VARIABLE, newVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVariables getVariables() {
		return (TVariables)getMixed().get(Subset0267Package.Literals.DOCUMENT_ROOT__VARIABLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariables(TVariables newVariables, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Subset0267Package.Literals.DOCUMENT_ROOT__VARIABLES, newVariables, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariables(TVariables newVariables) {
		((FeatureMap.Internal)getMixed()).set(Subset0267Package.Literals.DOCUMENT_ROOT__VARIABLES, newVariables);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0267Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Subset0267Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Subset0267Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Subset0267Package.DOCUMENT_ROOT__BOTH_WAYS:
				return basicSetBothWays(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__CONDITIONAL:
				return basicSetConditional(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__CONTENT:
				return basicSetContent(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__LIST:
				return basicSetList(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__LOOP_DO_WHILE:
				return basicSetLoopDoWhile(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__LOOP_WHILE:
				return basicSetLoopWhile(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__PACKET:
				return basicSetPacket(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__PACKETS:
				return basicSetPackets(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__SPECIAL:
				return basicSetSpecial(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__SPECS:
				return basicSetSpecs(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__TLG_VAR:
				return basicSetTlgVar(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__TRACK_TO_TRAIN:
				return basicSetTrackToTrain(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__TRAIN_TO_TRACK:
				return basicSetTrainToTrack(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__VARIABLE:
				return basicSetVariable(null, msgs);
			case Subset0267Package.DOCUMENT_ROOT__VARIABLES:
				return basicSetVariables(null, msgs);
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
			case Subset0267Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Subset0267Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Subset0267Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Subset0267Package.DOCUMENT_ROOT__BOTH_WAYS:
				return getBothWays();
			case Subset0267Package.DOCUMENT_ROOT__COMMENT:
				return getComment();
			case Subset0267Package.DOCUMENT_ROOT__CONDITION:
				return getCondition();
			case Subset0267Package.DOCUMENT_ROOT__CONDITIONAL:
				return getConditional();
			case Subset0267Package.DOCUMENT_ROOT__CONTENT:
				return getContent();
			case Subset0267Package.DOCUMENT_ROOT__DEFINITIONS:
				return getDefinitions();
			case Subset0267Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case Subset0267Package.DOCUMENT_ROOT__DETAILED_NAME:
				return getDetailedName();
			case Subset0267Package.DOCUMENT_ROOT__ID_NUMBER:
				return getIDNumber();
			case Subset0267Package.DOCUMENT_ROOT__LENGTH:
				return getLength();
			case Subset0267Package.DOCUMENT_ROOT__LIST:
				return getList();
			case Subset0267Package.DOCUMENT_ROOT__LOOP_DO_WHILE:
				return getLoopDoWhile();
			case Subset0267Package.DOCUMENT_ROOT__LOOP_WHILE:
				return getLoopWhile();
			case Subset0267Package.DOCUMENT_ROOT__NAME:
				return getName();
			case Subset0267Package.DOCUMENT_ROOT__PACKET:
				return getPacket();
			case Subset0267Package.DOCUMENT_ROOT__PACKETS:
				return getPackets();
			case Subset0267Package.DOCUMENT_ROOT__SPECIAL:
				return getSpecial();
			case Subset0267Package.DOCUMENT_ROOT__SPECS:
				return getSpecs();
			case Subset0267Package.DOCUMENT_ROOT__TLG_VAR:
				return getTlgVar();
			case Subset0267Package.DOCUMENT_ROOT__TRACK_TO_TRAIN:
				return getTrackToTrain();
			case Subset0267Package.DOCUMENT_ROOT__TRAIN_TO_TRACK:
				return getTrainToTrack();
			case Subset0267Package.DOCUMENT_ROOT__TRANSMISSION_MEDIA:
				return getTransmissionMedia();
			case Subset0267Package.DOCUMENT_ROOT__VALUE:
				return getValue();
			case Subset0267Package.DOCUMENT_ROOT__VARIABLE:
				return getVariable();
			case Subset0267Package.DOCUMENT_ROOT__VARIABLES:
				return getVariables();
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
			case Subset0267Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__BOTH_WAYS:
				setBothWays((TBothWays)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__COMMENT:
				setComment((String)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__CONDITION:
				setCondition((String)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__CONDITIONAL:
				setConditional((TConditional)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__CONTENT:
				setContent((TContent)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__DEFINITIONS:
				setDefinitions((TDefinitions)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__DETAILED_NAME:
				setDetailedName((String)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__ID_NUMBER:
				setIDNumber((TIDNumber)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__LENGTH:
				setLength((TLength)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__LIST:
				setList((ListType)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__LOOP_DO_WHILE:
				setLoopDoWhile((TLoopDoWhile)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__LOOP_WHILE:
				setLoopWhile((TLoopWhile)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__PACKET:
				setPacket((TPacket)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__PACKETS:
				setPackets((TPackets)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__SPECIAL:
				setSpecial((SpecialType)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__SPECS:
				setSpecs((SpecsType)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__TLG_VAR:
				setTlgVar((TTlgVar)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__TRACK_TO_TRAIN:
				setTrackToTrain((TTrackToTrain)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__TRAIN_TO_TRACK:
				setTrainToTrack((TTrainToTrack)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__TRANSMISSION_MEDIA:
				setTransmissionMedia((TTransmissionMedia)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__VALUE:
				setValue((String)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__VARIABLE:
				setVariable((TVariable)newValue);
				return;
			case Subset0267Package.DOCUMENT_ROOT__VARIABLES:
				setVariables((TVariables)newValue);
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
			case Subset0267Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Subset0267Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Subset0267Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Subset0267Package.DOCUMENT_ROOT__BOTH_WAYS:
				setBothWays((TBothWays)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Subset0267Package.DOCUMENT_ROOT__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case Subset0267Package.DOCUMENT_ROOT__CONDITIONAL:
				setConditional((TConditional)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__CONTENT:
				setContent((TContent)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__DEFINITIONS:
				setDefinitions((TDefinitions)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Subset0267Package.DOCUMENT_ROOT__DETAILED_NAME:
				setDetailedName(DETAILED_NAME_EDEFAULT);
				return;
			case Subset0267Package.DOCUMENT_ROOT__ID_NUMBER:
				setIDNumber(ID_NUMBER_EDEFAULT);
				return;
			case Subset0267Package.DOCUMENT_ROOT__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case Subset0267Package.DOCUMENT_ROOT__LIST:
				setList((ListType)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__LOOP_DO_WHILE:
				setLoopDoWhile((TLoopDoWhile)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__LOOP_WHILE:
				setLoopWhile((TLoopWhile)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Subset0267Package.DOCUMENT_ROOT__PACKET:
				setPacket((TPacket)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__PACKETS:
				setPackets((TPackets)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__SPECIAL:
				setSpecial((SpecialType)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__SPECS:
				setSpecs((SpecsType)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__TLG_VAR:
				setTlgVar((TTlgVar)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__TRACK_TO_TRAIN:
				setTrackToTrain((TTrackToTrain)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__TRAIN_TO_TRACK:
				setTrainToTrack((TTrainToTrack)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__TRANSMISSION_MEDIA:
				setTransmissionMedia(TRANSMISSION_MEDIA_EDEFAULT);
				return;
			case Subset0267Package.DOCUMENT_ROOT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Subset0267Package.DOCUMENT_ROOT__VARIABLE:
				setVariable((TVariable)null);
				return;
			case Subset0267Package.DOCUMENT_ROOT__VARIABLES:
				setVariables((TVariables)null);
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
			case Subset0267Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Subset0267Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Subset0267Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Subset0267Package.DOCUMENT_ROOT__BOTH_WAYS:
				return getBothWays() != null;
			case Subset0267Package.DOCUMENT_ROOT__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case Subset0267Package.DOCUMENT_ROOT__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
			case Subset0267Package.DOCUMENT_ROOT__CONDITIONAL:
				return getConditional() != null;
			case Subset0267Package.DOCUMENT_ROOT__CONTENT:
				return getContent() != null;
			case Subset0267Package.DOCUMENT_ROOT__DEFINITIONS:
				return getDefinitions() != null;
			case Subset0267Package.DOCUMENT_ROOT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case Subset0267Package.DOCUMENT_ROOT__DETAILED_NAME:
				return DETAILED_NAME_EDEFAULT == null ? getDetailedName() != null : !DETAILED_NAME_EDEFAULT.equals(getDetailedName());
			case Subset0267Package.DOCUMENT_ROOT__ID_NUMBER:
				return getIDNumber() != ID_NUMBER_EDEFAULT;
			case Subset0267Package.DOCUMENT_ROOT__LENGTH:
				return getLength() != LENGTH_EDEFAULT;
			case Subset0267Package.DOCUMENT_ROOT__LIST:
				return getList() != null;
			case Subset0267Package.DOCUMENT_ROOT__LOOP_DO_WHILE:
				return getLoopDoWhile() != null;
			case Subset0267Package.DOCUMENT_ROOT__LOOP_WHILE:
				return getLoopWhile() != null;
			case Subset0267Package.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case Subset0267Package.DOCUMENT_ROOT__PACKET:
				return getPacket() != null;
			case Subset0267Package.DOCUMENT_ROOT__PACKETS:
				return getPackets() != null;
			case Subset0267Package.DOCUMENT_ROOT__SPECIAL:
				return getSpecial() != null;
			case Subset0267Package.DOCUMENT_ROOT__SPECS:
				return getSpecs() != null;
			case Subset0267Package.DOCUMENT_ROOT__TLG_VAR:
				return getTlgVar() != null;
			case Subset0267Package.DOCUMENT_ROOT__TRACK_TO_TRAIN:
				return getTrackToTrain() != null;
			case Subset0267Package.DOCUMENT_ROOT__TRAIN_TO_TRACK:
				return getTrainToTrack() != null;
			case Subset0267Package.DOCUMENT_ROOT__TRANSMISSION_MEDIA:
				return getTransmissionMedia() != TRANSMISSION_MEDIA_EDEFAULT;
			case Subset0267Package.DOCUMENT_ROOT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case Subset0267Package.DOCUMENT_ROOT__VARIABLE:
				return getVariable() != null;
			case Subset0267Package.DOCUMENT_ROOT__VARIABLES:
				return getVariables() != null;
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
