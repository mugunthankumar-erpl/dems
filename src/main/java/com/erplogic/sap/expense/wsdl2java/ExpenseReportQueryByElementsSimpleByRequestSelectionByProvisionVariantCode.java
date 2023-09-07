
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryProvisionVariantCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportProvisionVariantCode" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryProvisionVariantCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportProvisionVariantCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryProvisionVariantCode",
    "upperBoundaryProvisionVariantCode"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByProvisionVariantCode {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryProvisionVariantCode")
    private ExpenseReportProvisionVariantCode lowerBoundaryProvisionVariantCode;
    @XmlElement(name = "UpperBoundaryProvisionVariantCode")
    private ExpenseReportProvisionVariantCode upperBoundaryProvisionVariantCode;

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
     * Gets the value of the lowerBoundaryProvisionVariantCode property.
     *
     * @return possible object is {@link ExpenseReportProvisionVariantCode }
     *
     */
    public ExpenseReportProvisionVariantCode getLowerBoundaryProvisionVariantCode() {
        return lowerBoundaryProvisionVariantCode;
    }

    /**
     * Sets the value of the lowerBoundaryProvisionVariantCode property.
     *
     * @param value allowed object is {@link ExpenseReportProvisionVariantCode }
     *
     */
    public void setLowerBoundaryProvisionVariantCode(final ExpenseReportProvisionVariantCode value) {
        this.lowerBoundaryProvisionVariantCode = value;
    }

    /**
     * Gets the value of the upperBoundaryProvisionVariantCode property.
     *
     * @return possible object is {@link ExpenseReportProvisionVariantCode }
     *
     */
    public ExpenseReportProvisionVariantCode getUpperBoundaryProvisionVariantCode() {
        return upperBoundaryProvisionVariantCode;
    }

    /**
     * Sets the value of the upperBoundaryProvisionVariantCode property.
     *
     * @param value allowed object is {@link ExpenseReportProvisionVariantCode }
     *
     */
    public void setUpperBoundaryProvisionVariantCode(final ExpenseReportProvisionVariantCode value) {
        this.upperBoundaryProvisionVariantCode = value;
    }

}
