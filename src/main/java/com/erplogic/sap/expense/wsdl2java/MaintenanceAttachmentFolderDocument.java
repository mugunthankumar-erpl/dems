
package com.erplogic.sap.expense.wsdl2java;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for MaintenanceAttachmentFolderDocument complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="MaintenanceAttachmentFolderDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="LinkInternalIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="VisibleIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}DocumentCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}DocumentTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="MIMECode" type="{http://sap.com/xi/AP/Common/GDT}MIMECode" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="AlternativeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="InternalLinkUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}Description" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLinkWebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *         &lt;element name="Property" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolderDocumentProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FileContent" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolderDocumentFileContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PropertyListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceAttachmentFolderDocument", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
    "uuid", "linkInternalIndicator", "visibleIndicator", "categoryCode", "typeCode", "mimeCode", "name",
    "alternativeName", "internalLinkUUID", "description", "externalLinkWebURI", "property", "fileContent"})
public class MaintenanceAttachmentFolderDocument {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "LinkInternalIndicator")
    private Boolean linkInternalIndicator;
    @XmlElement(name = "VisibleIndicator")
    private Boolean visibleIndicator;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String categoryCode;
    @XmlElement(name = "TypeCode")
    private DocumentTypeCode typeCode;
    @XmlElement(name = "MIMECode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String mimeCode;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "AlternativeName")
    private String alternativeName;
    @XmlElement(name = "InternalLinkUUID")
    private UUID internalLinkUUID;
    @XmlElement(name = "Description")
    private Description description;
    @XmlElement(name = "ExternalLinkWebURI")
    @XmlSchemaType(name = "anyURI")
    private String externalLinkWebURI;
    @XmlElement(name = "Property")
    private List<MaintenanceAttachmentFolderDocumentProperty> property;
    @XmlElement(name = "FileContent")
    private MaintenanceAttachmentFolderDocumentFileContent fileContent;
    @XmlAttribute(name = "PropertyListCompleteTransmissionIndicator")
    private Boolean propertyListCompleteTransmissionIndicator;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String actionCode;

    /**
     * Gets the value of the uuid property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setUUID(final UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the linkInternalIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isLinkInternalIndicator() {
        return linkInternalIndicator;
    }

    /**
     * Sets the value of the linkInternalIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setLinkInternalIndicator(final Boolean value) {
        this.linkInternalIndicator = value;
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
     * Gets the value of the categoryCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCategoryCode(final String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     *
     * @return possible object is {@link DocumentTypeCode }
     *
     */
    public DocumentTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     *
     * @param value allowed object is {@link DocumentTypeCode }
     *
     */
    public void setTypeCode(final DocumentTypeCode value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the mimeCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMIMECode() {
        return mimeCode;
    }

    /**
     * Sets the value of the mimeCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMIMECode(final String value) {
        this.mimeCode = value;
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
     * Gets the value of the alternativeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAlternativeName() {
        return alternativeName;
    }

    /**
     * Sets the value of the alternativeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAlternativeName(final String value) {
        this.alternativeName = value;
    }

    /**
     * Gets the value of the internalLinkUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getInternalLinkUUID() {
        return internalLinkUUID;
    }

    /**
     * Sets the value of the internalLinkUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setInternalLinkUUID(final UUID value) {
        this.internalLinkUUID = value;
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
     * Gets the value of the externalLinkWebURI property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExternalLinkWebURI() {
        return externalLinkWebURI;
    }

    /**
     * Sets the value of the externalLinkWebURI property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setExternalLinkWebURI(final String value) {
        this.externalLinkWebURI = value;
    }

    /**
     * Gets the value of the property property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the property property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceAttachmentFolderDocumentProperty }
     *
     *
     */
    public List<MaintenanceAttachmentFolderDocumentProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<MaintenanceAttachmentFolderDocumentProperty>();
        }
        return this.property;
    }

    /**
     * Gets the value of the fileContent property.
     *
     * @return possible object is
     *         {@link MaintenanceAttachmentFolderDocumentFileContent }
     *
     */
    public MaintenanceAttachmentFolderDocumentFileContent getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     *
     * @param value allowed object is
     *              {@link MaintenanceAttachmentFolderDocumentFileContent }
     *
     */
    public void setFileContent(final MaintenanceAttachmentFolderDocumentFileContent value) {
        this.fileContent = value;
    }

    /**
     * Gets the value of the propertyListCompleteTransmissionIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isPropertyListCompleteTransmissionIndicator() {
        return propertyListCompleteTransmissionIndicator;
    }

    /**
     * Sets the value of the propertyListCompleteTransmissionIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setPropertyListCompleteTransmissionIndicator(final Boolean value) {
        this.propertyListCompleteTransmissionIndicator = value;
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