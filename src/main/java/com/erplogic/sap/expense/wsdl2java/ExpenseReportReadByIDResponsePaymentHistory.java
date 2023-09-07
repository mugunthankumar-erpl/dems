
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for ExpenseReportReadByIDResponsePaymentHistory complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponsePaymentHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpenseReportActionHistoryPaymentID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportActionHistoryPaymentID" minOccurs="0"/&gt;
 *         &lt;element name="RequestedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AdvanceAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="DeductedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PaidAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponsePaymentHistory", propOrder = {"expenseReportActionHistoryPaymentID",
    "requestedAmount", "advanceAmount", "deductedAmount", "reimbursementAmount", "paidAmount"})
public class ExpenseReportReadByIDResponsePaymentHistory {

    @XmlElement(name = "ExpenseReportActionHistoryPaymentID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String expenseReportActionHistoryPaymentID;
    @XmlElement(name = "RequestedAmount")
    private Amount requestedAmount;
    @XmlElement(name = "AdvanceAmount")
    private Amount advanceAmount;
    @XmlElement(name = "DeductedAmount")
    private Amount deductedAmount;
    @XmlElement(name = "ReimbursementAmount")
    private Amount reimbursementAmount;
    @XmlElement(name = "PaidAmount")
    private Amount paidAmount;

    /**
     * Gets the value of the expenseReportActionHistoryPaymentID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExpenseReportActionHistoryPaymentID() {
        return expenseReportActionHistoryPaymentID;
    }

    /**
     * Sets the value of the expenseReportActionHistoryPaymentID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setExpenseReportActionHistoryPaymentID(final String value) {
        this.expenseReportActionHistoryPaymentID = value;
    }

    /**
     * Gets the value of the requestedAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Sets the value of the requestedAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setRequestedAmount(final Amount value) {
        this.requestedAmount = value;
    }

    /**
     * Gets the value of the advanceAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getAdvanceAmount() {
        return advanceAmount;
    }

    /**
     * Sets the value of the advanceAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setAdvanceAmount(final Amount value) {
        this.advanceAmount = value;
    }

    /**
     * Gets the value of the deductedAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getDeductedAmount() {
        return deductedAmount;
    }

    /**
     * Sets the value of the deductedAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setDeductedAmount(final Amount value) {
        this.deductedAmount = value;
    }

    /**
     * Gets the value of the reimbursementAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getReimbursementAmount() {
        return reimbursementAmount;
    }

    /**
     * Sets the value of the reimbursementAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setReimbursementAmount(final Amount value) {
        this.reimbursementAmount = value;
    }

    /**
     * Gets the value of the paidAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setPaidAmount(final Amount value) {
        this.paidAmount = value;
    }

}
