package org.openetcs.sysml.report;

import java.io.ByteArrayInputStream;

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
import org.openetcs.common.Util;

import de.fraunhofer.esk.openetcs.sysml2b.common.ClassicalBUtils;

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
			file = ClassicalBUtils.getUMLFile(papyrusFile);
		} else {
			MessageDialog.openWarning(shell, "Transformation can't be called on: ", object.getClass().getName());
			return null;
		}
		
		Model model = ClassicalBUtils.openUMLModel(file);
		
		HtmlGenerator generator = new HtmlGenerator();
		try {
			Util.writeProjectFile(file.getProject(), file.getProjectRelativePath().removeLastSegments(1), "report.html", generator.generate(model).toString());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return null;
	}

}
