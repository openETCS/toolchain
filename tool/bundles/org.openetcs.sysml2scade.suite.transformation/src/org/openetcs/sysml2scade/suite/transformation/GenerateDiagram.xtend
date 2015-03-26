package org.openetcs.sysml2scade.suite.transformation

import com.esterel.scade.api.CallExpression
import com.esterel.scade.api.Equation
import com.esterel.scade.api.IdExpression
import com.esterel.scade.api.Operator
import com.esterel.scade.api.pragmas.editor.Edge
import com.esterel.scade.api.pragmas.editor.EditorPragmasFactory
import com.esterel.scade.api.pragmas.editor.EditorPragmasPackage
import com.esterel.scade.api.pragmas.editor.EquationGE
import com.esterel.scade.api.pragmas.editor.NetDiagram
import com.google.common.collect.BiMap
import com.google.common.collect.HashBasedTable
import com.google.common.collect.HashBiMap
import de.cau.cs.kieler.core.alg.BasicProgressMonitor
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KGraphElement
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

class GenerateDiagram {

	private static val GRAPHICAL_OFFSET = 50f
	private static val OPERATOR_SPACING = 3000f
	private static val PORT_HEIGHT = 500f
	private static val PORT_WIDTH = 1000f
	private static val OPERATOR_MIN_HEIGHT = 3000f
	private static val OPERATOR_MIN_WIDTH = 6000f
	private static val OPERATOR_ASPECT_RATIO = 0.5f
	private static val PORT_THRESHOLD = 3
	private static val PORT_SPACING = 750f
	private static val OPERATOR_PORT_SPACING = OPERATOR_MIN_HEIGHT / (PORT_THRESHOLD + 2)

	private EditorPragmasFactory theEditorPragmasFactory
	private AbstractLayoutProvider layoutProvider
	private Operator operator

	private HashMap<KPort, Integer> portToIndex
	private BiMap<KGraphElement, Equation> kGraphElementToEquation

	new(Operator operator) {
		theEditorPragmasFactory = EditorPragmasPackage.eINSTANCE.getEditorPragmasFactory();
		layoutProvider = new LayeredLayoutProvider()
		this.operator = operator

		portToIndex = new HashMap<KPort, Integer>
		kGraphElementToEquation = HashBiMap.create
	}

	/**
	 * Generates for {@link GenerateDiagram#operator} a diagram by generating a KIELER diagram, layouting it with KIELER and
	 * then transforming it to a SCADE diagram.
	 */
	public def createGraphical() {
		var pNode = transformToKieler
		pNode.addLayoutOptions
		var progressMonitor = new BasicProgressMonitor()
		layoutProvider.doLayout(pNode, progressMonitor)
		pNode.translateOffset()
		var diagram = createScadeDiagram(operator)
		diagram.fillDiagram(pNode)

	}

