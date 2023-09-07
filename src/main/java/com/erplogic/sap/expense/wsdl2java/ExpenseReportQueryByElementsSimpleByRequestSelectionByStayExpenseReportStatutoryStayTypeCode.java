
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryStayExpenseReportStatutoryStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportStatutoryStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryStayExpenseReportStatutoryStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportStatutoryStayTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryStayExpenseReportStatutoryStayTypeCode",
    "upperBoundaryStayExpenseReportStatutoryStayTypeCode"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByStayExpenseReportStatutoryStayTypeCode {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryStayExpenseReportStatutoryStayTypeCode")
    private ExpenseReportStatutoryStayTypeCode lowerBoundaryStayExpenseReportStatutoryStayTypeCode;
    @XmlElement(name = "UpperBoundaryStayExpenseReportStatutoryStayTypeCode")
    private ExpenseReportStatutoryStayTypeCode upperBoundaryStayExpenseReportStatutoryStayTypeCode;

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
     * Gets the value of the lowerBoundaryStayExpenseReportStatutoryStayTypeCode
     * property.
     *
     * @return possible object is {@link ExpenseReportStatutoryStayTypeCode }
     *
     */
    public ExpenseReportStatutoryStayTypeCode getLowerBoundaryStayExpenseReportStatutoryStayTypeCode() {
        return lowerBoundaryStayExpenseReportStatutoryStayTypeCode;
    }

    /**
     * Sets the value of the lowerBoundaryStayExpenseReportStatutoryStayTypeCode
     * property.
     *
     * @param value allowed object is {@link ExpenseReportStatutoryStayTypeCode }
     *
     */
    public void setLowerBoundaryStayExpenseReportStatutoryStayTypeCode(final ExpenseReportStatutoryStayTypeCode value) {
        this.lowerBoundaryStayExpenseReportStatutoryStayTypeCode = value;
    }

    /**
     * Gets the value of the upperBoundaryStayExpenseReportStatutoryStayTypeCode
     * property.
     *
     * @return possible object is {@link ExpenseReportStatutoryStayTypeCode }
     *
     */
    public ExpenseReportStatutoryStayTypeCode getUpperBoundaryStayExpenseReportStatutoryStayTypeCode() {
        return upperBoundaryStayExpenseReportStatutoryStayTypeCode;
    }

    /**
     * Sets the value of the upperBoundaryStayExpenseReportStatutoryStayTypeCode
     * property.
     *
     * @param value allowed object is {@link ExpenseReportStatutoryStayTypeCode }
     *
     */
    public void setUpperBoundaryStayExpenseReportStatutoryStayTypeCode(final ExpenseReportStatutoryStayTypeCode value) {
        this.upperBoundaryStayExpenseReportStatutoryStayTypeCode = value;
    }

}
