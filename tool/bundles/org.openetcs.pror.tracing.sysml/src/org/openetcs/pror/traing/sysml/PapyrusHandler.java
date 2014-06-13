/**
 * Copyright 2014 Formal Mind GmbH.
 * 
 * Licensed under the European Union Public Licence (EUPL), Version 1.1 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 */
package org.openetcs.pror.traing.sysml;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.uml2.uml.Element;
import org.openetcs.pror.tracing.util.ProxyListener;

public class PapyrusHandler implements ProxyListener {

	@Override
	public void proxyCreatedFor(SpecObject requirement, SpecRelation trace,
			EObject element) {
		if (element instanceof Element) {
			System.out.println("Link between");
			System.out.println("  Requirement: " + requirement);
			System.out.println("          via: " + trace);
			System.out.println("  UML Element: " + element);
			// TODO: Here we need code to create a proxy element in Papyrus
			// You can use RMF-Methods to extract all kind of useful information.
			// For instance:
			System.out.println("Internal ID: " + requirement.getIdentifier());
			System.out.println("Attribute named 'Description': " + ReqIF10Util.getAttributeValueForLabel(requirement, "Description"));
		}
	}
	

}
