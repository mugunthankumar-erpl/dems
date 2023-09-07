
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExpenseReportReadByIDResponseAdditionalCompany complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseAdditionalCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseAdditionalCompany", propOrder = {"companyUUID"})
public class ExpenseReportReadByIDResponseAdditionalCompany {

    @XmlElement(name = "CompanyUUID")
    private UUID companyUUID;

    /**
     * Gets the value of the companyUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getCompanyUUID() {
        return companyUUID;
    }

    /**
     * Sets the value of the companyUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setCompanyUUID(final UUID value) {
        this.companyUUID = value;
    }

}
