
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExpenseReportReadByIDResponseSettlementResultTotals complex
 * type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ExpenseReportReadByIDResponseSettlementResultTotals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxExemptAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="IncomeRelatedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="FlatRateTaxAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PaidByCompanyAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseReportTotalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PrivateExpensesReductionAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseReportTotalAmountAndPrivateExpensesReductionAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PostingAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="MealPerDiemFlatRateNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="MealPerDiemTaxExemptAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="MealPerDiemReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="MealPerDiemAdditionalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="MealPerDiemIncomeRelatedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="MealPerDiemFlatRateTaxAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationPerDiemFlatRateNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationPerDiemTaxExemptAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationPerDiemReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationPerDiemAdditionalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationPerDiemIncomeRelatedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="MileageFlatRateQuantity" type="{http://sap.com/xi/AP/Common/GDT}INTEGER_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="MileageFlatRateTaxExemptAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="MileageFlatRateReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="MileageFlatRateAdditionalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="MileageFlatRateIncomeRelatedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptReceiptNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptReceiptTaxExemptAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptReceiptReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptReceiptIncomeRelatedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptReceiptPrivateExpensesReductionAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxableReceiptNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="TaxableReceiptReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxableReceiptAdditionalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TaxableReceiptPrivateExpensesReductionAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptWithComparisonAmountTotalNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptWithComparisonAmountTotalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ComparisonAmountCalculationDayNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="ComparisonAmountCalculationTaxExemptAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ComparisonAmountCalculationReimbursementAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ComparisonAmountCalculationAdditionalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ComparisonAmountCalculationIncomeRelatedAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ComparisonAmountCalculationFlatRateTaxAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseReportReadByIDResponseSettlementResultTotals", propOrder = {"taxExemptAmount",
    "reimbursementAmount", "additionalAmount", "incomeRelatedAmount", "flatRateTaxAmount", "paidByCompanyAmount",
    "expenseReportTotalAmount", "privateExpensesReductionAmount",
    "expenseReportTotalAmountAndPrivateExpensesReductionAmount", "postingAmount", "mealPerDiemFlatRateNumberValue",
    "mealPerDiemTaxExemptAmount", "mealPerDiemReimbursementAmount", "mealPerDiemAdditionalAmount",
    "mealPerDiemIncomeRelatedAmount", "mealPerDiemFlatRateTaxAmount", "accommodationPerDiemFlatRateNumberValue",
    "accommodationPerDiemTaxExemptAmount", "accommodationPerDiemReimbursementAmount",
    "accommodationPerDiemAdditionalAmount", "accommodationPerDiemIncomeRelatedAmount", "mileageFlatRateQuantity",
    "mileageFlatRateTaxExemptAmount", "mileageFlatRateReimbursementAmount", "mileageFlatRateAdditionalAmount",
    "mileageFlatRateIncomeRelatedAmount", "taxExemptReceiptNumberValue", "taxExemptReceiptTaxExemptAmount",
    "taxExemptReceiptReimbursementAmount", "taxExemptReceiptIncomeRelatedAmount",
    "taxExemptReceiptPrivateExpensesReductionAmount", "taxableReceiptNumberValue", "taxableReceiptReimbursementAmount",
    "taxableReceiptAdditionalAmount", "taxableReceiptPrivateExpensesReductionAmount",
    "receiptWithComparisonAmountTotalNumberValue", "receiptWithComparisonAmountTotalAmount",
    "comparisonAmountCalculationDayNumberValue", "comparisonAmountCalculationTaxExemptAmount",
    "comparisonAmountCalculationReimbursementAmount", "comparisonAmountCalculationAdditionalAmount",
    "comparisonAmountCalculationIncomeRelatedAmount", "comparisonAmountCalculationFlatRateTaxAmount"})
public class ExpenseReportReadByIDResponseSettlementResultTotals {

