
package com.test.sample;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-02-08T21:46:09.654+05:30
 * Generated source version: 2.5.1
 * 
 */
public final class IP2GeoHttpPost_IP2GeoHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.cdyne.com/", "IP2Geo");

    private IP2GeoHttpPost_IP2GeoHttpPost_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = IP2Geo.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        IP2Geo ss = new IP2Geo(wsdlURL, SERVICE_NAME);
        IP2GeoHttpPost port = ss.getIP2GeoHttpPost();  
        
        {
        System.out.println("Invoking resolveIP...");
        java.lang.String _resolveIP_ipAddress = "";
        java.lang.String _resolveIP_licenseKey = "";
        com.test.sample.IPInformation _resolveIP__return = port.resolveIP(_resolveIP_ipAddress, _resolveIP_licenseKey);
        System.out.println("resolveIP.result=" + _resolveIP__return);


        }

        System.exit(0);
    }

}