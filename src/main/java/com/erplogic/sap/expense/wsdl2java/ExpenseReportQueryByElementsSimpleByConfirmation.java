
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
 * Java class for ExpenseReportQueryByElementsSimpleByConfirmation complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByConfirmation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseArrangementUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportID" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseArrangementID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseArrangementID" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{http://sap.com/xi/AP/Common/GDT}UPPEROPEN_LOCAL_DateTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="DepartureExpenseReportLocationCategoryCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportLocationCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="DepartureExpenseReportLocationCategoryName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ReturnExpenseReportLocationCategoryCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportLocationCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="ReturnExpenseReportLocationCategoryName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="StayDescription" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationName" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationCountryName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationExpenseReportPerDiemRegionCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportPerDiemRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationExpenseReportPerDiemRegionName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportStatutoryStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportStatutoryStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportStatutoryStayTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportEnterpriseStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportEnterpriseStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportEnterpriseStayTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportActivityStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportActivityStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportActivityStayTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="MealsPerDiemFlatRateReimbursementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationPerDiemFlatRateReimbursementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="OvernightNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="MaximumOvernightNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="TotalMileageUnitTotalQuantity" type="{http://sap.com/xi/AP/Common/GDT}INTEGER_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="MileageReimbursementVehicleTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MileageReimbursementVehicleTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="MileageReimbursementVehicleTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="MileageReimbursementVehicleClassCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MileageReimbursementVehicleClassCode" minOccurs="0"/&gt;
 *         &lt;element name="MileageReimbursementVehicleClassName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Note" minOccurs="0"/&gt;
 *         &lt;element name="PaymentFormCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentFormCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentFormName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCurrencyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="HomeCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="HomeCountryName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ProvisionVariantCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportProvisionVariantCode" minOccurs="0"/&gt;
 *         &lt;element name="ProvisionVariantName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="CategoryName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="AuditorUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ApproverUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ForwardedApproverUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ApproverPartyRoleCategoryCode" type="{http://sap.com/xi/AP/Common/GDT}PartyRoleCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="ApproverPartyRoleCategoryName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ApproverManagingEmployeeUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ApprovingReportingLineUnitUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseAndReimbursementManagementFunctionalUnitUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeBankDetailsKey" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByConfirmationEmployeeBankDetailsKey" minOccurs="0"/&gt;
 *         &lt;element name="AccountingBusinessTransactionDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="DeductMealsAllowedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DeductLodgingAllowedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCompletedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="PaperReceiptsRequiredCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}PaperReceiptsRequirementCode" minOccurs="0"/&gt;
 *         &lt;element name="PaperReceiptsRequiredName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="PaperReceiptsReceivedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SystemAdministrativeData" type="{http://sap.com/xi/AP/Common/GDT}SystemAdministrativeData" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByConfirmationStatus" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursementStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportReimbursementStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursementStatusName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="OpenReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AdvancesAllowedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="TravelProcessUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="AddressSnapshotUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationTypeCode" type="{http://sap.com/xi/TravelOnDemand/global}IntegrationTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="LastSubmissionDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByConfirmation", propOrder = {"uuid", "employeeUUID",
    "expenseArrangementUUID", "id", "employeeID", "expenseArrangementID", "typeCode", "typeName", "period",
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
    "reimbursementStatusName", "openReimbursementAmount", "advancesAllowedIndicator", "travelProcessUUID",
    "addressSnapshotUUID", "integrationTypeCode", "integrationTypeName", "lastSubmissionDate"})
public class ExpenseReportQueryByElementsSimpleByConfirmation {

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
    private ExpenseReportQueryByElementsSimpleByConfirmationEmployeeBankDetailsKey employeeBankDetailsKey;
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
    private ExpenseReportQueryByElementsSimpleByConfirmationStatus status;
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
    @XmlElement(name = "TravelProcessUUID")
    private UUID travelProcessUUID;
    @XmlElement(name = "AddressSnapshotUUID")
    private UUID addressSnapshotUUID;
    @XmlElement(name = "IntegrationTypeCode")
    private IntegrationTypeCode integrationTypeCode;
    @XmlElement(name = "IntegrationTypeName")
    private String integrationTypeName;
    @XmlElement(name = "LastSubmissionDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar lastSubmissionDate;

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
     * Gets the value of the employeeUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getEmployeeUUID() {
        return employeeUUID;
    }

    /**
     * Sets the value of the employeeUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
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

    /**
     * Gets the value of the paymentCurrencyCode property.
     *
     * @return possible object is {@link String }
     *
     */
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

    /**
     * Gets the value of the provisionVariantCode property.
     *
     * @return possible object is {@link ExpenseReportProvisionVariantCode }
     *
     */
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
     *         {@link ExpenseReportQueryByElementsSimpleByConfirmationEmployeeBankDetailsKey
     *         }
     *
     */
    public ExpenseReportQueryByElementsSimpleByConfirmationEmployeeBankDetailsKey getEmployeeBankDetailsKey() {
        return employeeBankDetailsKey;
    }

    /**
     * Sets the value of the employeeBankDetailsKey property.
     *
     * @param value allowed object is
     *              {@link ExpenseReportQueryByElementsSimpleByConfirmationEmployeeBankDetailsKey
     *              }
     *
     */
    public void setEmployeeBankDetailsKey(
        final ExpenseReportQueryByElementsSimpleByConfirmationEmployeeBankDetailsKey value) {
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
     * @return possible object is
     *         {@link ExpenseReportQueryByElementsSimpleByConfirmationStatus }
     *
     */
    public ExpenseReportQueryByElementsSimpleByConfirmationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link ExpenseReportQueryByElementsSimpleByConfirmationStatus }
     *
     */
    public void setStatus(final ExpenseReportQueryByElementsSimpleByConfirmationStatus value) {
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
     * Gets the value of the travelProcessUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getTravelProcessUUID() {
        return travelProcessUUID;
    }

    /**
     * Sets the value of the travelProcessUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setTravelProcessUUID(final UUID value) {
        this.travelProcessUUID = value;
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

}
