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

import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.openetcs.pror.tracing.TracingConfiguration;

/**
 * <p>
 * This command is used for creating traces from Papyrus via drag and drop.
 * During the drag operation (and before drop), many instances of the command
 * are created. To keep performance high, {@link #prepare()} does nothing, while
 * all the "work" is done in {@link #doExecute()}, which is only called after
 * the drop.
 * </p>
 * 
 * <p>
 * The format of the value of the Proxy Element is described in
 * {@link TracingConfigurationItemProvider}.
 * </p>
 * 
 * @author jastram
 * 
 */
public class CreateTraceCommand extends AbstractOverrideableCommand {

	private Set<EObject> elements;
	private SpecObject target;
	private TracingConfiguration config;
	private AdapterFactory adapterFactory;

	public CreateTraceCommand(Set<EObject> elements, SpecObject target,
			EditingDomain editingDomain, AdapterFactory adapterFactory, int operation, TracingConfiguration config) {
		super(editingDomain, "Dropped " + elements.size() + " Papyrus element(s)");
		this.adapterFactory = adapterFactory;
		this.elements = elements;
		this.target = target;
		this.config = config;
	}

	/**
	 * We always return true.  The default implementation would call the prepare method, which creates
	 * proxy elements as a side effect.
	 */
	@Override
	public boolean doCanExecute() {
		return true;
	}

	/**
	 * Builds a CompoundCommand that is then set to
	 * {@link AbstractOverrideableCommand#setOverride(org.eclipse.emf.common.command.Command)}
	 * .
	 */
	@Override
	public void doExecute() {
		CompoundCommand cmd = new CompoundCommand(getLabel());
		System.out.println("prepare called");
		for (EObject element : elements) {
			createCreateLinkCommand(cmd, element);
		}
		setOverride(cmd);
		if (cmd.canExecute())
			cmd.execute();
	}

	/**
	 * Adds to the provided compound command to create a link from a proxy for
	 * element to the drop target. If a proxy already exists, it is reused. If a
	 * link of the correct type already exists, it is reused as well.
	 */
	void createCreateLinkCommand(CompoundCommand cmd, EObject element) {
		SpecObject proxy = getProxy(element, cmd);
		getLink(proxy, cmd);
	}


	/**
	 * Returns the proxy for the given element.  If the proxy does not exist yet,
	 * it is created, thereby appending to cmd.
	 */
	private SpecObject getProxy(EObject element, CompoundCommand cmd) {
		SpecObject proxy = findProxyFor(element);
		if (proxy == null)
			proxy = createProxy(cmd, element);
		return proxy;
	}

	/**
	 * Returns the link for the given link.  If the link does not exist yet,
	 * it is created, thereby appending to cmd.
	 * @param element 
	 */
	private SpecRelation getLink(SpecObject proxy, CompoundCommand cmd) {
		SpecRelation link = findLinkFor(proxy);
		if (link == null)
			link = createLink(cmd, proxy);
		return link;
	}

	/**
	 * Creates a properly configured SpecRelation object between proxy and target.
	 */
	private SpecRelation createLink(CompoundCommand cmd, SpecObject proxy) {
		SpecRelation link;
		link= ReqIF10Factory.eINSTANCE.createSpecRelation();
		link.setSource(config.isLinkFromTarget() ? target : proxy);
		link.setTarget(config.isLinkFromTarget() ? proxy : target);
		cmd.append(ProrUtil.createAddTypedElementCommand(
				ReqIF10Util.getReqIF(config).getCoreContent(),
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS,
				link, ReqIF10Package.Literals.SPEC_RELATION__TYPE,
				config.getLinkType(), 0, 0, domain, adapterFactory));
		return link;
	}

	/**
	 * Attempts to find a SpecRelation that: (1) connects proxy and
	 * target in the right direction; and (2) has the correct type.
	 */
	private SpecRelation findLinkFor(SpecObject proxy) {
		SpecObject linkSource = config.isLinkFromTarget() ? target : proxy;
		SpecObject linkTarget = config.isLinkFromTarget() ? proxy : target;
		SpecRelationType type = config.getLinkType();
		
		for (SpecRelation relation : ReqIF10Util.getReqIF(config)
				.getCoreContent().getSpecRelations()) {
			//  It's okay to compare null and references.
			if (relation.getType() == type && linkSource == relation.getSource()
					&& linkTarget == relation.getTarget()) {
				return relation;
			}
		}
		return null;
	}

