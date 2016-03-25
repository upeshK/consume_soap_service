package com.test.sample;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * Our system uses a multiple sources for resolution. Including a host database, trace route information, and other systems. Resolves IP addresses to Organization, Country, City, and State/Province, Latitude, Longitude. In most US cities it will also provide some extra information such as Area Code, and more.
 *
 * This class was generated by Apache CXF 2.5.1
 * 2015-02-08T21:46:09.694+05:30
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "IP2Geo", 
                  wsdlLocation = "file:/D:/MuleWorkspace/consume_soap_service/src/main/resources/ip2geo.wsdl",
                  targetNamespace = "http://ws.cdyne.com/") 
public class IP2Geo extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.cdyne.com/", "IP2Geo");
    public final static QName IP2GeoHttpPost = new QName("http://ws.cdyne.com/", "IP2GeoHttpPost");
    public final static QName IP2GeoHttpGet = new QName("http://ws.cdyne.com/", "IP2GeoHttpGet");
    public final static QName IP2GeoSoap = new QName("http://ws.cdyne.com/", "IP2GeoSoap");
    public final static QName IP2GeoSoap12 = new QName("http://ws.cdyne.com/", "IP2GeoSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/MuleWorkspace/consume_soap_service/src/main/resources/ip2geo.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IP2Geo.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/MuleWorkspace/consume_soap_service/src/main/resources/ip2geo.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IP2Geo(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IP2Geo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IP2Geo() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IP2GeoHttpPost
     */
    @WebEndpoint(name = "IP2GeoHttpPost")
    public IP2GeoHttpPost getIP2GeoHttpPost() {
        return super.getPort(IP2GeoHttpPost, IP2GeoHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IP2GeoHttpPost
     */
    @WebEndpoint(name = "IP2GeoHttpPost")
    public IP2GeoHttpPost getIP2GeoHttpPost(WebServiceFeature... features) {
        return super.getPort(IP2GeoHttpPost, IP2GeoHttpPost.class, features);
    }
    /**
     *
     * @return
     *     returns IP2GeoHttpGet
     */
    @WebEndpoint(name = "IP2GeoHttpGet")
    public IP2GeoHttpGet getIP2GeoHttpGet() {
        return super.getPort(IP2GeoHttpGet, IP2GeoHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IP2GeoHttpGet
     */
    @WebEndpoint(name = "IP2GeoHttpGet")
    public IP2GeoHttpGet getIP2GeoHttpGet(WebServiceFeature... features) {
        return super.getPort(IP2GeoHttpGet, IP2GeoHttpGet.class, features);
    }
    /**
     *
     * @return
     *     returns IP2GeoSoap
     */
    @WebEndpoint(name = "IP2GeoSoap")
    public IP2GeoSoap getIP2GeoSoap() {
        return super.getPort(IP2GeoSoap, IP2GeoSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IP2GeoSoap
     */
    @WebEndpoint(name = "IP2GeoSoap")
    public IP2GeoSoap getIP2GeoSoap(WebServiceFeature... features) {
        return super.getPort(IP2GeoSoap, IP2GeoSoap.class, features);
    }
    /**
     *
     * @return
     *     returns IP2GeoSoap
     */
    @WebEndpoint(name = "IP2GeoSoap12")
    public IP2GeoSoap getIP2GeoSoap12() {
        return super.getPort(IP2GeoSoap12, IP2GeoSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IP2GeoSoap
     */
    @WebEndpoint(name = "IP2GeoSoap12")
    public IP2GeoSoap getIP2GeoSoap12(WebServiceFeature... features) {
        return super.getPort(IP2GeoSoap12, IP2GeoSoap.class, features);
    }

}
