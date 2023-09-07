
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
 * Java class for ExpenseReportCreateRequestItinerarySegment complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportCreateRequestItinerarySegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportItinerarySegmentTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTime" type="{http://sap.com/xi/BASIS/Global}LOCAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="StayDescription" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationName" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationExpenseReportPerDiemRegionCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportPerDiemRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportStatutoryStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportStatutoryStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportEnterpriseStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportEnterpriseStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportActivityStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportActivityStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="MealsPerDiemFlatRateReimbursementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationRegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="MunicipalityCode" type="{http://sap.com/xi/AP/Globalization/HCM/Common/AT/Global}MunicipalityCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportCreateRequestItinerarySegment", propOrder = {"typeCode", "startDateTime",
    "stayDescription", "stayLocationName", "stayLocationCountryCode", "stayLocationExpenseReportPerDiemRegionCode",
    "stayExpenseReportStatutoryStayTypeCode", "stayExpenseReportEnterpriseStayTypeCode",
    "stayExpenseReportActivityStayTypeCode", "mealsPerDiemFlatRateReimbursementIndicator", "stayLocationRegionCode",
    "municipalityCode"})
public class ExpenseReportCreateRequestItinerarySegment {

    @XmlElement(name = "TypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String typeCode;
    @XmlElement(name = "StartDateTime")
    private LOCALDateTime startDateTime;
    @XmlElement(name = "StayDescription")
    private String stayDescription;
    @XmlElement(name = "StayLocationName")
    private String stayLocationName;
    @XmlElement(name = "StayLocationCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String stayLocationCountryCode;
    @XmlElement(name = "StayLocationExpenseReportPerDiemRegionCode")
    private ExpenseReportPerDiemRegionCode stayLocationExpenseReportPerDiemRegionCode;
    @XmlElement(name = "StayExpenseReportStatutoryStayTypeCode")
    private ExpenseReportStatutoryStayTypeCode stayExpenseReportStatutoryStayTypeCode;
    @XmlElement(name = "StayExpenseReportEnterpriseStayTypeCode")
    private ExpenseReportEnterpriseStayTypeCode stayExpenseReportEnterpriseStayTypeCode;
    @XmlElement(name = "StayExpenseReportActivityStayTypeCode")
    private ExpenseReportActivityStayTypeCode stayExpenseReportActivityStayTypeCode;
    @XmlElement(name = "MealsPerDiemFlatRateReimbursementIndicator")
    private Boolean mealsPerDiemFlatRateReimbursementIndicator;
    @XmlElement(name = "StayLocationRegionCode")
    private RegionCode stayLocationRegionCode;
    @XmlElement(name = "MunicipalityCode")
    private MunicipalityCode municipalityCode;

    /**
     * Gets the value of the typeCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTypeCode(final String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the startDateTime property.
     *
     * @return possible object is {@link LOCALDateTime }
     *
     */
    public LOCALDateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     *
     * @param value allowed object is {@link LOCALDateTime }
     *
     */
    public void setStartDateTime(final LOCALDateTime value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the stayDescription property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayDescription() {
        return stayDescription;
    }

    /**
     * Sets the value of the stayDescription property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayDescription(final String value) {
        this.stayDescription = value;
    }

    /**
     * Gets the value of the stayLocationName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayLocationName() {
        return stayLocationName;
    }

    /**
     * Sets the value of the stayLocationName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayLocationName(final String value) {
        this.stayLocationName = value;
    }

    /**
     * Gets the value of the stayLocationCountryCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayLocationCountryCode() {
        return stayLocationCountryCode;
    }

    /**
     * Sets the value of the stayLocationCountryCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayLocationCountryCode(final String value) {
        this.stayLocationCountryCode = value;
    }

    /**
     * Gets the value of the stayLocationExpenseReportPerDiemRegionCode property.
     *
     * @return possible object is {@link ExpenseReportPerDiemRegionCode }
     *
     */
    public ExpenseReportPerDiemRegionCode getStayLocationExpenseReportPerDiemRegionCode() {
        return stayLocationExpenseReportPerDiemRegionCode;
    }

    /**
     * Sets the value of the stayLocationExpenseReportPerDiemRegionCode property.
     *
     * @param value allowed object is {@link ExpenseReportPerDiemRegionCode }
     *
     */
    public void setStayLocationExpenseReportPerDiemRegionCode(final ExpenseReportPerDiemRegionCode value) {
        this.stayLocationExpenseReportPerDiemRegionCode = value;
    }

    /**
     * Gets the value of the stayExpenseReportStatutoryStayTypeCode property.
     *
     * @return possible object is {@link ExpenseReportStatutoryStayTypeCode }
     *
     */
    public ExpenseReportStatutoryStayTypeCode getStayExpenseReportStatutoryStayTypeCode() {
        return stayExpenseReportStatutoryStayTypeCode;
    }

    /**
     * Sets the value of the stayExpenseReportStatutoryStayTypeCode property.
     *
     * @param value allowed object is {@link ExpenseReportStatutoryStayTypeCode }
     *
     */
    public void setStayExpenseReportStatutoryStayTypeCode(final ExpenseReportStatutoryStayTypeCode value) {
        this.stayExpenseReportStatutoryStayTypeCode = value;
    }

    /**
     * Gets the value of the stayExpenseReportEnterpriseStayTypeCode property.
     *
     * @return possible object is {@link ExpenseReportEnterpriseStayTypeCode }
     *
     */
    public ExpenseReportEnterpriseStayTypeCode getStayExpenseReportEnterpriseStayTypeCode() {
        return stayExpenseReportEnterpriseStayTypeCode;
    }

    /**
     * Sets the value of the stayExpenseReportEnterpriseStayTypeCode property.
     *
     * @param value allowed object is {@link ExpenseReportEnterpriseStayTypeCode }
     *
     */
    public void setStayExpenseReportEnterpriseStayTypeCode(final ExpenseReportEnterpriseStayTypeCode value) {
        this.stayExpenseReportEnterpriseStayTypeCode = value;
    }

    /**
     * Gets the value of the stayExpenseReportActivityStayTypeCode property.
     *
     * @return possible object is {@link ExpenseReportActivityStayTypeCode }
     *
     */
    public ExpenseReportActivityStayTypeCode getStayExpenseReportActivityStayTypeCode() {
        return stayExpenseReportActivityStayTypeCode;
    }

    /**
     * Sets the value of the stayExpenseReportActivityStayTypeCode property.
     *
     * @param value allowed object is {@link ExpenseReportActivityStayTypeCode }
     *
     */
    public void setStayExpenseReportActivityStayTypeCode(final ExpenseReportActivityStayTypeCode value) {
        this.stayExpenseReportActivityStayTypeCode = value;
    }

    /**
     * Gets the value of the mealsPerDiemFlatRateReimbursementIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isMealsPerDiemFlatRateReimbursementIndicator() {
        return mealsPerDiemFlatRateReimbursementIndicator;
    }

    /**
     * Sets the value of the mealsPerDiemFlatRateReimbursementIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setMealsPerDiemFlatRateReimbursementIndicator(final Boolean value) {
        this.mealsPerDiemFlatRateReimbursementIndicator = value;
    }

    /**
     * Gets the value of the stayLocationRegionCode property.
     *
     * @return possible object is {@link RegionCode }
     *
     */
    public RegionCode getStayLocationRegionCode() {
        return stayLocationRegionCode;
    }

    /**
     * Sets the value of the stayLocationRegionCode property.
     *
     * @param value allowed object is {@link RegionCode }
     *
     */
    public void setStayLocationRegionCode(final RegionCode value) {
        this.stayLocationRegionCode = value;
    }

    /**
     * Gets the value of the municipalityCode property.
     *
     * @return possible object is {@link MunicipalityCode }
     *
     */
    public MunicipalityCode getMunicipalityCode() {
        return municipalityCode;
    }

    /**
     * Sets the value of the municipalityCode property.
     *
     * @param value allowed object is {@link MunicipalityCode }
     *
     */
    public void setMunicipalityCode(final MunicipalityCode value) {
        this.municipalityCode = value;
    }

}
