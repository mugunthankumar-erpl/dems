
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for
 * ExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress complex
 * type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="SourceObjectNodeReference" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeReference" minOccurs="0"/&gt;
 *         &lt;element name="SourceValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}UPPEROPEN_GLOBAL_DateTimePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress", propOrder = {"uuid",
    "sourceObjectNodeReference", "sourceValidityPeriod"})
public class ExpenseReportReadByIDResponseAddressSnapshotMainStayLocationAddress {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "SourceObjectNodeReference")
    private ObjectNodeReference sourceObjectNodeReference;
    @XmlElement(name = "SourceValidityPeriod")
    private UPPEROPENGLOBALDateTimePeriod sourceValidityPeriod;

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
     * Gets the value of the sourceObjectNodeReference property.
     *
     * @return possible object is {@link ObjectNodeReference }
     *
     */
    public ObjectNodeReference getSourceObjectNodeReference() {
        return sourceObjectNodeReference;
    }

    /**
     * Sets the value of the sourceObjectNodeReference property.
     *
     * @param value allowed object is {@link ObjectNodeReference }
     *
     */
    public void setSourceObjectNodeReference(final ObjectNodeReference value) {
        this.sourceObjectNodeReference = value;
    }

    /**
     * Gets the value of the sourceValidityPeriod property.
     *
     * @return possible object is {@link UPPEROPENGLOBALDateTimePeriod }
     *
     */
    public UPPEROPENGLOBALDateTimePeriod getSourceValidityPeriod() {
        return sourceValidityPeriod;
    }

    /**
     * Sets the value of the sourceValidityPeriod property.
     *
     * @param value allowed object is {@link UPPEROPENGLOBALDateTimePeriod }
     *
     */
    public void setSourceValidityPeriod(final UPPEROPENGLOBALDateTimePeriod value) {
        this.sourceValidityPeriod = value;
    }

}
