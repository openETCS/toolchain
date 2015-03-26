package org.openetcs.sysml2scade.suite.transformation

import com.esterel.scade.api.CallExpression
import com.esterel.scade.api.Equation
import com.esterel.scade.api.IdExpression
import com.esterel.scade.api.NamedType
import com.esterel.scade.api.OpCall
import com.esterel.scade.api.Operator
import com.esterel.scade.api.Package
import com.esterel.scade.api.Variable
import com.esterel.scade.api.pragmas.editor.Edge
import com.esterel.scade.api.pragmas.editor.EquationGE
import com.esterel.scade.api.pragmas.editor.PresentationElement
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.papyrus.sysml.blocks.Block
import org.eclipse.papyrus.sysml.portandflows.FlowDirection
import org.eclipse.papyrus.sysml.portandflows.FlowPort
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Connector
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Property
import org.eclipse.xtext.xbase.lib.Functions.Function1

class UpdateScade extends AbstractMapper {

	private Resource sysmlResource

	protected new(Model model, IProject project, Trace tracefile) {
		super(model, project, tracefile)
		sysmlResource = model.eResource
	}

	override protected loadProject() {
		return getProject(projectURI, scadeResourceSet)
	}

	override protected loadTypePackage() {
		return scadeModel.packages.findFirst["DataDictionary".equals(it.name)]
	}

	/**
	 * Updates a SCADE model according to the {@code model} by calling the various methods for deleting, creating, updating and moving
	 * the different elements of the model. After this new diagrams are generated. This does not apply to elements of type 
	 * {@link Connector}.
	 */
	protected def progressUpdate() {
		mapScadeModel()
		var removed = new LinkedList<String>
		for (id : tracefile.getAllSourceIDs()) {
			if (sysmlResource.getEObject(id) === null) {
				removed.add(id)
			}
		}
		var newPorts = new LinkedList<FlowPort>
		var newProperties = new LinkedList<Property>
		var moved = new LinkedList<EObject>
		var blockInstances = new HashMap<String, LinkedList<Property>>
		sysmlModel.searchForNewAndMovedElements(newPorts, newProperties, moved, blockInstances)
		var dispensableVariables = deleteElements(removed, blockInstances)
		for (id : removed) {
			tracefile.removeElement(id)
		}
		updateElements(blockInstances)
		addPorts(newPorts)
		addEquations(newProperties, blockInstances)
		dispensableVariables.addAll(moveElements(moved, blockInstances))
		cleanupLocals(dispensableVariables)
		new GenerateDiagram().updateGraphical(oidToScadeElementMap.values.filter[it instanceof Operator].map[it as Operator])

		saveProject(createEmptyScadeProject(projectURI, scadeResourceSet))
	}

	/**
	 * Puts all packages, operators, ports and equations of {@link AbstractMapper#scadeModel} into a map with their OIDs as key and the
	 * element itself as value
	 */
	private def void mapScadeModel() {
		var packages = new LinkedList<Package>
		packages.addAll(scadeModel.packages)
		var Package package
		while (packages.size > 0) {
			package = packages.pop()
			packages.addAll(package.packages)
			oidToScadeElementMap.put(package.oid, package)
			for (operator : package.operators) {
				oidToScadeElementMap.put(operator.oid, operator)
				oidToScadeElementMap.putAll(operator.inputs.toMap[it.oid])
				oidToScadeElementMap.putAll(operator.outputs.toMap[it.oid])
				oidToScadeElementMap.putAll(operator.data.toMap[it.oid])
			}
		}
	}

