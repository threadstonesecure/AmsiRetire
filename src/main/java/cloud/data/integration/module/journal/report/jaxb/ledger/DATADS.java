//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.08 at 03:40:55 PM EDT 
//


package cloud.data.integration.module.journal.report.jaxb.ledger;

import java.math.BigDecimal;
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
 *         &lt;element name="P_LEDGER_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="G_1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LEDGER_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "pledgername",
    "g1"
})
@XmlRootElement(name = "DATA_DS")
public class DATADS {

    @XmlElement(name = "P_LEDGER_NAME", required = true)
    protected String pledgername;
    @XmlElement(name = "G_1", required = true)
    protected DATADS.G1 g1;

    /**
     * Gets the value of the pledgername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLEDGERNAME() {
        return pledgername;
    }

    /**
     * Sets the value of the pledgername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLEDGERNAME(String value) {
        this.pledgername = value;
    }

    /**
     * Gets the value of the g1 property.
     * 
     * @return
     *     possible object is
     *     {@link DATADS.G1 }
     *     
     */
    public DATADS.G1 getG1() {
        return g1;
    }

    /**
     * Sets the value of the g1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATADS.G1 }
     *     
     */
    public void setG1(DATADS.G1 value) {
        this.g1 = value;
    }


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
     *         &lt;element name="LEDGER_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
        "ledgerid"
    })
    public static class G1 {

        @XmlElement(name = "LEDGER_ID", required = true)
        protected BigDecimal ledgerid;

        /**
         * Gets the value of the ledgerid property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLEDGERID() {
            return ledgerid;
        }

        /**
         * Sets the value of the ledgerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLEDGERID(BigDecimal value) {
            this.ledgerid = value;
        }

    }

}
