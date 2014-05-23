package org.openetcs.sysml2scade.transformation

import org.eclipse.core.resources.IFile
import org.openetcs.common.Util
import org.eclipse.core.runtime.IPath

class Generator {
	def static start(IFile file) {
		var path = getFolderOfFile(file)
		var name = getFilenameWithoutExtension(file)
		
		Util.writeProjectFile(file.project, path, name + ".etp", MapToProjectFile.createProject().toString);
		Util.writeProjectFile(file.project, path, name + ".vsw", MapToWorkspaceFile.createWorkspace().toString);
	}
	
	def static String getFilenameWithoutExtension(IFile file) {
		var path = file.fullPath
		
		// Remove all leading folders
		var segmentCount = path.segmentCount
		path = path.removeFirstSegments(segmentCount - 1)
		
		path = path.removeFileExtension		
		
		return path.toString
	}
	
	def static IPath getFolderOfFile(IFile file) {
		var path = file.fullPath
		path = path.removeFirstSegments(1)
		path = path.removeLastSegments(1)
		return path
	}
}