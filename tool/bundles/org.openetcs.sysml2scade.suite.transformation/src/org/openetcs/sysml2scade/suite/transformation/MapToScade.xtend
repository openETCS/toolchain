package org.openetcs.sysml2scade.suite.transformation

import com.esterel.scade.api.CallExpression
import com.esterel.scade.api.Equation
import com.esterel.scade.api.IdExpression
import com.esterel.scade.api.Operator
import com.esterel.scade.api.Package
import com.esterel.scade.api.Variable
import java.util.HashMap
import java.util.LinkedList
import java.util.Map
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.papyrus.sysml.portandflows.FlowDirection
import org.eclipse.papyrus.sysml.portandflows.FlowPort
import org.eclipse.uml2.uml.Connector
import org.eclipse.uml2.uml.ConnectorEnd
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Property

class MapToScade extends AbstractMapper {

	private XMLResource sysmlResource;
	private Package sysmlPackage;

	new(Model model, IProject project, Trace trace) {
		super(model, project, trace)
		sysmlResource = model.eResource as XMLResource
	}
	
	override protected loadProject() {
		return createEmptyScadeProject(projectURI, scadeResourceSet)
	}
	
	override protected loadTypePackage() {
		var typePackage = createScadePackage("DataDictionary")
		val resource = createXScade("DataDictionary")
		resource.getContents().add(typePackage)
		return typePackage
	}

	/**
	 * Transfers {@code model} to SCADE by creating an empty SCADE project and use the update mechanism to transfer the contents.
	 * 
	 * @param model The {@link Model} which to transfer
	 */
	def void fillModel(Model model) {
		sysmlPackage = createScadePackage(scadeModel.name)
		scadeModel.getPackages().add(typePackage)
		scadeModel.getPackages().add(sysmlPackage)

		var newPorts = new LinkedList<FlowPort>
		var newProperties = new LinkedList<Property>
		var blockInstances = new HashMap<String, LinkedList<Property>>
		var modelElements = new HashMap
		model.searchForNewAndMovedElements(modelElements, newPorts, newProperties, new LinkedList, blockInstances)
		addPorts(newPorts, modelElements)
		addEquations(newProperties, modelElements, blockInstances)

		addConnectors(modelElements)
		new GenerateDiagram().createGraphical(modelElements.values.filter[it instanceof Operator].map[it as Operator])

		tracefile.save

		// Put annotations in correct .ann file
		rearrangeAnnotations(scadeModel);

		// Ensure project contains appropriate FileRefs
		updateProjectWithModelFiles(scadeProject);

		// Save the project
		saveAll(scadeProject, null);
	}

	/**
	 * Adds the connectors to a newly created SCADE model.
	 * 
	 * @param scadeElements A map from the OIDs to all Packages, Operators, Ports and Equations of the SCADE model
	 */
	def addConnectors(HashMap<String, EObject> scadeElements) {
		var connectors = sysmlResourceSet.allContents.filter[it instanceof Connector].map[it as Connector]
		var inEnds = new LinkedList<ConnectorEnd>
		while (connectors.hasNext) {
			var connector = connectors.next
			var end = connector.ends.get(0)
			var direction = end.flowPort.direction.value
			if (direction == FlowDirection.INOUT_VALUE) {
				inEnds.addAll(connector.ends)
			} else if ((direction == FlowDirection.IN_VALUE) == (end.partWithPort != null)) {
				inEnds.add(end)
			} else {
				inEnds.add(end.oppositeEnd)
			}
		}
		for (end : inEnds) {
			var idexpression = fetchIdexpression(scadeElements, end)
			var Variable local
			val oppositeEnd = end.oppositeEnd
			if (oppositeEnd.partWithPort == null) {
				val operator = scadeElements.getBySourceID(oppositeEnd.flowPort.base_Port.eContainer.UUID) as Operator
				val input = scadeElements.get(
					tracefile.getTargetIDs(oppositeEnd.flowPort.UUID).findFirst [
					operator.inputs.contains(scadeElements.get(it))
				]) as Variable
				var equation = operator.data.findFirst [
					if (it instanceof Equation) {
						var expression = it.right
						if (expression instanceof IdExpression) {
							return expression.path.name == input.name
						}
					}
					return false
				] as Equation
				local = equation.lefts.get(0)
			} else {
				val operator = scadeElements.getBySourceID(oppositeEnd.flowPort.base_Port.eContainer.UUID) as Operator
				var ids = tracefile.getTargetIDs(oppositeEnd.flowPort.UUID)
				var index = -1
				for (var i = 0; index == -1 && i < ids.size; i++) {
					index = operator.outputs.indexOf(scadeElements.get(ids.get(i)))
				}
				val equation = scadeElements.getBySourceID(oppositeEnd.partWithPort.UUID) as Equation
				local = equation.lefts.get(index)
			}
			idexpression.path = local
		}
	}

	/**
	 * Retrieves the {@link IdExpression} which represents the {@code end} parameter in the SCADE model.
	 * 
	 * @param scadeElements
	 * @param end The end for which the counterpart is fetched
	 * @return {@link IdExpression} which is searched
	 */
	private def IdExpression fetchIdexpression(Map<String, EObject> scadeElements, ConnectorEnd end) {
		if (end.partWithPort == null) {
			val operator = scadeElements.getBySourceID(end.flowPort.base_Port.eContainer.UUID) as Operator
			var id = tracefile.getTargetIDs(end.flowPort.UUID).findFirst [
				operator.outputs.contains(scadeElements.get(it))
			]
			val output = scadeElements.get(id) as Variable
			var equation = operator.data.findFirst [
				if (it instanceof Equation) {
					return output.name == it.lefts.get(0)?.name
				}
				return false
			] as Equation
			if (equation.right == null) {
				var idexpression = theScadeFactory.createIdExpression
				equation.right = idexpression
				return idexpression
			} else {
				return equation.right as IdExpression
			}
		} else {
			val operator = scadeElements.getBySourceID(end.flowPort.base_Port.eContainer.UUID) as Operator
			var ids = tracefile.getTargetIDs(end.flowPort.UUID)
			var index = -1
			for (var i = 0; index == -1 && i < ids.size; i++) {
				index = operator.inputs.indexOf(scadeElements.get(ids.get(i)))
			}
			val equation = scadeElements.getBySourceID(end.partWithPort.UUID) as Equation
			return (equation.right as CallExpression).callParameters.get(index) as IdExpression
		}
	}

	/**
	 * Retrieves the FlowPort to which {@code end} is connected.
	 */
	def FlowPort getFlowPort(ConnectorEnd end) {
		if (end != null && end.role != null) {
			var stereotype = end.role.getAppliedStereotype("SysML::PortAndFlows::FlowPort")
			if (stereotype != null) {
				return end.role.getStereotypeApplication(stereotype) as FlowPort
			}
		}
		return null
	}

	/**
	 * Retrieves the opposite end from the Connector which is the owner of {@code end}
	 */
	def ConnectorEnd getOppositeEnd(ConnectorEnd end) {
		var list = (end.eContainer as Connector).ends
		if (list.get(0) == end) {
			return list.get(1)
		}
		return list.get(0)
	}
}
