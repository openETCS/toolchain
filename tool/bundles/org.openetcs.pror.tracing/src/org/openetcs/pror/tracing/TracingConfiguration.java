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
package org.openetcs.pror.tracing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelationType;

import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.pror.tracing.TracingConfiguration#getProxyType <em>Proxy Type</em>}</li>
 *   <li>{@link org.openetcs.pror.tracing.TracingConfiguration#getProxyAttribute <em>Proxy Attribute</em>}</li>
 *   <li>{@link org.openetcs.pror.tracing.TracingConfiguration#getAttributeNames <em>Attribute Names</em>}</li>
 *   <li>{@link org.openetcs.pror.tracing.TracingConfiguration#isLinkFromTarget <em>Link From Target</em>}</li>
 *   <li>{@link org.openetcs.pror.tracing.TracingConfiguration#getLinkType <em>Link Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.pror.tracing.TracingPackage#getTracingConfiguration()
 * @model
 * @generated
 */
public interface TracingConfiguration extends ProrPresentationConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2014 Formal Mind GmbH.\n\nLicensed under the European Union Public Licence (EUPL), Version 1.1 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://joinup.ec.europa.eu/software/page/eupl/licence-eupl\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Proxy Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Type</em>' reference.
	 * @see #setProxyType(SpecObjectType)
	 * @see org.openetcs.pror.tracing.TracingPackage#getTracingConfiguration_ProxyType()
	 * @model
	 * @generated
	 */
	SpecObjectType getProxyType();

	/**
	 * Sets the value of the '{@link org.openetcs.pror.tracing.TracingConfiguration#getProxyType <em>Proxy Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Type</em>' reference.
	 * @see #getProxyType()
	 * @generated
	 */
	void setProxyType(SpecObjectType value);

	/**
	 * Returns the value of the '<em><b>Proxy Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Attribute</em>' reference.
	 * @see #setProxyAttribute(AttributeDefinitionString)
	 * @see org.openetcs.pror.tracing.TracingPackage#getTracingConfiguration_ProxyAttribute()
	 * @model
	 * @generated
	 */
	AttributeDefinitionString getProxyAttribute();

	/**
	 * Sets the value of the '{@link org.openetcs.pror.tracing.TracingConfiguration#getProxyAttribute <em>Proxy Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Attribute</em>' reference.
	 * @see #getProxyAttribute()
	 * @generated
	 */
	void setProxyAttribute(AttributeDefinitionString value);

	/**
	 * Returns the value of the '<em><b>Attribute Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Names</em>' attribute list.
	 * @see org.openetcs.pror.tracing.TracingPackage#getTracingConfiguration_AttributeNames()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getAttributeNames();

	/**
	 * Returns the value of the '<em><b>Link From Target</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link From Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link From Target</em>' attribute.
	 * @see #setLinkFromTarget(boolean)
	 * @see org.openetcs.pror.tracing.TracingPackage#getTracingConfiguration_LinkFromTarget()
	 * @model default="true"
	 * @generated
	 */
	boolean isLinkFromTarget();

	/**
	 * Sets the value of the '{@link org.openetcs.pror.tracing.TracingConfiguration#isLinkFromTarget <em>Link From Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link From Target</em>' attribute.
	 * @see #isLinkFromTarget()
	 * @generated
	 */
	void setLinkFromTarget(boolean value);

	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type</em>' reference.
	 * @see #setLinkType(SpecRelationType)
	 * @see org.openetcs.pror.tracing.TracingPackage#getTracingConfiguration_LinkType()
	 * @model
	 * @generated
	 */
	SpecRelationType getLinkType();

	/**
	 * Sets the value of the '{@link org.openetcs.pror.tracing.TracingConfiguration#getLinkType <em>Link Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' reference.
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(SpecRelationType value);

} // TracingConfiguration
