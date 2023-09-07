
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryReimbursementStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportReimbursementStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryReimbursementStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportReimbursementStatusCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryReimbursementStatusCode",
    "upperBoundaryReimbursementStatusCode"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByReimbursementStatusCode {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryReimbursementStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String lowerBoundaryReimbursementStatusCode;
    @XmlElement(name = "UpperBoundaryReimbursementStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String upperBoundaryReimbursementStatusCode;

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
     * Gets the value of the lowerBoundaryReimbursementStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLowerBoundaryReimbursementStatusCode() {
        return lowerBoundaryReimbursementStatusCode;
    }

    /**
     * Sets the value of the lowerBoundaryReimbursementStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLowerBoundaryReimbursementStatusCode(final String value) {
        this.lowerBoundaryReimbursementStatusCode = value;
    }

    /**
     * Gets the value of the upperBoundaryReimbursementStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUpperBoundaryReimbursementStatusCode() {
        return upperBoundaryReimbursementStatusCode;
    }

    /**
     * Sets the value of the upperBoundaryReimbursementStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUpperBoundaryReimbursementStatusCode(final String value) {
        this.upperBoundaryReimbursementStatusCode = value;
    }

}
