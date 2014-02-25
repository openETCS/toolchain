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
package org.openetcs.pror.tracing.provider;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrPresentationConfigurationItemProvider;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.openetcs.pror.tracing.TracingConfiguration;
import org.openetcs.pror.tracing.TracingPackage;

/**
 * This is the item provider adapter for a
 * {@link org.openetcs.pror.tracing.TracingConfiguration} object. <!--
 * begin-user-doc -->
 * <p>
 * The Proxy Element Value is a String consisting of multiple lines, separated
 * by \\n:
 * </p>
 * <ul>
 * <li>First Line: URL
 * <li>Second Line: Path to element
 * <li>Remaining lines: properties in alphabetical order.
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TracingConfigurationItemProvider extends
		ProrPresentationConfigurationItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2014 Formal Mind GmbH.\n\nLicensed under the European Union Public Licence (EUPL), Version 1.1 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n      http://joinup.ec.europa.eu/software/page/eupl/licence-eupl\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TracingConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addProxyTypePropertyDescriptor(object);
			addProxyAttributePropertyDescriptor(object);
			addAttributeNamesPropertyDescriptor(object);
			addLinkFromTargetPropertyDescriptor(object);
			addLinkTypePropertyDescriptor(object);
			addPackagePrefixPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Proxy Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addProxyTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TracingConfiguration_proxyType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TracingConfiguration_proxyType_feature", "_UI_TracingConfiguration_type"),
				 TracingPackage.Literals.TRACING_CONFIGURATION__PROXY_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Proxy Attribute feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addProxyAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TracingConfiguration_proxyAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TracingConfiguration_proxyAttribute_feature", "_UI_TracingConfiguration_type"),
				 TracingPackage.Literals.TRACING_CONFIGURATION__PROXY_ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute Names feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAttributeNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TracingConfiguration_attributeNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TracingConfiguration_attributeNames_feature", "_UI_TracingConfiguration_type"),
				 TracingPackage.Literals.TRACING_CONFIGURATION__ATTRIBUTE_NAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link From Target feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLinkFromTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TracingConfiguration_linkFromTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TracingConfiguration_linkFromTarget_feature", "_UI_TracingConfiguration_type"),
				 TracingPackage.Literals.TRACING_CONFIGURATION__LINK_FROM_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLinkTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TracingConfiguration_linkType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TracingConfiguration_linkType_feature", "_UI_TracingConfiguration_type"),
				 TracingPackage.Literals.TRACING_CONFIGURATION__LINK_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TracingConfiguration_packagePrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TracingConfiguration_packagePrefix_feature", "_UI_TracingConfiguration_type"),
				 TracingPackage.Literals.TRACING_CONFIGURATION__PACKAGE_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TracingConfiguration.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TracingConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> Uses the Link Type in the label. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		TracingConfiguration tracingConfiguration = (TracingConfiguration) object;
		return getString("_UI_TracingConfiguration_type") + " "
				+ tracingConfiguration.getLinkType();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TracingConfiguration.class)) {
			case TracingPackage.TRACING_CONFIGURATION__ATTRIBUTE_NAMES:
			case TracingPackage.TRACING_CONFIGURATION__LINK_FROM_TARGET:
			case TracingPackage.TRACING_CONFIGURATION__PACKAGE_PREFIX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TracingEditPlugin.INSTANCE;
	}

	/**
	 * Attempts to process the drop operation by fetching or creating proxy
	 * elements. This implementation supports EMF Facets, as some tools (e.g.
	 * Papyrus) use them.
	 */
	public Command handleDragAndDrop(Collection<?> source, Object target,
			EditingDomain editingDomain, int operation) {

		// Only support SpecHierarchies and SpecObjects as targets.
		SpecObject targetSpecObject = null;
		if (target instanceof SpecObject) {
			targetSpecObject = (SpecObject) target;
		} else if (target instanceof SpecHierarchy) {
			targetSpecObject = ((SpecHierarchy) target).getObject();
		}
		if (targetSpecObject == null)
			return null;
		
		TracingConfiguration config = (TracingConfiguration) getTarget();

		// Check whether at least one SysML Model Element is here.
		Set<EObject> elements = new HashSet<EObject>();
		for (Object object : source) {

			if (object instanceof IAdaptable) {
				EObject element = (EObject) ((IAdaptable) object)
						.getAdapter(EObject.class);
				if (element == null) {
					continue;
				}

				// Look at the package to decide which elements we process.
				if (element.getClass().getName().startsWith(config.getPackagePrefix())) {
					elements.add(element);
				}
			}
		}

		// No appropriate element in source
		if (elements.size() == 0)
			return null;

		// We found elements: Return a command
		// operation 4 = link, 2 = sibling, 1 = child
		return new CreateTraceCommand(elements, targetSpecObject, operation,
				editingDomain, this);
	}

	/**
	 * Returns the second line of the content, or null if it does not exist.
	 */
	@Override
	public String getLabel(AttributeValue av) {
		if (av instanceof AttributeValueString) {
			String value = ((AttributeValueString) av).getTheValue();
			StringTokenizer st = new StringTokenizer(value, "\n");
			st.nextToken();
			if (st.hasMoreTokens())
				return st.nextToken();
		}
		return null;
	}

	@Override
	public boolean canEdit() {
		return false;
	}

	/**
	 * Tracks the changes of external traces.
	 */
	private Map<Resource, Adapter> changeListeners = new HashMap<>();

	/**
	 * Upon opening, scans all proxies to find the files to be monitored.
	 */
	@Override
	public void registerPresentationConfiguration(
			ProrPresentationConfiguration config, final EditingDomain editingDomain) {
		super.registerPresentationConfiguration(config, editingDomain);
		System.out.println("Registering - scanning all Proxies");

		TracingConfiguration tracingConfig = (TracingConfiguration) config;
		Set<String> urls = new HashSet<String>();
		for (SpecObject obj : ReqIF10Util.getReqIF(config).getCoreContent().getSpecObjects()) {
			if (obj.getType() == tracingConfig.getProxyType()) {
				urls.add(getUrlFromProxy(obj));
				// TODO: Check for changes
			}
		}
		
		for (String url : urls) {
			Resource resource = getResourceFromUrl(url, editingDomain);
			Adapter adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					super.notifyChanged(msg);
					scanForChanges(editingDomain);
				}
			};
			resource.eAdapters().add(adapter);
			changeListeners.put(resource, adapter);
			System.out.println("Registering listener for: " + resource);
		}
	}

	/**
	 * Unregisters all Listeners.
	 */
	@Override
	public void unregisterPresentationConfiguration(
			ProrPresentationConfiguration config) {
		for (Map.Entry<Resource, Adapter> entry : changeListeners.entrySet()) {
			entry.getKey().eAdapters().remove(entry.getValue());
			System.out.println("Removing listener for: " + entry.getKey());
		}
	}

	/**
	 * Triggered, when an observed resource is saved.
	 */
	private void scanForChanges(EditingDomain domain) {
		System.out.println("Scanning for changes.");
		TracingConfiguration config = (TracingConfiguration) getTarget();
		for (SpecObject obj : ReqIF10Util.getReqIF(config).getCoreContent().getSpecObjects()) {
			if (obj.getType() == config.getProxyType()) {
				AttributeValue av = ReqIF10Util.getAttributeValue(obj,
						config.getProxyAttribute());
				if (! (av instanceof AttributeValueString)) continue;
				AttributeValueString avs = (AttributeValueString)av;
				String url = getProxyUrlFromValue(avs.getTheValue());
				EObject element = resolveProxyURL(url , domain);
				updateProxyIfNecessary(avs, element, domain);
			}
		}

	}

	/** 
	 * Returns an EMF Resource for the given URL
	 **/
	Resource getResourceFromUrl(String url, EditingDomain domain) {
		if (url.indexOf("#") < 0)
			return null;
	
		StringTokenizer st = new StringTokenizer(url, "#");
		String path = st.nextToken();
		URI uri = URI.createPlatformResourceURI(path, true);
		if (uri != null)
			return
	
			domain.getResourceSet().createResource(uri);
		return null;
	
	}

	String getUrlFromProxy(SpecObject proxy) {
		TracingConfiguration config = (TracingConfiguration) getTarget();
		AttributeValue av = ReqIF10Util.getAttributeValue(proxy, config.getProxyAttribute());
		if (av instanceof AttributeValueString) {
			return getProxyUrlFromValue(((AttributeValueString)av).getTheValue());
		}
		return null;
	}

	/**
	 * Retrieves the Proxy URL from the given String, essentially just using the first text line.
	 */
	static String getProxyUrlFromValue(String value) {
		return new StringTokenizer(value, "\n").nextToken();
	}
	
	/**
	 * Updates the proxy if it has changed.  Note that this is NOT added to the command
	 * that we're currently building - the proxy needs to be updated no matter what.
	 */
	void updateProxyIfNecessary(AttributeValueString proxyValue, EObject element, EditingDomain domain) {
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
		System.out.println("Value updated.");
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
	 * Tries to find the EObject that the proxy URL points to.  Returns null if
	 * this canot be resolved.
	 */
	private EObject resolveProxyURL(String url, EditingDomain domain) {
		Resource resource = getResourceFromUrl(url, domain);
		StringTokenizer st = new StringTokenizer(url, "#");
		st.nextToken();
		String fragment = st.nextToken();
		return resource.getEObject(fragment);
	}

}
