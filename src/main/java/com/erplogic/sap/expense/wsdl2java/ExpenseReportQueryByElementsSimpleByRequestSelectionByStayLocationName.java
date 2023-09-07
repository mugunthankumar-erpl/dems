
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryStayLocationName" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryStayLocationName" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryStayLocationName",
    "upperBoundaryStayLocationName"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByStayLocationName {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryStayLocationName")
    private String lowerBoundaryStayLocationName;
    @XmlElement(name = "UpperBoundaryStayLocationName")
    private String upperBoundaryStayLocationName;

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
     * Gets the value of the lowerBoundaryStayLocationName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLowerBoundaryStayLocationName() {
        return lowerBoundaryStayLocationName;
    }

    /**
     * Sets the value of the lowerBoundaryStayLocationName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLowerBoundaryStayLocationName(final String value) {
        this.lowerBoundaryStayLocationName = value;
    }

    /**
     * Gets the value of the upperBoundaryStayLocationName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUpperBoundaryStayLocationName() {
        return upperBoundaryStayLocationName;
    }

    /**
     * Sets the value of the upperBoundaryStayLocationName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUpperBoundaryStayLocationName(final String value) {
        this.upperBoundaryStayLocationName = value;
    }

}
