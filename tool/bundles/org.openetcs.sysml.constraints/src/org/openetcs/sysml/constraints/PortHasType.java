package org.openetcs.sysml.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Port;

public class PortHasType extends AbstractModelConstraint {
	public IStatus validate(IValidationContext ctx) {
		Port parameter = (Port) ctx.getTarget();
		
		if (parameter.getType() == null) {
			return ctx.createFailureStatus("The Port '" + parameter.getName() + "' has no associated type");
		}
		
		return ctx.createSuccessStatus();
	}
}
