
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
 * Java class for
 * ExpenseReportReadByIDResponseSettlementResultPostingTransaction complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseSettlementResultPostingTransaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportSettlementResultPostingTransactionID" minOccurs="0"/&gt;
 *         &lt;element name="AccountingBusinessTransactionDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="BasePostingDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Note" minOccurs="0"/&gt;
 *         &lt;element name="CompanyUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="PostingTransactionCompletedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseSettlementResultPostingTransaction", propOrder = {"uuid", "id",
    "accountingBusinessTransactionDate", "documentDate", "basePostingDate", "note", "companyUUID",
    "businessPartnerUUID", "postingTransactionCompletedIndicator"})
public class ExpenseReportReadByIDResponseSettlementResultPostingTransaction {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String id;
    @XmlElement(name = "AccountingBusinessTransactionDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar accountingBusinessTransactionDate;
    @XmlElement(name = "DocumentDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar documentDate;
    @XmlElement(name = "BasePostingDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar basePostingDate;
    @XmlElement(name = "Note")
    private String note;
    @XmlElement(name = "CompanyUUID")
    private UUID companyUUID;
    @XmlElement(name = "BusinessPartnerUUID")
    private UUID businessPartnerUUID;
    @XmlElement(name = "PostingTransactionCompletedIndicator")
    private Boolean postingTransactionCompletedIndicator;

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
     * Gets the value of the accountingBusinessTransactionDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getAccountingBusinessTransactionDate() {
        return accountingBusinessTransactionDate;
    }

    /**
     * Sets the value of the accountingBusinessTransactionDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setAccountingBusinessTransactionDate(final XMLGregorianCalendar value) {
        this.accountingBusinessTransactionDate = value;
    }

    /**
     * Gets the value of the documentDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDocumentDate(final XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the basePostingDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBasePostingDate() {
        return basePostingDate;
    }

    /**
     * Sets the value of the basePostingDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setBasePostingDate(final XMLGregorianCalendar value) {
        this.basePostingDate = value;
    }

    /**
     * Gets the value of the note property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNote(final String value) {
        this.note = value;
    }

    /**
     * Gets the value of the companyUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getCompanyUUID() {
        return companyUUID;
    }

    /**
     * Sets the value of the companyUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setCompanyUUID(final UUID value) {
        this.companyUUID = value;
    }

    /**
     * Gets the value of the businessPartnerUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getBusinessPartnerUUID() {
        return businessPartnerUUID;
    }

    /**
     * Sets the value of the businessPartnerUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setBusinessPartnerUUID(final UUID value) {
        this.businessPartnerUUID = value;
    }

    /**
     * Gets the value of the postingTransactionCompletedIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isPostingTransactionCompletedIndicator() {
        return postingTransactionCompletedIndicator;
    }

    /**
     * Sets the value of the postingTransactionCompletedIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setPostingTransactionCompletedIndicator(final Boolean value) {
        this.postingTransactionCompletedIndicator = value;
    }

}
