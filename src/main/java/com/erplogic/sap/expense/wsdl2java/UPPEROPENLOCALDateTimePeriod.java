
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UPPEROPEN_LOCAL_DateTimePeriod complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="UPPEROPEN_LOCAL_DateTimePeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDateTime" type="{http://sap.com/xi/BASIS/Global}LOCAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://sap.com/xi/BASIS/Global}LOCAL_DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPPEROPEN_LOCAL_DateTimePeriod", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "startDateTime", "endDateTime"})
public class UPPEROPENLOCALDateTimePeriod {

    @XmlElement(name = "StartDateTime")
    private LOCALDateTime startDateTime;
    @XmlElement(name = "EndDateTime")
    private LOCALDateTime endDateTime;

    /**
     * Gets the value of the startDateTime property.
     *
     * @return possible object is {@link LOCALDateTime }
     *
     */
    public LOCALDateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     *
     * @param value allowed object is {@link LOCALDateTime }
     *
     */
    public void setStartDateTime(final LOCALDateTime value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     *
     * @return possible object is {@link LOCALDateTime }
     *
     */
    public LOCALDateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     *
     * @param value allowed object is {@link LOCALDateTime }
     *
     */
    public void setEndDateTime(final LOCALDateTime value) {
        this.endDateTime = value;
    }

}
