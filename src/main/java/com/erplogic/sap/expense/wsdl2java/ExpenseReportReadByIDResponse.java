
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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponse", propOrder = {"uuid", "employeeUUID", "expenseArrangementUUID", "id",
    "employeeID", "expenseArrangementID", "typeCode", "typeName", "period",
    "departureExpenseReportLocationCategoryCode", "departureExpenseReportLocationCategoryName",
    "returnExpenseReportLocationCategoryCode", "returnExpenseReportLocationCategoryName", "description",
    "stayDescription", "stayLocationName", "stayLocationCountryCode", "stayLocationCountryName",
    "stayLocationExpenseReportPerDiemRegionCode", "stayLocationExpenseReportPerDiemRegionName",
    "stayExpenseReportStatutoryStayTypeCode", "stayExpenseReportStatutoryStayTypeName",
    "stayExpenseReportEnterpriseStayTypeCode", "stayExpenseReportEnterpriseStayTypeName",
    "stayExpenseReportActivityStayTypeCode", "stayExpenseReportActivityStayTypeName",
    "mealsPerDiemFlatRateReimbursementIndicator", "accommodationPerDiemFlatRateReimbursementIndicator",
    "overnightNumberValue", "maximumOvernightNumberValue", "totalMileageUnitTotalQuantity",
    "mileageReimbursementVehicleTypeCode", "mileageReimbursementVehicleTypeName",
    "mileageReimbursementVehicleClassCode", "mileageReimbursementVehicleClassName", "note", "paymentFormCode",
    "paymentFormName", "paymentCurrencyCode", "paymentCurrencyName", "homeCountryCode", "homeCountryName",
    "provisionVariantCode", "provisionVariantName", "categoryCode", "categoryName", "auditorUUID", "approverUUID",
    "forwardedApproverUUID", "approverPartyRoleCategoryCode", "approverPartyRoleCategoryName",
    "approverManagingEmployeeUUID", "approvingReportingLineUnitUUID",
    "expenseAndReimbursementManagementFunctionalUnitUUID",
    "managingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitUUID", "employeeBankDetailsKey",
    "accountingBusinessTransactionDate", "deductMealsAllowedIndicator", "deductLodgingAllowedIndicator",
    "paymentCompletedIndicator", "paperReceiptsRequiredCode", "paperReceiptsRequiredName",
    "paperReceiptsReceivedIndicator", "systemAdministrativeData", "status", "reimbursementStatusCode",
    "reimbursementStatusName", "openReimbursementAmount", "advancesAllowedIndicator", "addressSnapshotUUID",
    "integrationTypeCode", "integrationTypeName", "lastSubmissionDate", "municipalityCode", "municipalityName",
    "manualTaxationIndicator", "exchangeRateDate", "paymentHistoryDetails", "paymentHistory", "advance",
    "addressSnapshotMainStayLocationAddress", "textCollection", "settlementResultTotals",
    "settlementResultPostingTransaction", "reportingLineUnit", "receipt", "perDiemDeduction",
    "managingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit", "mileage", "lastChangeIdentity",
    "itinerarySegment", "history", "functionalUnit", "expenseArrangement", "employee", "creationIdentity",
    "accountingCodingBlockDistribution", "auditor", "attachmentFolder", "managingEmployeeOfApproverEmployee",
    "approver", "additionalCompany", "costAssignmentView"})
