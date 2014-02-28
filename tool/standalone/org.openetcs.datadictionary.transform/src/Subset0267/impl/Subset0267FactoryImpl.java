/**
 */
package Subset0267.impl;

import Subset0267.*;

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
public class Subset0267FactoryImpl extends EFactoryImpl implements Subset0267Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Subset0267Factory init() {
		try {
			Subset0267Factory theSubset0267Factory = (Subset0267Factory)EPackage.Registry.INSTANCE.getEFactory(Subset0267Package.eNS_URI);
			if (theSubset0267Factory != null) {
				return theSubset0267Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Subset0267FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset0267FactoryImpl() {
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
			case Subset0267Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Subset0267Package.LIST_TYPE: return createListType();
			case Subset0267Package.SPECIAL_TYPE: return createSpecialType();
			case Subset0267Package.SPECS_TYPE: return createSpecsType();
			case Subset0267Package.TBOTH_WAYS: return createTBothWays();
			case Subset0267Package.TCONDITIONAL: return createTConditional();
			case Subset0267Package.TCONTENT: return createTContent();
			case Subset0267Package.TDEFINITIONS: return createTDefinitions();
			case Subset0267Package.TLOOP_DO_WHILE: return createTLoopDoWhile();
			case Subset0267Package.TLOOP_WHILE: return createTLoopWhile();
			case Subset0267Package.TPACKET: return createTPacket();
			case Subset0267Package.TPACKETS: return createTPackets();
			case Subset0267Package.TTLG_VAR: return createTTlgVar();
			case Subset0267Package.TTRACK_TO_TRAIN: return createTTrackToTrain();
			case Subset0267Package.TTRAIN_TO_TRACK: return createTTrainToTrack();
			case Subset0267Package.TVARDEF_VAR: return createTVardefVar();
			case Subset0267Package.TVARIABLE: return createTVariable();
			case Subset0267Package.TVARIABLES: return createTVariables();
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
			case Subset0267Package.TFORMULA:
				return createTFormulaFromString(eDataType, initialValue);
			case Subset0267Package.TID_NUMBER:
				return createTIDNumberFromString(eDataType, initialValue);
			case Subset0267Package.TLENGTH:
				return createTLengthFromString(eDataType, initialValue);
			case Subset0267Package.TMAX_VAL:
				return createTMaxValFromString(eDataType, initialValue);
			case Subset0267Package.TMIN_VAL:
				return createTMinValFromString(eDataType, initialValue);
			case Subset0267Package.TTRANSMISSION_MEDIA:
				return createTTransmissionMediaFromString(eDataType, initialValue);
			case Subset0267Package.TVALUE:
				return createTValueFromString(eDataType, initialValue);
			case Subset0267Package.TVAR_LEN:
				return createTVarLenFromString(eDataType, initialValue);
			case Subset0267Package.TFORMULA_OBJECT:
				return createTFormulaObjectFromString(eDataType, initialValue);
			case Subset0267Package.TID_NUMBER_OBJECT:
				return createTIDNumberObjectFromString(eDataType, initialValue);
			case Subset0267Package.TLENGTH_OBJECT:
				return createTLengthObjectFromString(eDataType, initialValue);
			case Subset0267Package.TMAX_VAL_OBJECT:
				return createTMaxValObjectFromString(eDataType, initialValue);
			case Subset0267Package.TMIN_VAL_OBJECT:
				return createTMinValObjectFromString(eDataType, initialValue);
			case Subset0267Package.TTRANSMISSION_MEDIA_OBJECT:
				return createTTransmissionMediaObjectFromString(eDataType, initialValue);
			case Subset0267Package.TVALUE_OBJECT:
				return createTValueObjectFromString(eDataType, initialValue);
			case Subset0267Package.TVAR_LEN_OBJECT:
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
			case Subset0267Package.TFORMULA:
				return convertTFormulaToString(eDataType, instanceValue);
			case Subset0267Package.TID_NUMBER:
				return convertTIDNumberToString(eDataType, instanceValue);
			case Subset0267Package.TLENGTH:
				return convertTLengthToString(eDataType, instanceValue);
			case Subset0267Package.TMAX_VAL:
				return convertTMaxValToString(eDataType, instanceValue);
			case Subset0267Package.TMIN_VAL:
				return convertTMinValToString(eDataType, instanceValue);
			case Subset0267Package.TTRANSMISSION_MEDIA:
				return convertTTransmissionMediaToString(eDataType, instanceValue);
			case Subset0267Package.TVALUE:
				return convertTValueToString(eDataType, instanceValue);
			case Subset0267Package.TVAR_LEN:
				return convertTVarLenToString(eDataType, instanceValue);
			case Subset0267Package.TFORMULA_OBJECT:
				return convertTFormulaObjectToString(eDataType, instanceValue);
			case Subset0267Package.TID_NUMBER_OBJECT:
				return convertTIDNumberObjectToString(eDataType, instanceValue);
			case Subset0267Package.TLENGTH_OBJECT:
				return convertTLengthObjectToString(eDataType, instanceValue);
			case Subset0267Package.TMAX_VAL_OBJECT:
				return convertTMaxValObjectToString(eDataType, instanceValue);
			case Subset0267Package.TMIN_VAL_OBJECT:
				return convertTMinValObjectToString(eDataType, instanceValue);
			case Subset0267Package.TTRANSMISSION_MEDIA_OBJECT:
				return convertTTransmissionMediaObjectToString(eDataType, instanceValue);
			case Subset0267Package.TVALUE_OBJECT:
				return convertTValueObjectToString(eDataType, instanceValue);
			case Subset0267Package.TVAR_LEN_OBJECT:
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
	public SpecialType createSpecialType() {
		SpecialTypeImpl specialType = new SpecialTypeImpl();
		return specialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecsType createSpecsType() {
		SpecsTypeImpl specsType = new SpecsTypeImpl();
		return specsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBothWays createTBothWays() {
		TBothWaysImpl tBothWays = new TBothWaysImpl();
		return tBothWays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConditional createTConditional() {
		TConditionalImpl tConditional = new TConditionalImpl();
		return tConditional;
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
	public TLoopDoWhile createTLoopDoWhile() {
		TLoopDoWhileImpl tLoopDoWhile = new TLoopDoWhileImpl();
		return tLoopDoWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLoopWhile createTLoopWhile() {
		TLoopWhileImpl tLoopWhile = new TLoopWhileImpl();
		return tLoopWhile;
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
	public TVardefVar createTVardefVar() {
		TVardefVarImpl tVardefVar = new TVardefVarImpl();
		return tVardefVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVariable createTVariable() {
		TVariableImpl tVariable = new TVariableImpl();
		return tVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVariables createTVariables() {
		TVariablesImpl tVariables = new TVariablesImpl();
		return tVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFormula createTFormulaFromString(EDataType eDataType, String initialValue) {
		TFormula result = TFormula.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFormulaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIDNumber createTIDNumberFromString(EDataType eDataType, String initialValue) {
		TIDNumber result = TIDNumber.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTIDNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public TMaxVal createTMaxValFromString(EDataType eDataType, String initialValue) {
		TMaxVal result = TMaxVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMaxValToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMinVal createTMinValFromString(EDataType eDataType, String initialValue) {
		TMinVal result = TMinVal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMinValToString(EDataType eDataType, Object instanceValue) {
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
	public TValue createTValueFromString(EDataType eDataType, String initialValue) {
		TValue result = TValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTValueToString(EDataType eDataType, Object instanceValue) {
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
	public TFormula createTFormulaObjectFromString(EDataType eDataType, String initialValue) {
		return createTFormulaFromString(Subset0267Package.Literals.TFORMULA, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFormulaObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTFormulaToString(Subset0267Package.Literals.TFORMULA, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIDNumber createTIDNumberObjectFromString(EDataType eDataType, String initialValue) {
		return createTIDNumberFromString(Subset0267Package.Literals.TID_NUMBER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTIDNumberObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTIDNumberToString(Subset0267Package.Literals.TID_NUMBER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLength createTLengthObjectFromString(EDataType eDataType, String initialValue) {
		return createTLengthFromString(Subset0267Package.Literals.TLENGTH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTLengthObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTLengthToString(Subset0267Package.Literals.TLENGTH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMaxVal createTMaxValObjectFromString(EDataType eDataType, String initialValue) {
		return createTMaxValFromString(Subset0267Package.Literals.TMAX_VAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMaxValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTMaxValToString(Subset0267Package.Literals.TMAX_VAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMinVal createTMinValObjectFromString(EDataType eDataType, String initialValue) {
		return createTMinValFromString(Subset0267Package.Literals.TMIN_VAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMinValObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTMinValToString(Subset0267Package.Literals.TMIN_VAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransmissionMedia createTTransmissionMediaObjectFromString(EDataType eDataType, String initialValue) {
		return createTTransmissionMediaFromString(Subset0267Package.Literals.TTRANSMISSION_MEDIA, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTransmissionMediaObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTTransmissionMediaToString(Subset0267Package.Literals.TTRANSMISSION_MEDIA, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TValue createTValueObjectFromString(EDataType eDataType, String initialValue) {
		return createTValueFromString(Subset0267Package.Literals.TVALUE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTValueObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTValueToString(Subset0267Package.Literals.TVALUE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TVarLen createTVarLenObjectFromString(EDataType eDataType, String initialValue) {
		return createTVarLenFromString(Subset0267Package.Literals.TVAR_LEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTVarLenObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTVarLenToString(Subset0267Package.Literals.TVAR_LEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset0267Package getSubset0267Package() {
		return (Subset0267Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Subset0267Package getPackage() {
		return Subset0267Package.eINSTANCE;
	}

} //Subset0267FactoryImpl
