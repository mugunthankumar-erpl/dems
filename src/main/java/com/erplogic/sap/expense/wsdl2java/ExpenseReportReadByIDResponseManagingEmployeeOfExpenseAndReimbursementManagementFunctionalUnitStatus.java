
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
 * ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitStatus
 * complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}PartyLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitStatus", propOrder = {
    "lifeCycleStatusCode", "lifeCycleStatusName"})
public class ExpenseReportReadByIDResponseManagingEmployeeOfExpenseAndReimbursementManagementFunctionalUnitStatus {

    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String lifeCycleStatusCode;
    @XmlElement(name = "LifeCycleStatusName")
    private String lifeCycleStatusName;

    /**
     * Gets the value of the lifeCycleStatusCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * Sets the value of the lifeCycleStatusCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLifeCycleStatusCode(final String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * Gets the value of the lifeCycleStatusName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLifeCycleStatusName() {
        return lifeCycleStatusName;
    }

    /**
     * Sets the value of the lifeCycleStatusName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLifeCycleStatusName(final String value) {
        this.lifeCycleStatusName = value;
    }

}
