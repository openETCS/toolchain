package de.fraunhofer.esk.openetcs.sysml2b.common;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.uml2.uml.Model;
import org.openetcs.sysml.constraints.ClassicalBClientSelector;

public class ClassicalBUtils {
	public static Model openUMLModel(IFile file) {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createURI(file.getFullPath().toString());
		Resource resource = resourceSet.getResource(uri, true);
		Model model = (Model) resource.getContents().get(0);
		
		return model;
	}
	
	public static Model openPapyrusFile(IPapyrusFile file) {
		return openUMLModel(getUMLFile(file));
	}
	
	public static IStatus validateModel(Model model) {
		ClassicalBClientSelector.running = true;

		IBatchValidator validator = (IBatchValidator)ModelValidationService.getInstance()
			.newValidator(EvaluationMode.BATCH);
		validator.setIncludeLiveConstraints(true);

		IStatus status = validator.validate(model);

		ClassicalBClientSelector.running = false;
		
		return status;
	}
	
	public static IFile getUMLFile(IPapyrusFile file) {
		IResource[] ressources = file.getAssociatedResources();
		
		for (IResource res : ressources) {
			if (res.getFileExtension().equals("uml")) {
				return (IFile) res;
			}
		}
		
		return null;
	}
	
	public static boolean isSysMLModel(Model model) {
		// TODO: implement
		return false;
	}
}
