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
 *     Matthieu Perin, CEA list - correction to cut link to removed utils classes
 */

package org.openetcs.sysml.report;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Model;
import org.openetcs.common.IOUtil;


public class PerformGenerationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShell(event);
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		Object object = selection.getFirstElement();
		IFile file;
		
		if (object instanceof IFile) {
			file = (IFile) object;
		} else if (object instanceof IPapyrusFile) {
			IPapyrusFile papyrusFile = (IPapyrusFile) object;
			file = IOUtil.getUMLFile(papyrusFile);
		} else {
			MessageDialog.openWarning(shell, "Transformation can't be called on: ", object.getClass().getName());
			return null;
		}
		
		Model model = IOUtil.openUMLModel(file);
		
		HtmlGenerator generator = new HtmlGenerator();
		try {
			IOUtil.writeProjectFile(file.getProject(), file.getProjectRelativePath().removeLastSegments(1), "report.html", generator.generate(model).toString());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return null;
	}

}
