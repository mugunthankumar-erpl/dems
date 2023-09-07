
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryAccommodationPerDiemFlatRateReimbursementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryAccommodationPerDiemFlatRateReimbursementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode",
    "lowerBoundaryAccommodationPerDiemFlatRateReimbursementIndicator",
    "upperBoundaryAccommodationPerDiemFlatRateReimbursementIndicator"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByAccommodationPerDiemFlatRateReimbursementIndicator {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryAccommodationPerDiemFlatRateReimbursementIndicator")
    private Boolean lowerBoundaryAccommodationPerDiemFlatRateReimbursementIndicator;
    @XmlElement(name = "UpperBoundaryAccommodationPerDiemFlatRateReimbursementIndicator")
    private Boolean upperBoundaryAccommodationPerDiemFlatRateReimbursementIndicator;

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
     * Gets the value of the
     * lowerBoundaryAccommodationPerDiemFlatRateReimbursementIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isLowerBoundaryAccommodationPerDiemFlatRateReimbursementIndicator() {
        return lowerBoundaryAccommodationPerDiemFlatRateReimbursementIndicator;
    }

    /**
     * Sets the value of the
     * lowerBoundaryAccommodationPerDiemFlatRateReimbursementIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setLowerBoundaryAccommodationPerDiemFlatRateReimbursementIndicator(final Boolean value) {
        this.lowerBoundaryAccommodationPerDiemFlatRateReimbursementIndicator = value;
    }

    /**
     * Gets the value of the
     * upperBoundaryAccommodationPerDiemFlatRateReimbursementIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isUpperBoundaryAccommodationPerDiemFlatRateReimbursementIndicator() {
        return upperBoundaryAccommodationPerDiemFlatRateReimbursementIndicator;
    }

    /**
     * Sets the value of the
     * upperBoundaryAccommodationPerDiemFlatRateReimbursementIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setUpperBoundaryAccommodationPerDiemFlatRateReimbursementIndicator(final Boolean value) {
        this.upperBoundaryAccommodationPerDiemFlatRateReimbursementIndicator = value;
    }

}
