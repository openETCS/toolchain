package org.openetcs.sysml2b.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
//import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
//import org.eclipse.papyrus.infra.emf.utils.ResourceUtils;
import org.eclipse.ui.handlers.HandlerUtil;
//import org.eclipse.uml2.uml.Model;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.openetcs.sysml2b.transformation.common.main.M_MainSysMLTransform;
//import org.openetcs.common.Util;
//import org.openetcs.common.IOUtil;

public class TransformToClassicalB extends AbstractHandler {
	
	@Override
	public boolean isEnabled() {
		return super.isEnabled();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null) {
			// Extract model's EObject from event
			IStructuredSelection structured_selection = (IStructuredSelection)selection;
			EObject eobj = EMFHelper.getEObject(structured_selection.getFirstElement());
			
			// Apply SysML2B transformation on EObject
			List<String> arguments = new ArrayList<String>();
			File folder = new File("B_code/"); // FIXME: we should ask user where to save the generated B code
			
			// get the IFile of the selected Model
//			Model UMLModel = Util.createUMLModel();
//			System.out.println(UMLModel);
//			IFile modelIFile = ResourceUtils.getFile(UMLModel.eResource());
//			System.out.println(modelIFile);
			
			try {
				// FIXME: Add a way to decide if we want to generate implementation skeleton or not
				M_MainSysMLTransform transform = new M_MainSysMLTransform(eobj, folder, arguments);
				
				System.out.println("** Start transformation **");
				//System.out.println(EMFHelper.getContainmentPath(eobj));
				transform.doGenerate(null);
				System.out.println("** End transformation **");

				// Display a message to the user
				MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Transformation to Classical B", "Transformation to B done");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