	/**
	 * 
	 */
	private def deleteElements(List<String> removed, HashMap<String, LinkedList<Property>> blockInstances) {
		val dispensableVariables = new LinkedList<Variable>
		for (id : removed) {
			var targets = tracefile.getTargetIDs(id)
			for (target : targets) {
				val scadeObject = oidToScadeElementMap.get(target)
				if (scadeObject instanceof Package) {
					scadeObject.owningPackage.packages.remove(scadeObject)
					scadeModel.packages.remove(scadeObject)
				} else if (scadeObject instanceof Operator) {
					scadeObject.owningPackage.operators.remove(scadeObject)
				} else if (scadeObject instanceof Variable) {
					var operator = scadeObject.operator
					var parent = tracefile.getParentID(id)
					val index = Math.max(operator.outputs.indexOf(scadeObject), operator.inputs.indexOf(scadeObject))
					if (operator.outputs.remove(scadeObject)) {
						operator.removeEquation(
							operator.data.findFirst [
								it instanceof Equation && (it as Equation).lefts.get(0) instanceof Variable &&
									(it as Equation).lefts.get(0).name == scadeObject.name
							] as Equation)
						blockInstances.get(parent)?.forEach [
							var local = (oidToScadeElementMap.getBySourceID(it.UUID) as Equation).removeOutput(index)
							dispensableVariables.add(local)
						]
					} else if (operator.inputs.remove(scadeObject)) {
						dispensableVariables.addAll(
							operator.removeEquation(
								operator.data.findFirst [
									it instanceof Equation && (it as Equation).right instanceof IdExpression &&
										((it as Equation).right as IdExpression).path.name == scadeObject.name
								] as Equation))
						blockInstances.get(parent)?.forEach [
							(oidToScadeElementMap.getBySourceID(it.UUID) as Equation).removeInput(index)
						]
					}
				} else if (scadeObject instanceof Equation) {
					var operator = oidToScadeElementMap.getBySourceID(tracefile.getParentID(id)) as Operator
					dispensableVariables.addAll(operator.removeEquation(scadeObject))
				}
			}
		}
		return dispensableVariables
	}

	/**
	 * Fetches all sourceIDs from {@link AbstractMapper#tracefile} and iterates over their targets, comparing the source and target objects
	 * and updating the target object if they differ. In the current state this applies to the names of packages, operators and ports
	 * and the types of ports.
	 */
	private def updateElements(Map<String, LinkedList<Property>> blockInstances) {
		var elementIds = tracefile.getAllSourceIDs
		for (sourceID : elementIds) {
			var sysmlElement = sysmlResource.getEObject(sourceID)
			for (targetID : tracefile.getTargetIDs(sourceID)) {
				if (sysmlElement instanceof org.eclipse.uml2.uml.Package) {
					var pkg = oidToScadeElementMap.get(targetID) as Package
					pkg.name = sysmlElement.name
				} else if (sysmlElement instanceof Class) {
					val operator = oidToScadeElementMap.get(targetID) as Operator
					if (operator.name != sysmlElement.name) {
						blockInstances.get(sourceID)?.forEach [
							var eq = (oidToScadeElementMap.getBySourceID(it.UUID) as Equation)
							var opc = (eq.right as CallExpression).operator as OpCall
							opc.operator = operator
						]
						operator.name = sysmlElement.name
					}
				} else if (sysmlElement instanceof FlowPort) {
					val port = oidToScadeElementMap.get(targetID) as Variable
					updatePort(port, sysmlElement, blockInstances.get(tracefile.getParentID(sysmlElement.UUID)))
				}
			}
		}
	}