public class ExpenseReportReadByIDResponse {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "EmployeeUUID")
    private UUID employeeUUID;
    @XmlElement(name = "ExpenseArrangementUUID")
    private UUID expenseArrangementUUID;
    @XmlElement(name = "ID")
    private ExpenseReportID id;
    @XmlElement(name = "EmployeeID")
    private EmployeeID employeeID;
    @XmlElement(name = "ExpenseArrangementID")
    private ExpenseArrangementID expenseArrangementID;
    @XmlElement(name = "TypeCode")
    private ExpenseReportTypeCode typeCode;
    @XmlElement(name = "TypeName")
    private String typeName;
    @XmlElement(name = "Period")
    private UPPEROPENLOCALDateTimePeriod period;
    @XmlElement(name = "DepartureExpenseReportLocationCategoryCode")
    private ExpenseReportLocationCategoryCode departureExpenseReportLocationCategoryCode;
    @XmlElement(name = "DepartureExpenseReportLocationCategoryName")
    private String departureExpenseReportLocationCategoryName;
    @XmlElement(name = "ReturnExpenseReportLocationCategoryCode")
    private ExpenseReportLocationCategoryCode returnExpenseReportLocationCategoryCode;
    @XmlElement(name = "ReturnExpenseReportLocationCategoryName")
    private String returnExpenseReportLocationCategoryName;
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
    @XmlElement(name = "MealsPerDiemFlatRateReimbursementIndicator")
    private Boolean mealsPerDiemFlatRateReimbursementIndicator;
    @XmlElement(name = "AccommodationPerDiemFlatRateReimbursementIndicator")
    private Boolean accommodationPerDiemFlatRateReimbursementIndicator;
    @XmlElement(name = "OvernightNumberValue")
    private Integer overnightNumberValue;
    @XmlElement(name = "MaximumOvernightNumberValue")
    private Integer maximumOvernightNumberValue;
    @XmlElement(name = "TotalMileageUnitTotalQuantity")
    private INTEGERQuantity totalMileageUnitTotalQuantity;
    @XmlElement(name = "MileageReimbursementVehicleTypeCode")
    private MileageReimbursementVehicleTypeCode mileageReimbursementVehicleTypeCode;
    @XmlElement(name = "MileageReimbursementVehicleTypeName")
    private String mileageReimbursementVehicleTypeName;
    @XmlElement(name = "MileageReimbursementVehicleClassCode")
    private MileageReimbursementVehicleClassCode mileageReimbursementVehicleClassCode;
    @XmlElement(name = "MileageReimbursementVehicleClassName")
    private String mileageReimbursementVehicleClassName;
    @XmlElement(name = "Note")
    private String note;
    @XmlElement(name = "PaymentFormCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String paymentFormCode;
    @XmlElement(name = "PaymentFormName")
    private String paymentFormName;
    @XmlElement(name = "PaymentCurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String paymentCurrencyCode;
    @XmlElement(name = "PaymentCurrencyName")
    private String paymentCurrencyName;
    @XmlElement(name = "HomeCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String homeCountryCode;
    @XmlElement(name = "HomeCountryName")
    private String homeCountryName;
    @XmlElement(name = "ProvisionVariantCode")
    private ExpenseReportProvisionVariantCode provisionVariantCode;
    @XmlElement(name = "ProvisionVariantName")
    private String provisionVariantName;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String categoryCode;
    @XmlElement(name = "CategoryName")
    private String categoryName;
    @XmlElement(name = "AuditorUUID")
    private UUID auditorUUID;
    @XmlElement(name = "ApproverUUID")
    private UUID approverUUID;
    @XmlElement(name = "ForwardedApproverUUID")
    private UUID forwardedApproverUUID;
    @XmlElement(name = "ApproverPartyRoleCategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String approverPartyRoleCategoryCode;
    @XmlElement(name = "ApproverPartyRoleCategoryName")
    private String approverPartyRoleCategoryName;
    @XmlElement(name = "ApproverManagingEmployeeUUID")
    private UUID approverManagingEmployeeUUID;
    @XmlElement(name = "ApprovingReportingLineUnitUUID")
    private UUID approvingReportingLineUnitUUID;
    @XmlElement(name = "ExpenseAndReimbursementManagementFunctionalUnitUUID")
    private UUID expenseAndReimbursementManagementFunctionalUnitUUID;
    @XmlElement(name = "ManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitUUID")
    private UUID managingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitUUID;
    @XmlElement(name = "EmployeeBankDetailsKey")
    private ExpenseReportReadByIDResponseEmployeeBankDetailsKey employeeBankDetailsKey;
    @XmlElement(name = "AccountingBusinessTransactionDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar accountingBusinessTransactionDate;
    @XmlElement(name = "DeductMealsAllowedIndicator")
    private Boolean deductMealsAllowedIndicator;
    @XmlElement(name = "DeductLodgingAllowedIndicator")
    private Boolean deductLodgingAllowedIndicator;
    @XmlElement(name = "PaymentCompletedIndicator")
    private Boolean paymentCompletedIndicator;
    @XmlElement(name = "PaperReceiptsRequiredCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String paperReceiptsRequiredCode;
    @XmlElement(name = "PaperReceiptsRequiredName")
    private String paperReceiptsRequiredName;
    @XmlElement(name = "PaperReceiptsReceivedIndicator")
    private Boolean paperReceiptsReceivedIndicator;
    @XmlElement(name = "SystemAdministrativeData")
    private SystemAdministrativeData systemAdministrativeData;
    @XmlElement(name = "Status")
    private ExpenseReportReadByIDResponseStatus status;
    @XmlElement(name = "ReimbursementStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String reimbursementStatusCode;
    @XmlElement(name = "ReimbursementStatusName")
    private String reimbursementStatusName;
    @XmlElement(name = "OpenReimbursementAmount")
    private Amount openReimbursementAmount;
    @XmlElement(name = "AdvancesAllowedIndicator")
    private Boolean advancesAllowedIndicator;
    @XmlElement(name = "AddressSnapshotUUID")
    private UUID addressSnapshotUUID;
    @XmlElement(name = "IntegrationTypeCode")
    private IntegrationTypeCode integrationTypeCode;
    @XmlElement(name = "IntegrationTypeName")
    private String integrationTypeName;
    @XmlElement(name = "LastSubmissionDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar lastSubmissionDate;
    @XmlElement(name = "MunicipalityCode")
    private MunicipalityCode municipalityCode;
    @XmlElement(name = "MunicipalityName")
    private String municipalityName;
    @XmlElement(name = "ManualTaxationIndicator")
    private Boolean manualTaxationIndicator;
    @XmlElement(name = "ExchangeRateDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar exchangeRateDate;
    @XmlElement(name = "PaymentHistoryDetails")
    private List<ExpenseReportReadByIDResponsePaymentHistoryDetails> paymentHistoryDetails;
    @XmlElement(name = "PaymentHistory")
    private List<ExpenseReportReadByIDResponsePaymentHistory> paymentHistory;
    @XmlElement(name = "Advance")
    private List<ExpenseReportReadByIDResponseAdvance> advance;
    @XmlElement(name = "AddressSnapshotMainStayLocationAddress")
    private ExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress addressSnapshotMainStayLocationAddress;
    @XmlElement(name = "TextCollection")
    private AccessTextCollection textCollection;
    @XmlElement(name = "SettlementResultTotals", required = true)
    private List<ExpenseReportReadByIDResponseSettlementResultTotals> settlementResultTotals;
    @XmlElement(name = "SettlementResultPostingTransaction", required = true)
    private List<ExpenseReportReadByIDResponseSettlementResultPostingTransaction> settlementResultPostingTransaction;
    @XmlElement(name = "ReportingLineUnit")
    private ExpenseReportReadByIDResponseReportingLineUnit reportingLineUnit;
    @XmlElement(name = "Receipt")
    private List<ExpenseReportReadByIDResponseReceipt> receipt;
    @XmlElement(name = "PerDiemDeduction")
    private List<ExpenseReportReadByIDResponsePerDiemDeduction> perDiemDeduction;
    @XmlElement(name = "ManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit")
    private ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit managingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit;
    @XmlElement(name = "Mileage")
    private List<ExpenseReportReadByIDResponseMileage> mileage;
    @XmlElement(name = "LastChangeIdentity", required = true)
    private ExpenseReportReadByIDResponseLastChangeIdentity lastChangeIdentity;
    @XmlElement(name = "ItinerarySegment")
    private List<ExpenseReportReadByIDResponseItinerarySegment> itinerarySegment;
    @XmlElement(name = "History", required = true)
    private List<ExpenseReportReadByIDResponseHistory> history;
    @XmlElement(name = "FunctionalUnit")
    private ExpenseReportReadByIDResponseFunctionalUnit functionalUnit;
    @XmlElement(name = "ExpenseArrangement", required = true)
    private ExpenseReportReadByIDResponseExpenseArrangement expenseArrangement;
    @XmlElement(name = "Employee", required = true)
    private ExpenseReportReadByIDResponseEmployee employee;
    @XmlElement(name = "CreationIdentity", required = true)
    private ExpenseReportReadByIDResponseCreationIdentity creationIdentity;
    @XmlElement(name = "AccountingCodingBlockDistribution")
    private AccessAccountingCodingBlockDistribution accountingCodingBlockDistribution;
    @XmlElement(name = "Auditor")
    private ExpenseReportReadByIDResponseAuditor auditor;
    @XmlElement(name = "AttachmentFolder")
    private AccessAttachmentFolder attachmentFolder;
    @XmlElement(name = "ManagingEmployeeOfApproverEmployee")
    private ExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployee managingEmployeeOfApproverEmployee;
    @XmlElement(name = "Approver")
    private ExpenseReportReadByIDResponseApprover approver;
    @XmlElement(name = "AdditionalCompany")
    private List<ExpenseReportReadByIDResponseAdditionalCompany> additionalCompany;
    @XmlElement(name = "CostAssignmentView")
    private List<ExpenseReportReadByIDResponseCostAssignmentView> costAssignmentView;

    public UUID getUUID() {
        return uuid;
    }

    public void setUUID(final UUID value) {
        this.uuid = value;
    }

    public UUID getEmployeeUUID() {
        return employeeUUID;
    }

    public void setEmployeeUUID(final UUID value) {
        this.employeeUUID = value;
    }

    /**
     * Gets the value of the expenseArrangementUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getExpenseArrangementUUID() {
        return expenseArrangementUUID;
    }

    /**
     * Sets the value of the expenseArrangementUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setExpenseArrangementUUID(final UUID value) {
        this.expenseArrangementUUID = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link ExpenseReportID }
     *
     */
    public ExpenseReportID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link ExpenseReportID }
     *
     */
    public void setID(final ExpenseReportID value) {
        this.id = value;
    }

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
     * Gets the value of the expenseArrangementID property.
     *
     * @return possible object is {@link ExpenseArrangementID }
     *
     */
    public ExpenseArrangementID getExpenseArrangementID() {
        return expenseArrangementID;
    }

    /**
     * Sets the value of the expenseArrangementID property.
     *
     * @param value allowed object is {@link ExpenseArrangementID }
     *
     */
    public void setExpenseArrangementID(final ExpenseArrangementID value) {
        this.expenseArrangementID = value;
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
     * Gets the value of the typeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTypeName(final String value) {
        this.typeName = value;
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
     * Gets the value of the departureExpenseReportLocationCategoryName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDepartureExpenseReportLocationCategoryName() {
        return departureExpenseReportLocationCategoryName;
    }

    /**
     * Sets the value of the departureExpenseReportLocationCategoryName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDepartureExpenseReportLocationCategoryName(final String value) {
        this.departureExpenseReportLocationCategoryName = value;
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
     * Gets the value of the returnExpenseReportLocationCategoryName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReturnExpenseReportLocationCategoryName() {
        return returnExpenseReportLocationCategoryName;
    }

    /**
     * Sets the value of the returnExpenseReportLocationCategoryName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReturnExpenseReportLocationCategoryName(final String value) {
        this.returnExpenseReportLocationCategoryName = value;
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
     * Gets the value of the maximumOvernightNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getMaximumOvernightNumberValue() {
        return maximumOvernightNumberValue;
    }

    /**
     * Sets the value of the maximumOvernightNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setMaximumOvernightNumberValue(final Integer value) {
        this.maximumOvernightNumberValue = value;
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
     * Gets the value of the mileageReimbursementVehicleTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMileageReimbursementVehicleTypeName() {
        return mileageReimbursementVehicleTypeName;
    }

    /**
     * Sets the value of the mileageReimbursementVehicleTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMileageReimbursementVehicleTypeName(final String value) {
        this.mileageReimbursementVehicleTypeName = value;
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
     * Gets the value of the mileageReimbursementVehicleClassName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMileageReimbursementVehicleClassName() {
        return mileageReimbursementVehicleClassName;
    }

    /**
     * Sets the value of the mileageReimbursementVehicleClassName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMileageReimbursementVehicleClassName(final String value) {
        this.mileageReimbursementVehicleClassName = value;
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

    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /**
     * Sets the value of the paymentCurrencyCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPaymentCurrencyCode(final String value) {
        this.paymentCurrencyCode = value;
    }

    /**
     * Gets the value of the paymentCurrencyName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPaymentCurrencyName() {
        return paymentCurrencyName;
    }

    /**
     * Sets the value of the paymentCurrencyName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPaymentCurrencyName(final String value) {
        this.paymentCurrencyName = value;
    }

    /**
     * Gets the value of the homeCountryCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getHomeCountryCode() {
        return homeCountryCode;
    }

    /**
     * Sets the value of the homeCountryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setHomeCountryCode(final String value) {
        this.homeCountryCode = value;
    }

    /**
     * Gets the value of the homeCountryName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getHomeCountryName() {
        return homeCountryName;
    }

    /**
     * Sets the value of the homeCountryName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setHomeCountryName(final String value) {
        this.homeCountryName = value;
    }

    public ExpenseReportProvisionVariantCode getProvisionVariantCode() {
        return provisionVariantCode;
    }

    /**
     * Sets the value of the provisionVariantCode property.
     *
     * @param value allowed object is {@link ExpenseReportProvisionVariantCode }
     *
     */
    public void setProvisionVariantCode(final ExpenseReportProvisionVariantCode value) {
        this.provisionVariantCode = value;
    }

    /**
     * Gets the value of the provisionVariantName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProvisionVariantName() {
        return provisionVariantName;
    }

    /**
     * Sets the value of the provisionVariantName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProvisionVariantName(final String value) {
        this.provisionVariantName = value;
    }

    /**
     * Gets the value of the categoryCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCategoryCode(final String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the categoryName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCategoryName(final String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the auditorUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getAuditorUUID() {
        return auditorUUID;
    }

    /**
     * Sets the value of the auditorUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setAuditorUUID(final UUID value) {
        this.auditorUUID = value;
    }

    /**
     * Gets the value of the approverUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getApproverUUID() {
        return approverUUID;
    }

    /**
     * Sets the value of the approverUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setApproverUUID(final UUID value) {
        this.approverUUID = value;
    }

    /**
     * Gets the value of the forwardedApproverUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getForwardedApproverUUID() {
        return forwardedApproverUUID;
    }

    /**
     * Sets the value of the forwardedApproverUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setForwardedApproverUUID(final UUID value) {
        this.forwardedApproverUUID = value;
    }

    /**
     * Gets the value of the approverPartyRoleCategoryCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getApproverPartyRoleCategoryCode() {
        return approverPartyRoleCategoryCode;
    }

    /**
     * Sets the value of the approverPartyRoleCategoryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setApproverPartyRoleCategoryCode(final String value) {
        this.approverPartyRoleCategoryCode = value;
    }

    /**
     * Gets the value of the approverPartyRoleCategoryName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getApproverPartyRoleCategoryName() {
        return approverPartyRoleCategoryName;
    }

    /**
     * Sets the value of the approverPartyRoleCategoryName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setApproverPartyRoleCategoryName(final String value) {
        this.approverPartyRoleCategoryName = value;
    }

    /**
     * Gets the value of the approverManagingEmployeeUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getApproverManagingEmployeeUUID() {
        return approverManagingEmployeeUUID;
    }

    /**
     * Sets the value of the approverManagingEmployeeUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setApproverManagingEmployeeUUID(final UUID value) {
        this.approverManagingEmployeeUUID = value;
    }

    /**
     * Gets the value of the approvingReportingLineUnitUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getApprovingReportingLineUnitUUID() {
        return approvingReportingLineUnitUUID;
    }

    /**
     * Sets the value of the approvingReportingLineUnitUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setApprovingReportingLineUnitUUID(final UUID value) {
        this.approvingReportingLineUnitUUID = value;
    }

    /**
     * Gets the value of the expenseAndReimbursementManagementFunctionalUnitUUID
     * property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getExpenseAndReimbursementManagementFunctionalUnitUUID() {
        return expenseAndReimbursementManagementFunctionalUnitUUID;
    }

    /**
     * Sets the value of the expenseAndReimbursementManagementFunctionalUnitUUID
     * property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setExpenseAndReimbursementManagementFunctionalUnitUUID(final UUID value) {
        this.expenseAndReimbursementManagementFunctionalUnitUUID = value;
    }

    /**
     * Gets the value of the
     * managingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitUUID
     * property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitUUID() {
        return managingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitUUID;
    }

    /**
     * Sets the value of the
     * managingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitUUID
     * property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitUUID(final UUID value) {
        this.managingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitUUID = value;
    }

    /**
     * Gets the value of the employeeBankDetailsKey property.
     *
     * @return possible object is
     *         {@link ExpenseReportReadByIDResponseEmployeeBankDetailsKey }
     *
     */
    public ExpenseReportReadByIDResponseEmployeeBankDetailsKey getEmployeeBankDetailsKey() {
        return employeeBankDetailsKey;
    }

    /**
     * Sets the value of the employeeBankDetailsKey property.
     *
     * @param value allowed object is
     *              {@link ExpenseReportReadByIDResponseEmployeeBankDetailsKey }
     *
     */
    public void setEmployeeBankDetailsKey(final ExpenseReportReadByIDResponseEmployeeBankDetailsKey value) {
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
     * Gets the value of the deductMealsAllowedIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isDeductMealsAllowedIndicator() {
        return deductMealsAllowedIndicator;
    }

    /**
     * Sets the value of the deductMealsAllowedIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setDeductMealsAllowedIndicator(final Boolean value) {
        this.deductMealsAllowedIndicator = value;
    }

    /**
     * Gets the value of the deductLodgingAllowedIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isDeductLodgingAllowedIndicator() {
        return deductLodgingAllowedIndicator;
    }

    /**
     * Sets the value of the deductLodgingAllowedIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setDeductLodgingAllowedIndicator(final Boolean value) {
        this.deductLodgingAllowedIndicator = value;
    }

    /**
     * Gets the value of the paymentCompletedIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isPaymentCompletedIndicator() {
        return paymentCompletedIndicator;
    }

    /**
     * Sets the value of the paymentCompletedIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setPaymentCompletedIndicator(final Boolean value) {
        this.paymentCompletedIndicator = value;
    }

    /**
     * Gets the value of the paperReceiptsRequiredCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPaperReceiptsRequiredCode() {
        return paperReceiptsRequiredCode;
    }

    /**
     * Sets the value of the paperReceiptsRequiredCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPaperReceiptsRequiredCode(final String value) {
        this.paperReceiptsRequiredCode = value;
    }

    /**
     * Gets the value of the paperReceiptsRequiredName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPaperReceiptsRequiredName() {
        return paperReceiptsRequiredName;
    }

    /**
     * Sets the value of the paperReceiptsRequiredName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPaperReceiptsRequiredName(final String value) {
        this.paperReceiptsRequiredName = value;
    }

    /**
     * Gets the value of the paperReceiptsReceivedIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isPaperReceiptsReceivedIndicator() {
        return paperReceiptsReceivedIndicator;
    }

    /**
     * Sets the value of the paperReceiptsReceivedIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setPaperReceiptsReceivedIndicator(final Boolean value) {
        this.paperReceiptsReceivedIndicator = value;
    }

    /**
     * Gets the value of the systemAdministrativeData property.
     *
     * @return possible object is {@link SystemAdministrativeData }
     *
     */
    public SystemAdministrativeData getSystemAdministrativeData() {
        return systemAdministrativeData;
    }

    /**
     * Sets the value of the systemAdministrativeData property.
     *
     * @param value allowed object is {@link SystemAdministrativeData }
     *
     */
    public void setSystemAdministrativeData(final SystemAdministrativeData value) {
        this.systemAdministrativeData = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is {@link ExpenseReportReadByIDResponseStatus }
     *
     */
    public ExpenseReportReadByIDResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is {@link ExpenseReportReadByIDResponseStatus }
     *
     */
    public void setStatus(final ExpenseReportReadByIDResponseStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the reimbursementStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReimbursementStatusCode() {
        return reimbursementStatusCode;
    }

    /**
     * Sets the value of the reimbursementStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReimbursementStatusCode(final String value) {
        this.reimbursementStatusCode = value;
    }

    /**
     * Gets the value of the reimbursementStatusName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReimbursementStatusName() {
        return reimbursementStatusName;
    }

    /**
     * Sets the value of the reimbursementStatusName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setReimbursementStatusName(final String value) {
        this.reimbursementStatusName = value;
    }

    /**
     * Gets the value of the openReimbursementAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getOpenReimbursementAmount() {
        return openReimbursementAmount;
    }

    /**
     * Sets the value of the openReimbursementAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setOpenReimbursementAmount(final Amount value) {
        this.openReimbursementAmount = value;
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
     * Gets the value of the addressSnapshotUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getAddressSnapshotUUID() {
        return addressSnapshotUUID;
    }

    /**
     * Sets the value of the addressSnapshotUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setAddressSnapshotUUID(final UUID value) {
        this.addressSnapshotUUID = value;
    }

    /**
     * Gets the value of the integrationTypeCode property.
     *
     * @return possible object is {@link IntegrationTypeCode }
     *
     */
    public IntegrationTypeCode getIntegrationTypeCode() {
        return integrationTypeCode;
    }

    /**
     * Sets the value of the integrationTypeCode property.
     *
     * @param value allowed object is {@link IntegrationTypeCode }
     *
     */
    public void setIntegrationTypeCode(final IntegrationTypeCode value) {
        this.integrationTypeCode = value;
    }

    /**
     * Gets the value of the integrationTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIntegrationTypeName() {
        return integrationTypeName;
    }

    /**
     * Sets the value of the integrationTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIntegrationTypeName(final String value) {
        this.integrationTypeName = value;
    }

    /**
     * Gets the value of the lastSubmissionDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLastSubmissionDate() {
        return lastSubmissionDate;
    }

    /**
     * Sets the value of the lastSubmissionDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setLastSubmissionDate(final XMLGregorianCalendar value) {
        this.lastSubmissionDate = value;
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
     * Gets the value of the municipalityName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMunicipalityName() {
        return municipalityName;
    }

    /**
     * Sets the value of the municipalityName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMunicipalityName(final String value) {
        this.municipalityName = value;
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

    public List<ExpenseReportReadByIDResponsePaymentHistoryDetails> getPaymentHistoryDetails() {
        if (paymentHistoryDetails == null) {
            paymentHistoryDetails = new ArrayList<ExpenseReportReadByIDResponsePaymentHistoryDetails>();
        }
        return this.paymentHistoryDetails;
    }

    public List<ExpenseReportReadByIDResponsePaymentHistory> getPaymentHistory() {
        if (paymentHistory == null) {
            paymentHistory = new ArrayList<ExpenseReportReadByIDResponsePaymentHistory>();
        }
        return this.paymentHistory;
    }

    public List<ExpenseReportReadByIDResponseAdvance> getAdvance() {
        if (advance == null) {
            advance = new ArrayList<ExpenseReportReadByIDResponseAdvance>();
        }
        return this.advance;
    }

    public ExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress getAddressSnapshotMainStayLocationAddress() {
        return addressSnapshotMainStayLocationAddress;
    }

    public void setAddressSnapshotMainStayLocationAddress(
        final ExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress value) {
        this.addressSnapshotMainStayLocationAddress = value;
    }

    public AccessTextCollection getTextCollection() {
        return textCollection;
    }

    public void setTextCollection(final AccessTextCollection value) {
        this.textCollection = value;
    }

    public List<ExpenseReportReadByIDResponseSettlementResultTotals> getSettlementResultTotals() {
        if (settlementResultTotals == null) {
            settlementResultTotals = new ArrayList<ExpenseReportReadByIDResponseSettlementResultTotals>();
        }
        return this.settlementResultTotals;
    }

    public List<ExpenseReportReadByIDResponseSettlementResultPostingTransaction> getSettlementResultPostingTransaction() {
        if (settlementResultPostingTransaction == null) {
            settlementResultPostingTransaction = new ArrayList<ExpenseReportReadByIDResponseSettlementResultPostingTransaction>();
        }
        return this.settlementResultPostingTransaction;
    }

    public ExpenseReportReadByIDResponseReportingLineUnit getReportingLineUnit() {
        return reportingLineUnit;
    }

    public void setReportingLineUnit(final ExpenseReportReadByIDResponseReportingLineUnit value) {
        this.reportingLineUnit = value;
    }

    public List<ExpenseReportReadByIDResponseReceipt> getReceipt() {
        if (receipt == null) {
            receipt = new ArrayList<ExpenseReportReadByIDResponseReceipt>();
        }
        return this.receipt;
    }

    public List<ExpenseReportReadByIDResponsePerDiemDeduction> getPerDiemDeduction() {
        if (perDiemDeduction == null) {
            perDiemDeduction = new ArrayList<ExpenseReportReadByIDResponsePerDiemDeduction>();
        }
        return this.perDiemDeduction;
    }

    public ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit getManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit() {
        return managingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit;
    }

    public void setManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit(
        final ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit value) {
        this.managingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit = value;
    }

    public List<ExpenseReportReadByIDResponseMileage> getMileage() {
        if (mileage == null) {
            mileage = new ArrayList<ExpenseReportReadByIDResponseMileage>();
        }
        return this.mileage;
    }

    public ExpenseReportReadByIDResponseLastChangeIdentity getLastChangeIdentity() {
        return lastChangeIdentity;
    }

    public void setLastChangeIdentity(final ExpenseReportReadByIDResponseLastChangeIdentity value) {
        this.lastChangeIdentity = value;
    }

    public List<ExpenseReportReadByIDResponseItinerarySegment> getItinerarySegment() {
        if (itinerarySegment == null) {
            itinerarySegment = new ArrayList<ExpenseReportReadByIDResponseItinerarySegment>();
        }
        return this.itinerarySegment;
    }

    public List<ExpenseReportReadByIDResponseHistory> getHistory() {
        if (history == null) {
            history = new ArrayList<ExpenseReportReadByIDResponseHistory>();
        }
        return this.history;
    }

    public ExpenseReportReadByIDResponseFunctionalUnit getFunctionalUnit() {
        return functionalUnit;
    }

    public void setFunctionalUnit(final ExpenseReportReadByIDResponseFunctionalUnit value) {
        this.functionalUnit = value;
    }

    public ExpenseReportReadByIDResponseExpenseArrangement getExpenseArrangement() {
        return expenseArrangement;
    }

    public void setExpenseArrangement(final ExpenseReportReadByIDResponseExpenseArrangement value) {
        this.expenseArrangement = value;
    }

    public ExpenseReportReadByIDResponseEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(final ExpenseReportReadByIDResponseEmployee value) {
        this.employee = value;
    }

    public ExpenseReportReadByIDResponseCreationIdentity getCreationIdentity() {
        return creationIdentity;
    }

    public void setCreationIdentity(final ExpenseReportReadByIDResponseCreationIdentity value) {
        this.creationIdentity = value;
    }

    public AccessAccountingCodingBlockDistribution getAccountingCodingBlockDistribution() {
        return accountingCodingBlockDistribution;
    }

    public void setAccountingCodingBlockDistribution(final AccessAccountingCodingBlockDistribution value) {
        this.accountingCodingBlockDistribution = value;
    }

    public ExpenseReportReadByIDResponseAuditor getAuditor() {
        return auditor;
    }

    public void setAuditor(final ExpenseReportReadByIDResponseAuditor value) {
        this.auditor = value;
    }

    public AccessAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    public void setAttachmentFolder(final AccessAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    public ExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployee getManagingEmployeeOfApproverEmployee() {
        return managingEmployeeOfApproverEmployee;
    }

    public void setManagingEmployeeOfApproverEmployee(
        final ExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployee value) {
        this.managingEmployeeOfApproverEmployee = value;
    }

    public ExpenseReportReadByIDResponseApprover getApprover() {
        return approver;
    }

    public void setApprover(final ExpenseReportReadByIDResponseApprover value) {
        this.approver = value;
    }

    public List<ExpenseReportReadByIDResponseAdditionalCompany> getAdditionalCompany() {
        if (additionalCompany == null) {
            additionalCompany = new ArrayList<ExpenseReportReadByIDResponseAdditionalCompany>();
        }
        return this.additionalCompany;
    }

    public List<ExpenseReportReadByIDResponseCostAssignmentView> getCostAssignmentView() {
        if (costAssignmentView == null) {
            costAssignmentView = new ArrayList<ExpenseReportReadByIDResponseCostAssignmentView>();
        }
        return this.costAssignmentView;
    }

}
