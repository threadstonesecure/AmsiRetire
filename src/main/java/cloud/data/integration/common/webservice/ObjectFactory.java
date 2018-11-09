
package cloud.data.integration.common.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cloud.data.integration.common.webservice package. 
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

    private final static QName _AttachmentDetails_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "attachmentDetails");
    private final static QName _Type_QNAME = new QName("commonj.sdo", "type");
    private final static QName _DownloadAttachmentDtls_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "downloadAttachmentDtls");
    private final static QName _DownloadedAttachment_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "downloadedAttachment");
    private final static QName _Fault_QNAME = new QName("http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", "Fault");
    private final static QName _Types_QNAME = new QName("commonj.sdo", "types");
    private final static QName _Datagraph_QNAME = new QName("commonj.sdo", "datagraph");
    private final static QName _ServiceErrorMessage_QNAME = new QName("http://xmlns.oracle.com/adf/svc/errors/", "ServiceErrorMessage");
    private final static QName _DataObject_QNAME = new QName("commonj.sdo", "dataObject");
    private final static QName _DownloadedAttachmentAttachmentType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "AttachmentType");
    private final static QName _DownloadedAttachmentAttachmentContent_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "AttachmentContent");
    private final static QName _AttachmentDetailsContent_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "Content");
    private final static QName _AttachmentDetailsUserKeyE_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "UserKeyE");
    private final static QName _AttachmentDetailsUserKeyD_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "UserKeyD");
    private final static QName _AttachmentDetailsUserKeyC_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "UserKeyC");
    private final static QName _AttachmentDetailsUserKeyB_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "UserKeyB");
    private final static QName _AttachmentDetailsUserKeyA_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "UserKeyA");
    private final static QName _AttachmentDetailsTitle_QNAME = new QName("http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", "Title");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cloud.data.integration.common.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link UploadAttachmentResponse }
     * 
     */
    public UploadAttachmentResponse createUploadAttachmentResponse() {
        return new UploadAttachmentResponse();
    }

    /**
     * Create an instance of {@link DownloadAttachment }
     * 
     */
    public DownloadAttachment createDownloadAttachment() {
        return new DownloadAttachment();
    }

    /**
     * Create an instance of {@link DownloadAttachmentDtls }
     * 
     */
    public DownloadAttachmentDtls createDownloadAttachmentDtls() {
        return new DownloadAttachmentDtls();
    }

    /**
     * Create an instance of {@link UploadAttachmentAsync }
     * 
     */
    public UploadAttachmentAsync createUploadAttachmentAsync() {
        return new UploadAttachmentAsync();
    }

    /**
     * Create an instance of {@link AttachmentDetails }
     * 
     */
    public AttachmentDetails createAttachmentDetails() {
        return new AttachmentDetails();
    }

    /**
     * Create an instance of {@link UploadAttachmentAsyncResponse }
     * 
     */
    public UploadAttachmentAsyncResponse createUploadAttachmentAsyncResponse() {
        return new UploadAttachmentAsyncResponse();
    }

    /**
     * Create an instance of {@link DownloadAttachmentResponse }
     * 
     */
    public DownloadAttachmentResponse createDownloadAttachmentResponse() {
        return new DownloadAttachmentResponse();
    }

    /**
     * Create an instance of {@link DownloadedAttachment }
     * 
     */
    public DownloadedAttachment createDownloadedAttachment() {
        return new DownloadedAttachment();
    }

    /**
     * Create an instance of {@link DownloadAttachmentAsyncResponse }
     * 
     */
    public DownloadAttachmentAsyncResponse createDownloadAttachmentAsyncResponse() {
        return new DownloadAttachmentAsyncResponse();
    }

    /**
     * Create an instance of {@link DownloadAttachmentAsync }
     * 
     */
    public DownloadAttachmentAsync createDownloadAttachmentAsync() {
        return new DownloadAttachmentAsync();
    }

    /**
     * Create an instance of {@link UploadAttachment }
     * 
     */
    public UploadAttachment createUploadAttachment() {
        return new UploadAttachment();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "attachmentDetails")
    public JAXBElement<AttachmentDetails> createAttachmentDetails(AttachmentDetails value) {
        return new JAXBElement<AttachmentDetails>(_AttachmentDetails_QNAME, AttachmentDetails.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadAttachmentDtls }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "downloadAttachmentDtls")
    public JAXBElement<DownloadAttachmentDtls> createDownloadAttachmentDtls(DownloadAttachmentDtls value) {
        return new JAXBElement<DownloadAttachmentDtls>(_DownloadAttachmentDtls_QNAME, DownloadAttachmentDtls.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadedAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "downloadedAttachment")
    public JAXBElement<DownloadedAttachment> createDownloadedAttachment(DownloadedAttachment value) {
        return new JAXBElement<DownloadedAttachment>(_DownloadedAttachment_QNAME, DownloadedAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", name = "Fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DataGraphType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "datagraph")
    public JAXBElement<DataGraphType> createDatagraph(DataGraphType value) {
        return new JAXBElement<DataGraphType>(_Datagraph_QNAME, DataGraphType.class, null, value);
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
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "AttachmentType", scope = DownloadedAttachment.class)
    public JAXBElement<String> createDownloadedAttachmentAttachmentType(String value) {
        return new JAXBElement<String>(_DownloadedAttachmentAttachmentType_QNAME, String.class, DownloadedAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "AttachmentContent", scope = DownloadedAttachment.class)
    public JAXBElement<String> createDownloadedAttachmentAttachmentContent(String value) {
        return new JAXBElement<String>(_DownloadedAttachmentAttachmentContent_QNAME, String.class, DownloadedAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "AttachmentType", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsAttachmentType(String value) {
        return new JAXBElement<String>(_DownloadedAttachmentAttachmentType_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "Content", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsContent(String value) {
        return new JAXBElement<String>(_AttachmentDetailsContent_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "UserKeyE", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsUserKeyE(String value) {
        return new JAXBElement<String>(_AttachmentDetailsUserKeyE_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "UserKeyD", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsUserKeyD(String value) {
        return new JAXBElement<String>(_AttachmentDetailsUserKeyD_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "UserKeyC", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsUserKeyC(String value) {
        return new JAXBElement<String>(_AttachmentDetailsUserKeyC_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "UserKeyB", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsUserKeyB(String value) {
        return new JAXBElement<String>(_AttachmentDetailsUserKeyB_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "UserKeyA", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsUserKeyA(String value) {
        return new JAXBElement<String>(_AttachmentDetailsUserKeyA_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "Title", scope = AttachmentDetails.class)
    public JAXBElement<String> createAttachmentDetailsTitle(String value) {
        return new JAXBElement<String>(_AttachmentDetailsTitle_QNAME, String.class, AttachmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "UserKeyE", scope = DownloadAttachmentDtls.class)
    public JAXBElement<String> createDownloadAttachmentDtlsUserKeyE(String value) {
        return new JAXBElement<String>(_AttachmentDetailsUserKeyE_QNAME, String.class, DownloadAttachmentDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "UserKeyD", scope = DownloadAttachmentDtls.class)
    public JAXBElement<String> createDownloadAttachmentDtlsUserKeyD(String value) {
        return new JAXBElement<String>(_AttachmentDetailsUserKeyD_QNAME, String.class, DownloadAttachmentDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "UserKeyC", scope = DownloadAttachmentDtls.class)
    public JAXBElement<String> createDownloadAttachmentDtlsUserKeyC(String value) {
        return new JAXBElement<String>(_AttachmentDetailsUserKeyC_QNAME, String.class, DownloadAttachmentDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "UserKeyB", scope = DownloadAttachmentDtls.class)
    public JAXBElement<String> createDownloadAttachmentDtlsUserKeyB(String value) {
        return new JAXBElement<String>(_AttachmentDetailsUserKeyB_QNAME, String.class, DownloadAttachmentDtls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", name = "UserKeyA", scope = DownloadAttachmentDtls.class)
    public JAXBElement<String> createDownloadAttachmentDtlsUserKeyA(String value) {
        return new JAXBElement<String>(_AttachmentDetailsUserKeyA_QNAME, String.class, DownloadAttachmentDtls.class, value);
    }

}
