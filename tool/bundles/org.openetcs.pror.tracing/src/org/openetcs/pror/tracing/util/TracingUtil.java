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
package org.openetcs.pror.tracing.util;

import java.util.Collection;
import java.util.StringTokenizer;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.openetcs.pror.tracing.TracingConfiguration;

/**
 * This class contains static helper methods for managing the Proxy Objects.
 * 
 * @author jastram
 * 
 */
public final class TracingUtil {
	/**
	 * Not to be instantiated.
	 */
	private TracingUtil() {
		throw new RuntimeException();
	}

	/**
	 * Builds a URL for the given eObject, followed by a linebreak and content to be shown to the user.
	 */
	private static String createProxyContent(EObject object, EList<String> names) {
		StringBuilder text = new StringBuilder();
		text.append(object.eClass().getName());
		text.append(": ");
		text.append(getLabel(object, names));
		text.append("\n");

		// Build the element's path
		StringBuilder path = new StringBuilder();
		EObject node = object;
		while (node.eContainer() != null) {
			path.insert(0, getLabel(node, names));
			node = node.eContainer();
			if (node.eContainer() != null) {
				path.insert(0, " / ");
			}
		}
		 return getProxyUrlFromObject(object) + "\n" + text + "\n" + path;
	}

	/**
	 * Builds a Proxy URL from the given Object.
	 */
	private static String getProxyUrlFromObject(EObject object) {
		String uriFragment = object.eResource().getURIFragment(object);
		return object.eResource().getURI() + "?" + uriFragment;	
	}

	/**
	 * Retrieves the Proxy URL from the given String, essentially just using the first text line.
	 */
	private static String getProxyUrlFromValue(String value) {
		return new StringTokenizer(value).nextToken();
	}
	
	public static EObject getElementFromProxy(String url) {
		 StringTokenizer st = new StringTokenizer(url, "?\n\r");
		 if (! st.hasMoreTokens()) return null;
		 String base = st.nextToken();
		 if (! st.hasMoreTokens()) return null;
		 String fragment = st.nextToken();
		 
		 ResourceSet rs = new ResourceSetImpl();
		 Resource resource = rs.getResource(URI.createURI(base), true);
		 EObject object = resource.getEObject(fragment);
		 return object;
	}
	
	
	/**
	 * Tries the given list of names to find a feature with a matching name.
	 */
	public static String getLabel(EObject object, EList<String> names) {
		for (String name : names) {
			EStructuralFeature feature = object.eClass().getEStructuralFeature(name);
			if (feature != null) {
				return object.eGet(feature) + "";
			}
		}
		return null;
	}
	/**
	 * This method returns a corresponding proxy {@link SpecObject} for the
	 * given {@link EObject} or creates one if it doesn't exist yet.
	 * @param adapterFactory 
	 */
	public static SpecObject getEMFProxyElementSpecObject(EObject element,
			TracingConfiguration config, EditingDomain editingDomain,
			AdapterFactory adapterFactory) {

		// Make sure we have everything to build the proxy
		if (config == null || config.getProxyAttribute() == null
				|| config.getProxyType() == null) {
			return null;
		}

		String url = getProxyUrlFromObject(element);
		System.out.println("URL: " + url);
		ReqIF reqif = ReqIF10Util.getReqIF(config);
		AttributeDefinitionString ad = config.getProxyAttribute();

		// Iterate SpecObjects and search for existing Rodin proxy element
		for (SpecObject specObject : reqif.getCoreContent().getSpecObjects()) {
			AttributeValue value = ReqIF10Util
					.getAttributeValue(specObject, ad);
			if (value instanceof AttributeValueString) {
				String tmpUrl = getProxyUrlFromValue(((AttributeValueString) value)
						.getTheValue());
				if (url.equals(tmpUrl)) {
					return specObject;
				}
			}
		}

		// No proxy found: Create it.
		return createProxy(element, config, editingDomain, adapterFactory);
	}

