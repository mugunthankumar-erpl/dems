
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExpenseReportReadByIDQueryMessage_sync complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDQueryMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpenseReport" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportReadByIDQuery"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDQueryMessage_sync", propOrder = {"expenseReport"})
public class ExpenseReportReadByIDQueryMessageSync {

    @XmlElement(name = "ExpenseReport", required = true)
    private ExpenseReportReadByIDQuery expenseReport;

    /**
     * Gets the value of the expenseReport property.
     *
     * @return possible object is {@link ExpenseReportReadByIDQuery }
     *
     */
    public ExpenseReportReadByIDQuery getExpenseReport() {
        return expenseReport;
    }

    /**
     * Sets the value of the expenseReport property.
     *
     * @param value allowed object is {@link ExpenseReportReadByIDQuery }
     *
     */
    public void setExpenseReport(final ExpenseReportReadByIDQuery value) {
        this.expenseReport = value;
    }

}
