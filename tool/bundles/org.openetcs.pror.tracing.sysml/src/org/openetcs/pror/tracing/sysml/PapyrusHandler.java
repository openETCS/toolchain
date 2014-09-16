/**
 * Copyright 2014 Formal Mind GmbH & CEA list
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
 *     Michael Jastram, formal Mind Gmbh - initial API and implementation
 *     Patrick Tessier, CEA list - SysML & Papyrus proxy action
 *     Matthieu Perin, CEA list - SysML & Papyrus proxy action
 */
package org.openetcs.pror.tracing.sysml;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.openetcs.pror.tracing.util.ProxyListener;

public class PapyrusHandler implements ProxyListener {

	protected static final String PROXY_PACKAGE_NAME = "ProxyRequirement";
	String PREFIX_MESSAGE = "SysML Proxy code :";

	public void proxyCreatedFor(final SpecObject requirement, final SpecRelation trace,
			EObject element) {
		
		//test inputs correctness

		if (requirement == null){
			System.out.println(PREFIX_MESSAGE+"Incorrect given requirement");
			return;
			//no action taken
		}
		
		if (trace == null) {
			System.out.println(PREFIX_MESSAGE+"Incorrect given relation");
			return;
			// no action taken
		}
		
		
		if (!(element instanceof Element)) {
			System.out.println(PREFIX_MESSAGE+"Incorrect given element");
			return;
			// no action taken
		}
		
		final Element UmlElement = (Element)element;
		
		TransactionalEditingDomain tempDomain = null;	
		try {
		    tempDomain  = ServiceUtilsForEObject.getInstance().getTransactionalEditingDomain(UmlElement);
		} catch (ServiceException e) {
		    System.err.println(e);
		}
		
		//test for the domain
		if (null == tempDomain){
			System.out.println(PREFIX_MESSAGE+"Editing Domain is null");
			return;
			//no action taken
		}
		
		final TransactionalEditingDomain domain = tempDomain;
		
		//open a command do allow undo of all command in one undo
		

		RecordingCommand CompleteCMD = new RecordingCommand(domain) {
	
			protected void doExecute() {			

				//get top package
				org.eclipse.uml2.uml.Package topPackage = UmlElement.getNearestPackage();
				
				while (topPackage.getOwner() instanceof Package){
					topPackage = (Package)topPackage.getOwner();
					//recursively take nearest package until reaching the top 
				}
				
				final org.eclipse.uml2.uml.Package finalTopPackage = topPackage;
				
				//test the presence of the "ProxyRequirement" Package
				
				Package proxyPackage = (Package)topPackage.getPackagedElement(PROXY_PACKAGE_NAME); 
				
				//test if already present, if not need creation
				
				if (proxyPackage == null){
					//means that the package have to be created
					
					RecordingCommand PackCMD = new RecordingCommand(domain) {
						
						@Override
						protected void doExecute() {
							org.eclipse.uml2.uml.Package tempPackage = UMLFactory.eINSTANCE.createPackage();
							tempPackage.setName(PROXY_PACKAGE_NAME);
							finalTopPackage.getPackagedElements().add(tempPackage);
						}
					};
					
					domain.getCommandStack().execute(PackCMD);
					
				}
				
				final Package finalProxyPackage = (Package)topPackage.getPackagedElement(PROXY_PACKAGE_NAME);
				
				RecordingCommand ReqCMD = new RequirementCreateCommand(domain, finalProxyPackage, requirement.getIdentifier(), requirement.getDesc());
				
				domain.getCommandStack().execute(ReqCMD);
				
				org.eclipse.uml2.uml.Class proxyreq = (org.eclipse.uml2.uml.Class)finalProxyPackage.getPackagedElement(requirement.getIdentifier()); 
				
				RecordingCommand SatCMD = new SatisfyCreateCommand(domain, (NamedElement)UmlElement, (NamedElement)proxyreq, trace.getIdentifier());
				
				domain.getCommandStack().execute(SatCMD);
		
				System.out.println("Link between");
				System.out.println("  Requirement: " + requirement);
				System.out.println("          via: " + trace);
				System.out.println("  UML Element : " + UmlElement);
				System.out.println("Proxy Req ID: " + requirement.getIdentifier());
				System.out.println("Proxy Req Text: " + requirement.getDesc());
				System.out.println("Proxy Satisfy Link ID: " + trace.getIdentifier());
			
			}

		};

		//execute the complete command
		domain.getCommandStack().execute(CompleteCMD);
	}
}
