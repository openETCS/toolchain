/**
 * Copyright 2014 Formal Mind GmbH.
 * 
 * Licensed under the European Union Public Licence (EUPL), Version 1.1 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openetcs.pror.tracing.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationImpl;
import org.openetcs.pror.tracing.TracingConfiguration;
import org.openetcs.pror.tracing.TracingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.pror.tracing.impl.TracingConfigurationImpl#getProxyType <em>Proxy Type</em>}</li>
 *   <li>{@link org.openetcs.pror.tracing.impl.TracingConfigurationImpl#getProxyAttribute <em>Proxy Attribute</em>}</li>
 *   <li>{@link org.openetcs.pror.tracing.impl.TracingConfigurationImpl#getAttributeNames <em>Attribute Names</em>}</li>
 *   <li>{@link org.openetcs.pror.tracing.impl.TracingConfigurationImpl#isLinkFromTarget <em>Link From Target</em>}</li>
 *   <li>{@link org.openetcs.pror.tracing.impl.TracingConfigurationImpl#getLinkType <em>Link Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracingConfigurationImpl extends ProrPresentationConfigurationImpl implements TracingConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2014 Formal Mind GmbH.\n\nLicensed under the European Union Public Licence (EUPL), Version 1.1 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://joinup.ec.europa.eu/software/page/eupl/licence-eupl\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The cached value of the '{@link #getProxyType() <em>Proxy Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyType()
	 * @generated
	 * @ordered
	 */
	protected SpecObjectType proxyType;

	/**
	 * The cached value of the '{@link #getProxyAttribute() <em>Proxy Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyAttribute()
	 * @generated
	 * @ordered
	 */
	protected AttributeDefinitionString proxyAttribute;

	/**
	 * The cached value of the '{@link #getAttributeNames() <em>Attribute Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attributeNames;

	/**
	 * The default value of the '{@link #isLinkFromTarget() <em>Link From Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLinkFromTarget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LINK_FROM_TARGET_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLinkFromTarget() <em>Link From Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLinkFromTarget()
	 * @generated
	 * @ordered
	 */
	protected boolean linkFromTarget = LINK_FROM_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkType() <em>Link Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected SpecRelationType linkType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracingConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracingPackage.Literals.TRACING_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecObjectType getProxyType() {
		if (proxyType != null && proxyType.eIsProxy()) {
			InternalEObject oldProxyType = (InternalEObject)proxyType;
			proxyType = (SpecObjectType)eResolveProxy(oldProxyType);
			if (proxyType != oldProxyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracingPackage.TRACING_CONFIGURATION__PROXY_TYPE, oldProxyType, proxyType));
			}
		}
		return proxyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecObjectType basicGetProxyType() {
		return proxyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyType(SpecObjectType newProxyType) {
		SpecObjectType oldProxyType = proxyType;
		proxyType = newProxyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracingPackage.TRACING_CONFIGURATION__PROXY_TYPE, oldProxyType, proxyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionString getProxyAttribute() {
		if (proxyAttribute != null && proxyAttribute.eIsProxy()) {
			InternalEObject oldProxyAttribute = (InternalEObject)proxyAttribute;
			proxyAttribute = (AttributeDefinitionString)eResolveProxy(oldProxyAttribute);
			if (proxyAttribute != oldProxyAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracingPackage.TRACING_CONFIGURATION__PROXY_ATTRIBUTE, oldProxyAttribute, proxyAttribute));
			}
		}
		return proxyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionString basicGetProxyAttribute() {
		return proxyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyAttribute(AttributeDefinitionString newProxyAttribute) {
		AttributeDefinitionString oldProxyAttribute = proxyAttribute;
		proxyAttribute = newProxyAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracingPackage.TRACING_CONFIGURATION__PROXY_ATTRIBUTE, oldProxyAttribute, proxyAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAttributeNames() {
		if (attributeNames == null) {
			attributeNames = new EDataTypeUniqueEList<String>(String.class, this, TracingPackage.TRACING_CONFIGURATION__ATTRIBUTE_NAMES);
		}
		return attributeNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLinkFromTarget() {
		return linkFromTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkFromTarget(boolean newLinkFromTarget) {
		boolean oldLinkFromTarget = linkFromTarget;
		linkFromTarget = newLinkFromTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracingPackage.TRACING_CONFIGURATION__LINK_FROM_TARGET, oldLinkFromTarget, linkFromTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecRelationType getLinkType() {
		if (linkType != null && linkType.eIsProxy()) {
			InternalEObject oldLinkType = (InternalEObject)linkType;
			linkType = (SpecRelationType)eResolveProxy(oldLinkType);
			if (linkType != oldLinkType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracingPackage.TRACING_CONFIGURATION__LINK_TYPE, oldLinkType, linkType));
			}
		}
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecRelationType basicGetLinkType() {
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkType(SpecRelationType newLinkType) {
		SpecRelationType oldLinkType = linkType;
		linkType = newLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracingPackage.TRACING_CONFIGURATION__LINK_TYPE, oldLinkType, linkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracingPackage.TRACING_CONFIGURATION__PROXY_TYPE:
				if (resolve) return getProxyType();
				return basicGetProxyType();
			case TracingPackage.TRACING_CONFIGURATION__PROXY_ATTRIBUTE:
				if (resolve) return getProxyAttribute();
				return basicGetProxyAttribute();
			case TracingPackage.TRACING_CONFIGURATION__ATTRIBUTE_NAMES:
				return getAttributeNames();
			case TracingPackage.TRACING_CONFIGURATION__LINK_FROM_TARGET:
				return isLinkFromTarget();
			case TracingPackage.TRACING_CONFIGURATION__LINK_TYPE:
				if (resolve) return getLinkType();
				return basicGetLinkType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracingPackage.TRACING_CONFIGURATION__PROXY_TYPE:
				setProxyType((SpecObjectType)newValue);
				return;
			case TracingPackage.TRACING_CONFIGURATION__PROXY_ATTRIBUTE:
				setProxyAttribute((AttributeDefinitionString)newValue);
				return;
			case TracingPackage.TRACING_CONFIGURATION__ATTRIBUTE_NAMES:
				getAttributeNames().clear();
				getAttributeNames().addAll((Collection<? extends String>)newValue);
				return;
			case TracingPackage.TRACING_CONFIGURATION__LINK_FROM_TARGET:
				setLinkFromTarget((Boolean)newValue);
				return;
			case TracingPackage.TRACING_CONFIGURATION__LINK_TYPE:
				setLinkType((SpecRelationType)newValue);
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
			case TracingPackage.TRACING_CONFIGURATION__PROXY_TYPE:
				setProxyType((SpecObjectType)null);
				return;
			case TracingPackage.TRACING_CONFIGURATION__PROXY_ATTRIBUTE:
				setProxyAttribute((AttributeDefinitionString)null);
				return;
			case TracingPackage.TRACING_CONFIGURATION__ATTRIBUTE_NAMES:
				getAttributeNames().clear();
				return;
			case TracingPackage.TRACING_CONFIGURATION__LINK_FROM_TARGET:
				setLinkFromTarget(LINK_FROM_TARGET_EDEFAULT);
				return;
			case TracingPackage.TRACING_CONFIGURATION__LINK_TYPE:
				setLinkType((SpecRelationType)null);
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
			case TracingPackage.TRACING_CONFIGURATION__PROXY_TYPE:
				return proxyType != null;
			case TracingPackage.TRACING_CONFIGURATION__PROXY_ATTRIBUTE:
				return proxyAttribute != null;
			case TracingPackage.TRACING_CONFIGURATION__ATTRIBUTE_NAMES:
				return attributeNames != null && !attributeNames.isEmpty();
			case TracingPackage.TRACING_CONFIGURATION__LINK_FROM_TARGET:
				return linkFromTarget != LINK_FROM_TARGET_EDEFAULT;
			case TracingPackage.TRACING_CONFIGURATION__LINK_TYPE:
				return linkType != null;
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
		result.append(" (attributeNames: ");
		result.append(attributeNames);
		result.append(", linkFromTarget: ");
		result.append(linkFromTarget);
		result.append(')');
		return result.toString();
	}

} //TracingConfigurationImpl
