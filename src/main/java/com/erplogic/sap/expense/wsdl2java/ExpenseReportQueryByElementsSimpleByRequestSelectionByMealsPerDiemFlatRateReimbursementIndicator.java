
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryMealsPerDiemFlatRateReimbursementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryMealsPerDiemFlatRateReimbursementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryMealsPerDiemFlatRateReimbursementIndicator",
    "upperBoundaryMealsPerDiemFlatRateReimbursementIndicator"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByMealsPerDiemFlatRateReimbursementIndicator {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryMealsPerDiemFlatRateReimbursementIndicator")
    private Boolean lowerBoundaryMealsPerDiemFlatRateReimbursementIndicator;
    @XmlElement(name = "UpperBoundaryMealsPerDiemFlatRateReimbursementIndicator")
    private Boolean upperBoundaryMealsPerDiemFlatRateReimbursementIndicator;

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
     * Gets the value of the lowerBoundaryMealsPerDiemFlatRateReimbursementIndicator
     * property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isLowerBoundaryMealsPerDiemFlatRateReimbursementIndicator() {
        return lowerBoundaryMealsPerDiemFlatRateReimbursementIndicator;
    }

    /**
     * Sets the value of the lowerBoundaryMealsPerDiemFlatRateReimbursementIndicator
     * property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setLowerBoundaryMealsPerDiemFlatRateReimbursementIndicator(final Boolean value) {
        this.lowerBoundaryMealsPerDiemFlatRateReimbursementIndicator = value;
    }

    /**
     * Gets the value of the upperBoundaryMealsPerDiemFlatRateReimbursementIndicator
     * property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isUpperBoundaryMealsPerDiemFlatRateReimbursementIndicator() {
        return upperBoundaryMealsPerDiemFlatRateReimbursementIndicator;
    }

    /**
     * Sets the value of the upperBoundaryMealsPerDiemFlatRateReimbursementIndicator
     * property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setUpperBoundaryMealsPerDiemFlatRateReimbursementIndicator(final Boolean value) {
        this.upperBoundaryMealsPerDiemFlatRateReimbursementIndicator = value;
    }

}
