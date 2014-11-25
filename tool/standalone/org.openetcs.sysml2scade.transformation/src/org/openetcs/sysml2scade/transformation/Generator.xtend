/**
 * Copyright 2014 Fraunhofer ESK & CEA list
 * 
 * Licensed under the European Union Public Licence (EUPL), Version 1.1 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributors:
 *     Alexander Stante, Fraunhofer ESK - initial API and implementation
 *     Matthieu Perin, CEA list - correction to cut link to changed utils classes
 */
 package org.openetcs.sysml2scade.transformation

import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath
import org.openetcs.common.IOUtil

class Generator {
	def static start(IFile file) {
		var path = getFolderOfFile(file)
		var name = getFilenameWithoutExtension(file)
		
		IOUtil.writeProjectFile(file.project, path, name + ".etp", MapToProjectFile.createProject(name).toString)
		IOUtil.writeProjectFile(file.project, path, name + ".vsw", MapToWorkspaceFile.createWorkspace(name).toString)
		IOUtil.writeProjectFile(file.project, path, name + ".css", MapToWorkspaceFile.createWorkspace(name).toString)
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