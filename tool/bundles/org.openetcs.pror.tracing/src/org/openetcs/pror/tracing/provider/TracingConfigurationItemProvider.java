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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 * <li>First Line: URL, as delivered by {@link EcoreUtil#getURI(EObject)}
 * <li>Second Line: Path to element, to be presented to the user
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
			EObject element = null;
			if (object instanceof EObject) {
				element = (EObject) object;
			}

			if (element == null) {
				if (object instanceof IAdaptable) {
					element = (EObject) ((IAdaptable) object)
							.getAdapter(EObject.class);
				}
			}

			if (element == null) {
				continue;
			}

			// Look at the package to decide which elements we process.
			if (element.getClass().getName()
					.startsWith(config.getPackagePrefix())) {
				elements.add(element);
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
	private IResourceChangeListener resourceListener; 

	/**
	 * Upon opening, scans all proxies to find the files to be monitored.
	 */
	@Override
	public void registerPresentationConfiguration(
			ProrPresentationConfiguration config, final EditingDomain editingDomain) {
		super.registerPresentationConfiguration(config, editingDomain);

		// Run an initial scan
		scanForChanges(editingDomain);

		// We observe the Workspace.  Note that this implementation is fairly inefficient.
		resourceListener = new IResourceChangeListener() {
			@Override
			public void resourceChanged(IResourceChangeEvent event) {
				if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
					scanForChanges(editingDomain);
				}
			}
		};
		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceListener);
		
	}

	private ResourceSet trackedResources = new ResourceSetImpl();
	/**
	 * <p>Retrieves the Element from the given url.</p>
	 * 
	 * TODO: This is extremely inefficient: We unload and reload the resource to find changes.
	 * There is definitively a better way!
	 */
	private EObject getElementFromUri(String url, EditingDomain domain) {
		EObject element = trackedResources.getEObject(URI.createURI(url), true);
		if (element == null) return null;
		element.eResource().unload();
		return trackedResources.getEObject(URI.createURI(url), true);
	}

	/**
	 * Unregisters all Listeners.
	 */
	@Override
	public void unregisterPresentationConfiguration(
			ProrPresentationConfiguration config) {

		// Stop listening for changes.
		if (resourceListener != null) {
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(
					resourceListener);
		}
	}

	/**
	 * Triggered, when an observed resource is saved.
	 */
	private void scanForChanges(EditingDomain domain) {
		TracingConfiguration config = (TracingConfiguration) getTarget();
		if (config == null) {
			return;
		}

		for (SpecObject obj : ReqIF10Util.getReqIF(config).getCoreContent().getSpecObjects()) {
			if (obj.getType() == config.getProxyType()) {
				AttributeValue av = ReqIF10Util.getAttributeValue(obj,
						config.getProxyAttribute());
				if (! (av instanceof AttributeValueString)) continue;
				
				EObject element = getElementFromUri(getUrlFromProxy(obj), domain);
				updateProxyIfNecessary((AttributeValueString)av, element);
			}
		}
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
	 * <p>Updates the proxy if it has changed by appending a command, if necessary.
	 * Note that we are NOT using commands for this change.  There are pros and
	 * cons either way.</p>
	 * 
	 * element may be null (if it cannot be found).  In that case, the text "DELETED"
	 * is prepended to the second (user visible) line.
	 */
	void updateProxyIfNecessary(AttributeValueString proxyValue,
			EObject element) {
		if (element == null) {
			markAsDeleted(proxyValue);
			return;
		}
		String proxyContent = proxyValue
				.getTheValue();
		String currentContent = buildProxyContent(element);
		if (proxyContent.equals(currentContent))
			return;
		// Content differs: Update the Value.
		proxyValue.setTheValue(currentContent);
		
		// This is how it's done with commands.
//		cmd.append(SetCommand.create(domain, proxyValue,
//				ReqIF10Package.Literals.ATTRIBUTE_VALUE_STRING__THE_VALUE,
//				currentContent));
	}

	/**
	 * Marks the value as deleted, by prepending the text "DELETED" to the
	 * second line.
	 * 
	 * @param proxyValue
	 */
	private void markAsDeleted(AttributeValueString proxyValue) {
		StringTokenizer tokenizer = new StringTokenizer(
				proxyValue.getTheValue(), "\n");
		StringBuilder sb = new StringBuilder();
		int linenumber = 0;
		while (tokenizer.hasMoreTokens()) {
			String line = tokenizer.nextToken();
			if (linenumber == 1) {
				if (line.startsWith("DELETED:"))
					return;
				line = "DELETED: " + line;
			}
			sb.append(line);
			if (tokenizer.hasMoreTokens())
				sb.append("\n");
			linenumber++;
		}
		proxyValue.setTheValue(sb.toString());
	}

	/**
	 * Builds the content for a proxy element.  The format is described in
	 * the class comments of {@link TracingConfigurationItemProvider}.
	 */
	String buildProxyContent(EObject element) {
		StringBuilder sb = new StringBuilder();
		
		// Line 1
		sb.append(EcoreUtil.getURI(element));
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

}
