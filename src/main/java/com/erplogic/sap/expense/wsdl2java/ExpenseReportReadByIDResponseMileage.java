
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
 * Java class for ExpenseReportReadByIDResponseMileage complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseMileage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MileageUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}ExpenseReportMileageID" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="UnitTotalQuantity" type="{http://sap.com/xi/AP/Common/GDT}INTEGER_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedUnitTotalQuantity" type="{http://sap.com/xi/AP/Common/GDT}INTEGER_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="RoundTripIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CoPassengerNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFlatRateReimbursementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="MileageReimbursementVehicleTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MileageReimbursementVehicleTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="MileageReimbursementVehicleTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="MileageReimbursementVehicleClassCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MileageReimbursementVehicleClassCode" minOccurs="0"/&gt;
 *         &lt;element name="MileageReimbursementVehicleClassName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="VehicleDescription" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="VehicleMakeName" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}SHORT_Name" minOccurs="0"/&gt;
 *         &lt;element name="StartingPointLocationName" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}EXTENDED_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationName" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}EXTENDED_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationCountryName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationExpenseReportPerDiemRegionCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportPerDiemRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="StayLocationExpenseReportPerDiemRegionName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportStatutoryStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportStatutoryStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportStatutoryStayTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportEnterpriseStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportEnterpriseStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportEnterpriseStayTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportActivityStayTypeCode" type="{http://sap.com/xi/AP/ExpenseReimbursementManagement/Global}ExpenseReportActivityStayTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="StayExpenseReportActivityStayTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Note" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseMileage", propOrder = {"mileageUUID", "id", "date", "unitTotalQuantity",
    "calculatedUnitTotalQuantity", "roundTripIndicator", "coPassengerNumberValue",
    "additionalFlatRateReimbursementIndicator", "mileageReimbursementVehicleTypeCode",
    "mileageReimbursementVehicleTypeName", "mileageReimbursementVehicleClassCode",
    "mileageReimbursementVehicleClassName", "vehicleDescription", "vehicleMakeName", "startingPointLocationName",
    "stayLocationName", "stayLocationCountryCode", "stayLocationCountryName",
    "stayLocationExpenseReportPerDiemRegionCode", "stayLocationExpenseReportPerDiemRegionName",
    "stayExpenseReportStatutoryStayTypeCode", "stayExpenseReportStatutoryStayTypeName",
    "stayExpenseReportEnterpriseStayTypeCode", "stayExpenseReportEnterpriseStayTypeName",
    "stayExpenseReportActivityStayTypeCode", "stayExpenseReportActivityStayTypeName", "note"})
public class ExpenseReportReadByIDResponseMileage {

