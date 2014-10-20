package org.openetcs.datadictionary.transform.ui.handlers;

import java.util.Arrays;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openetcs.datadictionary.transform.ITransformer;
import org.openetcs.datadictionary.transform.TransformServiceFactory;
import org.openetcs.datadictionary.transform.ui.TransformationDialog;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class TransformHandler extends AbstractHandler {

	static String[] FILE_EXTENSIONS = { "*.xml" };
	static String[] FILE_NAMES = { "Bitwalker xml" };

	/**
	 * The constructor.
	 */
	public TransformHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// open file dialog
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();		
		final TransformationDialog dialog = new TransformationDialog(shell);		
		dialog.open();
		final String[] files = dialog.getFiles();
				
		if (files != null && files.length > 0) {
			Job job = new Job("Generating DataDictionary") {
				protected IStatus run(IProgressMonitor monitor) {
					Arrays.sort(files);					
					ITransformer transformer = TransformServiceFactory.createTransformer();
					boolean res = transformer.transform(dialog.getProjectName(), dialog.getModelName(), files, monitor, ITransformer.LOG_WARN);
					return res ? Status.OK_STATUS : Status.CANCEL_STATUS;
				}
			};
			job.setPriority(Job.SHORT);
			job.schedule();
			
		}
		
		return null;
	}
}
