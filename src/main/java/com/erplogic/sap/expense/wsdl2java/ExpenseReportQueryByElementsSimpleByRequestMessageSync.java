
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExpenseReportQueryByElementsSimpleByRequestMessage_sync
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpenseReportSimpleSelectionBy" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportQueryByElementsSimpleByRequest"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestMessage_sync", propOrder = {
    "expenseReportSimpleSelectionBy", "processingConditions"})
public class ExpenseReportQueryByElementsSimpleByRequestMessageSync {

    @XmlElement(name = "ExpenseReportSimpleSelectionBy", required = true)
    private ExpenseReportQueryByElementsSimpleByRequest expenseReportSimpleSelectionBy;
    @XmlElement(name = "ProcessingConditions", required = true)
    private QueryProcessingConditions processingConditions;

    /**
     * Gets the value of the expenseReportSimpleSelectionBy property.
     *
     * @return possible object is {@link ExpenseReportQueryByElementsSimpleByRequest
     *         }
     *
     */
    public ExpenseReportQueryByElementsSimpleByRequest getExpenseReportSimpleSelectionBy() {
        return expenseReportSimpleSelectionBy;
    }

    /**
     * Sets the value of the expenseReportSimpleSelectionBy property.
     *
     * @param value allowed object is
     *              {@link ExpenseReportQueryByElementsSimpleByRequest }
     *
     */
    public void setExpenseReportSimpleSelectionBy(final ExpenseReportQueryByElementsSimpleByRequest value) {
        this.expenseReportSimpleSelectionBy = value;
    }

    /**
     * Gets the value of the processingConditions property.
     *
     * @return possible object is {@link QueryProcessingConditions }
     *
     */
    public QueryProcessingConditions getProcessingConditions() {
        return processingConditions;
    }

    /**
     * Sets the value of the processingConditions property.
     *
     * @param value allowed object is {@link QueryProcessingConditions }
     *
     */
    public void setProcessingConditions(final QueryProcessingConditions value) {
        this.processingConditions = value;
    }

}
