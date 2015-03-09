package org.openetcs.sysml2scade.suite.transformation;

import org.eclipse.core.resources.IProject;
import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.uml2.uml.Model;

public class Transformation {
	private IProject project;
	
	public Transformation(IProject project) {
		this.project = project;
	}

	public void generateAndWrite(Model sysmlModel, Trace tracefile) {

		MapToScade mapper = new MapToScade(sysmlModel, project, tracefile, false);
		

		
		// Perform the actual SysML to SCADE Transformation
		mapper.fillModel(sysmlModel);
	}
	
	public void generateAndWrite(Block block, String projectName, Trace tracefile) {
		MapToScade mapper = new MapToScade(block, project, projectName, tracefile);
		
		mapper.fillScadeModel();
	}
	
	public void update(Model sysmlModel, Trace tracefile) {
		MapToScade mapper = new MapToScade(sysmlModel, project, tracefile, true);
		mapper.progressUpdate(sysmlModel);
	}

}
