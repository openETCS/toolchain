/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Laurent Wouters laurent.wouters@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.openetcs.datadictionary.transform;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.papyrus.infra.core.multidiagram.actionbarcontributor.ActionBarContributorRegistry;
import org.eclipse.papyrus.infra.core.resource.AbstractBaseModel;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IPageManager;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;

// import com.cea.sophia.common.Activator;

/**
 * Utility class to manipulate Papyrus models
 * 
 * @author Laurent Wouters
 */
public class PapyrusModelUtils {

	/**
	 * Creates a new Papyrus model with the specified base URI
	 * 
	 * @param baseURI
	 *            The base URI for the Papyrus model
	 *            It shall be of the form platform:/resource/SomePath/File (without file extention)
	 * @return The ModelSet representing the new Papyrus model
	 */
	public static ModelSet createNew(final String baseURI) {
		ServicesRegistry registry = null;
		ModelSet modelSet = null;

		try {
			registry = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
		} catch (ServiceException ex) {
			//Activator.log.error(ex);
			return null;
		}

		try {
			registry.startServicesByClassKeys(ModelSet.class);
		} catch (ServiceException ex) {
			// ignore at this point
		}

		try {
			modelSet = registry.getService(ModelSet.class);
		} catch (ServiceException ex) {
			//Activator.log.error(ex);
			return null;
		}

		final ModelSet papyrus = modelSet;
		CommandStack stack = modelSet.getTransactionalEditingDomain().getCommandStack();
		stack.execute(new AbstractCommand() {
			@Override
			public boolean canExecute() {
				return true;
			}

			@Override
			public void execute() {
				URI uri = URI.createURI(baseURI);
				papyrus.createModels(uri);
				AbstractBaseModel notation = (AbstractBaseModel) papyrus.getModel(NotationModel.MODEL_ID);
				notation.createModel(uri);
				notation.getResource().getErrors().clear();
				((GMFResource) notation.getResource()).setUseIDAttributes(true);
			}

			@Override
			public void redo() {
				execute();
			}
		});

		try {
			registry.startRegistry();
			registry.startServicesByClassKeys(ActionBarContributorRegistry.class);
		} catch (ServiceException ex) {
			// ignore at this point
		}

		try {
			registry.getService(IPageManager.class);
		} catch (ServiceException ex) {
			//Activator.log.error(ex);
			return null;
		}

		return papyrus;
	}

	/**
	 * Creates a new Papyrus model from the specified UML file
	 * 
	 * @param umlFileURI
	 *            The URI of the UML file to use
	 *            It shall be of the form platform:/resource/SomePath/file.uml
	 * @return The ModelSet representing the new Papyrus model
	 */
	public static ModelSet createFrom(String umlFileURI) {
		return createNew(umlFileURI.substring(0, umlFileURI.length() - 4));
	}
}