    @XmlElement(name = "TaxExemptAmount")
    private Amount taxExemptAmount;
    @XmlElement(name = "ReimbursementAmount")
    private Amount reimbursementAmount;
    @XmlElement(name = "AdditionalAmount")
    private Amount additionalAmount;
    @XmlElement(name = "IncomeRelatedAmount")
    private Amount incomeRelatedAmount;
    @XmlElement(name = "FlatRateTaxAmount")
    private Amount flatRateTaxAmount;
    @XmlElement(name = "PaidByCompanyAmount")
    private Amount paidByCompanyAmount;
    @XmlElement(name = "ExpenseReportTotalAmount")
    private Amount expenseReportTotalAmount;
    @XmlElement(name = "PrivateExpensesReductionAmount")
    private Amount privateExpensesReductionAmount;
    @XmlElement(name = "ExpenseReportTotalAmountAndPrivateExpensesReductionAmount")
    private Amount expenseReportTotalAmountAndPrivateExpensesReductionAmount;
    @XmlElement(name = "PostingAmount")
    private Amount postingAmount;
    @XmlElement(name = "MealPerDiemFlatRateNumberValue")
    private Integer mealPerDiemFlatRateNumberValue;
    @XmlElement(name = "MealPerDiemTaxExemptAmount")
    private Amount mealPerDiemTaxExemptAmount;
    @XmlElement(name = "MealPerDiemReimbursementAmount")
    private Amount mealPerDiemReimbursementAmount;
    @XmlElement(name = "MealPerDiemAdditionalAmount")
    private Amount mealPerDiemAdditionalAmount;
    @XmlElement(name = "MealPerDiemIncomeRelatedAmount")
    private Amount mealPerDiemIncomeRelatedAmount;
    @XmlElement(name = "MealPerDiemFlatRateTaxAmount")
    private Amount mealPerDiemFlatRateTaxAmount;
    @XmlElement(name = "AccommodationPerDiemFlatRateNumberValue")
    private Integer accommodationPerDiemFlatRateNumberValue;
    @XmlElement(name = "AccommodationPerDiemTaxExemptAmount")
    private Amount accommodationPerDiemTaxExemptAmount;
    @XmlElement(name = "AccommodationPerDiemReimbursementAmount")
    private Amount accommodationPerDiemReimbursementAmount;
    @XmlElement(name = "AccommodationPerDiemAdditionalAmount")
    private Amount accommodationPerDiemAdditionalAmount;
    @XmlElement(name = "AccommodationPerDiemIncomeRelatedAmount")
    private Amount accommodationPerDiemIncomeRelatedAmount;
    @XmlElement(name = "MileageFlatRateQuantity")
    private INTEGERQuantity mileageFlatRateQuantity;
    @XmlElement(name = "MileageFlatRateTaxExemptAmount")
    private Amount mileageFlatRateTaxExemptAmount;
    @XmlElement(name = "MileageFlatRateReimbursementAmount")
    private Amount mileageFlatRateReimbursementAmount;
    @XmlElement(name = "MileageFlatRateAdditionalAmount")
    private Amount mileageFlatRateAdditionalAmount;
    @XmlElement(name = "MileageFlatRateIncomeRelatedAmount")
    private Amount mileageFlatRateIncomeRelatedAmount;
    @XmlElement(name = "TaxExemptReceiptNumberValue")
    private Integer taxExemptReceiptNumberValue;
    @XmlElement(name = "TaxExemptReceiptTaxExemptAmount")
    private Amount taxExemptReceiptTaxExemptAmount;
    @XmlElement(name = "TaxExemptReceiptReimbursementAmount")
    private Amount taxExemptReceiptReimbursementAmount;
    @XmlElement(name = "TaxExemptReceiptIncomeRelatedAmount")
    private Amount taxExemptReceiptIncomeRelatedAmount;
    @XmlElement(name = "TaxExemptReceiptPrivateExpensesReductionAmount")
    private Amount taxExemptReceiptPrivateExpensesReductionAmount;
    @XmlElement(name = "TaxableReceiptNumberValue")
    private Integer taxableReceiptNumberValue;
    @XmlElement(name = "TaxableReceiptReimbursementAmount")
    private Amount taxableReceiptReimbursementAmount;
    @XmlElement(name = "TaxableReceiptAdditionalAmount")
    private Amount taxableReceiptAdditionalAmount;
    @XmlElement(name = "TaxableReceiptPrivateExpensesReductionAmount")
    private Amount taxableReceiptPrivateExpensesReductionAmount;
    @XmlElement(name = "ReceiptWithComparisonAmountTotalNumberValue")
    private Integer receiptWithComparisonAmountTotalNumberValue;
    @XmlElement(name = "ReceiptWithComparisonAmountTotalAmount")
    private Amount receiptWithComparisonAmountTotalAmount;
    @XmlElement(name = "ComparisonAmountCalculationDayNumberValue")
    private Integer comparisonAmountCalculationDayNumberValue;
    @XmlElement(name = "ComparisonAmountCalculationTaxExemptAmount")
    private Amount comparisonAmountCalculationTaxExemptAmount;
    @XmlElement(name = "ComparisonAmountCalculationReimbursementAmount")
    private Amount comparisonAmountCalculationReimbursementAmount;
    @XmlElement(name = "ComparisonAmountCalculationAdditionalAmount")
    private Amount comparisonAmountCalculationAdditionalAmount;
    @XmlElement(name = "ComparisonAmountCalculationIncomeRelatedAmount")
    private Amount comparisonAmountCalculationIncomeRelatedAmount;
    @XmlElement(name = "ComparisonAmountCalculationFlatRateTaxAmount")
    private Amount comparisonAmountCalculationFlatRateTaxAmount;

