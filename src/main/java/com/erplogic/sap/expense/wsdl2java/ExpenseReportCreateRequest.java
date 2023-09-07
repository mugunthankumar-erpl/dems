
package com.erplogic.sap.expense.wsdl2java;

import java.util.ArrayList;
import java.util.List;

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
 * Java class for ExpenseReportCreateRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportCreateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmployeeID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{http://sap.com/xi/AP/Common/GDT}UPPEROPEN_LOCAL_DateTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="DepartureExpenseReportLocationCategoryCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportLocationCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="ReturnExpenseReportLocationCategoryCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportLocationCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="StayDescription" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationName" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationExpenseReportPerDiemRegionCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportPerDiemRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportStatutoryStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportStatutoryStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportEnterpriseStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportEnterpriseStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportActivityStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportActivityStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="MealsPerDiemFlatRateReimbursementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationPerDiemFlatRateReimbursementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="OvernightNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="TotalMileageUnitTotalQuantity" type="{http://sap.com/xi/AP/Common/GDT}INTEGER_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="MileageReimbursementVehicleTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MileageReimbursementVehicleTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="MileageReimbursementVehicleClassCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MileageReimbursementVehicleClassCode" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Note" minOccurs="0"/&gt;
 *         &lt;element name="PaymentFormCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentFormCode" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeBankDetailsKey" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportCreateRequestEmployeeBankDetailsKey" minOccurs="0"/&gt;
 *         &lt;element name="AccountingBusinessTransactionDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="AdvancesAllowedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="MunicipalityCode" type="{http://sap.com/xi/AP/Globalization/HCM/Common/AT/Global}MunicipalityCode" minOccurs="0"/&gt;
 *         &lt;element name="ManualTaxationIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRateDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="Advance" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportCreateRequestAdvance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Reimbursement" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportCreateRequestReimbursement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TextCollection" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceTextCollection" minOccurs="0"/&gt;
 *         &lt;element name="Receipt" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportCreateRequestReceipt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Mileage" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportCreateRequestMileage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItinerarySegment" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportCreateRequestItinerarySegment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccountingCodingBlockDistribution" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}MaintenanceAccountingCodingBlockDistribution" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolder" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportCreateRequest", propOrder = {"employeeID", "typeCode", "period",
    "departureExpenseReportLocationCategoryCode", "returnExpenseReportLocationCategoryCode", "description",
    "stayDescription", "stayLocationName", "stayLocationCountryCode", "stayLocationExpenseReportPerDiemRegionCode",
    "stayExpenseReportStatutoryStayTypeCode", "stayExpenseReportEnterpriseStayTypeCode",
    "stayExpenseReportActivityStayTypeCode", "mealsPerDiemFlatRateReimbursementIndicator",
    "accommodationPerDiemFlatRateReimbursementIndicator", "overnightNumberValue", "totalMileageUnitTotalQuantity",
    "mileageReimbursementVehicleTypeCode", "mileageReimbursementVehicleClassCode", "note", "paymentFormCode",
    "employeeBankDetailsKey", "accountingBusinessTransactionDate", "advancesAllowedIndicator", "municipalityCode",
    "manualTaxationIndicator", "exchangeRateDate", "advance", "reimbursement", "textCollection", "receipt", "mileage",
    "itinerarySegment", "accountingCodingBlockDistribution", "attachmentFolder"})
public class ExpenseReportCreateRequest {

