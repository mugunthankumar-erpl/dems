
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryExpenseArrangementUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryExpenseArrangementUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryExpenseArrangementUUID",
    "upperBoundaryExpenseArrangementUUID"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByExpenseArrangementUUID {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryExpenseArrangementUUID")
    private UUID lowerBoundaryExpenseArrangementUUID;
    @XmlElement(name = "UpperBoundaryExpenseArrangementUUID")
    private UUID upperBoundaryExpenseArrangementUUID;

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
     * Gets the value of the lowerBoundaryExpenseArrangementUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getLowerBoundaryExpenseArrangementUUID() {
        return lowerBoundaryExpenseArrangementUUID;
    }

    /**
     * Sets the value of the lowerBoundaryExpenseArrangementUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setLowerBoundaryExpenseArrangementUUID(final UUID value) {
        this.lowerBoundaryExpenseArrangementUUID = value;
    }

    /**
     * Gets the value of the upperBoundaryExpenseArrangementUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getUpperBoundaryExpenseArrangementUUID() {
        return upperBoundaryExpenseArrangementUUID;
    }

    /**
     * Sets the value of the upperBoundaryExpenseArrangementUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setUpperBoundaryExpenseArrangementUUID(final UUID value) {
        this.upperBoundaryExpenseArrangementUUID = value;
    }

}
