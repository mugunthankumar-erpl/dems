
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for BusinessDocumentBasicMessageHeader complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="BusinessDocumentBasicMessageHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentMessageID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentMessageID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDocumentBasicMessageHeader", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {"id",
    "uuid", "referenceID", "referenceUUID"})
public class BusinessDocumentBasicMessageHeader {

    @XmlElement(name = "ID")
    private BusinessDocumentMessageID id;
    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "ReferenceID")
    private BusinessDocumentMessageID referenceID;
    @XmlElement(name = "ReferenceUUID")
    private UUID referenceUUID;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link BusinessDocumentMessageID }
     *
     */
    public BusinessDocumentMessageID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link BusinessDocumentMessageID }
     *
     */
    public void setID(final BusinessDocumentMessageID value) {
        this.id = value;
    }

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
     * Gets the value of the referenceID property.
     *
     * @return possible object is {@link BusinessDocumentMessageID }
     *
     */
    public BusinessDocumentMessageID getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     *
     * @param value allowed object is {@link BusinessDocumentMessageID }
     *
     */
    public void setReferenceID(final BusinessDocumentMessageID value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the referenceUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getReferenceUUID() {
        return referenceUUID;
    }

    /**
     * Sets the value of the referenceUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setReferenceUUID(final UUID value) {
        this.referenceUUID = value;
    }

}