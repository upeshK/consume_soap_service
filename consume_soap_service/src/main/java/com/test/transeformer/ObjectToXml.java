/**
 * 
 */
package com.test.transeformer;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.thoughtworks.xstream.XStream;

/**
 * Copyright 2014, eBuilder AB
 * All rights reserved
 * <p/>
 * This is UNPUBLISHED PROPRIETARY SOURCE CODE
 * of eBuilder AB;
 * the contents of this file may not be disclosed to third parties,
 * copied or duplicated in any form, in whole or in part,
 * without the prior written permission of eBuilder AB.
 * <p/>
 * <p/>
 * Author :Upesh Kulatunge<br> 
 * Created: Oct 16, 2014<br>
 */
public class ObjectToXml implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		byte[] ba=eventContext.getMessage().getPayloadAsBytes();
		 XStream xstream = new XStream(); 
		 
		System.out.println("Class of payload=" + ba.getClass().getCanonicalName()); 
	    String xmlString = xstream.toXML(ba); 
	    System.out.println(xmlString); 
	    return xmlString; 
		
	}
	

}
