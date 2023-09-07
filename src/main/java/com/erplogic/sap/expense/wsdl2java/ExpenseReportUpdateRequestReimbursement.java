
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ExpenseReportUpdateRequestReimbursement complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportUpdateRequestReimbursement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DueClearingID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="DueClearingUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="CancelledIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ClearingDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportUpdateRequestReimbursement", propOrder = {"dueClearingID", "dueClearingUUID",
    "reimbursementAmount", "cancelledIndicator", "clearingDate"})
public class ExpenseReportUpdateRequestReimbursement {

    @XmlElement(name = "DueClearingID")
    private BusinessTransactionDocumentID dueClearingID;
    @XmlElement(name = "DueClearingUUID")
    private UUID dueClearingUUID;
    @XmlElement(name = "ReimbursementAmount")
    private Amount reimbursementAmount;
    @XmlElement(name = "CancelledIndicator")
    private Boolean cancelledIndicator;
    @XmlElement(name = "ClearingDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar clearingDate;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String actionCode;

    /**
     * Gets the value of the dueClearingID property.
     *
     * @return possible object is {@link BusinessTransactionDocumentID }
     *
     */
    public BusinessTransactionDocumentID getDueClearingID() {
        return dueClearingID;
    }

    /**
     * Sets the value of the dueClearingID property.
     *
     * @param value allowed object is {@link BusinessTransactionDocumentID }
     *
     */
    public void setDueClearingID(final BusinessTransactionDocumentID value) {
        this.dueClearingID = value;
    }

    /**
     * Gets the value of the dueClearingUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getDueClearingUUID() {
        return dueClearingUUID;
    }

    /**
     * Sets the value of the dueClearingUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setDueClearingUUID(final UUID value) {
        this.dueClearingUUID = value;
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
     * Gets the value of the cancelledIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isCancelledIndicator() {
        return cancelledIndicator;
    }

    /**
     * Sets the value of the cancelledIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setCancelledIndicator(final Boolean value) {
        this.cancelledIndicator = value;
    }

    /**
     * Gets the value of the clearingDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getClearingDate() {
        return clearingDate;
    }

    /**
     * Sets the value of the clearingDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setClearingDate(final XMLGregorianCalendar value) {
        this.clearingDate = value;
    }

    /**
     * Gets the value of the actionCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setActionCode(final String value) {
        this.actionCode = value;
    }

}
