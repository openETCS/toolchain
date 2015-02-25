package org.openetcs.sysml2scade.suite.transformation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

public class Trace {
	private static final String XML_ROOT = "Trace";
	private static final String XML_TARGET_PROJECT = "TargetProject";
	private static final String XML_PATH = "path";
	private static final String XML_ELEMENT = "Element";
	private static final String XML_SOURCE_ID = "sourceID";
	private static final String XML_TARGET_ID = "targetID";
	private static final String XML_SCHEMA = "/schema/tracefile.xsd";

	private final Map<String, Set<String>> sourceIDToTargetIDMap;
	private final Map<String, Set<String>> targetIDToSourceIDMap;
	private final Map<String, Element> sourceIDToXmlElementMap;
	private final Map<String, Element> pathToTargetElementsMap;
	private final Document xmlDocument;
	private final File documentFile;
	private Element xmlTarget;

	/**
	 * ErrorHandler should always be null, assigning a custom handler slows the
	 * the loading of the model by EMF
	 * 
	 * @param tracefilePath
	 *            The path to the tracefile as String
	 * @param handler
	 *            Custom ErrorHandler for validation of the tracefile
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public Trace(final String tracefilePath, final ErrorHandler handler)
			throws ParserConfigurationException, SAXException, IOException {
		this(new File(tracefilePath), handler);
	}

	public Trace(final File file, final ErrorHandler handler)
			throws ParserConfigurationException, SAXException, IOException {
		this.sourceIDToTargetIDMap = new HashMap<>();
		this.targetIDToSourceIDMap = new HashMap<>();
		this.sourceIDToXmlElementMap = new HashMap<>();
		this.pathToTargetElementsMap = new HashMap<>();
		this.documentFile = file;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory
				.newInstance();
		builderFactory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		if (file.exists()) {
			SchemaFactory schemaFactory = SchemaFactory
					.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			if (handler != null) {
				schemaFactory.setErrorHandler(handler);
			}
			Validator validator = schemaFactory.newSchema(
					this.getClass().getResource(Trace.XML_SCHEMA))
					.newValidator();
			this.xmlDocument = builder.parse(file);
			validator.validate(new DOMSource(this.xmlDocument));
			this.xmlDocument.normalizeDocument();
			NodeList targets = this.xmlDocument
					.getElementsByTagName(Trace.XML_TARGET_PROJECT);
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

	private void loadElementsFromTarget(final Element trace) {
		NodeList elementList = trace.getElementsByTagName(Trace.XML_ELEMENT);
		for (int i = 0; i < elementList.getLength(); i++) {
			Element element = (Element) elementList.item(i);

			String sourceID = this.getSourceID(element);
			this.sourceIDToXmlElementMap.put(sourceID, element);

			for (Node node = element.getFirstChild(); node != null; node = node
					.getNextSibling()) {
				if (node.getNodeType() == Node.ELEMENT_NODE
						&& ((Element) node).getTagName().equals(
								Trace.XML_TARGET_ID)) {
					String targetID = node.getTextContent();
					this.storeIDs(sourceID, targetID);
				}
			}
		}
	}

	public void addElement(final String sourceID, final String parentID,
			final String targetID, final String... targetIDs) {

		if (this.sourceIDToXmlElementMap.containsKey(sourceID)) {
			throw new IllegalArgumentException(); // TODO
		}
		Element parent = (parentID != null && !parentID.equals("")) ? this.sourceIDToXmlElementMap
				.get(parentID) : this.xmlTarget;
		Element xmlElement = this.xmlDocument.createElement(Trace.XML_ELEMENT);
		parent.appendChild(xmlElement);

		Element xmlSource = this.xmlDocument.createElement(Trace.XML_SOURCE_ID);
		xmlSource.setTextContent(sourceID);
		xmlElement.appendChild(xmlSource);

		Element xmlTarget = this.xmlDocument.createElement(Trace.XML_TARGET_ID);
		xmlTarget.setTextContent(targetID);
		xmlElement.appendChild(xmlTarget);
		this.storeIDs(sourceID, targetID);
		for (String target : targetIDs) {
			xmlTarget = this.xmlDocument.createElement(Trace.XML_TARGET_ID);
			xmlTarget.setTextContent(target);
			xmlElement.appendChild(xmlTarget);
			this.storeIDs(sourceID, target);
		}
		this.sourceIDToXmlElementMap.put(sourceID, xmlElement);
	}

	public void save() throws TransformerException {
		this.xmlDocument.normalizeDocument();
		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(
				"{http://xml.apache.org/xslt}indent-amount", "4");
		DOMSource source = new DOMSource(this.xmlDocument);
		StreamResult stream = new StreamResult(this.documentFile);
		transformer.transform(source, stream);
	}

	public void loadTarget(final String path) {
		if (!this.pathToTargetElementsMap.containsKey(path)) {
			this.xmlTarget = xmlDocument
					.createElement(Trace.XML_TARGET_PROJECT);
			this.xmlTarget.setAttribute(Trace.XML_PATH, path);
			this.xmlDocument.getDocumentElement().appendChild(this.xmlTarget);
		} else {
			this.xmlTarget = this.pathToTargetElementsMap.get(path);
			loadElementsFromTarget(this.xmlTarget);
		}
	}

	public void removeTarget(final String projectName) {
		Element element = this.pathToTargetElementsMap.remove(projectName);
		element.getParentNode().removeChild(element);
		this.xmlDocument.normalizeDocument();
	}

	public List<String> getTargetIDs(final String soureID) {
		Collection<String> c = this.sourceIDToTargetIDMap.get(soureID);
		if (c == null || c.size() == 0) {
			return null;
		}
		return new ArrayList<>(c);
	}

	public boolean isTransferred(final String sourceID) {
		return this.sourceIDToXmlElementMap.containsKey(sourceID);
	}

	private void storeIDs(final String sourceID, final String targetID) {
		if (this.targetIDToSourceIDMap.containsKey(targetID)) {
			this.targetIDToSourceIDMap.get(targetID).add(sourceID);
		} else {
			Set<String> set = new HashSet<>();
			set.add(sourceID);
			this.targetIDToSourceIDMap.put(targetID, set);
		}
		if (this.sourceIDToTargetIDMap.containsKey(sourceID)) {
			this.sourceIDToTargetIDMap.get(sourceID).add(targetID);
		} else {
			Set<String> set = new HashSet<String>();
			set.add(targetID);
			this.sourceIDToTargetIDMap.put(sourceID, set);
		}
	}

	public List<String> getSourceIDs(final String targetID) {
		Collection<String> c = this.targetIDToSourceIDMap.get(targetID);
		if (c == null || c.size() == 0) {
			return null;
		}
		return new ArrayList<>(c);
	}

	public List<String> getAllSourceIDs() {
		return new ArrayList<>(this.sourceIDToTargetIDMap.keySet());
	}

	private String getSourceID(Node element) {
		if (element == null || element.getNodeType() != Node.ELEMENT_NODE
				|| !((Element) element).getTagName().equals(Trace.XML_ELEMENT)) {
			return null;
		}
		for (Node node = element.getFirstChild(); node != null; node = node
				.getNextSibling()) {
			if (node.getNodeType() == Node.ELEMENT_NODE
					&& ((Element) node).getTagName()
							.equals(Trace.XML_SOURCE_ID)) {
				return node.getTextContent();
			}
		}
		return null;
	}

	public String getParentID(final String sourceID) {
		return getSourceID(this.sourceIDToXmlElementMap.get(sourceID)
				.getParentNode());
	}

	public void removeElement(final String sourceID) {
		Element xmlElement = this.sourceIDToXmlElementMap.remove(sourceID);
		if (xmlElement == null) {
			return;
		}
		xmlElement.getParentNode().removeChild(xmlElement);
		Iterable<String> targetIDs = this.sourceIDToTargetIDMap
				.remove(sourceID);
		for (String id : targetIDs) {
			Collection<String> sources = this.targetIDToSourceIDMap.get(id);
			sources.remove(sourceID);
			if (sources.size() == 0) {
				this.targetIDToSourceIDMap.remove(id);
			}
		}
	}

	public void moveElement(final String sourceID, final String parentID) {
		Element xmlElement = this.sourceIDToXmlElementMap.get(sourceID);
		Element parent = this.sourceIDToXmlElementMap.get(parentID);
		parent.appendChild(xmlElement);
	}
}
