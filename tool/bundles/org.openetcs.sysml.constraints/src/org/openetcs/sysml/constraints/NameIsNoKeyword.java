package org.openetcs.sysml.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.NamedElement;

public class NameIsNoKeyword extends AbstractModelConstraint {
	private static String[] keywords = {
		"ABSTRACT_VARIABLES", 
		"ANY",
		"ASSERT",
		"ASSERTIONS",
		"BE",
		"BEGIN",
		"BOOL",
		"CASE",
		"CHOICE",
		"CONCRETE_CONSTANTS",
		"CONCRETE_VARIABLES",
		"CONSTANTS",
		"CONSTRAINTS",
		"DEFINITIONS",
		"DO",
		"EITHER",
		"ELSE,",
		"ELSIF",
		"END",
		"EXTENDS",
		"FALSE",
		"FIN",
		"FIN1",
		"IF",
		"IMPLEMENTATION",
		"IMPORTS",
		"IN",
		"INCLUDES",
		"INITIALISATION",
		"INT",
		"INTEGER",
		"INTER",
		"INVARIANT",
		"LET",
		"LOCAL_OPERATIONS",
		"MACHINE",
		"MAXINT",
		"MININT",
		"NAT",
		"NAT1",
		"NATURAL",
		"NATURAL1",
		"OF",
		"OPERATIONS",
		"OR",
		"PI",
		"POW",
		"POW1",
		"PRE",
		"PROMOTES",
		"PROPERTIES",
		"REFINES",
		"REFINEMENT",
		"SEES",
		"SELECT",
		"SETS",
		"SIGMA",
		"STRING",
		"THEN",
		"TRUE",
		"UNION",
		"USES",
		"VALUES",
		"VAR",
		"VARIANT",
		"VARIABLES",
		"WHEN",
		"WHERE",
		"WHILE"};

	
	
	public IStatus validate(IValidationContext ctx) {
		NamedElement element = (NamedElement) ctx.getTarget();
		
		for (String keyword : keywords) {
			String name = element.getName();
			if (name != null && name.equals(keyword)) {
				return ctx.createFailureStatus("The name '" + keyword + "' is a reserved B keyword");
			}
		}
		
		return ctx.createSuccessStatus();
	}
}
