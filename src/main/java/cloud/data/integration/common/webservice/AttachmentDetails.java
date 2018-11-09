
package cloud.data.integration.common.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserKeyA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserKeyB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserKeyC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserKeyD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserKeyE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentDetails", namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", propOrder = {
    "userKeyA",
    "userKeyB",
    "userKeyC",
    "userKeyD",
    "userKeyE",
    "attachmentType",
    "title",
    "content"
})
public class AttachmentDetails {

    @XmlElementRef(name = "UserKeyA", namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userKeyA;
    @XmlElementRef(name = "UserKeyB", namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userKeyB;
    @XmlElementRef(name = "UserKeyC", namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userKeyC;
    @XmlElementRef(name = "UserKeyD", namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userKeyD;
    @XmlElementRef(name = "UserKeyE", namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userKeyE;
    @XmlElementRef(name = "AttachmentType", namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attachmentType;
    @XmlElementRef(name = "Title", namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "Content", namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> content;

    /**
     * Gets the value of the userKeyA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserKeyA() {
        return userKeyA;
    }

    /**
     * Sets the value of the userKeyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserKeyA(JAXBElement<String> value) {
        this.userKeyA = value;
    }

    /**
     * Gets the value of the userKeyB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserKeyB() {
        return userKeyB;
    }

    /**
     * Sets the value of the userKeyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserKeyB(JAXBElement<String> value) {
        this.userKeyB = value;
    }

    /**
     * Gets the value of the userKeyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserKeyC() {
        return userKeyC;
    }

    /**
     * Sets the value of the userKeyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserKeyC(JAXBElement<String> value) {
        this.userKeyC = value;
    }

    /**
     * Gets the value of the userKeyD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserKeyD() {
        return userKeyD;
    }

    /**
     * Sets the value of the userKeyD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserKeyD(JAXBElement<String> value) {
        this.userKeyD = value;
    }

    /**
     * Gets the value of the userKeyE property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserKeyE() {
        return userKeyE;
    }

    /**
     * Sets the value of the userKeyE property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserKeyE(JAXBElement<String> value) {
        this.userKeyE = value;
    }

    /**
     * Gets the value of the attachmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttachmentType() {
        return attachmentType;
    }

    /**
     * Sets the value of the attachmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttachmentType(JAXBElement<String> value) {
        this.attachmentType = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContent(JAXBElement<String> value) {
        this.content = value;
    }

}
