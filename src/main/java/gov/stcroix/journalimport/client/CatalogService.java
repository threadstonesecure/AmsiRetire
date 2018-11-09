
package gov.stcroix.journalimport.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lbo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifecycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xsdLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsdlAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogService", namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", propOrder = {
    "qName",
    "lbo",
    "lifecycle",
    "xsdLocation",
    "wsdlAddress",
    "serviceType"
})
public class CatalogService {

    @XmlElementRef(name = "qName", namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qName;
    @XmlElementRef(name = "lbo", namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lbo;
    @XmlElementRef(name = "lifecycle", namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lifecycle;
    @XmlElementRef(name = "xsdLocation", namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xsdLocation;
    @XmlElementRef(name = "wsdlAddress", namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wsdlAddress;
    @XmlElementRef(name = "serviceType", namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceType;

    /**
     * Gets the value of the qName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQName() {
        return qName;
    }

    /**
     * Sets the value of the qName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQName(JAXBElement<String> value) {
        this.qName = value;
    }

    /**
     * Gets the value of the lbo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLbo() {
        return lbo;
    }

    /**
     * Sets the value of the lbo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLbo(JAXBElement<String> value) {
        this.lbo = value;
    }

    /**
     * Gets the value of the lifecycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLifecycle() {
        return lifecycle;
    }

    /**
     * Sets the value of the lifecycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLifecycle(JAXBElement<String> value) {
        this.lifecycle = value;
    }

    /**
     * Gets the value of the xsdLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXsdLocation() {
        return xsdLocation;
    }

    /**
     * Sets the value of the xsdLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXsdLocation(JAXBElement<String> value) {
        this.xsdLocation = value;
    }

    /**
     * Gets the value of the wsdlAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWsdlAddress() {
        return wsdlAddress;
    }

    /**
     * Sets the value of the wsdlAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWsdlAddress(JAXBElement<String> value) {
        this.wsdlAddress = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceType(JAXBElement<String> value) {
        this.serviceType = value;
    }

}
