package org.openetcs.sysml.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.NamedElement;

public class NameIsValidClassicalBIdentifier extends AbstractModelConstraint {
	@Override
	public IStatus validate(IValidationContext ctx) {
		NamedElement element = (NamedElement) ctx.getTarget();
		String name = element.getName();
		
		if (name != null && !name.matches("[a-zA-Z][a-zA-Z0-9_]*")) {
			return ctx.createFailureStatus("The name '" + name + "' is not a valid Classical B identifier");
		}

		return ctx.createSuccessStatus();
	}
}
