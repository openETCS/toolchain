/**
 */
package Subset0268.impl;

import Subset0268.Subset0268Package;
import Subset0268.TContent;
import Subset0268.TPacket;
import Subset0268.TTransmissionMedia;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPacket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Subset0268.impl.TPacketImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Subset0268.impl.TPacketImpl#getContent <em>Content</em>}</li>
 *   <li>{@link Subset0268.impl.TPacketImpl#getName <em>Name</em>}</li>
 *   <li>{@link Subset0268.impl.TPacketImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link Subset0268.impl.TPacketImpl#getTransmissionMedia <em>Transmission Media</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPacketImpl extends MinimalEObjectImpl.Container implements TPacket {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected TContent content;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger number = NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getTransmissionMedia() <em>Transmission Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionMedia()
	 * @generated
	 * @ordered
	 */
	protected TTransmissionMedia transmissionMedia = TRANSMISSION_MEDIA_EDEFAULT;

	/**
	 * This is true if the Transmission Media attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transmissionMediaESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPacketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Subset0268Package.Literals.TPACKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0268Package.TPACKET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TContent getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(TContent newContent, NotificationChain msgs) {
		TContent oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Subset0268Package.TPACKET__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(TContent newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Subset0268Package.TPACKET__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Subset0268Package.TPACKET__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0268Package.TPACKET__CONTENT, newContent, newContent));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0268Package.TPACKET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(BigInteger newNumber) {
		BigInteger oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0268Package.TPACKET__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransmissionMedia getTransmissionMedia() {
		return transmissionMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionMedia(TTransmissionMedia newTransmissionMedia) {
		TTransmissionMedia oldTransmissionMedia = transmissionMedia;
		transmissionMedia = newTransmissionMedia == null ? TRANSMISSION_MEDIA_EDEFAULT : newTransmissionMedia;
		boolean oldTransmissionMediaESet = transmissionMediaESet;
		transmissionMediaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Subset0268Package.TPACKET__TRANSMISSION_MEDIA, oldTransmissionMedia, transmissionMedia, !oldTransmissionMediaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransmissionMedia() {
		TTransmissionMedia oldTransmissionMedia = transmissionMedia;
		boolean oldTransmissionMediaESet = transmissionMediaESet;
		transmissionMedia = TRANSMISSION_MEDIA_EDEFAULT;
		transmissionMediaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Subset0268Package.TPACKET__TRANSMISSION_MEDIA, oldTransmissionMedia, TRANSMISSION_MEDIA_EDEFAULT, oldTransmissionMediaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransmissionMedia() {
		return transmissionMediaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Subset0268Package.TPACKET__CONTENT:
				return basicSetContent(null, msgs);
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
			case Subset0268Package.TPACKET__DESCRIPTION:
				return getDescription();
			case Subset0268Package.TPACKET__CONTENT:
				return getContent();
			case Subset0268Package.TPACKET__NAME:
				return getName();
			case Subset0268Package.TPACKET__NUMBER:
				return getNumber();
			case Subset0268Package.TPACKET__TRANSMISSION_MEDIA:
				return getTransmissionMedia();
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
			case Subset0268Package.TPACKET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Subset0268Package.TPACKET__CONTENT:
				setContent((TContent)newValue);
				return;
			case Subset0268Package.TPACKET__NAME:
				setName((String)newValue);
				return;
			case Subset0268Package.TPACKET__NUMBER:
				setNumber((BigInteger)newValue);
				return;
			case Subset0268Package.TPACKET__TRANSMISSION_MEDIA:
				setTransmissionMedia((TTransmissionMedia)newValue);
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
			case Subset0268Package.TPACKET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Subset0268Package.TPACKET__CONTENT:
				setContent((TContent)null);
				return;
			case Subset0268Package.TPACKET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Subset0268Package.TPACKET__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case Subset0268Package.TPACKET__TRANSMISSION_MEDIA:
				unsetTransmissionMedia();
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
			case Subset0268Package.TPACKET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Subset0268Package.TPACKET__CONTENT:
				return content != null;
			case Subset0268Package.TPACKET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Subset0268Package.TPACKET__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case Subset0268Package.TPACKET__TRANSMISSION_MEDIA:
				return isSetTransmissionMedia();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", number: ");
		result.append(number);
		result.append(", transmissionMedia: ");
		if (transmissionMediaESet) result.append(transmissionMedia); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TPacketImpl
