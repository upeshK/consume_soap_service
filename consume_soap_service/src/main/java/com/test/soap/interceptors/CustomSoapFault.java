/**
 * 
 */
package com.test.soap.interceptors;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.Soap11FaultInInterceptor;
import org.apache.cxf.binding.soap.interceptor.Soap12FaultInInterceptor;
import org.apache.cxf.binding.soap.interceptor.Soap12FaultOutInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;

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
public class CustomSoapFault extends AbstractSoapInterceptor {
	
	private static final Logger logger=Logger.getLogger(com.test.soap.interceptors.CustomSoapFault.class);
	
	public CustomSoapFault() {
		// TODO Auto-generated constructor stub
		super(Phase.MARSHAL);
		getAfter().add(Soap11FaultInInterceptor.class.getName());
	}

	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		msg.getContent(Exception.class);
		Fault fault=(Fault) msg.getContent(Exception.class);
		logger.info(fault.getMessage(),fault);
		System.out.println("Interceptor:::"+fault.getMessage());
	}

}
