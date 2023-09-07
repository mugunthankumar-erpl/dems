
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
 * Java class for ExpenseReportReadByIDResponseAdvance complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseAdvance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportAdvanceID" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://sap.com/xi/AP/Common/GDT}ExchangeRate" minOccurs="0"/&gt;
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
@XmlType(name = "ExpenseReportReadByIDResponseAdvance", propOrder = {"uuid", "id", "amount", "paymentAmount",
    "exchangeRate", "description"})
public class ExpenseReportReadByIDResponseAdvance {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String id;
    @XmlElement(name = "Amount")
    private Amount amount;
    @XmlElement(name = "PaymentAmount")
    private Amount paymentAmount;
    @XmlElement(name = "ExchangeRate")
    private ExchangeRate exchangeRate;
    @XmlElement(name = "Description")
    private String description;

    /**
     * Gets the value of the uuid property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setUUID(final UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setID(final String value) {
        this.id = value;
    }

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
     * Gets the value of the exchangeRate property.
     *
     * @return possible object is {@link ExchangeRate }
     *
     */
    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     *
     * @param value allowed object is {@link ExchangeRate }
     *
     */
    public void setExchangeRate(final ExchangeRate value) {
        this.exchangeRate = value;
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
