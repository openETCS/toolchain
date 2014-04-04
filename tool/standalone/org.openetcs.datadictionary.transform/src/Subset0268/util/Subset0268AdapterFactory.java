/**
 */
package Subset0268.util;

import Subset0268.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Subset0268.Subset0268Package
 * @generated
 */
public class Subset0268AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Subset0268Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subset0268AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Subset0268Package.eINSTANCE;
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
	protected Subset0268Switch<Adapter> modelSwitch =
		new Subset0268Switch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
			}
			@Override
			public Adapter caseOptionalPacketsType(OptionalPacketsType object) {
				return createOptionalPacketsTypeAdapter();
			}
			@Override
			public Adapter caseParcelType(ParcelType object) {
				return createParcelTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link Subset0268.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0268.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0268.OptionalPacketsType <em>Optional Packets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.OptionalPacketsType
	 * @generated
	 */
	public Adapter createOptionalPacketsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0268.ParcelType <em>Parcel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.ParcelType
	 * @generated
	 */
	public Adapter createParcelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0268.TContent <em>TContent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.TContent
	 * @generated
	 */
	public Adapter createTContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0268.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.TDefinitions
	 * @generated
	 */
	public Adapter createTDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0268.TPacket <em>TPacket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.TPacket
	 * @generated
	 */
	public Adapter createTPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0268.TPackets <em>TPackets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.TPackets
	 * @generated
	 */
	public Adapter createTPacketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0268.TTlgVar <em>TTlg Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.TTlgVar
	 * @generated
	 */
	public Adapter createTTlgVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0268.TTrackToTrain <em>TTrack To Train</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.TTrackToTrain
	 * @generated
	 */
	public Adapter createTTrackToTrainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Subset0268.TTrainToTrack <em>TTrain To Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Subset0268.TTrainToTrack
	 * @generated
	 */
	public Adapter createTTrainToTrackAdapter() {
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

} //Subset0268AdapterFactory
