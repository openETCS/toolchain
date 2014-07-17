/*****************************************************************************
 * Copyright (c) 2012,2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		CEA LIST - Initial API and implementation
 *			Patrick Tessier - initial API and implementation
 *			Matthieu Perin - tuning for project openETCS
 *
 *****************************************************************************/
package org.openetcs.pror.tracing.sysml;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;



/**
 * this command is used to create a link "satisfyBy" between requirement and namedElement
 *
 */
public class SatisfyCreateCommand extends RecordingCommand {
	private NamedElement source;
	private NamedElement target;
	private String id;
	
	/** Qualified name of the stereotype Satisfy */
	public static final String SATISFY_STEREOTYPE = "SysML::Requirements::Satisfy";
	
	/**
	 * use to make an satisfy 
	 * @param domain the domain to execute a transaction
	 * @param source the source of the satisfy (the realization)
	 * @param target the target of the satisfy (the specification)
	 * @param id the id of the satisfy, <b>if null<\b> changed in "null"
	 */
	public SatisfyCreateCommand(TransactionalEditingDomain domain, NamedElement source, NamedElement target, String id){ 
		super(domain,"Create an Abstraction");
		this.source=source;
		this.target=target;
		if (id == null){
			this.id = "null";
		} else {
			this.id = id;
		}
	}

	@Override
	protected void doExecute() {
		Abstraction tempSatisfy= UMLFactory.eINSTANCE.createAbstraction();
		target.getNearestPackage().getPackagedElements().add(tempSatisfy);
		// put the link in the same container as the target : requirement
		tempSatisfy.getSuppliers().add(target);
		tempSatisfy.getClients().add(source);
		tempSatisfy.setName(id);
		Stereotype satisfyStereotype= tempSatisfy.getApplicableStereotype(SATISFY_STEREOTYPE);
		tempSatisfy.applyStereotype(satisfyStereotype);
	}

}
