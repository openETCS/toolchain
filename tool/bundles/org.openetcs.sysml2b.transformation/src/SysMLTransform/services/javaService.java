/*

Copyright 2014 Thomas Bardot, David Mentré and Mitsubishi Electric R&D Centre Europe
  Contact: David Mentré <d.mentre@fr.merce.mee.com>

Licensed under the EUPL V.1.1

*/
package SysMLTransform.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.uml2.uml.*;

public class javaService {
	
	public boolean hasStereotype(Element element, String stereotypeName) {
	    return element.getAppliedStereotype(stereotypeName) != null;
	} 

	public List<Object> getTaggedValue(Element element, String stereotypeName, String property) {
	    Stereotype stereotype = element.getAppliedStereotype(stereotypeName);
	    List<Object> result = new ArrayList<Object>();
	    if (stereotype == null) {
	        return result;
	    }

	    Object value = element.getValue(stereotype, property);
	    if (value instanceof Collection) {
	        result.addAll((Collection)value);
	    } else {
	        result.add(value);
	    }
	    return result;
	}
	
	public String replaceStringList(String aString, List<String> stringList, String stringToAdd) {
		String result = aString;
		String tempString;
		for(int i=0;i<stringList.size();i++) {
			tempString=stringList.get(i);
			result=result.replaceAll(tempString, stringToAdd.concat(tempString));
		}		
		return result;
	}
		
	public String addPrefix(String aString, String stringToAdd) {
		String result = stringToAdd.concat(aString);		
		return result;
	}
}
