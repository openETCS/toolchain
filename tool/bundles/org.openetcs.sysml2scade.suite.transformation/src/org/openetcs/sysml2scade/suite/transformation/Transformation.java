package org.openetcs.sysml2scade.suite.transformation;

import java.io.File;

import com.esterel.project.api.Project;
import com.esterel.scade.api.OperatorKind;
import com.esterel.scade.api.Package;
import com.esterel.scade.api.ScadeFactory;
import com.esterel.scade.api.ScadePackage;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;

public class Transformation {
	private Model sysmlModel;
	private IProject project;
	
	public Transformation(Model model, IProject project) {
		this.project = project;
		sysmlModel = model;
	}

	public void generateAndWrite() {

		MapToScade mapper = new MapToScade(sysmlModel, project);
		

		
		// Perform the actual SysML to SCADE Transformation
		mapper.fillScadeModel();
	}

}
