
package cloud.data.integration.common.journalimport.webservice;

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
 *         &lt;element name="interfaceRows" type="{http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/}GlInterfaceTransHeader"/>
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
    "interfaceRows"
})
@XmlRootElement(name = "importJournalsAsync", namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/types/")
public class ImportJournalsAsync {

    @XmlElement(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/types/", required = true)
    protected GlInterfaceTransHeader interfaceRows;

    /**
     * Gets the value of the interfaceRows property.
     * 
     * @return
     *     possible object is
     *     {@link GlInterfaceTransHeader }
     *     
     */
    public GlInterfaceTransHeader getInterfaceRows() {
        return interfaceRows;
    }

    /**
     * Sets the value of the interfaceRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlInterfaceTransHeader }
     *     
     */
    public void setInterfaceRows(GlInterfaceTransHeader value) {
        this.interfaceRows = value;
    }

}
