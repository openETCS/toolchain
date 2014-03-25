package de.fraunhofer.esk.openetcs.sysml2b.transformation

import org.eclipse.uml2.uml.StateMachine
import org.eclipse.uml2.uml.Region
import org.eclipse.emf.common.util.EList

class BMapping {
	def createStateMachine(StateMachine sm)'''
	MACHINE
		«sm.name»
	SETS
		_States = {}
	VARIABLES
		_s
	INVARIANT
		_s : _States
	INITIALISATION
		_s := «getInitialStates(sm.getRegions())»
	OPERATIONS

	END
	'''
	
	def getTransitions(EList<Region> list) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def getInitialStates(EList<Region> r) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
		
}