package org.openetcs.sysml.report

import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.PrimitiveType

class HtmlGenerator {
	def generate(Model model)'''
	<html><body>
	<h1>Report for «model.name»</h1>
	<table border=1>
	<tr>
		<th>Name</td>
		<th>Location</td>
		<th>Comment</td>
	</tr>
	«FOR e : model.allOwnedElements»
	«IF e instanceof PrimitiveType»
	«val ne = e as PrimitiveType»
	<tr>
		<td>«ne.name»</td>
		<td>«ne.qualifiefdLocation»</td>
		<td>TODO</td>
	</tr>
	«ENDIF»
	«ENDFOR»
	</table>
	</body></html>
	'''
	
	def String qualifiefdLocation(PrimitiveType type) {
		val String location = type.qualifiedName
		val String newlocation = location.substring(0, location.lastIndexOf("::"))
		
		return newlocation
	}
	
}
