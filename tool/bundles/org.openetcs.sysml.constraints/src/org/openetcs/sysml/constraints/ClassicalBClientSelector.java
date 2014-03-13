package org.openetcs.sysml.constraints;

import org.eclipse.emf.validation.model.IClientSelector;

public class ClassicalBClientSelector implements IClientSelector {

	public static boolean running = false;
	
	@Override
	public boolean selects(Object object) {
		// TODO Auto-generated method stub
		return running;
	}

}
