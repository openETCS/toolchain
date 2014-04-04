/**
 */
package Subset0267;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TTransmission Media</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Subset0267.Subset0267Package#getTTransmissionMedia()
 * @model extendedMetaData="name='T_TransmissionMedia'"
 * @generated
 */
public enum TTransmissionMedia implements Enumerator {
	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "Any", "Any"),

	/**
	 * The '<em><b>Balise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALISE_VALUE
	 * @generated
	 * @ordered
	 */
	BALISE(1, "Balise", "Balise"),

	/**
	 * The '<em><b>Loop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	LOOP(2, "Loop", "Loop"),

	/**
	 * The '<em><b>RBC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBC_VALUE
	 * @generated
	 * @ordered
	 */
	RBC(3, "RBC", "RBC"),

	/**
	 * The '<em><b>RIU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIU_VALUE
	 * @generated
	 * @ordered
	 */
	RIU(4, "RIU", "RIU"),

	/**
	 * The '<em><b>RBCRIU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBCRIU_VALUE
	 * @generated
	 * @ordered
	 */
	RBCRIU(5, "RBCRIU", "RBC, RIU"),

	/**
	 * The '<em><b>Balise Loop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALISE_LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	BALISE_LOOP(6, "BaliseLoop", "Balise, Loop"),

	/**
	 * The '<em><b>Balise RBC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALISE_RBC_VALUE
	 * @generated
	 * @ordered
	 */
	BALISE_RBC(7, "BaliseRBC", "Balise, RBC"),

	/**
	 * The '<em><b>Balise RBCRIU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALISE_RBCRIU_VALUE
	 * @generated
	 * @ordered
	 */
	BALISE_RBCRIU(8, "BaliseRBCRIU", "Balise, RBC, RIU"),

	/**
	 * The '<em><b>Balise Loop RIU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALISE_LOOP_RIU_VALUE
	 * @generated
	 * @ordered
	 */
	BALISE_LOOP_RIU(9, "BaliseLoopRIU", "Balise, Loop, RIU");

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model name="Any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>Balise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Balise</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALISE
	 * @model name="Balise"
	 * @generated
	 * @ordered
	 */
	public static final int BALISE_VALUE = 1;

	/**
	 * The '<em><b>Loop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOOP
	 * @model name="Loop"
	 * @generated
	 * @ordered
	 */
	public static final int LOOP_VALUE = 2;

	/**
	 * The '<em><b>RBC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RBC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RBC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RBC_VALUE = 3;

	/**
	 * The '<em><b>RIU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIU_VALUE = 4;

	/**
	 * The '<em><b>RBCRIU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RBCRIU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RBCRIU
	 * @model literal="RBC, RIU"
	 * @generated
	 * @ordered
	 */
	public static final int RBCRIU_VALUE = 5;

	/**
	 * The '<em><b>Balise Loop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Balise Loop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALISE_LOOP
	 * @model name="BaliseLoop" literal="Balise, Loop"
	 * @generated
	 * @ordered
	 */
	public static final int BALISE_LOOP_VALUE = 6;

	/**
	 * The '<em><b>Balise RBC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Balise RBC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALISE_RBC
	 * @model name="BaliseRBC" literal="Balise, RBC"
	 * @generated
	 * @ordered
	 */
	public static final int BALISE_RBC_VALUE = 7;

	/**
	 * The '<em><b>Balise RBCRIU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Balise RBCRIU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALISE_RBCRIU
	 * @model name="BaliseRBCRIU" literal="Balise, RBC, RIU"
	 * @generated
	 * @ordered
	 */
	public static final int BALISE_RBCRIU_VALUE = 8;

	/**
	 * The '<em><b>Balise Loop RIU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Balise Loop RIU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALISE_LOOP_RIU
	 * @model name="BaliseLoopRIU" literal="Balise, Loop, RIU"
	 * @generated
	 * @ordered
	 */
	public static final int BALISE_LOOP_RIU_VALUE = 9;

	/**
	 * An array of all the '<em><b>TTransmission Media</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TTransmissionMedia[] VALUES_ARRAY =
		new TTransmissionMedia[] {
			ANY,
			BALISE,
			LOOP,
			RBC,
			RIU,
			RBCRIU,
			BALISE_LOOP,
			BALISE_RBC,
			BALISE_RBCRIU,
			BALISE_LOOP_RIU,
		};

	/**
	 * A public read-only list of all the '<em><b>TTransmission Media</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TTransmissionMedia> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TTransmission Media</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TTransmissionMedia get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TTransmissionMedia result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TTransmission Media</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TTransmissionMedia getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TTransmissionMedia result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TTransmission Media</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TTransmissionMedia get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case BALISE_VALUE: return BALISE;
			case LOOP_VALUE: return LOOP;
			case RBC_VALUE: return RBC;
			case RIU_VALUE: return RIU;
			case RBCRIU_VALUE: return RBCRIU;
			case BALISE_LOOP_VALUE: return BALISE_LOOP;
			case BALISE_RBC_VALUE: return BALISE_RBC;
			case BALISE_RBCRIU_VALUE: return BALISE_RBCRIU;
			case BALISE_LOOP_RIU_VALUE: return BALISE_LOOP_RIU;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TTransmissionMedia(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TTransmissionMedia
