
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExpenseReportCreateRequestAdvance complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportCreateRequestAdvance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportCreateRequestAdvance", propOrder = {"amount", "paymentAmount", "description"})
public class ExpenseReportCreateRequestAdvance {

    @XmlElement(name = "Amount")
    private Amount amount;
    @XmlElement(name = "PaymentAmount")
    private Amount paymentAmount;
    @XmlElement(name = "Description")
    private String description;

    /**
     * Gets the value of the amount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setAmount(final Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setPaymentAmount(final Amount value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescription(final String value) {
        this.description = value;
    }

}
