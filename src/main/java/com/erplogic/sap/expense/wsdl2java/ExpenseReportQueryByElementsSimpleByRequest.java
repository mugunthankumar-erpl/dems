
package com.erplogic.sap.expense.wsdl2java;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExpenseReportQueryByElementsSimpleByRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByUUID" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByEmployeeUUID" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByExpenseArrangementUUID" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByExpenseArrangement_CompanyUUID" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangement_CompanyUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByExpenseArrangement_CompanyID" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangement_CompanyID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByExpenseArrangement_ExpenseReporterGroupCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangement_ExpenseReporterGroupCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByID" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByEmployeeID" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByExpenseArrangementID" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTypeCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPeriodStartDateTime" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPeriodEndDateTime" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodEndDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByDepartureExpenseReportLocationCategoryCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByReturnExpenseReportLocationCategoryCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByReturnExpenseReportLocationCategoryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByDescription" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByStayDescription" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByStayDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByStayLocationName" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByStayLocationCountryCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationCountryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByStayLocationExpenseReportPerDiemRegionCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByStayExpenseReportStatutoryStayTypeCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByStayExpenseReportEnterpriseStayTypeCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportEnterpriseStayTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByStayExpenseReportActivityStayTypeCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportActivityStayTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByMealsPerDiemFlatRateReimbursementIndicator" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByAccommodationPerDiemFlatRateReimbursementIndicator" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByOvernightNumberValue" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByOvernightNumberValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByMaximumOvernightNumberValue" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByMaximumOvernightNumberValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTotalMileageUnitTotalQuantity" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByTotalMileageUnitTotalQuantity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByMileageReimbursementVehicleTypeCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByMileageReimbursementVehicleClassCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleClassCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPaymentFormCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentFormCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPaymentCurrencyCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentCurrencyCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByHomeCountryCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByHomeCountryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProvisionVariantCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCategoryCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByCategoryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByApproverEmployee_ID" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployee_ID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByAccountingBusinessTransactionDate" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySystemAdministrativeDataCreationDateTime" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataCreationDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySystemAdministrativeDataLastChangeDateTime" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataLastChangeDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySubmissionStatusCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionBySubmissionStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByAuditStatusCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByAuditStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByApprovalStatusCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByApprovalStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCancellationStatusCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByCancellationStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByExpenseReportLifeCycleStatusCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseReportLifeCycleStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByReimbursementStatusCode" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByOpenReimbursementAmount" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySearchText" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequestSelectionBySearchText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequest", propOrder = {"selectionByUUID",
    "selectionByEmployeeUUID", "selectionByExpenseArrangementUUID", "selectionByExpenseArrangementCompanyUUID",
    "selectionByExpenseArrangementCompanyID", "selectionByExpenseArrangementExpenseReporterGroupCode", "selectionByID",
    "selectionByEmployeeID", "selectionByExpenseArrangementID", "selectionByTypeCode", "selectionByPeriodStartDateTime",
    "selectionByPeriodEndDateTime", "selectionByDepartureExpenseReportLocationCategoryCode",
    "selectionByReturnExpenseReportLocationCategoryCode", "selectionByDescription", "selectionByStayDescription",
    "selectionByStayLocationName", "selectionByStayLocationCountryCode",
    "selectionByStayLocationExpenseReportPerDiemRegionCode", "selectionByStayExpenseReportStatutoryStayTypeCode",
    "selectionByStayExpenseReportEnterpriseStayTypeCode", "selectionByStayExpenseReportActivityStayTypeCode",
    "selectionByMealsPerDiemFlatRateReimbursementIndicator",
    "selectionByAccommodationPerDiemFlatRateReimbursementIndicator", "selectionByOvernightNumberValue",
    "selectionByMaximumOvernightNumberValue", "selectionByTotalMileageUnitTotalQuantity",
    "selectionByMileageReimbursementVehicleTypeCode", "selectionByMileageReimbursementVehicleClassCode",
    "selectionByPaymentFormCode", "selectionByPaymentCurrencyCode", "selectionByHomeCountryCode",
    "selectionByProvisionVariantCode", "selectionByCategoryCode", "selectionByApproverEmployeeID",
    "selectionByAccountingBusinessTransactionDate", "selectionBySystemAdministrativeDataCreationDateTime",
    "selectionBySystemAdministrativeDataLastChangeDateTime", "selectionBySubmissionStatusCode",
    "selectionByAuditStatusCode", "selectionByApprovalStatusCode", "selectionByCancellationStatusCode",
    "selectionByExpenseReportLifeCycleStatusCode", "selectionByReimbursementStatusCode",
    "selectionByOpenReimbursementAmount", "selectionBySearchText"})
