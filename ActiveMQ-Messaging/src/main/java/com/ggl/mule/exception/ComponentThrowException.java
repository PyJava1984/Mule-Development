package com.ggl.mule.exception;

import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class ComponentThrowException implements Callable{

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		Exception testException = new Exception(eventContext.getMessage().getPayloadAsString());
		
		if(true) {
			throw testException;
		} 
		
		return null;
	}

}
