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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openetcs.pror.tracing.TracingFactory
 * @model kind="package"
 * @generated
 */
public interface TracingPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2014 Formal Mind GmbH.\n\nLicensed under the European Union Public Licence (EUPL), Version 1.1 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://joinup.ec.europa.eu/software/page/eupl/licence-eupl\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tracing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/rmf/pror/presentation/tracing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracingPackage eINSTANCE = org.openetcs.pror.tracing.impl.TracingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openetcs.pror.tracing.impl.TracingConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.pror.tracing.impl.TracingConfigurationImpl
	 * @see org.openetcs.pror.tracing.impl.TracingPackageImpl#getTracingConfiguration()
	 * @generated
	 */
	int TRACING_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__DATATYPE = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION__DATATYPE;

	/**
	 * The feature id for the '<em><b>Proxy Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__PROXY_TYPE = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__PROXY_ATTRIBUTE = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__ATTRIBUTE_NAMES = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link From Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__LINK_FROM_TARGET = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__LINK_TYPE = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Package Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION__PACKAGE_PREFIX = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_CONFIGURATION_FEATURE_COUNT = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.openetcs.pror.tracing.TracingConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.openetcs.pror.tracing.TracingConfiguration
	 * @generated
	 */
	EClass getTracingConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.pror.tracing.TracingConfiguration#getProxyType <em>Proxy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proxy Type</em>'.
	 * @see org.openetcs.pror.tracing.TracingConfiguration#getProxyType()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EReference getTracingConfiguration_ProxyType();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.pror.tracing.TracingConfiguration#getProxyAttribute <em>Proxy Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proxy Attribute</em>'.
	 * @see org.openetcs.pror.tracing.TracingConfiguration#getProxyAttribute()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EReference getTracingConfiguration_ProxyAttribute();

	/**
	 * Returns the meta object for the attribute list '{@link org.openetcs.pror.tracing.TracingConfiguration#getAttributeNames <em>Attribute Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute Names</em>'.
	 * @see org.openetcs.pror.tracing.TracingConfiguration#getAttributeNames()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EAttribute getTracingConfiguration_AttributeNames();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.pror.tracing.TracingConfiguration#isLinkFromTarget <em>Link From Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link From Target</em>'.
	 * @see org.openetcs.pror.tracing.TracingConfiguration#isLinkFromTarget()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EAttribute getTracingConfiguration_LinkFromTarget();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.pror.tracing.TracingConfiguration#getLinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Type</em>'.
	 * @see org.openetcs.pror.tracing.TracingConfiguration#getLinkType()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EReference getTracingConfiguration_LinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.pror.tracing.TracingConfiguration#getPackagePrefix <em>Package Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Prefix</em>'.
	 * @see org.openetcs.pror.tracing.TracingConfiguration#getPackagePrefix()
	 * @see #getTracingConfiguration()
	 * @generated
	 */
	EAttribute getTracingConfiguration_PackagePrefix();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracingFactory getTracingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openetcs.pror.tracing.impl.TracingConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.pror.tracing.impl.TracingConfigurationImpl
		 * @see org.openetcs.pror.tracing.impl.TracingPackageImpl#getTracingConfiguration()
		 * @generated
		 */
		EClass TRACING_CONFIGURATION = eINSTANCE.getTracingConfiguration();

		/**
		 * The meta object literal for the '<em><b>Proxy Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACING_CONFIGURATION__PROXY_TYPE = eINSTANCE.getTracingConfiguration_ProxyType();

		/**
		 * The meta object literal for the '<em><b>Proxy Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACING_CONFIGURATION__PROXY_ATTRIBUTE = eINSTANCE.getTracingConfiguration_ProxyAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_CONFIGURATION__ATTRIBUTE_NAMES = eINSTANCE.getTracingConfiguration_AttributeNames();

		/**
		 * The meta object literal for the '<em><b>Link From Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_CONFIGURATION__LINK_FROM_TARGET = eINSTANCE.getTracingConfiguration_LinkFromTarget();

		/**
		 * The meta object literal for the '<em><b>Link Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACING_CONFIGURATION__LINK_TYPE = eINSTANCE.getTracingConfiguration_LinkType();

		/**
		 * The meta object literal for the '<em><b>Package Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_CONFIGURATION__PACKAGE_PREFIX = eINSTANCE.getTracingConfiguration_PackagePrefix();

	}

} //TracingPackage
