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
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 */
package org.openetcs.pror.tracing.provider;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.common.util.ReqIFToolExtensionUtil;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.junit.Test;
import org.openetcs.pror.tracing.TracingConfiguration;
import org.openetcs.pror.tracing.TracingFactory;

public class CreateTraceCommandTest extends AbstractItemProviderTest {

	private SpecObject requirement;
	private EObject external;
	private TracingConfiguration config;

	@Override
	public void setupAbstractItemProviderTest() {
		super.setupAbstractItemProviderTest();
		try {
			adapterFactory
			.addAdapterFactory(new TracingItemProviderAdapterFactory());
			buildTestReqif();
			external = buildTestExternal();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}

	private ReqIF buildTestReqif() throws IOException {
		ReqIF10Factory rf = ReqIF10Factory.eINSTANCE;
		ConfigurationFactory cf = ConfigurationFactory.eINSTANCE;
		ReqIF reqif = rf.createReqIF();
		ReqIFContent content = rf.createReqIFContent();
		reqif.setCoreContent(content);
		
		// Build the Datatypes
		DatatypeDefinitionString t_string = rf.createDatatypeDefinitionString();
		content.getDatatypes().add(t_string);
		
		// Build SpecObject Type for requirements.
		SpecObjectType requirementType = rf.createSpecObjectType();
		AttributeDefinitionString ad_requirement = rf.createAttributeDefinitionString();
		ad_requirement.setType(t_string);
		requirementType.getSpecAttributes().add(ad_requirement);
		content.getSpecTypes().add(requirementType);
		
		// Build SpecObject Type for proxy.
		SpecObjectType proxyType = rf.createSpecObjectType();
		AttributeDefinitionString ad_proxy = rf.createAttributeDefinitionString();
		ad_proxy.setType(t_string);
		proxyType.getSpecAttributes().add(ad_proxy);
		content.getSpecTypes().add(proxyType);
		
		// Build SpecRelationType for linking
		SpecRelationType linkType = rf.createSpecRelationType();
		content.getSpecTypes().add(linkType);

		// Add the Config Element
		ProrToolExtension toolExtension = cf.createProrToolExtension();
		ReqIFToolExtensionUtil.addToolExtension(reqif, toolExtension);
		ProrPresentationConfigurations presentationConfigs = cf.createProrPresentationConfigurations();
		toolExtension.setPresentationConfigurations(presentationConfigs);
		config = TracingFactory.eINSTANCE.createTracingConfiguration();
		
		// Configure the Config Element
		presentationConfigs.getPresentationConfigurations().add(config);
		config.setDatatype(t_string);
		config.setLinkType(linkType);
		config.setProxyAttribute(ad_proxy);
		config.setProxyType(proxyType);
		
		requirement = rf.createSpecObject();
		requirement.setType(requirementType);
		content.getSpecObjects().add(requirement);
		return reqif ;
	}

	/**
	 * The external element (to be traced from/to) must be persisted.  For simplicity, we use
	 * a ReqIF model.
	 */
	private EObject buildTestExternal() throws IOException {
		ReqIF reqif  = ReqIF10Factory.eINSTANCE.createReqIF();
		ReqIFHeader header= ReqIF10Factory.eINSTANCE.createReqIFHeader();
		header.setTitle("HeaderTitle");
		reqif.setTheHeader(header);
		external = header;
		
		File file = File.createTempFile("tracing-test-", ".reqif");
		file.deleteOnExit();
		Resource resource = editingDomain.createResource(file.getAbsolutePath());
		System.out.println(resource);
		resource.getContents().add(external);
		resource.save(null);

		return external;
	}

	/**
	 * Creates a {@link CreateTraceCommand} for testing.
	 */
	private CreateTraceCommand createCommand() {
		Set<EObject> elements = new HashSet<EObject>();
		elements.add(external);
		TracingConfigurationItemProvider ip = (TracingConfigurationItemProvider) ProrUtil
				.getItemProvider(adapterFactory, config);
		CreateTraceCommand cmd = new CreateTraceCommand(elements, requirement,
				0, editingDomain, ip);
		return cmd;
	}

	/**
	 * Tests the correct URI structure, and the URI components.
	 */
	@Test
	public void testGetTraceURI() throws Exception {
		String uri = EcoreUtil.getURI(external).toString();
		assertTrue(uri.indexOf("#") > 0);
		StringTokenizer st = new StringTokenizer(uri, "#");
		assertTrue(new File(st.nextToken()).exists());
		assertEquals(external.eResource().getURIFragment(external), st.nextToken());
	}

	/**
	 * Ensure finding non-existent Proxy returns null.
	 */
	@Test
	public void testFindProxyElementFails() {
		CreateTraceCommand cmd = createCommand();
		assertNull(cmd.findProxyFor(external));
	}
	
	/**
	 * Ensure finding non-existent Proxy returns null.
	 */
	@Test
	public void testFindProxyElementSucceeds() {
		CreateTraceCommand cmd = createCommand();
		editingDomain.getCommandStack().execute(cmd);
		SpecObject proxy = cmd.findProxyFor(external);
		assertNotNull(proxy);
		
		// Ensure that the URLs match
		String expectedUri = EcoreUtil.getURI(external).toString();
		String value = ((AttributeValueString)proxy.getValues().get(0)).getTheValue();
		StringTokenizer st = new StringTokenizer(value, "\n");
		String actualUri = st.nextToken();
		assertEquals(expectedUri, actualUri);
	}
	
	@Test
	public void testUpdateProxyIfNecessaryNoUpdate() throws Exception {
		CreateTraceCommand cmd = createCommand();
		editingDomain.getCommandStack().execute(cmd);
		SpecObject proxy = cmd.findProxyFor(external);
		TracingConfigurationItemProvider ip = (TracingConfigurationItemProvider) ProrUtil
				.getItemProvider(adapterFactory, config);

		
		AttributeValueString value = ((AttributeValueString)proxy.getValues().get(0));
		ip.updateProxyIfNecessary(value, external);
		// No Cmd should be triggered from this
		assertEquals(cmd, editingDomain.getCommandStack().getMostRecentCommand());
	}
	
	@Test
	public void testUpdateProxyIfNecessaryValueChanged() throws Exception {
		CreateTraceCommand cmd = createCommand();
		editingDomain.getCommandStack().execute(cmd);
		SpecObject proxy = cmd.findProxyFor(external);
		
		TracingConfigurationItemProvider ip = (TracingConfigurationItemProvider) ProrUtil
				.getItemProvider(adapterFactory, config);
		AttributeValueString value = ((AttributeValueString)proxy.getValues().get(0));
		value.setTheValue(value.getTheValue() + "x");
		ip.updateProxyIfNecessary(value, external);
		
		// Ensure the values match
		assertEquals(value.getTheValue(), ip.buildProxyContent(external));
	}

	@Test
	public void testUpdateProxyIfNecessaryExternalChanged() throws Exception {
		CreateTraceCommand cmd = createCommand();
		editingDomain.getCommandStack().execute(cmd);
		SpecObject proxy = cmd.findProxyFor(external);
		
		TracingConfigurationItemProvider ip = (TracingConfigurationItemProvider) ProrUtil
				.getItemProvider(adapterFactory, config);
		((ReqIFHeader)external).setComment("A comment");
		AttributeValueString value = (AttributeValueString) proxy.getValues().get(0);
		ip.updateProxyIfNecessary(value, external);
		
		// Ensure the values match
		assertEquals(value.getTheValue(), ip.buildProxyContent(external));
	}
}

