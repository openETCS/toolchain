package org.openetcs.sysml2scade.suite.transformation

import com.esterel.scade.api.CallExpression
import com.esterel.scade.api.Equation
import com.esterel.scade.api.IdExpression
import com.esterel.scade.api.Operator
import com.esterel.scade.api.Variable
import com.esterel.scade.api.pragmas.editor.Edge
import com.esterel.scade.api.pragmas.editor.EditorPragmasFactory
import com.esterel.scade.api.pragmas.editor.EditorPragmasPackage
import com.esterel.scade.api.pragmas.editor.EquationGE
import com.esterel.scade.api.pragmas.editor.NetDiagram
import de.cau.cs.kieler.core.alg.BasicProgressMonitor
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.kgraph.KPort
import de.cau.cs.kieler.core.math.KVector
import de.cau.cs.kieler.core.math.KVectorChain
import de.cau.cs.kieler.kiml.AbstractLayoutProvider
import de.cau.cs.kieler.kiml.klayoutdata.KEdgeLayout
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout
import de.cau.cs.kieler.kiml.options.Direction
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kiml.options.PortConstraints
import de.cau.cs.kieler.kiml.options.PortLabelPlacement
import de.cau.cs.kieler.kiml.options.PortSide
import de.cau.cs.kieler.kiml.options.SizeConstraint
import de.cau.cs.kieler.kiml.options.SizeOptions
import de.cau.cs.kieler.kiml.util.FixedLayoutProvider
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klay.layered.LayeredLayoutProvider
import java.util.EnumSet
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.Map

class GenerateDiagram {
	
	private val GRAPHICAL_OFFSET = 50f
	private val OPERATOR_SPACING = 500f
	private val PORT_SPACING = 500f
	private val PORT_HEIGHT = 300f
	private val PORT_WIDTH = 250f
	private val OPERATOR_MIN_HEIGHT = 1500f
	private val OPERATOR_MIN_WIDTH = 3000f
	private val OPERATOR_ASPECT_RATIO = 0.5f
	
	private EditorPragmasFactory theEditorPragmasFactory;
	private AbstractLayoutProvider layoutProvider
	
	new () {
		theEditorPragmasFactory = EditorPragmasPackage.eINSTANCE.getEditorPragmasFactory();
		layoutProvider = new LayeredLayoutProvider()
	}
	

	/**
	 * Generates for all Operators in {@code operators} a diagram by generating a KIELER diagram, layouting it with KIELER and
	 * then transforming it to a SCADE diagram.
	 * 
	 * @param opeators The operators for which to generate a diagram
	 */
	protected def createGraphical(Iterable<Operator> operators) {
		for (operator : operators) {
			var inputMap = new HashMap<Variable, Equation>()
			var outputMap = new HashMap<Variable, Equation>()
			var callList = new LinkedList<Equation>()
			for (elem : operator.data) {
				var equation = elem as Equation
				if (equation.lefts.size == 1 && operator.outputs.contains(equation.lefts.get(0))) {
					outputMap.put(equation.lefts.get(0), equation)
				} else if (equation.right instanceof IdExpression) {
					inputMap.put((equation.right as IdExpression).path as Variable, equation)
				} else {
					callList.add(equation)
				}
			}

			var portToEquation = new HashMap<KPort, Equation>()
			var localsToSourcePort = new HashMap<Variable, KPort>()
			var callToNode = new HashMap<Equation, KNode>()
			var pNode = KimlUtil.createInitializedNode()
			var portToIndex = new HashMap<KPort, Integer>()

			for (var i = 0; i < operator.inputs.size; i++) {
				var input = operator.inputs.get(i)
				var port = KimlUtil.createInitializedPort()
				port.setNode(pNode)
				port.setSide(PortSide.WEST)
				var portLabel = KimlUtil.createInitializedLabel(port)
				portLabel.setText(input.name)
				var equation = inputMap.get(input)
				portToEquation.put(port, equation)
				portToIndex.put(port, 1)
				localsToSourcePort.put(equation.lefts.get(0), port)
			}
			for (equation : callList) {
				var cNode = KimlUtil.createInitializedNode()
				cNode.setParent(pNode)
				callToNode.put(equation, cNode)
				for (var i = 0; i < equation.lefts.size; i++) {
					var output = equation.lefts.get(i)
					var port = KimlUtil.createInitializedPort()
					port.setNode(cNode)
					port.setSide(PortSide.EAST)
					localsToSourcePort.put(output, port)
					portToEquation.put(port, equation)
					portToIndex.put(port, i + 1)
				}
			}
			for (var i = 0; i < operator.outputs.size; i++) {
				var output = operator.outputs.get(i)
				var port = KimlUtil.createInitializedPort()
				port.setNode(pNode)
				port.setSide(PortSide.EAST)
				var portLabel = KimlUtil.createInitializedLabel(port)
				portLabel.setText(output.name)
				var equation = outputMap.get(output)
				portToEquation.put(port, equation)
				portToIndex.put(port, 1)
				var idExpression = equation.right
				if (idExpression != null) {
					var source = (idExpression as IdExpression).path as Variable
					if (source != null) {
						localsToSourcePort.get(source).addEdgeTo(port)
					}
				}
			}
			for (equation : callList) {
				var parameters = (equation.right as CallExpression).callParameters
				for (var i = parameters.size; i > 0; i--) {
					var expression = parameters.get(i - 1) as IdExpression
					var cNode = callToNode.get(equation)
					var port = KimlUtil.createInitializedPort()
					port.setNode(cNode)
					port.setSide(PortSide.WEST)
					portToEquation.put(port, equation)
					portToIndex.put(port, i)
					var source = expression.path
					if (source != null) {
						localsToSourcePort.get(source).addEdgeTo(port)
					}
				}
			}
			pNode.addLayoutOptions
			var progressMonitor = new BasicProgressMonitor()
			layoutProvider.doLayout(pNode, progressMonitor)
			var diagram = createScadeDiagram(operator)
			diagram.fillDiagram(pNode, callToNode, portToEquation, portToIndex)
		}
	}

