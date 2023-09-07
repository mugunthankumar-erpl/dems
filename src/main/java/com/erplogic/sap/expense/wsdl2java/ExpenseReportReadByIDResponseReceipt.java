
package com.erplogic.sap.expense.wsdl2java;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseReceipt", propOrder = {"uuid", "id", "expenseReportExpenseTypeCode",
    "expenseReportExpenseTypeName", "expenseReportExpenseCategoryCode", "expenseReportExpenseCategoryName",
    "documentExistsIndicator", "amount", "privateExpensesReductionAmount", "purelyPrivateIndicator", "paymentAmount",
    "date", "exchangeRate", "firstExchangeRate", "taxAmount", "productTaxationCharacteristicsCode",
    "productTaxationCharacteristicsName", "productTax", "productTaxDeclarationDetails", "basePeriod", "baseNumberValue",
    "baseMeasureUnitName", "breakfastMealNumberValue", "lunchMealNumberValue", "dinnerMealNumberValue",
    "stayLocationName", "stayLocationCountryCode", "stayLocationCountryName",
    "stayLocationExpenseReportPerDiemRegionCode", "stayLocationExpenseReportPerDiemRegionName",
    "stayExpenseReportStatutoryStayTypeCode", "stayExpenseReportStatutoryStayTypeName",
    "stayExpenseReportEnterpriseStayTypeCode", "stayExpenseReportEnterpriseStayTypeName",
    "stayExpenseReportActivityStayTypeCode", "stayExpenseReportActivityStayTypeName", "description",
    "businessReasonDescription", "businessPurposeDescription", "paymentFormCode", "paymentFormName",
    "employeeBankDetailsKey", "tripServiceProviderCode", "tripServiceProviderName", "tripServiceDocumentID",
    "employeeEntertainmentParticipantNumberValue", "businessPartnerEntertainmentParticipantNumberValue",
    "otherPersonEntertainmentParticipantNumberValue", "paidByCompanyIndicator", "upperLimitViolationIndicator",
    "checkedIndicator", "note", "checkResultLogItemSeverityCode", "checkResultLogItemSeverityName",
    "referenceExpenseReportReceiptID", "referenceExpenseReportReceiptUUID", "expenseReportMainReceiptKey",
    "originalAmount", "expenseReportAttachmentFolderDocumentUUID", "supplierName", "sourceCode", "sourceName",
    "opticalCharacterRecognitionImageQualityRatingPercent", "reviewStatusCode", "reviewStatusName", "taxCode1",
    "taxCode1Name", "taxRegion1", "taxRegion1Name", "taxAmount1", "taxCode2", "taxCode2Name", "taxRegion2",
    "taxRegion2Name", "taxAmount2", "taxCode3", "taxCode3Name", "taxRegion3", "taxRegion3Name", "taxAmount3",
    "taxCode4", "taxCode4Name", "taxRegion4", "taxRegion4Name", "taxAmount4", "taxAmountTotal", "uuidcfdi",
    "externalReferenceId", "hsnsacCode", "hsnsacName", "invoiceLegallyAuthorisedID", "attachmentFolder",
    "accountingCodingBlockDistribution"})
