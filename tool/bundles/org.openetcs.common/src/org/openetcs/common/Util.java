package org.openetcs.common;

import java.io.ByteArrayInputStream;
import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;

public class Util {
	public void generateProjectFolder(IProject project) {
		generateProjectFolder(project.getLocation().toOSString() + "\\");
	}
	
	public void generateProjectFolder(String folder) {
		File file = new File(folder);
		
		if (!file.exists())	{
			file.mkdir();
		}
	}
	
	public static void writeProjectFile(IProject project, IPath folder, String file, String content) throws CoreException {
		IFile projectFile = project.getFile(folder.toString() + "/" + file);
		ByteArrayInputStream stream = new ByteArrayInputStream(content.getBytes());
		projectFile.create(stream, true, null);
	}
	
	public static IFile getUMLFile(IPapyrusFile file) {
		IResource[] ressources = file.getAssociatedResources();
		
		for (IResource res : ressources) {
			if (res.getFileExtension().equals("uml")) {
				return (IFile) res;
			}
		}
		
		return null;
	}
}
