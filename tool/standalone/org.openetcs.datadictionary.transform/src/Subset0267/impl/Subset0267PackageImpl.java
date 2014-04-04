/**
 */
package Subset0267.impl;

import Subset0267.DocumentRoot;
import Subset0267.ListType;
import Subset0267.SpecialType;
import Subset0267.SpecsType;
import Subset0267.Subset0267Factory;
import Subset0267.Subset0267Package;
import Subset0267.TBothWays;
import Subset0267.TConditional;
import Subset0267.TContent;
import Subset0267.TDefinitions;
import Subset0267.TFormula;
import Subset0267.TIDNumber;
import Subset0267.TLength;
import Subset0267.TLoopDoWhile;
import Subset0267.TLoopWhile;
import Subset0267.TMaxVal;
import Subset0267.TMinVal;
import Subset0267.TPacket;
import Subset0267.TPackets;
import Subset0267.TTlgVar;
import Subset0267.TTrackToTrain;
import Subset0267.TTrainToTrack;
import Subset0267.TTransmissionMedia;
import Subset0267.TValue;
import Subset0267.TVarLen;
import Subset0267.TVardefVar;
import Subset0267.TVariable;
import Subset0267.TVariables;

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
public class Subset0267PackageImpl extends EPackageImpl implements Subset0267Package {
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
	private EClass specialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBothWaysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConditionalEClass = null;

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
	private EClass tLoopDoWhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tLoopWhileEClass = null;

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
	private EClass tVardefVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tVariablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tFormulaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tidNumberEEnum = null;

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
	private EEnum tMaxValEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tMinValEEnum = null;

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
	private EEnum tValueEEnum = null;

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
	private EDataType tFormulaObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tidNumberObjectEDataType = null;

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
	private EDataType tMaxValObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tMinValObjectEDataType = null;

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
	private EDataType tValueObjectEDataType = null;

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
	 * @see Subset0267.Subset0267Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Subset0267PackageImpl() {
		super(eNS_URI, Subset0267Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Subset0267Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Subset0267Package init() {
		if (isInited) return (Subset0267Package)EPackage.Registry.INSTANCE.getEPackage(Subset0267Package.eNS_URI);

		// Obtain or create and register package
		Subset0267PackageImpl theSubset0267Package = (Subset0267PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Subset0267PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Subset0267PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSubset0267Package.createPackageContents();

		// Initialize created meta-data
		theSubset0267Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubset0267Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Subset0267Package.eNS_URI, theSubset0267Package);
		return theSubset0267Package;
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
	public EReference getDocumentRoot_BothWays() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Comment() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Condition() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Conditional() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Content() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Definitions() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Description() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DetailedName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IDNumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Length() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_List() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LoopDoWhile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LoopWhile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Name() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Packet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Packets() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Special() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Specs() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TlgVar() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TrackToTrain() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TrainToTrack() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransmissionMedia() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Value() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Variable() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Variables() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
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
	public EAttribute getListType_Name() {
		return (EAttribute)listTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListType_Number() {
		return (EAttribute)listTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialType() {
		return specialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialType_Description() {
		return (EAttribute)specialTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialType_Value() {
		return (EAttribute)specialTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecsType() {
		return specsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecsType_Group() {
		return (EAttribute)specsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecsType_Special() {
		return (EReference)specsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecsType_Formula() {
		return (EAttribute)specsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecsType_Length() {
		return (EAttribute)specsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecsType_MaxVal() {
		return (EAttribute)specsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecsType_MinVal() {
		return (EAttribute)specsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBothWays() {
		return tBothWaysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBothWays_List() {
		return (EReference)tBothWaysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBothWays_Packet() {
		return (EReference)tBothWaysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTConditional() {
		return tConditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTConditional_Group() {
		return (EAttribute)tConditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTConditional_Condition() {
		return (EAttribute)tConditionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTConditional_Variables() {
		return (EReference)tConditionalEClass.getEStructuralFeatures().get(2);
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
	public EReference getTContent_LoopDoWhile() {
		return (EReference)tContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTContent_LoopWhile() {
		return (EReference)tContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTContent_Conditional() {
		return (EReference)tContentEClass.getEStructuralFeatures().get(4);
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
	public EReference getTDefinitions_VarDef() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLoopDoWhile() {
		return tLoopDoWhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLoopDoWhile_Group() {
		return (EAttribute)tLoopDoWhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLoopDoWhile_TlgVar() {
		return (EReference)tLoopDoWhileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLoopDoWhile_Conditional() {
		return (EReference)tLoopDoWhileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLoopDoWhile_LoopWhile() {
		return (EReference)tLoopDoWhileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLoopWhile() {
		return tLoopWhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLoopWhile_Group() {
		return (EAttribute)tLoopWhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLoopWhile_TlgVar() {
		return (EReference)tLoopWhileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLoopWhile_Conditional() {
		return (EReference)tLoopWhileEClass.getEStructuralFeatures().get(2);
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
	public EReference getTPackets_TrackToTrain() {
		return (EReference)tPacketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackets_TrainToTrack() {
		return (EReference)tPacketsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPackets_BothWays() {
		return (EReference)tPacketsEClass.getEStructuralFeatures().get(2);
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
	public EClass getTVardefVar() {
		return tVardefVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTVardefVar_Group() {
		return (EAttribute)tVardefVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTVardefVar_Variable() {
		return (EReference)tVardefVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTVariable() {
		return tVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTVariable_DetailedName() {
		return (EAttribute)tVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTVariable_Description() {
		return (EAttribute)tVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTVariable_Specs() {
		return (EReference)tVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTVariable_Name() {
		return (EAttribute)tVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTVariables() {
		return tVariablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTVariables_Group() {
		return (EAttribute)tVariablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTVariables_LoopDoWhile() {
		return (EReference)tVariablesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTVariables_LoopWhile() {
		return (EReference)tVariablesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTVariables_TlgVar() {
		return (EReference)tVariablesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTVariables_Conditional() {
		return (EReference)tVariablesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTFormula() {
		return tFormulaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTIDNumber() {
		return tidNumberEEnum;
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
	public EEnum getTMaxVal() {
		return tMaxValEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMinVal() {
		return tMinValEEnum;
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
	public EEnum getTValue() {
		return tValueEEnum;
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
	public EDataType getTFormulaObject() {
		return tFormulaObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTIDNumberObject() {
		return tidNumberObjectEDataType;
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
	public EDataType getTMaxValObject() {
		return tMaxValObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTMinValObject() {
		return tMinValObjectEDataType;
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
	public EDataType getTValueObject() {
		return tValueObjectEDataType;
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
	public Subset0267Factory getSubset0267Factory() {
		return (Subset0267Factory)getEFactoryInstance();
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
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOTH_WAYS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COMMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONDITION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONDITIONAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEFINITIONS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DETAILED_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID_NUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LENGTH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOOP_DO_WHILE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOOP_WHILE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKETS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPECIAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPECS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TLG_VAR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRACK_TO_TRAIN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRAIN_TO_TRACK);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSMISSION_MEDIA);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VARIABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VARIABLES);

		listTypeEClass = createEClass(LIST_TYPE);
		createEAttribute(listTypeEClass, LIST_TYPE__NAME);
		createEAttribute(listTypeEClass, LIST_TYPE__NUMBER);

		specialTypeEClass = createEClass(SPECIAL_TYPE);
		createEAttribute(specialTypeEClass, SPECIAL_TYPE__DESCRIPTION);
		createEAttribute(specialTypeEClass, SPECIAL_TYPE__VALUE);

		specsTypeEClass = createEClass(SPECS_TYPE);
		createEAttribute(specsTypeEClass, SPECS_TYPE__GROUP);
		createEReference(specsTypeEClass, SPECS_TYPE__SPECIAL);
		createEAttribute(specsTypeEClass, SPECS_TYPE__FORMULA);
		createEAttribute(specsTypeEClass, SPECS_TYPE__LENGTH);
		createEAttribute(specsTypeEClass, SPECS_TYPE__MAX_VAL);
		createEAttribute(specsTypeEClass, SPECS_TYPE__MIN_VAL);

		tBothWaysEClass = createEClass(TBOTH_WAYS);
		createEReference(tBothWaysEClass, TBOTH_WAYS__LIST);
		createEReference(tBothWaysEClass, TBOTH_WAYS__PACKET);

		tConditionalEClass = createEClass(TCONDITIONAL);
		createEAttribute(tConditionalEClass, TCONDITIONAL__GROUP);
		createEAttribute(tConditionalEClass, TCONDITIONAL__CONDITION);
		createEReference(tConditionalEClass, TCONDITIONAL__VARIABLES);

		tContentEClass = createEClass(TCONTENT);
		createEAttribute(tContentEClass, TCONTENT__GROUP);
		createEReference(tContentEClass, TCONTENT__TLG_VAR);
		createEReference(tContentEClass, TCONTENT__LOOP_DO_WHILE);
		createEReference(tContentEClass, TCONTENT__LOOP_WHILE);
		createEReference(tContentEClass, TCONTENT__CONDITIONAL);

		tDefinitionsEClass = createEClass(TDEFINITIONS);
		createEReference(tDefinitionsEClass, TDEFINITIONS__PACKETS);
		createEReference(tDefinitionsEClass, TDEFINITIONS__VAR_DEF);

		tLoopDoWhileEClass = createEClass(TLOOP_DO_WHILE);
		createEAttribute(tLoopDoWhileEClass, TLOOP_DO_WHILE__GROUP);
		createEReference(tLoopDoWhileEClass, TLOOP_DO_WHILE__TLG_VAR);
		createEReference(tLoopDoWhileEClass, TLOOP_DO_WHILE__CONDITIONAL);
		createEReference(tLoopDoWhileEClass, TLOOP_DO_WHILE__LOOP_WHILE);

		tLoopWhileEClass = createEClass(TLOOP_WHILE);
		createEAttribute(tLoopWhileEClass, TLOOP_WHILE__GROUP);
		createEReference(tLoopWhileEClass, TLOOP_WHILE__TLG_VAR);
		createEReference(tLoopWhileEClass, TLOOP_WHILE__CONDITIONAL);

		tPacketEClass = createEClass(TPACKET);
		createEAttribute(tPacketEClass, TPACKET__DESCRIPTION);
		createEReference(tPacketEClass, TPACKET__CONTENT);
		createEAttribute(tPacketEClass, TPACKET__NAME);
		createEAttribute(tPacketEClass, TPACKET__NUMBER);
		createEAttribute(tPacketEClass, TPACKET__TRANSMISSION_MEDIA);

		tPacketsEClass = createEClass(TPACKETS);
		createEReference(tPacketsEClass, TPACKETS__TRACK_TO_TRAIN);
		createEReference(tPacketsEClass, TPACKETS__TRAIN_TO_TRACK);
		createEReference(tPacketsEClass, TPACKETS__BOTH_WAYS);

		tTlgVarEClass = createEClass(TTLG_VAR);
		createEAttribute(tTlgVarEClass, TTLG_VAR__COMMENT);
		createEAttribute(tTlgVarEClass, TTLG_VAR__LENGTH);
		createEAttribute(tTlgVarEClass, TTLG_VAR__NAME);

		tTrackToTrainEClass = createEClass(TTRACK_TO_TRAIN);
		createEReference(tTrackToTrainEClass, TTRACK_TO_TRAIN__LIST);
		createEReference(tTrackToTrainEClass, TTRACK_TO_TRAIN__PACKET);

		tTrainToTrackEClass = createEClass(TTRAIN_TO_TRACK);
		createEAttribute(tTrainToTrackEClass, TTRAIN_TO_TRACK__GROUP);
		createEReference(tTrainToTrackEClass, TTRAIN_TO_TRACK__LIST);
		createEReference(tTrainToTrackEClass, TTRAIN_TO_TRACK__PACKET);

		tVardefVarEClass = createEClass(TVARDEF_VAR);
		createEAttribute(tVardefVarEClass, TVARDEF_VAR__GROUP);
		createEReference(tVardefVarEClass, TVARDEF_VAR__VARIABLE);

		tVariableEClass = createEClass(TVARIABLE);
		createEAttribute(tVariableEClass, TVARIABLE__DETAILED_NAME);
		createEAttribute(tVariableEClass, TVARIABLE__DESCRIPTION);
		createEReference(tVariableEClass, TVARIABLE__SPECS);
		createEAttribute(tVariableEClass, TVARIABLE__NAME);

		tVariablesEClass = createEClass(TVARIABLES);
		createEAttribute(tVariablesEClass, TVARIABLES__GROUP);
		createEReference(tVariablesEClass, TVARIABLES__LOOP_DO_WHILE);
		createEReference(tVariablesEClass, TVARIABLES__LOOP_WHILE);
		createEReference(tVariablesEClass, TVARIABLES__TLG_VAR);
		createEReference(tVariablesEClass, TVARIABLES__CONDITIONAL);

		// Create enums
		tFormulaEEnum = createEEnum(TFORMULA);
		tidNumberEEnum = createEEnum(TID_NUMBER);
		tLengthEEnum = createEEnum(TLENGTH);
		tMaxValEEnum = createEEnum(TMAX_VAL);
		tMinValEEnum = createEEnum(TMIN_VAL);
		tTransmissionMediaEEnum = createEEnum(TTRANSMISSION_MEDIA);
		tValueEEnum = createEEnum(TVALUE);
		tVarLenEEnum = createEEnum(TVAR_LEN);

		// Create data types
		tFormulaObjectEDataType = createEDataType(TFORMULA_OBJECT);
		tidNumberObjectEDataType = createEDataType(TID_NUMBER_OBJECT);
		tLengthObjectEDataType = createEDataType(TLENGTH_OBJECT);
		tMaxValObjectEDataType = createEDataType(TMAX_VAL_OBJECT);
		tMinValObjectEDataType = createEDataType(TMIN_VAL_OBJECT);
		tTransmissionMediaObjectEDataType = createEDataType(TTRANSMISSION_MEDIA_OBJECT);
		tValueObjectEDataType = createEDataType(TVALUE_OBJECT);
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
		initEReference(getDocumentRoot_BothWays(), this.getTBothWays(), null, "bothWays", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Comment(), theXMLTypePackage.getString(), "comment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Condition(), theXMLTypePackage.getString(), "condition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Conditional(), this.getTConditional(), null, "conditional", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Content(), this.getTContent(), null, "content", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Definitions(), this.getTDefinitions(), null, "definitions", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Description(), theXMLTypePackage.getString(), "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DetailedName(), theXMLTypePackage.getString(), "detailedName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IDNumber(), this.getTIDNumber(), "iDNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Length(), this.getTLength(), "length", "5", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_List(), this.getListType(), null, "list", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LoopDoWhile(), this.getTLoopDoWhile(), null, "loopDoWhile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LoopWhile(), this.getTLoopWhile(), null, "loopWhile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Name(), theXMLTypePackage.getString(), "name", "N_ITER", 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Packet(), this.getTPacket(), null, "packet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Packets(), this.getTPackets(), null, "packets", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Special(), this.getSpecialType(), null, "special", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Specs(), this.getSpecsType(), null, "specs", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TlgVar(), this.getTTlgVar(), null, "tlgVar", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TrackToTrain(), this.getTTrackToTrain(), null, "trackToTrain", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TrainToTrack(), this.getTTrainToTrack(), null, "trainToTrack", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransmissionMedia(), this.getTTransmissionMedia(), "transmissionMedia", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Value(), theXMLTypePackage.getString(), "value", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Variable(), this.getTVariable(), null, "variable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Variables(), this.getTVariables(), null, "variables", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(listTypeEClass, ListType.class, "ListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListType_Number(), theXMLTypePackage.getInt(), "number", null, 1, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialTypeEClass, SpecialType.class, "SpecialType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, SpecialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialType_Value(), this.getTValue(), "value", null, 1, 1, SpecialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specsTypeEClass, SpecsType.class, "SpecsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SpecsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecsType_Special(), this.getSpecialType(), null, "special", null, 0, -1, SpecsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecsType_Formula(), this.getTFormula(), "formula", null, 0, 1, SpecsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecsType_Length(), this.getTVarLen(), "length", null, 1, 1, SpecsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecsType_MaxVal(), this.getTMaxVal(), "maxVal", null, 0, 1, SpecsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecsType_MinVal(), this.getTMinVal(), "minVal", null, 0, 1, SpecsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tBothWaysEClass, TBothWays.class, "TBothWays", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTBothWays_List(), this.getListType(), null, "list", null, 1, -1, TBothWays.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTBothWays_Packet(), this.getTPacket(), null, "packet", null, 1, 1, TBothWays.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tConditionalEClass, TConditional.class, "TConditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTConditional_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTConditional_Condition(), theXMLTypePackage.getString(), "condition", null, 1, -1, TConditional.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTConditional_Variables(), this.getTVariables(), null, "variables", null, 1, -1, TConditional.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tContentEClass, TContent.class, "TContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTContent_TlgVar(), this.getTTlgVar(), null, "tlgVar", null, 0, -1, TContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTContent_LoopDoWhile(), this.getTLoopDoWhile(), null, "loopDoWhile", null, 0, -1, TContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTContent_LoopWhile(), this.getTLoopWhile(), null, "loopWhile", null, 0, -1, TContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTContent_Conditional(), this.getTConditional(), null, "conditional", null, 0, -1, TContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tDefinitionsEClass, TDefinitions.class, "TDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDefinitions_Packets(), this.getTPackets(), null, "packets", null, 1, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_VarDef(), this.getTVardefVar(), null, "varDef", null, 1, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tLoopDoWhileEClass, TLoopDoWhile.class, "TLoopDoWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTLoopDoWhile_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TLoopDoWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLoopDoWhile_TlgVar(), this.getTTlgVar(), null, "tlgVar", null, 0, -1, TLoopDoWhile.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTLoopDoWhile_Conditional(), this.getTConditional(), null, "conditional", null, 0, -1, TLoopDoWhile.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTLoopDoWhile_LoopWhile(), this.getTLoopWhile(), null, "loopWhile", null, 0, -1, TLoopDoWhile.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tLoopWhileEClass, TLoopWhile.class, "TLoopWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTLoopWhile_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TLoopWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLoopWhile_TlgVar(), this.getTTlgVar(), null, "tlgVar", null, 0, -1, TLoopWhile.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTLoopWhile_Conditional(), this.getTConditional(), null, "conditional", null, 0, -1, TLoopWhile.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tPacketEClass, TPacket.class, "TPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTPacket_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, TPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPacket_Content(), this.getTContent(), null, "content", null, 1, 1, TPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPacket_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPacket_Number(), this.getTIDNumber(), "number", null, 1, 1, TPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPacket_TransmissionMedia(), this.getTTransmissionMedia(), "transmissionMedia", null, 1, 1, TPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPacketsEClass, TPackets.class, "TPackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPackets_TrackToTrain(), this.getTTrackToTrain(), null, "trackToTrain", null, 1, 1, TPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackets_TrainToTrack(), this.getTTrainToTrack(), null, "trainToTrack", null, 1, 1, TPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPackets_BothWays(), this.getTBothWays(), null, "bothWays", null, 1, 1, TPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTlgVarEClass, TTlgVar.class, "TTlgVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTlgVar_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, TTlgVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTlgVar_Length(), this.getTLength(), "length", null, 1, 1, TTlgVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTlgVar_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TTlgVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTrackToTrainEClass, TTrackToTrain.class, "TTrackToTrain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTTrackToTrain_List(), this.getListType(), null, "list", null, 1, -1, TTrackToTrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTTrackToTrain_Packet(), this.getTPacket(), null, "packet", null, 1, -1, TTrackToTrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTrainToTrackEClass, TTrainToTrack.class, "TTrainToTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTrainToTrack_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TTrainToTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTTrainToTrack_List(), this.getListType(), null, "list", null, 1, -1, TTrainToTrack.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTTrainToTrack_Packet(), this.getTPacket(), null, "packet", null, 1, -1, TTrainToTrack.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tVardefVarEClass, TVardefVar.class, "TVardefVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTVardefVar_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TVardefVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTVardefVar_Variable(), this.getTVariable(), null, "variable", null, 1, -1, TVardefVar.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tVariableEClass, TVariable.class, "TVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTVariable_DetailedName(), theXMLTypePackage.getString(), "detailedName", null, 1, 1, TVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTVariable_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, TVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTVariable_Specs(), this.getSpecsType(), null, "specs", null, 1, 1, TVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTVariable_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tVariablesEClass, TVariables.class, "TVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTVariables_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTVariables_LoopDoWhile(), this.getTLoopDoWhile(), null, "loopDoWhile", null, 0, -1, TVariables.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTVariables_LoopWhile(), this.getTLoopWhile(), null, "loopWhile", null, 0, -1, TVariables.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTVariables_TlgVar(), this.getTTlgVar(), null, "tlgVar", null, 0, -1, TVariables.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTVariables_Conditional(), this.getTConditional(), null, "conditional", null, 0, -1, TVariables.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tFormulaEEnum, TFormula.class, "TFormula");
		addEEnumLiteral(tFormulaEEnum, TFormula._002);
		addEEnumLiteral(tFormulaEEnum, TFormula._005);
		addEEnumLiteral(tFormulaEEnum, TFormula._05T);
		addEEnumLiteral(tFormulaEEnum, TFormula._005MS2);
		addEEnumLiteral(tFormulaEEnum, TFormula._1);
		addEEnumLiteral(tFormulaEEnum, TFormula._1BYTE);
		addEEnumLiteral(tFormulaEEnum, TFormula._1TEXT_STRING_ELEMENT);
		addEEnumLiteral(tFormulaEEnum, TFormula._1BIT);
		addEEnumLiteral(tFormulaEEnum, TFormula._1M);
		addEEnumLiteral(tFormulaEEnum, TFormula._1DAY);
		addEEnumLiteral(tFormulaEEnum, TFormula._1PER_MIL);
		addEEnumLiteral(tFormulaEEnum, TFormula._1PER_CENT);
		addEEnumLiteral(tFormulaEEnum, TFormula._10A);
		addEEnumLiteral(tFormulaEEnum, TFormula._10_CM1_MOR10_MDEPENDING_ON_QSCALE);
		addEEnumLiteral(tFormulaEEnum, TFormula._10_MS);
		addEEnumLiteral(tFormulaEEnum, TFormula._1S);
		addEEnumLiteral(tFormulaEEnum, TFormula._5KM_H);
		addEEnumLiteral(tFormulaEEnum, TFormula.BINARY_CODED_DECIMAL);
		addEEnumLiteral(tFormulaEEnum, TFormula.BITSET);
		addEEnumLiteral(tFormulaEEnum, TFormula.NUMBER);
		addEEnumLiteral(tFormulaEEnum, TFormula.NUMBERS);
		addEEnumLiteral(tFormulaEEnum, TFormula.INTEGERS);

		initEEnum(tidNumberEEnum, TIDNumber.class, "TIDNumber");
		addEEnumLiteral(tidNumberEEnum, TIDNumber._0);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._1);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._2);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._3);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._4);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._5);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._6);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._9);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._11);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._12);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._13);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._15);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._16);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._21);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._27);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._39);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._40);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._41);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._42);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._44);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._45);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._46);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._49);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._51);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._52);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._57);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._58);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._63);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._64);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._65);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._66);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._67);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._68);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._69);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._70);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._71);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._72);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._76);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._79);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._80);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._88);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._90);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._131);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._132);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._133);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._134);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._135);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._136);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._137);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._138);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._139);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._140);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._141);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._143);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._145);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._254);
		addEEnumLiteral(tidNumberEEnum, TIDNumber._255);

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

		initEEnum(tMaxValEEnum, TMaxVal.class, "TMaxVal");
		addEEnumLiteral(tMaxValEEnum, TMaxVal._);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._1);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._100);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._155);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._254);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._315MS2);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._14);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._15);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._31);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._63);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._63M);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._1022);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._1022S);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._1023);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._16382);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._16383);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._1048574M);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._253);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._2541);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._254S);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._254_PER_MIL);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._254_PER_CENT);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._255);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._255S);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._255_PER_MIL);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._255_PER_CENT);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._255_DAYS);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._327660_KM);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._327670_KM);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._32767M);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._40T);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._4095M);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._4294967294S);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._511);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._600_KM_H);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._8191);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._10000A);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._999999);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._9999999M);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._99999999);
		addEEnumLiteral(tMaxValEEnum, TMaxVal._9999999999999999);

		initEEnum(tMinValEEnum, TMinVal.class, "TMinVal");
		addEEnumLiteral(tMinValEEnum, TMinVal._327680_KM);
		addEEnumLiteral(tMinValEEnum, TMinVal._0);
		addEEnumLiteral(tMinValEEnum, TMinVal._00);
		addEEnumLiteral(tMinValEEnum, TMinVal._0CM);
		addEEnumLiteral(tMinValEEnum, TMinVal._0KM_H);
		addEEnumLiteral(tMinValEEnum, TMinVal._0M);
		addEEnumLiteral(tMinValEEnum, TMinVal._0S);
		addEEnumLiteral(tMinValEEnum, TMinVal._0MS2);
		addEEnumLiteral(tMinValEEnum, TMinVal._0SECONDS);
		addEEnumLiteral(tMinValEEnum, TMinVal._0A);
		addEEnumLiteral(tMinValEEnum, TMinVal._0T);
		addEEnumLiteral(tMinValEEnum, TMinVal._0327680_KM);

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

		initEEnum(tValueEEnum, TValue.class, "TValue");
		addEEnumLiteral(tValueEEnum, TValue._);
		addEEnumLiteral(tValueEEnum, TValue._1);
		addEEnumLiteral(tValueEEnum, TValue._0);
		addEEnumLiteral(tValueEEnum, TValue._11);
		addEEnumLiteral(tValueEEnum, TValue._2);
		addEEnumLiteral(tValueEEnum, TValue._3);
		addEEnumLiteral(tValueEEnum, TValue._4);
		addEEnumLiteral(tValueEEnum, TValue._5);
		addEEnumLiteral(tValueEEnum, TValue._5255);
		addEEnumLiteral(tValueEEnum, TValue._6);
		addEEnumLiteral(tValueEEnum, TValue._7);
		addEEnumLiteral(tValueEEnum, TValue._8);
		addEEnumLiteral(tValueEEnum, TValue._9);
		addEEnumLiteral(tValueEEnum, TValue._10);
		addEEnumLiteral(tValueEEnum, TValue._111);
		addEEnumLiteral(tValueEEnum, TValue._12);
		addEEnumLiteral(tValueEEnum, TValue._13);
		addEEnumLiteral(tValueEEnum, TValue._13127);
		addEEnumLiteral(tValueEEnum, TValue._14);
		addEEnumLiteral(tValueEEnum, TValue._15);
		addEEnumLiteral(tValueEEnum, TValue._16);
		addEEnumLiteral(tValueEEnum, TValue._17);
		addEEnumLiteral(tValueEEnum, TValue._18);
		addEEnumLiteral(tValueEEnum, TValue._19);
		addEEnumLiteral(tValueEEnum, TValue._20);
		addEEnumLiteral(tValueEEnum, TValue._21);
		addEEnumLiteral(tValueEEnum, TValue._22);
		addEEnumLiteral(tValueEEnum, TValue._23);
		addEEnumLiteral(tValueEEnum, TValue._24);
		addEEnumLiteral(tValueEEnum, TValue._25);
		addEEnumLiteral(tValueEEnum, TValue._26);
		addEEnumLiteral(tValueEEnum, TValue._27);
		addEEnumLiteral(tValueEEnum, TValue._28);
		addEEnumLiteral(tValueEEnum, TValue._29);
		addEEnumLiteral(tValueEEnum, TValue._30);
		addEEnumLiteral(tValueEEnum, TValue._31);
		addEEnumLiteral(tValueEEnum, TValue.AE);
		addEEnumLiteral(tValueEEnum, TValue.F);
		addEEnumLiteral(tValueEEnum, TValue._126);
		addEEnumLiteral(tValueEEnum, TValue._127);
		addEEnumLiteral(tValueEEnum, TValue._254);
		addEEnumLiteral(tValueEEnum, TValue._255);
		addEEnumLiteral(tValueEEnum, TValue._1023);
		addEEnumLiteral(tValueEEnum, TValue._16383);
		addEEnumLiteral(tValueEEnum, TValue._32767);
		addEEnumLiteral(tValueEEnum, TValue._16777215);
		addEEnumLiteral(tValueEEnum, TValue._4294967295);
		addEEnumLiteral(tValueEEnum, TValue._0126);
		addEEnumLiteral(tValueEEnum, TValue._2255);
		addEEnumLiteral(tValueEEnum, TValue._315);
		addEEnumLiteral(tValueEEnum, TValue._57);
		addEEnumLiteral(tValueEEnum, TValue._67);
		addEEnumLiteral(tValueEEnum, TValue._615);
		addEEnumLiteral(tValueEEnum, TValue._9255);
		addEEnumLiteral(tValueEEnum, TValue._1011);
		addEEnumLiteral(tValueEEnum, TValue._1015);
		addEEnumLiteral(tValueEEnum, TValue._1115);
		addEEnumLiteral(tValueEEnum, TValue._121125);
		addEEnumLiteral(tValueEEnum, TValue._121126);
		addEEnumLiteral(tValueEEnum, TValue._121127);
		addEEnumLiteral(tValueEEnum, TValue._127254);
		addEEnumLiteral(tValueEEnum, TValue._127255);
		addEEnumLiteral(tValueEEnum, TValue._105155);
		addEEnumLiteral(tValueEEnum, TValue._00);
		addEEnumLiteral(tValueEEnum, TValue._01);
		addEEnumLiteral(tValueEEnum, TValue._000);
		addEEnumLiteral(tValueEEnum, TValue._001);
		addEEnumLiteral(tValueEEnum, TValue._010);
		addEEnumLiteral(tValueEEnum, TValue._011);
		addEEnumLiteral(tValueEEnum, TValue._100);
		addEEnumLiteral(tValueEEnum, TValue._101);
		addEEnumLiteral(tValueEEnum, TValue._110);
		addEEnumLiteral(tValueEEnum, TValue._1111);
		addEEnumLiteral(tValueEEnum, TValue._0000);
		addEEnumLiteral(tValueEEnum, TValue._0001);
		addEEnumLiteral(tValueEEnum, TValue._0010);
		addEEnumLiteral(tValueEEnum, TValue._0011);
		addEEnumLiteral(tValueEEnum, TValue._0100);
		addEEnumLiteral(tValueEEnum, TValue._0101);
		addEEnumLiteral(tValueEEnum, TValue._0110);
		addEEnumLiteral(tValueEEnum, TValue._0111);
		addEEnumLiteral(tValueEEnum, TValue._1000);
		addEEnumLiteral(tValueEEnum, TValue._1001);
		addEEnumLiteral(tValueEEnum, TValue._1010);
		addEEnumLiteral(tValueEEnum, TValue._10111);
		addEEnumLiteral(tValueEEnum, TValue._1100);
		addEEnumLiteral(tValueEEnum, TValue._1101);
		addEEnumLiteral(tValueEEnum, TValue._1110);
		addEEnumLiteral(tValueEEnum, TValue._11111);
		addEEnumLiteral(tValueEEnum, TValue._0010000);
		addEEnumLiteral(tValueEEnum, TValue._0010001);
		addEEnumLiteral(tValueEEnum, TValue._0010010);
		addEEnumLiteral(tValueEEnum, TValue._0010011);
		addEEnumLiteral(tValueEEnum, TValue._0010100);
		addEEnumLiteral(tValueEEnum, TValue._0010101);
		addEEnumLiteral(tValueEEnum, TValue._0010110);
		addEEnumLiteral(tValueEEnum, TValue._0010111);
		addEEnumLiteral(tValueEEnum, TValue._0011000);
		addEEnumLiteral(tValueEEnum, TValue._0011001);
		addEEnumLiteral(tValueEEnum, TValue._0011010);
		addEEnumLiteral(tValueEEnum, TValue._0011011);
		addEEnumLiteral(tValueEEnum, TValue._0011100);
		addEEnumLiteral(tValueEEnum, TValue._0011101);
		addEEnumLiteral(tValueEEnum, TValue._0011110);
		addEEnumLiteral(tValueEEnum, TValue._0011111);
		addEEnumLiteral(tValueEEnum, TValue._0100000);
		addEEnumLiteral(tValueEEnum, TValue._0100001);
		addEEnumLiteral(tValueEEnum, TValue._1010001);
		addEEnumLiteral(tValueEEnum, TValue._1111101);
		addEEnumLiteral(tValueEEnum, TValue._1111110);
		addEEnumLiteral(tValueEEnum, TValue._1111111);
		addEEnumLiteral(tValueEEnum, TValue._11111111);
		addEEnumLiteral(tValueEEnum, TValue._111111111);
		addEEnumLiteral(tValueEEnum, TValue._011111);
		addEEnumLiteral(tValueEEnum, TValue._10011022);
		addEEnumLiteral(tValueEEnum, TValue._10111111);
		addEEnumLiteral(tValueEEnum, TValue._00100100011111);
		addEEnumLiteral(tValueEEnum, TValue._01000011111111);
		addEEnumLiteral(tValueEEnum, TValue._1XX_XXXX_XXXX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue._1XXX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue._1000000016777214);
		addEEnumLiteral(tValueEEnum, TValue.EXCEPTION_FFFFFFFF);
		addEEnumLiteral(tValueEEnum, TValue.FFFFFFFF);
		addEEnumLiteral(tValueEEnum, TValue.FFFFFFFFFFFFFFFF);
		addEEnumLiteral(tValueEEnum, TValue.VMAIN0_MEANS_TRIP_ORDER);
		addEEnumLiteral(tValueEEnum, TValue._1XXXX);
		addEEnumLiteral(tValueEEnum, TValue.X1XXX);
		addEEnumLiteral(tValueEEnum, TValue.XX1XX);
		addEEnumLiteral(tValueEEnum, TValue.XXX1X);
		addEEnumLiteral(tValueEEnum, TValue.XXXX1);
		addEEnumLiteral(tValueEEnum, TValue._000XXXX);
		addEEnumLiteral(tValueEEnum, TValue._00000000);
		addEEnumLiteral(tValueEEnum, TValue.X1XX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XX1X_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX1_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXXX1XXX);
		addEEnumLiteral(tValueEEnum, TValue.XXXX_X1XX);
		addEEnumLiteral(tValueEEnum, TValue.XXXX_XX1X);
		addEEnumLiteral(tValueEEnum, TValue.XXXX_XXX1);
		addEEnumLiteral(tValueEEnum, TValue._000000000000000);
		addEEnumLiteral(tValueEEnum, TValue.X1X_XXXX_XXXX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XX1_XXXX_XXXX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX1XXX_XXXX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX_X1XX_XXXX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX_XX1X_XXXX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX_XXX1_XXXX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX_XXXX1XXX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX_XXXX_X1XX_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX_XXXX_XX1X_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX_XXXX_XXX1_XXXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX_XXXX_XXXX1XXX);
		addEEnumLiteral(tValueEEnum, TValue.XXX_XXXX_XXXX_X1XX);
		addEEnumLiteral(tValueEEnum, TValue.XXX_XXXX_XXXX_XX1X);
		addEEnumLiteral(tValueEEnum, TValue.XXX_XXXX_XXXX_XXX1);

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
		initEDataType(tFormulaObjectEDataType, TFormula.class, "TFormulaObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tidNumberObjectEDataType, TIDNumber.class, "TIDNumberObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tLengthObjectEDataType, TLength.class, "TLengthObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tMaxValObjectEDataType, TMaxVal.class, "TMaxValObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tMinValObjectEDataType, TMinVal.class, "TMinValObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tTransmissionMediaObjectEDataType, TTransmissionMedia.class, "TTransmissionMediaObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tValueObjectEDataType, TValue.class, "TValueObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
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
		  (getDocumentRoot_BothWays(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BothWays",
			 "namespace", "##targetNamespace"
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
		  (getDocumentRoot_Condition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Condition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Conditional(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Conditional",
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
		  (getDocumentRoot_LoopDoWhile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoopDoWhile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LoopWhile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoopWhile",
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
		  (getDocumentRoot_Packets(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packets",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Special(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Special",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Specs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Specs",
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
		  (getDocumentRoot_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Variables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variables",
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
		  (specialTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Special_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSpecialType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpecialType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (specsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Specs_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpecsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSpecsType_Special(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Special",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSpecsType_Formula(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Formula",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpecsType_Length(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Length",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpecsType_MaxVal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MaxVal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpecsType_MinVal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MinVal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tBothWaysEClass, 
		   source, 
		   new String[] {
			 "name", "T_BothWays",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTBothWays_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "List",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTBothWays_Packet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tConditionalEClass, 
		   source, 
		   new String[] {
			 "name", "T_Conditional",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTConditional_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTConditional_Condition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Condition",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTConditional_Variables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variables",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
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
		  (getTContent_LoopDoWhile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoopDoWhile",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTContent_LoopWhile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoopWhile",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTContent_Conditional(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Conditional",
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
		  (getTDefinitions_VarDef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VarDef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tFormulaEEnum, 
		   source, 
		   new String[] {
			 "name", "T_Formula"
		   });		
		addAnnotation
		  (tFormulaObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "T_Formula:Object",
			 "baseType", "T_Formula"
		   });		
		addAnnotation
		  (tidNumberEEnum, 
		   source, 
		   new String[] {
			 "name", "T_IDNumber"
		   });		
		addAnnotation
		  (tidNumberObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "T_IDNumber:Object",
			 "baseType", "T_IDNumber"
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
		  (tLoopDoWhileEClass, 
		   source, 
		   new String[] {
			 "name", "T_LoopDoWhile",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTLoopDoWhile_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTLoopDoWhile_TlgVar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TlgVar",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTLoopDoWhile_Conditional(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Conditional",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTLoopDoWhile_LoopWhile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoopWhile",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (tLoopWhileEClass, 
		   source, 
		   new String[] {
			 "name", "T_LoopWhile",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTLoopWhile_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTLoopWhile_TlgVar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TlgVar",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTLoopWhile_Conditional(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Conditional",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (tMaxValEEnum, 
		   source, 
		   new String[] {
			 "name", "T_MaxVal"
		   });		
		addAnnotation
		  (tMaxValObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "T_MaxVal:Object",
			 "baseType", "T_MaxVal"
		   });		
		addAnnotation
		  (tMinValEEnum, 
		   source, 
		   new String[] {
			 "name", "T_MinVal"
		   });		
		addAnnotation
		  (tMinValObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "T_MinVal:Object",
			 "baseType", "T_MinVal"
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
		  (getTPackets_TrackToTrain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TrackToTrain",
			 "namespace", "##targetNamespace"
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
		  (getTPackets_BothWays(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BothWays",
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
		  (tValueEEnum, 
		   source, 
		   new String[] {
			 "name", "T_Value"
		   });		
		addAnnotation
		  (tValueObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "T_Value:Object",
			 "baseType", "T_Value"
		   });		
		addAnnotation
		  (tVardefVarEClass, 
		   source, 
		   new String[] {
			 "name", "T_VardefVar",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTVardefVar_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTVardefVar_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (tVariableEClass, 
		   source, 
		   new String[] {
			 "name", "T_Variable",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTVariable_DetailedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DetailedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTVariable_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTVariable_Specs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Specs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTVariable_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tVariablesEClass, 
		   source, 
		   new String[] {
			 "name", "T_Variables",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTVariables_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTVariables_LoopDoWhile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoopDoWhile",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTVariables_LoopWhile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LoopWhile",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTVariables_TlgVar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TlgVar",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getTVariables_Conditional(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Conditional",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
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

} //Subset0267PackageImpl
