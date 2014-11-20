package org.openetcs.sysml2scade.suite.transformation.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Model;
import org.openetcs.common.IOUtil;
import org.openetcs.common.Util;
import org.openetcs.sysml2scade.suite.transformation.Transformation;

public class TransformationWizard extends Wizard implements StringConstants {

	private TransformationWizardPage page;
	private IFile model_file;
	private Shell shell;
	
	@Override
	public boolean performFinish() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(page.getProjectName());
		IProgressMonitor monitor = new NullProgressMonitor();
		shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		// Perform model check
		Model model = IOUtil.openUMLModel(model_file);

		if (page.performModelCheck()) {
			IStatus status = Util.validateModel(model);

			if (!status.isOK()) {
				if (MessageDialog.openConfirm(shell, UI_MESSAGE_TITLE, UI_MESSAGE_ERRORS_IN_MODEL) == false) {
					return false;
				}
			}
		}		

		// Display Message Dialog of project path already exists and create project if not existing
		if(project.exists()) {
			if (MessageDialog.openConfirm(shell, UI_MESSAGE_TITLE, UI_MESSAGE_PROJECT_EXISTS) == false) {
				return false;
			}
		}
		
		// Create project
		try {
			project.create(monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		// Generate the Classical B source
		Transformation generator= new Transformation(model, project);
		try {
			generator.generateAndWrite();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			project.open(monitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		monitor.done();		

		return true;
	}
	
	@Override
	public void addPages() {
		page = new TransformationWizardPage(UI_WIZARDPAGE_NAME);
		page.setModelName(model_file.getFullPath().toOSString());
		addPage(page);
	}

	public void setModel(IFile model) {
		this.model_file = model;
	}
}
