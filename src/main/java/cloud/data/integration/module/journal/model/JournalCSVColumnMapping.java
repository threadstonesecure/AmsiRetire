package cloud.data.integration.module.journal.model;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

public class JournalCSVColumnMapping {

	
	private String statusCode;

	private String ledgerId;

	private String effectiveDateOfTransaction;

	private String journalSource;

	private String journalCategory;

	private String currencyCode;

	private String journalEntryCreationDate;

	private String actualFlag;

	private String segment1;

	private String segment2;

	private String segment3;

	private String segment4;

	private String segment5;

	private String segment6;

	private String segment7;

	private String segment8;

	private String segment9;

	private String segment10;

	private String segment11;

	private String segment12;

	private String segment13;

	private String segment14;

	private String segment15;

	private String segment16;

	private String segment17;

	private String segment18;

	private String segment19;

	private String segment20;

	private String segment21;

	private String segment22;

	private String segment23;

	private String segment24;

	private String segment25;

	private String segment26;

	private String segment27;

	private String segment28;

	private String segment29;

	private String segment30;

	private String enteredDebitAmount;

	private String enteredCreditAmount;

	private String convertedDebitAmount;

	private String convertedCreditAmount;

	private String reference1BatchName;

	private String reference2BatchDescription;
	
/*
	private String reference3;
*/
	
	private String reference4JournalEntryName;

	private String reference5JournalEntryDescription;

	private String reference6JournalEntryReference;

	private String reference7JournalEntryReversalFlag;

	private String reference8JournalEntryReversalPeriod;

	private String reference9JournalReversalMethod;

	private String reference10JournalEntryLineDescription;
	
/*
	private String referenceColumn1;

	private String referenceColumn2;

	private String referenceColumn3;

	private String referenceColumn4;

	private String referenceColumn5;

	private String referenceColumn6;

	private String referenceColumn7;

	private String referenceColumn8;

	private String referenceColumn9;

	private String referenceColumn10;
*/
	
	private String statisticalAmount;

	private String currencyConversionType;

	private String currencyConversionDate;

	private String currencyConversionRate;

	private String interfaceGroupIdentifier;

	private String contextFieldForJournalEntryLineDFF;

	private String attribute1ValueForJournalEntryLineDFF;

	private String attribute2ValueForJournalEntryLineDFF;

	private String attribute3ValueForJournalEntryLineDFF;

	private String attribute4ValueForJournalEntryLineDFF;

	private String attribute5ValueForJournalEntryLineDFF;

	private String attribute6ValueForJournalEntryLineDFF;

	private String attribute7ValueForJournalEntryLineDFF;

	private String attribute8ValueForJournalEntryLineDFF;

	private String attribute9ValueForJournalEntryLineDFF;

	private String attribute10ValueForJournalEntryLineDFF;

	private String attribute11ValueForCapturedInformationDFF;

	private String attribute12ValueForCapturedInformationDFF;

	private String attribute13ValueForCapturedInformationDFF;

	private String attribute14ValueForCapturedInformationDFF;

	private String attribute15ValueForCapturedInformationDFF;

	private String attribute16ValueForCapturedInformationDFF;

	private String attribute17ValueForCapturedInformationDFF;

	private String attribute18ValueForCapturedInformationDFF;

	private String attribute19ValueForCapturedInformationDFF;

	private String attribute20ValueForCapturedInformationDFF;

	private String contextFieldForCapturedInformationDFF;
	
/*
	private String averageJournalFlag;
*/
	private String clearingCompany;

	private String ledgerName;

	private String encumbranceTypeID;

	private String additionalInformation;
	
	
	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the ledgerId
	 */
	public String getLedgerId() {
		return ledgerId;
	}

	/**
	 * @param ledgerId the ledgerId to set
	 */
	public void setLedgerId(String ledgerId) {
		this.ledgerId = ledgerId;
	}

	/**
	 * @return the effectiveDateOfTransaction
	 */
	public String getEffectiveDateOfTransaction() {
		return effectiveDateOfTransaction;
	}

	/**
	 * @param effectiveDateOfTransaction the effectiveDateOfTransaction to set
	 */
	public void setEffectiveDateOfTransaction(String effectiveDateOfTransaction) {
		this.effectiveDateOfTransaction = effectiveDateOfTransaction;
	}

	/**
	 * @return the journalSource
	 */
	public String getJournalSource() {
		return journalSource;
	}

