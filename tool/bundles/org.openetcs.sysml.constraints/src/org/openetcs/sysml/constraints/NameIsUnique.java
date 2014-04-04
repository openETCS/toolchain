package org.openetcs.sysml.constraints;

import java.util.HashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

public class NameIsUnique extends AbstractModelConstraint {
	@Override
	public IStatus validate(IValidationContext ctx) {
		Class uml_class = (Class) ctx.getTarget();
		Stereotype stereotype = uml_class.getAppliedStereotype("SysML::Blocks::Block");
		
		//
		// We only check SysML Blocks
		//
		if (stereotype == null) {
			return ctx.createSuccessStatus();
		}
		
		if (ctx.getCurrentConstraintData() == null) 
		{
			ctx.putCurrentConstraintData(new HashMap<String, EObject>());
		}
		
		@SuppressWarnings("unchecked")
		HashMap<String, EObject> name_map = (HashMap<String, EObject>) ctx.getCurrentConstraintData();
		
		if (name_map.containsKey(uml_class.getName())) {
			return ctx.createFailureStatus("The name '" + uml_class.getName() + "' is not unique and already used");
		} else {
			name_map.put(uml_class.getName(), ctx.getTarget());
		}
		
		return ctx.createSuccessStatus();
	}

}
