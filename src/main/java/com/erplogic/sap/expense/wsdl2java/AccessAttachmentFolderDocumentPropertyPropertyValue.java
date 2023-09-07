
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
 * Java class for AccessAttachmentFolderDocumentPropertyPropertyValue complex
 * type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="AccessAttachmentFolderDocumentPropertyPropertyValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Text" minOccurs="0"/&gt;
 *         &lt;element name="Indicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="IntegerValue" type="{http://sap.com/xi/AP/Common/GDT}IntegerValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAttachmentFolderDocumentPropertyPropertyValue", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
    "technicalID", "text", "indicator", "dateTime", "integerValue"})
public class AccessAttachmentFolderDocumentPropertyPropertyValue {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String technicalID;
    @XmlElement(name = "Text")
    private String text;
    @XmlElement(name = "Indicator")
    private Boolean indicator;
    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar dateTime;
    @XmlElement(name = "IntegerValue")
    private Integer integerValue;

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
     * Gets the value of the text property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setText(final String value) {
        this.text = value;
    }

    /**
     * Gets the value of the indicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setIndicator(final Boolean value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the dateTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDateTime(final XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the integerValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setIntegerValue(final Integer value) {
        this.integerValue = value;
    }

}
