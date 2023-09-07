
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ExpenseReportCreateRequestReceipt complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportCreateRequestReceipt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpenseReportExpenseTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportExpenseTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PrivateExpensesReductionAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://sap.com/xi/AP/Common/GDT}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ProductTaxationCharacteristicsCode" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxationCharacteristicsCode" minOccurs="0"/&gt;
 *         &lt;element name="ProductTax" type="{http://sap.com/xi/AP/Common/GDT}FINANCIALACCOUNTING_ProductTax" minOccurs="0"/&gt;
 *         &lt;element name="ProductTaxDeclarationDetails" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxDeclarationDetails" minOccurs="0"/&gt;
 *         &lt;element name="BasePeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="BaseNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="BreakfastMealNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="LunchMealNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="DinnerMealNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationName" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationExpenseReportPerDiemRegionCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportPerDiemRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportStatutoryStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportStatutoryStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportEnterpriseStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportEnterpriseStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportActivityStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportActivityStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="BusinessReasonDescription" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPurposeDescription" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="PaymentFormCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentFormCode" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeBankDetailsKey" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportCreateRequestReceiptEmployeeBankDetailsKey" minOccurs="0"/&gt;
 *         &lt;element name="TripServiceProviderCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}TripServiceProviderCode" minOccurs="0"/&gt;
 *         &lt;element name="TripServiceDocumentID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeEntertainmentParticipantNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerEntertainmentParticipantNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="OtherPersonEntertainmentParticipantNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="CheckedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Note" minOccurs="0"/&gt;
 *         &lt;element name="TaxCode1" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxationCharacteristicsCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegion1" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount1" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxCode2" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxationCharacteristicsCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegion2" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount2" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxCode3" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxationCharacteristicsCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegion3" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount3" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxCode4" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxationCharacteristicsCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegion4" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmount4" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmountTotal" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="UUIDCFDI" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportMXUUID" minOccurs="0"/&gt;
 *         &lt;element name="ExternalReferenceId" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLegallyAuthorisedID" type="{http://sap.com/xi/AP/Globalization/GDT}InvoiceLegallyAuthorisedLongID" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;element name="AccountingCodingBlockDistribution" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}MaintenanceAccountingCodingBlockDistribution" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportCreateRequestReceipt", propOrder = {"expenseReportExpenseTypeCode", "amount",
    "privateExpensesReductionAmount", "paymentAmount", "date", "exchangeRate", "taxAmount",
    "productTaxationCharacteristicsCode", "productTax", "productTaxDeclarationDetails", "basePeriod", "baseNumberValue",
    "breakfastMealNumberValue", "lunchMealNumberValue", "dinnerMealNumberValue", "stayLocationName",
    "stayLocationCountryCode", "stayLocationExpenseReportPerDiemRegionCode", "stayExpenseReportStatutoryStayTypeCode",
    "stayExpenseReportEnterpriseStayTypeCode", "stayExpenseReportActivityStayTypeCode", "description",
    "businessReasonDescription", "businessPurposeDescription", "paymentFormCode", "employeeBankDetailsKey",
    "tripServiceProviderCode", "tripServiceDocumentID", "employeeEntertainmentParticipantNumberValue",
    "businessPartnerEntertainmentParticipantNumberValue", "otherPersonEntertainmentParticipantNumberValue",
    "checkedIndicator", "note", "taxCode1", "taxRegion1", "taxAmount1", "taxCode2", "taxRegion2", "taxAmount2",
    "taxCode3", "taxRegion3", "taxAmount3", "taxCode4", "taxRegion4", "taxAmount4", "taxAmountTotal", "uuidcfdi",
    "externalReferenceId", "invoiceLegallyAuthorisedID", "attachmentFolder", "accountingCodingBlockDistribution"})
public class ExpenseReportCreateRequestReceipt {

