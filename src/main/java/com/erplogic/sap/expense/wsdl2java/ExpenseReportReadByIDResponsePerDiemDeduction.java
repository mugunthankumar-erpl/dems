
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ExpenseReportReadByIDResponsePerDiemDeduction complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponsePerDiemDeduction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="BreakfastPerDiemDeductionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="BreakfastMealTime" type="{http://sap.com/xi/AP/Common/GDT}Time" minOccurs="0"/&gt;
 *         &lt;element name="LunchPerDiemDeductionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="LunchMealTime" type="{http://sap.com/xi/AP/Common/GDT}Time" minOccurs="0"/&gt;
 *         &lt;element name="DinnerPerDiemDeductionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DinnerMealTime" type="{http://sap.com/xi/AP/Common/GDT}Time" minOccurs="0"/&gt;
 *         &lt;element name="NightPerDiemDeductionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="MealCouponPerDiemDeductionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="MealCouponMealTime" type="{http://sap.com/xi/AP/Common/GDT}Time" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponsePerDiemDeduction", propOrder = {"date",
    "breakfastPerDiemDeductionIndicator", "breakfastMealTime", "lunchPerDiemDeductionIndicator", "lunchMealTime",
    "dinnerPerDiemDeductionIndicator", "dinnerMealTime", "nightPerDiemDeductionIndicator",
    "mealCouponPerDiemDeductionIndicator", "mealCouponMealTime"})
public class ExpenseReportReadByIDResponsePerDiemDeduction {

    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar date;
    @XmlElement(name = "BreakfastPerDiemDeductionIndicator")
    private Boolean breakfastPerDiemDeductionIndicator;
    @XmlElement(name = "BreakfastMealTime")
    @XmlSchemaType(name = "time")
    private XMLGregorianCalendar breakfastMealTime;
    @XmlElement(name = "LunchPerDiemDeductionIndicator")
    private Boolean lunchPerDiemDeductionIndicator;
    @XmlElement(name = "LunchMealTime")
    @XmlSchemaType(name = "time")
    private XMLGregorianCalendar lunchMealTime;
    @XmlElement(name = "DinnerPerDiemDeductionIndicator")
    private Boolean dinnerPerDiemDeductionIndicator;
    @XmlElement(name = "DinnerMealTime")
    @XmlSchemaType(name = "time")
    private XMLGregorianCalendar dinnerMealTime;
    @XmlElement(name = "NightPerDiemDeductionIndicator")
    private Boolean nightPerDiemDeductionIndicator;
    @XmlElement(name = "MealCouponPerDiemDeductionIndicator")
    private Boolean mealCouponPerDiemDeductionIndicator;
    @XmlElement(name = "MealCouponMealTime")
    @XmlSchemaType(name = "time")
    private XMLGregorianCalendar mealCouponMealTime;

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
     * Gets the value of the breakfastPerDiemDeductionIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isBreakfastPerDiemDeductionIndicator() {
        return breakfastPerDiemDeductionIndicator;
    }

    /**
     * Sets the value of the breakfastPerDiemDeductionIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setBreakfastPerDiemDeductionIndicator(final Boolean value) {
        this.breakfastPerDiemDeductionIndicator = value;
    }

    /**
     * Gets the value of the breakfastMealTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBreakfastMealTime() {
        return breakfastMealTime;
    }

    /**
     * Sets the value of the breakfastMealTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setBreakfastMealTime(final XMLGregorianCalendar value) {
        this.breakfastMealTime = value;
    }

    /**
     * Gets the value of the lunchPerDiemDeductionIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isLunchPerDiemDeductionIndicator() {
        return lunchPerDiemDeductionIndicator;
    }

    /**
     * Sets the value of the lunchPerDiemDeductionIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setLunchPerDiemDeductionIndicator(final Boolean value) {
        this.lunchPerDiemDeductionIndicator = value;
    }

    /**
     * Gets the value of the lunchMealTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLunchMealTime() {
        return lunchMealTime;
    }

    /**
     * Sets the value of the lunchMealTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setLunchMealTime(final XMLGregorianCalendar value) {
        this.lunchMealTime = value;
    }

    /**
     * Gets the value of the dinnerPerDiemDeductionIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isDinnerPerDiemDeductionIndicator() {
        return dinnerPerDiemDeductionIndicator;
    }

    /**
     * Sets the value of the dinnerPerDiemDeductionIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setDinnerPerDiemDeductionIndicator(final Boolean value) {
        this.dinnerPerDiemDeductionIndicator = value;
    }

    /**
     * Gets the value of the dinnerMealTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDinnerMealTime() {
        return dinnerMealTime;
    }

    /**
     * Sets the value of the dinnerMealTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setDinnerMealTime(final XMLGregorianCalendar value) {
        this.dinnerMealTime = value;
    }

    /**
     * Gets the value of the nightPerDiemDeductionIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isNightPerDiemDeductionIndicator() {
        return nightPerDiemDeductionIndicator;
    }

    /**
     * Sets the value of the nightPerDiemDeductionIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setNightPerDiemDeductionIndicator(final Boolean value) {
        this.nightPerDiemDeductionIndicator = value;
    }

    /**
     * Gets the value of the mealCouponPerDiemDeductionIndicator property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isMealCouponPerDiemDeductionIndicator() {
        return mealCouponPerDiemDeductionIndicator;
    }

    /**
     * Sets the value of the mealCouponPerDiemDeductionIndicator property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setMealCouponPerDiemDeductionIndicator(final Boolean value) {
        this.mealCouponPerDiemDeductionIndicator = value;
    }

    /**
     * Gets the value of the mealCouponMealTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getMealCouponMealTime() {
        return mealCouponMealTime;
    }

    /**
     * Sets the value of the mealCouponMealTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setMealCouponMealTime(final XMLGregorianCalendar value) {
        this.mealCouponMealTime = value;
    }

}