	/**
	 * @param journalSource the journalSource to set
	 */
	public void setJournalSource(String journalSource) {
		this.journalSource = journalSource;
	}

	/**
	 * @return the journalCategory
	 */
	public String getJournalCategory() {
		return journalCategory;
	}

	/**
	 * @param journalCategory the journalCategory to set
	 */
	public void setJournalCategory(String journalCategory) {
		this.journalCategory = journalCategory;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the journalEntryCreationDate
	 */
	public String getJournalEntryCreationDate() {
		return journalEntryCreationDate;
	}

	/**
	 * @param journalEntryCreationDate the journalEntryCreationDate to set
	 */
	public void setJournalEntryCreationDate(String journalEntryCreationDate) {
		this.journalEntryCreationDate = journalEntryCreationDate;
	}

	/**
	 * @return the actualFlag
	 */
	public String getActualFlag() {
		return actualFlag;
	}

	/**
	 * @param actualFlag the actualFlag to set
	 */
	public void setActualFlag(String actualFlag) {
		this.actualFlag = actualFlag;
	}

	/**
	 * @return the segment1
	 */
	public String getSegment1() {
		return segment1;
	}

	/**
	 * @param segment1 the segment1 to set
	 */
	public void setSegment1(String segment1) {
		this.segment1 = segment1;
	}

	/**
	 * @return the segment2
	 */
	public String getSegment2() {
		return segment2;
	}

	/**
	 * @param segment2 the segment2 to set
	 */
	public void setSegment2(String segment2) {
		this.segment2 = segment2;
	}

	/**
	 * @return the segment3
	 */
	public String getSegment3() {
		return segment3;
	}

	/**
	 * @param segment3 the segment3 to set
	 */
	public void setSegment3(String segment3) {
		this.segment3 = segment3;
	}

	/**
	 * @return the segment4
	 */
	public String getSegment4() {
		return segment4;
	}

	/**
	 * @param segment4 the segment4 to set
	 */
	public void setSegment4(String segment4) {
		this.segment4 = segment4;
	}

	/**
	 * @return the segment5
	 */
	public String getSegment5() {
		return segment5;
	}

	/**
	 * @param segment5 the segment5 to set
	 */
	public void setSegment5(String segment5) {
		this.segment5 = segment5;
	}

	/**
	 * @return the segment6
	 */
	public String getSegment6() {
		return segment6;
	}

	/**
	 * @param segment6 the segment6 to set
	 */
	public void setSegment6(String segment6) {
		this.segment6 = segment6;
	}

	/**
	 * @return the segment7
	 */
	public String getSegment7() {
		return segment7;
	}

	/**
	 * @param segment7 the segment7 to set
	 */
	public void setSegment7(String segment7) {
		this.segment7 = segment7;
	}

	/**
	 * @return the segment8
	 */
	public String getSegment8() {
		return segment8;
	}

	/**
	 * @param segment8 the segment8 to set
	 */
	public void setSegment8(String segment8) {
		this.segment8 = segment8;
	}

	/**
	 * @return the segment9
	 */
	public String getSegment9() {
		return segment9;
	}

	/**
	 * @param segment9 the segment9 to set
	 */
	public void setSegment9(String segment9) {
		this.segment9 = segment9;
	}

	/**
	 * @return the segment10
	 */
	public String getSegment10() {
		return segment10;
	}

	/**
	 * @param segment10 the segment10 to set
	 */
	public void setSegment10(String segment10) {
		this.segment10 = segment10;
	}

	/**
	 * @return the segment11
	 */
	public String getSegment11() {
		return segment11;
	}

	/**
	 * @param segment11 the segment11 to set
	 */
	public void setSegment11(String segment11) {
		this.segment11 = segment11;
	}

	/**
	 * @return the segment12
	 */
	public String getSegment12() {
		return segment12;
	}

	/**
	 * @param segment12 the segment12 to set
	 */
	public void setSegment12(String segment12) {
		this.segment12 = segment12;
	}

	/**
	 * @return the segment13
	 */
	public String getSegment13() {
		return segment13;
	}

	/**
	 * @param segment13 the segment13 to set
	 */
	public void setSegment13(String segment13) {
		this.segment13 = segment13;
	}

	/**
	 * @return the segment14
	 */
	public String getSegment14() {
		return segment14;
	}

	/**
	 * @param segment14 the segment14 to set
	 */
	public void setSegment14(String segment14) {
		this.segment14 = segment14;
	}

	/**
	 * @return the segment15
	 */
	public String getSegment15() {
		return segment15;
	}

	/**
	 * @param segment15 the segment15 to set
	 */
	public void setSegment15(String segment15) {
		this.segment15 = segment15;
	}

	/**
	 * @return the segment16
	 */
	public String getSegment16() {
		return segment16;
	}

	/**
	 * @param segment16 the segment16 to set
	 */
	public void setSegment16(String segment16) {
		this.segment16 = segment16;
	}

	/**
	 * @return the segment17
	 */
	public String getSegment17() {
		return segment17;
	}

	/**
	 * @param segment17 the segment17 to set
	 */
	public void setSegment17(String segment17) {
		this.segment17 = segment17;
	}

	/**
	 * @return the segment18
	 */
	public String getSegment18() {
		return segment18;
	}

	/**
	 * @param segment18 the segment18 to set
	 */
	public void setSegment18(String segment18) {
		this.segment18 = segment18;
	}

	/**
	 * @return the segment19
	 */
	public String getSegment19() {
		return segment19;
	}

	/**
	 * @param segment19 the segment19 to set
	 */
	public void setSegment19(String segment19) {
		this.segment19 = segment19;
	}

	/**
	 * @return the segment20
	 */
	public String getSegment20() {
		return segment20;
	}

	/**
	 * @param segment20 the segment20 to set
	 */
	public void setSegment20(String segment20) {
		this.segment20 = segment20;
	}

	/**
	 * @return the segment21
	 */
	public String getSegment21() {
		return segment21;
	}

	/**
	 * @param segment21 the segment21 to set
	 */
	public void setSegment21(String segment21) {
		this.segment21 = segment21;
	}

	/**
	 * @return the segment22
	 */
	public String getSegment22() {
		return segment22;
	}

	/**
	 * @param segment22 the segment22 to set
	 */
	public void setSegment22(String segment22) {
		this.segment22 = segment22;
	}

	/**
	 * @return the segment23
	 */
	public String getSegment23() {
		return segment23;
	}

	/**
	 * @param segment23 the segment23 to set
	 */
	public void setSegment23(String segment23) {
		this.segment23 = segment23;
	}

	/**
	 * @return the segment24
	 */
	public String getSegment24() {
		return segment24;
	}

	/**
	 * @param segment24 the segment24 to set
	 */
	public void setSegment24(String segment24) {
		this.segment24 = segment24;
	}

	/**
	 * @return the segment25
	 */
	public String getSegment25() {
		return segment25;
	}

	/**
	 * @param segment25 the segment25 to set
	 */
	public void setSegment25(String segment25) {
		this.segment25 = segment25;
	}

	/**
	 * @return the segment26
	 */
	public String getSegment26() {
		return segment26;
	}

	/**
	 * @param segment26 the segment26 to set
	 */
	public void setSegment26(String segment26) {
		this.segment26 = segment26;
	}

	/**
	 * @return the segment27
	 */
	public String getSegment27() {
		return segment27;
	}

	/**
	 * @param segment27 the segment27 to set
	 */
	public void setSegment27(String segment27) {
		this.segment27 = segment27;
	}

	/**
	 * @return the segment28
	 */
	public String getSegment28() {
		return segment28;
	}

	/**
	 * @param segment28 the segment28 to set
	 */
	public void setSegment28(String segment28) {
		this.segment28 = segment28;
	}

	/**
	 * @return the segment29
	 */
	public String getSegment29() {
		return segment29;
	}

	/**
	 * @param segment29 the segment29 to set
	 */
	public void setSegment29(String segment29) {
		this.segment29 = segment29;
	}

	/**
	 * @return the segment30
	 */
	public String getSegment30() {
		return segment30;
	}

	/**
	 * @param segment30 the segment30 to set
	 */
	public void setSegment30(String segment30) {
		this.segment30 = segment30;
	}

	/**
	 * @return the enteredDebitAmount
	 */
	public String getEnteredDebitAmount() {
		return enteredDebitAmount;
	}

	/**
	 * @param enteredDebitAmount the enteredDebitAmount to set
	 */
	public void setEnteredDebitAmount(String enteredDebitAmount) {
		this.enteredDebitAmount = enteredDebitAmount;
	}

	/**
	 * @return the enteredCreditAmount
	 */
	public String getEnteredCreditAmount() {
		return enteredCreditAmount;
	}

	/**
	 * @param enteredCreditAmount the enteredCreditAmount to set
	 */
	public void setEnteredCreditAmount(String enteredCreditAmount) {
		this.enteredCreditAmount = enteredCreditAmount;
	}

	/**
	 * @return the convertedDebitAmount
	 */
	public String getConvertedDebitAmount() {
		return convertedDebitAmount;
	}

	/**
	 * @param convertedDebitAmount the convertedDebitAmount to set
	 */
	public void setConvertedDebitAmount(String convertedDebitAmount) {
		this.convertedDebitAmount = convertedDebitAmount;
	}

	/**
	 * @return the convertedCreditAmount
	 */
	public String getConvertedCreditAmount() {
		return convertedCreditAmount;
	}

	/**
	 * @param convertedCreditAmount the convertedCreditAmount to set
	 */
	public void setConvertedCreditAmount(String convertedCreditAmount) {
		this.convertedCreditAmount = convertedCreditAmount;
	}

	/**
	 * @return the reference1BatchName
	 */
	public String getReference1BatchName() {
		return reference1BatchName;
	}

	/**
	 * @param reference1BatchName the reference1BatchName to set
	 */
	public void setReference1BatchName(String reference1BatchName) {
		this.reference1BatchName = reference1BatchName;
	}

	/**
	 * @return the reference2BatchDescription
	 */
	public String getReference2BatchDescription() {
		return reference2BatchDescription;
	}

	/**
	 * @param reference2BatchDescription the reference2BatchDescription to set
	 */
	public void setReference2BatchDescription(String reference2BatchDescription) {
		this.reference2BatchDescription = reference2BatchDescription;
	}

	/*
	public String getReference3() {
		return reference3;
	}
 
	public void setReference3(String reference3) {
		this.reference3 = reference3;
	}
*/

	
	

	/**
	 * @return the reference4JournalEntryName
	 */
	public String getReference4JournalEntryName() {
		return reference4JournalEntryName;
	}

	/**
	 * @param reference4JournalEntryName the reference4JournalEntryName to set
	 */
	public void setReference4JournalEntryName(String reference4JournalEntryName) {
		this.reference4JournalEntryName = reference4JournalEntryName;
	}

	/**
	 * @return the reference5JournalEntryDescription
	 */
	public String getReference5JournalEntryDescription() {
		return reference5JournalEntryDescription;
	}

	/**
	 * @param reference5JournalEntryDescription the reference5JournalEntryDescription to set
	 */
	public void setReference5JournalEntryDescription(String reference5JournalEntryDescription) {
		this.reference5JournalEntryDescription = reference5JournalEntryDescription;
	}

	/**
	 * @return the reference6JournalEntryReference
	 */
	public String getReference6JournalEntryReference() {
		return reference6JournalEntryReference;
	}

	/**
	 * @param reference6JournalEntryReference the reference6JournalEntryReference to set
	 */
	public void setReference6JournalEntryReference(String reference6JournalEntryReference) {
		this.reference6JournalEntryReference = reference6JournalEntryReference;
	}

	/**
	 * @return the reference7JournalEntryReversalFlag
	 */
	public String getReference7JournalEntryReversalFlag() {
		return reference7JournalEntryReversalFlag;
	}

	/**
	 * @param reference7JournalEntryReversalFlag the reference7JournalEntryReversalFlag to set
	 */
	public void setReference7JournalEntryReversalFlag(String reference7JournalEntryReversalFlag) {
		this.reference7JournalEntryReversalFlag = reference7JournalEntryReversalFlag;
	}

	/**
	 * @return the reference8JournalEntryReversalPeriod
	 */
	public String getReference8JournalEntryReversalPeriod() {
		return reference8JournalEntryReversalPeriod;
	}

	/**
	 * @param reference8JournalEntryReversalPeriod the reference8JournalEntryReversalPeriod to set
	 */
	public void setReference8JournalEntryReversalPeriod(String reference8JournalEntryReversalPeriod) {
		this.reference8JournalEntryReversalPeriod = reference8JournalEntryReversalPeriod;
	}

	/**
	 * @return the reference9JournalReversalMethod
	 */
	public String getReference9JournalReversalMethod() {
		return reference9JournalReversalMethod;
	}

	/**
	 * @param reference9JournalReversalMethod the reference9JournalReversalMethod to set
	 */
	public void setReference9JournalReversalMethod(String reference9JournalReversalMethod) {
		this.reference9JournalReversalMethod = reference9JournalReversalMethod;
	}

	/**
	 * @return the reference10JournalEntryLineDescription
	 */
	public String getReference10JournalEntryLineDescription() {
		return reference10JournalEntryLineDescription;
	}

	/**
	 * @param reference10JournalEntryLineDescription the reference10JournalEntryLineDescription to set
	 */
	public void setReference10JournalEntryLineDescription(String reference10JournalEntryLineDescription) {
		this.reference10JournalEntryLineDescription = reference10JournalEntryLineDescription;
	}

	/*
	public String getReferenceColumn1() {
		return referenceColumn1;
	}

	public void setReferenceColumn1(String referenceColumn1) {
		this.referenceColumn1 = referenceColumn1;
	}

	public String getReferenceColumn2() {
		return referenceColumn2;
	}

	public void setReferenceColumn2(String referenceColumn2) {
		this.referenceColumn2 = referenceColumn2;
	}

	public String getReferenceColumn3() {
		return referenceColumn3;
	}

	public void setReferenceColumn3(String referenceColumn3) {
		this.referenceColumn3 = referenceColumn3;
	}

	public String getReferenceColumn4() {
		return referenceColumn4;
	}

	public void setReferenceColumn4(String referenceColumn4) {
		this.referenceColumn4 = referenceColumn4;
	}

	public String getReferenceColumn5() {
		return referenceColumn5;
	}

	public void setReferenceColumn5(String referenceColumn5) {
		this.referenceColumn5 = referenceColumn5;
	}

	public String getReferenceColumn6() {
		return referenceColumn6;
	}

	public void setReferenceColumn6(String referenceColumn6) {
		this.referenceColumn6 = referenceColumn6;
	}

	public String getReferenceColumn7() {
		return referenceColumn7;
	}

	public void setReferenceColumn7(String referenceColumn7) {
		this.referenceColumn7 = referenceColumn7;
	}

	public String getReferenceColumn8() {
		return referenceColumn8;
	}

	public void setReferenceColumn8(String referenceColumn8) {
		this.referenceColumn8 = referenceColumn8;
	}

	public String getReferenceColumn9() {
		return referenceColumn9;
	}

	public void setReferenceColumn9(String referenceColumn9) {
		this.referenceColumn9 = referenceColumn9;
	}

	public String getReferenceColumn10() {
		return referenceColumn10;
	}

	public void setReferenceColumn10(String referenceColumn10) {
		this.referenceColumn10 = referenceColumn10;
	}
	
	*/

	/**
	 * @return the statisticalAmount
	 */
	public String getStatisticalAmount() {
		return statisticalAmount;
	}

	/**
	 * @param statisticalAmount the statisticalAmount to set
	 */
	public void setStatisticalAmount(String statisticalAmount) {
		this.statisticalAmount = statisticalAmount;
	}

	/**
	 * @return the currencyConversionType
	 */
	public String getCurrencyConversionType() {
		return currencyConversionType;
	}

	/**
	 * @param currencyConversionType the currencyConversionType to set
	 */
	public void setCurrencyConversionType(String currencyConversionType) {
		this.currencyConversionType = currencyConversionType;
	}

	/**
	 * @return the currencyConversionDate
	 */
	public String getCurrencyConversionDate() {
		return currencyConversionDate;
	}

	/**
	 * @param currencyConversionDate the currencyConversionDate to set
	 */
	public void setCurrencyConversionDate(String currencyConversionDate) {
		this.currencyConversionDate = currencyConversionDate;
	}

	/**
	 * @return the currencyConversionRate
	 */
	public String getCurrencyConversionRate() {
		return currencyConversionRate;
	}

	/**
	 * @param currencyConversionRate the currencyConversionRate to set
	 */
	public void setCurrencyConversionRate(String currencyConversionRate) {
		this.currencyConversionRate = currencyConversionRate;
	}

	/**
	 * @return the interfaceGroupIdentifier
	 */
	public String getInterfaceGroupIdentifier() {
		return interfaceGroupIdentifier;
	}

	/**
	 * @param interfaceGroupIdentifier the interfaceGroupIdentifier to set
	 */
	public void setInterfaceGroupIdentifier(String interfaceGroupIdentifier) {
		this.interfaceGroupIdentifier = interfaceGroupIdentifier;
	}

	/**
	 * @return the contextFieldForJournalEntryLineDFF
	 */
	public String getContextFieldForJournalEntryLineDFF() {
		return contextFieldForJournalEntryLineDFF;
	}

	/**
	 * @param contextFieldForJournalEntryLineDFF the contextFieldForJournalEntryLineDFF to set
	 */
	public void setContextFieldForJournalEntryLineDFF(String contextFieldForJournalEntryLineDFF) {
		this.contextFieldForJournalEntryLineDFF = contextFieldForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute1ValueForJournalEntryLineDFF
	 */
	public String getAttribute1ValueForJournalEntryLineDFF() {
		return attribute1ValueForJournalEntryLineDFF;
	}

	/**
	 * @param attribute1ValueForJournalEntryLineDFF the attribute1ValueForJournalEntryLineDFF to set
	 */
	public void setAttribute1ValueForJournalEntryLineDFF(String attribute1ValueForJournalEntryLineDFF) {
		this.attribute1ValueForJournalEntryLineDFF = attribute1ValueForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute2ValueForJournalEntryLineDFF
	 */
	public String getAttribute2ValueForJournalEntryLineDFF() {
		return attribute2ValueForJournalEntryLineDFF;
	}

	/**
	 * @param attribute2ValueForJournalEntryLineDFF the attribute2ValueForJournalEntryLineDFF to set
	 */
	public void setAttribute2ValueForJournalEntryLineDFF(String attribute2ValueForJournalEntryLineDFF) {
		this.attribute2ValueForJournalEntryLineDFF = attribute2ValueForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute3ValueForJournalEntryLineDFF
	 */
	public String getAttribute3ValueForJournalEntryLineDFF() {
		return attribute3ValueForJournalEntryLineDFF;
	}

	/**
	 * @param attribute3ValueForJournalEntryLineDFF the attribute3ValueForJournalEntryLineDFF to set
	 */
	public void setAttribute3ValueForJournalEntryLineDFF(String attribute3ValueForJournalEntryLineDFF) {
		this.attribute3ValueForJournalEntryLineDFF = attribute3ValueForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute4ValueForJournalEntryLineDFF
	 */
	public String getAttribute4ValueForJournalEntryLineDFF() {
		return attribute4ValueForJournalEntryLineDFF;
	}

	/**
	 * @param attribute4ValueForJournalEntryLineDFF the attribute4ValueForJournalEntryLineDFF to set
	 */
	public void setAttribute4ValueForJournalEntryLineDFF(String attribute4ValueForJournalEntryLineDFF) {
		this.attribute4ValueForJournalEntryLineDFF = attribute4ValueForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute5ValueForJournalEntryLineDFF
	 */
	public String getAttribute5ValueForJournalEntryLineDFF() {
		return attribute5ValueForJournalEntryLineDFF;
	}

	/**
	 * @param attribute5ValueForJournalEntryLineDFF the attribute5ValueForJournalEntryLineDFF to set
	 */
	public void setAttribute5ValueForJournalEntryLineDFF(String attribute5ValueForJournalEntryLineDFF) {
		this.attribute5ValueForJournalEntryLineDFF = attribute5ValueForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute6ValueForJournalEntryLineDFF
	 */
	public String getAttribute6ValueForJournalEntryLineDFF() {
		return attribute6ValueForJournalEntryLineDFF;
	}

	/**
	 * @param attribute6ValueForJournalEntryLineDFF the attribute6ValueForJournalEntryLineDFF to set
	 */
	public void setAttribute6ValueForJournalEntryLineDFF(String attribute6ValueForJournalEntryLineDFF) {
		this.attribute6ValueForJournalEntryLineDFF = attribute6ValueForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute7ValueForJournalEntryLineDFF
	 */
	public String getAttribute7ValueForJournalEntryLineDFF() {
		return attribute7ValueForJournalEntryLineDFF;
	}

	/**
	 * @param attribute7ValueForJournalEntryLineDFF the attribute7ValueForJournalEntryLineDFF to set
	 */
	public void setAttribute7ValueForJournalEntryLineDFF(String attribute7ValueForJournalEntryLineDFF) {
		this.attribute7ValueForJournalEntryLineDFF = attribute7ValueForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute8ValueForJournalEntryLineDFF
	 */
	public String getAttribute8ValueForJournalEntryLineDFF() {
		return attribute8ValueForJournalEntryLineDFF;
	}

	/**
	 * @param attribute8ValueForJournalEntryLineDFF the attribute8ValueForJournalEntryLineDFF to set
	 */
	public void setAttribute8ValueForJournalEntryLineDFF(String attribute8ValueForJournalEntryLineDFF) {
		this.attribute8ValueForJournalEntryLineDFF = attribute8ValueForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute9ValueForJournalEntryLineDFF
	 */
	public String getAttribute9ValueForJournalEntryLineDFF() {
		return attribute9ValueForJournalEntryLineDFF;
	}

	/**
	 * @param attribute9ValueForJournalEntryLineDFF the attribute9ValueForJournalEntryLineDFF to set
	 */
	public void setAttribute9ValueForJournalEntryLineDFF(String attribute9ValueForJournalEntryLineDFF) {
		this.attribute9ValueForJournalEntryLineDFF = attribute9ValueForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute10ValueForJournalEntryLineDFF
	 */
	public String getAttribute10ValueForJournalEntryLineDFF() {
		return attribute10ValueForJournalEntryLineDFF;
	}

	/**
	 * @param attribute10ValueForJournalEntryLineDFF the attribute10ValueForJournalEntryLineDFF to set
	 */
	public void setAttribute10ValueForJournalEntryLineDFF(String attribute10ValueForJournalEntryLineDFF) {
		this.attribute10ValueForJournalEntryLineDFF = attribute10ValueForJournalEntryLineDFF;
	}

	/**
	 * @return the attribute11ValueForCapturedInformationDFF
	 */
	public String getAttribute11ValueForCapturedInformationDFF() {
		return attribute11ValueForCapturedInformationDFF;
	}

	/**
	 * @param attribute11ValueForCapturedInformationDFF the attribute11ValueForCapturedInformationDFF to set
	 */
	public void setAttribute11ValueForCapturedInformationDFF(String attribute11ValueForCapturedInformationDFF) {
		this.attribute11ValueForCapturedInformationDFF = attribute11ValueForCapturedInformationDFF;
	}

	/**
	 * @return the attribute12ValueForCapturedInformationDFF
	 */
	public String getAttribute12ValueForCapturedInformationDFF() {
		return attribute12ValueForCapturedInformationDFF;
	}

	/**
	 * @param attribute12ValueForCapturedInformationDFF the attribute12ValueForCapturedInformationDFF to set
	 */
	public void setAttribute12ValueForCapturedInformationDFF(String attribute12ValueForCapturedInformationDFF) {
		this.attribute12ValueForCapturedInformationDFF = attribute12ValueForCapturedInformationDFF;
	}

	/**
	 * @return the attribute13ValueForCapturedInformationDFF
	 */
	public String getAttribute13ValueForCapturedInformationDFF() {
		return attribute13ValueForCapturedInformationDFF;
	}

	/**
	 * @param attribute13ValueForCapturedInformationDFF the attribute13ValueForCapturedInformationDFF to set
	 */
	public void setAttribute13ValueForCapturedInformationDFF(String attribute13ValueForCapturedInformationDFF) {
		this.attribute13ValueForCapturedInformationDFF = attribute13ValueForCapturedInformationDFF;
	}

	/**
	 * @return the attribute14ValueForCapturedInformationDFF
	 */
	public String getAttribute14ValueForCapturedInformationDFF() {
		return attribute14ValueForCapturedInformationDFF;
	}

	/**
	 * @param attribute14ValueForCapturedInformationDFF the attribute14ValueForCapturedInformationDFF to set
	 */
	public void setAttribute14ValueForCapturedInformationDFF(String attribute14ValueForCapturedInformationDFF) {
		this.attribute14ValueForCapturedInformationDFF = attribute14ValueForCapturedInformationDFF;
	}

	/**
	 * @return the attribute15ValueForCapturedInformationDFF
	 */
	public String getAttribute15ValueForCapturedInformationDFF() {
		return attribute15ValueForCapturedInformationDFF;
	}

	/**
	 * @param attribute15ValueForCapturedInformationDFF the attribute15ValueForCapturedInformationDFF to set
	 */
	public void setAttribute15ValueForCapturedInformationDFF(String attribute15ValueForCapturedInformationDFF) {
		this.attribute15ValueForCapturedInformationDFF = attribute15ValueForCapturedInformationDFF;
	}

	/**
	 * @return the attribute16ValueForCapturedInformationDFF
	 */
	public String getAttribute16ValueForCapturedInformationDFF() {
		return attribute16ValueForCapturedInformationDFF;
	}

	/**
	 * @param attribute16ValueForCapturedInformationDFF the attribute16ValueForCapturedInformationDFF to set
	 */
	public void setAttribute16ValueForCapturedInformationDFF(String attribute16ValueForCapturedInformationDFF) {
		this.attribute16ValueForCapturedInformationDFF = attribute16ValueForCapturedInformationDFF;
	}

	/**
	 * @return the attribute17ValueForCapturedInformationDFF
	 */
	public String getAttribute17ValueForCapturedInformationDFF() {
		return attribute17ValueForCapturedInformationDFF;
	}

	/**
	 * @param attribute17ValueForCapturedInformationDFF the attribute17ValueForCapturedInformationDFF to set
	 */
	public void setAttribute17ValueForCapturedInformationDFF(String attribute17ValueForCapturedInformationDFF) {
		this.attribute17ValueForCapturedInformationDFF = attribute17ValueForCapturedInformationDFF;
	}

	/**
	 * @return the attribute18ValueForCapturedInformationDFF
	 */
	public String getAttribute18ValueForCapturedInformationDFF() {
		return attribute18ValueForCapturedInformationDFF;
	}

	/**
	 * @param attribute18ValueForCapturedInformationDFF the attribute18ValueForCapturedInformationDFF to set
	 */
	public void setAttribute18ValueForCapturedInformationDFF(String attribute18ValueForCapturedInformationDFF) {
		this.attribute18ValueForCapturedInformationDFF = attribute18ValueForCapturedInformationDFF;
	}

	/**
	 * @return the attribute19ValueForCapturedInformationDFF
	 */
	public String getAttribute19ValueForCapturedInformationDFF() {
		return attribute19ValueForCapturedInformationDFF;
	}

	/**
	 * @param attribute19ValueForCapturedInformationDFF the attribute19ValueForCapturedInformationDFF to set
	 */
	public void setAttribute19ValueForCapturedInformationDFF(String attribute19ValueForCapturedInformationDFF) {
		this.attribute19ValueForCapturedInformationDFF = attribute19ValueForCapturedInformationDFF;
	}

	/**
	 * @return the attribute20ValueForCapturedInformationDFF
	 */
	public String getAttribute20ValueForCapturedInformationDFF() {
		return attribute20ValueForCapturedInformationDFF;
	}

	/**
	 * @param attribute20ValueForCapturedInformationDFF the attribute20ValueForCapturedInformationDFF to set
	 */
	public void setAttribute20ValueForCapturedInformationDFF(String attribute20ValueForCapturedInformationDFF) {
		this.attribute20ValueForCapturedInformationDFF = attribute20ValueForCapturedInformationDFF;
	}

	/**
	 * @return the contextFieldForCapturedInformationDFF
	 */
	public String getContextFieldForCapturedInformationDFF() {
		return contextFieldForCapturedInformationDFF;
	}

	/**
	 * @param contextFieldForCapturedInformationDFF the contextFieldForCapturedInformationDFF to set
	 */
	public void setContextFieldForCapturedInformationDFF(String contextFieldForCapturedInformationDFF) {
		this.contextFieldForCapturedInformationDFF = contextFieldForCapturedInformationDFF;
	}

	/*
	public String getAverageJournalFlag() {
		return averageJournalFlag;
	}

	public void setAverageJournalFlag(String averageJournalFlag) {
		this.averageJournalFlag = averageJournalFlag;
	}
*/
	
	/**
	 * @return the clearingCompany
	 */
	public String getClearingCompany() {
		return clearingCompany;
	}

	/**
	 * @param clearingCompany the clearingCompany to set
	 */
	public void setClearingCompany(String clearingCompany) {
		this.clearingCompany = clearingCompany;
	}

	/**
	 * @return the ledgerName
	 */
	public String getLedgerName() {
		return ledgerName;
	}

	/**
	 * @param ledgerName the ledgerName to set
	 */
	public void setLedgerName(String ledgerName) {
		this.ledgerName = ledgerName;
	}

	/**
	 * @return the encumbranceTypeID
	 */
	public String getEncumbranceTypeID() {
		return encumbranceTypeID;
	}

	/**
	 * @param encumbranceTypeID the encumbranceTypeID to set
	 */
	public void setEncumbranceTypeID(String encumbranceTypeID) {
		this.encumbranceTypeID = encumbranceTypeID;
	}

	/**
	 * @return the additionalInformation
	 */
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * @param additionalInformation the additionalInformation to set
	 */
	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	
    
}
