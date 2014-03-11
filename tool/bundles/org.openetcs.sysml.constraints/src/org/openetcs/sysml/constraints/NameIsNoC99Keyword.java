package org.openetcs.sysml.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.NamedElement;

public class NameIsNoC99Keyword extends AbstractModelConstraint {
	private static String[] keywords = {
		"auto",
		"break",
		"case",
		"char",
		"const",
		"continue",
		"default",
		"do",
		"double",
		"else",
		"enum",
		"extern",
		"float",
		"for",
		"goto",
		"if",
		"inline",
		"int",
		"long",
		"register",
		"restrict",
		"return",
		"short",
		"signed",
		"sizeof",
		"static",
		"struct",
		"switch",
		"typedef",
		"union",
		"unsigned",
		"void",
		"volatile",
		"while",
		"_Alignas",
		"_Alignof",
		"_Atomic",
		"_Bool",
		"_Complex",
		"_Generic",
		"_Imaginary",
		"_Noreturn",
		"_Static_assert",
		"_Thread_local"};

	
	
	public IStatus validate(IValidationContext ctx) {
		NamedElement element = (NamedElement) ctx.getTarget();
		
		for (String keyword : keywords) {
			String name = element.getName();
			if (name != null && name.equals(keyword)) {
				return ctx.createFailureStatus("The name '" + keyword + "' is a reserved C99 keyword");
			}
		}
		
		return ctx.createSuccessStatus();
	}
}