	/**
	 * Compares the SCADE port with the SysML port and updates {@code port} if they differ.
	 * @see UpdateScade#updateElements
	 */
	private def void updatePort(Variable port, FlowPort sysmlPort, List<Property> blockInstances) {
		var parent = port.owner as Operator
		val newType = createScadeType(sysmlPort.type)
		val scadeType = (port.type as NamedType).type
		if (parent.outputs.contains(port)) {
			val name = if (sysmlPort.direction.value == FlowDirection.INOUT_VALUE) {
					INOUT_OUT_NAME_PREFIX + sysmlPort.name
				} else {
					sysmlPort.name;
				}
			if (port.name != name || scadeType != newType) {
				val equation = parent.data.findFirst [
					it instanceof Equation && (it as Equation).lefts.get(0).name == port.name
				] as Equation
				equation.lefts.get(0).name = name
				port.name = name
				val namedType = theScadeFactory.createNamedType
				namedType.setType(newType)
				port.type = namedType;
			}
		} else if (parent.inputs.contains(port)) {
			val name = if (sysmlPort.direction.value == FlowDirection.INOUT_VALUE) {
					INOUT_IN_NAME_PREFIX + sysmlPort.name
				} else {
					sysmlPort.name;
				}
			if (port.name != name || scadeType != newType) {
				val equation = parent.data.findFirst [
					if (it instanceof Equation && (it as Equation).right instanceof IdExpression) {
						return ((it as Equation).right as IdExpression).path?.name == port.name
					}
					return false
				] as Equation
				(equation.right as IdExpression).path.name = name
				var namedType = theScadeFactory.createNamedType
				namedType.setType(newType)
				var local = parent.locals.findFirst[it.name == equation.lefts.get(0).name]
				if (local != null) {
					var type = theScadeFactory.createNamedType
					type.setType(newType)
					local.type = type
				}
				port.name = name
				port.type = namedType;
				val index = parent.inputs.indexOf(port)
				blockInstances?.forEach [
					val eq = oidToScadeElementMap.getBySourceID(it.UUID) as Equation
					val operator = oidToScadeElementMap.getBySourceID(tracefile.getParentID(it.UUID)) as Operator
					val local_name = ((eq.right as CallExpression).callParameters.get(index) as IdExpression).path?.name
					if (local_name != null) {
						val l = operator.locals.findFirst[it.name == local_name]
						val type = theScadeFactory.createNamedType
						type.setType(newType)
						l.setType(type)
					}
				]
			}
		}
	}

	/**
	 * Moves {@link Package}s and {@link Operator}s within a SCADE model according
	 * to their changed positions in the SysML model. As neither {@link Property}s nor
	 * {@link FlowPort}s can be moved within the SysML model their representations in the
	 * SCADE model are not processed.
	 */
	private def moveElements(List<EObject> moved, Map<String, LinkedList<Property>> blockInstances) {
		var idList = moved.map [
			if (it instanceof Block) {
				return it.base_Class.UUID
			}
			it.UUID
		]
		var dispensable = deleteElements(idList, new HashMap<String, LinkedList<Property>>)
		for (element : moved) {
			if (element instanceof org.eclipse.uml2.uml.Package) {
				var scadePkg = oidToScadeElementMap.getBySourceID(element.UUID) as Package
				var scadeParent = oidToScadeElementMap.getBySourceID(element.eContainer.UUID) as Package
				scadeParent.packages.add(scadePkg)
				tracefile.removeElement(element.UUID)
				tracefile.addElement(element.UUID, element.eContainer.UUID, scadePkg.oid)
			} else if (element instanceof Block) {
				val operator = oidToScadeElementMap.getBySourceID(element.base_Class.UUID) as Operator
				val scadeParent = oidToScadeElementMap.getBySourceID(element.base_Class.eContainer.UUID) as Package
				scadeParent.operators.add(operator)
				tracefile.moveElement(element.base_Class.UUID, element.base_Class.eContainer.UUID)
				blockInstances.get(element.base_Class.UUID)?.forEach [
					var equation = oidToScadeElementMap.getBySourceID(it.UUID) as Equation
					var opCall = (equation.right as CallExpression).operator as OpCall;
					opCall.setOperator(operator)
				]
			}
		}
		return dispensable
	}