    @XmlElement(name = "ExpenseReportExpenseTypeCode")
    private ExpenseReportExpenseTypeCode expenseReportExpenseTypeCode;
    @XmlElement(name = "Amount")
    private Amount amount;
    @XmlElement(name = "PrivateExpensesReductionAmount")
    private Amount privateExpensesReductionAmount;
    @XmlElement(name = "PaymentAmount")
    private Amount paymentAmount;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar date;
    @XmlElement(name = "ExchangeRate")
    private ExchangeRate exchangeRate;
    @XmlElement(name = "TaxAmount")
    private Amount taxAmount;
    @XmlElement(name = "ProductTaxationCharacteristicsCode")
    private ProductTaxationCharacteristicsCode productTaxationCharacteristicsCode;
    @XmlElement(name = "ProductTax")
    private FINANCIALACCOUNTINGProductTax productTax;
    @XmlElement(name = "ProductTaxDeclarationDetails")
    private ProductTaxDeclarationDetails productTaxDeclarationDetails;
    @XmlElement(name = "BasePeriod")
    private CLOSEDDatePeriod basePeriod;
    @XmlElement(name = "BaseNumberValue")
    private Integer baseNumberValue;
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
    @XmlElement(name = "StayLocationExpenseReportPerDiemRegionCode")
    private ExpenseReportPerDiemRegionCode stayLocationExpenseReportPerDiemRegionCode;
    @XmlElement(name = "StayExpenseReportStatutoryStayTypeCode")
    private ExpenseReportStatutoryStayTypeCode stayExpenseReportStatutoryStayTypeCode;
    @XmlElement(name = "StayExpenseReportEnterpriseStayTypeCode")
    private ExpenseReportEnterpriseStayTypeCode stayExpenseReportEnterpriseStayTypeCode;
    @XmlElement(name = "StayExpenseReportActivityStayTypeCode")
    private ExpenseReportActivityStayTypeCode stayExpenseReportActivityStayTypeCode;
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
    @XmlElement(name = "EmployeeBankDetailsKey")
    private ExpenseReportCreateRequestReceiptEmployeeBankDetailsKey employeeBankDetailsKey;
    @XmlElement(name = "TripServiceProviderCode")
    private TripServiceProviderCode tripServiceProviderCode;
    @XmlElement(name = "TripServiceDocumentID")
    private BusinessTransactionDocumentID tripServiceDocumentID;
    @XmlElement(name = "EmployeeEntertainmentParticipantNumberValue")
    private Integer employeeEntertainmentParticipantNumberValue;
    @XmlElement(name = "BusinessPartnerEntertainmentParticipantNumberValue")
    private Integer businessPartnerEntertainmentParticipantNumberValue;
    @XmlElement(name = "OtherPersonEntertainmentParticipantNumberValue")
    private Integer otherPersonEntertainmentParticipantNumberValue;
    @XmlElement(name = "CheckedIndicator")
    private Boolean checkedIndicator;
    @XmlElement(name = "Note")
    private String note;
    @XmlElement(name = "TaxCode1")
    private ProductTaxationCharacteristicsCode taxCode1;
    @XmlElement(name = "TaxRegion1")
    private RegionCode taxRegion1;
    @XmlElement(name = "TaxAmount1")
    private Amount taxAmount1;
    @XmlElement(name = "TaxCode2")
    private ProductTaxationCharacteristicsCode taxCode2;
    @XmlElement(name = "TaxRegion2")
    private RegionCode taxRegion2;
    @XmlElement(name = "TaxAmount2")
    private Amount taxAmount2;
    @XmlElement(name = "TaxCode3")
    private ProductTaxationCharacteristicsCode taxCode3;
    @XmlElement(name = "TaxRegion3")
    private RegionCode taxRegion3;
    @XmlElement(name = "TaxAmount3")
    private Amount taxAmount3;
    @XmlElement(name = "TaxCode4")
    private ProductTaxationCharacteristicsCode taxCode4;
    @XmlElement(name = "TaxRegion4")
    private RegionCode taxRegion4;
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
    @XmlElement(name = "InvoiceLegallyAuthorisedID")
    private InvoiceLegallyAuthorisedLongID invoiceLegallyAuthorisedID;
    @XmlElement(name = "AttachmentFolder")
    private MaintenanceAttachmentFolder attachmentFolder;
    @XmlElement(name = "AccountingCodingBlockDistribution")
    private MaintenanceAccountingCodingBlockDistribution accountingCodingBlockDistribution;

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
     * Gets the value of the employeeBankDetailsKey property.
     *
     * @return possible object is
     *         {@link ExpenseReportCreateRequestReceiptEmployeeBankDetailsKey }
     *
     */
    public ExpenseReportCreateRequestReceiptEmployeeBankDetailsKey getEmployeeBankDetailsKey() {
        return employeeBankDetailsKey;
    }

