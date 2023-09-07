
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
 * Java class for
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryStartDateTime" type="{http://sap.com/xi/BASIS/Global}LOCAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryStartDateTime" type="{http://sap.com/xi/BASIS/Global}LOCAL_DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryStartDateTime", "upperBoundaryStartDateTime"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByPeriodStartDateTime {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryStartDateTime")
    private LOCALDateTime lowerBoundaryStartDateTime;
    @XmlElement(name = "UpperBoundaryStartDateTime")
    private LOCALDateTime upperBoundaryStartDateTime;

    /**
     * Gets the value of the inclusionExclusionCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getInclusionExclusionCode() {
        return inclusionExclusionCode;
    }

    /**
     * Sets the value of the inclusionExclusionCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setInclusionExclusionCode(final String value) {
        this.inclusionExclusionCode = value;
    }

    /**
     * Gets the value of the intervalBoundaryTypeCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIntervalBoundaryTypeCode() {
        return intervalBoundaryTypeCode;
    }

    /**
     * Sets the value of the intervalBoundaryTypeCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIntervalBoundaryTypeCode(final String value) {
        this.intervalBoundaryTypeCode = value;
    }

    /**
     * Gets the value of the lowerBoundaryStartDateTime property.
     *
     * @return possible object is {@link LOCALDateTime }
     *
     */
    public LOCALDateTime getLowerBoundaryStartDateTime() {
        return lowerBoundaryStartDateTime;
    }

    /**
     * Sets the value of the lowerBoundaryStartDateTime property.
     *
     * @param value allowed object is {@link LOCALDateTime }
     *
     */
    public void setLowerBoundaryStartDateTime(final LOCALDateTime value) {
        this.lowerBoundaryStartDateTime = value;
    }

    /**
     * Gets the value of the upperBoundaryStartDateTime property.
     *
     * @return possible object is {@link LOCALDateTime }
     *
     */
    public LOCALDateTime getUpperBoundaryStartDateTime() {
        return upperBoundaryStartDateTime;
    }

    /**
     * Sets the value of the upperBoundaryStartDateTime property.
     *
     * @param value allowed object is {@link LOCALDateTime }
     *
     */
    public void setUpperBoundaryStartDateTime(final LOCALDateTime value) {
        this.upperBoundaryStartDateTime = value;
    }

}
