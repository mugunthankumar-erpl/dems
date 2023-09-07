
package com.erplogic.sap.expense.wsdl2java;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for AccessAttachmentFolderDocumentProperty complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="AccessAttachmentFolderDocumentProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="DataTypeFormatCode" type="{http://sap.com/xi/AP/Common/GDT}PropertyDataTypeFormatCode" minOccurs="0"/&gt;
 *         &lt;element name="DataTypeFormatName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="VisibleIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ChangeAllowedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="MultipleValueIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="NamespaceURI" type="{http://sap.com/xi/AP/Common/GDT}NamespaceURI" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}Description" minOccurs="0"/&gt;
 *         &lt;element name="PropertyValue" type="{http://sap.com/xi/DocumentServices/Global}AccessAttachmentFolderDocumentPropertyPropertyValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAttachmentFolderDocumentProperty", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
    "technicalID", "name", "dataTypeFormatCode", "dataTypeFormatName", "visibleIndicator", "changeAllowedIndicator",
    "multipleValueIndicator", "namespaceURI", "description", "propertyValue"})
public class AccessAttachmentFolderDocumentProperty {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String technicalID;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "DataTypeFormatCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String dataTypeFormatCode;
    @XmlElement(name = "DataTypeFormatName")
    private String dataTypeFormatName;
    @XmlElement(name = "VisibleIndicator")
    private Boolean visibleIndicator;
    @XmlElement(name = "ChangeAllowedIndicator")
    private Boolean changeAllowedIndicator;
    @XmlElement(name = "MultipleValueIndicator")
    private Boolean multipleValueIndicator;
    @XmlElement(name = "NamespaceURI")
    private NamespaceURI namespaceURI;
    @XmlElement(name = "Description")
    private Description description;
    @XmlElement(name = "PropertyValue")
    private List<AccessAttachmentFolderDocumentPropertyPropertyValue> propertyValue;

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
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(final String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dataTypeFormatCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDataTypeFormatCode() {
        return dataTypeFormatCode;
    }

    /**
     * Sets the value of the dataTypeFormatCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDataTypeFormatCode(final String value) {
        this.dataTypeFormatCode = value;
    }

    /**
     * Gets the value of the dataTypeFormatName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDataTypeFormatName() {
        return dataTypeFormatName;
    }

    /**
     * Sets the value of the dataTypeFormatName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDataTypeFormatName(final String value) {
        this.dataTypeFormatName = value;
    }

    /**
     * Gets the value of the visibleIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isVisibleIndicator() {
        return visibleIndicator;
    }

    /**
     * Sets the value of the visibleIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setVisibleIndicator(final Boolean value) {
        this.visibleIndicator = value;
    }

    /**
     * Gets the value of the changeAllowedIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isChangeAllowedIndicator() {
        return changeAllowedIndicator;
    }

    /**
     * Sets the value of the changeAllowedIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setChangeAllowedIndicator(final Boolean value) {
        this.changeAllowedIndicator = value;
    }

    /**
     * Gets the value of the multipleValueIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isMultipleValueIndicator() {
        return multipleValueIndicator;
    }

    /**
     * Sets the value of the multipleValueIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setMultipleValueIndicator(final Boolean value) {
        this.multipleValueIndicator = value;
    }

    /**
     * Gets the value of the namespaceURI property.
     *
     * @return possible object is {@link NamespaceURI }
     *
     */
    public NamespaceURI getNamespaceURI() {
        return namespaceURI;
    }

    /**
     * Sets the value of the namespaceURI property.
     *
     * @param value allowed object is {@link NamespaceURI }
     *
     */
    public void setNamespaceURI(final NamespaceURI value) {
        this.namespaceURI = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is {@link Description }
     *
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link Description }
     *
     */
    public void setDescription(final Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the propertyValue property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the propertyValue property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getPropertyValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessAttachmentFolderDocumentPropertyPropertyValue }
     *
     *
     */
    public List<AccessAttachmentFolderDocumentPropertyPropertyValue> getPropertyValue() {
        if (propertyValue == null) {
            propertyValue = new ArrayList<AccessAttachmentFolderDocumentPropertyPropertyValue>();
        }
        return this.propertyValue;
    }

}