	/**
	 * Transforms a layouted KIELER graph to a {@link NetDiagram}.
	 * 
	 * @param diagram The NetDiagram which is filled with content
	 * @param pNode The KNode Which is representing the Operator for which a diagram is generated
	 * @param callToNode A map linking Equation with CallExpression to KNode
	 * @param portToEquation A map linking KPort to Equation which represents the ports
	 * @param portToIndex A map mapping the KPort to their indexes
	 */
	private def fillDiagram(NetDiagram diagram, KNode pNode, Map<Equation, KNode> callToNode,
		Map<KPort, Equation> portToEquation, Map<KPort, Integer> portToIndex) {
		var equationToGraphical = new HashMap<Equation, EquationGE>()
		for (entry : callToNode.entrySet) {
			var equation = entry.key
			var node = entry.value.getData(typeof(KShapeLayout))
			var graphical = equation.createEquationGE(node.xpos as int, node.ypos as int, node.width as int,
				node.height as int)
			diagram.presentationElements.add(graphical)
			equationToGraphical.put(equation, graphical)
		}
		for (port : pNode.ports) {
			if (port.edges.size > 0) {
				var equation = portToEquation.get(port)
				var layout = port.getData(typeof(KShapeLayout))
				var graphical = equation.createEquationGE(layout.xpos as int, layout.ypos as int, layout.width as int,
					layout.height as int)
				diagram.presentationElements.add(graphical)
				equationToGraphical.put(equation, graphical)
			}
		}
		var edgesList = new LinkedList<KEdge>()
		for (edge : pNode.incomingEdges) {
			edgesList.add(edge)
		}
		for (cNode : pNode.children) {
			for (edge : cNode.incomingEdges) {
				edgesList.add(edge)
			}
		}
		for (kEdge : edgesList) {
			var sEdge = theEditorPragmasFactory.createEdge
			var srcPort = kEdge.sourcePort
			var dstPort = kEdge.targetPort
			sEdge.setLeftVarIndex(portToIndex.get(srcPort))
			sEdge.setRightExprIndex(portToIndex.get(dstPort))
			sEdge.setSrcEquation(equationToGraphical.get(portToEquation.get(srcPort)))
			sEdge.setDstEquation(equationToGraphical.get(portToEquation.get(dstPort)))
			var layout = kEdge.getData(typeof(KEdgeLayout))

			var point = theEditorPragmasFactory.createPoint()
			point.setX(layout.sourcePoint.x as int)
			point.setY(layout.sourcePoint.y as int)
			sEdge.positions.add(point)
			var previousPoint = point
			for (bendPoint : layout.bendPoints) {
				point = theEditorPragmasFactory.createPoint()
				point.setX(bendPoint.x as int)
				point.setY(bendPoint.y as int)
				if (previousPoint.x != point.x || previousPoint.y != point.y) {
					sEdge.positions.add(point)
					previousPoint = point
				}
			}
			point = theEditorPragmasFactory.createPoint()
			point.setX(layout.targetPoint.x as int)
			point.setY(layout.targetPoint.y as int)
			if (previousPoint.x != point.x || previousPoint.y != point.y) {
				sEdge.positions.add(point)
			}
			diagram.presentationElements.add(sEdge)
		}
	}

