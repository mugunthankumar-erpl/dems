
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangement_CompanyUUID
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangement_CompanyUUID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryExpenseArrangement_CompanyUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryExpenseArrangement_CompanyUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangement_CompanyUUID", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryExpenseArrangementCompanyUUID",
    "upperBoundaryExpenseArrangementCompanyUUID"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementCompanyUUID {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryExpenseArrangement_CompanyUUID")
    private UUID lowerBoundaryExpenseArrangementCompanyUUID;
    @XmlElement(name = "UpperBoundaryExpenseArrangement_CompanyUUID")
    private UUID upperBoundaryExpenseArrangementCompanyUUID;

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
     * Gets the value of the lowerBoundaryExpenseArrangementCompanyUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getLowerBoundaryExpenseArrangementCompanyUUID() {
        return lowerBoundaryExpenseArrangementCompanyUUID;
    }

    /**
     * Sets the value of the lowerBoundaryExpenseArrangementCompanyUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setLowerBoundaryExpenseArrangementCompanyUUID(final UUID value) {
        this.lowerBoundaryExpenseArrangementCompanyUUID = value;
    }

    /**
     * Gets the value of the upperBoundaryExpenseArrangementCompanyUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getUpperBoundaryExpenseArrangementCompanyUUID() {
        return upperBoundaryExpenseArrangementCompanyUUID;
    }

    /**
     * Sets the value of the upperBoundaryExpenseArrangementCompanyUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setUpperBoundaryExpenseArrangementCompanyUUID(final UUID value) {
        this.upperBoundaryExpenseArrangementCompanyUUID = value;
    }

}
