
package cloud.data.integration.common.journalimport.webservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cloud.data.integration.common.journalimport.webservice package. 
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
    private final static QName _FindControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findControl");
    private final static QName _ProcessControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "processControl");
    private final static QName _FindCriteria_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findCriteria");
    private final static QName _GlInterfaceTransHeader_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "glInterfaceTransHeader");
    private final static QName _GlInterface_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "glInterface");
    private final static QName _Types_QNAME = new QName("commonj.sdo", "types");
    private final static QName _Fault_QNAME = new QName("http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", "Fault");
    private final static QName _Datagraph_QNAME = new QName("commonj.sdo", "datagraph");
    private final static QName _DataObject_QNAME = new QName("commonj.sdo", "dataObject");
    private final static QName _Account_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "account");
    private final static QName _StCroixCounty_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "stCroixCounty");
    private final static QName _ServiceErrorMessage_QNAME = new QName("http://xmlns.oracle.com/adf/svc/errors/", "ServiceErrorMessage");
    private final static QName _StCroixCountyFund_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "fund");
    private final static QName _StCroixCountyFuture1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "future1");
    private final static QName _StCroixCountyDepartment_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "department");
    private final static QName _StCroixCountyProgram_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "program");
    private final static QName _StCroixCountyProject_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "project");
    private final static QName _GlInterfaceTransHeaderErrorToSuspenseFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "ErrorToSuspenseFlag");
    private final static QName _GlInterfaceTransHeaderAccountingDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "AccountingDate");
    private final static QName _GlInterfaceTransHeaderSummaryFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "SummaryFlag");
    private final static QName _GlInterfaceTransHeaderLedgerId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "LedgerId");
    private final static QName _GlInterfaceTransHeaderAccountingPeriodName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "AccountingPeriodName");
    private final static QName _GlInterfaceTransHeaderUserCategoryName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "UserCategoryName");
    private final static QName _GlInterfaceTransHeaderUserSourceName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "UserSourceName");
    private final static QName _GlInterfaceTransHeaderBatchDescription_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "BatchDescription");
    private final static QName _GlInterfaceTransHeaderBatchName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "BatchName");
    private final static QName _GlInterfaceTransHeaderImportDescriptiveFlexField_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "ImportDescriptiveFlexField");
    private final static QName _GlInterfaceManagementSegmentValue_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "ManagementSegmentValue");
    private final static QName _GlInterfaceReferenceDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "ReferenceDate");
    private final static QName _GlInterfaceAverageJournalFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "AverageJournalFlag");
    private final static QName _GlInterfaceChartOfAccountsId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "ChartOfAccountsId");
    private final static QName _GlInterfaceSetOfBooksId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "SetOfBooksId");
    private final static QName _GlInterfaceAttribute10_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute10");
    private final static QName _GlInterfaceAttribute11_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute11");
    private final static QName _GlInterfaceAttribute12_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute12");
    private final static QName _GlInterfaceAttribute13_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute13");
    private final static QName _GlInterfaceAttribute14_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute14");
    private final static QName _GlInterfaceCurrencyConversionRate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "CurrencyConversionRate");
    private final static QName _GlInterfaceBalancingSegmentValue_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "BalancingSegmentValue");
    private final static QName _GlInterfaceAttributeCategory2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "AttributeCategory2");
    private final static QName _GlInterfaceInvoiceDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "InvoiceDate");
    private final static QName _GlInterfaceAttributeCategory3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "AttributeCategory3");
    private final static QName _GlInterfaceJeCategoryName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "JeCategoryName");
    private final static QName _GlInterfaceTransactionDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "TransactionDate");
    private final static QName _GlInterfaceAttribute15_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute15");
    private final static QName _GlInterfaceAttribute16_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute16");
    private final static QName _GlInterfaceAttribute17_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute17");
    private final static QName _GlInterfaceAttribute18_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute18");
    private final static QName _GlInterfaceAttribute19_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute19");
    private final static QName _GlInterfaceJgzzReconReference_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "JgzzReconReference");
    private final static QName _GlInterfaceSegment3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment3");
    private final static QName _GlInterfaceSegment4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment4");
    private final static QName _GlInterfaceAttributeCategory_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "AttributeCategory");
    private final static QName _GlInterfaceSegment5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment5");
    private final static QName _GlInterfaceAttribute20_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute20");
    private final static QName _GlInterfaceSegment6_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment6");
    private final static QName _GlInterfaceSegment7_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment7");
    private final static QName _GlInterfaceSegment8_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment8");
    private final static QName _GlInterfaceSegment9_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment9");
    private final static QName _GlInterfaceStatisticalValue_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "StatisticalValue");
    private final static QName _GlInterfaceReference2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference2");
    private final static QName _GlInterfaceReference1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference1");
    private final static QName _GlInterfaceGlSlLinkTable_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "GlSlLinkTable");
    private final static QName _GlInterfaceReference9_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference9");
    private final static QName _GlInterfaceReference8_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference8");
    private final static QName _GlInterfaceReference7_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference7");
    private final static QName _GlInterfaceReference6_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference6");
    private final static QName _GlInterfaceReference5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference5");
    private final static QName _GlInterfaceReference4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference4");
    private final static QName _GlInterfaceReference3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference3");
    private final static QName _GlInterfaceJeSourceName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "JeSourceName");
    private final static QName _GlInterfaceSegment10_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment10");
    private final static QName _GlInterfaceSegment11_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment11");
    private final static QName _GlInterfaceEnteredCrAmount_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "EnteredCrAmount");
    private final static QName _GlInterfaceEnteredDrAmount_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "EnteredDrAmount");
    private final static QName _GlInterfaceSegment14_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment14");
    private final static QName _GlInterfaceSegment15_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment15");
    private final static QName _GlInterfaceSegment12_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment12");
    private final static QName _GlInterfaceSegment13_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment13");
    private final static QName _GlInterfaceSegment18_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment18");
    private final static QName _GlInterfaceSegment19_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment19");
    private final static QName _GlInterfaceSegment16_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment16");
    private final static QName _GlInterfaceSegment17_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment17");
    private final static QName _GlInterfaceAccountedDr_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "AccountedDr");
    private final static QName _GlInterfaceSegment21_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment21");
    private final static QName _GlInterfaceUserCurrencyConversionType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "UserCurrencyConversionType");
    private final static QName _GlInterfaceReference11_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference11");
    private final static QName _GlInterfaceSegment22_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment22");
    private final static QName _GlInterfaceReference10_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference10");
    private final static QName _GlInterfaceSegment20_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment20");
    private final static QName _GlInterfaceSegment25_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment25");
    private final static QName _GlInterfaceReference15_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference15");
    private final static QName _GlInterfaceSegment26_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment26");
    private final static QName _GlInterfaceReference14_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference14");
    private final static QName _GlInterfaceSegment23_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment23");
    private final static QName _GlInterfaceReference13_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference13");
    private final static QName _GlInterfaceOriginatingBalSegValue_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "OriginatingBalSegValue");
    private final static QName _GlInterfaceSegment24_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment24");
    private final static QName _GlInterfaceReference12_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference12");
    private final static QName _GlInterfaceSegment29_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment29");
    private final static QName _GlInterfaceSegment27_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment27");
    private final static QName _GlInterfaceSegment28_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment28");
    private final static QName _GlInterfaceUSSGLTransactionCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "USSGLTransactionCode");
    private final static QName _GlInterfaceAccountedCr_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "AccountedCr");
    private final static QName _GlInterfaceGlInterfaceId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "GlInterfaceId");
    private final static QName _GlInterfaceReference19_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference19");
    private final static QName _GlInterfaceReference18_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference18");
    private final static QName _GlInterfaceReference17_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference17");
    private final static QName _GlInterfaceReference16_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference16");
    private final static QName _GlInterfaceInvoiceIdentifier_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "InvoiceIdentifier");
    private final static QName _GlInterfaceReference22_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference22");
    private final static QName _GlInterfaceReference21_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference21");
    private final static QName _GlInterfaceSegment30_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment30");
    private final static QName _GlInterfaceReference20_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference20");
    private final static QName _GlInterfaceReference26_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference26");
    private final static QName _GlInterfaceReference25_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference25");
    private final static QName _GlInterfaceReference24_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference24");
    private final static QName _GlInterfaceReference23_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference23");
    private final static QName _GlInterfaceTaxCode_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "TaxCode");
    private final static QName _GlInterfaceAttribute2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute2");
    private final static QName _GlInterfaceAttribute3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute3");
    private final static QName _GlInterfaceCurrencyConversionDate_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "CurrencyConversionDate");
    private final static QName _GlInterfaceInvoiceAmount_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "InvoiceAmount");
    private final static QName _GlInterfaceAttribute1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute1");
    private final static QName _GlInterfaceReference29_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference29");
    private final static QName _GlInterfaceReference28_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference28");
    private final static QName _GlInterfaceAttribute8_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute8");
    private final static QName _GlInterfaceReference27_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference27");
    private final static QName _GlInterfaceAttribute9_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute9");
    private final static QName _GlInterfaceAttribute6_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute6");
    private final static QName _GlInterfaceAttribute7_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute7");
    private final static QName _GlInterfaceCurrencyConversionType_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "CurrencyConversionType");
    private final static QName _GlInterfaceAttribute4_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute4");
    private final static QName _GlInterfaceAttribute5_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Attribute5");
    private final static QName _GlInterfacePeriodName_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "PeriodName");
    private final static QName _GlInterfaceReference30_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Reference30");
    private final static QName _GlInterfaceSegment1_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment1");
    private final static QName _GlInterfaceSegment2_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "Segment2");
    private final static QName _GlInterfaceGlSlLinkId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "GlSlLinkId");
    private final static QName _GlInterfaceCodeCombinationId_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "CodeCombinationId");
    private final static QName _GlInterfaceDescrFlexErrorMessage_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", "DescrFlexErrorMessage");
    private final static QName _AccountReference3_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "Reference3");
    private final static QName _AccountJgzzReconFlag_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "JgzzReconFlag");
    private final static QName _AccountEndDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "EndDateActive");
    private final static QName _AccountFinancialCategory_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "FinancialCategory");
    private final static QName _AccountStartDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "StartDateActive");
    private final static QName _AccountFNDACFFDelimiter_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "FND_ACFF_Delimiter");
    private final static QName _AccountFNDACFFConcatenatedStorage_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "FND_ACFF_ConcatenatedStorage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cloud.data.integration.common.journalimport.webservice
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
     * Create an instance of {@link ImportJournalsResponse }
     * 
     */
    public ImportJournalsResponse createImportJournalsResponse() {
        return new ImportJournalsResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeResponse }
     * 
     */
    public GetServiceLastUpdateTimeResponse createGetServiceLastUpdateTimeResponse() {
        return new GetServiceLastUpdateTimeResponse();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsAsync }
     * 
     */
    public GetDfltObjAttrHintsAsync createGetDfltObjAttrHintsAsync() {
        return new GetDfltObjAttrHintsAsync();
    }

    /**
     * Create an instance of {@link GetEntityListAsync }
     * 
     */
    public GetEntityListAsync createGetEntityListAsync() {
        return new GetEntityListAsync();
    }

    /**
     * Create an instance of {@link ImportJournals }
     * 
     */
    public ImportJournals createImportJournals() {
        return new ImportJournals();
    }

    /**
     * Create an instance of {@link GlInterfaceTransHeader }
     * 
     */
    public GlInterfaceTransHeader createGlInterfaceTransHeader() {
        return new GlInterfaceTransHeader();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHints }
     * 
     */
    public GetDfltObjAttrHints createGetDfltObjAttrHints() {
        return new GetDfltObjAttrHints();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsAsyncResponse }
     * 
     */
    public GetDfltObjAttrHintsAsyncResponse createGetDfltObjAttrHintsAsyncResponse() {
        return new GetDfltObjAttrHintsAsyncResponse();
    }

    /**
     * Create an instance of {@link ObjAttrHints }
     * 
     */
    public ObjAttrHints createObjAttrHints() {
        return new ObjAttrHints();
    }

    /**
     * Create an instance of {@link ImportJournalsAsyncResponse }
     * 
     */
    public ImportJournalsAsyncResponse createImportJournalsAsyncResponse() {
        return new ImportJournalsAsyncResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeAsync }
     * 
     */
    public GetServiceLastUpdateTimeAsync createGetServiceLastUpdateTimeAsync() {
        return new GetServiceLastUpdateTimeAsync();
    }

    /**
     * Create an instance of {@link GetEntityList }
     * 
     */
    public GetEntityList createGetEntityList() {
        return new GetEntityList();
    }

    /**
     * Create an instance of {@link GetEntityListResponse }
     * 
     */
    public GetEntityListResponse createGetEntityListResponse() {
        return new GetEntityListResponse();
    }

    /**
     * Create an instance of {@link ServiceViewInfo }
     * 
     */
    public ServiceViewInfo createServiceViewInfo() {
        return new ServiceViewInfo();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTime }
     * 
     */
    public GetServiceLastUpdateTime createGetServiceLastUpdateTime() {
        return new GetServiceLastUpdateTime();
    }

    /**
     * Create an instance of {@link GetEntityListAsyncResponse }
     * 
     */
    public GetEntityListAsyncResponse createGetEntityListAsyncResponse() {
        return new GetEntityListAsyncResponse();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsResponse }
     * 
     */
    public GetDfltObjAttrHintsResponse createGetDfltObjAttrHintsResponse() {
        return new GetDfltObjAttrHintsResponse();
    }

    /**
     * Create an instance of {@link ImportJournalsAsync }
     * 
     */
    public ImportJournalsAsync createImportJournalsAsync() {
        return new ImportJournalsAsync();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeAsyncResponse }
     * 
     */
    public GetServiceLastUpdateTimeAsyncResponse createGetServiceLastUpdateTimeAsyncResponse() {
        return new GetServiceLastUpdateTimeAsyncResponse();
    }

    /**
     * Create an instance of {@link ProcessControl }
     * 
     */
    public ProcessControl createProcessControl() {
        return new ProcessControl();
    }

    /**
     * Create an instance of {@link FindCriteria }
     * 
     */
    public FindCriteria createFindCriteria() {
        return new FindCriteria();
    }

    /**
     * Create an instance of {@link FindControl }
     * 
     */
    public FindControl createFindControl() {
        return new FindControl();
    }

    /**
     * Create an instance of {@link ChildFindCriteria }
     * 
     */
    public ChildFindCriteria createChildFindCriteria() {
        return new ChildFindCriteria();
    }

    /**
     * Create an instance of {@link BigIntegerResult }
     * 
     */
    public BigIntegerResult createBigIntegerResult() {
        return new BigIntegerResult();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link DateResult }
     * 
     */
    public DateResult createDateResult() {
        return new DateResult();
    }

    /**
     * Create an instance of {@link DoubleResult }
     * 
     */
    public DoubleResult createDoubleResult() {
        return new DoubleResult();
    }

    /**
     * Create an instance of {@link DataObjectResult }
     * 
     */
    public DataObjectResult createDataObjectResult() {
        return new DataObjectResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaItem }
     * 
     */
    public ViewCriteriaItem createViewCriteriaItem() {
        return new ViewCriteriaItem();
    }

    /**
     * Create an instance of {@link AttrCtrlHints }
     * 
     */
    public AttrCtrlHints createAttrCtrlHints() {
        return new AttrCtrlHints();
    }

    /**
     * Create an instance of {@link LongResult }
     * 
     */
    public LongResult createLongResult() {
        return new LongResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaRow }
     * 
     */
    public ViewCriteriaRow createViewCriteriaRow() {
        return new ViewCriteriaRow();
    }

    /**
     * Create an instance of {@link BigDecimalResult }
     * 
     */
    public BigDecimalResult createBigDecimalResult() {
        return new BigDecimalResult();
    }

    /**
     * Create an instance of {@link BooleanResult }
     * 
     */
    public BooleanResult createBooleanResult() {
        return new BooleanResult();
    }

    /**
     * Create an instance of {@link SortAttribute }
     * 
     */
    public SortAttribute createSortAttribute() {
        return new SortAttribute();
    }

    /**
     * Create an instance of {@link TimestampResult }
     * 
     */
    public TimestampResult createTimestampResult() {
        return new TimestampResult();
    }

    /**
     * Create an instance of {@link SortOrder }
     * 
     */
    public SortOrder createSortOrder() {
        return new SortOrder();
    }

    /**
     * Create an instance of {@link ShortResult }
     * 
     */
    public ShortResult createShortResult() {
        return new ShortResult();
    }

    /**
     * Create an instance of {@link BytesResult }
     * 
     */
    public BytesResult createBytesResult() {
        return new BytesResult();
    }

    /**
     * Create an instance of {@link CtrlHint }
     * 
     */
    public CtrlHint createCtrlHint() {
        return new CtrlHint();
    }

    /**
     * Create an instance of {@link FloatResult }
     * 
     */
    public FloatResult createFloatResult() {
        return new FloatResult();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link TimeResult }
     * 
     */
    public TimeResult createTimeResult() {
        return new TimeResult();
    }

    /**
     * Create an instance of {@link StringResult }
     * 
     */
    public StringResult createStringResult() {
        return new StringResult();
    }

    /**
     * Create an instance of {@link DataHandlerResult }
     * 
     */
    public DataHandlerResult createDataHandlerResult() {
        return new DataHandlerResult();
    }

    /**
     * Create an instance of {@link ViewCriteria }
     * 
     */
    public ViewCriteria createViewCriteria() {
        return new ViewCriteria();
    }

    /**
     * Create an instance of {@link ByteResult }
     * 
     */
    public ByteResult createByteResult() {
        return new ByteResult();
    }

    /**
     * Create an instance of {@link MethodResult }
     * 
     */
    public MethodResult createMethodResult() {
        return new MethodResult();
    }

    /**
     * Create an instance of {@link IntegerResult }
     * 
     */
    public IntegerResult createIntegerResult() {
        return new IntegerResult();
    }

    /**
     * Create an instance of {@link XMLInfo }
     * 
     */
    public XMLInfo createXMLInfo() {
        return new XMLInfo();
    }

    /**
     * Create an instance of {@link GlInterface }
     * 
     */
    public GlInterface createGlInterface() {
        return new GlInterface();
    }

    /**
     * Create an instance of {@link StCroixCounty }
     * 
     */
    public StCroixCounty createStCroixCounty() {
        return new StCroixCounty();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findControl")
    public JAXBElement<FindControl> createFindControl(FindControl value) {
        return new JAXBElement<FindControl>(_FindControl_QNAME, FindControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "processControl")
    public JAXBElement<ProcessControl> createProcessControl(ProcessControl value) {
        return new JAXBElement<ProcessControl>(_ProcessControl_QNAME, ProcessControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findCriteria")
    public JAXBElement<FindCriteria> createFindCriteria(FindCriteria value) {
        return new JAXBElement<FindCriteria>(_FindCriteria_QNAME, FindCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlInterfaceTransHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "glInterfaceTransHeader")
    public JAXBElement<GlInterfaceTransHeader> createGlInterfaceTransHeader(GlInterfaceTransHeader value) {
        return new JAXBElement<GlInterfaceTransHeader>(_GlInterfaceTransHeader_QNAME, GlInterfaceTransHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "glInterface")
    public JAXBElement<GlInterface> createGlInterface(GlInterface value) {
        return new JAXBElement<GlInterface>(_GlInterface_QNAME, GlInterface.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", name = "Fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StCroixCounty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "stCroixCounty")
    public JAXBElement<StCroixCounty> createStCroixCounty(StCroixCounty value) {
        return new JAXBElement<StCroixCounty>(_StCroixCounty_QNAME, StCroixCounty.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "fund", scope = StCroixCounty.class)
    public JAXBElement<String> createStCroixCountyFund(String value) {
        return new JAXBElement<String>(_StCroixCountyFund_QNAME, String.class, StCroixCounty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "future1", scope = StCroixCounty.class)
    public JAXBElement<String> createStCroixCountyFuture1(String value) {
        return new JAXBElement<String>(_StCroixCountyFuture1_QNAME, String.class, StCroixCounty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "account", scope = StCroixCounty.class)
    public JAXBElement<String> createStCroixCountyAccount(String value) {
        return new JAXBElement<String>(_Account_QNAME, String.class, StCroixCounty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "department", scope = StCroixCounty.class)
    public JAXBElement<String> createStCroixCountyDepartment(String value) {
        return new JAXBElement<String>(_StCroixCountyDepartment_QNAME, String.class, StCroixCounty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "program", scope = StCroixCounty.class)
    public JAXBElement<String> createStCroixCountyProgram(String value) {
        return new JAXBElement<String>(_StCroixCountyProgram_QNAME, String.class, StCroixCounty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "project", scope = StCroixCounty.class)
    public JAXBElement<String> createStCroixCountyProject(String value) {
        return new JAXBElement<String>(_StCroixCountyProject_QNAME, String.class, StCroixCounty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "ErrorToSuspenseFlag", scope = GlInterfaceTransHeader.class, defaultValue = "false")
    public JAXBElement<Boolean> createGlInterfaceTransHeaderErrorToSuspenseFlag(Boolean value) {
        return new JAXBElement<Boolean>(_GlInterfaceTransHeaderErrorToSuspenseFlag_QNAME, Boolean.class, GlInterfaceTransHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "AccountingDate", scope = GlInterfaceTransHeader.class)
    public JAXBElement<XMLGregorianCalendar> createGlInterfaceTransHeaderAccountingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GlInterfaceTransHeaderAccountingDate_QNAME, XMLGregorianCalendar.class, GlInterfaceTransHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "SummaryFlag", scope = GlInterfaceTransHeader.class, defaultValue = "false")
    public JAXBElement<Boolean> createGlInterfaceTransHeaderSummaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_GlInterfaceTransHeaderSummaryFlag_QNAME, Boolean.class, GlInterfaceTransHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "LedgerId", scope = GlInterfaceTransHeader.class)
    public JAXBElement<Long> createGlInterfaceTransHeaderLedgerId(Long value) {
        return new JAXBElement<Long>(_GlInterfaceTransHeaderLedgerId_QNAME, Long.class, GlInterfaceTransHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "AccountingPeriodName", scope = GlInterfaceTransHeader.class)
    public JAXBElement<String> createGlInterfaceTransHeaderAccountingPeriodName(String value) {
        return new JAXBElement<String>(_GlInterfaceTransHeaderAccountingPeriodName_QNAME, String.class, GlInterfaceTransHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "UserCategoryName", scope = GlInterfaceTransHeader.class)
    public JAXBElement<String> createGlInterfaceTransHeaderUserCategoryName(String value) {
        return new JAXBElement<String>(_GlInterfaceTransHeaderUserCategoryName_QNAME, String.class, GlInterfaceTransHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "UserSourceName", scope = GlInterfaceTransHeader.class)
    public JAXBElement<String> createGlInterfaceTransHeaderUserSourceName(String value) {
        return new JAXBElement<String>(_GlInterfaceTransHeaderUserSourceName_QNAME, String.class, GlInterfaceTransHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "BatchDescription", scope = GlInterfaceTransHeader.class)
    public JAXBElement<String> createGlInterfaceTransHeaderBatchDescription(String value) {
        return new JAXBElement<String>(_GlInterfaceTransHeaderBatchDescription_QNAME, String.class, GlInterfaceTransHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "BatchName", scope = GlInterfaceTransHeader.class)
    public JAXBElement<String> createGlInterfaceTransHeaderBatchName(String value) {
        return new JAXBElement<String>(_GlInterfaceTransHeaderBatchName_QNAME, String.class, GlInterfaceTransHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "ImportDescriptiveFlexField", scope = GlInterfaceTransHeader.class, defaultValue = "N")
    public JAXBElement<String> createGlInterfaceTransHeaderImportDescriptiveFlexField(String value) {
        return new JAXBElement<String>(_GlInterfaceTransHeaderImportDescriptiveFlexField_QNAME, String.class, GlInterfaceTransHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "ManagementSegmentValue", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceManagementSegmentValue(String value) {
        return new JAXBElement<String>(_GlInterfaceManagementSegmentValue_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "ReferenceDate", scope = GlInterface.class)
    public JAXBElement<XMLGregorianCalendar> createGlInterfaceReferenceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GlInterfaceReferenceDate_QNAME, XMLGregorianCalendar.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "AverageJournalFlag", scope = GlInterface.class)
    public JAXBElement<Boolean> createGlInterfaceAverageJournalFlag(Boolean value) {
        return new JAXBElement<Boolean>(_GlInterfaceAverageJournalFlag_QNAME, Boolean.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "ChartOfAccountsId", scope = GlInterface.class)
    public JAXBElement<Long> createGlInterfaceChartOfAccountsId(Long value) {
        return new JAXBElement<Long>(_GlInterfaceChartOfAccountsId_QNAME, Long.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "SetOfBooksId", scope = GlInterface.class)
    public JAXBElement<Long> createGlInterfaceSetOfBooksId(Long value) {
        return new JAXBElement<Long>(_GlInterfaceSetOfBooksId_QNAME, Long.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute10", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute10(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute10_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute11", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute11(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute11_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute12", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute12(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute12_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute13", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute13(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute13_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute14", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute14(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute14_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "CurrencyConversionRate", scope = GlInterface.class)
    public JAXBElement<BigDecimal> createGlInterfaceCurrencyConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GlInterfaceCurrencyConversionRate_QNAME, BigDecimal.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "BalancingSegmentValue", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceBalancingSegmentValue(String value) {
        return new JAXBElement<String>(_GlInterfaceBalancingSegmentValue_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "AttributeCategory2", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttributeCategory2(String value) {
        return new JAXBElement<String>(_GlInterfaceAttributeCategory2_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "InvoiceDate", scope = GlInterface.class)
    public JAXBElement<XMLGregorianCalendar> createGlInterfaceInvoiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GlInterfaceInvoiceDate_QNAME, XMLGregorianCalendar.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "AttributeCategory3", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttributeCategory3(String value) {
        return new JAXBElement<String>(_GlInterfaceAttributeCategory3_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "JeCategoryName", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceJeCategoryName(String value) {
        return new JAXBElement<String>(_GlInterfaceJeCategoryName_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "TransactionDate", scope = GlInterface.class)
    public JAXBElement<XMLGregorianCalendar> createGlInterfaceTransactionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GlInterfaceTransactionDate_QNAME, XMLGregorianCalendar.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute15", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute15(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute15_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute16", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute16(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute16_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute17", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute17(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute17_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute18", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute18(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute18_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute19", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute19(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute19_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "JgzzReconReference", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceJgzzReconReference(String value) {
        return new JAXBElement<String>(_GlInterfaceJgzzReconReference_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment3", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment3(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment3_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment4", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment4(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment4_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "AttributeCategory", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttributeCategory(String value) {
        return new JAXBElement<String>(_GlInterfaceAttributeCategory_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment5", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment5(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment5_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute20", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute20(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute20_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment6", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment6(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment6_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment7", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment7(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment7_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment8", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment8(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment8_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment9", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment9(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment9_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "StatisticalValue", scope = GlInterface.class)
    public JAXBElement<BigDecimal> createGlInterfaceStatisticalValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GlInterfaceStatisticalValue_QNAME, BigDecimal.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference2", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference2(String value) {
        return new JAXBElement<String>(_GlInterfaceReference2_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference1", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference1(String value) {
        return new JAXBElement<String>(_GlInterfaceReference1_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "GlSlLinkTable", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceGlSlLinkTable(String value) {
        return new JAXBElement<String>(_GlInterfaceGlSlLinkTable_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference9", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference9(String value) {
        return new JAXBElement<String>(_GlInterfaceReference9_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference8", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference8(String value) {
        return new JAXBElement<String>(_GlInterfaceReference8_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference7", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference7(String value) {
        return new JAXBElement<String>(_GlInterfaceReference7_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference6", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference6(String value) {
        return new JAXBElement<String>(_GlInterfaceReference6_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference5", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference5(String value) {
        return new JAXBElement<String>(_GlInterfaceReference5_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference4", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference4(String value) {
        return new JAXBElement<String>(_GlInterfaceReference4_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference3", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference3(String value) {
        return new JAXBElement<String>(_GlInterfaceReference3_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "JeSourceName", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceJeSourceName(String value) {
        return new JAXBElement<String>(_GlInterfaceJeSourceName_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment10", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment10(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment10_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment11", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment11(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment11_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "EnteredCrAmount", scope = GlInterface.class)
    public JAXBElement<AmountType> createGlInterfaceEnteredCrAmount(AmountType value) {
        return new JAXBElement<AmountType>(_GlInterfaceEnteredCrAmount_QNAME, AmountType.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "EnteredDrAmount", scope = GlInterface.class)
    public JAXBElement<AmountType> createGlInterfaceEnteredDrAmount(AmountType value) {
        return new JAXBElement<AmountType>(_GlInterfaceEnteredDrAmount_QNAME, AmountType.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment14", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment14(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment14_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment15", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment15(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment15_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment12", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment12(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment12_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment13", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment13(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment13_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment18", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment18(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment18_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment19", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment19(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment19_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment16", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment16(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment16_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment17", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment17(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment17_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "AccountedDr", scope = GlInterface.class)
    public JAXBElement<BigDecimal> createGlInterfaceAccountedDr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GlInterfaceAccountedDr_QNAME, BigDecimal.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment21", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment21(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment21_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "UserCurrencyConversionType", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceUserCurrencyConversionType(String value) {
        return new JAXBElement<String>(_GlInterfaceUserCurrencyConversionType_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference11", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference11(String value) {
        return new JAXBElement<String>(_GlInterfaceReference11_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment22", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment22(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment22_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference10", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference10(String value) {
        return new JAXBElement<String>(_GlInterfaceReference10_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment20", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment20(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment20_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment25", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment25(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment25_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference15", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference15(String value) {
        return new JAXBElement<String>(_GlInterfaceReference15_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment26", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment26(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment26_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference14", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference14(String value) {
        return new JAXBElement<String>(_GlInterfaceReference14_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment23", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment23(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment23_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference13", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference13(String value) {
        return new JAXBElement<String>(_GlInterfaceReference13_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "OriginatingBalSegValue", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceOriginatingBalSegValue(String value) {
        return new JAXBElement<String>(_GlInterfaceOriginatingBalSegValue_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment24", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment24(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment24_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference12", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference12(String value) {
        return new JAXBElement<String>(_GlInterfaceReference12_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment29", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment29(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment29_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment27", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment27(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment27_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment28", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment28(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment28_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "USSGLTransactionCode", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceUSSGLTransactionCode(String value) {
        return new JAXBElement<String>(_GlInterfaceUSSGLTransactionCode_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "AccountedCr", scope = GlInterface.class)
    public JAXBElement<BigDecimal> createGlInterfaceAccountedCr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GlInterfaceAccountedCr_QNAME, BigDecimal.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "GlInterfaceId", scope = GlInterface.class)
    public JAXBElement<Long> createGlInterfaceGlInterfaceId(Long value) {
        return new JAXBElement<Long>(_GlInterfaceGlInterfaceId_QNAME, Long.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference19", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference19(String value) {
        return new JAXBElement<String>(_GlInterfaceReference19_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference18", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference18(String value) {
        return new JAXBElement<String>(_GlInterfaceReference18_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference17", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference17(String value) {
        return new JAXBElement<String>(_GlInterfaceReference17_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference16", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference16(String value) {
        return new JAXBElement<String>(_GlInterfaceReference16_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "InvoiceIdentifier", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceInvoiceIdentifier(String value) {
        return new JAXBElement<String>(_GlInterfaceInvoiceIdentifier_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference22", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference22(String value) {
        return new JAXBElement<String>(_GlInterfaceReference22_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference21", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference21(String value) {
        return new JAXBElement<String>(_GlInterfaceReference21_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment30", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment30(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment30_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference20", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference20(String value) {
        return new JAXBElement<String>(_GlInterfaceReference20_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference26", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference26(String value) {
        return new JAXBElement<String>(_GlInterfaceReference26_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference25", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference25(String value) {
        return new JAXBElement<String>(_GlInterfaceReference25_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference24", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference24(String value) {
        return new JAXBElement<String>(_GlInterfaceReference24_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference23", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference23(String value) {
        return new JAXBElement<String>(_GlInterfaceReference23_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "TaxCode", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceTaxCode(String value) {
        return new JAXBElement<String>(_GlInterfaceTaxCode_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute2", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute2(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute2_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute3", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute3(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute3_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "CurrencyConversionDate", scope = GlInterface.class)
    public JAXBElement<XMLGregorianCalendar> createGlInterfaceCurrencyConversionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GlInterfaceCurrencyConversionDate_QNAME, XMLGregorianCalendar.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "InvoiceAmount", scope = GlInterface.class)
    public JAXBElement<AmountType> createGlInterfaceInvoiceAmount(AmountType value) {
        return new JAXBElement<AmountType>(_GlInterfaceInvoiceAmount_QNAME, AmountType.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute1", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute1(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute1_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference29", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference29(String value) {
        return new JAXBElement<String>(_GlInterfaceReference29_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference28", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference28(String value) {
        return new JAXBElement<String>(_GlInterfaceReference28_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute8", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute8(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute8_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference27", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference27(String value) {
        return new JAXBElement<String>(_GlInterfaceReference27_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute9", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute9(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute9_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute6", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute6(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute6_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute7", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute7(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute7_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "CurrencyConversionType", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceCurrencyConversionType(String value) {
        return new JAXBElement<String>(_GlInterfaceCurrencyConversionType_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute4", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute4(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute4_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Attribute5", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceAttribute5(String value) {
        return new JAXBElement<String>(_GlInterfaceAttribute5_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "PeriodName", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfacePeriodName(String value) {
        return new JAXBElement<String>(_GlInterfacePeriodName_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Reference30", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceReference30(String value) {
        return new JAXBElement<String>(_GlInterfaceReference30_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment1", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment1(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment1_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "Segment2", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceSegment2(String value) {
        return new JAXBElement<String>(_GlInterfaceSegment2_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "GlSlLinkId", scope = GlInterface.class)
    public JAXBElement<BigDecimal> createGlInterfaceGlSlLinkId(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GlInterfaceGlSlLinkId_QNAME, BigDecimal.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "CodeCombinationId", scope = GlInterface.class)
    public JAXBElement<Long> createGlInterfaceCodeCombinationId(Long value) {
        return new JAXBElement<Long>(_GlInterfaceCodeCombinationId_QNAME, Long.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/journals/desktopEntry/journalImportService/", name = "DescrFlexErrorMessage", scope = GlInterface.class)
    public JAXBElement<String> createGlInterfaceDescrFlexErrorMessage(String value) {
        return new JAXBElement<String>(_GlInterfaceDescrFlexErrorMessage_QNAME, String.class, GlInterface.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "Reference3", scope = Account.class)
    public JAXBElement<String> createAccountReference3(String value) {
        return new JAXBElement<String>(_AccountReference3_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "JgzzReconFlag", scope = Account.class)
    public JAXBElement<String> createAccountJgzzReconFlag(String value) {
        return new JAXBElement<String>(_AccountJgzzReconFlag_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "EndDateActive", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountEndDateActive_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "FinancialCategory", scope = Account.class)
    public JAXBElement<String> createAccountFinancialCategory(String value) {
        return new JAXBElement<String>(_AccountFinancialCategory_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "StartDateActive", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountStartDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountStartDateActive_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "FND_ACFF_Delimiter", scope = Account.class)
    public JAXBElement<String> createAccountFNDACFFDelimiter(String value) {
        return new JAXBElement<String>(_AccountFNDACFFDelimiter_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "FND_ACFF_ConcatenatedStorage", scope = Account.class)
    public JAXBElement<String> createAccountFNDACFFConcatenatedStorage(String value) {
        return new JAXBElement<String>(_AccountFNDACFFConcatenatedStorage_QNAME, String.class, Account.class, value);
    }

}