	/**
	 * Removes the old diagram and generates a new for all {@link com.esterel.scade.api.Operators} in the SCADE model. This is done by
	 * using the interactive mode from KIELER, which tries to alter of elements which are already layouted as little as possible.
	 * 
	 * @see LayoutOptions#INTERACTIVE
	 */
	protected def updateGraphical(Iterable<Operator> operators) {
		var fixedProvider = new FixedLayoutProvider
		for (operator : operators) {
			var equationGEs = new HashMap<String, EquationGE>
			var edges = new LinkedList<Edge>
			for (pragma : operator.pragmas) {
				if (pragma instanceof com.esterel.scade.api.pragmas.editor.Operator) {
					for (diagram : pragma.diagrams) {
						for (element : diagram.presentationElements) {
							if (element instanceof EquationGE) {
								equationGEs.put(element.equation.oid, element)
							} else if (element instanceof Edge) {
								edges.add(element)
							}
						}
					}
				}
			}
			var portNames = new HashSet(operator.inputs.map[it.name])
			portNames.addAll(operator.outputs.map[it.name])
			var portToEquation = new HashMap<String, Equation>
			var callList = new LinkedList<Equation>
			for (element : operator.data.filter[it instanceof Equation].map[it as Equation]) {
				var equation = element
				if (portNames.contains(equation.lefts.get(0).name)) {
					portToEquation.put(equation.lefts.get(0).name, equation)
				} else if (equation.right instanceof IdExpression) {
					var name = (equation.right as IdExpression).path.name
					if (portNames.contains(name)) {
						portToEquation.put(name, equation)
					} else {
						callList.add(equation)
					}
				} else {
					callList.add(equation)
				}
			}
			var pNode = KimlUtil.createInitializedNode
			var portEquationToKPort = new HashMap<String, KPort>
			var kportToEquation = new HashMap<KPort, Equation>
			for (input : operator.inputs) {
				var port = KimlUtil.createInitializedPort()
				port.setNode(pNode)
				port.setSide(PortSide.WEST)
				var portLabel = KimlUtil.createInitializedLabel(port)
				portLabel.setText(input.name)
				portEquationToKPort.put(portToEquation.get(input.name).oid, port)
				kportToEquation.put(port, portToEquation.get(input.name))
			}
			for (output : operator.outputs) {
				var port = KimlUtil.createInitializedPort()
				port.setNode(pNode)
				port.setSide(PortSide.EAST)
				var portLabel = KimlUtil.createInitializedLabel(port)
				portLabel.setText(output.name)
				portEquationToKPort.put(portToEquation.get(output.name).oid, port)
				kportToEquation.put(port, portToEquation.get(output.name))
			}
			var equationToInputIndexToKPort = new HashMap<String, HashMap<Integer, KPort>>
			var equationToOutputIndexToKPort = new HashMap<String, HashMap<Integer, KPort>>
			var equationToKNode = new HashMap<Equation, KNode>
			for (equation : callList) {
				var cNode = KimlUtil.createInitializedNode()
				cNode.setParent(pNode)
				equationToKNode.put(equation, cNode)
				for (var i = 0; i < equation.lefts.size; i++) {
					var port = KimlUtil.createInitializedPort()
					port.setNode(cNode)
					port.setSide(PortSide.EAST)
					equationToOutputIndexToKPort.put(equation.oid, i, port)
				}
				for (var i = 0; i < (equation.right as CallExpression).callParameters.size; i++) {
					var port = KimlUtil.createInitializedPort()
					port.setNode(cNode)
					port.setSide(PortSide.WEST)
					equationToInputIndexToKPort.put(equation.oid, i, port)
				}
			}
			var scadeEdgeToKEdge = new HashMap<Edge, KEdge>
			var portToIndex = new HashMap<KPort, Integer>
			for (edge : edges) {
				var srcOid = edge.srcEquation.equation.oid
				var source = if (portEquationToKPort.containsKey(srcOid)) {
						portEquationToKPort.get(srcOid)
					} else {
						equationToOutputIndexToKPort.get(srcOid, edge.leftVarIndex)
					}
				portToIndex.put(source, edge.leftVarIndex)
				var dstOid = edge.dstEquation.equation.oid
				var destination = if (portEquationToKPort.containsKey(dstOid)) {
						portEquationToKPort.get(srcOid)
					} else {
						equationToInputIndexToKPort.get(dstOid, edge.rightExprIndex)
					}
				portToIndex.put(destination, edge.rightExprIndex)
				scadeEdgeToKEdge.put(edge, source.addEdgeTo(destination))
			}
			pNode.addLayoutOptions
			for (entry : scadeEdgeToKEdge.entrySet) {
				var vectorChain = new KVectorChain
				for (position : entry.key.positions) {
					vectorChain.add(position.x, position.y)
				}
				entry.value.getData(typeof(KEdgeLayout)).setProperty(LayoutOptions.BEND_POINTS, vectorChain)
			}
			for (entry : equationToKNode.entrySet) {
				var equationGE = equationGEs.get(entry.key.oid)
				var layout = entry.value.getData(typeof(KShapeLayout))
				var position = equationGE.position
				layout.setProperty(LayoutOptions.POSITION, new KVector(position.x, position.y))
				layout.setProperty(LayoutOptions.MIN_WIDTH, equationGE.size.width as float)
				layout.setProperty(LayoutOptions.MIN_HEIGHT, equationGE.size.height as float)
			}

			// Set existing elements to their positions
			fixedProvider.doLayout(pNode, new BasicProgressMonitor)

			// Layout only elements without layout
			pNode.getData(typeof(KShapeLayout)).setProperty(LayoutOptions.INTERACTIVE, true)

			// Actual layout
			layoutProvider.doLayout(pNode, new BasicProgressMonitor)
			operator.pragmas.findFirst [
				if (it instanceof com.esterel.scade.api.pragmas.editor.Operator) {
					if (it.diagrams.size > 0) {
						it.diagrams.remove(0)
						return true
					}
				}
				return false
			]
			operator.createScadeDiagram.fillDiagram(pNode, equationToKNode, kportToEquation, portToIndex)
		}
	}