    /**
     * Gets the value of the taxExemptAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxExemptAmount() {
        return taxExemptAmount;
    }

    /**
     * Sets the value of the taxExemptAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxExemptAmount(final Amount value) {
        this.taxExemptAmount = value;
    }

    /**
     * Gets the value of the reimbursementAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getReimbursementAmount() {
        return reimbursementAmount;
    }

    /**
     * Sets the value of the reimbursementAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setReimbursementAmount(final Amount value) {
        this.reimbursementAmount = value;
    }

    /**
     * Gets the value of the additionalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getAdditionalAmount() {
        return additionalAmount;
    }

    /**
     * Sets the value of the additionalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setAdditionalAmount(final Amount value) {
        this.additionalAmount = value;
    }

    /**
     * Gets the value of the incomeRelatedAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getIncomeRelatedAmount() {
        return incomeRelatedAmount;
    }

    /**
     * Sets the value of the incomeRelatedAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setIncomeRelatedAmount(final Amount value) {
        this.incomeRelatedAmount = value;
    }

    /**
     * Gets the value of the flatRateTaxAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getFlatRateTaxAmount() {
        return flatRateTaxAmount;
    }

    /**
     * Sets the value of the flatRateTaxAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setFlatRateTaxAmount(final Amount value) {
        this.flatRateTaxAmount = value;
    }

    /**
     * Gets the value of the paidByCompanyAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getPaidByCompanyAmount() {
        return paidByCompanyAmount;
    }

    /**
     * Sets the value of the paidByCompanyAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setPaidByCompanyAmount(final Amount value) {
        this.paidByCompanyAmount = value;
    }

    /**
     * Gets the value of the expenseReportTotalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getExpenseReportTotalAmount() {
        return expenseReportTotalAmount;
    }

    /**
     * Sets the value of the expenseReportTotalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setExpenseReportTotalAmount(final Amount value) {
        this.expenseReportTotalAmount = value;
    }

    /**
     * Gets the value of the privateExpensesReductionAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getPrivateExpensesReductionAmount() {
        return privateExpensesReductionAmount;
    }

    /**
     * Sets the value of the privateExpensesReductionAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setPrivateExpensesReductionAmount(final Amount value) {
        this.privateExpensesReductionAmount = value;
    }

    /**
     * Gets the value of the
     * expenseReportTotalAmountAndPrivateExpensesReductionAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getExpenseReportTotalAmountAndPrivateExpensesReductionAmount() {
        return expenseReportTotalAmountAndPrivateExpensesReductionAmount;
    }

    /**
     * Sets the value of the
     * expenseReportTotalAmountAndPrivateExpensesReductionAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setExpenseReportTotalAmountAndPrivateExpensesReductionAmount(final Amount value) {
        this.expenseReportTotalAmountAndPrivateExpensesReductionAmount = value;
    }

    /**
     * Gets the value of the postingAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getPostingAmount() {
        return postingAmount;
    }

    /**
     * Sets the value of the postingAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setPostingAmount(final Amount value) {
        this.postingAmount = value;
    }

    /**
     * Gets the value of the mealPerDiemFlatRateNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getMealPerDiemFlatRateNumberValue() {
        return mealPerDiemFlatRateNumberValue;
    }

    /**
     * Sets the value of the mealPerDiemFlatRateNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setMealPerDiemFlatRateNumberValue(final Integer value) {
        this.mealPerDiemFlatRateNumberValue = value;
    }

    /**
     * Gets the value of the mealPerDiemTaxExemptAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getMealPerDiemTaxExemptAmount() {
        return mealPerDiemTaxExemptAmount;
    }

    /**
     * Sets the value of the mealPerDiemTaxExemptAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setMealPerDiemTaxExemptAmount(final Amount value) {
        this.mealPerDiemTaxExemptAmount = value;
    }

    /**
     * Gets the value of the mealPerDiemReimbursementAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getMealPerDiemReimbursementAmount() {
        return mealPerDiemReimbursementAmount;
    }

    /**
     * Sets the value of the mealPerDiemReimbursementAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setMealPerDiemReimbursementAmount(final Amount value) {
        this.mealPerDiemReimbursementAmount = value;
    }

    /**
     * Gets the value of the mealPerDiemAdditionalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getMealPerDiemAdditionalAmount() {
        return mealPerDiemAdditionalAmount;
    }

    /**
     * Sets the value of the mealPerDiemAdditionalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setMealPerDiemAdditionalAmount(final Amount value) {
        this.mealPerDiemAdditionalAmount = value;
    }

    /**
     * Gets the value of the mealPerDiemIncomeRelatedAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getMealPerDiemIncomeRelatedAmount() {
        return mealPerDiemIncomeRelatedAmount;
    }

    /**
     * Sets the value of the mealPerDiemIncomeRelatedAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setMealPerDiemIncomeRelatedAmount(final Amount value) {
        this.mealPerDiemIncomeRelatedAmount = value;
    }

    /**
     * Gets the value of the mealPerDiemFlatRateTaxAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getMealPerDiemFlatRateTaxAmount() {
        return mealPerDiemFlatRateTaxAmount;
    }

    /**
     * Sets the value of the mealPerDiemFlatRateTaxAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setMealPerDiemFlatRateTaxAmount(final Amount value) {
        this.mealPerDiemFlatRateTaxAmount = value;
    }

    /**
     * Gets the value of the accommodationPerDiemFlatRateNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getAccommodationPerDiemFlatRateNumberValue() {
        return accommodationPerDiemFlatRateNumberValue;
    }

    /**
     * Sets the value of the accommodationPerDiemFlatRateNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setAccommodationPerDiemFlatRateNumberValue(final Integer value) {
        this.accommodationPerDiemFlatRateNumberValue = value;
    }

    /**
     * Gets the value of the accommodationPerDiemTaxExemptAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getAccommodationPerDiemTaxExemptAmount() {
        return accommodationPerDiemTaxExemptAmount;
    }

    /**
     * Sets the value of the accommodationPerDiemTaxExemptAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setAccommodationPerDiemTaxExemptAmount(final Amount value) {
        this.accommodationPerDiemTaxExemptAmount = value;
    }

    /**
     * Gets the value of the accommodationPerDiemReimbursementAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getAccommodationPerDiemReimbursementAmount() {
        return accommodationPerDiemReimbursementAmount;
    }

    /**
     * Sets the value of the accommodationPerDiemReimbursementAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setAccommodationPerDiemReimbursementAmount(final Amount value) {
        this.accommodationPerDiemReimbursementAmount = value;
    }

    /**
     * Gets the value of the accommodationPerDiemAdditionalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getAccommodationPerDiemAdditionalAmount() {
        return accommodationPerDiemAdditionalAmount;
    }

    /**
     * Sets the value of the accommodationPerDiemAdditionalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setAccommodationPerDiemAdditionalAmount(final Amount value) {
        this.accommodationPerDiemAdditionalAmount = value;
    }

    /**
     * Gets the value of the accommodationPerDiemIncomeRelatedAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getAccommodationPerDiemIncomeRelatedAmount() {
        return accommodationPerDiemIncomeRelatedAmount;
    }

    /**
     * Sets the value of the accommodationPerDiemIncomeRelatedAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setAccommodationPerDiemIncomeRelatedAmount(final Amount value) {
        this.accommodationPerDiemIncomeRelatedAmount = value;
    }

    /**
     * Gets the value of the mileageFlatRateQuantity property.
     *
     * @return possible object is {@link INTEGERQuantity }
     *
     */
    public INTEGERQuantity getMileageFlatRateQuantity() {
        return mileageFlatRateQuantity;
    }

