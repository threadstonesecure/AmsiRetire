
package cloud.data.integration.common.webservice;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ErpObjectAttachmentService", targetNamespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", wsdlLocation = "https://efff-test.fin.us6.oraclecloud.com/publicFinancialCommonErpIntegration/ErpObjectAttachmentService?WSDL")
public class ErpObjectAttachmentService_Service
    extends Service
{

    private final static URL ERPOBJECTATTACHMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ERPOBJECTATTACHMENTSERVICE_EXCEPTION;
    private final static QName ERPOBJECTATTACHMENTSERVICE_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "ErpObjectAttachmentService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://efff.fin.us6.oraclecloud.com/publicFinancialCommonErpIntegration/ErpObjectAttachmentService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ERPOBJECTATTACHMENTSERVICE_WSDL_LOCATION = url;
        ERPOBJECTATTACHMENTSERVICE_EXCEPTION = e;
    }

    public ErpObjectAttachmentService_Service() {
        super(__getWsdlLocation(), ERPOBJECTATTACHMENTSERVICE_QNAME);
    }

    public ErpObjectAttachmentService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ERPOBJECTATTACHMENTSERVICE_QNAME, features);
    }

    public ErpObjectAttachmentService_Service(URL wsdlLocation) {
        super(wsdlLocation, ERPOBJECTATTACHMENTSERVICE_QNAME);
    }

    public ErpObjectAttachmentService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ERPOBJECTATTACHMENTSERVICE_QNAME, features);
    }

    public ErpObjectAttachmentService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ErpObjectAttachmentService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ErpObjectAttachmentService
     */
    @WebEndpoint(name = "ErpObjectAttachmentServiceSoapHttpPort")
    public ErpObjectAttachmentService getErpObjectAttachmentServiceSoapHttpPort() {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "ErpObjectAttachmentServiceSoapHttpPort"), ErpObjectAttachmentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ErpObjectAttachmentService
     */
    @WebEndpoint(name = "ErpObjectAttachmentServiceSoapHttpPort")
    public ErpObjectAttachmentService getErpObjectAttachmentServiceSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "ErpObjectAttachmentServiceSoapHttpPort"), ErpObjectAttachmentService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ERPOBJECTATTACHMENTSERVICE_EXCEPTION!= null) {
            throw ERPOBJECTATTACHMENTSERVICE_EXCEPTION;
        }
        return ERPOBJECTATTACHMENTSERVICE_WSDL_LOCATION;
    }

}