    @XmlElement(name = "EmployeeID")
    private EmployeeID employeeID;
    @XmlElement(name = "TypeCode")
    private ExpenseReportTypeCode typeCode;
    @XmlElement(name = "Period")
    private UPPEROPENLOCALDateTimePeriod period;
    @XmlElement(name = "DepartureExpenseReportLocationCategoryCode")
    private ExpenseReportLocationCategoryCode departureExpenseReportLocationCategoryCode;
    @XmlElement(name = "ReturnExpenseReportLocationCategoryCode")
    private ExpenseReportLocationCategoryCode returnExpenseReportLocationCategoryCode;
    @XmlElement(name = "Description")
    private String description;
    @XmlElement(name = "StayDescription")
    private String stayDescription;
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
    @XmlElement(name = "MealsPerDiemFlatRateReimbursementIndicator")
    private Boolean mealsPerDiemFlatRateReimbursementIndicator;
    @XmlElement(name = "AccommodationPerDiemFlatRateReimbursementIndicator")
    private Boolean accommodationPerDiemFlatRateReimbursementIndicator;
    @XmlElement(name = "OvernightNumberValue")
    private Integer overnightNumberValue;
    @XmlElement(name = "TotalMileageUnitTotalQuantity")
    private INTEGERQuantity totalMileageUnitTotalQuantity;
    @XmlElement(name = "MileageReimbursementVehicleTypeCode")
    private MileageReimbursementVehicleTypeCode mileageReimbursementVehicleTypeCode;
    @XmlElement(name = "MileageReimbursementVehicleClassCode")
    private MileageReimbursementVehicleClassCode mileageReimbursementVehicleClassCode;
    @XmlElement(name = "Note")
    private String note;
    @XmlElement(name = "PaymentFormCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String paymentFormCode;
    @XmlElement(name = "EmployeeBankDetailsKey")
    private ExpenseReportCreateRequestEmployeeBankDetailsKey employeeBankDetailsKey;
    @XmlElement(name = "AccountingBusinessTransactionDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar accountingBusinessTransactionDate;
    @XmlElement(name = "AdvancesAllowedIndicator")
    private Boolean advancesAllowedIndicator;
    @XmlElement(name = "MunicipalityCode")
    private MunicipalityCode municipalityCode;
    @XmlElement(name = "ManualTaxationIndicator")
    private Boolean manualTaxationIndicator;
    @XmlElement(name = "ExchangeRateDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar exchangeRateDate;
    @XmlElement(name = "Advance")
    private List<ExpenseReportCreateRequestAdvance> advance;
    @XmlElement(name = "Reimbursement")
    private List<ExpenseReportCreateRequestReimbursement> reimbursement;
    @XmlElement(name = "TextCollection")
    private MaintenanceTextCollection textCollection;
    @XmlElement(name = "Receipt")
    private List<ExpenseReportCreateRequestReceipt> receipt;
    @XmlElement(name = "Mileage")
    private List<ExpenseReportCreateRequestMileage> mileage;
    @XmlElement(name = "ItinerarySegment")
    private List<ExpenseReportCreateRequestItinerarySegment> itinerarySegment;
    @XmlElement(name = "AccountingCodingBlockDistribution")
    private MaintenanceAccountingCodingBlockDistribution accountingCodingBlockDistribution;
    @XmlElement(name = "AttachmentFolder")
    private MaintenanceAttachmentFolder attachmentFolder;

    /**
     * Gets the value of the employeeID property.
     *
     * @return possible object is {@link EmployeeID }
     *
     */
    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     *
     * @param value allowed object is {@link EmployeeID }
     *
     */
    public void setEmployeeID(final EmployeeID value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the typeCode property.
     *
     * @return possible object is {@link ExpenseReportTypeCode }
     *
     */
    public ExpenseReportTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     *
     * @param value allowed object is {@link ExpenseReportTypeCode }
     *
     */
    public void setTypeCode(final ExpenseReportTypeCode value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the period property.
     *
     * @return possible object is {@link UPPEROPENLOCALDateTimePeriod }
     *
     */
    public UPPEROPENLOCALDateTimePeriod getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     *
     * @param value allowed object is {@link UPPEROPENLOCALDateTimePeriod }
     *
     */
    public void setPeriod(final UPPEROPENLOCALDateTimePeriod value) {
        this.period = value;
    }

    /**
     * Gets the value of the departureExpenseReportLocationCategoryCode property.
     *
     * @return possible object is {@link ExpenseReportLocationCategoryCode }
     *
     */
    public ExpenseReportLocationCategoryCode getDepartureExpenseReportLocationCategoryCode() {
        return departureExpenseReportLocationCategoryCode;
    }

    /**
     * Sets the value of the departureExpenseReportLocationCategoryCode property.
     *
     * @param value allowed object is {@link ExpenseReportLocationCategoryCode }
     *
     */
    public void setDepartureExpenseReportLocationCategoryCode(final ExpenseReportLocationCategoryCode value) {
        this.departureExpenseReportLocationCategoryCode = value;
    }

    /**
     * Gets the value of the returnExpenseReportLocationCategoryCode property.
     *
     * @return possible object is {@link ExpenseReportLocationCategoryCode }
     *
     */
    public ExpenseReportLocationCategoryCode getReturnExpenseReportLocationCategoryCode() {
        return returnExpenseReportLocationCategoryCode;
    }

    /**
     * Sets the value of the returnExpenseReportLocationCategoryCode property.
     *
     * @param value allowed object is {@link ExpenseReportLocationCategoryCode }
     *
     */
    public void setReturnExpenseReportLocationCategoryCode(final ExpenseReportLocationCategoryCode value) {
        this.returnExpenseReportLocationCategoryCode = value;
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
     * Gets the value of the stayDescription property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayDescription() {
        return stayDescription;
    }

    /**
     * Sets the value of the stayDescription property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayDescription(final String value) {
        this.stayDescription = value;
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
     * Gets the value of the mealsPerDiemFlatRateReimbursementIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isMealsPerDiemFlatRateReimbursementIndicator() {
        return mealsPerDiemFlatRateReimbursementIndicator;
    }

    /**
     * Sets the value of the mealsPerDiemFlatRateReimbursementIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setMealsPerDiemFlatRateReimbursementIndicator(final Boolean value) {
        this.mealsPerDiemFlatRateReimbursementIndicator = value;
    }

    /**
     * Gets the value of the accommodationPerDiemFlatRateReimbursementIndicator
     * property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isAccommodationPerDiemFlatRateReimbursementIndicator() {
        return accommodationPerDiemFlatRateReimbursementIndicator;
    }

    /**
     * Sets the value of the accommodationPerDiemFlatRateReimbursementIndicator
     * property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setAccommodationPerDiemFlatRateReimbursementIndicator(final Boolean value) {
        this.accommodationPerDiemFlatRateReimbursementIndicator = value;
    }

    /**
     * Gets the value of the overnightNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getOvernightNumberValue() {
        return overnightNumberValue;
    }

    /**
     * Sets the value of the overnightNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setOvernightNumberValue(final Integer value) {
        this.overnightNumberValue = value;
    }

    /**
     * Gets the value of the totalMileageUnitTotalQuantity property.
     *
     * @return possible object is {@link INTEGERQuantity }
     *
     */
    public INTEGERQuantity getTotalMileageUnitTotalQuantity() {
        return totalMileageUnitTotalQuantity;
    }

    /**
     * Sets the value of the totalMileageUnitTotalQuantity property.
     *
     * @param value allowed object is {@link INTEGERQuantity }
     *
     */
    public void setTotalMileageUnitTotalQuantity(final INTEGERQuantity value) {
        this.totalMileageUnitTotalQuantity = value;
    }

    /**
     * Gets the value of the mileageReimbursementVehicleTypeCode property.
     *
     * @return possible object is {@link MileageReimbursementVehicleTypeCode }
     *
     */
    public MileageReimbursementVehicleTypeCode getMileageReimbursementVehicleTypeCode() {
        return mileageReimbursementVehicleTypeCode;
    }

    /**
     * Sets the value of the mileageReimbursementVehicleTypeCode property.
     *
     * @param value allowed object is {@link MileageReimbursementVehicleTypeCode }
     *
     */
    public void setMileageReimbursementVehicleTypeCode(final MileageReimbursementVehicleTypeCode value) {
        this.mileageReimbursementVehicleTypeCode = value;
    }

    /**
     * Gets the value of the mileageReimbursementVehicleClassCode property.
     *
     * @return possible object is {@link MileageReimbursementVehicleClassCode }
     *
     */
    public MileageReimbursementVehicleClassCode getMileageReimbursementVehicleClassCode() {
        return mileageReimbursementVehicleClassCode;
    }

    /**
     * Sets the value of the mileageReimbursementVehicleClassCode property.
     *
     * @param value allowed object is {@link MileageReimbursementVehicleClassCode }
     *
     */
    public void setMileageReimbursementVehicleClassCode(final MileageReimbursementVehicleClassCode value) {
        this.mileageReimbursementVehicleClassCode = value;
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
     *         {@link ExpenseReportCreateRequestEmployeeBankDetailsKey }
     *
     */
    public ExpenseReportCreateRequestEmployeeBankDetailsKey getEmployeeBankDetailsKey() {
        return employeeBankDetailsKey;
    }

    /**
     * Sets the value of the employeeBankDetailsKey property.
     *
     * @param value allowed object is
     *              {@link ExpenseReportCreateRequestEmployeeBankDetailsKey }
     *
     */
    public void setEmployeeBankDetailsKey(final ExpenseReportCreateRequestEmployeeBankDetailsKey value) {
        this.employeeBankDetailsKey = value;
    }

    /**
     * Gets the value of the accountingBusinessTransactionDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getAccountingBusinessTransactionDate() {
        return accountingBusinessTransactionDate;
    }

    /**
     * Sets the value of the accountingBusinessTransactionDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setAccountingBusinessTransactionDate(final XMLGregorianCalendar value) {
        this.accountingBusinessTransactionDate = value;
    }

    /**
     * Gets the value of the advancesAllowedIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isAdvancesAllowedIndicator() {
        return advancesAllowedIndicator;
    }

    /**
     * Sets the value of the advancesAllowedIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setAdvancesAllowedIndicator(final Boolean value) {
        this.advancesAllowedIndicator = value;
    }

    /**
     * Gets the value of the municipalityCode property.
     *
     * @return possible object is {@link MunicipalityCode }
     *
     */
    public MunicipalityCode getMunicipalityCode() {
        return municipalityCode;
    }

    /**
     * Sets the value of the municipalityCode property.
     *
     * @param value allowed object is {@link MunicipalityCode }
     *
     */
    public void setMunicipalityCode(final MunicipalityCode value) {
        this.municipalityCode = value;
    }

    /**
     * Gets the value of the manualTaxationIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isManualTaxationIndicator() {
        return manualTaxationIndicator;
    }

    /**
     * Sets the value of the manualTaxationIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setManualTaxationIndicator(final Boolean value) {
        this.manualTaxationIndicator = value;
    }

    /**
     * Gets the value of the exchangeRateDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExchangeRateDate() {
        return exchangeRateDate;
    }

    /**
     * Sets the value of the exchangeRateDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setExchangeRateDate(final XMLGregorianCalendar value) {
        this.exchangeRateDate = value;
    }

    /**
     * Gets the value of the advance property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the advance property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAdvance().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportCreateRequestAdvance }
     *
     *
     */
    public List<ExpenseReportCreateRequestAdvance> getAdvance() {
        if (advance == null) {
            advance = new ArrayList<ExpenseReportCreateRequestAdvance>();
        }
        return this.advance;
    }

    /**
     * Gets the value of the reimbursement property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the reimbursement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getReimbursement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportCreateRequestReimbursement }
     *
     *
     */
    public List<ExpenseReportCreateRequestReimbursement> getReimbursement() {
        if (reimbursement == null) {
            reimbursement = new ArrayList<ExpenseReportCreateRequestReimbursement>();
        }
        return this.reimbursement;
    }

    /**
     * Gets the value of the textCollection property.
     *
     * @return possible object is {@link MaintenanceTextCollection }
     *
     */
    public MaintenanceTextCollection getTextCollection() {
        return textCollection;
    }

    /**
     * Sets the value of the textCollection property.
     *
     * @param value allowed object is {@link MaintenanceTextCollection }
     *
     */
    public void setTextCollection(final MaintenanceTextCollection value) {
        this.textCollection = value;
    }

    /**
     * Gets the value of the receipt property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the receipt property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getReceipt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportCreateRequestReceipt }
     *
     *
     */
    public List<ExpenseReportCreateRequestReceipt> getReceipt() {
        if (receipt == null) {
            receipt = new ArrayList<ExpenseReportCreateRequestReceipt>();
        }
        return this.receipt;
    }

    /**
     * Gets the value of the mileage property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the mileage property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getMileage().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportCreateRequestMileage }
     *
     *
     */
    public List<ExpenseReportCreateRequestMileage> getMileage() {
        if (mileage == null) {
            mileage = new ArrayList<ExpenseReportCreateRequestMileage>();
        }
        return this.mileage;
    }

    /**
     * Gets the value of the itinerarySegment property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the itinerarySegment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getItinerarySegment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportCreateRequestItinerarySegment }
     *
     *
     */
    public List<ExpenseReportCreateRequestItinerarySegment> getItinerarySegment() {
        if (itinerarySegment == null) {
            itinerarySegment = new ArrayList<ExpenseReportCreateRequestItinerarySegment>();
        }
        return this.itinerarySegment;
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

}
