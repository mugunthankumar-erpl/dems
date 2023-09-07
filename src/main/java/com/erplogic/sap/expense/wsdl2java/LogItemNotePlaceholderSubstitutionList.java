
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
 * Java class for LogItemNotePlaceholderSubstitutionList complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="LogItemNotePlaceholderSubstitutionList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID"/&gt;
 *         &lt;element name="SecondPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID" minOccurs="0"/&gt;
 *         &lt;element name="FourthPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID" minOccurs="0"/&gt;
 *         &lt;element name="FirstPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText"/&gt;
 *         &lt;element name="SecondPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText" minOccurs="0"/&gt;
 *         &lt;element name="FourthPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogItemNotePlaceholderSubstitutionList", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "firstPlaceholderID", "secondPlaceholderID", "thirdPlaceholderID", "fourthPlaceholderID",
    "firstPlaceholderSubstitutionText", "secondPlaceholderSubstitutionText", "thirdPlaceholderSubstitutionText",
    "fourthPlaceholderSubstitutionText"})
public class LogItemNotePlaceholderSubstitutionList {

    @XmlElement(name = "FirstPlaceholderID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String firstPlaceholderID;
    @XmlElement(name = "SecondPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String secondPlaceholderID;
    @XmlElement(name = "ThirdPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String thirdPlaceholderID;
    @XmlElement(name = "FourthPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String fourthPlaceholderID;
    @XmlElement(name = "FirstPlaceholderSubstitutionText", required = true)
    private String firstPlaceholderSubstitutionText;
    @XmlElement(name = "SecondPlaceholderSubstitutionText")
    private String secondPlaceholderSubstitutionText;
    @XmlElement(name = "ThirdPlaceholderSubstitutionText")
    private String thirdPlaceholderSubstitutionText;
    @XmlElement(name = "FourthPlaceholderSubstitutionText")
    private String fourthPlaceholderSubstitutionText;

    /**
     * Gets the value of the firstPlaceholderID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFirstPlaceholderID() {
        return firstPlaceholderID;
    }

    /**
     * Sets the value of the firstPlaceholderID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFirstPlaceholderID(final String value) {
        this.firstPlaceholderID = value;
    }

    /**
     * Gets the value of the secondPlaceholderID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSecondPlaceholderID() {
        return secondPlaceholderID;
    }

    /**
     * Sets the value of the secondPlaceholderID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSecondPlaceholderID(final String value) {
        this.secondPlaceholderID = value;
    }

    /**
     * Gets the value of the thirdPlaceholderID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getThirdPlaceholderID() {
        return thirdPlaceholderID;
    }

    /**
     * Sets the value of the thirdPlaceholderID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setThirdPlaceholderID(final String value) {
        this.thirdPlaceholderID = value;
    }

    /**
     * Gets the value of the fourthPlaceholderID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFourthPlaceholderID() {
        return fourthPlaceholderID;
    }

    /**
     * Sets the value of the fourthPlaceholderID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFourthPlaceholderID(final String value) {
        this.fourthPlaceholderID = value;
    }

    /**
     * Gets the value of the firstPlaceholderSubstitutionText property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFirstPlaceholderSubstitutionText() {
        return firstPlaceholderSubstitutionText;
    }

    /**
     * Sets the value of the firstPlaceholderSubstitutionText property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFirstPlaceholderSubstitutionText(final String value) {
        this.firstPlaceholderSubstitutionText = value;
    }

    /**
     * Gets the value of the secondPlaceholderSubstitutionText property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSecondPlaceholderSubstitutionText() {
        return secondPlaceholderSubstitutionText;
    }

    /**
     * Sets the value of the secondPlaceholderSubstitutionText property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSecondPlaceholderSubstitutionText(final String value) {
        this.secondPlaceholderSubstitutionText = value;
    }

    /**
     * Gets the value of the thirdPlaceholderSubstitutionText property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getThirdPlaceholderSubstitutionText() {
        return thirdPlaceholderSubstitutionText;
    }

    /**
     * Sets the value of the thirdPlaceholderSubstitutionText property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setThirdPlaceholderSubstitutionText(final String value) {
        this.thirdPlaceholderSubstitutionText = value;
    }

    /**
     * Gets the value of the fourthPlaceholderSubstitutionText property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFourthPlaceholderSubstitutionText() {
        return fourthPlaceholderSubstitutionText;
    }

    /**
     * Sets the value of the fourthPlaceholderSubstitutionText property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFourthPlaceholderSubstitutionText(final String value) {
        this.fourthPlaceholderSubstitutionText = value;
    }

}
