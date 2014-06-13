/**
 * Copyright 2014 Formal Mind GmbH.
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
 *     Michael Jastram - initial API and implementation
 */
package org.openetcs.pror.tracing.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;

/**
 * This interface is used for the Proxy Notification Extension Point. Registered
 * Extensions will be notified if something interesting happens with proxies.
 * <p>
 * 
 * For now, only proxy creation is tracked. I expect this interface to evolve
 * over time, as more and more events are being tracked.
 * 
 * @author jastram
 */
public interface ProxyListener {
	
	/**
	 * This method will be called when the user attempts to create a link in ProR between an EMF
	 * element and a SpecObject.
	 * 
	 * @param requirement the {@link SpecObject} the element is connected to. 
	 * @param trace the {@link SpecRelation} between requirement and the proxy for element.  Note
	 * that the user can configure the link direction (i.e. which one is source and which is the target).-ä
	 * @param element the {@link EObject} that the proxy refers to.
	 */
	public void proxyCreatedFor(SpecObject requirement, SpecRelation trace, EObject element);

}
