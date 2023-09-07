
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryOpenReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryOpenReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryOpenReimbursementAmount",
    "upperBoundaryOpenReimbursementAmount"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByOpenReimbursementAmount {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryOpenReimbursementAmount")
    private Amount lowerBoundaryOpenReimbursementAmount;
    @XmlElement(name = "UpperBoundaryOpenReimbursementAmount")
    private Amount upperBoundaryOpenReimbursementAmount;

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
     * Gets the value of the lowerBoundaryOpenReimbursementAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getLowerBoundaryOpenReimbursementAmount() {
        return lowerBoundaryOpenReimbursementAmount;
    }

    /**
     * Sets the value of the lowerBoundaryOpenReimbursementAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setLowerBoundaryOpenReimbursementAmount(final Amount value) {
        this.lowerBoundaryOpenReimbursementAmount = value;
    }

    /**
     * Gets the value of the upperBoundaryOpenReimbursementAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getUpperBoundaryOpenReimbursementAmount() {
        return upperBoundaryOpenReimbursementAmount;
    }

    /**
     * Sets the value of the upperBoundaryOpenReimbursementAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setUpperBoundaryOpenReimbursementAmount(final Amount value) {
        this.upperBoundaryOpenReimbursementAmount = value;
    }

}
