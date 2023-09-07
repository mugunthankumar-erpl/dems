
package com.erplogic.sap.expense.wsdl2java;

import java.util.ArrayList;
import java.util.List;

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
 * Java class for AccessAccountingCodingBlockDistribution complex type.
 *
 * <pre>
 * &lt;complexType name="AccessAccountingCodingBlockDistribution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ValidityDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="CompanyID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="IdentityID" type="{http://sap.com/xi/AP/Common/GDT}IdentityID" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="LanguageName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="TemplateIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="GeneralLedgerAccountAliasCode" type="{http://sap.com/xi/AP/Common/GDT}GeneralLedgerAccountAliasCode" minOccurs="0"/&gt;
 *         &lt;element name="GeneralLedgerAccountAliasName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TotalQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="AccountingCodingBlockAssignment" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAccountingCodingBlockDistribution", namespace = "http://sap.com/xi/AP/IS/CodingBlock/Global", propOrder = {
    "uuid", "validityDate", "companyID", "identityID", "languageCode", "languageName", "templateIndicator",
    "generalLedgerAccountAliasCode", "generalLedgerAccountAliasName", "totalAmount", "totalQuantity",
    "accountingCodingBlockAssignment"})
public class AccessAccountingCodingBlockDistribution {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "ValidityDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar validityDate;
    @XmlElement(name = "CompanyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String companyID;
    @XmlElement(name = "IdentityID")
    private IdentityID identityID;
    @XmlElement(name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    private String languageCode;
    @XmlElement(name = "LanguageName")
    private String languageName;
    @XmlElement(name = "TemplateIndicator")
    private Boolean templateIndicator;
    @XmlElement(name = "GeneralLedgerAccountAliasCode")
    private GeneralLedgerAccountAliasCode generalLedgerAccountAliasCode;
    @XmlElement(name = "GeneralLedgerAccountAliasName")
    private String generalLedgerAccountAliasName;
    @XmlElement(name = "TotalAmount")
    private Amount totalAmount;
    @XmlElement(name = "TotalQuantity")
    private Quantity totalQuantity;
    @XmlElement(name = "AccountingCodingBlockAssignment")
    private List<AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment> accountingCodingBlockAssignment;

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
     * Gets the value of the validityDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getValidityDate() {
        return validityDate;
    }

    /**
     * Sets the value of the validityDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setValidityDate(final XMLGregorianCalendar value) {
        this.validityDate = value;
    }

    /**
     * Gets the value of the companyID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCompanyID(final String value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the identityID property.
     *
     * @return possible object is {@link IdentityID }
     *
     */
    public IdentityID getIdentityID() {
        return identityID;
    }

    /**
     * Sets the value of the identityID property.
     *
     * @param value allowed object is {@link IdentityID }
     *
     */
    public void setIdentityID(final IdentityID value) {
        this.identityID = value;
    }

    /**
     * Gets the value of the languageCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLanguageCode(final String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the languageName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * Sets the value of the languageName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLanguageName(final String value) {
        this.languageName = value;
    }

    /**
     * Gets the value of the templateIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isTemplateIndicator() {
        return templateIndicator;
    }

    /**
     * Sets the value of the templateIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setTemplateIndicator(final Boolean value) {
        this.templateIndicator = value;
    }

    /**
     * Gets the value of the generalLedgerAccountAliasCode property.
     *
     * @return possible object is {@link GeneralLedgerAccountAliasCode }
     *
     */
    public GeneralLedgerAccountAliasCode getGeneralLedgerAccountAliasCode() {
        return generalLedgerAccountAliasCode;
    }

    /**
     * Sets the value of the generalLedgerAccountAliasCode property.
     *
     * @param value allowed object is {@link GeneralLedgerAccountAliasCode }
     *
     */
    public void setGeneralLedgerAccountAliasCode(final GeneralLedgerAccountAliasCode value) {
        this.generalLedgerAccountAliasCode = value;
    }

    /**
     * Gets the value of the generalLedgerAccountAliasName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGeneralLedgerAccountAliasName() {
        return generalLedgerAccountAliasName;
    }

    /**
     * Sets the value of the generalLedgerAccountAliasName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGeneralLedgerAccountAliasName(final String value) {
        this.generalLedgerAccountAliasName = value;
    }

    /**
     * Gets the value of the totalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTotalAmount(final Amount value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalQuantity property.
     *
     * @return possible object is {@link Quantity }
     *
     */
    public Quantity getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     *
     * @param value allowed object is {@link Quantity }
     *
     */
    public void setTotalQuantity(final Quantity value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the accountingCodingBlockAssignment property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the accountingCodingBlockAssignment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getAccountingCodingBlockAssignment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment
     * }
     *
     *
     */
    public List<AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment> getAccountingCodingBlockAssignment() {
        if (accountingCodingBlockAssignment == null) {
            accountingCodingBlockAssignment = new ArrayList<AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment>();
        }
        return this.accountingCodingBlockAssignment;
    }

}
