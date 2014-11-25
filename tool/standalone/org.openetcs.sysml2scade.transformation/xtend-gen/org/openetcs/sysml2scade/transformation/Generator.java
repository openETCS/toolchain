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
package org.openetcs.sysml2scade.transformation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.openetcs.common.IOUtil;
import org.openetcs.sysml2scade.transformation.MapToProjectFile;
import org.openetcs.sysml2scade.transformation.MapToWorkspaceFile;

@SuppressWarnings("all")
public class Generator {
  public static void start(final IFile file) {
    try {
      IPath path = Generator.getFolderOfFile(file);
      String name = Generator.getFilenameWithoutExtension(file);
      IProject _project = file.getProject();
      String _plus = (name + ".etp");
      CharSequence _createProject = MapToProjectFile.createProject(name);
      String _string = _createProject.toString();
      IOUtil.writeProjectFile(_project, path, _plus, _string);
      IProject _project_1 = file.getProject();
      String _plus_1 = (name + ".vsw");
      CharSequence _createWorkspace = MapToWorkspaceFile.createWorkspace(name);
      String _string_1 = _createWorkspace.toString();
      IOUtil.writeProjectFile(_project_1, path, _plus_1, _string_1);
      IProject _project_2 = file.getProject();
      String _plus_2 = (name + ".css");
      CharSequence _createWorkspace_1 = MapToWorkspaceFile.createWorkspace(name);
      String _string_2 = _createWorkspace_1.toString();
      IOUtil.writeProjectFile(_project_2, path, _plus_2, _string_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String getFilenameWithoutExtension(final IFile file) {
    IPath path = file.getFullPath();
    int segmentCount = path.segmentCount();
    int _minus = (segmentCount - 1);
    IPath _removeFirstSegments = path.removeFirstSegments(_minus);
    path = _removeFirstSegments;
    IPath _removeFileExtension = path.removeFileExtension();
    path = _removeFileExtension;
    return path.toString();
  }
  
  public static IPath getFolderOfFile(final IFile file) {
    IPath path = file.getFullPath();
    IPath _removeFirstSegments = path.removeFirstSegments(1);
    path = _removeFirstSegments;
    IPath _removeLastSegments = path.removeLastSegments(1);
    path = _removeLastSegments;
    return path;
  }
}
