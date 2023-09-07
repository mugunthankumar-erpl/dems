
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryStayLocationExpenseReportPerDiemRegionCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportPerDiemRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryStayLocationExpenseReportPerDiemRegionCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportPerDiemRegionCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryStayLocationExpenseReportPerDiemRegionCode",
    "upperBoundaryStayLocationExpenseReportPerDiemRegionCode"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationExpenseReportPerDiemRegionCode {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryStayLocationExpenseReportPerDiemRegionCode")
    private ExpenseReportPerDiemRegionCode lowerBoundaryStayLocationExpenseReportPerDiemRegionCode;
    @XmlElement(name = "UpperBoundaryStayLocationExpenseReportPerDiemRegionCode")
    private ExpenseReportPerDiemRegionCode upperBoundaryStayLocationExpenseReportPerDiemRegionCode;

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
     * Gets the value of the lowerBoundaryStayLocationExpenseReportPerDiemRegionCode
     * property.
     *
     * @return possible object is {@link ExpenseReportPerDiemRegionCode }
     *
     */
    public ExpenseReportPerDiemRegionCode getLowerBoundaryStayLocationExpenseReportPerDiemRegionCode() {
        return lowerBoundaryStayLocationExpenseReportPerDiemRegionCode;
    }

    /**
     * Sets the value of the lowerBoundaryStayLocationExpenseReportPerDiemRegionCode
     * property.
     *
     * @param value allowed object is {@link ExpenseReportPerDiemRegionCode }
     *
     */
    public void setLowerBoundaryStayLocationExpenseReportPerDiemRegionCode(final ExpenseReportPerDiemRegionCode value) {
        this.lowerBoundaryStayLocationExpenseReportPerDiemRegionCode = value;
    }

    /**
     * Gets the value of the upperBoundaryStayLocationExpenseReportPerDiemRegionCode
     * property.
     *
     * @return possible object is {@link ExpenseReportPerDiemRegionCode }
     *
     */
    public ExpenseReportPerDiemRegionCode getUpperBoundaryStayLocationExpenseReportPerDiemRegionCode() {
        return upperBoundaryStayLocationExpenseReportPerDiemRegionCode;
    }

    /**
     * Sets the value of the upperBoundaryStayLocationExpenseReportPerDiemRegionCode
     * property.
     *
     * @param value allowed object is {@link ExpenseReportPerDiemRegionCode }
     *
     */
    public void setUpperBoundaryStayLocationExpenseReportPerDiemRegionCode(final ExpenseReportPerDiemRegionCode value) {
        this.upperBoundaryStayLocationExpenseReportPerDiemRegionCode = value;
    }

}
