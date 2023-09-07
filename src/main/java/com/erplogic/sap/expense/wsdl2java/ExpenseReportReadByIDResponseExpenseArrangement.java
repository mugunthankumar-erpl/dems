
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
 * Java class for ExpenseReportReadByIDResponseExpenseArrangement complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseExpenseArrangement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CompanyUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="WorkAgreementUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseArrangementID" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="WorkAgreementID" type="{http://sap.com/xi/AP/Common/GDT}WorkAgreementID" minOccurs="0"/&gt;
 *         &lt;element name="CompanyID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="CountryName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseExpenseArrangement", propOrder = {"uuid", "employeeUUID", "companyUUID",
    "workAgreementUUID", "id", "employeeID", "workAgreementID", "companyID", "countryCode", "countryName"})
public class ExpenseReportReadByIDResponseExpenseArrangement {

    @XmlElement(name = "UUID")
    private UUID uuid;
    @XmlElement(name = "EmployeeUUID")
    private UUID employeeUUID;
    @XmlElement(name = "CompanyUUID")
    private UUID companyUUID;
    @XmlElement(name = "WorkAgreementUUID")
    private UUID workAgreementUUID;
    @XmlElement(name = "ID")
    private ExpenseArrangementID id;
    @XmlElement(name = "EmployeeID")
    private EmployeeID employeeID;
    @XmlElement(name = "WorkAgreementID")
    private WorkAgreementID workAgreementID;
    @XmlElement(name = "CompanyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String companyID;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String countryCode;
    @XmlElement(name = "CountryName")
    private String countryName;

    /**
     * Gets the value of the uuid property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setUUID(final UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the employeeUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getEmployeeUUID() {
        return employeeUUID;
    }

    /**
     * Sets the value of the employeeUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setEmployeeUUID(final UUID value) {
        this.employeeUUID = value;
    }

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

    /**
     * Gets the value of the workAgreementUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getWorkAgreementUUID() {
        return workAgreementUUID;
    }

    /**
     * Sets the value of the workAgreementUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setWorkAgreementUUID(final UUID value) {
        this.workAgreementUUID = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link ExpenseArrangementID }
     *
     */
    public ExpenseArrangementID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link ExpenseArrangementID }
     *
     */
    public void setID(final ExpenseArrangementID value) {
        this.id = value;
    }

    /**
     * Gets the value of the employeeID property.
     *
     * @return possible object is {@link EmployeeID }
     *
     */
    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     *
     * @param value allowed object is {@link EmployeeID }
     *
     */
    public void setEmployeeID(final EmployeeID value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the workAgreementID property.
     *
     * @return possible object is {@link WorkAgreementID }
     *
     */
    public WorkAgreementID getWorkAgreementID() {
        return workAgreementID;
    }

    /**
     * Sets the value of the workAgreementID property.
     *
     * @param value allowed object is {@link WorkAgreementID }
     *
     */
    public void setWorkAgreementID(final WorkAgreementID value) {
        this.workAgreementID = value;
    }

    /**
     * Gets the value of the companyID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCompanyID(final String value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the countryCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCountryCode(final String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCountryName(final String value) {
        this.countryName = value;
    }

}