public class ExpenseReportQueryByElementsSimpleByRequest {

    @XmlElement(name = "SelectionByUUID")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByUUID> selectionByUUID;
    @XmlElement(name = "SelectionByEmployeeUUID")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeUUID> selectionByEmployeeUUID;
    @XmlElement(name = "SelectionByExpenseArrangementUUID")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID> selectionByExpenseArrangementUUID;
    @XmlElement(name = "SelectionByExpenseArrangement_CompanyUUID")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyUUID> selectionByExpenseArrangementCompanyUUID;
    @XmlElement(name = "SelectionByExpenseArrangement_CompanyID")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyID> selectionByExpenseArrangementCompanyID;
    @XmlElement(name = "SelectionByExpenseArrangement_ExpenseReporterGroupCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementExpenseReporterGroupCode> selectionByExpenseArrangementExpenseReporterGroupCode;
    @XmlElement(name = "SelectionByID")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByID> selectionByID;
    @XmlElement(name = "SelectionByEmployeeID")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeID> selectionByEmployeeID;
    @XmlElement(name = "SelectionByExpenseArrangementID")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID> selectionByExpenseArrangementID;
    @XmlElement(name = "SelectionByTypeCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByTypeCode> selectionByTypeCode;
    @XmlElement(name = "SelectionByPeriodStartDateTime")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime> selectionByPeriodStartDateTime;
    @XmlElement(name = "SelectionByPeriodEndDateTime")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodEndDateTime> selectionByPeriodEndDateTime;
    @XmlElement(name = "SelectionByDepartureExpenseReportLocationCategoryCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode> selectionByDepartureExpenseReportLocationCategoryCode;
    @XmlElement(name = "SelectionByReturnExpenseReportLocationCategoryCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByReturnExpenseReportLocationCategoryCode> selectionByReturnExpenseReportLocationCategoryCode;
    @XmlElement(name = "SelectionByDescription")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByDescription> selectionByDescription;
    @XmlElement(name = "SelectionByStayDescription")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayDescription> selectionByStayDescription;
    @XmlElement(name = "SelectionByStayLocationName")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName> selectionByStayLocationName;
    @XmlElement(name = "SelectionByStayLocationCountryCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationCountryCode> selectionByStayLocationCountryCode;
    @XmlElement(name = "SelectionByStayLocationExpenseReportPerDiemRegionCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode> selectionByStayLocationExpenseReportPerDiemRegionCode;
    @XmlElement(name = "SelectionByStayExpenseReportStatutoryStayTypeCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode> selectionByStayExpenseReportStatutoryStayTypeCode;
    @XmlElement(name = "SelectionByStayExpenseReportEnterpriseStayTypeCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportEnterpriseStayTypeCode> selectionByStayExpenseReportEnterpriseStayTypeCode;
    @XmlElement(name = "SelectionByStayExpenseReportActivityStayTypeCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportActivityStayTypeCode> selectionByStayExpenseReportActivityStayTypeCode;
    @XmlElement(name = "SelectionByMealsPerDiemFlatRateReimbursementIndicator")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator> selectionByMealsPerDiemFlatRateReimbursementIndicator;
    @XmlElement(name = "SelectionByAccommodationPerDiemFlatRateReimbursementIndicator")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator> selectionByAccommodationPerDiemFlatRateReimbursementIndicator;
    @XmlElement(name = "SelectionByOvernightNumberValue")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByOvernightNumberValue> selectionByOvernightNumberValue;
    @XmlElement(name = "SelectionByMaximumOvernightNumberValue")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByMaximumOvernightNumberValue> selectionByMaximumOvernightNumberValue;
    @XmlElement(name = "SelectionByTotalMileageUnitTotalQuantity")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByTotalMileageUnitTotalQuantity> selectionByTotalMileageUnitTotalQuantity;
    @XmlElement(name = "SelectionByMileageReimbursementVehicleTypeCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleTypeCode> selectionByMileageReimbursementVehicleTypeCode;
    @XmlElement(name = "SelectionByMileageReimbursementVehicleClassCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleClassCode> selectionByMileageReimbursementVehicleClassCode;
    @XmlElement(name = "SelectionByPaymentFormCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentFormCode> selectionByPaymentFormCode;
    @XmlElement(name = "SelectionByPaymentCurrencyCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentCurrencyCode> selectionByPaymentCurrencyCode;
    @XmlElement(name = "SelectionByHomeCountryCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByHomeCountryCode> selectionByHomeCountryCode;
    @XmlElement(name = "SelectionByProvisionVariantCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode> selectionByProvisionVariantCode;
    @XmlElement(name = "SelectionByCategoryCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByCategoryCode> selectionByCategoryCode;
    @XmlElement(name = "SelectionByApproverEmployee_ID")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployeeID> selectionByApproverEmployeeID;
    @XmlElement(name = "SelectionByAccountingBusinessTransactionDate")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate> selectionByAccountingBusinessTransactionDate;
    @XmlElement(name = "SelectionBySystemAdministrativeDataCreationDateTime")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataCreationDateTime> selectionBySystemAdministrativeDataCreationDateTime;
    @XmlElement(name = "SelectionBySystemAdministrativeDataLastChangeDateTime")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataLastChangeDateTime> selectionBySystemAdministrativeDataLastChangeDateTime;
    @XmlElement(name = "SelectionBySubmissionStatusCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionBySubmissionStatusCode> selectionBySubmissionStatusCode;
    @XmlElement(name = "SelectionByAuditStatusCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByAuditStatusCode> selectionByAuditStatusCode;
    @XmlElement(name = "SelectionByApprovalStatusCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByApprovalStatusCode> selectionByApprovalStatusCode;
    @XmlElement(name = "SelectionByCancellationStatusCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByCancellationStatusCode> selectionByCancellationStatusCode;
    @XmlElement(name = "SelectionByExpenseReportLifeCycleStatusCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseReportLifeCycleStatusCode> selectionByExpenseReportLifeCycleStatusCode;
    @XmlElement(name = "SelectionByReimbursementStatusCode")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode> selectionByReimbursementStatusCode;
    @XmlElement(name = "SelectionByOpenReimbursementAmount")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount> selectionByOpenReimbursementAmount;
    @XmlElement(name = "SelectionBySearchText")
    private List<ExpenseReportQueryByElementsSimpleByRequestSelectionBySearchText> selectionBySearchText;

    /**
     * Gets the value of the selectionByUUID property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByUUID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByUUID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByUUID }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByUUID> getSelectionByUUID() {
        if (selectionByUUID == null) {
            selectionByUUID = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByUUID>();
        }
        return this.selectionByUUID;
    }

    /**
     * Gets the value of the selectionByEmployeeUUID property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByEmployeeUUID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByEmployeeUUID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeUUID }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeUUID> getSelectionByEmployeeUUID() {
        if (selectionByEmployeeUUID == null) {
            selectionByEmployeeUUID = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeUUID>();
        }
        return this.selectionByEmployeeUUID;
    }

    /**
     * Gets the value of the selectionByExpenseArrangementUUID property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByExpenseArrangementUUID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByExpenseArrangementUUID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID> getSelectionByExpenseArrangementUUID() {
        if (selectionByExpenseArrangementUUID == null) {
            selectionByExpenseArrangementUUID = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID>();
        }
        return this.selectionByExpenseArrangementUUID;
    }

    /**
     * Gets the value of the selectionByExpenseArrangementCompanyUUID property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByExpenseArrangementCompanyUUID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByExpenseArrangementCompanyUUID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyUUID
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyUUID> getSelectionByExpenseArrangementCompanyUUID() {
        if (selectionByExpenseArrangementCompanyUUID == null) {
            selectionByExpenseArrangementCompanyUUID = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyUUID>();
        }
        return this.selectionByExpenseArrangementCompanyUUID;
    }

    /**
     * Gets the value of the selectionByExpenseArrangementCompanyID property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByExpenseArrangementCompanyID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByExpenseArrangementCompanyID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyID
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyID> getSelectionByExpenseArrangementCompanyID() {
        if (selectionByExpenseArrangementCompanyID == null) {
            selectionByExpenseArrangementCompanyID = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyID>();
        }
        return this.selectionByExpenseArrangementCompanyID;
    }

    /**
     * Gets the value of the selectionByExpenseArrangementExpenseReporterGroupCode
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByExpenseArrangementExpenseReporterGroupCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByExpenseArrangementExpenseReporterGroupCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementExpenseReporterGroupCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementExpenseReporterGroupCode> getSelectionByExpenseArrangementExpenseReporterGroupCode() {
        if (selectionByExpenseArrangementExpenseReporterGroupCode == null) {
            selectionByExpenseArrangementExpenseReporterGroupCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementExpenseReporterGroupCode>();
        }
        return this.selectionByExpenseArrangementExpenseReporterGroupCode;
    }

    /**
     * Gets the value of the selectionByID property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByID }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByID> getSelectionByID() {
        if (selectionByID == null) {
            selectionByID = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByID>();
        }
        return this.selectionByID;
    }

    /**
     * Gets the value of the selectionByEmployeeID property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByEmployeeID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByEmployeeID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeID }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeID> getSelectionByEmployeeID() {
        if (selectionByEmployeeID == null) {
            selectionByEmployeeID = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeID>();
        }
        return this.selectionByEmployeeID;
    }

    /**
     * Gets the value of the selectionByExpenseArrangementID property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByExpenseArrangementID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByExpenseArrangementID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID> getSelectionByExpenseArrangementID() {
        if (selectionByExpenseArrangementID == null) {
            selectionByExpenseArrangementID = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID>();
        }
        return this.selectionByExpenseArrangementID;
    }

    /**
     * Gets the value of the selectionByTypeCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByTypeCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByTypeCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByTypeCode }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByTypeCode> getSelectionByTypeCode() {
        if (selectionByTypeCode == null) {
            selectionByTypeCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByTypeCode>();
        }
        return this.selectionByTypeCode;
    }

    /**
     * Gets the value of the selectionByPeriodStartDateTime property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByPeriodStartDateTime property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByPeriodStartDateTime().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime> getSelectionByPeriodStartDateTime() {
        if (selectionByPeriodStartDateTime == null) {
            selectionByPeriodStartDateTime = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime>();
        }
        return this.selectionByPeriodStartDateTime;
    }

    /**
     * Gets the value of the selectionByPeriodEndDateTime property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByPeriodEndDateTime property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByPeriodEndDateTime().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodEndDateTime
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodEndDateTime> getSelectionByPeriodEndDateTime() {
        if (selectionByPeriodEndDateTime == null) {
            selectionByPeriodEndDateTime = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodEndDateTime>();
        }
        return this.selectionByPeriodEndDateTime;
    }

    /**
     * Gets the value of the selectionByDepartureExpenseReportLocationCategoryCode
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByDepartureExpenseReportLocationCategoryCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByDepartureExpenseReportLocationCategoryCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode> getSelectionByDepartureExpenseReportLocationCategoryCode() {
        if (selectionByDepartureExpenseReportLocationCategoryCode == null) {
            selectionByDepartureExpenseReportLocationCategoryCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode>();
        }
        return this.selectionByDepartureExpenseReportLocationCategoryCode;
    }

    /**
     * Gets the value of the selectionByReturnExpenseReportLocationCategoryCode
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByReturnExpenseReportLocationCategoryCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByReturnExpenseReportLocationCategoryCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByReturnExpenseReportLocationCategoryCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByReturnExpenseReportLocationCategoryCode> getSelectionByReturnExpenseReportLocationCategoryCode() {
        if (selectionByReturnExpenseReportLocationCategoryCode == null) {
            selectionByReturnExpenseReportLocationCategoryCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByReturnExpenseReportLocationCategoryCode>();
        }
        return this.selectionByReturnExpenseReportLocationCategoryCode;
    }

    /**
     * Gets the value of the selectionByDescription property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByDescription property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByDescription }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByDescription> getSelectionByDescription() {
        if (selectionByDescription == null) {
            selectionByDescription = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByDescription>();
        }
        return this.selectionByDescription;
    }

    /**
     * Gets the value of the selectionByStayDescription property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByStayDescription property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByStayDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayDescription
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayDescription> getSelectionByStayDescription() {
        if (selectionByStayDescription == null) {
            selectionByStayDescription = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayDescription>();
        }
        return this.selectionByStayDescription;
    }

    /**
     * Gets the value of the selectionByStayLocationName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByStayLocationName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByStayLocationName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName> getSelectionByStayLocationName() {
        if (selectionByStayLocationName == null) {
            selectionByStayLocationName = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName>();
        }
        return this.selectionByStayLocationName;
    }

    /**
     * Gets the value of the selectionByStayLocationCountryCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByStayLocationCountryCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByStayLocationCountryCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationCountryCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationCountryCode> getSelectionByStayLocationCountryCode() {
        if (selectionByStayLocationCountryCode == null) {
            selectionByStayLocationCountryCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationCountryCode>();
        }
        return this.selectionByStayLocationCountryCode;
    }

    /**
     * Gets the value of the selectionByStayLocationExpenseReportPerDiemRegionCode
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByStayLocationExpenseReportPerDiemRegionCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByStayLocationExpenseReportPerDiemRegionCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode> getSelectionByStayLocationExpenseReportPerDiemRegionCode() {
        if (selectionByStayLocationExpenseReportPerDiemRegionCode == null) {
            selectionByStayLocationExpenseReportPerDiemRegionCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode>();
        }
        return this.selectionByStayLocationExpenseReportPerDiemRegionCode;
    }

    /**
     * Gets the value of the selectionByStayExpenseReportStatutoryStayTypeCode
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByStayExpenseReportStatutoryStayTypeCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByStayExpenseReportStatutoryStayTypeCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode> getSelectionByStayExpenseReportStatutoryStayTypeCode() {
        if (selectionByStayExpenseReportStatutoryStayTypeCode == null) {
            selectionByStayExpenseReportStatutoryStayTypeCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode>();
        }
        return this.selectionByStayExpenseReportStatutoryStayTypeCode;
    }

    /**
     * Gets the value of the selectionByStayExpenseReportEnterpriseStayTypeCode
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByStayExpenseReportEnterpriseStayTypeCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByStayExpenseReportEnterpriseStayTypeCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportEnterpriseStayTypeCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportEnterpriseStayTypeCode> getSelectionByStayExpenseReportEnterpriseStayTypeCode() {
        if (selectionByStayExpenseReportEnterpriseStayTypeCode == null) {
            selectionByStayExpenseReportEnterpriseStayTypeCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportEnterpriseStayTypeCode>();
        }
        return this.selectionByStayExpenseReportEnterpriseStayTypeCode;
    }

    /**
     * Gets the value of the selectionByStayExpenseReportActivityStayTypeCode
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByStayExpenseReportActivityStayTypeCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByStayExpenseReportActivityStayTypeCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportActivityStayTypeCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportActivityStayTypeCode> getSelectionByStayExpenseReportActivityStayTypeCode() {
        if (selectionByStayExpenseReportActivityStayTypeCode == null) {
            selectionByStayExpenseReportActivityStayTypeCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportActivityStayTypeCode>();
        }
        return this.selectionByStayExpenseReportActivityStayTypeCode;
    }

    /**
     * Gets the value of the selectionByMealsPerDiemFlatRateReimbursementIndicator
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByMealsPerDiemFlatRateReimbursementIndicator property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByMealsPerDiemFlatRateReimbursementIndicator().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator> getSelectionByMealsPerDiemFlatRateReimbursementIndicator() {
        if (selectionByMealsPerDiemFlatRateReimbursementIndicator == null) {
            selectionByMealsPerDiemFlatRateReimbursementIndicator = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator>();
        }
        return this.selectionByMealsPerDiemFlatRateReimbursementIndicator;
    }

    /**
     * Gets the value of the
     * selectionByAccommodationPerDiemFlatRateReimbursementIndicator property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByAccommodationPerDiemFlatRateReimbursementIndicator
     * property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByAccommodationPerDiemFlatRateReimbursementIndicator().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator> getSelectionByAccommodationPerDiemFlatRateReimbursementIndicator() {
        if (selectionByAccommodationPerDiemFlatRateReimbursementIndicator == null) {
            selectionByAccommodationPerDiemFlatRateReimbursementIndicator = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator>();
        }
        return this.selectionByAccommodationPerDiemFlatRateReimbursementIndicator;
    }

    /**
     * Gets the value of the selectionByOvernightNumberValue property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByOvernightNumberValue property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByOvernightNumberValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByOvernightNumberValue
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByOvernightNumberValue> getSelectionByOvernightNumberValue() {
        if (selectionByOvernightNumberValue == null) {
            selectionByOvernightNumberValue = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByOvernightNumberValue>();
        }
        return this.selectionByOvernightNumberValue;
    }

    /**
     * Gets the value of the selectionByMaximumOvernightNumberValue property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByMaximumOvernightNumberValue property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByMaximumOvernightNumberValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByMaximumOvernightNumberValue
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByMaximumOvernightNumberValue> getSelectionByMaximumOvernightNumberValue() {
        if (selectionByMaximumOvernightNumberValue == null) {
            selectionByMaximumOvernightNumberValue = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByMaximumOvernightNumberValue>();
        }
        return this.selectionByMaximumOvernightNumberValue;
    }

    /**
     * Gets the value of the selectionByTotalMileageUnitTotalQuantity property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByTotalMileageUnitTotalQuantity property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByTotalMileageUnitTotalQuantity().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByTotalMileageUnitTotalQuantity
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByTotalMileageUnitTotalQuantity> getSelectionByTotalMileageUnitTotalQuantity() {
        if (selectionByTotalMileageUnitTotalQuantity == null) {
            selectionByTotalMileageUnitTotalQuantity = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByTotalMileageUnitTotalQuantity>();
        }
        return this.selectionByTotalMileageUnitTotalQuantity;
    }

    /**
     * Gets the value of the selectionByMileageReimbursementVehicleTypeCode
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByMileageReimbursementVehicleTypeCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByMileageReimbursementVehicleTypeCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleTypeCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleTypeCode> getSelectionByMileageReimbursementVehicleTypeCode() {
        if (selectionByMileageReimbursementVehicleTypeCode == null) {
            selectionByMileageReimbursementVehicleTypeCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleTypeCode>();
        }
        return this.selectionByMileageReimbursementVehicleTypeCode;
    }

    /**
     * Gets the value of the selectionByMileageReimbursementVehicleClassCode
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByMileageReimbursementVehicleClassCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByMileageReimbursementVehicleClassCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleClassCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleClassCode> getSelectionByMileageReimbursementVehicleClassCode() {
        if (selectionByMileageReimbursementVehicleClassCode == null) {
            selectionByMileageReimbursementVehicleClassCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleClassCode>();
        }
        return this.selectionByMileageReimbursementVehicleClassCode;
    }

    /**
     * Gets the value of the selectionByPaymentFormCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByPaymentFormCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByPaymentFormCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentFormCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentFormCode> getSelectionByPaymentFormCode() {
        if (selectionByPaymentFormCode == null) {
            selectionByPaymentFormCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentFormCode>();
        }
        return this.selectionByPaymentFormCode;
    }

    /**
     * Gets the value of the selectionByPaymentCurrencyCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByPaymentCurrencyCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByPaymentCurrencyCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentCurrencyCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentCurrencyCode> getSelectionByPaymentCurrencyCode() {
        if (selectionByPaymentCurrencyCode == null) {
            selectionByPaymentCurrencyCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentCurrencyCode>();
        }
        return this.selectionByPaymentCurrencyCode;
    }

    /**
     * Gets the value of the selectionByHomeCountryCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByHomeCountryCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByHomeCountryCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByHomeCountryCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByHomeCountryCode> getSelectionByHomeCountryCode() {
        if (selectionByHomeCountryCode == null) {
            selectionByHomeCountryCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByHomeCountryCode>();
        }
        return this.selectionByHomeCountryCode;
    }

    /**
     * Gets the value of the selectionByProvisionVariantCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByProvisionVariantCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByProvisionVariantCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode> getSelectionByProvisionVariantCode() {
        if (selectionByProvisionVariantCode == null) {
            selectionByProvisionVariantCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode>();
        }
        return this.selectionByProvisionVariantCode;
    }

    /**
     * Gets the value of the selectionByCategoryCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByCategoryCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByCategoryCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByCategoryCode }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByCategoryCode> getSelectionByCategoryCode() {
        if (selectionByCategoryCode == null) {
            selectionByCategoryCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByCategoryCode>();
        }
        return this.selectionByCategoryCode;
    }

    /**
     * Gets the value of the selectionByApproverEmployeeID property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByApproverEmployeeID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByApproverEmployeeID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployeeID
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployeeID> getSelectionByApproverEmployeeID() {
        if (selectionByApproverEmployeeID == null) {
            selectionByApproverEmployeeID = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployeeID>();
        }
        return this.selectionByApproverEmployeeID;
    }

    /**
     * Gets the value of the selectionByAccountingBusinessTransactionDate property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByAccountingBusinessTransactionDate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByAccountingBusinessTransactionDate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate> getSelectionByAccountingBusinessTransactionDate() {
        if (selectionByAccountingBusinessTransactionDate == null) {
            selectionByAccountingBusinessTransactionDate = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate>();
        }
        return this.selectionByAccountingBusinessTransactionDate;
    }

    /**
     * Gets the value of the selectionBySystemAdministrativeDataCreationDateTime
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionBySystemAdministrativeDataCreationDateTime property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionBySystemAdministrativeDataCreationDateTime().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataCreationDateTime
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataCreationDateTime> getSelectionBySystemAdministrativeDataCreationDateTime() {
        if (selectionBySystemAdministrativeDataCreationDateTime == null) {
            selectionBySystemAdministrativeDataCreationDateTime = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataCreationDateTime>();
        }
        return this.selectionBySystemAdministrativeDataCreationDateTime;
    }

    /**
     * Gets the value of the selectionBySystemAdministrativeDataLastChangeDateTime
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionBySystemAdministrativeDataLastChangeDateTime property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionBySystemAdministrativeDataLastChangeDateTime().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataLastChangeDateTime
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataLastChangeDateTime> getSelectionBySystemAdministrativeDataLastChangeDateTime() {
        if (selectionBySystemAdministrativeDataLastChangeDateTime == null) {
            selectionBySystemAdministrativeDataLastChangeDateTime = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataLastChangeDateTime>();
        }
        return this.selectionBySystemAdministrativeDataLastChangeDateTime;
    }

    /**
     * Gets the value of the selectionBySubmissionStatusCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionBySubmissionStatusCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionBySubmissionStatusCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionBySubmissionStatusCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionBySubmissionStatusCode> getSelectionBySubmissionStatusCode() {
        if (selectionBySubmissionStatusCode == null) {
            selectionBySubmissionStatusCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionBySubmissionStatusCode>();
        }
        return this.selectionBySubmissionStatusCode;
    }

    /**
     * Gets the value of the selectionByAuditStatusCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByAuditStatusCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByAuditStatusCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByAuditStatusCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByAuditStatusCode> getSelectionByAuditStatusCode() {
        if (selectionByAuditStatusCode == null) {
            selectionByAuditStatusCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByAuditStatusCode>();
        }
        return this.selectionByAuditStatusCode;
    }

    /**
     * Gets the value of the selectionByApprovalStatusCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByApprovalStatusCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByApprovalStatusCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByApprovalStatusCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByApprovalStatusCode> getSelectionByApprovalStatusCode() {
        if (selectionByApprovalStatusCode == null) {
            selectionByApprovalStatusCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByApprovalStatusCode>();
        }
        return this.selectionByApprovalStatusCode;
    }

    /**
     * Gets the value of the selectionByCancellationStatusCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByCancellationStatusCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByCancellationStatusCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByCancellationStatusCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByCancellationStatusCode> getSelectionByCancellationStatusCode() {
        if (selectionByCancellationStatusCode == null) {
            selectionByCancellationStatusCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByCancellationStatusCode>();
        }
        return this.selectionByCancellationStatusCode;
    }

    /**
     * Gets the value of the selectionByExpenseReportLifeCycleStatusCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByExpenseReportLifeCycleStatusCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByExpenseReportLifeCycleStatusCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseReportLifeCycleStatusCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseReportLifeCycleStatusCode> getSelectionByExpenseReportLifeCycleStatusCode() {
        if (selectionByExpenseReportLifeCycleStatusCode == null) {
            selectionByExpenseReportLifeCycleStatusCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseReportLifeCycleStatusCode>();
        }
        return this.selectionByExpenseReportLifeCycleStatusCode;
    }

    /**
     * Gets the value of the selectionByReimbursementStatusCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByReimbursementStatusCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByReimbursementStatusCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode> getSelectionByReimbursementStatusCode() {
        if (selectionByReimbursementStatusCode == null) {
            selectionByReimbursementStatusCode = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode>();
        }
        return this.selectionByReimbursementStatusCode;
    }

    /**
     * Gets the value of the selectionByOpenReimbursementAmount property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionByOpenReimbursementAmount property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionByOpenReimbursementAmount().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount
     * }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount> getSelectionByOpenReimbursementAmount() {
        if (selectionByOpenReimbursementAmount == null) {
            selectionByOpenReimbursementAmount = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount>();
        }
        return this.selectionByOpenReimbursementAmount;
    }

    /**
     * Gets the value of the selectionBySearchText property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the selectionBySearchText property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSelectionBySearchText().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionBySearchText }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByRequestSelectionBySearchText> getSelectionBySearchText() {
        if (selectionBySearchText == null) {
            selectionBySearchText = new ArrayList<ExpenseReportQueryByElementsSimpleByRequestSelectionBySearchText>();
        }
        return this.selectionBySearchText;
    }

}
