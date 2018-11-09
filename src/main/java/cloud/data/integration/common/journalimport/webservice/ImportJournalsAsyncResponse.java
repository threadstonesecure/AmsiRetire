
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
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlRootElement(name = "importJournalsAsyncResponse", namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/types/")
public class ImportJournalsAsyncResponse {

    @XmlElement(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/types/")
    protected long result;

    /**
     * Gets the value of the result property.
     * 
     */
    public long getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(long value) {
        this.result = value;
    }

}
