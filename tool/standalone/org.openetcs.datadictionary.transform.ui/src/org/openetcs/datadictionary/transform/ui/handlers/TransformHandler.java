package org.openetcs.datadictionary.transform.ui.handlers;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.openetcs.datadictionary.transform.ITransformService;
import org.openetcs.datadictionary.transform.TransformServiceFactory;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class TransformHandler extends AbstractHandler {
	
	static String[] FILE_EXTENSIONS = {"*.xml"};
	static String[] FILE_NAMES      = {"Bitwalker xml"};
	
	/**
	 * The constructor.
	 */
	public TransformHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ITransformService transformer = TransformServiceFactory.getInstance();
		
		// open file dialog		
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		
		FileDialog dialog = new FileDialog(shell, SWT.OPEN);
		dialog.setFilterExtensions(FILE_EXTENSIONS);
		dialog.setFilterNames(FILE_NAMES);
		String file = dialog.open();
		
		if (file != null) {			
			String output = transformer.transform(file);
			
			if (output == null) {
				MessageDialog error_dialog = new MessageDialog(shell,
						                                       "Transformation Error", null,
						                                       "Unable to perform transformation", 
						                                       MessageDialog.ERROR, 
						                                       new String[] { "Continue" }, 0);
				error_dialog.open();
				return null;
			}
								
			File f = new File(output);
			IFileStore store = EFS.getLocalFileSystem().getStore(f.toURI());
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			try {
				IDE.openEditorOnFileStore(page, store);
			} catch ( PartInitException e ) {
				// TODO
			}
		}		
		
		return null;
	}
}
