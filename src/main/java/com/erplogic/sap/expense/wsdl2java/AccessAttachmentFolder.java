
package com.erplogic.sap.expense.wsdl2java;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AccessAttachmentFolder complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="AccessAttachmentFolder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Document" type="{http://sap.com/xi/DocumentServices/Global}AccessAttachmentFolderDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAttachmentFolder", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {"uuid",
    "document"})
public class AccessAttachmentFolder {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "Document")
    private List<AccessAttachmentFolderDocument> document;

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
     * Gets the value of the document property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the document property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDocument().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessAttachmentFolderDocument }
     *
     *
     */
    public List<AccessAttachmentFolderDocument> getDocument() {
        if (document == null) {
            document = new ArrayList<AccessAttachmentFolderDocument>();
        }
        return this.document;
    }

}
