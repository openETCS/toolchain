package org.openetcs.sysml2scade.suite.transformation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Trace {
	private static final String XML_ROOT = "Trace";
	private static final String XML_TARGET_Project = "TargetProject";
	private static final String XML_PATH = "path";
	private static final String XML_ELEMENT = "Element";
	private static final String XML_SOURCE_ID = "sourceID";
	private static final String XML_TARGET_ID = "targetID";
	private static final String XML_SCHEMA = "/schema/tracefile.xsd";

	public class IDElement {

		public final String sourceID;
		public final String targetID;

		public IDElement(String sourceID, String targetID) {
			this.sourceID = sourceID;
			this.targetID = targetID;
		}
	}

	private final Map<String, IDElement> sourceIDToElementMap;
	private final Map<String, IDElement> targetIDToElementMap;
	private final Map<String, Element> pathToTargetElementsMap;
	private final Document xmlDocument;
	private final File documentFile;
	private Element activeElement;

	public Trace(String tracefilePath) throws ParserConfigurationException,
			SAXException, IOException {
		this(new File(tracefilePath));
	}

	public Trace(File file) throws ParserConfigurationException, SAXException,
			IOException {
		this.sourceIDToElementMap = new HashMap<>();
		this.targetIDToElementMap = new HashMap<>();
		this.pathToTargetElementsMap = new HashMap<>();
		this.documentFile = file;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory
				.newInstance();
		SchemaFactory schemaFactory = SchemaFactory
				.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		builderFactory.setSchema(schemaFactory.newSchema(this.getClass()
				.getResource(Trace.XML_SCHEMA)));
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		if (file.exists()) {
			this.xmlDocument = builder.parse(file);
			this.xmlDocument.normalizeDocument();
			NodeList targets = this.xmlDocument
					.getElementsByTagName(Trace.XML_TARGET_Project);
			for (int i = 0; i < targets.getLength(); i++) {
				String path = ((Element) targets.item(i))
						.getAttribute(Trace.XML_PATH);
				this.pathToTargetElementsMap.put(path,
						(Element) targets.item(i));
			}
		} else {
			this.xmlDocument = builder.newDocument();
			Element root = this.xmlDocument.createElement(Trace.XML_ROOT);
			this.xmlDocument.appendChild(root);
		}
	}

	public List<String> getTargetLocations() {
		return new ArrayList<String>(this.pathToTargetElementsMap.keySet());
	}

	private void loadElementsFromTarget(Element trace) {
		NodeList elementList = trace.getElementsByTagName(Trace.XML_ELEMENT);
		for (int i = 0; i < elementList.getLength(); i++) {
			Element element = (Element) elementList.item(i);
			String sourceID, targetID;
			sourceID = element.getElementsByTagName(Trace.XML_SOURCE_ID)
					.item(0).getTextContent();
			targetID = element.getElementsByTagName(Trace.XML_TARGET_ID)
					.item(0).getTextContent();
			this.addElement(sourceID, targetID);
		}
	}

	public void addElement(final String sourceID, final String targetID) {
		IDElement element = new IDElement(sourceID, targetID);
		Element xmlElement = this.xmlDocument.createElement(XML_ELEMENT);
		this.activeElement.appendChild(xmlElement);
		Element xmlSource = this.xmlDocument.createElement(Trace.XML_SOURCE_ID);
		xmlSource.setTextContent(sourceID);
		xmlElement.appendChild(xmlSource);
		Element xmlTarget = this.xmlDocument.createElement(Trace.XML_TARGET_ID);
		xmlTarget.setTextContent(targetID);
		xmlElement.appendChild(xmlTarget);
		this.sourceIDToElementMap.put(sourceID, element);
		this.targetIDToElementMap.put(targetID, element);
	}

	public void save() throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(
				"{http://xml.apache.org/xslt}indent-amount", "4");
		DOMSource source = new DOMSource(xmlDocument);
		StreamResult stream = new StreamResult(documentFile);
		transformer.transform(source, stream);
	}

	public void loadTarget(String path) {
		if (!this.pathToTargetElementsMap.containsKey(path)) {
			this.activeElement = xmlDocument
					.createElement(Trace.XML_TARGET_Project);
			this.activeElement.setAttribute(Trace.XML_PATH, path);
			this.xmlDocument.getDocumentElement().appendChild(
					this.activeElement);
		} else {
			this.activeElement = this.pathToTargetElementsMap.get(path);
			loadElementsFromTarget(this.activeElement);
		}
	}

	public void removeTarget(String projectName) {
		Element element = this.pathToTargetElementsMap.remove(projectName);
		element.getParentNode().removeChild(element);
	}
}
