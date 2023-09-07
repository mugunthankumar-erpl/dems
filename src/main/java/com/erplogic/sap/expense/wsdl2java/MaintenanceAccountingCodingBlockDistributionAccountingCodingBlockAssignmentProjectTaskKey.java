
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for
 * MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaskID" type="{http://sap.com/xi/AP/Common/GDT}ProjectElementID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey", namespace = "http://sap.com/xi/AP/IS/CodingBlock/Global", propOrder = {
    "taskID"})
public class MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey {

    @XmlElement(name = "TaskID")
    private ProjectElementID taskID;

    /**
     * Gets the value of the taskID property.
     *
     * @return possible object is {@link ProjectElementID }
     *
     */
    public ProjectElementID getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     *
     * @param value allowed object is {@link ProjectElementID }
     *
     */
    public void setTaskID(final ProjectElementID value) {
        this.taskID = value;
    }

}
