package org.openetcs.datadictionary.transform;

public class TransformServiceFactory {

	private static ITransformService service = new TransformServiceImpl();
	
	public static ITransformService getInstance() {
		return service;
	}
	
}
