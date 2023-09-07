
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for AccessTextCollectionTextTextContent complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="AccessTextCollectionTextTextContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://sap.com/xi/AP/Common/GDT}Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessTextCollectionTextTextContent", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
    "technicalID", "text"})
public class AccessTextCollectionTextTextContent {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String technicalID;
    @XmlElement(name = "Text")
    private Text text;

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
     * @return possible object is {@link Text }
     *
     */
    public Text getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value allowed object is {@link Text }
     *
     */
    public void setText(final Text value) {
        this.text = value;
    }

}
