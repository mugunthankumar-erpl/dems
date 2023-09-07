
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * <pre>
 * *
 * </pre>
 *
 *
 * <p>
 * Java class for LOCAL_DateTime complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="LOCAL_DateTime"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://sap.com/xi/BASIS/Global&gt;LOCAL_DateTime.Content"&gt;
 *       &lt;attribute name="timeZoneCode" use="required" type="{http://sap.com/xi/BASIS/Global}TimeZoneCode" /&gt;
 *       &lt;attribute name="daylightSavingTimeIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOCAL_DateTime", namespace = "http://sap.com/xi/BASIS/Global", propOrder = {"value"})
public class LOCALDateTime {

    @XmlValue
    private XMLGregorianCalendar value;
    @XmlAttribute(name = "timeZoneCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String timeZoneCode;
    @XmlAttribute(name = "daylightSavingTimeIndicator", required = true)
    private boolean daylightSavingTimeIndicator;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setValue(final XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the timeZoneCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTimeZoneCode() {
        return timeZoneCode;
    }

    /**
     * Sets the value of the timeZoneCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTimeZoneCode(final String value) {
        this.timeZoneCode = value;
    }

    /**
     * Gets the value of the daylightSavingTimeIndicator property.
     *
     */
    public boolean isDaylightSavingTimeIndicator() {
        return daylightSavingTimeIndicator;
    }

    /**
     * Sets the value of the daylightSavingTimeIndicator property.
     *
     */
    public void setDaylightSavingTimeIndicator(final boolean value) {
        this.daylightSavingTimeIndicator = value;
    }

}
