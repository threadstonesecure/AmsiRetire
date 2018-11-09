
package gov.stcroix.journalimport.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.stcroix.journalimport.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Type_QNAME = new QName("commonj.sdo", "type");
    private final static QName _CatalogService_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", "catalogService");
    private final static QName _Types_QNAME = new QName("commonj.sdo", "types");
    private final static QName _ServiceErrorMessage_QNAME = new QName("http://xmlns.oracle.com/adf/svc/errors/", "ServiceErrorMessage");
    private final static QName _Datagraph_QNAME = new QName("commonj.sdo", "datagraph");
    private final static QName _DataObject_QNAME = new QName("commonj.sdo", "dataObject");
    private final static QName _CatalogServiceLifecycle_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", "lifecycle");
    private final static QName _CatalogServiceServiceType_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", "serviceType");
    private final static QName _CatalogServiceQName_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", "qName");
    private final static QName _CatalogServiceWsdlAddress_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", "wsdlAddress");
    private final static QName _CatalogServiceLbo_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", "lbo");
    private final static QName _CatalogServiceXsdLocation_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", "xsdLocation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.stcroix.journalimport.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceErrorMessage }
     * 
     */
    public ServiceErrorMessage createServiceErrorMessage() {
        return new ServiceErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceMessage }
     * 
     */
    public ServiceMessage createServiceMessage() {
        return new ServiceMessage();
    }

    /**
     * Create an instance of {@link ServiceDMLErrorMessage }
     * 
     */
    public ServiceDMLErrorMessage createServiceDMLErrorMessage() {
        return new ServiceDMLErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceAttrValErrorMessage }
     * 
     */
    public ServiceAttrValErrorMessage createServiceAttrValErrorMessage() {
        return new ServiceAttrValErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceRowValErrorMessage }
     * 
     */
    public ServiceRowValErrorMessage createServiceRowValErrorMessage() {
        return new ServiceRowValErrorMessage();
    }

    /**
     * Create an instance of {@link JavaInfo }
     * 
     */
    public JavaInfo createJavaInfo() {
        return new JavaInfo();
    }

    /**
     * Create an instance of {@link Types }
     * 
     */
    public Types createTypes() {
        return new Types();
    }

    /**
     * Create an instance of {@link DataGraphType }
     * 
     */
    public DataGraphType createDataGraphType() {
        return new DataGraphType();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link ChangeSummaryType }
     * 
     */
    public ChangeSummaryType createChangeSummaryType() {
        return new ChangeSummaryType();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link XSDType }
     * 
     */
    public XSDType createXSDType() {
        return new XSDType();
    }

    /**
     * Create an instance of {@link ModelsType }
     * 
     */
    public ModelsType createModelsType() {
        return new ModelsType();
    }

    /**
     * Create an instance of {@link GetServiceEndPointResponse }
     * 
     */
    public GetServiceEndPointResponse createGetServiceEndPointResponse() {
        return new GetServiceEndPointResponse();
    }

    /**
     * Create an instance of {@link CatalogService }
     * 
     */
    public CatalogService createCatalogService() {
        return new CatalogService();
    }

    /**
     * Create an instance of {@link GetServiceEndPoint }
     * 
     */
    public GetServiceEndPoint createGetServiceEndPoint() {
        return new GetServiceEndPoint();
    }

    /**
     * Create an instance of {@link GetAllServiceEndPointsResponse }
     * 
     */
    public GetAllServiceEndPointsResponse createGetAllServiceEndPointsResponse() {
        return new GetAllServiceEndPointsResponse();
    }

    /**
     * Create an instance of {@link GetAllServiceEndPoints }
     * 
     */
    public GetAllServiceEndPoints createGetAllServiceEndPoints() {
        return new GetAllServiceEndPoints();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", name = "catalogService")
    public JAXBElement<CatalogService> createCatalogService(CatalogService value) {
        return new JAXBElement<CatalogService>(_CatalogService_QNAME, CatalogService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Types }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "types")
    public JAXBElement<Types> createTypes(Types value) {
        return new JAXBElement<Types>(_Types_QNAME, Types.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/errors/", name = "ServiceErrorMessage")
    public JAXBElement<ServiceErrorMessage> createServiceErrorMessage(ServiceErrorMessage value) {
        return new JAXBElement<ServiceErrorMessage>(_ServiceErrorMessage_QNAME, ServiceErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataGraphType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "datagraph")
    public JAXBElement<DataGraphType> createDatagraph(DataGraphType value) {
        return new JAXBElement<DataGraphType>(_Datagraph_QNAME, DataGraphType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "dataObject")
    public JAXBElement<Object> createDataObject(Object value) {
        return new JAXBElement<Object>(_DataObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", name = "lifecycle", scope = CatalogService.class)
    public JAXBElement<String> createCatalogServiceLifecycle(String value) {
        return new JAXBElement<String>(_CatalogServiceLifecycle_QNAME, String.class, CatalogService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", name = "serviceType", scope = CatalogService.class)
    public JAXBElement<String> createCatalogServiceServiceType(String value) {
        return new JAXBElement<String>(_CatalogServiceServiceType_QNAME, String.class, CatalogService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", name = "qName", scope = CatalogService.class)
    public JAXBElement<String> createCatalogServiceQName(String value) {
        return new JAXBElement<String>(_CatalogServiceQName_QNAME, String.class, CatalogService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", name = "wsdlAddress", scope = CatalogService.class)
    public JAXBElement<String> createCatalogServiceWsdlAddress(String value) {
        return new JAXBElement<String>(_CatalogServiceWsdlAddress_QNAME, String.class, CatalogService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", name = "lbo", scope = CatalogService.class)
    public JAXBElement<String> createCatalogServiceLbo(String value) {
        return new JAXBElement<String>(_CatalogServiceLbo_QNAME, String.class, CatalogService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", name = "xsdLocation", scope = CatalogService.class)
    public JAXBElement<String> createCatalogServiceXsdLocation(String value) {
        return new JAXBElement<String>(_CatalogServiceXsdLocation_QNAME, String.class, CatalogService.class, value);
    }

}
