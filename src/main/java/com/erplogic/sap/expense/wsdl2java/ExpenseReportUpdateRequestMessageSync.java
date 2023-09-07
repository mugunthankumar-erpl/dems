
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExpenseReportUpdateRequestMessage_sync complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportUpdateRequestMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicMessageHeader" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentBasicMessageHeader"/&gt;
 *         &lt;element name="ExpenseReport" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportUpdateRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportUpdateRequestMessage_sync", propOrder = {"basicMessageHeader", "expenseReport"})
public class ExpenseReportUpdateRequestMessageSync {

    @XmlElement(name = "BasicMessageHeader", required = true)
    private BusinessDocumentBasicMessageHeader basicMessageHeader;
    @XmlElement(name = "ExpenseReport", required = true)
    private ExpenseReportUpdateRequest expenseReport;

    /**
     * Gets the value of the basicMessageHeader property.
     *
     * @return possible object is {@link BusinessDocumentBasicMessageHeader }
     *
     */
    public BusinessDocumentBasicMessageHeader getBasicMessageHeader() {
        return basicMessageHeader;
    }

    /**
     * Sets the value of the basicMessageHeader property.
     *
     * @param value allowed object is {@link BusinessDocumentBasicMessageHeader }
     *
     */
    public void setBasicMessageHeader(final BusinessDocumentBasicMessageHeader value) {
        this.basicMessageHeader = value;
    }

    /**
     * Gets the value of the expenseReport property.
     *
     * @return possible object is {@link ExpenseReportUpdateRequest }
     *
     */
    public ExpenseReportUpdateRequest getExpenseReport() {
        return expenseReport;
    }

    /**
     * Sets the value of the expenseReport property.
     *
     * @param value allowed object is {@link ExpenseReportUpdateRequest }
     *
     */
    public void setExpenseReport(final ExpenseReportUpdateRequest value) {
        this.expenseReport = value;
    }

}
