
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private static final QName EXPENSEREPORTCREATECONFIRMATIONSYNC_QNAME = new QName(
        "http://sap.com/xi/SAPGlobal20/Global", "ExpenseReportCreateConfirmation_sync");
    private static final QName EXPENSEREPORTCREATEREQUESTSYNC_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global",
        "ExpenseReportCreateRequest_sync");
    private static final QName EXPENSEREPORTQUERYBYELEMENTSSIMPLEBYCONFIRMATIONSYNC_QNAME = new QName(
        "http://sap.com/xi/SAPGlobal20/Global", "ExpenseReportQueryByElementsSimpleByConfirmation_sync");
    private static final QName EXPENSEREPORTQUERYBYELEMENTSSIMPLEBYREQUESTSYNC_QNAME = new QName(
        "http://sap.com/xi/SAPGlobal20/Global", "ExpenseReportQueryByElementsSimpleByRequest_sync");
    private static final QName EXPENSEREPORTREADBYIDQUERYSYNC_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global",
        "ExpenseReportReadByIDQuery_sync");
    private static final QName EXPENSEREPORTREADBYIDRESPONSESYNC_QNAME = new QName(
        "http://sap.com/xi/SAPGlobal20/Global", "ExpenseReportReadByIDResponse_sync");
    private static final QName EXPENSEREPORTUPDATECONFIRMATIONSYNC_QNAME = new QName(
        "http://sap.com/xi/SAPGlobal20/Global", "ExpenseReportUpdateConfirmation_sync");
    private static final QName EXPENSEREPORTUPDATEREQUESTSYNC_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global",
        "ExpenseReportUpdateRequest_sync");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema
     * derived classes for package: com.erpl.log.wsdl2java
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExpenseReportCreateConfirmationMessageSync }
     *
     */
    public ExpenseReportCreateConfirmationMessageSync createExpenseReportCreateConfirmationMessageSync() {
        return new ExpenseReportCreateConfirmationMessageSync();
    }

    /**
     * Create an instance of {@link ExpenseReportCreateRequestMessageSync }
     *
     */
    public ExpenseReportCreateRequestMessageSync createExpenseReportCreateRequestMessageSync() {
        return new ExpenseReportCreateRequestMessageSync();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByConfirmationMessageSync }
     *
     */
    public ExpenseReportQueryByElementsSimpleByConfirmationMessageSync createExpenseReportQueryByElementsSimpleByConfirmationMessageSync() {
        return new ExpenseReportQueryByElementsSimpleByConfirmationMessageSync();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestMessageSync }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestMessageSync createExpenseReportQueryByElementsSimpleByRequestMessageSync() {
        return new ExpenseReportQueryByElementsSimpleByRequestMessageSync();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDQueryMessageSync }
     *
     */
    public ExpenseReportReadByIDQueryMessageSync createExpenseReportReadByIDQueryMessageSync() {
        return new ExpenseReportReadByIDQueryMessageSync();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseMessageSync }
     *
     */
    public ExpenseReportReadByIDResponseMessageSync createExpenseReportReadByIDResponseMessageSync() {
        return new ExpenseReportReadByIDResponseMessageSync();
    }

    /**
     * Create an instance of {@link ExpenseReportUpdateConfirmationMessageSync }
     *
     */
    public ExpenseReportUpdateConfirmationMessageSync createExpenseReportUpdateConfirmationMessageSync() {
        return new ExpenseReportUpdateConfirmationMessageSync();
    }

    /**
     * Create an instance of {@link ExpenseReportUpdateRequestMessageSync }
     *
     */
    public ExpenseReportUpdateRequestMessageSync createExpenseReportUpdateRequestMessageSync() {
        return new ExpenseReportUpdateRequestMessageSync();
    }

    /**
     * Create an instance of {@link StandardFaultMessage }
     *
     */
    public StandardFaultMessage createStandardFaultMessage() {
        return new StandardFaultMessage();
    }

    /**
     * Create an instance of {@link ExchangeFaultData }
     *
     */
    public ExchangeFaultData createExchangeFaultData() {
        return new ExchangeFaultData();
    }

    /**
     * Create an instance of {@link StandardFaultMessageExtension }
     *
     */
    public StandardFaultMessageExtension createStandardFaultMessageExtension() {
        return new StandardFaultMessageExtension();
    }

    /**
     * Create an instance of {@link ExchangeLogData }
     *
     */
    public ExchangeLogData createExchangeLogData() {
        return new ExchangeLogData();
    }

    /**
     * Create an instance of {@link ExpenseReportCreateConfirmation }
     *
     */
    public ExpenseReportCreateConfirmation createExpenseReportCreateConfirmation() {
        return new ExpenseReportCreateConfirmation();
    }

    /**
     * Create an instance of {@link ExpenseReportCreateRequest }
     *
     */
    public ExpenseReportCreateRequest createExpenseReportCreateRequest() {
        return new ExpenseReportCreateRequest();
    }

    /**
     * Create an instance of {@link ExpenseReportCreateRequestAdvance }
     *
     */
    public ExpenseReportCreateRequestAdvance createExpenseReportCreateRequestAdvance() {
        return new ExpenseReportCreateRequestAdvance();
    }

    /**
     * Create an instance of {@link ExpenseReportCreateRequestEmployeeBankDetailsKey
     * }
     *
     */
    public ExpenseReportCreateRequestEmployeeBankDetailsKey createExpenseReportCreateRequestEmployeeBankDetailsKey() {
        return new ExpenseReportCreateRequestEmployeeBankDetailsKey();
    }

    /**
     * Create an instance of {@link ExpenseReportCreateRequestItinerarySegment }
     *
     */
    public ExpenseReportCreateRequestItinerarySegment createExpenseReportCreateRequestItinerarySegment() {
        return new ExpenseReportCreateRequestItinerarySegment();
    }

    /**
     * Create an instance of {@link ExpenseReportCreateRequestMileage }
     *
     */
    public ExpenseReportCreateRequestMileage createExpenseReportCreateRequestMileage() {
        return new ExpenseReportCreateRequestMileage();
    }

    /**
     * Create an instance of {@link ExpenseReportCreateRequestReceipt }
     *
     */
    public ExpenseReportCreateRequestReceipt createExpenseReportCreateRequestReceipt() {
        return new ExpenseReportCreateRequestReceipt();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportCreateRequestReceiptEmployeeBankDetailsKey }
     *
     */
    public ExpenseReportCreateRequestReceiptEmployeeBankDetailsKey createExpenseReportCreateRequestReceiptEmployeeBankDetailsKey() {
        return new ExpenseReportCreateRequestReceiptEmployeeBankDetailsKey();
    }

    /**
     * Create an instance of {@link ExpenseReportCreateRequestReimbursement }
     *
     */
    public ExpenseReportCreateRequestReimbursement createExpenseReportCreateRequestReimbursement() {
        return new ExpenseReportCreateRequestReimbursement();
    }

    /**
     * Create an instance of {@link ExpenseReportQueryByElementsSimpleByConfirmation
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByConfirmation createExpenseReportQueryByElementsSimpleByConfirmation() {
        return new ExpenseReportQueryByElementsSimpleByConfirmation();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByConfirmationEmployeeBankDetailsKey
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByConfirmationEmployeeBankDetailsKey createExpenseReportQueryByElementsSimpleByConfirmationEmployeeBankDetailsKey() {
        return new ExpenseReportQueryByElementsSimpleByConfirmationEmployeeBankDetailsKey();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByConfirmationStatus }
     *
     */
    public ExpenseReportQueryByElementsSimpleByConfirmationStatus createExpenseReportQueryByElementsSimpleByConfirmationStatus() {
        return new ExpenseReportQueryByElementsSimpleByConfirmationStatus();
    }

    /**
     * Create an instance of {@link ExpenseReportQueryByElementsSimpleByRequest }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequest createExpenseReportQueryByElementsSimpleByRequest() {
        return new ExpenseReportQueryByElementsSimpleByRequest();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator createExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate createExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByApprovalStatusCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByApprovalStatusCode createExpenseReportQueryByElementsSimpleByRequestSelectionByApprovalStatusCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByApprovalStatusCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployeeID
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployeeID createExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployeeID() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployeeID();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByAuditStatusCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByAuditStatusCode createExpenseReportQueryByElementsSimpleByRequestSelectionByAuditStatusCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByAuditStatusCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByCancellationStatusCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByCancellationStatusCode createExpenseReportQueryByElementsSimpleByRequestSelectionByCancellationStatusCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByCancellationStatusCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByCategoryCode }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByCategoryCode createExpenseReportQueryByElementsSimpleByRequestSelectionByCategoryCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByCategoryCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode createExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByDescription }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByDescription createExpenseReportQueryByElementsSimpleByRequestSelectionByDescription() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByDescription();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeID }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeID createExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeID() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeID();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeUUID }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeUUID createExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeUUID() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByEmployeeUUID();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID createExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID createExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyID
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyID createExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyID() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyID();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyUUID
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyUUID createExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyUUID() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyUUID();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementExpenseReporterGroupCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementExpenseReporterGroupCode createExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementExpenseReporterGroupCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementExpenseReporterGroupCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseReportLifeCycleStatusCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseReportLifeCycleStatusCode createExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseReportLifeCycleStatusCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseReportLifeCycleStatusCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByHomeCountryCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByHomeCountryCode createExpenseReportQueryByElementsSimpleByRequestSelectionByHomeCountryCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByHomeCountryCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByID }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByID createExpenseReportQueryByElementsSimpleByRequestSelectionByID() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByID();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByMaximumOvernightNumberValue
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByMaximumOvernightNumberValue createExpenseReportQueryByElementsSimpleByRequestSelectionByMaximumOvernightNumberValue() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByMaximumOvernightNumberValue();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator createExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleClassCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleClassCode createExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleClassCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleClassCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleTypeCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleTypeCode createExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleTypeCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByMileageReimbursementVehicleTypeCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount createExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByOvernightNumberValue
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByOvernightNumberValue createExpenseReportQueryByElementsSimpleByRequestSelectionByOvernightNumberValue() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByOvernightNumberValue();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentCurrencyCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentCurrencyCode createExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentCurrencyCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentCurrencyCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentFormCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentFormCode createExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentFormCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByPaymentFormCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodEndDateTime
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodEndDateTime createExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodEndDateTime() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodEndDateTime();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime createExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode createExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode createExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByReturnExpenseReportLocationCategoryCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByReturnExpenseReportLocationCategoryCode createExpenseReportQueryByElementsSimpleByRequestSelectionByReturnExpenseReportLocationCategoryCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByReturnExpenseReportLocationCategoryCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionBySearchText }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionBySearchText createExpenseReportQueryByElementsSimpleByRequestSelectionBySearchText() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionBySearchText();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayDescription
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByStayDescription createExpenseReportQueryByElementsSimpleByRequestSelectionByStayDescription() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByStayDescription();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportActivityStayTypeCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportActivityStayTypeCode createExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportActivityStayTypeCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportActivityStayTypeCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportEnterpriseStayTypeCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportEnterpriseStayTypeCode createExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportEnterpriseStayTypeCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportEnterpriseStayTypeCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode createExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationCountryCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationCountryCode createExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationCountryCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationCountryCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode createExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName createExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionBySubmissionStatusCode
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionBySubmissionStatusCode createExpenseReportQueryByElementsSimpleByRequestSelectionBySubmissionStatusCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionBySubmissionStatusCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataCreationDateTime
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataCreationDateTime createExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataCreationDateTime() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataCreationDateTime();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataLastChangeDateTime
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataLastChangeDateTime createExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataLastChangeDateTime() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionBySystemAdministrativeDataLastChangeDateTime();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByTotalMileageUnitTotalQuantity
     * }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByTotalMileageUnitTotalQuantity createExpenseReportQueryByElementsSimpleByRequestSelectionByTotalMileageUnitTotalQuantity() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByTotalMileageUnitTotalQuantity();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByTypeCode }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByTypeCode createExpenseReportQueryByElementsSimpleByRequestSelectionByTypeCode() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByTypeCode();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportQueryByElementsSimpleByRequestSelectionByUUID }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequestSelectionByUUID createExpenseReportQueryByElementsSimpleByRequestSelectionByUUID() {
        return new ExpenseReportQueryByElementsSimpleByRequestSelectionByUUID();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDQuery }
     *
     */
    public ExpenseReportReadByIDQuery createExpenseReportReadByIDQuery() {
        return new ExpenseReportReadByIDQuery();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponse }
     *
     */
    public ExpenseReportReadByIDResponse createExpenseReportReadByIDResponse() {
        return new ExpenseReportReadByIDResponse();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseAdditionalCompany }
     *
     */
    public ExpenseReportReadByIDResponseAdditionalCompany createExpenseReportReadByIDResponseAdditionalCompany() {
        return new ExpenseReportReadByIDResponseAdditionalCompany();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress }
     *
     */
    public ExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress createExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress() {
        return new ExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseAdvance }
     *
     */
    public ExpenseReportReadByIDResponseAdvance createExpenseReportReadByIDResponseAdvance() {
        return new ExpenseReportReadByIDResponseAdvance();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseApprover }
     *
     */
    public ExpenseReportReadByIDResponseApprover createExpenseReportReadByIDResponseApprover() {
        return new ExpenseReportReadByIDResponseApprover();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseApproverStatus }
     *
     */
    public ExpenseReportReadByIDResponseApproverStatus createExpenseReportReadByIDResponseApproverStatus() {
        return new ExpenseReportReadByIDResponseApproverStatus();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseAuditor }
     *
     */
    public ExpenseReportReadByIDResponseAuditor createExpenseReportReadByIDResponseAuditor() {
        return new ExpenseReportReadByIDResponseAuditor();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseAuditorStatus }
     *
     */
    public ExpenseReportReadByIDResponseAuditorStatus createExpenseReportReadByIDResponseAuditorStatus() {
        return new ExpenseReportReadByIDResponseAuditorStatus();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseCostAssignmentView
     * }
     *
     */
    public ExpenseReportReadByIDResponseCostAssignmentView createExpenseReportReadByIDResponseCostAssignmentView() {
        return new ExpenseReportReadByIDResponseCostAssignmentView();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseCreationIdentity }
     *
     */
    public ExpenseReportReadByIDResponseCreationIdentity createExpenseReportReadByIDResponseCreationIdentity() {
        return new ExpenseReportReadByIDResponseCreationIdentity();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseEmployee }
     *
     */
    public ExpenseReportReadByIDResponseEmployee createExpenseReportReadByIDResponseEmployee() {
        return new ExpenseReportReadByIDResponseEmployee();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponseEmployeeBankDetailsKey }
     *
     */
    public ExpenseReportReadByIDResponseEmployeeBankDetailsKey createExpenseReportReadByIDResponseEmployeeBankDetailsKey() {
        return new ExpenseReportReadByIDResponseEmployeeBankDetailsKey();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseEmployeeStatus }
     *
     */
    public ExpenseReportReadByIDResponseEmployeeStatus createExpenseReportReadByIDResponseEmployeeStatus() {
        return new ExpenseReportReadByIDResponseEmployeeStatus();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseExpenseArrangement
     * }
     *
     */
    public ExpenseReportReadByIDResponseExpenseArrangement createExpenseReportReadByIDResponseExpenseArrangement() {
        return new ExpenseReportReadByIDResponseExpenseArrangement();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseFunctionalUnit }
     *
     */
    public ExpenseReportReadByIDResponseFunctionalUnit createExpenseReportReadByIDResponseFunctionalUnit() {
        return new ExpenseReportReadByIDResponseFunctionalUnit();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseHistory }
     *
     */
    public ExpenseReportReadByIDResponseHistory createExpenseReportReadByIDResponseHistory() {
        return new ExpenseReportReadByIDResponseHistory();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseItinerarySegment }
     *
     */
    public ExpenseReportReadByIDResponseItinerarySegment createExpenseReportReadByIDResponseItinerarySegment() {
        return new ExpenseReportReadByIDResponseItinerarySegment();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseLastChangeIdentity
     * }
     *
     */
    public ExpenseReportReadByIDResponseLastChangeIdentity createExpenseReportReadByIDResponseLastChangeIdentity() {
        return new ExpenseReportReadByIDResponseLastChangeIdentity();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployee }
     *
     */
    public ExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployee createExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployee() {
        return new ExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployee();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployeeStatus
     * }
     *
     */
    public ExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployeeStatus createExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployeeStatus() {
        return new ExpenseReportReadByIDResponseManagingEmployeeOfApproverEmployeeStatus();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit
     * }
     *
     */
    public ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit createExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit() {
        return new ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnit();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitStatus
     * }
     *
     */
    public ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitStatus createExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitStatus() {
        return new ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitStatus();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseMileage }
     *
     */
    public ExpenseReportReadByIDResponseMileage createExpenseReportReadByIDResponseMileage() {
        return new ExpenseReportReadByIDResponseMileage();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponsePaymentHistory }
     *
     */
    public ExpenseReportReadByIDResponsePaymentHistory createExpenseReportReadByIDResponsePaymentHistory() {
        return new ExpenseReportReadByIDResponsePaymentHistory();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponsePaymentHistoryDetails }
     *
     */
    public ExpenseReportReadByIDResponsePaymentHistoryDetails createExpenseReportReadByIDResponsePaymentHistoryDetails() {
        return new ExpenseReportReadByIDResponsePaymentHistoryDetails();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponsePerDiemDeduction }
     *
     */
    public ExpenseReportReadByIDResponsePerDiemDeduction createExpenseReportReadByIDResponsePerDiemDeduction() {
        return new ExpenseReportReadByIDResponsePerDiemDeduction();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseReceipt }
     *
     */
    public ExpenseReportReadByIDResponseReceipt createExpenseReportReadByIDResponseReceipt() {
        return new ExpenseReportReadByIDResponseReceipt();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponseReceiptEmployeeBankDetailsKey }
     *
     */
    public ExpenseReportReadByIDResponseReceiptEmployeeBankDetailsKey createExpenseReportReadByIDResponseReceiptEmployeeBankDetailsKey() {
        return new ExpenseReportReadByIDResponseReceiptEmployeeBankDetailsKey();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponseReceiptExpenseReportMainReceiptKey }
     *
     */
    public ExpenseReportReadByIDResponseReceiptExpenseReportMainReceiptKey createExpenseReportReadByIDResponseReceiptExpenseReportMainReceiptKey() {
        return new ExpenseReportReadByIDResponseReceiptExpenseReportMainReceiptKey();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseReportingLineUnit }
     *
     */
    public ExpenseReportReadByIDResponseReportingLineUnit createExpenseReportReadByIDResponseReportingLineUnit() {
        return new ExpenseReportReadByIDResponseReportingLineUnit();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponseSettlementResultPostingTransaction }
     *
     */
    public ExpenseReportReadByIDResponseSettlementResultPostingTransaction createExpenseReportReadByIDResponseSettlementResultPostingTransaction() {
        return new ExpenseReportReadByIDResponseSettlementResultPostingTransaction();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportReadByIDResponseSettlementResultTotals }
     *
     */
    public ExpenseReportReadByIDResponseSettlementResultTotals createExpenseReportReadByIDResponseSettlementResultTotals() {
        return new ExpenseReportReadByIDResponseSettlementResultTotals();
    }

    /**
     * Create an instance of {@link ExpenseReportReadByIDResponseStatus }
     *
     */
    public ExpenseReportReadByIDResponseStatus createExpenseReportReadByIDResponseStatus() {
        return new ExpenseReportReadByIDResponseStatus();
    }

    /**
     * Create an instance of {@link ExpenseReportUpdateRequest }
     *
     */
    public ExpenseReportUpdateRequest createExpenseReportUpdateRequest() {
        return new ExpenseReportUpdateRequest();
    }

    /**
     * Create an instance of {@link ExpenseReportUpdateRequestAdvance }
     *
     */
    public ExpenseReportUpdateRequestAdvance createExpenseReportUpdateRequestAdvance() {
        return new ExpenseReportUpdateRequestAdvance();
    }

    /**
     * Create an instance of {@link ExpenseReportUpdateRequestEmployeeBankDetailsKey
     * }
     *
     */
    public ExpenseReportUpdateRequestEmployeeBankDetailsKey createExpenseReportUpdateRequestEmployeeBankDetailsKey() {
        return new ExpenseReportUpdateRequestEmployeeBankDetailsKey();
    }

    /**
     * Create an instance of {@link ExpenseReportUpdateRequestItinerarySegment }
     *
     */
    public ExpenseReportUpdateRequestItinerarySegment createExpenseReportUpdateRequestItinerarySegment() {
        return new ExpenseReportUpdateRequestItinerarySegment();
    }

    /**
     * Create an instance of {@link ExpenseReportUpdateRequestMileage }
     *
     */
    public ExpenseReportUpdateRequestMileage createExpenseReportUpdateRequestMileage() {
        return new ExpenseReportUpdateRequestMileage();
    }

    /**
     * Create an instance of {@link ExpenseReportUpdateRequestReceipt }
     *
     */
    public ExpenseReportUpdateRequestReceipt createExpenseReportUpdateRequestReceipt() {
        return new ExpenseReportUpdateRequestReceipt();
    }

    /**
     * Create an instance of
     * {@link ExpenseReportUpdateRequestReceiptEmployeeBankDetailsKey }
     *
     */
    public ExpenseReportUpdateRequestReceiptEmployeeBankDetailsKey createExpenseReportUpdateRequestReceiptEmployeeBankDetailsKey() {
        return new ExpenseReportUpdateRequestReceiptEmployeeBankDetailsKey();
    }

    /**
     * Create an instance of {@link ExpenseReportUpdateRequestReimbursement }
     *
     */
    public ExpenseReportUpdateRequestReimbursement createExpenseReportUpdateRequestReimbursement() {
        return new ExpenseReportUpdateRequestReimbursement();
    }

    /**
     * Create an instance of {@link MunicipalityCode }
     *
     */
    public MunicipalityCode createMunicipalityCode() {
        return new MunicipalityCode();
    }

    /**
     * Create an instance of {@link AccessAccountingCodingBlockDistribution }
     *
     */
    public AccessAccountingCodingBlockDistribution createAccessAccountingCodingBlockDistribution() {
        return new AccessAccountingCodingBlockDistribution();
    }

    /**
     * Create an instance of
     * {@link AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment
     * }
     *
     */
    public AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment createAccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment() {
        return new AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment();
    }

    /**
     * Create an instance of
     * {@link AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey
     * }
     *
     */
    public AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey createAccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey() {
        return new AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey();
    }

    /**
     * Create an instance of {@link AccountingObjectCheckItemCostObjectReference }
     *
     */
    public AccountingObjectCheckItemCostObjectReference createAccountingObjectCheckItemCostObjectReference() {
        return new AccountingObjectCheckItemCostObjectReference();
    }

    /**
     * Create an instance of {@link CodingBlockCustomField1Code }
     *
     */
    public CodingBlockCustomField1Code createCodingBlockCustomField1Code() {
        return new CodingBlockCustomField1Code();
    }

    /**
     * Create an instance of {@link CodingBlockCustomField2Code }
     *
     */
    public CodingBlockCustomField2Code createCodingBlockCustomField2Code() {
        return new CodingBlockCustomField2Code();
    }

    /**
     * Create an instance of {@link CodingBlockCustomField3Code }
     *
     */
    public CodingBlockCustomField3Code createCodingBlockCustomField3Code() {
        return new CodingBlockCustomField3Code();
    }

    /**
     * Create an instance of {@link CustomObjectID }
     *
     */
    public CustomObjectID createCustomObjectID() {
        return new CustomObjectID();
    }

    /**
     * Create an instance of {@link MaintenanceAccountingCodingBlockDistribution }
     *
     */
    public MaintenanceAccountingCodingBlockDistribution createMaintenanceAccountingCodingBlockDistribution() {
        return new MaintenanceAccountingCodingBlockDistribution();
    }

    /**
     * Create an instance of
     * {@link MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment
     * }
     *
     */
    public MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment createMaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment() {
        return new MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment();
    }

    /**
     * Create an instance of
     * {@link MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey
     * }
     *
     */
    public MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey createMaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey() {
        return new MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey();
    }

    /**
     * Create an instance of
     * {@link MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey
     * }
     *
     */
    public MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey createMaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey() {
        return new MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey();
    }

    /**
     * Create an instance of {@link AccessAttachmentFolder }
     *
     */
    public AccessAttachmentFolder createAccessAttachmentFolder() {
        return new AccessAttachmentFolder();
    }

    /**
     * Create an instance of {@link AccessAttachmentFolderDocument }
     *
     */
    public AccessAttachmentFolderDocument createAccessAttachmentFolderDocument() {
        return new AccessAttachmentFolderDocument();
    }

    /**
     * Create an instance of {@link AccessAttachmentFolderDocumentProperty }
     *
     */
    public AccessAttachmentFolderDocumentProperty createAccessAttachmentFolderDocumentProperty() {
        return new AccessAttachmentFolderDocumentProperty();
    }

    /**
     * Create an instance of
     * {@link AccessAttachmentFolderDocumentPropertyPropertyValue }
     *
     */
    public AccessAttachmentFolderDocumentPropertyPropertyValue createAccessAttachmentFolderDocumentPropertyPropertyValue() {
        return new AccessAttachmentFolderDocumentPropertyPropertyValue();
    }

    /**
     * Create an instance of {@link AccessTextCollection }
     *
     */
    public AccessTextCollection createAccessTextCollection() {
        return new AccessTextCollection();
    }

    /**
     * Create an instance of {@link AccessTextCollectionText }
     *
     */
    public AccessTextCollectionText createAccessTextCollectionText() {
        return new AccessTextCollectionText();
    }

    /**
     * Create an instance of {@link AccessTextCollectionTextTextContent }
     *
     */
    public AccessTextCollectionTextTextContent createAccessTextCollectionTextTextContent() {
        return new AccessTextCollectionTextTextContent();
    }

    /**
     * Create an instance of {@link MaintenanceAttachmentFolder }
     *
     */
    public MaintenanceAttachmentFolder createMaintenanceAttachmentFolder() {
        return new MaintenanceAttachmentFolder();
    }

    /**
     * Create an instance of {@link MaintenanceAttachmentFolderDocument }
     *
     */
    public MaintenanceAttachmentFolderDocument createMaintenanceAttachmentFolderDocument() {
        return new MaintenanceAttachmentFolderDocument();
    }

    /**
     * Create an instance of {@link MaintenanceAttachmentFolderDocumentFileContent }
     *
     */
    public MaintenanceAttachmentFolderDocumentFileContent createMaintenanceAttachmentFolderDocumentFileContent() {
        return new MaintenanceAttachmentFolderDocumentFileContent();
    }

    /**
     * Create an instance of {@link MaintenanceAttachmentFolderDocumentProperty }
     *
     */
    public MaintenanceAttachmentFolderDocumentProperty createMaintenanceAttachmentFolderDocumentProperty() {
        return new MaintenanceAttachmentFolderDocumentProperty();
    }

    /**
     * Create an instance of
     * {@link MaintenanceAttachmentFolderDocumentPropertyPropertyValue }
     *
     */
    public MaintenanceAttachmentFolderDocumentPropertyPropertyValue createMaintenanceAttachmentFolderDocumentPropertyPropertyValue() {
        return new MaintenanceAttachmentFolderDocumentPropertyPropertyValue();
    }

    /**
     * Create an instance of {@link MaintenanceTextCollection }
     *
     */
    public MaintenanceTextCollection createMaintenanceTextCollection() {
        return new MaintenanceTextCollection();
    }

    /**
     * Create an instance of {@link MaintenanceTextCollectionText }
     *
     */
    public MaintenanceTextCollectionText createMaintenanceTextCollectionText() {
        return new MaintenanceTextCollectionText();
    }

    /**
     * Create an instance of {@link MaintenanceTextCollectionTextTextContent }
     *
     */
    public MaintenanceTextCollectionTextTextContent createMaintenanceTextCollectionTextTextContent() {
        return new MaintenanceTextCollectionTextTextContent();
    }

    /**
     * Create an instance of {@link AccountingCodingBlockTypeCode }
     *
     */
    public AccountingCodingBlockTypeCode createAccountingCodingBlockTypeCode() {
        return new AccountingCodingBlockTypeCode();
    }

    /**
     * Create an instance of {@link Amount }
     *
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link BusinessDocumentBasicMessageHeader }
     *
     */
    public BusinessDocumentBasicMessageHeader createBusinessDocumentBasicMessageHeader() {
        return new BusinessDocumentBasicMessageHeader();
    }

    /**
     * Create an instance of {@link BusinessDocumentMessageID }
     *
     */
    public BusinessDocumentMessageID createBusinessDocumentMessageID() {
        return new BusinessDocumentMessageID();
    }

    /**
     * Create an instance of {@link BusinessTransactionDocumentID }
     *
     */
    public BusinessTransactionDocumentID createBusinessTransactionDocumentID() {
        return new BusinessTransactionDocumentID();
    }

    /**
     * Create an instance of {@link BusinessTransactionDocumentReference }
     *
     */
    public BusinessTransactionDocumentReference createBusinessTransactionDocumentReference() {
        return new BusinessTransactionDocumentReference();
    }

    /**
     * Create an instance of {@link BusinessTransactionDocumentTypeCode }
     *
     */
    public BusinessTransactionDocumentTypeCode createBusinessTransactionDocumentTypeCode() {
        return new BusinessTransactionDocumentTypeCode();
    }

    /**
     * Create an instance of {@link CLOSEDDatePeriod }
     *
     */
    public CLOSEDDatePeriod createCLOSEDDatePeriod() {
        return new CLOSEDDatePeriod();
    }

    /**
     * Create an instance of {@link CostObjectTypeCode }
     *
     */
    public CostObjectTypeCode createCostObjectTypeCode() {
        return new CostObjectTypeCode();
    }

    /**
     * Create an instance of {@link DatePeriod }
     *
     */
    public DatePeriod createDatePeriod() {
        return new DatePeriod();
    }

    /**
     * Create an instance of {@link Description }
     *
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link DocumentTypeCode }
     *
     */
    public DocumentTypeCode createDocumentTypeCode() {
        return new DocumentTypeCode();
    }

    /**
     * Create an instance of {@link EXTENDEDName }
     *
     */
    public EXTENDEDName createEXTENDEDName() {
        return new EXTENDEDName();
    }

    /**
     * Create an instance of {@link EmployeeID }
     *
     */
    public EmployeeID createEmployeeID() {
        return new EmployeeID();
    }

    /**
     * Create an instance of {@link ExchangeRate }
     *
     */
    public ExchangeRate createExchangeRate() {
        return new ExchangeRate();
    }

    /**
     * Create an instance of {@link ExpenseArrangementID }
     *
     */
    public ExpenseArrangementID createExpenseArrangementID() {
        return new ExpenseArrangementID();
    }

    /**
     * Create an instance of {@link ExpenseReportID }
     *
     */
    public ExpenseReportID createExpenseReportID() {
        return new ExpenseReportID();
    }

    /**
     * Create an instance of {@link FINANCIALACCOUNTINGProductTax }
     *
     */
    public FINANCIALACCOUNTINGProductTax createFINANCIALACCOUNTINGProductTax() {
        return new FINANCIALACCOUNTINGProductTax();
    }

    /**
     * Create an instance of {@link GeneralLedgerAccountAliasCode }
     *
     */
    public GeneralLedgerAccountAliasCode createGeneralLedgerAccountAliasCode() {
        return new GeneralLedgerAccountAliasCode();
    }

    /**
     * Create an instance of {@link GeneralLedgerAccountAliasCodeContextElements }
     *
     */
    public GeneralLedgerAccountAliasCodeContextElements createGeneralLedgerAccountAliasCodeContextElements() {
        return new GeneralLedgerAccountAliasCodeContextElements();
    }

    /**
     * Create an instance of {@link INTEGERQuantity }
     *
     */
    public INTEGERQuantity createINTEGERQuantity() {
        return new INTEGERQuantity();
    }

    /**
     * Create an instance of {@link IdentityID }
     *
     */
    public IdentityID createIdentityID() {
        return new IdentityID();
    }

    /**
     * Create an instance of {@link Log }
     *
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link LogItem }
     *
     */
    public LogItem createLogItem() {
        return new LogItem();
    }

    /**
     * Create an instance of {@link LogItemCategoryCode }
     *
     */
    public LogItemCategoryCode createLogItemCategoryCode() {
        return new LogItemCategoryCode();
    }

    /**
     * Create an instance of {@link LogItemNotePlaceholderSubstitutionList }
     *
     */
    public LogItemNotePlaceholderSubstitutionList createLogItemNotePlaceholderSubstitutionList() {
        return new LogItemNotePlaceholderSubstitutionList();
    }

    /**
     * Create an instance of {@link MEDIUMDescription }
     *
     */
    public MEDIUMDescription createMEDIUMDescription() {
        return new MEDIUMDescription();
    }

    /**
     * Create an instance of {@link MEDIUMName }
     *
     */
    public MEDIUMName createMEDIUMName() {
        return new MEDIUMName();
    }

    /**
     * Create an instance of {@link Measure }
     *
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link NamespaceURI }
     *
     */
    public NamespaceURI createNamespaceURI() {
        return new NamespaceURI();
    }

    /**
     * Create an instance of {@link ObjectID }
     *
     */
    public ObjectID createObjectID() {
        return new ObjectID();
    }

    /**
     * Create an instance of {@link ObjectNodeReference }
     *
     */
    public ObjectNodeReference createObjectNodeReference() {
        return new ObjectNodeReference();
    }

    /**
     * Create an instance of {@link ObjectNodeTypeCode }
     *
     */
    public ObjectNodeTypeCode createObjectNodeTypeCode() {
        return new ObjectNodeTypeCode();
    }

    /**
     * Create an instance of {@link ObjectTypeCode }
     *
     */
    public ObjectTypeCode createObjectTypeCode() {
        return new ObjectTypeCode();
    }

    /**
     * Create an instance of {@link PartyTaxID }
     *
     */
    public PartyTaxID createPartyTaxID() {
        return new PartyTaxID();
    }

    /**
     * Create an instance of {@link ProductID }
     *
     */
    public ProductID createProductID() {
        return new ProductID();
    }

    /**
     * Create an instance of {@link ProductTaxDeclarationDetails }
     *
     */
    public ProductTaxDeclarationDetails createProductTaxDeclarationDetails() {
        return new ProductTaxDeclarationDetails();
    }

    /**
     * Create an instance of {@link ProductTaxEventTypeCode }
     *
     */
    public ProductTaxEventTypeCode createProductTaxEventTypeCode() {
        return new ProductTaxEventTypeCode();
    }

    /**
     * Create an instance of {@link ProductTaxStandardClassificationCode }
     *
     */
    public ProductTaxStandardClassificationCode createProductTaxStandardClassificationCode() {
        return new ProductTaxStandardClassificationCode();
    }

    /**
     * Create an instance of {@link ProductTaxationCharacteristicsCode }
     *
     */
    public ProductTaxationCharacteristicsCode createProductTaxationCharacteristicsCode() {
        return new ProductTaxationCharacteristicsCode();
    }

    /**
     * Create an instance of {@link ProjectElementID }
     *
     */
    public ProjectElementID createProjectElementID() {
        return new ProjectElementID();
    }

    /**
     * Create an instance of {@link ProjectID }
     *
     */
    public ProjectID createProjectID() {
        return new ProjectID();
    }

    /**
     * Create an instance of {@link ProjectReference }
     *
     */
    public ProjectReference createProjectReference() {
        return new ProjectReference();
    }

    /**
     * Create an instance of {@link Quantity }
     *
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link QueryProcessingConditions }
     *
     */
    public QueryProcessingConditions createQueryProcessingConditions() {
        return new QueryProcessingConditions();
    }

    /**
     * Create an instance of {@link RegionCode }
     *
     */
    public RegionCode createRegionCode() {
        return new RegionCode();
    }

    /**
     * Create an instance of {@link ResponseProcessingConditions }
     *
     */
    public ResponseProcessingConditions createResponseProcessingConditions() {
        return new ResponseProcessingConditions();
    }

    /**
     * Create an instance of {@link SHORTDescription }
     *
     */
    public SHORTDescription createSHORTDescription() {
        return new SHORTDescription();
    }

    /**
     * Create an instance of {@link SystemAdministrativeData }
     *
     */
    public SystemAdministrativeData createSystemAdministrativeData() {
        return new SystemAdministrativeData();
    }

    /**
     * Create an instance of {@link TaxIdentificationNumberTypeCode }
     *
     */
    public TaxIdentificationNumberTypeCode createTaxIdentificationNumberTypeCode() {
        return new TaxIdentificationNumberTypeCode();
    }

    /**
     * Create an instance of {@link TaxJurisdictionCode }
     *
     */
    public TaxJurisdictionCode createTaxJurisdictionCode() {
        return new TaxJurisdictionCode();
    }

    /**
     * Create an instance of {@link TaxRateTypeCode }
     *
     */
    public TaxRateTypeCode createTaxRateTypeCode() {
        return new TaxRateTypeCode();
    }

    /**
     * Create an instance of {@link TaxTypeCode }
     *
     */
    public TaxTypeCode createTaxTypeCode() {
        return new TaxTypeCode();
    }

    /**
     * Create an instance of {@link Text }
     *
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link TextCollectionTextTypeCode }
     *
     */
    public TextCollectionTextTypeCode createTextCollectionTextTypeCode() {
        return new TextCollectionTextTypeCode();
    }

    /**
     * Create an instance of {@link UPPEROPENGLOBALDateTimePeriod }
     *
     */
    public UPPEROPENGLOBALDateTimePeriod createUPPEROPENGLOBALDateTimePeriod() {
        return new UPPEROPENGLOBALDateTimePeriod();
    }

    /**
     * Create an instance of {@link UPPEROPENLOCALDateTimePeriod }
     *
     */
    public UPPEROPENLOCALDateTimePeriod createUPPEROPENLOCALDateTimePeriod() {
        return new UPPEROPENLOCALDateTimePeriod();
    }

    /**
     * Create an instance of {@link URI }
     *
     */
    public URI createURI() {
        return new URI();
    }

    /**
     * Create an instance of {@link UUID }
     *
     */
    public UUID createUUID() {
        return new UUID();
    }

    /**
     * Create an instance of {@link WorkAgreementID }
     *
     */
    public WorkAgreementID createWorkAgreementID() {
        return new WorkAgreementID();
    }

    /**
     * Create an instance of {@link BinaryObject }
     *
     */
    public BinaryObject createBinaryObject() {
        return new BinaryObject();
    }

    /**
     * Create an instance of {@link LOCALDateTime }
     *
     */
    public LOCALDateTime createLOCALDateTime() {
        return new LOCALDateTime();
    }

    /**
     * Create an instance of {@link ExpenseReportActivityStayTypeCode }
     *
     */
    public ExpenseReportActivityStayTypeCode createExpenseReportActivityStayTypeCode() {
        return new ExpenseReportActivityStayTypeCode();
    }

    /**
     * Create an instance of {@link ExpenseReportEnterpriseStayTypeCode }
     *
     */
    public ExpenseReportEnterpriseStayTypeCode createExpenseReportEnterpriseStayTypeCode() {
        return new ExpenseReportEnterpriseStayTypeCode();
    }

    /**
     * Create an instance of {@link ExpenseReportExpenseTypeCode }
     *
     */
    public ExpenseReportExpenseTypeCode createExpenseReportExpenseTypeCode() {
        return new ExpenseReportExpenseTypeCode();
    }

    /**
     * Create an instance of {@link ExpenseReportLocationCategoryCode }
     *
     */
    public ExpenseReportLocationCategoryCode createExpenseReportLocationCategoryCode() {
        return new ExpenseReportLocationCategoryCode();
    }

    /**
     * Create an instance of {@link ExpenseReportPerDiemRegionCode }
     *
     */
    public ExpenseReportPerDiemRegionCode createExpenseReportPerDiemRegionCode() {
        return new ExpenseReportPerDiemRegionCode();
    }

    /**
     * Create an instance of {@link ExpenseReportProvisionVariantCode }
     *
     */
    public ExpenseReportProvisionVariantCode createExpenseReportProvisionVariantCode() {
        return new ExpenseReportProvisionVariantCode();
    }

    /**
     * Create an instance of {@link ExpenseReportStatutoryStayTypeCode }
     *
     */
    public ExpenseReportStatutoryStayTypeCode createExpenseReportStatutoryStayTypeCode() {
        return new ExpenseReportStatutoryStayTypeCode();
    }

    /**
     * Create an instance of {@link ExpenseReportTypeCode }
     *
     */
    public ExpenseReportTypeCode createExpenseReportTypeCode() {
        return new ExpenseReportTypeCode();
    }

    /**
     * Create an instance of {@link ExpenseReporterGroupCode }
     *
     */
    public ExpenseReporterGroupCode createExpenseReporterGroupCode() {
        return new ExpenseReporterGroupCode();
    }

    /**
     * Create an instance of {@link MileageReimbursementVehicleClassCode }
     *
     */
    public MileageReimbursementVehicleClassCode createMileageReimbursementVehicleClassCode() {
        return new MileageReimbursementVehicleClassCode();
    }

    /**
     * Create an instance of {@link MileageReimbursementVehicleTypeCode }
     *
     */
    public MileageReimbursementVehicleTypeCode createMileageReimbursementVehicleTypeCode() {
        return new MileageReimbursementVehicleTypeCode();
    }

    /**
     * Create an instance of {@link TripServiceProviderCode }
     *
     */
    public TripServiceProviderCode createTripServiceProviderCode() {
        return new TripServiceProviderCode();
    }

    /**
     * Create an instance of {@link IntegrationTypeCode }
     *
     */
    public IntegrationTypeCode createIntegrationTypeCode() {
        return new IntegrationTypeCode();
    }

    /**
     * Create an instance of {@link InvoiceLegallyAuthorisedLongID }
     *
     */
    public InvoiceLegallyAuthorisedLongID createInvoiceLegallyAuthorisedLongID() {
        return new InvoiceLegallyAuthorisedLongID();
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ExpenseReportCreateConfirmationMessageSync }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link ExpenseReportCreateConfirmationMessageSync
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "ExpenseReportCreateConfirmation_sync")
    public JAXBElement<ExpenseReportCreateConfirmationMessageSync> createExpenseReportCreateConfirmationSync(
        final ExpenseReportCreateConfirmationMessageSync value) {
        return new JAXBElement<ExpenseReportCreateConfirmationMessageSync>(EXPENSEREPORTCREATECONFIRMATIONSYNC_QNAME,
            ExpenseReportCreateConfirmationMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ExpenseReportCreateRequestMessageSync }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link ExpenseReportCreateRequestMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "ExpenseReportCreateRequest_sync")
    public JAXBElement<ExpenseReportCreateRequestMessageSync> createExpenseReportCreateRequestSync(
        final ExpenseReportCreateRequestMessageSync value) {
        return new JAXBElement<ExpenseReportCreateRequestMessageSync>(EXPENSEREPORTCREATEREQUESTSYNC_QNAME,
            ExpenseReportCreateRequestMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ExpenseReportQueryByElementsSimpleByConfirmationMessageSync
     * }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement
     *         }{@code <}{@link ExpenseReportQueryByElementsSimpleByConfirmationMessageSync
     *         }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "ExpenseReportQueryByElementsSimpleByConfirmation_sync")
    public JAXBElement<ExpenseReportQueryByElementsSimpleByConfirmationMessageSync> createExpenseReportQueryByElementsSimpleByConfirmationSync(
        final ExpenseReportQueryByElementsSimpleByConfirmationMessageSync value) {
        return new JAXBElement<ExpenseReportQueryByElementsSimpleByConfirmationMessageSync>(
            EXPENSEREPORTQUERYBYELEMENTSSIMPLEBYCONFIRMATIONSYNC_QNAME,
            ExpenseReportQueryByElementsSimpleByConfirmationMessageSync.class, null, value);
    }

    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "ExpenseReportQueryByElementsSimpleByRequest_sync")
    public JAXBElement<ExpenseReportQueryByElementsSimpleByRequestMessageSync> createExpenseReportQueryByElementsSimpleByRequestSync(
        final ExpenseReportQueryByElementsSimpleByRequestMessageSync value) {
        return new JAXBElement<ExpenseReportQueryByElementsSimpleByRequestMessageSync>(
            EXPENSEREPORTQUERYBYELEMENTSSIMPLEBYREQUESTSYNC_QNAME,
            ExpenseReportQueryByElementsSimpleByRequestMessageSync.class, null, value);
    }

    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "ExpenseReportReadByIDQuery_sync")
    public JAXBElement<ExpenseReportReadByIDQueryMessageSync> createExpenseReportReadByIDQuerySync(
        final ExpenseReportReadByIDQueryMessageSync value) {
        return new JAXBElement<ExpenseReportReadByIDQueryMessageSync>(EXPENSEREPORTREADBYIDQUERYSYNC_QNAME,
            ExpenseReportReadByIDQueryMessageSync.class, null, value);
    }

    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "ExpenseReportReadByIDResponse_sync")
    public JAXBElement<ExpenseReportReadByIDResponseMessageSync> createExpenseReportReadByIDResponseSync(
        final ExpenseReportReadByIDResponseMessageSync value) {
        return new JAXBElement<ExpenseReportReadByIDResponseMessageSync>(EXPENSEREPORTREADBYIDRESPONSESYNC_QNAME,
            ExpenseReportReadByIDResponseMessageSync.class, null, value);
    }

    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "ExpenseReportUpdateConfirmation_sync")
    public JAXBElement<ExpenseReportUpdateConfirmationMessageSync> createExpenseReportUpdateConfirmationSync(
        final ExpenseReportUpdateConfirmationMessageSync value) {
        return new JAXBElement<ExpenseReportUpdateConfirmationMessageSync>(EXPENSEREPORTUPDATECONFIRMATIONSYNC_QNAME,
            ExpenseReportUpdateConfirmationMessageSync.class, null, value);
    }

    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "ExpenseReportUpdateRequest_sync")
    public JAXBElement<ExpenseReportUpdateRequestMessageSync> createExpenseReportUpdateRequestSync(
        final ExpenseReportUpdateRequestMessageSync value) {
        return new JAXBElement<ExpenseReportUpdateRequestMessageSync>(EXPENSEREPORTUPDATEREQUESTSYNC_QNAME,
            ExpenseReportUpdateRequestMessageSync.class, null, value);
    }

}
