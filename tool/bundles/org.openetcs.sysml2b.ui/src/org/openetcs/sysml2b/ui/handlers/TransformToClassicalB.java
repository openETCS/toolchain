package org.openetcs.sysml2b.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

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
			IStructuredSelection structured_selection = (IStructuredSelection)selection;
			EObject eobj = EMFHelper.getEObject(structured_selection.getFirstElement());
			
			System.out.println(eobj);
		}
		
		return null;
	}

}
