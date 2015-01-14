package org.openetcs.sysml2scade.suite.transformation;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Trace {

	private final Map<String, BlockRepresentation> nameToBlockMap;
	private final Map<String, CallRepresentation> oidToCallMap;
	private final Map<String, PortRepresentation> oidToPortMap;

	public Trace() {
		this.nameToBlockMap = new HashMap<String, BlockRepresentation>();
		this.oidToCallMap = new HashMap<String, CallRepresentation>();
		this.oidToPortMap = new HashMap<String, PortRepresentation>();
	}

	public Trace(URI xmlFile) throws ParserConfigurationException,
			SAXException, IOException {
		this();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(new File(xmlFile.toFileString()));
		document.getDocumentElement().normalize();
		NodeList blockList = document.getElementsByTagName("Block");
		for (int i = 0; i < blockList.getLength(); i++) {
			Element block = (Element) blockList.item(i);
			String name = block.getElementsByTagName("Name").item(0)
					.getTextContent();
			this.addBlock(name, block.getElementsByTagName("Oid").item(0)
					.getTextContent());
			NodeList inputs = block.getElementsByTagName("Inputs").item(0)
					.getChildNodes();
			for (int j = 0; j < inputs.getLength(); j++) {
				Element port = (Element) inputs.item(0);
				addInputToBlock(name, port.getElementsByTagName("Name").item(0)
						.getTextContent(), port.getElementsByTagName("Oid")
						.item(0).getTextContent(),
						port.getElementsByTagName("Type").item(0)
								.getTextContent());
			}
			NodeList outputs = block.getElementsByTagName("Inputs").item(0)
					.getChildNodes();
			for (int j = 0; j < outputs.getLength(); j++) {
				Element port = (Element) outputs.item(0);
				addOutputToBlock(name, port.getElementsByTagName("Name").item(0)
						.getTextContent(), port.getElementsByTagName("Oid")
						.item(0).getTextContent(),
						port.getElementsByTagName("Type").item(0)
								.getTextContent());
			}
		}
	}

	public void addBlock(String name, String oid) {
		this.nameToBlockMap.put(name, new BlockRepresentation(name, oid));
	}

	public void addInputToBlock(String blockName, String portName,
			String portOid, String type) {
		BlockRepresentation block = this.nameToBlockMap.get(blockName);
		PortRepresentation input = new PortRepresentation(portOid, type,
				portName, block);
		this.oidToPortMap.put(portOid, input);
		block.addInput(input);
	}

	public void addOutputToBlock(String blockName, String portName,
			String portOid, String type) {
		BlockRepresentation block = this.nameToBlockMap.get(blockName);
		PortRepresentation output = new PortRepresentation(portOid, type,
				portName, block);
		this.oidToPortMap.put(portOid, output);
		block.addOutput(output);
	}

	public void addCall(String parentBlockName, String childBlockName,
			String oid) {
		BlockRepresentation parentBlock = this.nameToBlockMap
				.get(parentBlockName);
		CallRepresentation call = new CallRepresentation(oid,
				this.nameToBlockMap.get(childBlockName), parentBlock);
		this.oidToCallMap.put(oid, call);
	}

	public void addFlowToCall(String targetCallOid, String targetPortOid,
			String sourcePortOid, String sourceCallOid) {
		CallRepresentation target = this.oidToCallMap.get(targetCallOid);
		CallRepresentation source = this.oidToCallMap.get(sourceCallOid);
		target.addConnection(targetPortOid, sourcePortOid, source);
	}

	public void addFlowToOutput(String targetOid, String sourcePortOid,
			String sourceCallOid) {
		PortRepresentation target = this.oidToPortMap.get(targetOid);
		target.block.addFlowToOutput(target, new ConnectorEnd(sourcePortOid,
				this.oidToCallMap.get(sourceCallOid)));
	}

	public void saveAsXml(final URI uri) throws ParserConfigurationException,
			TransformerException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.newDocument();
		Element rootElement = document.createElement("Trace");
		for (BlockRepresentation value : nameToBlockMap.values()) {
			rootElement.appendChild(value.toXml(document));
		}
		document.appendChild(rootElement);
		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(
				"{http://xml.apache.org/xslt}indent-amount", "4");
		DOMSource source = new DOMSource(document);
		StreamResult stream = new StreamResult(new File(uri.toFileString()));
		transformer.transform(source, stream);
	}

	private class BlockRepresentation {
		private final String oid;
		private final String name;

		private final Map<String, PortRepresentation> oidToInputMap;
		private final Map<String, PortRepresentation> oidToOutputMap;

		private final Map<String, CallRepresentation> oidToCallMap;
		private final Map<PortRepresentation, ConnectorEnd> outputToConnectorendMap;

		public BlockRepresentation(String name, String oid) {
			this.name = name;
			this.oid = oid;
			this.oidToInputMap = new HashMap<String, PortRepresentation>();
			this.oidToOutputMap = new HashMap<String, PortRepresentation>();
			this.oidToCallMap = new HashMap<String, CallRepresentation>();
			this.outputToConnectorendMap = new HashMap<>();
		}

		public void addFlowToOutput(PortRepresentation target,
				ConnectorEnd connectorEnd) {
			this.outputToConnectorendMap.put(target, connectorEnd);
		}

		public void addInput(PortRepresentation input) {
			this.oidToInputMap.put(input.oid, input);
		}

		public void addOutput(PortRepresentation output) {
			this.oidToOutputMap.put(output.oid, output);
		}

		public void addCall(CallRepresentation call) {
			this.oidToCallMap.put(call.oid, call);
		}

		public Element toXml(final Document document) {
			Element element = document.createElement("Block");

			Element oidElement = document.createElement("Oid");
			oidElement.appendChild(document.createTextNode(this.oid));
			element.appendChild(oidElement);

			Element nameElement = document.createElement("Name");
			nameElement.appendChild(document.createTextNode(this.name));
			element.appendChild(nameElement);

			Element inputs = document.createElement("Inputs");
			for (PortRepresentation value : this.oidToInputMap.values()) {
				inputs.appendChild(value.toXml(document));
			}
			element.appendChild(inputs);
			Element outputs = document.createElement("Outputs");
			for (PortRepresentation value : this.oidToOutputMap.values()) {
				outputs.appendChild(value.toXml(document));
			}
			element.appendChild(outputs);
			Element calls = document.createElement("Calls");
			for (CallRepresentation value : this.oidToCallMap.values()) {
				calls.appendChild(value.toXml(document));
			}
			element.appendChild(calls);
			Element flows = document.createElement("Flows");
			for (Entry<PortRepresentation, ConnectorEnd> entry : this.outputToConnectorendMap
					.entrySet()) {
				Element flowElement = document.createElement("Flow");
				Element target = document.createElement("TargetOid");
				target.appendChild(document.createTextNode(entry.getKey().oid));
				flowElement.appendChild(target);
				flowElement.appendChild(entry.getValue().toXml(document));
				flows.appendChild(flowElement);
			}
			element.appendChild(flows);
			return element;
		}
	}

	private class PortRepresentation {
		private final String oid;
		private final String type;
		private final String name;
		private final BlockRepresentation block;

		public PortRepresentation(String oid, String type, String name,
				BlockRepresentation blockRepresentation) {
			this.oid = oid;
			this.type = type;
			this.name = name;
			this.block = blockRepresentation;
		}

		public Element toXml(final Document document) {
			Element element = document.createElement("Port");

			Element oidElement = document.createElement("Oid");
			oidElement.appendChild(document.createTextNode(this.oid));
			element.appendChild(oidElement);

			Element typeElement = document.createElement("Type");
			typeElement.appendChild(document.createTextNode(this.type));
			element.appendChild(typeElement);

			Element nameElement = document.createElement("Name");
			nameElement.appendChild(document.createTextNode(this.name));
			element.appendChild(nameElement);

			return element;
		}
	}

	private class CallRepresentation {
		private final String oid;
		private final BlockRepresentation block;
		private final BlockRepresentation parentBlock;
		private final Map<PortRepresentation, ConnectorEnd> inputToSourceMap;

		public CallRepresentation(String oid, BlockRepresentation block,
				BlockRepresentation parentBlock) {
			this.oid = oid;
			this.block = block;
			this.parentBlock = parentBlock;
			parentBlock.addCall(this);
			this.inputToSourceMap = new HashMap<PortRepresentation, ConnectorEnd>();
		}

		public void addConnection(String targetPortOid, String sourcePortOid,
				CallRepresentation source) {
			inputToSourceMap.put(block.oidToInputMap.get(targetPortOid),
					new ConnectorEnd(sourcePortOid, source));
		}

		public Element toXml(final Document document) {
			Element element = document.createElement("Call");

			Element oidElement = document.createElement("Oid");
			oidElement.appendChild(document.createTextNode(this.oid));
			element.appendChild(oidElement);

			Element blockElement = document.createElement("BlockOid");
			blockElement.appendChild(document.createTextNode(this.block.oid));
			element.appendChild(blockElement);

			Element inputToSource = document.createElement("Flows");
			for (Entry<PortRepresentation, ConnectorEnd> entry : inputToSourceMap
					.entrySet()) {
				Element xmlEntry = document.createElement("Flow");
				Element portElement = document.createElement("TargetOid");
				portElement
						.appendChild(document.createTextNode(entry.getKey().oid));
				xmlEntry.appendChild(portElement);
				xmlEntry.appendChild(entry.getValue().toXml(document));
				inputToSource.appendChild(xmlEntry);
			}
			element.appendChild(inputToSource);
			return element;
		}
	}

	private class ConnectorEnd {
		private String portOid;
		private CallRepresentation partWithPort;

		public ConnectorEnd(String sourcePortOid, CallRepresentation source) {
			this.portOid = sourcePortOid;
			this.partWithPort = source;
		}

		public Element toXml(final Document document) {
			Element element = document.createElement("ConnectorEnd");

			Element portElement = document.createElement("SourceOid");
			portElement.appendChild(document.createTextNode(this.portOid));
			element.appendChild(portElement);

			if (this.partWithPort != null) {
				Element callElement = document.createElement("CallOid");
				callElement.appendChild(document
						.createTextNode(this.partWithPort.oid));
				element.appendChild(callElement);
			}

			return element;
		}
	}

	/*
	 * TODO was mit Outputs? Call Representation? Inputs auch:
	 * CallRepresentation muss von CallRepresentation lesen Lösungen: wie in
	 * SysML oder wie in SCADE
	 */
}
