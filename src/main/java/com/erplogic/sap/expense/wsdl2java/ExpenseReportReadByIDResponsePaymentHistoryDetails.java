
package com.erplogic.sap.expense.wsdl2java;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ExpenseReportReadByIDResponsePaymentHistoryDetails complex
 * type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponsePaymentHistoryDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrdinalNumberValue_V1" type="{http://sap.com/xi/AP/Common/GDT}OrdinalNumberValue_V1" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseReportActionHistoryPaymentID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportActionHistoryPaymentID" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseReportPaymentProcessStepCode" type="{http://sap.com/xi/AP/Common/Global}ExpenseReportPaymentProcessStepCode" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseReportPaymentProcessStepName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponsePaymentHistoryDetails", propOrder = {"ordinalNumberValueV1",
    "expenseReportActionHistoryPaymentID", "expenseReportPaymentProcessStepCode", "expenseReportPaymentProcessStepName",
    "date"})
public class ExpenseReportReadByIDResponsePaymentHistoryDetails {

    @XmlElement(name = "OrdinalNumberValue_V1")
    private BigDecimal ordinalNumberValueV1;
    @XmlElement(name = "ExpenseReportActionHistoryPaymentID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String expenseReportActionHistoryPaymentID;
    @XmlElement(name = "ExpenseReportPaymentProcessStepCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String expenseReportPaymentProcessStepCode;
    @XmlElement(name = "ExpenseReportPaymentProcessStepName")
    private String expenseReportPaymentProcessStepName;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar date;

    /**
     * Gets the value of the ordinalNumberValueV1 property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getOrdinalNumberValueV1() {
        return ordinalNumberValueV1;
    }

    /**
     * Sets the value of the ordinalNumberValueV1 property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setOrdinalNumberValueV1(final BigDecimal value) {
        this.ordinalNumberValueV1 = value;
    }

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
     * Gets the value of the expenseReportPaymentProcessStepCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExpenseReportPaymentProcessStepCode() {
        return expenseReportPaymentProcessStepCode;
    }

    /**
     * Sets the value of the expenseReportPaymentProcessStepCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setExpenseReportPaymentProcessStepCode(final String value) {
        this.expenseReportPaymentProcessStepCode = value;
    }

    /**
     * Gets the value of the expenseReportPaymentProcessStepName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExpenseReportPaymentProcessStepName() {
        return expenseReportPaymentProcessStepName;
    }

    /**
     * Sets the value of the expenseReportPaymentProcessStepName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setExpenseReportPaymentProcessStepName(final String value) {
        this.expenseReportPaymentProcessStepName = value;
    }

    /**
     * Gets the value of the date property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDate(final XMLGregorianCalendar value) {
        this.date = value;
    }

}
