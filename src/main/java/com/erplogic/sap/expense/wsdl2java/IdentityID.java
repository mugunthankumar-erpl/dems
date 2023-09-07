
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
 *  *
 * </pre>
 *
 *
 * <p>
 * Java class for IdentityID complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="IdentityID"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://sap.com/xi/AP/Common/GDT&gt;IdentityID.Content"&gt;
 *       &lt;attribute name="schemeID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="60"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="schemeVersionID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="15"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="schemeAgencyID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="60"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="schemeAgencySchemeID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="60"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="schemeAgencySchemeAgencyID" type="{http://sap.com/xi/BASIS/Global}AgencyIdentificationCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityID", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {"value"})
public class IdentityID {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String value;
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String schemeID;
    @XmlAttribute(name = "schemeVersionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String schemeVersionID;
    @XmlAttribute(name = "schemeAgencyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String schemeAgencyID;
    @XmlAttribute(name = "schemeAgencySchemeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String schemeAgencySchemeID;
    @XmlAttribute(name = "schemeAgencySchemeAgencyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String schemeAgencySchemeAgencyID;

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
     * Gets the value of the schemeID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * Sets the value of the schemeID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSchemeID(final String value) {
        this.schemeID = value;
    }

    /**
     * Gets the value of the schemeVersionID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSchemeVersionID() {
        return schemeVersionID;
    }

    /**
     * Sets the value of the schemeVersionID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSchemeVersionID(final String value) {
        this.schemeVersionID = value;
    }

    /**
     * Gets the value of the schemeAgencyID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSchemeAgencyID() {
        return schemeAgencyID;
    }

    /**
     * Sets the value of the schemeAgencyID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSchemeAgencyID(final String value) {
        this.schemeAgencyID = value;
    }

    /**
     * Gets the value of the schemeAgencySchemeID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSchemeAgencySchemeID() {
        return schemeAgencySchemeID;
    }

    /**
     * Sets the value of the schemeAgencySchemeID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSchemeAgencySchemeID(final String value) {
        this.schemeAgencySchemeID = value;
    }

    /**
     * Gets the value of the schemeAgencySchemeAgencyID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSchemeAgencySchemeAgencyID() {
        return schemeAgencySchemeAgencyID;
    }

    /**
     * Sets the value of the schemeAgencySchemeAgencyID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSchemeAgencySchemeAgencyID(final String value) {
        this.schemeAgencySchemeAgencyID = value;
    }

}
