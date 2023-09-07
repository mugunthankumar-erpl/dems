
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
 * ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployee_ID
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployee_ID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryApproverEmployee_ID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryApproverEmployee_ID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployee_ID", propOrder = {
    "inclusionExclusionCode", "intervalBoundaryTypeCode", "lowerBoundaryApproverEmployeeID",
    "upperBoundaryApproverEmployeeID"})
public class ExpenseReportQueryByElementsSimpleByRequestSelectionByApproverEmployeeID {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryApproverEmployee_ID")
    private EmployeeID lowerBoundaryApproverEmployeeID;
    @XmlElement(name = "UpperBoundaryApproverEmployee_ID")
    private EmployeeID upperBoundaryApproverEmployeeID;

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
     * Gets the value of the lowerBoundaryApproverEmployeeID property.
     *
     * @return possible object is {@link EmployeeID }
     *
     */
    public EmployeeID getLowerBoundaryApproverEmployeeID() {
        return lowerBoundaryApproverEmployeeID;
    }

    /**
     * Sets the value of the lowerBoundaryApproverEmployeeID property.
     *
     * @param value allowed object is {@link EmployeeID }
     *
     */
    public void setLowerBoundaryApproverEmployeeID(final EmployeeID value) {
        this.lowerBoundaryApproverEmployeeID = value;
    }

    /**
     * Gets the value of the upperBoundaryApproverEmployeeID property.
     *
     * @return possible object is {@link EmployeeID }
     *
     */
    public EmployeeID getUpperBoundaryApproverEmployeeID() {
        return upperBoundaryApproverEmployeeID;
    }

    /**
     * Sets the value of the upperBoundaryApproverEmployeeID property.
     *
     * @param value allowed object is {@link EmployeeID }
     *
     */
    public void setUpperBoundaryApproverEmployeeID(final EmployeeID value) {
        this.upperBoundaryApproverEmployeeID = value;
    }

}
