
package com.erplogic.sap.expense.wsdl2java;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * <pre>
 *  *
 * </pre>
 *
 *
 * <p>
 * Java class for Amount complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="Amount"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://sap.com/xi/AP/Common/GDT&gt;Amount.Content"&gt;
 *       &lt;attribute name="currencyCode" use="required" type="{http://sap.com/xi/BASIS/Global}CurrencyCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {"value"})
public class Amount {

    @XmlValue
    private BigDecimal value;
    @XmlAttribute(name = "currencyCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String currencyCode;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValue(final BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the currencyCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCurrencyCode(final String value) {
        this.currencyCode = value;
    }

}
