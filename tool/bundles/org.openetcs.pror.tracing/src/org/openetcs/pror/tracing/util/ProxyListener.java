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
	
	public void proxyCreatedFor(EObject element);

}