    /**
     * Sets the value of the employeeBankDetailsKey property.
     *
     * @param value allowed object is
     *              {@link ExpenseReportCreateRequestReceiptEmployeeBankDetailsKey }
     *
     */
    public void setEmployeeBankDetailsKey(final ExpenseReportCreateRequestReceiptEmployeeBankDetailsKey value) {
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
     * Gets the value of the taxAmount4 property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxAmount4() {
        return taxAmount4;
    }

    /**
     * Sets the value of the taxAmount4 property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxAmount4(final Amount value) {
        this.taxAmount4 = value;
    }

    /**
     * Gets the value of the taxAmountTotal property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxAmountTotal() {
        return taxAmountTotal;
    }

    /**
     * Sets the value of the taxAmountTotal property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxAmountTotal(final Amount value) {
        this.taxAmountTotal = value;
    }

    /**
     * Gets the value of the uuidcfdi property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUUIDCFDI() {
        return uuidcfdi;
    }

    /**
     * Sets the value of the uuidcfdi property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUUIDCFDI(final String value) {
        this.uuidcfdi = value;
    }

    /**
     * Gets the value of the externalReferenceId property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExternalReferenceId() {
        return externalReferenceId;
    }

    /**
     * Sets the value of the externalReferenceId property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setExternalReferenceId(final String value) {
        this.externalReferenceId = value;
    }

    /**
     * Gets the value of the invoiceLegallyAuthorisedID property.
     *
     * @return possible object is {@link InvoiceLegallyAuthorisedLongID }
     *
     */
    public InvoiceLegallyAuthorisedLongID getInvoiceLegallyAuthorisedID() {
        return invoiceLegallyAuthorisedID;
    }

    /**
     * Sets the value of the invoiceLegallyAuthorisedID property.
     *
     * @param value allowed object is {@link InvoiceLegallyAuthorisedLongID }
     *
     */
    public void setInvoiceLegallyAuthorisedID(final InvoiceLegallyAuthorisedLongID value) {
        this.invoiceLegallyAuthorisedID = value;
    }

    /**
     * Gets the value of the attachmentFolder property.
     *
     * @return possible object is {@link MaintenanceAttachmentFolder }
     *
     */
    public MaintenanceAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    /**
     * Sets the value of the attachmentFolder property.
     *
     * @param value allowed object is {@link MaintenanceAttachmentFolder }
     *
     */
    public void setAttachmentFolder(final MaintenanceAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    /**
     * Gets the value of the accountingCodingBlockDistribution property.
     *
     * @return possible object is
     *         {@link MaintenanceAccountingCodingBlockDistribution }
     *
     */
    public MaintenanceAccountingCodingBlockDistribution getAccountingCodingBlockDistribution() {
        return accountingCodingBlockDistribution;
    }

    /**
     * Sets the value of the accountingCodingBlockDistribution property.
     *
     * @param value allowed object is
     *              {@link MaintenanceAccountingCodingBlockDistribution }
     *
     */
    public void setAccountingCodingBlockDistribution(final MaintenanceAccountingCodingBlockDistribution value) {
        this.accountingCodingBlockDistribution = value;
    }

}
