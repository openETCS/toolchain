package de.fraunhofer.esk.openetcs.sysml2b.transformation

import org.eclipse.core.resources.IProject
import ClassicalB.BAbstractMachine
import ClassicalB.BOperation
import ClassicalB.BParameter
import org.eclipse.emf.common.util.EList
import java.io.ByteArrayInputStream
import org.eclipse.core.runtime.NullProgressMonitor

class MapToText {
	def void create(ClassicalB.Project bProject, IProject eclipseProject) {
		eclipseProject.open(new NullProgressMonitor)
		
		for (m : bProject.machines) {
			var file = eclipseProject.getFile(m.name + ".mch")
			var source = new ByteArrayInputStream(createAbstractMachine(m).toString.bytes)
			file.create(source, true, null)
		}
	}
	
	def createAbstractMachine(BAbstractMachine machine)'''
	/*
	 * File is automatically generated. Do not edit.
	 *
	 */
	
	MACHINE
		«machine.name»
		
	«IF !machine.sees.empty»
	SEES
		«FOR m : machine.sees SEPARATOR ', '»«m.name»«ENDFOR»
	«ENDIF»
	«IF !machine.includes.empty»
	INCLUDES
		«FOR i : machine.includes SEPARATOR ', '»«i.name»«ENDFOR»
	«ENDIF»
	«IF !machine.promotes.empty»
	PROMOTES
		«FOR p : machine.promotes SEPARATOR ',\n'»«p.name»«ENDFOR»
	«ENDIF»
	«IF !machine.extends.empty»
	EXTENDS
		«FOR e : machine.extends SEPARATOR ', '»«e.name»«ENDFOR»
	«ENDIF»
	«IF !machine.uses.empty»
	USES
		«FOR u : machine.uses SEPARATOR ', '»«u.name»«ENDFOR»
	«ENDIF»
	«IF !machine.sets.empty»
	SETS
		«FOR s : machine.sets SEPARATOR ';\n'»«s.name»«ENDFOR»
	«ENDIF»
	«IF !machine.concreteConstants.empty»
	CONCRETE_CONSTANTS
		«FOR c : machine.concreteConstants SEPARATOR '&\n'»«ENDFOR»
	«ENDIF»
	«IF !machine.concreteVariables.empty»
	CONCRETE_VARIABLES
		«FOR v : machine.concreteVariables SEPARATOR ',\n'»«v.name»«ENDFOR»
	
	«ENDIF»
	«IF !machine.operations.empty»
	OPERATIONS
		«FOR o : machine.operations»
		«IF !o.outParameters.empty»«FOR p : o.outParameters SEPARATOR ', '»«p.name»«ENDFOR» <-- «ENDIF»«o.name»«IF !o.inParameters.empty» («FOR p : o.inParameters SEPARATOR ', '»«p.name»«ENDFOR»)«ENDIF» =
		«IF !o.outParameters.empty || !o.inParameters.empty»
		PRE
			«FOR p : o.allParameters SEPARATOR ' &'»
			«p.name» : «p.type.name»
			«ENDFOR»
		THEN
			skip
		END;

		«ELSE»
		BEGIN
			skip
		END;

		«ENDIF»
		«ENDFOR»
	«ENDIF»
	END
	'''
	
	def EList<BParameter> allParameters(BOperation operation) {
		var list = operation.outParameters
		list.addAll(operation.inParameters)
		
		return list
	}
	
}