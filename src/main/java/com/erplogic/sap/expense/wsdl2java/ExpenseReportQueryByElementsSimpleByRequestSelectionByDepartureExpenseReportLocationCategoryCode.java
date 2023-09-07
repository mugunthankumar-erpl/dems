
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryDepartureExpenseReportLocationCategoryCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportLocationCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryDepartureExpenseReportLocationCategoryCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportLocationCategoryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryDepartureExpenseReportLocationCategoryCode",
    "upperBoundaryDepartureExpenseReportLocationCategoryCode"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByDepartureExpenseReportLocationCategoryCode {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryDepartureExpenseReportLocationCategoryCode")
    private ExpenseReportLocationCategoryCode lowerBoundaryDepartureExpenseReportLocationCategoryCode;
    @XmlElement(name = "UpperBoundaryDepartureExpenseReportLocationCategoryCode")
    private ExpenseReportLocationCategoryCode upperBoundaryDepartureExpenseReportLocationCategoryCode;

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
     * Gets the value of the lowerBoundaryDepartureExpenseReportLocationCategoryCode
     * property.
     *
     * @return possible object is {@link ExpenseReportLocationCategoryCode }
     *
     */
    public ExpenseReportLocationCategoryCode getLowerBoundaryDepartureExpenseReportLocationCategoryCode() {
        return lowerBoundaryDepartureExpenseReportLocationCategoryCode;
    }

    /**
     * Sets the value of the lowerBoundaryDepartureExpenseReportLocationCategoryCode
     * property.
     *
     * @param value allowed object is {@link ExpenseReportLocationCategoryCode }
     *
     */
    public void setLowerBoundaryDepartureExpenseReportLocationCategoryCode(
        final ExpenseReportLocationCategoryCode value) {
        this.lowerBoundaryDepartureExpenseReportLocationCategoryCode = value;
    }

    /**
     * Gets the value of the upperBoundaryDepartureExpenseReportLocationCategoryCode
     * property.
     *
     * @return possible object is {@link ExpenseReportLocationCategoryCode }
     *
     */
    public ExpenseReportLocationCategoryCode getUpperBoundaryDepartureExpenseReportLocationCategoryCode() {
        return upperBoundaryDepartureExpenseReportLocationCategoryCode;
    }

    /**
     * Sets the value of the upperBoundaryDepartureExpenseReportLocationCategoryCode
     * property.
     *
     * @param value allowed object is {@link ExpenseReportLocationCategoryCode }
     *
     */
    public void setUpperBoundaryDepartureExpenseReportLocationCategoryCode(
        final ExpenseReportLocationCategoryCode value) {
        this.upperBoundaryDepartureExpenseReportLocationCategoryCode = value;
    }

}
