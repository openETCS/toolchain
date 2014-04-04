/**
 */
package Subset0267.util;

import Subset0267.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Subset0267.Subset0267Package
 * @generated
 */
public class Subset0267Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Subset0267Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset0267Switch() {
		if (modelPackage == null) {
			modelPackage = Subset0267Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Subset0267Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.LIST_TYPE: {
				ListType listType = (ListType)theEObject;
				T result = caseListType(listType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.SPECIAL_TYPE: {
				SpecialType specialType = (SpecialType)theEObject;
				T result = caseSpecialType(specialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.SPECS_TYPE: {
				SpecsType specsType = (SpecsType)theEObject;
				T result = caseSpecsType(specsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TBOTH_WAYS: {
				TBothWays tBothWays = (TBothWays)theEObject;
				T result = caseTBothWays(tBothWays);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TCONDITIONAL: {
				TConditional tConditional = (TConditional)theEObject;
				T result = caseTConditional(tConditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TCONTENT: {
				TContent tContent = (TContent)theEObject;
				T result = caseTContent(tContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TDEFINITIONS: {
				TDefinitions tDefinitions = (TDefinitions)theEObject;
				T result = caseTDefinitions(tDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TLOOP_DO_WHILE: {
				TLoopDoWhile tLoopDoWhile = (TLoopDoWhile)theEObject;
				T result = caseTLoopDoWhile(tLoopDoWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TLOOP_WHILE: {
				TLoopWhile tLoopWhile = (TLoopWhile)theEObject;
				T result = caseTLoopWhile(tLoopWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TPACKET: {
				TPacket tPacket = (TPacket)theEObject;
				T result = caseTPacket(tPacket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TPACKETS: {
				TPackets tPackets = (TPackets)theEObject;
				T result = caseTPackets(tPackets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TTLG_VAR: {
				TTlgVar tTlgVar = (TTlgVar)theEObject;
				T result = caseTTlgVar(tTlgVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TTRACK_TO_TRAIN: {
				TTrackToTrain tTrackToTrain = (TTrackToTrain)theEObject;
				T result = caseTTrackToTrain(tTrackToTrain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TTRAIN_TO_TRACK: {
				TTrainToTrack tTrainToTrack = (TTrainToTrack)theEObject;
				T result = caseTTrainToTrack(tTrainToTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TVARDEF_VAR: {
				TVardefVar tVardefVar = (TVardefVar)theEObject;
				T result = caseTVardefVar(tVardefVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TVARIABLE: {
				TVariable tVariable = (TVariable)theEObject;
				T result = caseTVariable(tVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Subset0267Package.TVARIABLES: {
				TVariables tVariables = (TVariables)theEObject;
				T result = caseTVariables(tVariables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListType(ListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialType(SpecialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecsType(SpecsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBoth Ways</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBoth Ways</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBothWays(TBothWays object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TConditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TConditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTConditional(TConditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TContent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TContent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTContent(TContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDefinitions(TDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLoop Do While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLoop Do While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLoopDoWhile(TLoopDoWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLoop While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLoop While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLoopWhile(TLoopWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPacket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPacket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPacket(TPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPackets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPackets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPackets(TPackets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTlg Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTlg Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTlgVar(TTlgVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTrack To Train</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTrack To Train</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTrackToTrain(TTrackToTrain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTrain To Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTrain To Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTrainToTrack(TTrainToTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TVardef Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TVardef Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTVardefVar(TVardefVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TVariable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TVariable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTVariable(TVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TVariables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TVariables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTVariables(TVariables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Subset0267Switch