	private SpecObject createProxy(CompoundCommand cmd, EObject element) {
		SpecObject proxy;
		proxy = ReqIF10Factory.eINSTANCE.createSpecObject();
		AttributeValueString value = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		value.setDefinition(config.getProxyAttribute());
		value.setTheValue(buildProxyContent(element));
		proxy.getValues().add(value);
		cmd.append(ProrUtil.createAddTypedElementCommand(
				ReqIF10Util.getReqIF(config).getCoreContent(),
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS,
				proxy, ReqIF10Package.Literals.SPEC_OBJECT__TYPE,
				config.getProxyType(), 0, 0, domain, adapterFactory));
		return proxy;
	}

	/**
	 * Builds the content for a proxy element.  The format is described in
	 * the class comments of {@link TracingConfigurationItemProvider}.
	 */
	String buildProxyContent(EObject element) {
		StringBuilder sb = new StringBuilder();
		
		// Line 1
		sb.append(getTraceURI(element));
		sb.append("\n");
		EObject e = element;

		// Line 2
		while (e.eContainer() instanceof EObject) {
			ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory, e);
			if (ip != null) sb.append(ip.getText(e));
			else sb.append(e.toString());
			e = e.eContainer();
			if (e.eContainer() instanceof EObject) sb.append(" / ");
		}
		sb.append("\n");

		// Line 3-end
		// We built a map for alphabetical sorting.
		Set<String> set = new TreeSet<String>();
		for (EAttribute attribute : element.eClass().getEAllAttributes()) {
			EStructuralFeature feature = element.eClass()
					.getEStructuralFeature(attribute.getFeatureID());
			set.add(attribute.getName() + "=" + element.eGet(feature));
		}
		for (String value : set) {
			sb.append(value);
			sb.append("\n");
		}
		sb.deleteCharAt(sb.length() - 1); // Return the last \n
		return sb.toString();
	}

	/**
	 * Returns the Trace URI.
	 */
	String getTraceURI(EObject element) {
		String base = element.eResource().getURI().path();
		if ((base == null)) base = element.eResource().getURI().toFileString();

		String fragment = element.eResource().getURIFragment(element);
		return base + "#" + fragment;
	}

	/**
	 * Tries to find the proxy with the given URI.  Returns null if not found.
	 * If it is found, the content will be updated, if it has changed.
	 */
	SpecObject findProxyFor(EObject element) {
		String uri = getTraceURI(element);
		System.out.println("Finding URL: " + uri);
		ReqIF reqif = ReqIF10Util.getReqIF(config);
		AttributeDefinitionString ad = config.getProxyAttribute();

		// Iterate SpecObjects and search for existing proxy element
		for (SpecObject specObject : reqif.getCoreContent().getSpecObjects()) {
			AttributeValue value = ReqIF10Util
					.getAttributeValue(specObject, ad);
			if (value instanceof AttributeValueString) {
				String tmpUrl = getProxyUrlFromValue(((AttributeValueString) value)
						.getTheValue());
				if (uri.equals(tmpUrl)) {
					System.out.println("Found proxy!");
					updateProxyIfNecessary((AttributeValueString) value, element);
					return specObject;
				}
			}
		}
		System.out.println("Did not find proxy");
		return null;
	}

	/**
	 * Updates the proxy if it has changed.  Note that this is NOT added to the command
	 * that we're currently building - the proxy needs to be updated no matter what.
	 */
	void updateProxyIfNecessary(AttributeValueString proxyValue, EObject element) {
		String proxyContent = proxyValue
				.getTheValue();
		String currentContent = buildProxyContent(element);
		if (proxyContent.equals(currentContent))
			return;
		// Content differs: Update the Value.
		Command cmd = SetCommand.create(domain, proxyValue,
				ReqIF10Package.Literals.ATTRIBUTE_VALUE_STRING__THE_VALUE,
				currentContent);
		domain.getCommandStack().execute(cmd);
		System.out.println("Updated content!");
	}


	/**
	 * Retrieves the Proxy URL from the given String, essentially just using the first text line.
	 */
	private static String getProxyUrlFromValue(String value) {
		return new StringTokenizer(value).nextToken();
	}

	@Override
	public void doUndo() {
		throw new RuntimeException("Should never be called, due to overrideCommand");
	}

	@Override
	public void doRedo() {
		throw new RuntimeException("Should never be called, due to overrideCommand");
	}
	
	
}
