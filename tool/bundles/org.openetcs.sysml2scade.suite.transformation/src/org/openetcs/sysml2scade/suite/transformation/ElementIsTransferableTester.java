package org.openetcs.sysml2scade.suite.transformation;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

public class ElementIsTransferableTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		EObject object = EMFHelper.getEObject(receiver);
		if (object instanceof Model) {
			return true;
		}
		else if (object instanceof Element) {
			Element element;
			if (object instanceof Property) {
				element = ((Property) object).getType();
			} else {
				element = (Element) object;
			}
			Stereotype stereotype = element.getAppliedStereotype("SysML::Blocks::Block");
			if (stereotype != null) {
				return true;
			}
		}
		return false;
	}
}
