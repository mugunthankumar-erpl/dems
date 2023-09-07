
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExpenseReportCreateConfirmationMessage_sync complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportCreateConfirmationMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpenseReport" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportCreateConfirmation" minOccurs="0"/&gt;
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportCreateConfirmationMessage_sync", propOrder = {"expenseReport", "log"})
public class ExpenseReportCreateConfirmationMessageSync {

    @XmlElement(name = "ExpenseReport")
    private ExpenseReportCreateConfirmation expenseReport;
    @XmlElement(name = "Log", required = true)
    private Log log;

    /**
     * Gets the value of the expenseReport property.
     *
     * @return possible object is {@link ExpenseReportCreateConfirmation }
     *
     */
    public ExpenseReportCreateConfirmation getExpenseReport() {
        return expenseReport;
    }

    /**
     * Sets the value of the expenseReport property.
     *
     * @param value allowed object is {@link ExpenseReportCreateConfirmation }
     *
     */
    public void setExpenseReport(final ExpenseReportCreateConfirmation value) {
        this.expenseReport = value;
    }

    /**
     * Gets the value of the log property.
     *
     * @return possible object is {@link Log }
     *
     */
    public Log getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     *
     * @param value allowed object is {@link Log }
     *
     */
    public void setLog(final Log value) {
        this.log = value;
    }

}
