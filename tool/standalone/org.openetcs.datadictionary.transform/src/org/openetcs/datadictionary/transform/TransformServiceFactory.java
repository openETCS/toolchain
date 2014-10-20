package org.openetcs.datadictionary.transform;

/**
 * Factory for Bitwalker transformers. 
 */
public class TransformServiceFactory {
		
	/**
	 * Create a bitwalker transformer.
	 * 
	 * @return new Bitwalker transformer.
	 */
	public static ITransformer createTransformer() {
		return new BitwalkerTransformer();
	}
	
}
