package org.openetcs.sysml2scade.suite.transformation;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.uml2.uml.Model;

public class Transformation {
	private Model sysmlModel;
	private IProject project;
	
	public Transformation(Model model, IProject project) {
		this.project = project;
		sysmlModel = model;
	}

	public void generateAndWrite() {
		// TODO Auto-generated method stub
		
	}

}
