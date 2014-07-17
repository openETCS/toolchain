/*****************************************************************************
 * Copyright (c) 2011,2014 CEA LIST.
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
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;

/**
 * 
 * Creation routine for requirement  
 * 
 */

public class RequirementCreateCommand extends RecordingCommand {
	
	/** Qualified name of the stereotype Requirement */
	public static final String REQUIREMENT_STEREOTYPE = "SysML::Requirements::Requirement";
	/**  name of property text of the stereotype Requirement */
	public static final String REQUIREMENT_TEXT_ATT = "text";
	/**  name of property id of the stereotype Requirement */
	public static final String REQUIREMENT_ID_ATT = "id";
	
	protected Element selectedElement;
	
	protected String id ="";
	protected String text ="";

	
	/**
	 * Creator for Creation Command
	 * 	@param id must be a String <b>if null</b> then changed in "null"
	 * 	@param text must be a String <b>if null</b> then changed in "null"
	 * 
	 */
	public RequirementCreateCommand(TransactionalEditingDomain domain,
			Element selectedElements, String id, String text) {
		super(domain, "DarwinRequirementCreateCommand");
		this.selectedElement = selectedElements;
	
		if (id == null){
			this.id = "null";
		} else {
			this.id = id;
		}
	
		if (id == null){
			this.text = "null";
		} else {
			this.text = text;
		}

	}

	protected void createRequirement(org.eclipse.uml2.uml.Package owner, String id,
			String text) {
		org.eclipse.uml2.uml.Class requirement = owner.createOwnedClass(
				"tmpName", false);
		Stereotype reqStereotype = requirement
				.getApplicableStereotype(REQUIREMENT_STEREOTYPE);
		requirement.applyStereotype(reqStereotype);
		requirement.setName(id);
		requirement.setValue(reqStereotype,
				REQUIREMENT_ID_ATT, id);
		requirement.setValue(reqStereotype, 
				REQUIREMENT_TEXT_ATT, text);

	}

	@Override
	protected void doExecute() {
		if (selectedElement instanceof Package) {
			createRequirement((Package) selectedElement, id, text);
		}

	}

}