    /**
     * Sets the value of the mileageFlatRateQuantity property.
     *
     * @param value allowed object is {@link INTEGERQuantity }
     *
     */
    public void setMileageFlatRateQuantity(final INTEGERQuantity value) {
        this.mileageFlatRateQuantity = value;
    }

    /**
     * Gets the value of the mileageFlatRateTaxExemptAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getMileageFlatRateTaxExemptAmount() {
        return mileageFlatRateTaxExemptAmount;
    }

    /**
     * Sets the value of the mileageFlatRateTaxExemptAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setMileageFlatRateTaxExemptAmount(final Amount value) {
        this.mileageFlatRateTaxExemptAmount = value;
    }

    /**
     * Gets the value of the mileageFlatRateReimbursementAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getMileageFlatRateReimbursementAmount() {
        return mileageFlatRateReimbursementAmount;
    }

    /**
     * Sets the value of the mileageFlatRateReimbursementAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setMileageFlatRateReimbursementAmount(final Amount value) {
        this.mileageFlatRateReimbursementAmount = value;
    }

    /**
     * Gets the value of the mileageFlatRateAdditionalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getMileageFlatRateAdditionalAmount() {
        return mileageFlatRateAdditionalAmount;
    }

    /**
     * Sets the value of the mileageFlatRateAdditionalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setMileageFlatRateAdditionalAmount(final Amount value) {
        this.mileageFlatRateAdditionalAmount = value;
    }

    /**
     * Gets the value of the mileageFlatRateIncomeRelatedAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getMileageFlatRateIncomeRelatedAmount() {
        return mileageFlatRateIncomeRelatedAmount;
    }

    /**
     * Sets the value of the mileageFlatRateIncomeRelatedAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setMileageFlatRateIncomeRelatedAmount(final Amount value) {
        this.mileageFlatRateIncomeRelatedAmount = value;
    }

    /**
     * Gets the value of the taxExemptReceiptNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getTaxExemptReceiptNumberValue() {
        return taxExemptReceiptNumberValue;
    }

    /**
     * Sets the value of the taxExemptReceiptNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setTaxExemptReceiptNumberValue(final Integer value) {
        this.taxExemptReceiptNumberValue = value;
    }

    /**
     * Gets the value of the taxExemptReceiptTaxExemptAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxExemptReceiptTaxExemptAmount() {
        return taxExemptReceiptTaxExemptAmount;
    }

    /**
     * Sets the value of the taxExemptReceiptTaxExemptAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxExemptReceiptTaxExemptAmount(final Amount value) {
        this.taxExemptReceiptTaxExemptAmount = value;
    }

    /**
     * Gets the value of the taxExemptReceiptReimbursementAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxExemptReceiptReimbursementAmount() {
        return taxExemptReceiptReimbursementAmount;
    }

    /**
     * Sets the value of the taxExemptReceiptReimbursementAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxExemptReceiptReimbursementAmount(final Amount value) {
        this.taxExemptReceiptReimbursementAmount = value;
    }

    /**
     * Gets the value of the taxExemptReceiptIncomeRelatedAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxExemptReceiptIncomeRelatedAmount() {
        return taxExemptReceiptIncomeRelatedAmount;
    }

    /**
     * Sets the value of the taxExemptReceiptIncomeRelatedAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxExemptReceiptIncomeRelatedAmount(final Amount value) {
        this.taxExemptReceiptIncomeRelatedAmount = value;
    }

    /**
     * Gets the value of the taxExemptReceiptPrivateExpensesReductionAmount
     * property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxExemptReceiptPrivateExpensesReductionAmount() {
        return taxExemptReceiptPrivateExpensesReductionAmount;
    }

    /**
     * Sets the value of the taxExemptReceiptPrivateExpensesReductionAmount
     * property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxExemptReceiptPrivateExpensesReductionAmount(final Amount value) {
        this.taxExemptReceiptPrivateExpensesReductionAmount = value;
    }

    /**
     * Gets the value of the taxableReceiptNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getTaxableReceiptNumberValue() {
        return taxableReceiptNumberValue;
    }

    /**
     * Sets the value of the taxableReceiptNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setTaxableReceiptNumberValue(final Integer value) {
        this.taxableReceiptNumberValue = value;
    }

    /**
     * Gets the value of the taxableReceiptReimbursementAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxableReceiptReimbursementAmount() {
        return taxableReceiptReimbursementAmount;
    }

    /**
     * Sets the value of the taxableReceiptReimbursementAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxableReceiptReimbursementAmount(final Amount value) {
        this.taxableReceiptReimbursementAmount = value;
    }

    /**
     * Gets the value of the taxableReceiptAdditionalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxableReceiptAdditionalAmount() {
        return taxableReceiptAdditionalAmount;
    }

    /**
     * Sets the value of the taxableReceiptAdditionalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxableReceiptAdditionalAmount(final Amount value) {
        this.taxableReceiptAdditionalAmount = value;
    }

    /**
     * Gets the value of the taxableReceiptPrivateExpensesReductionAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getTaxableReceiptPrivateExpensesReductionAmount() {
        return taxableReceiptPrivateExpensesReductionAmount;
    }

    /**
     * Sets the value of the taxableReceiptPrivateExpensesReductionAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setTaxableReceiptPrivateExpensesReductionAmount(final Amount value) {
        this.taxableReceiptPrivateExpensesReductionAmount = value;
    }

    /**
     * Gets the value of the receiptWithComparisonAmountTotalNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getReceiptWithComparisonAmountTotalNumberValue() {
        return receiptWithComparisonAmountTotalNumberValue;
    }

    /**
     * Sets the value of the receiptWithComparisonAmountTotalNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setReceiptWithComparisonAmountTotalNumberValue(final Integer value) {
        this.receiptWithComparisonAmountTotalNumberValue = value;
    }

    /**
     * Gets the value of the receiptWithComparisonAmountTotalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getReceiptWithComparisonAmountTotalAmount() {
        return receiptWithComparisonAmountTotalAmount;
    }

    /**
     * Sets the value of the receiptWithComparisonAmountTotalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setReceiptWithComparisonAmountTotalAmount(final Amount value) {
        this.receiptWithComparisonAmountTotalAmount = value;
    }

    /**
     * Gets the value of the comparisonAmountCalculationDayNumberValue property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getComparisonAmountCalculationDayNumberValue() {
        return comparisonAmountCalculationDayNumberValue;
    }

    /**
     * Sets the value of the comparisonAmountCalculationDayNumberValue property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setComparisonAmountCalculationDayNumberValue(final Integer value) {
        this.comparisonAmountCalculationDayNumberValue = value;
    }

    /**
     * Gets the value of the comparisonAmountCalculationTaxExemptAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getComparisonAmountCalculationTaxExemptAmount() {
        return comparisonAmountCalculationTaxExemptAmount;
    }

    /**
     * Sets the value of the comparisonAmountCalculationTaxExemptAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setComparisonAmountCalculationTaxExemptAmount(final Amount value) {
        this.comparisonAmountCalculationTaxExemptAmount = value;
    }

    /**
     * Gets the value of the comparisonAmountCalculationReimbursementAmount
     * property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getComparisonAmountCalculationReimbursementAmount() {
        return comparisonAmountCalculationReimbursementAmount;
    }

    /**
     * Sets the value of the comparisonAmountCalculationReimbursementAmount
     * property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setComparisonAmountCalculationReimbursementAmount(final Amount value) {
        this.comparisonAmountCalculationReimbursementAmount = value;
    }

    /**
     * Gets the value of the comparisonAmountCalculationAdditionalAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getComparisonAmountCalculationAdditionalAmount() {
        return comparisonAmountCalculationAdditionalAmount;
    }

    /**
     * Sets the value of the comparisonAmountCalculationAdditionalAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setComparisonAmountCalculationAdditionalAmount(final Amount value) {
        this.comparisonAmountCalculationAdditionalAmount = value;
    }

    /**
     * Gets the value of the comparisonAmountCalculationIncomeRelatedAmount
     * property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getComparisonAmountCalculationIncomeRelatedAmount() {
        return comparisonAmountCalculationIncomeRelatedAmount;
    }

    /**
     * Sets the value of the comparisonAmountCalculationIncomeRelatedAmount
     * property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setComparisonAmountCalculationIncomeRelatedAmount(final Amount value) {
        this.comparisonAmountCalculationIncomeRelatedAmount = value;
    }

    /**
     * Gets the value of the comparisonAmountCalculationFlatRateTaxAmount property.
     *
     * @return possible object is {@link Amount }
     *
     */
    public Amount getComparisonAmountCalculationFlatRateTaxAmount() {
        return comparisonAmountCalculationFlatRateTaxAmount;
    }

    /**
     * Sets the value of the comparisonAmountCalculationFlatRateTaxAmount property.
     *
     * @param value allowed object is {@link Amount }
     *
     */
    public void setComparisonAmountCalculationFlatRateTaxAmount(final Amount value) {
        this.comparisonAmountCalculationFlatRateTaxAmount = value;
    }

}
