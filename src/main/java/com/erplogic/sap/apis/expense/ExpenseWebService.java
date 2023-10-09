package com.erplogic.sap.apis.expense;

import java.math.BigDecimal;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import com.erplogic.sap.apis.Constants;
import com.erplogic.sap.apis.JaxbToXml;
import com.erplogic.sap.apis.SoapConnection;
import com.erplogic.sap.expense.wsdl2java.AccountingCodingBlockTypeCode;
import com.erplogic.sap.expense.wsdl2java.Amount;
import com.erplogic.sap.expense.wsdl2java.Description;
import com.erplogic.sap.expense.wsdl2java.DocumentTypeCode;
import com.erplogic.sap.expense.wsdl2java.EmployeeID;
import com.erplogic.sap.expense.wsdl2java.ExpenseReportCreateConfirmation;
import com.erplogic.sap.expense.wsdl2java.ExpenseReportCreateConfirmationMessageSync;
import com.erplogic.sap.expense.wsdl2java.ExpenseReportCreateRequest;
import com.erplogic.sap.expense.wsdl2java.ExpenseReportCreateRequestMessageSync;
import com.erplogic.sap.expense.wsdl2java.ExpenseReportCreateRequestReceipt;
import com.erplogic.sap.expense.wsdl2java.ExpenseReportExpenseTypeCode;
import com.erplogic.sap.expense.wsdl2java.ExpenseReportTypeCode;
import com.erplogic.sap.expense.wsdl2java.MaintenanceAccountingCodingBlockDistribution;
import com.erplogic.sap.expense.wsdl2java.MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment;
import com.erplogic.sap.expense.wsdl2java.MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey;
import com.erplogic.sap.expense.wsdl2java.MaintenanceAttachmentFolder;
import com.erplogic.sap.expense.wsdl2java.MaintenanceAttachmentFolderDocument;
import com.erplogic.sap.expense.wsdl2java.ProjectElementID;
import com.erplogic.sap.expense.wsdl2java.ProjectID;
import com.erplogic.sap.expense.wsdl2java.ProjectReference;
import com.erplogic.sap.expense.wsdl2java.StandardFaultMessageException;
import com.erplogic.sap.expense.wsdl2java.YGCBELCOYExpenseReportWS;

public class ExpenseWebService {

    public ExpenseReportCreateRequestMessageSync createRequest() throws DatatypeConfigurationException {
        final ExpenseReportCreateRequestMessageSync req = new ExpenseReportCreateRequestMessageSync();
        final ExpenseReportCreateRequest req1 = new ExpenseReportCreateRequest();
        req.setExpenseReport(req1);
        final EmployeeID empId = new EmployeeID();
        req1.setEmployeeID(empId);
        empId.setValue("E0805");
        final ExpenseReportTypeCode typeCode = new ExpenseReportTypeCode();
        typeCode.setValue("02");
        req1.setTypeCode(typeCode);
        req1.setDescription("P:Out of Packet");
        req1.setNote("AR:Out of Packet");
        req1.setPaymentFormCode("06");

        final ExpenseReportCreateRequestReceipt receipt = new ExpenseReportCreateRequestReceipt();
        req1.getReceipt().add(receipt);

        final ExpenseReportExpenseTypeCode expTypeCode = new ExpenseReportExpenseTypeCode();
        receipt.setExpenseReportExpenseTypeCode(expTypeCode);
        expTypeCode.setValue("OTH");
        final Amount amount = new Amount();
        receipt.setAmount(amount);
        amount.setValue(new BigDecimal("250.00"));
        amount.setCurrencyCode("INR");
        receipt.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2023-10-03"));
        receipt.setStayLocationCountryCode("IN");

        final MaintenanceAttachmentFolder f = new MaintenanceAttachmentFolder();
        receipt.setAttachmentFolder(f);

        final MaintenanceAttachmentFolderDocument document = new MaintenanceAttachmentFolderDocument();
        // f.getDocument().add(doc);
        for (final MaintenanceAttachmentFolderDocument doc : f.getDocument()) {
            doc.setVisibleIndicator(true);
            doc.setCategoryCode("2");
            final DocumentTypeCode docTypeCode = new DocumentTypeCode();
            doc.setTypeCode(docTypeCode);
            docTypeCode.setValue("10001");
            doc.setMIMECode("text/plain");
            doc.setName("TestData");
            doc.setAlternativeName("A145");
            final Description des = new Description();
            doc.setDescription(des);
            des.setValue("A23");
        }
        final MaintenanceAccountingCodingBlockDistribution code = new MaintenanceAccountingCodingBlockDistribution();

        receipt.setAccountingCodingBlockDistribution(code);
        code.setLanguageCode("EN");
        final MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment block = new MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment();
        code.getAccountingCodingBlockAssignment().add(block);
        block.setPercent(new BigDecimal("100"));
        final Amount a = new Amount();
        block.setAmount(a);
        a.setValue(new BigDecimal("20"));
        a.setCurrencyCode("INR");
        final AccountingCodingBlockTypeCode blockTypeCode = new AccountingCodingBlockTypeCode();
        block.setAccountingCodingBlockTypeCode(blockTypeCode);
        blockTypeCode.setValue("PRO");

        final MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey taskKey = new MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey();
        block.setProjectTaskKey(taskKey);
        final ProjectElementID elementId = new ProjectElementID();
        taskKey.setTaskID(elementId);
        elementId.setValue("CPSO61");

        final ProjectReference ref = new ProjectReference();
        block.setProjectReference(ref);
        final ProjectID projectId = new ProjectID();
        ref.setProjectID(projectId);
        projectId.setValue("CPSO61");

        JaxbToXml.jaxbObjectToXML(req, ExpenseReportCreateRequestMessageSync.class,
            ExpenseReportCreateRequestMessageSync.class.getName());
        return req;
    }

    public ExpenseReportCreateConfirmation createResponse()
        throws StandardFaultMessageException, DatatypeConfigurationException {

        final SoapConnection connection = new SoapConnection(Constants.WEBSERVICE_URL, Constants.WEBSERVICE_USER_NAME,
            Constants.WEBSERVICE_PASSWORD, YGCBELCOYExpenseReportWS.class);

        final YGCBELCOYExpenseReportWS createExpenseId = (YGCBELCOYExpenseReportWS) connection.getFactoryBean()
            .create();

        connection.connect(createExpenseId);

        final ExpenseReportCreateConfirmationMessageSync response = createExpenseId.create(createRequest());

        JaxbToXml.jaxbObjectToXML(response, ExpenseReportCreateConfirmationMessageSync.class,
            ExpenseReportCreateConfirmationMessageSync.class.getName());

        final ExpenseReportCreateConfirmation expense = response.getExpenseReport();

        return expense;

    }
}
