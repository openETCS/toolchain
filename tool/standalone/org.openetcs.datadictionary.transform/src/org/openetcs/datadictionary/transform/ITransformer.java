package org.openetcs.datadictionary.transform;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Bitwalker transformation interface.
 */
public interface ITransformer {
	
	/** Disable logging. */
	public static final int LOG_NO_LOG = 0;
	
	/** Log errors */
	public static final int LOG_ERROR = 1;
	
	/** Log warking and errors */
	public static final int LOG_WARN = 2;
	
	/** Log info, warnings and errors */
	public static final int LOG_INFO = 3;
	
	/** Log all. */
	public static final int LOG_VERBOSE = 4;
	
	/**
	 * Run the transformation.
	 * 
	 * Creates a project containing a SysML model, then populates it with data from provided subset files.
	 * 
	 * @param projectName name of the project
	 * @param modelName	 name of the model
	 * @param files array of subset files
	 * @param monitor progress monitor
	 * @param log_level logging level to be used.
	 * @return true on success
	 */
	boolean transform(String projectName, String modelName, String[] files, IProgressMonitor monitor, int log_level);
	
}