	/**
	 * Builds a proxy {@link SpecObject} for the given element.
	 */
	public static SpecObject createProxy(EObject element,
			TracingConfiguration config, EditingDomain domain,
			AdapterFactory adapterFactory) {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		AttributeValueString value = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		value.setDefinition(config.getProxyAttribute());
		value.setTheValue(createProxyContent(element, config.getAttributeNames()));
		specObject.getValues().add(value);
		CompoundCommand cmd = ProrUtil.createAddTypedElementCommand(
				ReqIF10Util.getReqIF(config).getCoreContent(),
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS,
				specObject, ReqIF10Package.Literals.SPEC_OBJECT__TYPE,
				config.getProxyType(), 0, 0, domain, adapterFactory);
		domain.getCommandStack().execute(cmd);
		registerProxyListener(domain, specObject, config.getProxyAttribute(), config.getAttributeNames());
		return specObject;
	}

	public static Command createProxyChildCommand(EditingDomain editingDomain,
			ReqIF reqIf, SpecHierarchy parent,
			Collection<SpecObject> proxies) {

		CompoundCommand compoundCommand = new CompoundCommand();

		for (SpecObject proxy : proxies) {

			SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE
					.createSpecHierarchy();
			specHierarchy.setObject(proxy);

			compoundCommand.append(AddCommand.create(editingDomain, parent,
					ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
					specHierarchy));
		}

		return compoundCommand;

	}

	public static Command createLinkCommand(EditingDomain editingDomain,
			TracingConfiguration config, SpecHierarchy parent,
			Collection<SpecObject> proxies) {

		SpecObject source = parent.getObject();

		CompoundCommand compoundCommand = new CompoundCommand();

		for (SpecObject proxy : proxies) {

			SpecRelation relation = ReqIF10Factory.eINSTANCE
					.createSpecRelation();

			// link direction can be configured.
			relation.setSource(config.isLinkFromTarget() ? proxy : source);
			relation.setTarget(config.isLinkFromTarget() ? source : proxy);

			compoundCommand.append(SetCommand.create(editingDomain, relation,
					ReqIF10Package.Literals.SPEC_RELATION__TYPE,
					config.getLinkType()));

			compoundCommand.append(AddCommand.create(editingDomain,
					ReqIF10Util.getReqIF(config).getCoreContent(),
					ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS,
					relation));

		}

		return compoundCommand;
	}

	public static String getCellString(Object value, boolean html) {
		if (!(value instanceof AttributeValueString))
			return "ERROR: Not a String Attribute: " + value;
		AttributeValueString av = (AttributeValueString) value;
		StringTokenizer st = new StringTokenizer(av.getTheValue(), "\n\r");
		if (!st.hasMoreTokens()) return "ERROR: No Content: " + value;
		st.nextToken();
		StringBuilder result = new StringBuilder();
		while (st.hasMoreTokens()) {
			result.append(st.nextToken());
			if (st.hasMoreTokens()) {
				result.append(html ? "<br/>" : "\n");
			}
		}
		return result.toString();
	}
	
	/**
	 * Registers a listener on the {@link EObject} for which this SpecObject
	 * acts as a proxy.
	 * 
	 * @param object
	 */
	public static void registerProxyListener(final EditingDomain domain,
			final SpecObject object, AttributeDefinition ad,
			final EList<String> names) {
		AttributeValue av = ReqIF10Util.getAttributeValue(object, ad);
		if (!(av instanceof AttributeValueString))
			return;
		final AttributeValueString value = (AttributeValueString) av;

		final EObject target = getElementFromProxy(getProxyUrlFromValue(value
				.getTheValue()));
		System.out.println("Registering with: " + target.eResource());
		target.eResource().eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification notification) {
				System.out.println("Changed.");
				String newContent = TracingUtil.createProxyContent(
						(EObject) target, names);
				if (!newContent.equals(value.getTheValue())) {
					Command cmd = SetCommand
							.create(domain,
									object,
									ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
									newContent);
					domain.getCommandStack().execute(cmd);
				}
			}
		});

	}
}