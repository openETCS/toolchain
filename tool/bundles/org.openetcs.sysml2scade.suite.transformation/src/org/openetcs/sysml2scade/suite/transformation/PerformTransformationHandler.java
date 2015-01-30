/**
 * Copyright 2014 Fraunhofer ESK & CEA list
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
 *     Alexander Stante, Fraunhofer ESK - initial API and implementation
 *     Matthieu Perin, CEA list - correction to cut link to changed utils classes
 */

package org.openetcs.sysml2scade.suite.transformation;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openetcs.common.IOUtil;
import org.openetcs.sysml2scade.suite.transformation.wizard.TransformationWizard;
import org.xml.sax.SAXException;

public class PerformTransformationHandler extends AbstractHandler {

	private static final String TRACEFILE_NAME = "tracefile.xml";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShell(event);
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil
				.getCurrentSelectionChecked(event);
		Object object = selection.getFirstElement();
		IFile file = null;
		Block block = null;
		Model model = null;
		EObject eobject = EMFHelper.getEObject(object);

		if (object instanceof IFile) {
			file = (IFile) object;
		} else if (object instanceof IPapyrusFile) {
			IPapyrusFile papyrusFile = (IPapyrusFile) object;
			file = IOUtil.getUMLFile(papyrusFile);
		} else if (eobject != null) {
			if (eobject instanceof Model) {
				model = (Model) eobject;
			} else if (eobject instanceof Element) {
				Element element;
				if (eobject instanceof Property) {
					element = ((Property) eobject).getType();
				} else {
					element = (Element) eobject;
				}
				Stereotype stereotype = element
						.getAppliedStereotype("SysML::Blocks::Block");
				if (stereotype != null) {
					block = (Block) element
							.getStereotypeApplication(stereotype);
				}
			}
		}

		TransformationWizard wizard;
		Trace tracefile;
		try {
			if (file != null) {
				tracefile = new Trace(file.getLocation().removeLastSegments(1)
						.append(TRACEFILE_NAME).toFile());
				wizard = new TransformationWizard();
				wizard.setModel(file);
			} else if (block != null) {
				tracefile = new Trace(getTracefileFile(block.eResource()
						.getURI()));
				wizard = new TransformationWizard();
				wizard.setBlock(block);
			} else if (model != null) {
				tracefile = new Trace(getTracefileFile(model.eResource()
						.getURI()));
				wizard = new TransformationWizard();
				wizard.setModel(model);
			} else {
				MessageDialog.openWarning(shell,
						"Transformation can't be called on: ", object
								.getClass().getName());
				return null;
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			throw new RuntimeException(e);
		}

		wizard.setTracefile(tracefile);
		WizardDialog wizarddialog = new WizardDialog(shell, wizard);

		try {
			if (wizarddialog.open() == Window.CANCEL)
				return null;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private File getTracefileFile(URI uri) {
		return ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.getLocation()
				.append(uri.trimSegments(1).appendSegment(TRACEFILE_NAME)
						.path()).toFile();
	}
}
