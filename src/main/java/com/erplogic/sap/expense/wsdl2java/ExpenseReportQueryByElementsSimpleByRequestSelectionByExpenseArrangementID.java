
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryExpenseArrangementID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseArrangementID" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryExpenseArrangementID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseArrangementID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryExpenseArrangementID",
    "upperBoundaryExpenseArrangementID"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementID {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryExpenseArrangementID")
    private ExpenseArrangementID lowerBoundaryExpenseArrangementID;
    @XmlElement(name = "UpperBoundaryExpenseArrangementID")
    private ExpenseArrangementID upperBoundaryExpenseArrangementID;

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
     * Gets the value of the lowerBoundaryExpenseArrangementID property.
     *
     * @return possible object is {@link ExpenseArrangementID }
     *
     */
    public ExpenseArrangementID getLowerBoundaryExpenseArrangementID() {
        return lowerBoundaryExpenseArrangementID;
    }

    /**
     * Sets the value of the lowerBoundaryExpenseArrangementID property.
     *
     * @param value allowed object is {@link ExpenseArrangementID }
     *
     */
    public void setLowerBoundaryExpenseArrangementID(final ExpenseArrangementID value) {
        this.lowerBoundaryExpenseArrangementID = value;
    }

    /**
     * Gets the value of the upperBoundaryExpenseArrangementID property.
     *
     * @return possible object is {@link ExpenseArrangementID }
     *
     */
    public ExpenseArrangementID getUpperBoundaryExpenseArrangementID() {
        return upperBoundaryExpenseArrangementID;
    }

    /**
     * Sets the value of the upperBoundaryExpenseArrangementID property.
     *
     * @param value allowed object is {@link ExpenseArrangementID }
     *
     */
    public void setUpperBoundaryExpenseArrangementID(final ExpenseArrangementID value) {
        this.upperBoundaryExpenseArrangementID = value;
    }

}
