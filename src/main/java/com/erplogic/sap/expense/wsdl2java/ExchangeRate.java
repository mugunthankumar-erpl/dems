
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
 * Java class for ExchangeRate complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExchangeRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnitCurrency" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode"/&gt;
 *         &lt;element name="QuotedCurrency" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode"/&gt;
 *         &lt;element name="Rate" type="{http://sap.com/xi/AP/Common/GDT}ExchangeRateRate"/&gt;
 *         &lt;element name="QuotationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRate", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {"unitCurrency",
    "quotedCurrency", "rate", "quotationDateTime"})
public class ExchangeRate {

    @XmlElement(name = "UnitCurrency", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String unitCurrency;
    @XmlElement(name = "QuotedCurrency", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String quotedCurrency;
    @XmlElement(name = "Rate", required = true)
    private BigDecimal rate;
    @XmlElement(name = "QuotationDateTime")
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar quotationDateTime;

    /**
     * Gets the value of the unitCurrency property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUnitCurrency() {
        return unitCurrency;
    }

    /**
     * Sets the value of the unitCurrency property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUnitCurrency(final String value) {
        this.unitCurrency = value;
    }

    /**
     * Gets the value of the quotedCurrency property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getQuotedCurrency() {
        return quotedCurrency;
    }

    /**
     * Sets the value of the quotedCurrency property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setQuotedCurrency(final String value) {
        this.quotedCurrency = value;
    }

    /**
     * Gets the value of the rate property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setRate(final BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the quotationDateTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getQuotationDateTime() {
        return quotationDateTime;
    }

    /**
     * Sets the value of the quotationDateTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setQuotationDateTime(final XMLGregorianCalendar value) {
        this.quotationDateTime = value;
    }

}
