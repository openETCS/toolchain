package org.openetcs.common;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.papyrus.sysml.util.SysmlResource;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openetcs.sysml.constraints.ClassicalBClientSelector;

public class Util {
	public static Model createUMLModel() {
		return UMLFactory.eINSTANCE.createModel();
	}
	
	public static Profile getSysMLProfile() {
		ResourceSet rs = new ResourceSetImpl();

		return UMLUtil.load(rs, 
				URI.createURI(SysmlResource.SYSML_PROFILE_URI), 
				UMLPackage.Literals.PROFILE);
	}
	
	public static void applyProfile(Model umlModel, Profile umlProfile) {
		umlModel.applyProfile(umlProfile);
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
}
