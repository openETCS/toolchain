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
	 * 
	 * @param model
	 */
	def progressUpdate(Model model) {
		var modelElements = mapScadeModel()
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
		model.searchForNewAndMovedElements(modelElements, newPorts, newProperties, moved, blockInstances)
		var dispensableVariables = deleteElements(removed, modelElements, blockInstances)
		for (id : removed) {
			tracefile.removeElement(id)
		}
		updateElements(modelElements, blockInstances)
		addPorts(newPorts, modelElements)
		addEquations(newProperties, modelElements, blockInstances)
		dispensableVariables.addAll(moveElements(moved, modelElements, blockInstances))
		cleanupLocals(dispensableVariables)
		new GenerateDiagram().updateGraphical(modelElements.values.filter[it instanceof Operator].map[it as Operator])

		// Put annotations in correct .ann file
		rearrangeAnnotations(scadeModel);

		// Ensure project contains appropriate FileRefs
		updateProjectWithModelFiles(scadeProject);

		// Save the project
		saveAll(scadeProject, null);

		tracefile.save()
	}

	/**
	 * Puts all packages, operators, ports and equations of {@link MapToScade#scadeModel} into a map with their OIDs as key and the
	 * element itself as value
	 * 
	 * @return Map containing all elements of the currently loaded SCADE model
	 */
	private def mapScadeModel() {
		var map = new HashMap<String, EObject>
		var packages = new LinkedList<Package>
		packages.addAll(scadeModel.packages)
		var Package package
		while (packages.size > 0) {
			package = packages.pop()
			packages.addAll(package.packages)
			map.put(package.oid, package)
			for (operator : package.operators) {
				map.put(operator.oid, operator)
				for (input : operator.inputs) {
					map.put(input.oid, input)
				}
				for (output : operator.outputs) {
					map.put(output.oid, output)
				}
				for (equation : operator.data) {
					map.put(equation.oid, equation)
				}
			}
		}
		return map
	}

	private def deleteElements(List<String> removed, Map<String, EObject> modelElements,
		HashMap<String, LinkedList<Property>> blockInstances) {
		val dispensableVariables = new LinkedList<Variable>
		for (id : removed) {
			var targets = tracefile.getTargetIDs(id)
			for (target : targets) {
				val scadeObject = modelElements.get(target)
				if (scadeObject instanceof Package) {
					scadeObject.owningPackage.packages.remove(scadeObject)
				} else if (scadeObject instanceof Operator) {
					scadeObject.owningPackage.operators.remove(scadeObject)
				} else if (scadeObject instanceof Variable) {
					var operator = scadeObject.operator
					var parent = tracefile.getParentID(id)
					val index = Math.max(operator.outputs.indexOf(scadeObject), operator.inputs.indexOf(scadeObject))
					if (operator.outputs.remove(scadeObject)) {
						operator.removeEquation(operator.data.findFirst [
							it instanceof Equation && (it as Equation).lefts.get(0) instanceof Variable &&
								(it as Equation).lefts.get(0).name == scadeObject.name
						] as Equation)
						blockInstances.get(parent)?.forEach [
							(modelElements.getBySourceID(it.UUID) as Equation).removeOutput(index)
						]
					} else if (operator.inputs.remove(scadeObject)) {
						dispensableVariables.addAll(operator.removeEquation(operator.data.findFirst [
							it instanceof Equation && (it as Equation).right instanceof IdExpression &&
								((it as Equation).right as IdExpression).path.name == scadeObject.name
						] as Equation))
						blockInstances.get(parent)?.forEach [
							(modelElements.getBySourceID(it.UUID) as Equation).removeInput(index)
						]
					}
				} else if (scadeObject instanceof Equation) {
					var operator = modelElements.getBySourceID(tracefile.getParentID(id)) as Operator
					dispensableVariables.addAll(operator.removeEquation(scadeObject))
				}
			}
		}
		return dispensableVariables
	}

	/**
	 * Fetches all sourceIDs from {@link MapToScade#tracefile} and iterates over their targets, comparing the source and target objects
	 * and updating the target object if they differ. In the current state this applies to the names of packages, operators and ports
	 * and the types of ports.
	 */
	private def updateElements(Map<String, EObject> scadeElements, Map<String, LinkedList<Property>> blockInstances) {
		var elementIds = tracefile.getAllSourceIDs
		for (sourceID : elementIds) {
			var sysmlElement = sysmlResource.getEObject(sourceID)
			for (targetID : tracefile.getTargetIDs(sourceID)) {
				if (sysmlElement instanceof org.eclipse.uml2.uml.Package) {
					var pkg = scadeElements.get(targetID) as Package
					pkg.name = sysmlElement.name
				} else if (sysmlElement instanceof Class) {
					val operator = scadeElements.get(targetID) as Operator
					if (operator.name != sysmlElement.name) {
						blockInstances.get(sourceID)?.forEach [
							var eq = (scadeElements.getBySourceID(it.UUID) as Equation)
							var opc = (eq.right as CallExpression).operator as OpCall
							opc.operator = operator
						]
						operator.name = sysmlElement.name
					}
				} else if (sysmlElement instanceof FlowPort) {
					val port = scadeElements.get(targetID) as Variable
					updatePort(port, sysmlElement, blockInstances.get(tracefile.getParentID(sysmlElement.UUID)),
						scadeElements)
				}
			}
		}
	}

	/**
	 * Compares the SCADE port with the SysML port and updates {@code port} if they differ.
	 * @see MapToScade#updateElements
	 */
	private def void updatePort(Variable port, FlowPort sysmlElement, List<Property> blockInstances,
		Map<String, EObject> scadeElements) {
		var parent = port.owner as Operator
		val sysmlType = createScadeType(sysmlElement.type)
		val scadeType = (port.type as NamedType).type
		if (parent.outputs.contains(port)) {
			val name = if (sysmlElement.direction.value == FlowDirection.INOUT_VALUE) {
					INOUT_OUT_NAME_PREFIX + sysmlElement.name
				} else {
					sysmlElement.name;
				}
			if (port.name != name || scadeType != sysmlType) {
				val equation = parent.data.findFirst [
					it instanceof Equation && (it as Equation).lefts.get(0).name == port.name
				] as Equation
				equation.lefts.get(0).name = name
				port.name = name
				var namedType = theScadeFactory.createNamedType
				namedType.setType(sysmlType)
				var local = parent.locals.findFirst [
					it.name == (equation.right as IdExpression)?.path?.name
				]
				if (local != null) {
					local.type = namedType
				}
				port.type = namedType;
			}
		} else if (parent.inputs.contains(port)) {
			val name = if (sysmlElement.direction.value == FlowDirection.INOUT_VALUE) {
					INOUT_IN_NAME_PREFIX + sysmlElement.name
				} else {
					sysmlElement.name;
				}
			if (port.name != name || scadeType != sysmlType) {
				val equation = parent.data.findFirst [
					if (it instanceof Equation && (it as Equation).right instanceof IdExpression) {
						return ((it as Equation).right as IdExpression).path.name == port.name
					}
					return false
				] as Equation
				(equation.right as IdExpression).path.name = name
				var namedType = theScadeFactory.createNamedType
				namedType.setType(sysmlType)
				var local = parent.locals.findFirst[it.name == equation.lefts.get(0).name]
				if (local != null) {
					local.type = namedType
				}
				port.name = name
				port.type = namedType;
			}
		}
	}

	/**
	 * Moves {@link Package}s and {@link Operator}s within a SCADE model according
	 * to their changed positions in the SysML model. As neither {@link Property}s nor
	 * {@link FlowPort}s can be moved within the SysML model their representations in the
	 * SCADE model are not processed.
	 */
	private def moveElements(List<EObject> moved, Map<String, EObject> scadeElements,
		HashMap<String, LinkedList<Property>> blockInstances) {
		var idList = moved.map [
			if (it instanceof Block) {
				return it.base_Class.UUID
			}
			it.UUID
		]
		var dispensable = deleteElements(idList, scadeElements, new HashMap<String, LinkedList<Property>>)
		for (element : moved) {
			if (element instanceof org.eclipse.uml2.uml.Package) {
				var scadePkg = scadeElements.getBySourceID(element.UUID) as Package
				var scadeParent = scadeElements.getBySourceID(element.eContainer.UUID) as Package
				scadeParent.packages.add(scadePkg)
				tracefile.removeElement(element.UUID)
				tracefile.addElement(element.UUID, element.eContainer.UUID, scadePkg.oid)
			} else if (element instanceof Block) {
				val operator = scadeElements.getBySourceID(element.base_Class.UUID) as Operator
				val scadeParent = scadeElements.getBySourceID(element.base_Class.eContainer.UUID) as Package
				scadeParent.operators.add(operator)
				tracefile.moveElement(element.base_Class.UUID, element.base_Class.eContainer.UUID)
				blockInstances.get(element.base_Class.UUID)?.forEach [
					var equation = scadeElements.getBySourceID(it.UUID) as Equation
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
	private def void removeOutput(Equation equation, int index) {
		equation.lefts.remove(index)
		val ge_index = index + 1
		(equation.owner as Operator).removeGraphical [
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
	}

	/**
	 * Removes the input at {@code index} from {@code equation} and in its graphical representation.
	 * 
	 * @param equation The equation from which to remove the input
	 * @param The index of the input
	 */
	private def removeInput(Equation equation, int index) {
		val expression = (equation.right as CallExpression).callParameters.remove(index) as IdExpression
		val parent = equation.owner as Operator
		parent.removeGraphical [
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
		return parent.locals.findFirst[it.name == expression.path.name]
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
	private def List<Variable> removeEquation(Operator parent, Equation equation) {
		parent.data.remove(equation)
		var params = new HashSet<String>
		for (left : equation.lefts) {
			params.add(left.name)
		}
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
	private def void removeGraphical(Operator operator, Function1<PresentationElement, Boolean> predicate) {
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