    @XmlElement(name = "MileageUUID")
    private UUID mileageUUID;
    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String id;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar date;
    @XmlElement(name = "UnitTotalQuantity")
    private INTEGERQuantity unitTotalQuantity;
    @XmlElement(name = "CalculatedUnitTotalQuantity")
    private INTEGERQuantity calculatedUnitTotalQuantity;
    @XmlElement(name = "RoundTripIndicator")
    private Boolean roundTripIndicator;
    @XmlElement(name = "CoPassengerNumberValue")
    private Integer coPassengerNumberValue;
    @XmlElement(name = "AdditionalFlatRateReimbursementIndicator")
    private Boolean additionalFlatRateReimbursementIndicator;
    @XmlElement(name = "MileageReimbursementVehicleTypeCode")
    private MileageReimbursementVehicleTypeCode mileageReimbursementVehicleTypeCode;
    @XmlElement(name = "MileageReimbursementVehicleTypeName")
    private String mileageReimbursementVehicleTypeName;
    @XmlElement(name = "MileageReimbursementVehicleClassCode")
    private MileageReimbursementVehicleClassCode mileageReimbursementVehicleClassCode;
    @XmlElement(name = "MileageReimbursementVehicleClassName")
    private String mileageReimbursementVehicleClassName;
    @XmlElement(name = "VehicleDescription")
    private String vehicleDescription;
    @XmlElement(name = "VehicleMakeName")
    private String vehicleMakeName;
    @XmlElement(name = "StartingPointLocationName")
    private String startingPointLocationName;
    @XmlElement(name = "StayLocationName")
    private String stayLocationName;
    @XmlElement(name = "StayLocationCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String stayLocationCountryCode;
    @XmlElement(name = "StayLocationCountryName")
    private String stayLocationCountryName;
    @XmlElement(name = "StayLocationExpenseReportPerDiemRegionCode")
    private ExpenseReportPerDiemRegionCode stayLocationExpenseReportPerDiemRegionCode;
    @XmlElement(name = "StayLocationExpenseReportPerDiemRegionName")
    private String stayLocationExpenseReportPerDiemRegionName;
    @XmlElement(name = "StayExpenseReportStatutoryStayTypeCode")
    private ExpenseReportStatutoryStayTypeCode stayExpenseReportStatutoryStayTypeCode;
    @XmlElement(name = "StayExpenseReportStatutoryStayTypeName")
    private String stayExpenseReportStatutoryStayTypeName;
    @XmlElement(name = "StayExpenseReportEnterpriseStayTypeCode")
    private ExpenseReportEnterpriseStayTypeCode stayExpenseReportEnterpriseStayTypeCode;
    @XmlElement(name = "StayExpenseReportEnterpriseStayTypeName")
    private String stayExpenseReportEnterpriseStayTypeName;
    @XmlElement(name = "StayExpenseReportActivityStayTypeCode")
    private ExpenseReportActivityStayTypeCode stayExpenseReportActivityStayTypeCode;
    @XmlElement(name = "StayExpenseReportActivityStayTypeName")
    private String stayExpenseReportActivityStayTypeName;
    @XmlElement(name = "Note")
    private String note;

    /**
     * Gets the value of the mileageUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getMileageUUID() {
        return mileageUUID;
    }

    /**
     * Sets the value of the mileageUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setMileageUUID(final UUID value) {
        this.mileageUUID = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setID(final String value) {
        this.id = value;
    }

    /**
     * Gets the value of the date property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDate(final XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the unitTotalQuantity property.
     *
     * @return possible object is {@link INTEGERQuantity }
     *
     */
    public INTEGERQuantity getUnitTotalQuantity() {
        return unitTotalQuantity;
    }

    /**
     * Sets the value of the unitTotalQuantity property.
     *
     * @param value allowed object is {@link INTEGERQuantity }
     *
     */
    public void setUnitTotalQuantity(final INTEGERQuantity value) {
        this.unitTotalQuantity = value;
    }

    /**
     * Gets the value of the calculatedUnitTotalQuantity property.
     *
     * @return possible object is {@link INTEGERQuantity }
     *
     */
    public INTEGERQuantity getCalculatedUnitTotalQuantity() {
        return calculatedUnitTotalQuantity;
    }

    /**
     * Sets the value of the calculatedUnitTotalQuantity property.
     *
     * @param value allowed object is {@link INTEGERQuantity }
     *
     */
    public void setCalculatedUnitTotalQuantity(final INTEGERQuantity value) {
        this.calculatedUnitTotalQuantity = value;
    }

    /**
     * Gets the value of the roundTripIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isRoundTripIndicator() {
        return roundTripIndicator;
    }

    /**
     * Sets the value of the roundTripIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setRoundTripIndicator(final Boolean value) {
        this.roundTripIndicator = value;
    }

    /**
     * Gets the value of the coPassengerNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getCoPassengerNumberValue() {
        return coPassengerNumberValue;
    }

    /**
     * Sets the value of the coPassengerNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setCoPassengerNumberValue(final Integer value) {
        this.coPassengerNumberValue = value;
    }

    /**
     * Gets the value of the additionalFlatRateReimbursementIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isAdditionalFlatRateReimbursementIndicator() {
        return additionalFlatRateReimbursementIndicator;
    }

    /**
     * Sets the value of the additionalFlatRateReimbursementIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setAdditionalFlatRateReimbursementIndicator(final Boolean value) {
        this.additionalFlatRateReimbursementIndicator = value;
    }

    /**
     * Gets the value of the mileageReimbursementVehicleTypeCode property.
     *
     * @return possible object is {@link MileageReimbursementVehicleTypeCode }
     *
     */
    public MileageReimbursementVehicleTypeCode getMileageReimbursementVehicleTypeCode() {
        return mileageReimbursementVehicleTypeCode;
    }

    /**
     * Sets the value of the mileageReimbursementVehicleTypeCode property.
     *
     * @param value allowed object is {@link MileageReimbursementVehicleTypeCode }
     *
     */
    public void setMileageReimbursementVehicleTypeCode(final MileageReimbursementVehicleTypeCode value) {
        this.mileageReimbursementVehicleTypeCode = value;
    }

    /**
     * Gets the value of the mileageReimbursementVehicleTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMileageReimbursementVehicleTypeName() {
        return mileageReimbursementVehicleTypeName;
    }

    /**
     * Sets the value of the mileageReimbursementVehicleTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMileageReimbursementVehicleTypeName(final String value) {
        this.mileageReimbursementVehicleTypeName = value;
    }

    /**
     * Gets the value of the mileageReimbursementVehicleClassCode property.
     *
     * @return possible object is {@link MileageReimbursementVehicleClassCode }
     *
     */
    public MileageReimbursementVehicleClassCode getMileageReimbursementVehicleClassCode() {
        return mileageReimbursementVehicleClassCode;
    }

    /**
     * Sets the value of the mileageReimbursementVehicleClassCode property.
     *
     * @param value allowed object is {@link MileageReimbursementVehicleClassCode }
     *
     */
    public void setMileageReimbursementVehicleClassCode(final MileageReimbursementVehicleClassCode value) {
        this.mileageReimbursementVehicleClassCode = value;
    }

    /**
     * Gets the value of the mileageReimbursementVehicleClassName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMileageReimbursementVehicleClassName() {
        return mileageReimbursementVehicleClassName;
    }

    /**
     * Sets the value of the mileageReimbursementVehicleClassName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMileageReimbursementVehicleClassName(final String value) {
        this.mileageReimbursementVehicleClassName = value;
    }

    /**
     * Gets the value of the vehicleDescription property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVehicleDescription() {
        return vehicleDescription;
    }

    /**
     * Sets the value of the vehicleDescription property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVehicleDescription(final String value) {
        this.vehicleDescription = value;
    }

    /**
     * Gets the value of the vehicleMakeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVehicleMakeName() {
        return vehicleMakeName;
    }

    /**
     * Sets the value of the vehicleMakeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVehicleMakeName(final String value) {
        this.vehicleMakeName = value;
    }

    /**
     * Gets the value of the startingPointLocationName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStartingPointLocationName() {
        return startingPointLocationName;
    }

    /**
     * Sets the value of the startingPointLocationName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStartingPointLocationName(final String value) {
        this.startingPointLocationName = value;
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
     * Gets the value of the stayLocationCountryName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayLocationCountryName() {
        return stayLocationCountryName;
    }

    /**
     * Sets the value of the stayLocationCountryName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayLocationCountryName(final String value) {
        this.stayLocationCountryName = value;
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
     * Gets the value of the stayLocationExpenseReportPerDiemRegionName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayLocationExpenseReportPerDiemRegionName() {
        return stayLocationExpenseReportPerDiemRegionName;
    }

    /**
     * Sets the value of the stayLocationExpenseReportPerDiemRegionName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayLocationExpenseReportPerDiemRegionName(final String value) {
        this.stayLocationExpenseReportPerDiemRegionName = value;
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
     * Gets the value of the stayExpenseReportStatutoryStayTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayExpenseReportStatutoryStayTypeName() {
        return stayExpenseReportStatutoryStayTypeName;
    }

    /**
     * Sets the value of the stayExpenseReportStatutoryStayTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayExpenseReportStatutoryStayTypeName(final String value) {
        this.stayExpenseReportStatutoryStayTypeName = value;
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
     * Gets the value of the stayExpenseReportEnterpriseStayTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayExpenseReportEnterpriseStayTypeName() {
        return stayExpenseReportEnterpriseStayTypeName;
    }

    /**
     * Sets the value of the stayExpenseReportEnterpriseStayTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayExpenseReportEnterpriseStayTypeName(final String value) {
        this.stayExpenseReportEnterpriseStayTypeName = value;
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
     * Gets the value of the stayExpenseReportActivityStayTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStayExpenseReportActivityStayTypeName() {
        return stayExpenseReportActivityStayTypeName;
    }

    /**
     * Sets the value of the stayExpenseReportActivityStayTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStayExpenseReportActivityStayTypeName(final String value) {
        this.stayExpenseReportActivityStayTypeName = value;
    }

    /**
     * Gets the value of the note property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNote(final String value) {
        this.note = value;
    }

}
