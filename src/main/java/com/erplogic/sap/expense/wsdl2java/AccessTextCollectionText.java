
package com.erplogic.sap.expense.wsdl2java;

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
 * Java class for AccessTextCollectionText complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="AccessTextCollectionText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}TextCollectionTextTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="LanguageName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="SystemAdministrativeData" type="{http://sap.com/xi/AP/Common/GDT}SystemAdministrativeData" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TextContent" type="{http://sap.com/xi/DocumentServices/Global}AccessTextCollectionTextTextContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessTextCollectionText", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
    "technicalID", "typeCode", "typeName", "languageCode", "languageName", "systemAdministrativeData",
    "creationDateTime", "textContent"})
public class AccessTextCollectionText {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String technicalID;
    @XmlElement(name = "TypeCode")
    private TextCollectionTextTypeCode typeCode;
    @XmlElement(name = "TypeName")
    private String typeName;
    @XmlElement(name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    private String languageCode;
    @XmlElement(name = "LanguageName")
    private String languageName;
    @XmlElement(name = "SystemAdministrativeData")
    private SystemAdministrativeData systemAdministrativeData;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "TextContent")
    private AccessTextCollectionTextTextContent textContent;

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
     * Gets the value of the typeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTypeName(final String value) {
        this.typeName = value;
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
     * Gets the value of the languageName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * Sets the value of the languageName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLanguageName(final String value) {
        this.languageName = value;
    }

    /**
     * Gets the value of the systemAdministrativeData property.
     *
     * @return possible object is {@link SystemAdministrativeData }
     *
     */
    public SystemAdministrativeData getSystemAdministrativeData() {
        return systemAdministrativeData;
    }

    /**
     * Sets the value of the systemAdministrativeData property.
     *
     * @param value allowed object is {@link SystemAdministrativeData }
     *
     */
    public void setSystemAdministrativeData(final SystemAdministrativeData value) {
        this.systemAdministrativeData = value;
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
     * @return possible object is {@link AccessTextCollectionTextTextContent }
     *
     */
    public AccessTextCollectionTextTextContent getTextContent() {
        return textContent;
    }

    /**
     * Sets the value of the textContent property.
     *
     * @param value allowed object is {@link AccessTextCollectionTextTextContent }
     *
     */
    public void setTextContent(final AccessTextCollectionTextTextContent value) {
        this.textContent = value;
    }

}
