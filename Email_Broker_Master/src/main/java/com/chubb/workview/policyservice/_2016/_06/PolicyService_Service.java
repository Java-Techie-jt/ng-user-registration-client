
package com.chubb.workview.policyservice._2016._06;

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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PolicyService", targetNamespace = "http://Chubb.WorkView.ServiceContracts/2009/06", wsdlLocation = "https://uk01deca021.aceins.com/WorkView/PolicyService/PolicyService.svc?wsdl")
public class PolicyService_Service
    extends Service
{

    private final static URL POLICYSERVICE_WSDL_LOCATION;
    private final static WebServiceException POLICYSERVICE_EXCEPTION;
    private final static QName POLICYSERVICE_QNAME = new QName("http://Chubb.WorkView.ServiceContracts/2009/06", "PolicyService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://uk01deca021.aceins.com/WorkView/PolicyService/PolicyService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        POLICYSERVICE_WSDL_LOCATION = url;
        POLICYSERVICE_EXCEPTION = e;
    }

    public PolicyService_Service() {
        super(__getWsdlLocation(), POLICYSERVICE_QNAME);
    }

    public PolicyService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), POLICYSERVICE_QNAME, features);
    }

    public PolicyService_Service(URL wsdlLocation) {
        super(wsdlLocation, POLICYSERVICE_QNAME);
    }

    public PolicyService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, POLICYSERVICE_QNAME, features);
    }

    public PolicyService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PolicyService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PolicyService
     */
    @WebEndpoint(name = "WSHttpBinding_PolicyService")
    public PolicyService getWSHttpBindingPolicyService() {
        return super.getPort(new QName("http://chubb.com/WorkView/PolicyService/2016/06", "WSHttpBinding_PolicyService"), PolicyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PolicyService
     */
    @WebEndpoint(name = "WSHttpBinding_PolicyService")
    public PolicyService getWSHttpBindingPolicyService(WebServiceFeature... features) {
        return super.getPort(new QName("http://chubb.com/WorkView/PolicyService/2016/06", "WSHttpBinding_PolicyService"), PolicyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (POLICYSERVICE_EXCEPTION!= null) {
            throw POLICYSERVICE_EXCEPTION;
        }
        return POLICYSERVICE_WSDL_LOCATION;
    }

}
