
package com.erplogic.sap.expense.wsdl2java;

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
 * *
 * </pre>
 *
 *
 * <p>
 * Java class for MEDIUM_Name complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="MEDIUM_Name"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://sap.com/xi/AP/Common/GDT&gt;MEDIUM_Name.Content"&gt;
 *       &lt;attribute name="languageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEDIUM_Name", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {"value"})
public class MEDIUMName {

    @XmlValue
    private String value;
    @XmlAttribute(name = "languageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String languageCode;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValue(final String value) {
        this.value = value;
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

}
