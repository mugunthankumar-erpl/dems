
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
 * </pre>
 *
 *
 * <p>
 * Java class for Measure complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="Measure"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://sap.com/xi/AP/Common/GDT&gt;Measure.Content"&gt;
 *       &lt;attribute name="unitCode" use="required" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Measure", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {"value"})
public class Measure {

    @XmlValue
    private BigDecimal value;
    @XmlAttribute(name = "unitCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String unitCode;

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
     * Gets the value of the unitCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUnitCode(final String value) {
        this.unitCode = value;
    }

}
