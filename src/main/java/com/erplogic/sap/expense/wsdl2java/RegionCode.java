
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
 * Java class for RegionCode complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="RegionCode"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://sap.com/xi/AP/Common/GDT&gt;RegionCode.Content"&gt;
 *       &lt;attribute name="listID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="60"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="listVersionID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="15"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="listAgencyID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="60"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="listAgencySchemeID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="60"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="listAgencySchemeAgencyID" type="{http://sap.com/xi/BASIS/Global}AgencyIdentificationCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionCode", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {"value"})
public class RegionCode {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String value;
    @XmlAttribute(name = "listID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String listID;
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String listVersionID;
    @XmlAttribute(name = "listAgencyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String listAgencyID;
    @XmlAttribute(name = "listAgencySchemeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String listAgencySchemeID;
    @XmlAttribute(name = "listAgencySchemeAgencyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String listAgencySchemeAgencyID;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link String }
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
     * Gets the value of the listID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setListID(final String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the listVersionID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getListVersionID() {
        return listVersionID;
    }

    /**
     * Sets the value of the listVersionID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setListVersionID(final String value) {
        this.listVersionID = value;
    }

    /**
     * Gets the value of the listAgencyID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getListAgencyID() {
        return listAgencyID;
    }

    /**
     * Sets the value of the listAgencyID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setListAgencyID(final String value) {
        this.listAgencyID = value;
    }

    /**
     * Gets the value of the listAgencySchemeID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getListAgencySchemeID() {
        return listAgencySchemeID;
    }

    /**
     * Sets the value of the listAgencySchemeID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setListAgencySchemeID(final String value) {
        this.listAgencySchemeID = value;
    }

    /**
     * Gets the value of the listAgencySchemeAgencyID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getListAgencySchemeAgencyID() {
        return listAgencySchemeAgencyID;
    }

    /**
     * Sets the value of the listAgencySchemeAgencyID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setListAgencySchemeAgencyID(final String value) {
        this.listAgencySchemeAgencyID = value;
    }

}
