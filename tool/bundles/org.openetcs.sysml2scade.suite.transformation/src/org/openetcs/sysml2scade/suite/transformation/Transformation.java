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
		ResourceSet resourceSet = new ResourceSetImpl();
		URI baseURI = URI.createFileURI(project.getLocation().toOSString());
		URI projectURI = baseURI.appendSegment(sysmlModel.getName() + ".etp");
		
		// Create empty SCADE project
		Project project = MapToScade.createEmptyScadeProject(projectURI, resourceSet);
		
		// Load the create SCADE project
		Package mainModel = MapToScade.loadModel(projectURI, resourceSet);
		
		// Perform the actual SysML to SCADE Transformation
		MapToScade.fillScadeModel(mainModel, sysmlModel, baseURI);
		
		// Put annotations in correct .ann file
		MapToScade.rearrangeAnnotations(mainModel);
		
		// Ensure project contains appropriate FileRefs
		MapToScade.updateProjectWithModelFiles(project);
		
		// Save the project
		MapToScade.saveAll(project, null);
	}

}
