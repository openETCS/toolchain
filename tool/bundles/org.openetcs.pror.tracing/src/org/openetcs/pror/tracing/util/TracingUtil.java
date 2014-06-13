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

import java.util.StringTokenizer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

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

	/**
	 * 
	 * Notifies proxy listeners, when something interesting happens.<p>
	 * 
	 * NOTE: Currently the only event processed is the creation of a proxy element.
	 *
	 * @param requirement the {@link SpecObject} the element is connected to. 
	 * @param trace the {@link SpecRelation} between requirement and the proxy for element.  Note
	 * that the user can configure the link direction (i.e. which one is source and which is the target).-ä
	 * @param element the {@link EObject} that the proxy refers to.
	 */
	public static void notifyProxyListeners(SpecObject requirement,
			SpecRelation trace, EObject element) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = registry
				.getExtensionPoint("org.openetcs.pror.tracing.notification");
		IExtension[] extensions = extensionPoint.getExtensions();
		for (IExtension extension : extensions) {
			IConfigurationElement[] configElements = extension
					.getConfigurationElements();
			for (IConfigurationElement configElement : configElements) {
				try {
					ProxyListener listener = (ProxyListener) configElement
							.createExecutableExtension("listener");
					listener.proxyCreatedFor(requirement, trace, element);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}
}