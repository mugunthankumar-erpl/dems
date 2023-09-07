
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
 * Java class for ExpenseReportQueryByElementsSimpleByRequestSelectionByID
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportID" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByID", propOrder = {"inclusionExclusionCode",
    "intervalBoundaryTypeCode", "lowerBoundaryID", "upperBoundaryID"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByID {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryID")
    private ExpenseReportID lowerBoundaryID;
    @XmlElement(name = "UpperBoundaryID")
    private ExpenseReportID upperBoundaryID;

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
     * Gets the value of the lowerBoundaryID property.
     *
     * @return possible object is {@link ExpenseReportID }
     *
     */
    public ExpenseReportID getLowerBoundaryID() {
        return lowerBoundaryID;
    }

    /**
     * Sets the value of the lowerBoundaryID property.
     *
     * @param value allowed object is {@link ExpenseReportID }
     *
     */
    public void setLowerBoundaryID(final ExpenseReportID value) {
        this.lowerBoundaryID = value;
    }

    /**
     * Gets the value of the upperBoundaryID property.
     *
     * @return possible object is {@link ExpenseReportID }
     *
     */
    public ExpenseReportID getUpperBoundaryID() {
        return upperBoundaryID;
    }

    /**
     * Sets the value of the upperBoundaryID property.
     *
     * @param value allowed object is {@link ExpenseReportID }
     *
     */
    public void setUpperBoundaryID(final ExpenseReportID value) {
        this.upperBoundaryID = value;
    }

}
