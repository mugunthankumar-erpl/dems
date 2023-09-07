
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExpenseReportReadByIDResponseCreationIdentity complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseCreationIdentity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}IdentityID" minOccurs="0"/&gt;
 *         &lt;element name="FormattedName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}DatePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseCreationIdentity", propOrder = {"uuid", "id", "formattedName",
    "businessPartnerUUID", "validityPeriod"})
public class ExpenseReportReadByIDResponseCreationIdentity {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "ID")
    private IdentityID id;
    @XmlElement(name = "FormattedName")
    private String formattedName;
    @XmlElement(name = "BusinessPartnerUUID")
    private UUID businessPartnerUUID;
    @XmlElement(name = "ValidityPeriod")
    private DatePeriod validityPeriod;

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
     * @return possible object is {@link IdentityID }
     *
     */
    public IdentityID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link IdentityID }
     *
     */
    public void setID(final IdentityID value) {
        this.id = value;
    }

    /**
     * Gets the value of the formattedName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFormattedName() {
        return formattedName;
    }

    /**
     * Sets the value of the formattedName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFormattedName(final String value) {
        this.formattedName = value;
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
     * Gets the value of the validityPeriod property.
     *
     * @return possible object is {@link DatePeriod }
     *
     */
    public DatePeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     *
     * @param value allowed object is {@link DatePeriod }
     *
     */
    public void setValidityPeriod(final DatePeriod value) {
        this.validityPeriod = value;
    }

}
