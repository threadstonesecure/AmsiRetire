
package gov.shelby.journalimport.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/}CatalogService"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result"
})
@XmlRootElement(name = "getServiceEndPointResponse", namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/types/")
public class GetServiceEndPointResponse {

    @XmlElement(namespace = "http://xmlns.oracle.com/oracle/apps/fnd/applcore/webservices/types/", required = true)
    protected CatalogService result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogService }
     *     
     */
    public CatalogService getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogService }
     *     
     */
    public void setResult(CatalogService value) {
        this.result = value;
    }

}
