
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
 * Java class for ProductTaxDeclarationDetails complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ProductTaxDeclarationDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerFormattedName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerResidenceCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerTaxID" type="{http://sap.com/xi/AP/Common/GDT}PartyTaxID" minOccurs="0"/&gt;
 *         &lt;element name="TaxIdentificationNumberTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxIdentificationNumberTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTaxDeclarationDetails", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "businessPartnerFormattedName", "businessPartnerResidenceCountryCode", "businessPartnerTaxID",
    "taxIdentificationNumberTypeCode"})
public class ProductTaxDeclarationDetails {

    @XmlElement(name = "BusinessPartnerFormattedName")
    private String businessPartnerFormattedName;
    @XmlElement(name = "BusinessPartnerResidenceCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String businessPartnerResidenceCountryCode;
    @XmlElement(name = "BusinessPartnerTaxID")
    private PartyTaxID businessPartnerTaxID;
    @XmlElement(name = "TaxIdentificationNumberTypeCode")
    private TaxIdentificationNumberTypeCode taxIdentificationNumberTypeCode;

    /**
     * Gets the value of the businessPartnerFormattedName property.
     *
     * @return possible object is {@link String }
     */
    public String getBusinessPartnerFormattedName() {
        return businessPartnerFormattedName;
    }

    /**
     * Sets the value of the businessPartnerFormattedName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBusinessPartnerFormattedName(final String value) {
        this.businessPartnerFormattedName = value;
    }

    /**
     * Gets the value of the businessPartnerResidenceCountryCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getBusinessPartnerResidenceCountryCode() {
        return businessPartnerResidenceCountryCode;
    }

    /**
     * Sets the value of the businessPartnerResidenceCountryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBusinessPartnerResidenceCountryCode(final String value) {
        this.businessPartnerResidenceCountryCode = value;
    }

    /**
     * Gets the value of the businessPartnerTaxID property.
     *
     * @return possible object is {@link PartyTaxID }
     *
     */
    public PartyTaxID getBusinessPartnerTaxID() {
        return businessPartnerTaxID;
    }

    /**
     * Sets the value of the businessPartnerTaxID property.
     *
     * @param value allowed object is {@link PartyTaxID }
     *
     */
    public void setBusinessPartnerTaxID(final PartyTaxID value) {
        this.businessPartnerTaxID = value;
    }

    /**
     * Gets the value of the taxIdentificationNumberTypeCode property.
     *
     * @return possible object is {@link TaxIdentificationNumberTypeCode }
     *
     */
    public TaxIdentificationNumberTypeCode getTaxIdentificationNumberTypeCode() {
        return taxIdentificationNumberTypeCode;
    }

    /**
     * Sets the value of the taxIdentificationNumberTypeCode property.
     *
     * @param value allowed object is {@link TaxIdentificationNumberTypeCode }
     *
     */
    public void setTaxIdentificationNumberTypeCode(final TaxIdentificationNumberTypeCode value) {
        this.taxIdentificationNumberTypeCode = value;
    }

}
