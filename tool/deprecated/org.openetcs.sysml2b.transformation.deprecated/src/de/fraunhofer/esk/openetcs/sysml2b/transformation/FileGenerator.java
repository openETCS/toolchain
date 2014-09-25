package de.fraunhofer.esk.openetcs.sysml2b.transformation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

import ClassicalB.Project;
import de.fraunhofer.esk.openetcs.sysml2b.transformation.StructureMapping;

public class FileGenerator {
	private String pathToBMchs;
	private Model sysmlModel;
	private IProject project;
	
	public FileGenerator(Model model, IProject project) {
		this.project = project;
		pathToBMchs = project.getLocation().toOSString() + "\\";
		File file = new File(pathToBMchs);
		
		if (!file.exists())	{
			file.mkdir();
		}
		
		sysmlModel = model;
	}

	public void generateAndWrite() throws Exception {
		HashMap<Element, Comment> mapping = new HashMap<Element, Comment>();
		
		// Build a mapping of <Element> to <Comment> to find the associated
		// comments fast in the transformation
		for (Element element: sysmlModel.allOwnedElements()) {
			if (element instanceof Comment) {
				Comment comment = (Comment) element;
				
				for (Element e : comment.getAnnotatedElements()) {
					mapping.put(e,  comment);
				}
			}
		}

		MapToBModel map2b = new MapToBModel();
		Project p = map2b.create(sysmlModel);
		
		MapToText map2t = new MapToText();
		map2t.create(p, project);
	}
	
	private void createMachineFile(Block block, Comment comment) {
		StructureMapping mapping = new StructureMapping();
		
		writeToFile(block.getBase_Class().getName() + ".mch", mapping.createMachine(block, comment).toString());
	}
	
	public void writeToFile(String filename, String content) {
		try {
			FileWriter fileStream = new FileWriter(pathToBMchs + filename);
			BufferedWriter out = new BufferedWriter(fileStream);
			out.write(content);
			out.close();
		} catch (IOException ioe) {
			System.err.println("Error: " + ioe.getMessage());
		}
	}
}