public class ExpenseReportReadByIDResponseReceipt {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String id;
    @XmlElement(name = "ExpenseReportExpenseTypeCode")
    private ExpenseReportExpenseTypeCode expenseReportExpenseTypeCode;
    @XmlElement(name = "ExpenseReportExpenseTypeName")
    private String expenseReportExpenseTypeName;
    @XmlElement(name = "ExpenseReportExpenseCategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String expenseReportExpenseCategoryCode;
    @XmlElement(name = "ExpenseReportExpenseCategoryName")
    private String expenseReportExpenseCategoryName;
    @XmlElement(name = "DocumentExistsIndicator")
    private Boolean documentExistsIndicator;
    @XmlElement(name = "Amount")
    private Amount amount;
    @XmlElement(name = "PrivateExpensesReductionAmount")
    private Amount privateExpensesReductionAmount;
    @XmlElement(name = "PurelyPrivateIndicator")
    private Boolean purelyPrivateIndicator;
    @XmlElement(name = "PaymentAmount")
    private Amount paymentAmount;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar date;
    @XmlElement(name = "ExchangeRate")
    private ExchangeRate exchangeRate;
    @XmlElement(name = "FirstExchangeRate")
    private ExchangeRate firstExchangeRate;
    @XmlElement(name = "TaxAmount")
    private Amount taxAmount;
    @XmlElement(name = "ProductTaxationCharacteristicsCode")
    private ProductTaxationCharacteristicsCode productTaxationCharacteristicsCode;
    @XmlElement(name = "ProductTaxationCharacteristicsName")
    private String productTaxationCharacteristicsName;
    @XmlElement(name = "ProductTax")
    private FINANCIALACCOUNTINGProductTax productTax;
    @XmlElement(name = "ProductTaxDeclarationDetails")
    private ProductTaxDeclarationDetails productTaxDeclarationDetails;
    @XmlElement(name = "BasePeriod")
    private CLOSEDDatePeriod basePeriod;
    @XmlElement(name = "BaseNumberValue")
    private Integer baseNumberValue;
    @XmlElement(name = "BaseMeasureUnitName")
    private String baseMeasureUnitName;
    @XmlElement(name = "BreakfastMealNumberValue")
    private Integer breakfastMealNumberValue;
    @XmlElement(name = "LunchMealNumberValue")
    private Integer lunchMealNumberValue;
    @XmlElement(name = "DinnerMealNumberValue")
    private Integer dinnerMealNumberValue;
    @XmlElement(name = "StayLocationName")
    private String stayLocationName;
    @XmlElement(name = "StayLocationCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String stayLocationCountryCode;
    @XmlElement(name = "StayLocationCountryName")
    private String stayLocationCountryName;
    @XmlElement(name = "StayLocationExpenseReportPerDiemRegionCode")
    private ExpenseReportPerDiemRegionCode stayLocationExpenseReportPerDiemRegionCode;
    @XmlElement(name = "StayLocationExpenseReportPerDiemRegionName")
    private String stayLocationExpenseReportPerDiemRegionName;
    @XmlElement(name = "StayExpenseReportStatutoryStayTypeCode")
    private ExpenseReportStatutoryStayTypeCode stayExpenseReportStatutoryStayTypeCode;
    @XmlElement(name = "StayExpenseReportStatutoryStayTypeName")
    private String stayExpenseReportStatutoryStayTypeName;
    @XmlElement(name = "StayExpenseReportEnterpriseStayTypeCode")
    private ExpenseReportEnterpriseStayTypeCode stayExpenseReportEnterpriseStayTypeCode;
    @XmlElement(name = "StayExpenseReportEnterpriseStayTypeName")
    private String stayExpenseReportEnterpriseStayTypeName;
    @XmlElement(name = "StayExpenseReportActivityStayTypeCode")
    private ExpenseReportActivityStayTypeCode stayExpenseReportActivityStayTypeCode;
    @XmlElement(name = "StayExpenseReportActivityStayTypeName")
    private String stayExpenseReportActivityStayTypeName;
    @XmlElement(name = "Description")
    private String description;
    @XmlElement(name = "BusinessReasonDescription")
    private String businessReasonDescription;
    @XmlElement(name = "BusinessPurposeDescription")
    private String businessPurposeDescription;
    @XmlElement(name = "PaymentFormCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String paymentFormCode;
    @XmlElement(name = "PaymentFormName")
    private String paymentFormName;
    @XmlElement(name = "EmployeeBankDetailsKey")
    private ExpenseReportReadByIDResponseReceiptEmployeeBankDetailsKey employeeBankDetailsKey;
    @XmlElement(name = "TripServiceProviderCode")
    private TripServiceProviderCode tripServiceProviderCode;
    @XmlElement(name = "TripServiceProviderName")
    private String tripServiceProviderName;
    @XmlElement(name = "TripServiceDocumentID")
    private BusinessTransactionDocumentID tripServiceDocumentID;
    @XmlElement(name = "EmployeeEntertainmentParticipantNumberValue")
    private Integer employeeEntertainmentParticipantNumberValue;
    @XmlElement(name = "BusinessPartnerEntertainmentParticipantNumberValue")
    private Integer businessPartnerEntertainmentParticipantNumberValue;
    @XmlElement(name = "OtherPersonEntertainmentParticipantNumberValue")
    private Integer otherPersonEntertainmentParticipantNumberValue;
    @XmlElement(name = "PaidByCompanyIndicator")
    private Boolean paidByCompanyIndicator;
    @XmlElement(name = "UpperLimitViolationIndicator")
    private Boolean upperLimitViolationIndicator;
    @XmlElement(name = "CheckedIndicator")
    private Boolean checkedIndicator;
    @XmlElement(name = "Note")
    private String note;
    @XmlElement(name = "CheckResultLogItemSeverityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String checkResultLogItemSeverityCode;
    @XmlElement(name = "CheckResultLogItemSeverityName")
    private String checkResultLogItemSeverityName;
    @XmlElement(name = "ReferenceExpenseReportReceiptID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String referenceExpenseReportReceiptID;
    @XmlElement(name = "ReferenceExpenseReportReceiptUUID")
    private UUID referenceExpenseReportReceiptUUID;
    @XmlElement(name = "ExpenseReportMainReceiptKey")
    private ExpenseReportReadByIDResponseReceiptExpenseReportMainReceiptKey expenseReportMainReceiptKey;
    @XmlElement(name = "OriginalAmount")
    private Amount originalAmount;
    @XmlElement(name = "ExpenseReportAttachmentFolderDocumentUUID")
    private UUID expenseReportAttachmentFolderDocumentUUID;
    @XmlElement(name = "SupplierName")
    private String supplierName;
    @XmlElement(name = "SourceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String sourceCode;
    @XmlElement(name = "SourceName")
    private String sourceName;
    @XmlElement(name = "OpticalCharacterRecognitionImageQualityRatingPercent")
    private BigDecimal opticalCharacterRecognitionImageQualityRatingPercent;
    @XmlElement(name = "ReviewStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String reviewStatusCode;
    @XmlElement(name = "ReviewStatusName")
    private String reviewStatusName;
    @XmlElement(name = "TaxCode1")
    private ProductTaxationCharacteristicsCode taxCode1;
    @XmlElement(name = "TaxCode1Name")
    private String taxCode1Name;
    @XmlElement(name = "TaxRegion1")
    private RegionCode taxRegion1;
    @XmlElement(name = "TaxRegion1Name")
    private String taxRegion1Name;
    @XmlElement(name = "TaxAmount1")
    private Amount taxAmount1;
    @XmlElement(name = "TaxCode2")
    private ProductTaxationCharacteristicsCode taxCode2;
    @XmlElement(name = "TaxCode2Name")
    private String taxCode2Name;
    @XmlElement(name = "TaxRegion2")
    private RegionCode taxRegion2;
    @XmlElement(name = "TaxRegion2Name")
    private String taxRegion2Name;
    @XmlElement(name = "TaxAmount2")
    private Amount taxAmount2;
    @XmlElement(name = "TaxCode3")
    private ProductTaxationCharacteristicsCode taxCode3;
    @XmlElement(name = "TaxCode3Name")
    private String taxCode3Name;
    @XmlElement(name = "TaxRegion3")
    private RegionCode taxRegion3;
    @XmlElement(name = "TaxRegion3Name")
    private String taxRegion3Name;
    @XmlElement(name = "TaxAmount3")
    private Amount taxAmount3;
    @XmlElement(name = "TaxCode4")
    private ProductTaxationCharacteristicsCode taxCode4;
    @XmlElement(name = "TaxCode4Name")
    private String taxCode4Name;
    @XmlElement(name = "TaxRegion4")
    private RegionCode taxRegion4;
    @XmlElement(name = "TaxRegion4Name")
    private String taxRegion4Name;
    @XmlElement(name = "TaxAmount4")
    private Amount taxAmount4;
    @XmlElement(name = "TaxAmountTotal")
    private Amount taxAmountTotal;
    @XmlElement(name = "UUIDCFDI")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String uuidcfdi;
    @XmlElement(name = "ExternalReferenceId")
    private String externalReferenceId;
    @XmlElement(name = "HSNSACCode")
    private ProductTaxStandardClassificationCode hsnsacCode;
    @XmlElement(name = "HSNSACName")
    private String hsnsacName;
    @XmlElement(name = "InvoiceLegallyAuthorisedID")
    private InvoiceLegallyAuthorisedLongID invoiceLegallyAuthorisedID;
    @XmlElement(name = "AttachmentFolder")
    private AccessAttachmentFolder attachmentFolder;
    @XmlElement(name = "AccountingCodingBlockDistribution")
    private AccessAccountingCodingBlockDistribution accountingCodingBlockDistribution;

    /**
     * Gets the value of the uuid property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setUUID(final UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setID(final String value) {
        this.id = value;
    }

    /**
     * Gets the value of the expenseReportExpenseTypeCode property.
     *
     * @return possible object is {@link ExpenseReportExpenseTypeCode }
     *
     */
    public ExpenseReportExpenseTypeCode getExpenseReportExpenseTypeCode() {
        return expenseReportExpenseTypeCode;
    }

    /**
     * Sets the value of the expenseReportExpenseTypeCode property.
     *
     * @param value allowed object is {@link ExpenseReportExpenseTypeCode }
     *
     */
    public void setExpenseReportExpenseTypeCode(final ExpenseReportExpenseTypeCode value) {
        this.expenseReportExpenseTypeCode = value;
    }

    public String getExpenseReportExpenseTypeName() {
        return expenseReportExpenseTypeName;
    }

    public void setExpenseReportExpenseTypeName(final String value) {
        this.expenseReportExpenseTypeName = value;
    }

    public String getExpenseReportExpenseCategoryCode() {
        return expenseReportExpenseCategoryCode;
    }

    /**
     * Sets the value of the expenseReportExpenseCategoryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setExpenseReportExpenseCategoryCode(final String value) {
        this.expenseReportExpenseCategoryCode = value;
    }

    /**
     * Gets the value of the expenseReportExpenseCategoryName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExpenseReportExpenseCategoryName() {
        return expenseReportExpenseCategoryName;
    }

    /**
     * Sets the value of the expenseReportExpenseCategoryName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setExpenseReportExpenseCategoryName(final String value) {
        this.expenseReportExpenseCategoryName = value;
    }

    /**
     * Gets the value of the documentExistsIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isDocumentExistsIndicator() {
        return documentExistsIndicator;
    }

    /**
     * Sets the value of the documentExistsIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setDocumentExistsIndicator(final Boolean value) {
        this.documentExistsIndicator = value;
    }

    /**
     * Gets the value of the amount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setAmount(final Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the privateExpensesReductionAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getPrivateExpensesReductionAmount() {
        return privateExpensesReductionAmount;
    }

    /**
     * Sets the value of the privateExpensesReductionAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setPrivateExpensesReductionAmount(final Amount value) {
        this.privateExpensesReductionAmount = value;
    }

    /**
     * Gets the value of the purelyPrivateIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isPurelyPrivateIndicator() {
        return purelyPrivateIndicator;
    }

    /**
     * Sets the value of the purelyPrivateIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setPurelyPrivateIndicator(final Boolean value) {
        this.purelyPrivateIndicator = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setPaymentAmount(final Amount value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the date property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDate(final XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     *
     * @return possible object is {@link ExchangeRate }
     *
     */
    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     *
     * @param value allowed object is {@link ExchangeRate }
     *
     */
    public void setExchangeRate(final ExchangeRate value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the firstExchangeRate property.
     *
     * @return possible object is {@link ExchangeRate }
     *
     */
    public ExchangeRate getFirstExchangeRate() {
        return firstExchangeRate;
    }

    /**
     * Sets the value of the firstExchangeRate property.
     *
     * @param value allowed object is {@link ExchangeRate }
     *
     */
    public void setFirstExchangeRate(final ExchangeRate value) {
        this.firstExchangeRate = value;
    }

    /**
     * Gets the value of the taxAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxAmount(final Amount value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the productTaxationCharacteristicsCode property.
     *
     * @return possible object is {@link ProductTaxationCharacteristicsCode }
     *
     */
    public ProductTaxationCharacteristicsCode getProductTaxationCharacteristicsCode() {
        return productTaxationCharacteristicsCode;
    }

    /**
     * Sets the value of the productTaxationCharacteristicsCode property.
     *
     * @param value allowed object is {@link ProductTaxationCharacteristicsCode }
     *
     */
    public void setProductTaxationCharacteristicsCode(final ProductTaxationCharacteristicsCode value) {
        this.productTaxationCharacteristicsCode = value;
    }

    /**
     * Gets the value of the productTaxationCharacteristicsName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProductTaxationCharacteristicsName() {
        return productTaxationCharacteristicsName;
    }

    /**
     * Sets the value of the productTaxationCharacteristicsName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProductTaxationCharacteristicsName(final String value) {
        this.productTaxationCharacteristicsName = value;
    }

    /**
     * Gets the value of the productTax property.
     *
     * @return possible object is {@link FINANCIALACCOUNTINGProductTax }
     *
     */
    public FINANCIALACCOUNTINGProductTax getProductTax() {
        return productTax;
    }

    /**
     * Sets the value of the productTax property.
     *
     * @param value allowed object is {@link FINANCIALACCOUNTINGProductTax }
     *
     */
    public void setProductTax(final FINANCIALACCOUNTINGProductTax value) {
        this.productTax = value;
    }

    /**
     * Gets the value of the productTaxDeclarationDetails property.
     *
     * @return possible object is {@link ProductTaxDeclarationDetails }
     *
     */
    public ProductTaxDeclarationDetails getProductTaxDeclarationDetails() {
        return productTaxDeclarationDetails;
    }

    /**
     * Sets the value of the productTaxDeclarationDetails property.
     *
     * @param value allowed object is {@link ProductTaxDeclarationDetails }
     *
     */
    public void setProductTaxDeclarationDetails(final ProductTaxDeclarationDetails value) {
        this.productTaxDeclarationDetails = value;
    }

    /**
     * Gets the value of the basePeriod property.
     *
     * @return possible object is {@link CLOSEDDatePeriod }
     *
     */
    public CLOSEDDatePeriod getBasePeriod() {
        return basePeriod;
    }

    /**
     * Sets the value of the basePeriod property.
     *
     * @param value allowed object is {@link CLOSEDDatePeriod }
     *
     */
    public void setBasePeriod(final CLOSEDDatePeriod value) {
        this.basePeriod = value;
    }

    /**
     * Gets the value of the baseNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getBaseNumberValue() {
        return baseNumberValue;
    }

    /**
     * Sets the value of the baseNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setBaseNumberValue(final Integer value) {
        this.baseNumberValue = value;
    }

    /**
     * Gets the value of the baseMeasureUnitName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getBaseMeasureUnitName() {
        return baseMeasureUnitName;
    }

    /**
     * Sets the value of the baseMeasureUnitName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBaseMeasureUnitName(final String value) {
        this.baseMeasureUnitName = value;
    }

    /**
     * Gets the value of the breakfastMealNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getBreakfastMealNumberValue() {
        return breakfastMealNumberValue;
    }

    /**
     * Sets the value of the breakfastMealNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setBreakfastMealNumberValue(final Integer value) {
        this.breakfastMealNumberValue = value;
    }

    /**
     * Gets the value of the lunchMealNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getLunchMealNumberValue() {
        return lunchMealNumberValue;
    }

    /**
     * Sets the value of the lunchMealNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setLunchMealNumberValue(final Integer value) {
        this.lunchMealNumberValue = value;
    }

    /**
     * Gets the value of the dinnerMealNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getDinnerMealNumberValue() {
        return dinnerMealNumberValue;
    }

    /**
     * Sets the value of the dinnerMealNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setDinnerMealNumberValue(final Integer value) {
        this.dinnerMealNumberValue = value;
    }

    /**
     * Gets the value of the stayLocationName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayLocationName() {
        return stayLocationName;
    }

    /**
     * Sets the value of the stayLocationName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayLocationName(final String value) {
        this.stayLocationName = value;
    }

    /**
     * Gets the value of the stayLocationCountryCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayLocationCountryCode() {
        return stayLocationCountryCode;
    }

    /**
     * Sets the value of the stayLocationCountryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayLocationCountryCode(final String value) {
        this.stayLocationCountryCode = value;
    }

    /**
     * Gets the value of the stayLocationCountryName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayLocationCountryName() {
        return stayLocationCountryName;
    }

    /**
     * Sets the value of the stayLocationCountryName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayLocationCountryName(final String value) {
        this.stayLocationCountryName = value;
    }

    /**
     * Gets the value of the stayLocationExpenseReportPerDiemRegionCode property.
     *
     * @return possible object is {@link ExpenseReportPerDiemRegionCode }
     *
     */
    public ExpenseReportPerDiemRegionCode getStayLocationExpenseReportPerDiemRegionCode() {
        return stayLocationExpenseReportPerDiemRegionCode;
    }

    /**
     * Sets the value of the stayLocationExpenseReportPerDiemRegionCode property.
     *
     * @param value allowed object is {@link ExpenseReportPerDiemRegionCode }
     *
     */
    public void setStayLocationExpenseReportPerDiemRegionCode(final ExpenseReportPerDiemRegionCode value) {
        this.stayLocationExpenseReportPerDiemRegionCode = value;
    }

    /**
     * Gets the value of the stayLocationExpenseReportPerDiemRegionName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayLocationExpenseReportPerDiemRegionName() {
        return stayLocationExpenseReportPerDiemRegionName;
    }

    /**
     * Sets the value of the stayLocationExpenseReportPerDiemRegionName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayLocationExpenseReportPerDiemRegionName(final String value) {
        this.stayLocationExpenseReportPerDiemRegionName = value;
    }

    /**
     * Gets the value of the stayExpenseReportStatutoryStayTypeCode property.
     *
     * @return possible object is {@link ExpenseReportStatutoryStayTypeCode }
     *
     */
    public ExpenseReportStatutoryStayTypeCode getStayExpenseReportStatutoryStayTypeCode() {
        return stayExpenseReportStatutoryStayTypeCode;
    }

    /**
     * Sets the value of the stayExpenseReportStatutoryStayTypeCode property.
     *
     * @param value allowed object is {@link ExpenseReportStatutoryStayTypeCode }
     *
     */
    public void setStayExpenseReportStatutoryStayTypeCode(final ExpenseReportStatutoryStayTypeCode value) {
        this.stayExpenseReportStatutoryStayTypeCode = value;
    }

    /**
     * Gets the value of the stayExpenseReportStatutoryStayTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayExpenseReportStatutoryStayTypeName() {
        return stayExpenseReportStatutoryStayTypeName;
    }

    /**
     * Sets the value of the stayExpenseReportStatutoryStayTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayExpenseReportStatutoryStayTypeName(final String value) {
        this.stayExpenseReportStatutoryStayTypeName = value;
    }

    /**
     * Gets the value of the stayExpenseReportEnterpriseStayTypeCode property.
     *
     * @return possible object is {@link ExpenseReportEnterpriseStayTypeCode }
     *
     */
    public ExpenseReportEnterpriseStayTypeCode getStayExpenseReportEnterpriseStayTypeCode() {
        return stayExpenseReportEnterpriseStayTypeCode;
    }

    /**
     * Sets the value of the stayExpenseReportEnterpriseStayTypeCode property.
     *
     * @param value allowed object is {@link ExpenseReportEnterpriseStayTypeCode }
     *
     */
    public void setStayExpenseReportEnterpriseStayTypeCode(final ExpenseReportEnterpriseStayTypeCode value) {
        this.stayExpenseReportEnterpriseStayTypeCode = value;
    }

    /**
     * Gets the value of the stayExpenseReportEnterpriseStayTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayExpenseReportEnterpriseStayTypeName() {
        return stayExpenseReportEnterpriseStayTypeName;
    }

    /**
     * Sets the value of the stayExpenseReportEnterpriseStayTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayExpenseReportEnterpriseStayTypeName(final String value) {
        this.stayExpenseReportEnterpriseStayTypeName = value;
    }

    /**
     * Gets the value of the stayExpenseReportActivityStayTypeCode property.
     *
     * @return possible object is {@link ExpenseReportActivityStayTypeCode }
     *
     */
    public ExpenseReportActivityStayTypeCode getStayExpenseReportActivityStayTypeCode() {
        return stayExpenseReportActivityStayTypeCode;
    }

    /**
     * Sets the value of the stayExpenseReportActivityStayTypeCode property.
     *
     * @param value allowed object is {@link ExpenseReportActivityStayTypeCode }
     *
     */
    public void setStayExpenseReportActivityStayTypeCode(final ExpenseReportActivityStayTypeCode value) {
        this.stayExpenseReportActivityStayTypeCode = value;
    }

    /**
     * Gets the value of the stayExpenseReportActivityStayTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayExpenseReportActivityStayTypeName() {
        return stayExpenseReportActivityStayTypeName;
    }

    /**
     * Sets the value of the stayExpenseReportActivityStayTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayExpenseReportActivityStayTypeName(final String value) {
        this.stayExpenseReportActivityStayTypeName = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescription(final String value) {
        this.description = value;
    }

    /**
     * Gets the value of the businessReasonDescription property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getBusinessReasonDescription() {
        return businessReasonDescription;
    }

    /**
     * Sets the value of the businessReasonDescription property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBusinessReasonDescription(final String value) {
        this.businessReasonDescription = value;
    }

    /**
     * Gets the value of the businessPurposeDescription property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getBusinessPurposeDescription() {
        return businessPurposeDescription;
    }

    /**
     * Sets the value of the businessPurposeDescription property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBusinessPurposeDescription(final String value) {
        this.businessPurposeDescription = value;
    }

    /**
     * Gets the value of the paymentFormCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPaymentFormCode() {
        return paymentFormCode;
    }

    /**
     * Sets the value of the paymentFormCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPaymentFormCode(final String value) {
        this.paymentFormCode = value;
    }

    /**
     * Gets the value of the paymentFormName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPaymentFormName() {
        return paymentFormName;
    }

    /**
     * Sets the value of the paymentFormName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPaymentFormName(final String value) {
        this.paymentFormName = value;
    }

    /**
     * Gets the value of the employeeBankDetailsKey property.
     *
     * @return possible object is
     *         {@link ExpenseReportReadByIDResponseReceiptEmployeeBankDetailsKey }
     *
     */
    public ExpenseReportReadByIDResponseReceiptEmployeeBankDetailsKey getEmployeeBankDetailsKey() {
        return employeeBankDetailsKey;
    }

    /**
     * Sets the value of the employeeBankDetailsKey property.
     *
     * @param value allowed object is
     *              {@link ExpenseReportReadByIDResponseReceiptEmployeeBankDetailsKey
     *              }
     *
     */
    public void setEmployeeBankDetailsKey(final ExpenseReportReadByIDResponseReceiptEmployeeBankDetailsKey value) {
        this.employeeBankDetailsKey = value;
    }

    /**
     * Gets the value of the tripServiceProviderCode property.
     *
     * @return possible object is {@link TripServiceProviderCode }
     *
     */
    public TripServiceProviderCode getTripServiceProviderCode() {
        return tripServiceProviderCode;
    }

    /**
     * Sets the value of the tripServiceProviderCode property.
     *
     * @param value allowed object is {@link TripServiceProviderCode }
     *
     */
    public void setTripServiceProviderCode(final TripServiceProviderCode value) {
        this.tripServiceProviderCode = value;
    }

    /**
     * Gets the value of the tripServiceProviderName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTripServiceProviderName() {
        return tripServiceProviderName;
    }

    /**
     * Sets the value of the tripServiceProviderName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTripServiceProviderName(final String value) {
        this.tripServiceProviderName = value;
    }

    /**
     * Gets the value of the tripServiceDocumentID property.
     *
     * @return possible object is {@link BusinessTransactionDocumentID }
     *
     */
    public BusinessTransactionDocumentID getTripServiceDocumentID() {
        return tripServiceDocumentID;
    }

    /**
     * Sets the value of the tripServiceDocumentID property.
     *
     * @param value allowed object is {@link BusinessTransactionDocumentID }
     *
     */
    public void setTripServiceDocumentID(final BusinessTransactionDocumentID value) {
        this.tripServiceDocumentID = value;
    }

    /**
     * Gets the value of the employeeEntertainmentParticipantNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getEmployeeEntertainmentParticipantNumberValue() {
        return employeeEntertainmentParticipantNumberValue;
    }

    /**
     * Sets the value of the employeeEntertainmentParticipantNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setEmployeeEntertainmentParticipantNumberValue(final Integer value) {
        this.employeeEntertainmentParticipantNumberValue = value;
    }

    /**
     * Gets the value of the businessPartnerEntertainmentParticipantNumberValue
     * property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getBusinessPartnerEntertainmentParticipantNumberValue() {
        return businessPartnerEntertainmentParticipantNumberValue;
    }

    /**
     * Sets the value of the businessPartnerEntertainmentParticipantNumberValue
     * property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setBusinessPartnerEntertainmentParticipantNumberValue(final Integer value) {
        this.businessPartnerEntertainmentParticipantNumberValue = value;
    }

    /**
     * Gets the value of the otherPersonEntertainmentParticipantNumberValue
     * property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getOtherPersonEntertainmentParticipantNumberValue() {
        return otherPersonEntertainmentParticipantNumberValue;
    }

    /**
     * Sets the value of the otherPersonEntertainmentParticipantNumberValue
     * property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setOtherPersonEntertainmentParticipantNumberValue(final Integer value) {
        this.otherPersonEntertainmentParticipantNumberValue = value;
    }

    /**
     * Gets the value of the paidByCompanyIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isPaidByCompanyIndicator() {
        return paidByCompanyIndicator;
    }

    /**
     * Sets the value of the paidByCompanyIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setPaidByCompanyIndicator(final Boolean value) {
        this.paidByCompanyIndicator = value;
    }

    /**
     * Gets the value of the upperLimitViolationIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isUpperLimitViolationIndicator() {
        return upperLimitViolationIndicator;
    }

    /**
     * Sets the value of the upperLimitViolationIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setUpperLimitViolationIndicator(final Boolean value) {
        this.upperLimitViolationIndicator = value;
    }

    /**
     * Gets the value of the checkedIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isCheckedIndicator() {
        return checkedIndicator;
    }

    /**
     * Sets the value of the checkedIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setCheckedIndicator(final Boolean value) {
        this.checkedIndicator = value;
    }

    /**
     * Gets the value of the note property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNote(final String value) {
        this.note = value;
    }

    /**
     * Gets the value of the checkResultLogItemSeverityCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCheckResultLogItemSeverityCode() {
        return checkResultLogItemSeverityCode;
    }

    /**
     * Sets the value of the checkResultLogItemSeverityCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCheckResultLogItemSeverityCode(final String value) {
        this.checkResultLogItemSeverityCode = value;
    }

    /**
     * Gets the value of the checkResultLogItemSeverityName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCheckResultLogItemSeverityName() {
        return checkResultLogItemSeverityName;
    }

    /**
     * Sets the value of the checkResultLogItemSeverityName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCheckResultLogItemSeverityName(final String value) {
        this.checkResultLogItemSeverityName = value;
    }

    /**
     * Gets the value of the referenceExpenseReportReceiptID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReferenceExpenseReportReceiptID() {
        return referenceExpenseReportReceiptID;
    }

    /**
     * Sets the value of the referenceExpenseReportReceiptID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReferenceExpenseReportReceiptID(final String value) {
        this.referenceExpenseReportReceiptID = value;
    }

    /**
     * Gets the value of the referenceExpenseReportReceiptUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getReferenceExpenseReportReceiptUUID() {
        return referenceExpenseReportReceiptUUID;
    }

    /**
     * Sets the value of the referenceExpenseReportReceiptUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setReferenceExpenseReportReceiptUUID(final UUID value) {
        this.referenceExpenseReportReceiptUUID = value;
    }

    /**
     * Gets the value of the expenseReportMainReceiptKey property.
     *
     * @return possible object is
     *         {@link ExpenseReportReadByIDResponseReceiptExpenseReportMainReceiptKey
     *         }
     *
     */
    public ExpenseReportReadByIDResponseReceiptExpenseReportMainReceiptKey getExpenseReportMainReceiptKey() {
        return expenseReportMainReceiptKey;
    }

    /**
     * Sets the value of the expenseReportMainReceiptKey property.
     *
     * @param value allowed object is
     *              {@link ExpenseReportReadByIDResponseReceiptExpenseReportMainReceiptKey
     *              }
     *
     */
    public void setExpenseReportMainReceiptKey(
        final ExpenseReportReadByIDResponseReceiptExpenseReportMainReceiptKey value) {
        this.expenseReportMainReceiptKey = value;
    }

    /**
     * Gets the value of the originalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setOriginalAmount(final Amount value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the expenseReportAttachmentFolderDocumentUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getExpenseReportAttachmentFolderDocumentUUID() {
        return expenseReportAttachmentFolderDocumentUUID;
    }

    /**
     * Sets the value of the expenseReportAttachmentFolderDocumentUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setExpenseReportAttachmentFolderDocumentUUID(final UUID value) {
        this.expenseReportAttachmentFolderDocumentUUID = value;
    }

    /**
     * Gets the value of the supplierName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSupplierName(final String value) {
        this.supplierName = value;
    }

    /**
     * Gets the value of the sourceCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSourceCode(final String value) {
        this.sourceCode = value;
    }

    /**
     * Gets the value of the sourceName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSourceName(final String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the opticalCharacterRecognitionImageQualityRatingPercent
     * property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getOpticalCharacterRecognitionImageQualityRatingPercent() {
        return opticalCharacterRecognitionImageQualityRatingPercent;
    }

    /**
     * Sets the value of the opticalCharacterRecognitionImageQualityRatingPercent
     * property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setOpticalCharacterRecognitionImageQualityRatingPercent(final BigDecimal value) {
        this.opticalCharacterRecognitionImageQualityRatingPercent = value;
    }

    /**
     * Gets the value of the reviewStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReviewStatusCode() {
        return reviewStatusCode;
    }

    /**
     * Sets the value of the reviewStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReviewStatusCode(final String value) {
        this.reviewStatusCode = value;
    }

    /**
     * Gets the value of the reviewStatusName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReviewStatusName() {
        return reviewStatusName;
    }

    /**
     * Sets the value of the reviewStatusName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReviewStatusName(final String value) {
        this.reviewStatusName = value;
    }

    /**
     * Gets the value of the taxCode1 property.
     *
     * @return possible object is {@link ProductTaxationCharacteristicsCode }
     *
     */
    public ProductTaxationCharacteristicsCode getTaxCode1() {
        return taxCode1;
    }

    /**
     * Sets the value of the taxCode1 property.
     *
     * @param value allowed object is {@link ProductTaxationCharacteristicsCode }
     *
     */
    public void setTaxCode1(final ProductTaxationCharacteristicsCode value) {
        this.taxCode1 = value;
    }

    /**
     * Gets the value of the taxCode1Name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTaxCode1Name() {
        return taxCode1Name;
    }

    /**
     * Sets the value of the taxCode1Name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTaxCode1Name(final String value) {
        this.taxCode1Name = value;
    }

    /**
     * Gets the value of the taxRegion1 property.
     *
     * @return possible object is {@link RegionCode }
     *
     */
    public RegionCode getTaxRegion1() {
        return taxRegion1;
    }

    /**
     * Sets the value of the taxRegion1 property.
     *
     * @param value allowed object is {@link RegionCode }
     *
     */
    public void setTaxRegion1(final RegionCode value) {
        this.taxRegion1 = value;
    }

    /**
     * Gets the value of the taxRegion1Name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTaxRegion1Name() {
        return taxRegion1Name;
    }

    /**
     * Sets the value of the taxRegion1Name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTaxRegion1Name(final String value) {
        this.taxRegion1Name = value;
    }

    /**
     * Gets the value of the taxAmount1 property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxAmount1() {
        return taxAmount1;
    }

    /**
     * Sets the value of the taxAmount1 property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxAmount1(final Amount value) {
        this.taxAmount1 = value;
    }

    /**
     * Gets the value of the taxCode2 property.
     *
     * @return possible object is {@link ProductTaxationCharacteristicsCode }
     *
     */
    public ProductTaxationCharacteristicsCode getTaxCode2() {
        return taxCode2;
    }

    /**
     * Sets the value of the taxCode2 property.
     *
     * @param value allowed object is {@link ProductTaxationCharacteristicsCode }
     *
     */
    public void setTaxCode2(final ProductTaxationCharacteristicsCode value) {
        this.taxCode2 = value;
    }

    /**
     * Gets the value of the taxCode2Name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTaxCode2Name() {
        return taxCode2Name;
    }

    /**
     * Sets the value of the taxCode2Name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTaxCode2Name(final String value) {
        this.taxCode2Name = value;
    }

    /**
     * Gets the value of the taxRegion2 property.
     *
     * @return possible object is {@link RegionCode }
     *
     */
    public RegionCode getTaxRegion2() {
        return taxRegion2;
    }

    /**
     * Sets the value of the taxRegion2 property.
     *
     * @param value allowed object is {@link RegionCode }
     *
     */
    public void setTaxRegion2(final RegionCode value) {
        this.taxRegion2 = value;
    }

    /**
     * Gets the value of the taxRegion2Name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTaxRegion2Name() {
        return taxRegion2Name;
    }

    /**
     * Sets the value of the taxRegion2Name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTaxRegion2Name(final String value) {
        this.taxRegion2Name = value;
    }

    /**
     * Gets the value of the taxAmount2 property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxAmount2() {
        return taxAmount2;
    }

    /**
     * Sets the value of the taxAmount2 property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxAmount2(final Amount value) {
        this.taxAmount2 = value;
    }

    /**
     * Gets the value of the taxCode3 property.
     *
     * @return possible object is {@link ProductTaxationCharacteristicsCode }
     *
     */
    public ProductTaxationCharacteristicsCode getTaxCode3() {
        return taxCode3;
    }

    /**
     * Sets the value of the taxCode3 property.
     *
     * @param value allowed object is {@link ProductTaxationCharacteristicsCode }
     *
     */
    public void setTaxCode3(final ProductTaxationCharacteristicsCode value) {
        this.taxCode3 = value;
    }

    /**
     * Gets the value of the taxCode3Name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTaxCode3Name() {
        return taxCode3Name;
    }

    /**
     * Sets the value of the taxCode3Name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTaxCode3Name(final String value) {
        this.taxCode3Name = value;
    }

    /**
     * Gets the value of the taxRegion3 property.
     *
     * @return possible object is {@link RegionCode }
     *
     */
    public RegionCode getTaxRegion3() {
        return taxRegion3;
    }

    /**
     * Sets the value of the taxRegion3 property.
     *
     * @param value allowed object is {@link RegionCode }
     *
     */
    public void setTaxRegion3(final RegionCode value) {
        this.taxRegion3 = value;
    }

    /**
     * Gets the value of the taxRegion3Name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTaxRegion3Name() {
        return taxRegion3Name;
    }

    /**
     * Sets the value of the taxRegion3Name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTaxRegion3Name(final String value) {
        this.taxRegion3Name = value;
    }

    /**
     * Gets the value of the taxAmount3 property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxAmount3() {
        return taxAmount3;
    }

    /**
     * Sets the value of the taxAmount3 property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxAmount3(final Amount value) {
        this.taxAmount3 = value;
    }

    /**
     * Gets the value of the taxCode4 property.
     *
     * @return possible object is {@link ProductTaxationCharacteristicsCode }
     *
     */
    public ProductTaxationCharacteristicsCode getTaxCode4() {
        return taxCode4;
    }

    /**
     * Sets the value of the taxCode4 property.
     *
     * @param value allowed object is {@link ProductTaxationCharacteristicsCode }
     *
     */
    public void setTaxCode4(final ProductTaxationCharacteristicsCode value) {
        this.taxCode4 = value;
    }

    /**
     * Gets the value of the taxCode4Name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTaxCode4Name() {
        return taxCode4Name;
    }

    /**
     * Sets the value of the taxCode4Name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTaxCode4Name(final String value) {
        this.taxCode4Name = value;
    }

    /**
     * Gets the value of the taxRegion4 property.
     *
     * @return possible object is {@link RegionCode }
     *
     */
    public RegionCode getTaxRegion4() {
        return taxRegion4;
    }

    /**
     * Sets the value of the taxRegion4 property.
     *
     * @param value allowed object is {@link RegionCode }
     *
     */
    public void setTaxRegion4(final RegionCode value) {
        this.taxRegion4 = value;
    }

    /**
     * Gets the value of the taxRegion4Name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTaxRegion4Name() {
        return taxRegion4Name;
    }

    public void setTaxRegion4Name(final String value) {
        this.taxRegion4Name = value;
    }

    public Amount getTaxAmount4() {
        return taxAmount4;
    }

    public void setTaxAmount4(final Amount value) {
        this.taxAmount4 = value;
    }

    public Amount getTaxAmountTotal() {
        return taxAmountTotal;
    }

    public void setTaxAmountTotal(final Amount value) {
        this.taxAmountTotal = value;
    }

    public String getUUIDCFDI() {
        return uuidcfdi;
    }

    public void setUUIDCFDI(final String value) {
        this.uuidcfdi = value;
    }

    public String getExternalReferenceId() {
        return externalReferenceId;
    }

    public void setExternalReferenceId(final String value) {
        this.externalReferenceId = value;
    }

    public ProductTaxStandardClassificationCode getHSNSACCode() {
        return hsnsacCode;
    }

    public void setHSNSACCode(final ProductTaxStandardClassificationCode value) {
        this.hsnsacCode = value;
    }

    public String getHSNSACName() {
        return hsnsacName;
    }

    public void setHSNSACName(final String value) {
        this.hsnsacName = value;
    }

    public InvoiceLegallyAuthorisedLongID getInvoiceLegallyAuthorisedID() {
        return invoiceLegallyAuthorisedID;
    }

    public void setInvoiceLegallyAuthorisedID(final InvoiceLegallyAuthorisedLongID value) {
        this.invoiceLegallyAuthorisedID = value;
    }

    public AccessAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    public void setAttachmentFolder(final AccessAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    public AccessAccountingCodingBlockDistribution getAccountingCodingBlockDistribution() {
        return accountingCodingBlockDistribution;
    }

    public void setAccountingCodingBlockDistribution(final AccessAccountingCodingBlockDistribution value) {
        this.accountingCodingBlockDistribution = value;
    }

}
