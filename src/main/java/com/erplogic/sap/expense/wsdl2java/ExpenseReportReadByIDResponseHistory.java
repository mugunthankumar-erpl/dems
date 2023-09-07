
package com.erplogic.sap.expense.wsdl2java;

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
 * Java class for ExpenseReportReadByIDResponseHistory complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastChangeDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastChangeIdentityUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionStatusCode" type="{http://sap.com/xi/AP/Common/GDT}SubmissionStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionStatusName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="AuditStatusCode" type="{http://sap.com/xi/AP/Common/GDT}AuditStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="AuditStatusName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ApprovalStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalStatusName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="CancellationStatusCode" type="{http://sap.com/xi/AP/Common/GDT}CancellationStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="CancellationStatusName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseReportLifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseReportLifeCycleStatusName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="SettlementResultPostingProcessStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ProcessingStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="SettlementResultPostingProcessStatusName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseHistory", propOrder = {"lastChangeDateTime", "lastChangeIdentityUUID",
    "submissionStatusCode", "submissionStatusName", "auditStatusCode", "auditStatusName", "approvalStatusCode",
    "approvalStatusName", "cancellationStatusCode", "cancellationStatusName", "expenseReportLifeCycleStatusCode",
    "expenseReportLifeCycleStatusName", "settlementResultPostingProcessStatusCode",
    "settlementResultPostingProcessStatusName"})
public class ExpenseReportReadByIDResponseHistory {

    @XmlElement(name = "LastChangeDateTime")
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar lastChangeDateTime;
    @XmlElement(name = "LastChangeIdentityUUID")
    private UUID lastChangeIdentityUUID;
    @XmlElement(name = "SubmissionStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String submissionStatusCode;
    @XmlElement(name = "SubmissionStatusName")
    private String submissionStatusName;
    @XmlElement(name = "AuditStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String auditStatusCode;
    @XmlElement(name = "AuditStatusName")
    private String auditStatusName;
    @XmlElement(name = "ApprovalStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String approvalStatusCode;
    @XmlElement(name = "ApprovalStatusName")
    private String approvalStatusName;
    @XmlElement(name = "CancellationStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String cancellationStatusCode;
    @XmlElement(name = "CancellationStatusName")
    private String cancellationStatusName;
    @XmlElement(name = "ExpenseReportLifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String expenseReportLifeCycleStatusCode;
    @XmlElement(name = "ExpenseReportLifeCycleStatusName")
    private String expenseReportLifeCycleStatusName;
    @XmlElement(name = "SettlementResultPostingProcessStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String settlementResultPostingProcessStatusCode;
    @XmlElement(name = "SettlementResultPostingProcessStatusName")
    private String settlementResultPostingProcessStatusName;

    /**
     * Gets the value of the lastChangeDateTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLastChangeDateTime() {
        return lastChangeDateTime;
    }

    /**
     * Sets the value of the lastChangeDateTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setLastChangeDateTime(final XMLGregorianCalendar value) {
        this.lastChangeDateTime = value;
    }

    /**
     * Gets the value of the lastChangeIdentityUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getLastChangeIdentityUUID() {
        return lastChangeIdentityUUID;
    }

    /**
     * Sets the value of the lastChangeIdentityUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setLastChangeIdentityUUID(final UUID value) {
        this.lastChangeIdentityUUID = value;
    }

    /**
     * Gets the value of the submissionStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSubmissionStatusCode() {
        return submissionStatusCode;
    }

    /**
     * Sets the value of the submissionStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSubmissionStatusCode(final String value) {
        this.submissionStatusCode = value;
    }

    /**
     * Gets the value of the submissionStatusName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSubmissionStatusName() {
        return submissionStatusName;
    }

    /**
     * Sets the value of the submissionStatusName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSubmissionStatusName(final String value) {
        this.submissionStatusName = value;
    }

    /**
     * Gets the value of the auditStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAuditStatusCode() {
        return auditStatusCode;
    }

    /**
     * Sets the value of the auditStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAuditStatusCode(final String value) {
        this.auditStatusCode = value;
    }

    /**
     * Gets the value of the auditStatusName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAuditStatusName() {
        return auditStatusName;
    }

    /**
     * Sets the value of the auditStatusName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAuditStatusName(final String value) {
        this.auditStatusName = value;
    }

    /**
     * Gets the value of the approvalStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getApprovalStatusCode() {
        return approvalStatusCode;
    }

    /**
     * Sets the value of the approvalStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setApprovalStatusCode(final String value) {
        this.approvalStatusCode = value;
    }

    /**
     * Gets the value of the approvalStatusName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getApprovalStatusName() {
        return approvalStatusName;
    }

    /**
     * Sets the value of the approvalStatusName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setApprovalStatusName(final String value) {
        this.approvalStatusName = value;
    }

    /**
     * Gets the value of the cancellationStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCancellationStatusCode() {
        return cancellationStatusCode;
    }

    /**
     * Sets the value of the cancellationStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCancellationStatusCode(final String value) {
        this.cancellationStatusCode = value;
    }

    /**
     * Gets the value of the cancellationStatusName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCancellationStatusName() {
        return cancellationStatusName;
    }

    /**
     * Sets the value of the cancellationStatusName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCancellationStatusName(final String value) {
        this.cancellationStatusName = value;
    }

    /**
     * Gets the value of the expenseReportLifeCycleStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExpenseReportLifeCycleStatusCode() {
        return expenseReportLifeCycleStatusCode;
    }

    /**
     * Sets the value of the expenseReportLifeCycleStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setExpenseReportLifeCycleStatusCode(final String value) {
        this.expenseReportLifeCycleStatusCode = value;
    }

    /**
     * Gets the value of the expenseReportLifeCycleStatusName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExpenseReportLifeCycleStatusName() {
        return expenseReportLifeCycleStatusName;
    }

    /**
     * Sets the value of the expenseReportLifeCycleStatusName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setExpenseReportLifeCycleStatusName(final String value) {
        this.expenseReportLifeCycleStatusName = value;
    }

    /**
     * Gets the value of the settlementResultPostingProcessStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSettlementResultPostingProcessStatusCode() {
        return settlementResultPostingProcessStatusCode;
    }

    /**
     * Sets the value of the settlementResultPostingProcessStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSettlementResultPostingProcessStatusCode(final String value) {
        this.settlementResultPostingProcessStatusCode = value;
    }

    /**
     * Gets the value of the settlementResultPostingProcessStatusName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSettlementResultPostingProcessStatusName() {
        return settlementResultPostingProcessStatusName;
    }

    /**
     * Sets the value of the settlementResultPostingProcessStatusName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSettlementResultPostingProcessStatusName(final String value) {
        this.settlementResultPostingProcessStatusName = value;
    }

}
