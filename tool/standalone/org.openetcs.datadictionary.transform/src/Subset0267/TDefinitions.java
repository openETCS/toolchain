/**
 */
package Subset0267;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Subset0267.TDefinitions#getPackets <em>Packets</em>}</li>
 *   <li>{@link Subset0267.TDefinitions#getVarDef <em>Var Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see Subset0267.Subset0267Package#getTDefinitions()
 * @model extendedMetaData="name='T_Definitions' kind='elementOnly'"
 * @generated
 */
public interface TDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packets</em>' containment reference.
	 * @see #setPackets(TPackets)
	 * @see Subset0267.Subset0267Package#getTDefinitions_Packets()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Packets' namespace='##targetNamespace'"
	 * @generated
	 */
	TPackets getPackets();

	/**
	 * Sets the value of the '{@link Subset0267.TDefinitions#getPackets <em>Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packets</em>' containment reference.
	 * @see #getPackets()
	 * @generated
	 */
	void setPackets(TPackets value);

	/**
	 * Returns the value of the '<em><b>Var Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Def</em>' containment reference.
	 * @see #setVarDef(TVardefVar)
	 * @see Subset0267.Subset0267Package#getTDefinitions_VarDef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VarDef' namespace='##targetNamespace'"
	 * @generated
	 */
	TVardefVar getVarDef();

	/**
	 * Sets the value of the '{@link Subset0267.TDefinitions#getVarDef <em>Var Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Def</em>' containment reference.
	 * @see #getVarDef()
	 * @generated
	 */
	void setVarDef(TVardefVar value);

} // TDefinitions
