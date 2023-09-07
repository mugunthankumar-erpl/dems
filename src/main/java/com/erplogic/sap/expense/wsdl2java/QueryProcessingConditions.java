
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for QueryProcessingConditions complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="QueryProcessingConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryHitsMaximumNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="QueryHitsUnlimitedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator"/&gt;
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
@XmlType(name = "QueryProcessingConditions", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "queryHitsMaximumNumberValue", "queryHitsUnlimitedIndicator", "lastReturnedObjectID"})
public class QueryProcessingConditions {

    @XmlElement(name = "QueryHitsMaximumNumberValue")
    private Integer queryHitsMaximumNumberValue;
    @XmlElement(name = "QueryHitsUnlimitedIndicator")
    private boolean queryHitsUnlimitedIndicator;
    @XmlElement(name = "LastReturnedObjectID")
    private ObjectID lastReturnedObjectID;

    /**
     * Gets the value of the queryHitsMaximumNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getQueryHitsMaximumNumberValue() {
        return queryHitsMaximumNumberValue;
    }

    /**
     * Sets the value of the queryHitsMaximumNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setQueryHitsMaximumNumberValue(final Integer value) {
        this.queryHitsMaximumNumberValue = value;
    }

    /**
     * Gets the value of the queryHitsUnlimitedIndicator property.
     *
     */
    public boolean isQueryHitsUnlimitedIndicator() {
        return queryHitsUnlimitedIndicator;
    }

    /**
     * Sets the value of the queryHitsUnlimitedIndicator property.
     *
     */
    public void setQueryHitsUnlimitedIndicator(final boolean value) {
        this.queryHitsUnlimitedIndicator = value;
    }

    /**
     * Gets the value of the lastReturnedObjectID property.
     *
     * @return possible object is {@link ObjectID }
     *
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
