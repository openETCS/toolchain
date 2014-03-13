package org.openetcs.sysml.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Parameter;

public class ParameterHasType extends AbstractModelConstraint {
	public IStatus validate(IValidationContext ctx) {
		Parameter parameter = (Parameter) ctx.getTarget();
		
		if (parameter.getType() == null) {
			return ctx.createFailureStatus("The Parameter '" + parameter.getName() + "' has no associated type");
		}
		
		return ctx.createSuccessStatus();
	}
}
