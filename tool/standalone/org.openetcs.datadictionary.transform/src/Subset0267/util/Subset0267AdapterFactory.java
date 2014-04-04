/**
 */
package Subset0267.util;

import Subset0267.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Subset0267.Subset0267Package
 * @generated
 */
public class Subset0267AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Subset0267Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset0267AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Subset0267Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subset0267Switch<Adapter> modelSwitch =
		new Subset0267Switch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
			}
			@Override
			public Adapter caseSpecialType(SpecialType object) {
				return createSpecialTypeAdapter();
			}
			@Override
			public Adapter caseSpecsType(SpecsType object) {
				return createSpecsTypeAdapter();
			}
			@Override
			public Adapter caseTBothWays(TBothWays object) {
				return createTBothWaysAdapter();
			}
			@Override
			public Adapter caseTConditional(TConditional object) {
				return createTConditionalAdapter();
			}
			@Override
			public Adapter caseTContent(TContent object) {
				return createTContentAdapter();
			}
			@Override
			public Adapter caseTDefinitions(TDefinitions object) {
				return createTDefinitionsAdapter();
			}
			@Override
			public Adapter caseTLoopDoWhile(TLoopDoWhile object) {
				return createTLoopDoWhileAdapter();
			}
			@Override
			public Adapter caseTLoopWhile(TLoopWhile object) {
				return createTLoopWhileAdapter();
			}
			@Override
			public Adapter caseTPacket(TPacket object) {
				return createTPacketAdapter();
			}
			@Override
			public Adapter caseTPackets(TPackets object) {
				return createTPacketsAdapter();
			}
			@Override
			public Adapter caseTTlgVar(TTlgVar object) {
				return createTTlgVarAdapter();
			}
			@Override
			public Adapter caseTTrackToTrain(TTrackToTrain object) {
				return createTTrackToTrainAdapter();
			}
			@Override
			public Adapter caseTTrainToTrack(TTrainToTrack object) {
				return createTTrainToTrackAdapter();
			}
			@Override
			public Adapter caseTVardefVar(TVardefVar object) {
				return createTVardefVarAdapter();
			}
			@Override
			public Adapter caseTVariable(TVariable object) {
				return createTVariableAdapter();
			}
			@Override
			public Adapter caseTVariables(TVariables object) {
				return createTVariablesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.SpecialType <em>Special Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.SpecialType
	 * @generated
	 */
	public Adapter createSpecialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.SpecsType <em>Specs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.SpecsType
	 * @generated
	 */
	public Adapter createSpecsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TBothWays <em>TBoth Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TBothWays
	 * @generated
	 */
	public Adapter createTBothWaysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TConditional <em>TConditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TConditional
	 * @generated
	 */
	public Adapter createTConditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TContent <em>TContent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TContent
	 * @generated
	 */
	public Adapter createTContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TDefinitions
	 * @generated
	 */
	public Adapter createTDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TLoopDoWhile <em>TLoop Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TLoopDoWhile
	 * @generated
	 */
	public Adapter createTLoopDoWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TLoopWhile <em>TLoop While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TLoopWhile
	 * @generated
	 */
	public Adapter createTLoopWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TPacket <em>TPacket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TPacket
	 * @generated
	 */
	public Adapter createTPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TPackets <em>TPackets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TPackets
	 * @generated
	 */
	public Adapter createTPacketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TTlgVar <em>TTlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TTlgVar
	 * @generated
	 */
	public Adapter createTTlgVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TTrackToTrain <em>TTrack To Train</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TTrackToTrain
	 * @generated
	 */
	public Adapter createTTrackToTrainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TTrainToTrack <em>TTrain To Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TTrainToTrack
	 * @generated
	 */
	public Adapter createTTrainToTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TVardefVar <em>TVardef Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TVardefVar
	 * @generated
	 */
	public Adapter createTVardefVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TVariable <em>TVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TVariable
	 * @generated
	 */
	public Adapter createTVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0267.TVariables <em>TVariables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0267.TVariables
	 * @generated
	 */
	public Adapter createTVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Subset0267AdapterFactory
