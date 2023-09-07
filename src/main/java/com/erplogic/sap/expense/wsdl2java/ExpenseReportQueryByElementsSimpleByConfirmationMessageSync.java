
package com.erplogic.sap.expense.wsdl2java;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExpenseReportQueryByElementsSimpleByConfirmationMessage_sync
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByConfirmationMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpenseReport" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByConfirmation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}ResponseProcessingConditions"/&gt;
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
@XmlType(name = "ExpenseReportQueryByElementsSimpleByConfirmationMessage_sync", propOrder = {"expenseReport",
    "processingConditions", "log"})
public class ExpenseReportQueryByElementsSimpleByConfirmationMessageSync {

    @XmlElement(name = "ExpenseReport")
    private List<ExpenseReportQueryByElementsSimpleByConfirmation> expenseReport;
    @XmlElement(name = "ProcessingConditions", required = true)
    private ResponseProcessingConditions processingConditions;
    @XmlElement(name = "Log", required = true)
    private Log log;

    /**
     * Gets the value of the expenseReport property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the expenseReport property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getExpenseReport().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseReportQueryByElementsSimpleByConfirmation }
     *
     *
     */
    public List<ExpenseReportQueryByElementsSimpleByConfirmation> getExpenseReport() {
        if (expenseReport == null) {
            expenseReport = new ArrayList<ExpenseReportQueryByElementsSimpleByConfirmation>();
        }
        return this.expenseReport;
    }

    /**
     * Gets the value of the processingConditions property.
     *
     * @return possible object is {@link ResponseProcessingConditions }
     *
     */
    public ResponseProcessingConditions getProcessingConditions() {
        return processingConditions;
    }

    /**
     * Sets the value of the processingConditions property.
     *
     * @param value allowed object is {@link ResponseProcessingConditions }
     *
     */
    public void setProcessingConditions(final ResponseProcessingConditions value) {
        this.processingConditions = value;
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
