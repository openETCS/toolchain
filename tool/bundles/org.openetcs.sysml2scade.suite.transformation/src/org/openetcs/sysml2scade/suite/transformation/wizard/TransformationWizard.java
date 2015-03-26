package org.openetcs.sysml2scade.suite.transformation.wizard;

import java.util.List;

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
import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Model;
import org.openetcs.common.IOUtil;
import org.openetcs.common.Util;
import org.openetcs.sysml2scade.suite.transformation.Trace;
import org.openetcs.sysml2scade.suite.transformation.Transformation;

public class TransformationWizard extends Wizard implements StringConstants {

	private TransformationWizardPage page;
	private Model model;
	private Shell shell;
	private Block block;
	private Trace tracefile;
	private List<String> projects;

	@Override
	public boolean performFinish() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(page.getProjectName());
		IProgressMonitor monitor = new NullProgressMonitor();
		shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		// Perform model check
		if (page.performModelCheck()) {
			IStatus status = Util.validateModel(model);

			if (!status.isOK()) {
				if (MessageDialog.openConfirm(shell, UI_MESSAGE_TITLE,
						UI_MESSAGE_ERRORS_IN_MODEL) == false) {
					return false;
				}
			}
		}

		Boolean update = false;
		// Display Message Dialog of project path already exists and create
		// project if not existing
		if (project.exists()) {
			if (MessageDialog.openConfirm(shell, UI_MESSAGE_TITLE,
					UI_MESSAGE_PROJECT_EXISTS) == false) {
				return false;
			}
			update = true;
		} else if (projects.contains(page.getProjectName())) {
			if(MessageDialog.openConfirm(shell, UI_MESSAGE_TITLE, UI_TRACED_PROJECT_MISSING) == true) {
				tracefile.removeTarget(page.getProjectName());
				projects.remove(page.getProjectName());
			}
		}

		// Create project
		if (!project.exists()) {
			try {
				project.create(monitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		// Generate the Classical B source
		tracefile.loadTarget(page.getProjectName());
		Transformation generator = new Transformation(project);
		try {
			if (block != null) {
				generator.generateAndWrite(block, page.getModelName(),
						tracefile);
			} else {
				if (update) {
					generator.update(model, tracefile);
				} else {
					generator.generateAndWrite(model, tracefile);
				}
			}
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
		page = new TransformationWizardPage(UI_WIZARDPAGE_NAME, projects);
		addPage(page);
	}

	public void setModel(IFile model_file) {
		this.model = IOUtil.openUMLModel(model_file);
	}

	public void setModel(Model sysml_model) {
		this.model = sysml_model;
	}

	public void setBlock(Block block) {
		this.block = block;
		this.model = (Model) block.getBase_Class().eContainer();
	}

	public void setTracefile(Trace tracefile) {
		this.tracefile = tracefile;
		projects = tracefile.getTargetLocations();
	}
}