	/**
	 * Removes all occurrences from the {@link Variable}s in {@code list} from the SCADE model.
	 * 
	 * @param list The list of local variables to delete, the value returned by {@link Variable#getOwner()} should not be null.
	 */
	private def cleanupLocals(List<Variable> list) {
		var map = new HashMap<Operator, Set<String>>
		for (local : list) {
			var set = map.get(local.owner)
			if (set == null) {
				set = new HashSet<String>
				map.put(local.owner as Operator, set)
			}
			set.add(local.name)
		}
		for (entry : map.entrySet) {
			for (var iterator = entry.key.locals.iterator; iterator.hasNext;) {
				var element = iterator.next
				if (entry.value.contains(element.name)) {
					iterator.remove
				}
			}
			for (equation : entry.key.data.filter[it instanceof Equation].map[it as Equation]) {
				for (expression : equation.lefts) {
					if (expression instanceof IdExpression &&
						entry.value.contains((expression as IdExpression).path.name)) {
						(expression as IdExpression).path = null
					}
				}
				if (equation.right instanceof IdExpression) {
					var expression = (equation as Equation).right as IdExpression
					if (expression.path != null && entry.value.contains(expression.path.name)) {
						expression.path = null
					}
				}
			}
		}
	}

	/**
	 * Removes the output at {@code index} from {@code equation} and in its graphical representation.
	 * 
	 * @param equation The equation from which to remove the output
	 * @param The index of the output
	 */
	private def static Variable removeOutput(Equation equation, int index) {
		val local = equation.lefts.remove(index).name
		val ge_index = index + 1
		val parent = equation.owner as Operator
		parent.removeGraphical [
			if (it instanceof Edge) {
				if (it.srcEquation.equation.oid == equation.oid) {
					if (it.leftVarIndex == ge_index) {
						return true
					} else if (it.leftVarIndex > ge_index) {
						it.leftVarIndex = it.leftVarIndex - 1
					}
				}
			}
			return false
		]
		return parent.locals.findFirst[it.name == local]
	}

	/**
	 * Removes the input at {@code index} from {@code equation} and in its graphical representation.
	 * 
	 * @param equation The equation from which to remove the input
	 * @param The index of the input
	 */
	private def static void removeInput(Equation equation, int index) {
		(equation.owner as Operator).removeGraphical [
			if (it instanceof Edge) {
				if (it.dstEquation.equation.oid == equation.oid) {
					if (it.rightExprIndex == index + 1) {
						return true
					} else if (it.rightExprIndex > index + 1) {
						it.rightExprIndex = it.rightExprIndex - 1
					}
				}
			}
			return false
		]
	}

	/**
	 * Removes {@code equation} from {@code parent}, the corresponding {@link EquationGE} and
	 * all objects of type {@link Edge} connected to it. Furthermore all the
	 * {@link Variable} which represents the outputs of {@code equation} are returned.
	 * 
	 * @param parent The operator from which to remove {@code equation}
	 * @param equation The equation which to remove
	 * @return List of {@link Variable} which represents the outputs of {@code equation}
	 */
	private def static List<Variable> removeEquation(Operator parent, Equation equation) {
		parent.data.remove(equation)
		var params = new HashSet<String>(equation.lefts.map[it.name])
		var dispensable = new LinkedList<Variable>
		for (local : parent.locals) {
			if (params.contains(local.name)) {
				dispensable.add(local)
			}
		}
		parent.removeGraphical [
			if (it instanceof EquationGE) {
				return it.equation.oid == equation.oid
			} else if (it instanceof Edge) {
				return it.srcEquation.equation.oid == equation.oid || it.dstEquation.equation.oid == equation.oid
			}
			return false
		]
		return dispensable
	}

	/**
	 * Iterates over all PresentationElements of {@code operator} and applies {@code predicate} to them. If {@predicate} returns
	 * {@code true} the element is removed. The PresentationElements may be altered by {@code predicate}.
	 * 
	 * @param operator The operator which elements are iterated
	 * @param predicate The predicate which determinants if an element is removed. May apply changes to elements
	 */
	private def static void removeGraphical(Operator operator, Function1<PresentationElement, Boolean> predicate) {
		for (pragma : operator.pragmas) {
			if (pragma instanceof com.esterel.scade.api.pragmas.editor.Operator) {
				for (diagram : pragma.diagrams) {
					for (var iterator = diagram.presentationElements.iterator; iterator.hasNext;) {
						var element = iterator.next
						if (predicate.apply(element)) {
							iterator.remove
						}
					}
				}
			}
		}
	}
}