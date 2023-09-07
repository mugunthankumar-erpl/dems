
package com.erplogic.sap.expense.wsdl2java;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for ExpenseReportReadByIDResponseCostAssignmentView complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseCostAssignmentView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MainCostObjectFormattedID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeFormattedID" minOccurs="0"/&gt;
 *         &lt;element name="MainCostObjectName" type="{http://sap.com/xi/AP/Common/GDT}EXTENDED_Name" minOccurs="0"/&gt;
 *         &lt;element name="MainCostObjectFormattedName" type="{http://sap.com/xi/AP/Common/GDT}EXTENDED_Name" minOccurs="0"/&gt;
 *         &lt;element name="Percent" type="{http://sap.com/xi/AP/Common/GDT}Percent" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AccountingCodingBlockGroupID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemGroupID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseCostAssignmentView", propOrder = {"mainCostObjectFormattedID",
    "mainCostObjectName", "mainCostObjectFormattedName", "percent", "amount", "accountingCodingBlockGroupID"})
public class ExpenseReportReadByIDResponseCostAssignmentView {

    @XmlElement(name = "MainCostObjectFormattedID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String mainCostObjectFormattedID;
    @XmlElement(name = "MainCostObjectName")
    private EXTENDEDName mainCostObjectName;
    @XmlElement(name = "MainCostObjectFormattedName")
    private EXTENDEDName mainCostObjectFormattedName;
    @XmlElement(name = "Percent")
    private BigDecimal percent;
    @XmlElement(name = "Amount")
    private Amount amount;
    @XmlElement(name = "AccountingCodingBlockGroupID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String accountingCodingBlockGroupID;

    /**
     * Gets the value of the mainCostObjectFormattedID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMainCostObjectFormattedID() {
        return mainCostObjectFormattedID;
    }

    /**
     * Sets the value of the mainCostObjectFormattedID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMainCostObjectFormattedID(final String value) {
        this.mainCostObjectFormattedID = value;
    }

    /**
     * Gets the value of the mainCostObjectName property.
     *
     * @return possible object is {@link EXTENDEDName }
     *
     */
    public EXTENDEDName getMainCostObjectName() {
        return mainCostObjectName;
    }

    /**
     * Sets the value of the mainCostObjectName property.
     *
     * @param value allowed object is {@link EXTENDEDName }
     *
     */
    public void setMainCostObjectName(final EXTENDEDName value) {
        this.mainCostObjectName = value;
    }

    /**
     * Gets the value of the mainCostObjectFormattedName property.
     *
     * @return possible object is {@link EXTENDEDName }
     *
     */
    public EXTENDEDName getMainCostObjectFormattedName() {
        return mainCostObjectFormattedName;
    }

    /**
     * Sets the value of the mainCostObjectFormattedName property.
     *
     * @param value allowed object is {@link EXTENDEDName }
     *
     */
    public void setMainCostObjectFormattedName(final EXTENDEDName value) {
        this.mainCostObjectFormattedName = value;
    }

    /**
     * Gets the value of the percent property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPercent(final BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the amount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setAmount(final Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the accountingCodingBlockGroupID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAccountingCodingBlockGroupID() {
        return accountingCodingBlockGroupID;
    }

    /**
     * Sets the value of the accountingCodingBlockGroupID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAccountingCodingBlockGroupID(final String value) {
        this.accountingCodingBlockGroupID = value;
    }

}