	/**
	 * Bundles the setting of the different {@link LayoutOptions} which are applied in one function.
	 * Different options are applied to {@code pNode}, its ports and its child nodes.
	 * 
	 * @param pNode The parent node to which and on its children the layout options are applied.
	 */
	private def addLayoutOptions(KNode pNode) {
		var pLayout = pNode.getData(typeof(KShapeLayout))
		pLayout.setProperty(LayoutOptions.DIRECTION, Direction.RIGHT)
		pLayout.setProperty(LayoutOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL)
		pLayout.setProperty(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
		pLayout.setProperty(LayoutOptions.SIZE_CONSTRAINT, SizeConstraint.free)
		pLayout.setProperty(LayoutOptions.SIZE_OPTIONS, EnumSet.of(SizeOptions.COMPUTE_INSETS))
		pLayout.setProperty(LayoutOptions.SPACING, this.OPERATOR_SPACING)
		pLayout.setProperty(LayoutOptions.ALGORITHM, "DataFlow")
		pLayout.setProperty(LayoutOptions.PORT_LABEL_PLACEMENT, PortLabelPlacement.INSIDE)
		pLayout.setProperty(LayoutOptions.PORT_SPACING, this.PORT_SPACING)
		pLayout.setProperty(LayoutOptions.BORDER_SPACING, this.GRAPHICAL_OFFSET)

		for (port : pNode.ports) {
			var portLayout = port.getData(typeof(KShapeLayout))
			portLayout.setProperty(LayoutOptions.SIZE_CONSTRAINT, SizeConstraint.fixed)
			portLayout.setProperty(LayoutOptions.OFFSET, (PORT_WIDTH + GRAPHICAL_OFFSET) * (-1))
			portLayout.setHeight(this.PORT_HEIGHT)
			portLayout.setWidth(this.PORT_WIDTH)
		}

		for (cNode : pNode.children) {
			var cLayout = cNode.getData(typeof(KShapeLayout))
			cLayout.setProperty(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER)
			cLayout.setProperty(LayoutOptions.SIZE_CONSTRAINT, SizeConstraint.free)
			cLayout.setProperty(LayoutOptions.SIZE_OPTIONS,
				EnumSet.of(SizeOptions.COMPUTE_INSETS, SizeOptions.MINIMUM_SIZE_ACCOUNTS_FOR_INSETS))
			cLayout.setProperty(LayoutOptions.MIN_WIDTH, this.OPERATOR_MIN_WIDTH)
			cLayout.setProperty(LayoutOptions.MIN_HEIGHT, this.OPERATOR_MIN_HEIGHT)
			cLayout.setProperty(LayoutOptions.PORT_SPACING, this.OPERATOR_MIN_HEIGHT / 5)
			cLayout.setProperty(LayoutOptions.BORDER_SPACING, this.OPERATOR_MIN_HEIGHT / 5)
			cLayout.setProperty(LayoutOptions.ASPECT_RATIO, this.OPERATOR_ASPECT_RATIO)
		}
	}

	/**
	 * Creates and returns a new {@link EquationGE} for {@code equation} with {@code xpos}
	 * and {@code ypos} as position, and {@code width} and {@code height} as size.
	 * 
	 * @param equation The equation for which to create the {@link EquationGE}
	 * @param xpos The x position of the created EquationGE
	 * @param ypos The y position of the created EquationGE
	 * @param width The width of the created EquationGE
	 * @param height The height of the created EquationGE
	 * @return The created {@link EquationGE}
	 */
	private def createEquationGE(Equation equation, int xpos, int ypos, int width, int height) {
		var equation_ge = theEditorPragmasFactory.createEquationGE();
		equation_ge.setEquation(equation);
		var point = theEditorPragmasFactory.createPoint();
		point.setX(xpos);
		point.setY(ypos);
		equation_ge.setPosition(point);
		var size = theEditorPragmasFactory.createSize();
		size.setWidth(width);
		size.setHeight(height);
		equation_ge.setSize(size)
		return equation_ge
	}

	/**
	 * Sets the side of {@code port} to {@code side}
	 * 
	 * @param port The port for which to set the side
	 * @param side The side which to set
	 */
	private def void setSide(KPort port, PortSide side) {
		var portLayout = port.getData(typeof(KShapeLayout))
		portLayout.setProperty(LayoutOptions.PORT_SIDE, side)
	}

	/**
	 * Adds a {@link KEdge} from {@code source} to {@code target} and returns it.
	 * 
	 * @param source The source port
	 * @param target The target port
	 * @return The created Edge
	 */
	private def KEdge addEdgeTo(KPort source, KPort target) {
		var edge = KimlUtil.createInitializedEdge()
		edge.setTargetPort(target)
		edge.setTarget(target.node)
		target.getEdges().add(edge)
		edge.setSourcePort(source)
		edge.setSource(source.node)
		source.getEdges().add(edge)
		return edge
	}

	/**
	 * Creates and initializes an empty {@link NetDiagram} and adds it to
	 * the given {@link Operator}
	 * 
	 * @param operator The Operator for which the diagram is created
	 * @return The created Diagram
	 */
	def NetDiagram createScadeDiagram(Operator operator) {
		val operator_pragma = theEditorPragmasFactory.createOperator();
		operator.getPragmas().add(operator_pragma);
		operator_pragma.setNodeKind("graphical");
		val operator_diagram = theEditorPragmasFactory.createNetDiagram();
		operator_diagram.setName(operator.name + "_diagram");
		operator_diagram.setFormat("A4 (210 297)");
		operator_diagram.setLandscape(true);
		operator_pragma.getDiagrams().add(operator_diagram);

		return operator_diagram;
	}

	/**
	 * Puts an element in a HashMap within a Map. If the inner map does not exist yet it will be created.
	 * 
	 * @param <KEY1> The type of the key of the outer map
	 * @param <KEY2> The type of the key of the inner map
	 * @param <ELEM> The type of the element which to put in the inner map
	 * @param map The outer map
	 * @param key1 The key for the outer map
	 * @param key2 The key for the inner map
	 * @param element The element which to add
	 */
	def <KEY1, KEY2, ELEM> put(Map<KEY1, HashMap<KEY2, ELEM>> map, KEY1 key1, KEY2 key2, ELEM element) {
		if (!map.containsKey(key1)) {
			map.put(key1, new HashMap<KEY2, ELEM>())
		}
		map.get(key1).put(key2, element)
	}

	/**
	 * Function returning an element of a map within a map using two keys.
	 * 
	 * @param <M> The type of the nested Map
	 * @param <KEY1> The type of the keys of the outer map
	 * @param <KEY2> The type of the keys of the inner map
	 * @param <ELEM> The type of the returning element
	 * @param map The outer map
	 * @param key1 The key for the outer map
	 * @param key2 The key for the inner map
	 * @return The element which to get or null if does not exist
	 */
	def <M extends Map<KEY2, ELEM>, KEY1, KEY2, ELEM> ELEM get(Map<KEY1, M> map, KEY1 key1, KEY2 key2) {
		if (map != null && key1 != null && key2 != null) {
			var innerMap = map.get(key1)
			if (innerMap != null) {
				return innerMap.get(key2)
			}
		}
		return null
	}
}