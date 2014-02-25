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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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
	private TracingConfigurationItemProvider itemProvider;

	public CreateTraceCommand(Set<EObject> elements, SpecObject target, int operation, EditingDomain domain, TracingConfigurationItemProvider itemProvider) {
		super(domain, "Dropped " + elements.size() + " Papyrus element(s)");
		if (itemProvider == null) throw new NullPointerException();
		this.itemProvider = itemProvider;
		this.elements = elements;
		this.target = target;
	}

	private TracingConfiguration getTracingConfig() {
		return (TracingConfiguration) itemProvider.getTarget();
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
		TracingConfiguration config = getTracingConfig();
		link.setSource(config.isLinkFromTarget() ? target : proxy);
		link.setTarget(config.isLinkFromTarget() ? proxy : target);
		cmd.append(ProrUtil.createAddTypedElementCommand(
				ReqIF10Util.getReqIF(config).getCoreContent(),
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS,
				link, ReqIF10Package.Literals.SPEC_RELATION__TYPE,
				config.getLinkType(), 0, 0, domain, itemProvider.getAdapterFactory()));
		return link;
	}

	/**
	 * Attempts to find a SpecRelation that: (1) connects proxy and
	 * target in the right direction; and (2) has the correct type.
	 */
	private SpecRelation findLinkFor(SpecObject proxy) {
		TracingConfiguration config = getTracingConfig();
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
		TracingConfiguration config = getTracingConfig();
		AttributeValueString value = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		value.setDefinition(config.getProxyAttribute());
		value.setTheValue(itemProvider.buildProxyContent(element));
		proxy.getValues().add(value);
		cmd.append(ProrUtil.createAddTypedElementCommand(
				ReqIF10Util.getReqIF(config).getCoreContent(),
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS,
				proxy, ReqIF10Package.Literals.SPEC_OBJECT__TYPE,
				config.getProxyType(), 0, 0, domain, itemProvider.getAdapterFactory()));
		return proxy;
	}

	/**
	 * Tries to find the proxy with the given URI.  Returns null if not found.
	 * If it is found, the content will be updated, if it has changed.
	 */
	SpecObject findProxyFor(EObject element) {
		TracingConfiguration config = getTracingConfig();
		String uri = EcoreUtil.getURI(element).toString();
		ReqIF reqif = ReqIF10Util.getReqIF(config);
		AttributeDefinitionString ad = config.getProxyAttribute();

		// Iterate SpecObjects and search for existing proxy element
		for (SpecObject specObject : reqif.getCoreContent().getSpecObjects()) {
			AttributeValue value = ReqIF10Util
					.getAttributeValue(specObject, ad);
			if (value instanceof AttributeValueString) {
				String tmpUrl = TracingConfigurationItemProvider
						.getProxyUrlFromValue(((AttributeValueString) value)
								.getTheValue());
				if (uri.equals(tmpUrl)) {
					itemProvider.updateProxyIfNecessary(
							(AttributeValueString) value, element);
					return specObject;
				}
			}
		}
		return null;
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
