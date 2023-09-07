
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
 * Java class for ObjectNodeReference complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ObjectNodeReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ObjectID" type="{http://sap.com/xi/AP/Common/GDT}ObjectID" minOccurs="0"/&gt;
 *         &lt;element name="FormattedID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeFormattedID" minOccurs="0"/&gt;
 *         &lt;element name="ObjectTypeCode" type="{http://sap.com/xi/AP/Common/GDT}ObjectTypeCode"/&gt;
 *         &lt;element name="ObjectNodeTypeCode" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTypeCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectNodeReference", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {"uuid", "objectID",
    "formattedID", "objectTypeCode", "objectNodeTypeCode"})
public class ObjectNodeReference {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "ObjectID")
    private ObjectID objectID;
    @XmlElement(name = "FormattedID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String formattedID;
    @XmlElement(name = "ObjectTypeCode", required = true)
    private ObjectTypeCode objectTypeCode;
    @XmlElement(name = "ObjectNodeTypeCode", required = true)
    private ObjectNodeTypeCode objectNodeTypeCode;

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
     * Gets the value of the objectID property.
     *
     * @return possible object is {@link ObjectID }
     *
     */
    public ObjectID getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     *
     * @param value allowed object is {@link ObjectID }
     *
     */
    public void setObjectID(final ObjectID value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the formattedID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFormattedID() {
        return formattedID;
    }

    /**
     * Sets the value of the formattedID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFormattedID(final String value) {
        this.formattedID = value;
    }

    /**
     * Gets the value of the objectTypeCode property.
     *
     * @return possible object is {@link ObjectTypeCode }
     *
     */
    public ObjectTypeCode getObjectTypeCode() {
        return objectTypeCode;
    }

    /**
     * Sets the value of the objectTypeCode property.
     *
     * @param value allowed object is {@link ObjectTypeCode }
     *
     */
    public void setObjectTypeCode(final ObjectTypeCode value) {
        this.objectTypeCode = value;
    }

    /**
     * Gets the value of the objectNodeTypeCode property.
     *
     * @return possible object is {@link ObjectNodeTypeCode }
     *
     */
    public ObjectNodeTypeCode getObjectNodeTypeCode() {
        return objectNodeTypeCode;
    }

    /**
     * Sets the value of the objectNodeTypeCode property.
     *
     * @param value allowed object is {@link ObjectNodeTypeCode }
     *
     */
    public void setObjectNodeTypeCode(final ObjectNodeTypeCode value) {
        this.objectNodeTypeCode = value;
    }

}
