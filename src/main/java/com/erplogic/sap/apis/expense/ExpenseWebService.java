package com.erplogic.sap.apis.expense;

import java.math.BigDecimal;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

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

    private static final String WEB_SERVICE_URL = "https://my350410.sapbydesign.com/sap/bc/srt/scs/sap/yygcbelcoy_expensereportws";
    private static final String WEB_SERVICE_USERNAME = "_QUERYCODELI";
    private static final String WEB_SERVICE_PASSWORD = "Welcome1";

    public ExpenseReportCreateRequestMessageSync createRequest() throws DatatypeConfigurationException {
        final ExpenseReportCreateRequestMessageSync req = new ExpenseReportCreateRequestMessageSync();
        final ExpenseReportCreateRequest req1 = new ExpenseReportCreateRequest();
        final EmployeeID emp = new EmployeeID();
        final ExpenseReportTypeCode typeCode = new ExpenseReportTypeCode();
        final ExpenseReportCreateRequestReceipt receipt = new ExpenseReportCreateRequestReceipt();
        final ExpenseReportExpenseTypeCode t = new ExpenseReportExpenseTypeCode();
        final Amount a = new Amount();

        final DocumentTypeCode docType = new DocumentTypeCode();
        final MaintenanceAccountingCodingBlockDistribution block = new MaintenanceAccountingCodingBlockDistribution();
        final MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment codeBlock = new MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment();
        final Description des = new Description();
        final Amount amt = new Amount();
        final AccountingCodingBlockTypeCode blockType = new AccountingCodingBlockTypeCode();
        final MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey taskKey = new MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey();
        final ProjectElementID id = new ProjectElementID();
        final ProjectReference ref = new ProjectReference();
        final ProjectID proId = new ProjectID();

        emp.setValue("E0805");
        typeCode.setValue("01");
        req1.setDescription("P:Out of Packet");
        req1.setNote("AR:Out of Packet");
        t.setValue("OTH");
        a.setCurrencyCode("INR");
        a.setValue(new BigDecimal("250.00"));
        receipt.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2023-03-15"));
        receipt.setStayLocationCountryCode("IN");

        docType.setValue("1000");

        des.setValue("A23");
        block.setActionCode("01");
        block.setLanguageCode("EN");
        codeBlock.setActionCode("01");
        codeBlock.setPercent(new BigDecimal("100"));
        amt.setCurrencyCode("USD");
        blockType.setValue("PRO");
        id.setValue("CPSO61");
        proId.setValue("CPSO61");

        final MaintenanceAttachmentFolder attach = new MaintenanceAttachmentFolder();
        final MaintenanceAttachmentFolderDocument document = new MaintenanceAttachmentFolderDocument();
        req1.setAttachmentFolder(attach);
        for (final MaintenanceAttachmentFolderDocument doc : attach.getDocument()) {

            doc.setVisibleIndicator(true);
            doc.setCategoryCode("2");
            doc.setMIMECode("text/plain");
            doc.setName("TestData");
            doc.setAlternativeName("A145");
            doc.setDescription(des);
        }
        attach.getDocument().add(document);

        req1.setEmployeeID(emp);
        req1.setTypeCode(typeCode);
        req1.getReceipt().add(receipt);
        receipt.setExpenseReportExpenseTypeCode(t);
        receipt.setAmount(a);

        req1.setAccountingCodingBlockDistribution(block);
        block.getAccountingCodingBlockAssignment().add(codeBlock);
        codeBlock.setAmount(amt);
        codeBlock.setAccountingCodingBlockTypeCode(blockType);
        codeBlock.setProjectTaskKey(taskKey);
        taskKey.setTaskID(id);
        codeBlock.setProjectReference(ref);
        ref.setProjectID(proId);
        req.setExpenseReport(req1);
        return req;
    }

    public ExpenseReportCreateConfirmation createResponse()
        throws StandardFaultMessageException, DatatypeConfigurationException {

        final SoapConnection connection = new SoapConnection(WEB_SERVICE_URL, WEB_SERVICE_USERNAME,
            WEB_SERVICE_PASSWORD, YGCBELCOYExpenseReportWS.class);

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
