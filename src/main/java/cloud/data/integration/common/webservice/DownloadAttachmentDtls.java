
package cloud.data.integration.common.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadAttachmentDtls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadAttachmentDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserKeyA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserKeyB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserKeyC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserKeyD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserKeyE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadAttachmentDtls", namespace = "http://xmlns.oracle.com/apps/financials/commonModules/shared/model/erpIntegrationService/", propOrder = {
    "entityName",
    "categoryName",
    "userKeyA",
    "userKeyB",
    "userKeyC",
    "userKeyD",
    "userKeyE"
})
public class DownloadAttachmentDtls {

    @XmlElement(name = "EntityName", required = true)
    protected String entityName;
    @XmlElement(name = "CategoryName", required = true)
    protected String categoryName;
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

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

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

}
