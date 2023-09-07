
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
 * Java class for ExpenseReportReadByIDResponseEmployee complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseEmployee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="InternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="PartialSystemAdministrativeData" type="{http://sap.com/xi/AP/Common/GDT}SystemAdministrativeData" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://483888-one-off.sap.com/YGCBELCOY_}ExpenseReportReadByIDResponseEmployeeStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseEmployee", propOrder = {"uuid", "internalID",
    "partialSystemAdministrativeData", "status"})
public class ExpenseReportReadByIDResponseEmployee {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "InternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String internalID;
    @XmlElement(name = "PartialSystemAdministrativeData")
    private SystemAdministrativeData partialSystemAdministrativeData;
    @XmlElement(name = "Status")
    private ExpenseReportReadByIDResponseEmployeeStatus status;

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
     * Gets the value of the internalID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getInternalID() {
        return internalID;
    }

    /**
     * Sets the value of the internalID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setInternalID(final String value) {
        this.internalID = value;
    }

    /**
     * Gets the value of the partialSystemAdministrativeData property.
     *
     * @return possible object is {@link SystemAdministrativeData }
     *
     */
    public SystemAdministrativeData getPartialSystemAdministrativeData() {
        return partialSystemAdministrativeData;
    }

    /**
     * Sets the value of the partialSystemAdministrativeData property.
     *
     * @param value allowed object is {@link SystemAdministrativeData }
     *
     */
    public void setPartialSystemAdministrativeData(final SystemAdministrativeData value) {
        this.partialSystemAdministrativeData = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is {@link ExpenseReportReadByIDResponseEmployeeStatus
     *         }
     *
     */
    public ExpenseReportReadByIDResponseEmployeeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link ExpenseReportReadByIDResponseEmployeeStatus }
     *
     */
    public void setStatus(final ExpenseReportReadByIDResponseEmployeeStatus value) {
        this.status = value;
    }

}
