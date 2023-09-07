
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
 * Java class for ProjectReference complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ProjectReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectID" type="{http://sap.com/xi/AP/Common/GDT}ProjectID" minOccurs="0"/&gt;
 *         &lt;element name="ProjectUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ProjectName" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="ProjectElementID" type="{http://sap.com/xi/AP/Common/GDT}ProjectElementID" minOccurs="0"/&gt;
 *         &lt;element name="ProjectElementUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ProjectElementName" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="ProjectElementTypeCode" type="{http://sap.com/xi/AP/Common/GDT}ProjectElementTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectReference", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {"projectID",
    "projectUUID", "projectName", "projectElementID", "projectElementUUID", "projectElementName",
    "projectElementTypeCode"})
public class ProjectReference {

    @XmlElement(name = "ProjectID")
    private ProjectID projectID;
    @XmlElement(name = "ProjectUUID")
    private UUID projectUUID;
    @XmlElement(name = "ProjectName")
    private MEDIUMName projectName;
    @XmlElement(name = "ProjectElementID")
    private ProjectElementID projectElementID;
    @XmlElement(name = "ProjectElementUUID")
    private UUID projectElementUUID;
    @XmlElement(name = "ProjectElementName")
    private MEDIUMName projectElementName;
    @XmlElement(name = "ProjectElementTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String projectElementTypeCode;

    /**
     * Gets the value of the projectID property.
     *
     * @return possible object is {@link ProjectID }
     *
     */
    public ProjectID getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     *
     * @param value allowed object is {@link ProjectID }
     *
     */
    public void setProjectID(final ProjectID value) {
        this.projectID = value;
    }

    /**
     * Gets the value of the projectUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getProjectUUID() {
        return projectUUID;
    }

    /**
     * Sets the value of the projectUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setProjectUUID(final UUID value) {
        this.projectUUID = value;
    }

    /**
     * Gets the value of the projectName property.
     *
     * @return possible object is {@link MEDIUMName }
     *
     */
    public MEDIUMName getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     *
     * @param value allowed object is {@link MEDIUMName }
     *
     */
    public void setProjectName(final MEDIUMName value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectElementID property.
     *
     * @return possible object is {@link ProjectElementID }
     *
     */
    public ProjectElementID getProjectElementID() {
        return projectElementID;
    }

    /**
     * Sets the value of the projectElementID property.
     *
     * @param value allowed object is {@link ProjectElementID }
     *
     */
    public void setProjectElementID(final ProjectElementID value) {
        this.projectElementID = value;
    }

    /**
     * Gets the value of the projectElementUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getProjectElementUUID() {
        return projectElementUUID;
    }

    /**
     * Sets the value of the projectElementUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setProjectElementUUID(final UUID value) {
        this.projectElementUUID = value;
    }

    /**
     * Gets the value of the projectElementName property.
     *
     * @return possible object is {@link MEDIUMName }
     *
     */
    public MEDIUMName getProjectElementName() {
        return projectElementName;
    }

    /**
     * Sets the value of the projectElementName property.
     *
     * @param value allowed object is {@link MEDIUMName }
     *
     */
    public void setProjectElementName(final MEDIUMName value) {
        this.projectElementName = value;
    }

    /**
     * Gets the value of the projectElementTypeCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProjectElementTypeCode() {
        return projectElementTypeCode;
    }

    /**
     * Sets the value of the projectElementTypeCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProjectElementTypeCode(final String value) {
        this.projectElementTypeCode = value;
    }

}
