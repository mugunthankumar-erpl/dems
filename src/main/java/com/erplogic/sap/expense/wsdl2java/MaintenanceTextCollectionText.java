
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for MaintenanceTextCollectionText complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="MaintenanceTextCollectionText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}TextCollectionTextTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TextContent" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceTextCollectionTextTextContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceTextCollectionText", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
    "technicalID", "typeCode", "languageCode", "creationDateTime", "textContent"})
public class MaintenanceTextCollectionText {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String technicalID;
    @XmlElement(name = "TypeCode")
    private TextCollectionTextTypeCode typeCode;
    @XmlElement(name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    private String languageCode;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "TextContent")
    private MaintenanceTextCollectionTextTextContent textContent;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String actionCode;

    /**
     * Gets the value of the technicalID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTechnicalID() {
        return technicalID;
    }

    /**
     * Sets the value of the technicalID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTechnicalID(final String value) {
        this.technicalID = value;
    }

    /**
     * Gets the value of the typeCode property.
     *
     * @return possible object is {@link TextCollectionTextTypeCode }
     *
     */
    public TextCollectionTextTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     *
     * @param value allowed object is {@link TextCollectionTextTypeCode }
     *
     */
    public void setTypeCode(final TextCollectionTextTypeCode value) {
        this.typeCode = value;
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

    /**
     * Gets the value of the creationDateTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setCreationDateTime(final XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the textContent property.
     *
     * @return possible object is {@link MaintenanceTextCollectionTextTextContent }
     *
     */
    public MaintenanceTextCollectionTextTextContent getTextContent() {
        return textContent;
    }

    /**
     * Sets the value of the textContent property.
     *
     * @param value allowed object is
     *              {@link MaintenanceTextCollectionTextTextContent }
     *
     */
    public void setTextContent(final MaintenanceTextCollectionTextTextContent value) {
        this.textContent = value;
    }

    /**
     * Gets the value of the actionCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setActionCode(final String value) {
        this.actionCode = value;
    }

}