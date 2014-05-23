package org.openetcs.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.uml2.uml.Model;


public abstract class FileGenerator {
	@SuppressWarnings("unused")
	private Model model;
	private IProject project;
	private String projectFolder;
	
	public FileGenerator(Model model, IProject project) {
		this.model = model;
		this.project = project;
	}
	
	public void generate() {
		projectFolder = project.getLocation().toOSString() + "\\";
		File file = new File(projectFolder);
		
		if (!file.exists())	{
			file.mkdir();
		}
		
		transform();
	}
	
	abstract void transform();
}
