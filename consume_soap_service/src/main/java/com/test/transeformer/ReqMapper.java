/**
 * 
 */
package com.test.transeformer;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.test.sample.ResolveIP;

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
public class ReqMapper implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		ResolveIP req=new ResolveIP();
		req.setIpAddress("173.194.36.39");
		req.setLicenseKey(" ");
	
		return req;
	}
	

}
