
package com.erplogic.sap.expense.wsdl2java;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for FINANCIALACCOUNTING_ProductTax complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="FINANCIALACCOUNTING_ProductTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="JurisdictionCode" type="{http://sap.com/xi/AP/Common/GDT}TaxJurisdictionCode" minOccurs="0"/&gt;
 *         &lt;element name="EventTypeCode" type="{http://sap.com/xi/AP/Common/GDT}ProductTaxEventTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="RateTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxRateTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BaseAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Percent" type="{http://sap.com/xi/AP/Common/GDT}Percent" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="InternalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="NonDeductiblePercent" type="{http://sap.com/xi/AP/Common/GDT}Percent" minOccurs="0"/&gt;
 *         &lt;element name="NonDeductibleAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="BusinessTransactionDocumentItemGroupID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemGroupID" minOccurs="0"/&gt;
 *         &lt;element name="DueCategoryCode" type="{http://sap.com/xi/AP/Common/GDT}DueCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="StatisticRelevanceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DeferredIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://sap.com/xi/AP/Common/GDT}ExchangeRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FINANCIALACCOUNTING_ProductTax", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "countryCode", "regionCode", "jurisdictionCode", "eventTypeCode", "typeCode", "rateTypeCode", "baseAmount",
    "percent", "amount", "internalAmount", "nonDeductiblePercent", "nonDeductibleAmount",
    "businessTransactionDocumentItemGroupID", "dueCategoryCode", "statisticRelevanceIndicator", "deferredIndicator",
    "exchangeRate"})
public class FINANCIALACCOUNTINGProductTax {

    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String countryCode;
    @XmlElement(name = "RegionCode")
    private RegionCode regionCode;
    @XmlElement(name = "JurisdictionCode")
    private TaxJurisdictionCode jurisdictionCode;
    @XmlElement(name = "EventTypeCode")
    private ProductTaxEventTypeCode eventTypeCode;
    @XmlElement(name = "TypeCode")
    private TaxTypeCode typeCode;
    @XmlElement(name = "RateTypeCode")
    private TaxRateTypeCode rateTypeCode;
    @XmlElement(name = "BaseAmount")
    private Amount baseAmount;
    @XmlElement(name = "Percent")
    private BigDecimal percent;
    @XmlElement(name = "Amount")
    private Amount amount;
    @XmlElement(name = "InternalAmount")
    private Amount internalAmount;
    @XmlElement(name = "NonDeductiblePercent")
    private BigDecimal nonDeductiblePercent;
    @XmlElement(name = "NonDeductibleAmount")
    private Amount nonDeductibleAmount;
    @XmlElement(name = "BusinessTransactionDocumentItemGroupID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String businessTransactionDocumentItemGroupID;
    @XmlElement(name = "DueCategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String dueCategoryCode;
    @XmlElement(name = "StatisticRelevanceIndicator")
    private Boolean statisticRelevanceIndicator;
    @XmlElement(name = "DeferredIndicator")
    private Boolean deferredIndicator;
    @XmlElement(name = "ExchangeRate")
    private ExchangeRate exchangeRate;

    /**
     * Gets the value of the countryCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCountryCode(final String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     *
     * @return possible object is {@link RegionCode }
     *
     */
    public RegionCode getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     *
     * @param value allowed object is {@link RegionCode }
     *
     */
    public void setRegionCode(final RegionCode value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the jurisdictionCode property.
     *
     * @return possible object is {@link TaxJurisdictionCode }
     *
     */
    public TaxJurisdictionCode getJurisdictionCode() {
        return jurisdictionCode;
    }

    /**
     * Sets the value of the jurisdictionCode property.
     *
     * @param value allowed object is {@link TaxJurisdictionCode }
     *
     */
    public void setJurisdictionCode(final TaxJurisdictionCode value) {
        this.jurisdictionCode = value;
    }

    /**
     * Gets the value of the eventTypeCode property.
     *
     * @return possible object is {@link ProductTaxEventTypeCode }
     *
     */
    public ProductTaxEventTypeCode getEventTypeCode() {
        return eventTypeCode;
    }

    /**
     * Sets the value of the eventTypeCode property.
     *
     * @param value allowed object is {@link ProductTaxEventTypeCode }
     *
     */
    public void setEventTypeCode(final ProductTaxEventTypeCode value) {
        this.eventTypeCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     *
     * @return possible object is {@link TaxTypeCode }
     *
     */
    public TaxTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     *
     * @param value allowed object is {@link TaxTypeCode }
     *
     */
    public void setTypeCode(final TaxTypeCode value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the rateTypeCode property.
     *
     * @return possible object is {@link TaxRateTypeCode }
     *
     */
    public TaxRateTypeCode getRateTypeCode() {
        return rateTypeCode;
    }

    /**
     * Sets the value of the rateTypeCode property.
     *
     * @param value allowed object is {@link TaxRateTypeCode }
     *
     */
    public void setRateTypeCode(final TaxRateTypeCode value) {
        this.rateTypeCode = value;
    }

    /**
     * Gets the value of the baseAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setBaseAmount(final Amount value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the percent property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPercent(final BigDecimal value) {
        this.percent = value;
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
     * Gets the value of the internalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getInternalAmount() {
        return internalAmount;
    }

    /**
     * Sets the value of the internalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setInternalAmount(final Amount value) {
        this.internalAmount = value;
    }

    /**
     * Gets the value of the nonDeductiblePercent property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getNonDeductiblePercent() {
        return nonDeductiblePercent;
    }

    /**
     * Sets the value of the nonDeductiblePercent property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setNonDeductiblePercent(final BigDecimal value) {
        this.nonDeductiblePercent = value;
    }

    /**
     * Gets the value of the nonDeductibleAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getNonDeductibleAmount() {
        return nonDeductibleAmount;
    }

    /**
     * Sets the value of the nonDeductibleAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setNonDeductibleAmount(final Amount value) {
        this.nonDeductibleAmount = value;
    }

    /**
     * Gets the value of the businessTransactionDocumentItemGroupID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getBusinessTransactionDocumentItemGroupID() {
        return businessTransactionDocumentItemGroupID;
    }

    /**
     * Sets the value of the businessTransactionDocumentItemGroupID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBusinessTransactionDocumentItemGroupID(final String value) {
        this.businessTransactionDocumentItemGroupID = value;
    }

    /**
     * Gets the value of the dueCategoryCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDueCategoryCode() {
        return dueCategoryCode;
    }

    /**
     * Sets the value of the dueCategoryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDueCategoryCode(final String value) {
        this.dueCategoryCode = value;
    }

    /**
     * Gets the value of the statisticRelevanceIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isStatisticRelevanceIndicator() {
        return statisticRelevanceIndicator;
    }

    /**
     * Sets the value of the statisticRelevanceIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setStatisticRelevanceIndicator(final Boolean value) {
        this.statisticRelevanceIndicator = value;
    }

    /**
     * Gets the value of the deferredIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isDeferredIndicator() {
        return deferredIndicator;
    }

    /**
     * Sets the value of the deferredIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setDeferredIndicator(final Boolean value) {
        this.deferredIndicator = value;
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

}
