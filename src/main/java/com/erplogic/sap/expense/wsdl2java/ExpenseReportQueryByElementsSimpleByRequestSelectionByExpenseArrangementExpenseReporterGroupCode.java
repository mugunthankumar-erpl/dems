
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangement_ExpenseReporterGroupCode
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangement_ExpenseReporterGroupCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryExpenseArrangement_ExpenseReporterGroupCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReporterGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryExpenseArrangement_ExpenseReporterGroupCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReporterGroupCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangement_ExpenseReporterGroupCode", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryExpenseArrangementExpenseReporterGroupCode",
    "upperBoundaryExpenseArrangementExpenseReporterGroupCode"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementExpenseReporterGroupCode {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryExpenseArrangement_ExpenseReporterGroupCode")
    private ExpenseReporterGroupCode lowerBoundaryExpenseArrangementExpenseReporterGroupCode;
    @XmlElement(name = "UpperBoundaryExpenseArrangement_ExpenseReporterGroupCode")
    private ExpenseReporterGroupCode upperBoundaryExpenseArrangementExpenseReporterGroupCode;

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
     * Gets the value of the lowerBoundaryExpenseArrangementExpenseReporterGroupCode
     * property.
     *
     * @return possible object is {@link ExpenseReporterGroupCode }
     *
     */
    public ExpenseReporterGroupCode getLowerBoundaryExpenseArrangementExpenseReporterGroupCode() {
        return lowerBoundaryExpenseArrangementExpenseReporterGroupCode;
    }

    /**
     * Sets the value of the lowerBoundaryExpenseArrangementExpenseReporterGroupCode
     * property.
     *
     * @param value allowed object is {@link ExpenseReporterGroupCode }
     *
     */
    public void setLowerBoundaryExpenseArrangementExpenseReporterGroupCode(final ExpenseReporterGroupCode value) {
        this.lowerBoundaryExpenseArrangementExpenseReporterGroupCode = value;
    }

    /**
     * Gets the value of the upperBoundaryExpenseArrangementExpenseReporterGroupCode
     * property.
     *
     * @return possible object is {@link ExpenseReporterGroupCode }
     *
     */
    public ExpenseReporterGroupCode getUpperBoundaryExpenseArrangementExpenseReporterGroupCode() {
        return upperBoundaryExpenseArrangementExpenseReporterGroupCode;
    }

    /**
     * Sets the value of the upperBoundaryExpenseArrangementExpenseReporterGroupCode
     * property.
     *
     * @param value allowed object is {@link ExpenseReporterGroupCode }
     *
     */
    public void setUpperBoundaryExpenseArrangementExpenseReporterGroupCode(final ExpenseReporterGroupCode value) {
        this.upperBoundaryExpenseArrangementExpenseReporterGroupCode = value;
    }

}
