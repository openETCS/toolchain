package org.openetcs.sysml2b.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.openetcs.sysml2b.transformation.common.main.M_MainSysMLTransform;

public class TransformToClassicalB extends AbstractHandler {
	
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
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
			File folder = new File("/B_code/B_modules/");
			
			M_MainSysMLTransform transform;
			try {
				transform = new M_MainSysMLTransform(eobj, folder, arguments);
				
				System.out.println("** Start transformation **");
				transform.doGenerate(null);
				System.out.println("** End transformation **");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