	private def KNode transformToKieler() {
		var outputNames = new HashSet(operator.outputs.map[it.name])
		var inputMap = new HashMap<String, Equation>()
		var outputMap = new HashMap<String, Equation>()
		var callList = new LinkedList<Equation>()
		for (elem : operator.data) {
			var equation = elem as Equation
			if (outputNames.contains(equation.lefts.get(0).name)) {
				outputMap.put(equation.lefts.get(0).name, equation)
			} else if (equation.right instanceof IdExpression) {
				inputMap.put((equation.right as IdExpression).path.name, equation)
			} else {
				callList.add(equation)
			}
		}

		var localsToSourcePort = new HashMap<String, KPort>()
		var pNode = KimlUtil.createInitializedNode()

		for (var i = 0; i < operator.inputs.size; i++) {
			var input = operator.inputs.get(i)
			var port = KimlUtil.createInitializedPort()
			port.setNode(pNode)
			port.setSide(PortSide.WEST)
			var portLabel = KimlUtil.createInitializedLabel(port)
			portLabel.setText(input.name)
			var equation = inputMap.get(input.name)
			kGraphElementToEquation.put(port, equation)
			portToIndex.put(port, 1)
			localsToSourcePort.put(equation.lefts.get(0).name, port)
		}
		for (equation : callList) {
			var cNode = KimlUtil.createInitializedNode()
			cNode.setParent(pNode)
			kGraphElementToEquation.put(cNode, equation)
			for (var i = 0; i < equation.lefts.size; i++) {
				var output = equation.lefts.get(i)
				var port = KimlUtil.createInitializedPort()
				port.setNode(cNode)
				port.setSide(PortSide.EAST)
				localsToSourcePort.put(output.name, port)
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
			var equation = outputMap.get(output.name)
			kGraphElementToEquation.put(port, equation)
			portToIndex.put(port, 1)
			var idExpression = equation.right
			if (idExpression != null) {
				var source = (idExpression as IdExpression).path?.name
				if (source != null) {
					localsToSourcePort.get(source).addEdgeTo(port)
				}
			}
		}
		for (cNode : pNode.children) {
			var equation = kGraphElementToEquation.get(cNode)
			var parameters = (equation.right as CallExpression).callParameters
			for (var i = parameters.size; i > 0; i--) {
				var expression = parameters.get(i - 1) as IdExpression
				var port = KimlUtil.createInitializedPort()
				port.setNode(cNode)
				port.setSide(PortSide.WEST)
				portToIndex.put(port, i)
				var source = expression.path?.name
				if (source != null) {
					localsToSourcePort.get(source).addEdgeTo(port)
				}
			}
		}
		return pNode
	}

	/**
	 * Transforms a layouted KIELER graph to a {@link NetDiagram}.
	 * 
	 * @param diagram The NetDiagram which is filled with content
	 * @param pNode The KNode Which is representing the Operator for which a diagram is generated
	 */
	private def fillDiagram(NetDiagram diagram, KNode pNode) {
		val kGraphElementToGraphical = new HashMap<KGraphElement, EquationGE>()
		var kielerToScade = [ KGraphElement element |
			var equation = kGraphElementToEquation.get(element)
			var layout = element.getData(typeof(KShapeLayout))
			var graphical = equation.createEquationGE(layout.xpos as int, layout.ypos as int, layout.width as int,
				layout.height as int)
			diagram.presentationElements.add(graphical)
			kGraphElementToGraphical.put(element, graphical)
			return graphical
		]
		for (cNode : pNode.children) {
			val graphical = kielerToScade.apply(cNode)
			kGraphElementToGraphical.putAll(cNode.ports.toInvertedMap[graphical])
		}
		for (port : pNode.ports) {
			if (port.edges.size > 0) {
				kielerToScade.apply(port)
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
			sEdge.setSrcEquation(kGraphElementToGraphical.get(srcPort))
			sEdge.setDstEquation(kGraphElementToGraphical.get(dstPort))
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
	public def updateGraphical() {
		var equationGEs = new LinkedList<EquationGE>
		var edges = new LinkedList<Edge>
		for (pragma : operator.pragmas) {
			if (pragma instanceof com.esterel.scade.api.pragmas.editor.Operator) {
				for (diagram : pragma.diagrams) {
					for (element : diagram.presentationElements) {
						if (element instanceof EquationGE) {
							equationGEs.add(element)
						} else if (element instanceof Edge) {
							edges.add(element)
						}
					}
				}
			}
		}
		var pNode = transformToKieler
		pNode.addLayoutOptions
		var edgeTable = HashBasedTable.create
		for (edge : pNode.incomingEdges) {
			edgeTable.put(kGraphElementToEquation.get(edge.targetPort).oid, 1, edge)
		}
		for (cNode : pNode.children) {
			for (edge : cNode.incomingEdges) {
				edgeTable.put(kGraphElementToEquation.get(edge.target).oid, portToIndex.get(edge.targetPort), edge)
			}
		}
		for (scadeEdge : edges) {
			var kEdge = edgeTable.get(scadeEdge.dstEquation.equation.oid, scadeEdge.rightExprIndex)
			var vectorChain = new KVectorChain
			for (position : scadeEdge.positions) {
				vectorChain.add(position.x, position.y)
			}
			kEdge.getData(typeof(KEdgeLayout)).setProperty(LayoutOptions.BEND_POINTS, vectorChain)
		}
		var equationTokGraphElement = kGraphElementToEquation.inverse
		for (equation_ge : equationGEs) {
			var layout = equationTokGraphElement.get(equation_ge.equation).getData(typeof(KShapeLayout))
			var position = equation_ge.position
			layout.setProperty(LayoutOptions.POSITION, new KVector(position.x, position.y))
			layout.setProperty(LayoutOptions.MIN_WIDTH, equation_ge.size.width as float)
			layout.setProperty(LayoutOptions.MIN_HEIGHT, equation_ge.size.height as float)
		}

		var fixedProvider = new FixedLayoutProvider
		// Set existing elements to their positions in KIELER
		fixedProvider.doLayout(pNode, new BasicProgressMonitor)

		// Layout only elements without layout
		pNode.getData(typeof(KShapeLayout)).setProperty(LayoutOptions.INTERACTIVE, true)

		// Actual layout
		layoutProvider.doLayout(pNode, new BasicProgressMonitor)
		operator.pragmas.remove(operator.pragmas.findFirst [
			if (it instanceof com.esterel.scade.api.pragmas.editor.Operator) {
				if (it.diagrams.size > 0) {
					return true
				}
			}
			return false
		])
		pNode.translateOffset()
		operator.createScadeDiagram.fillDiagram(pNode)
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
		pLayout.setProperty(LayoutOptions.SPACING, GenerateDiagram.OPERATOR_SPACING)
		pLayout.setProperty(LayoutOptions.ALGORITHM, "DataFlow")
		pLayout.setProperty(LayoutOptions.PORT_LABEL_PLACEMENT, PortLabelPlacement.INSIDE)
		pLayout.setProperty(LayoutOptions.PORT_SPACING, GenerateDiagram.PORT_SPACING)
		pLayout.setProperty(LayoutOptions.BORDER_SPACING, GenerateDiagram.GRAPHICAL_OFFSET)

		for (port : pNode.ports) {
			var portLayout = port.getData(typeof(KShapeLayout))
			portLayout.setProperty(LayoutOptions.SIZE_CONSTRAINT, SizeConstraint.fixed)
			portLayout.setHeight(GenerateDiagram.PORT_HEIGHT)
			portLayout.setWidth(GenerateDiagram.PORT_WIDTH)
		}

		for (cNode : pNode.children) {
			var cLayout = cNode.getData(typeof(KShapeLayout))
			cLayout.setProperty(LayoutOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER)
			cLayout.setProperty(LayoutOptions.SIZE_CONSTRAINT, SizeConstraint.free)
			cLayout.setProperty(LayoutOptions.SIZE_OPTIONS,
				EnumSet.of(SizeOptions.COMPUTE_INSETS, SizeOptions.MINIMUM_SIZE_ACCOUNTS_FOR_INSETS))
			cLayout.setProperty(LayoutOptions.MIN_WIDTH, GenerateDiagram.OPERATOR_MIN_WIDTH)
			cLayout.setProperty(LayoutOptions.MIN_HEIGHT, GenerateDiagram.OPERATOR_MIN_HEIGHT)
			cLayout.setProperty(LayoutOptions.PORT_SPACING, GenerateDiagram.OPERATOR_PORT_SPACING)
			cLayout.setProperty(LayoutOptions.BORDER_SPACING, GenerateDiagram.OPERATOR_PORT_SPACING)
			cLayout.setProperty(LayoutOptions.ASPECT_RATIO, GenerateDiagram.OPERATOR_ASPECT_RATIO)
		}
	}

	/**
	 * After the layouting with KIELER ports are outside of the operator. This functions shifts all elements, so that the ports are
	 * within {@code node}.
	 * 
	 * @param node The element which ports are outside of it.
	 */
	private def void translateOffset(KNode node) {
		var xOffset = 0f
		var yOffset = 0f
		for (port : node.ports) {
			var layout = port.getData(typeof(KShapeLayout))
			if (layout.xpos < xOffset) {
				xOffset = layout.xpos
			}
			if (layout.ypos < yOffset) {
				yOffset = layout.ypos
			}
		}
		xOffset = Math.abs(xOffset) + GRAPHICAL_OFFSET
		yOffset = Math.abs(yOffset) + GRAPHICAL_OFFSET
		KimlUtil.translate(node, xOffset, yOffset)
		for (port : node.ports) {
			var layout = port.getData(typeof(KShapeLayout))
			layout.setXpos(layout.xpos + xOffset)
			layout.setYpos(layout.ypos + yOffset)
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
	private def NetDiagram createScadeDiagram(Operator operator) {
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
}
