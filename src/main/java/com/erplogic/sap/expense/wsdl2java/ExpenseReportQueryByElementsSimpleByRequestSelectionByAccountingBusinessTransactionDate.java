
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryAccountingBusinessTransactionDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryAccountingBusinessTransactionDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryAccountingBusinessTransactionDate",
    "upperBoundaryAccountingBusinessTransactionDate"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByAccountingBusinessTransactionDate {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryAccountingBusinessTransactionDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar lowerBoundaryAccountingBusinessTransactionDate;
    @XmlElement(name = "UpperBoundaryAccountingBusinessTransactionDate")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar upperBoundaryAccountingBusinessTransactionDate;

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
     * Gets the value of the lowerBoundaryAccountingBusinessTransactionDate
     * property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLowerBoundaryAccountingBusinessTransactionDate() {
        return lowerBoundaryAccountingBusinessTransactionDate;
    }

    /**
     * Sets the value of the lowerBoundaryAccountingBusinessTransactionDate
     * property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setLowerBoundaryAccountingBusinessTransactionDate(final XMLGregorianCalendar value) {
        this.lowerBoundaryAccountingBusinessTransactionDate = value;
    }

    /**
     * Gets the value of the upperBoundaryAccountingBusinessTransactionDate
     * property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUpperBoundaryAccountingBusinessTransactionDate() {
        return upperBoundaryAccountingBusinessTransactionDate;
    }

    /**
     * Sets the value of the upperBoundaryAccountingBusinessTransactionDate
     * property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setUpperBoundaryAccountingBusinessTransactionDate(final XMLGregorianCalendar value) {
        this.upperBoundaryAccountingBusinessTransactionDate = value;
    }

}
