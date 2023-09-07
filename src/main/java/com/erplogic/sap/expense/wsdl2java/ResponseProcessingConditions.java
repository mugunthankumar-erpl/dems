
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ResponseProcessingConditions complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ResponseProcessingConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnedQueryHitsNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue"/&gt;
 *         &lt;element name="MoreHitsAvailableIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator"/&gt;
 *         &lt;element name="LastReturnedObjectID" type="{http://sap.com/xi/AP/Common/GDT}ObjectID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseProcessingConditions", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "returnedQueryHitsNumberValue", "moreHitsAvailableIndicator", "lastReturnedObjectID"})
public class ResponseProcessingConditions {

    @XmlElement(name = "ReturnedQueryHitsNumberValue")
    private int returnedQueryHitsNumberValue;
    @XmlElement(name = "MoreHitsAvailableIndicator")
    private boolean moreHitsAvailableIndicator;
    @XmlElement(name = "LastReturnedObjectID")
    private ObjectID lastReturnedObjectID;

    /**
     * Gets the value of the returnedQueryHitsNumberValue property.
     *
     */
    public int getReturnedQueryHitsNumberValue() {
        return returnedQueryHitsNumberValue;
    }

    /**
     * Sets the value of the returnedQueryHitsNumberValue property.
     *
     */
    public void setReturnedQueryHitsNumberValue(final int value) {
        this.returnedQueryHitsNumberValue = value;
    }

    /**
     * Gets the value of the moreHitsAvailableIndicator property.
     *
     */
    public boolean isMoreHitsAvailableIndicator() {
        return moreHitsAvailableIndicator;
    }

    /**
     * Sets the value of the moreHitsAvailableIndicator property.
     *
     */
    public void setMoreHitsAvailableIndicator(final boolean value) {
        this.moreHitsAvailableIndicator = value;
    }

    /**
     * Gets the value of the lastReturnedObjectID property.
     *
     * @return possible object is {@link ObjectID }
     */
    public ObjectID getLastReturnedObjectID() {
        return lastReturnedObjectID;
    }

    /**
     * Sets the value of the lastReturnedObjectID property.
     *
     * @param value allowed object is {@link ObjectID }
     *
     */
    public void setLastReturnedObjectID(final ObjectID value) {
        this.lastReturnedObjectID = value;
    }

}
