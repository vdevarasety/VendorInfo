
package com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "vendorinfo_client_ep", targetNamespace = "http://xmlns.oracle.com/pcbpel/adapter/db/POCVendorInfo/VendorInfo/BAM_DEV", wsdlLocation = "http://vafscmul6265.aac.dva.va.gov:6012/soa-infra/services/default/VendorInfo/vendorinfo_client_ep?WSDL")
public class VendorinfoClientEp
    extends Service
{

    private final static URL VENDORINFOCLIENTEP_WSDL_LOCATION;
    private final static WebServiceException VENDORINFOCLIENTEP_EXCEPTION;
    private final static QName VENDORINFOCLIENTEP_QNAME = new QName("http://xmlns.oracle.com/pcbpel/adapter/db/POCVendorInfo/VendorInfo/BAM_DEV", "vendorinfo_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://vafscmul6265.aac.dva.va.gov:6012/soa-infra/services/default/VendorInfo/vendorinfo_client_ep?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VENDORINFOCLIENTEP_WSDL_LOCATION = url;
        VENDORINFOCLIENTEP_EXCEPTION = e;
    }

    public VendorinfoClientEp() {
        super(__getWsdlLocation(), VENDORINFOCLIENTEP_QNAME);
    }

    public VendorinfoClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENDORINFOCLIENTEP_QNAME, features);
    }

    public VendorinfoClientEp(URL wsdlLocation) {
        super(wsdlLocation, VENDORINFOCLIENTEP_QNAME);
    }

    public VendorinfoClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENDORINFOCLIENTEP_QNAME, features);
    }

    public VendorinfoClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VendorinfoClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BAMDEVPtt
     */
    @WebEndpoint(name = "BAM_DEV_pt")
    public BAMDEVPtt getBAMDEVPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/pcbpel/adapter/db/POCVendorInfo/VendorInfo/BAM_DEV", "BAM_DEV_pt"), BAMDEVPtt.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BAMDEVPtt
     */
    @WebEndpoint(name = "BAM_DEV_pt")
    public BAMDEVPtt getBAMDEVPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/pcbpel/adapter/db/POCVendorInfo/VendorInfo/BAM_DEV", "BAM_DEV_pt"), BAMDEVPtt.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENDORINFOCLIENTEP_EXCEPTION!= null) {
            throw VENDORINFOCLIENTEP_EXCEPTION;
        }
        return VENDORINFOCLIENTEP_WSDL_LOCATION;
    }

}
