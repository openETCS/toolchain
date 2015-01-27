package org.openetcs.sysml2scade.suite.transformation;

import org.eclipse.core.resources.IProject;
import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.uml2.uml.Model;

public class Transformation {
	private IProject project;
	
	public Transformation(IProject project) {
		this.project = project;
	}

	public void generateAndWrite(Model sysmlModel) {

		MapToScade mapper = new MapToScade(sysmlModel, project);
		

		
		// Perform the actual SysML to SCADE Transformation
		mapper.fillScadeModel();
	}
	
	public void generateAndWrite(Block block, String projectName) {
		MapToScade mapper = new MapToScade(block, project, projectName);
		
		mapper.fillScadeModel();
	}

}
