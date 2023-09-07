
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
 * Java class for
 * AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="Percent" type="{http://sap.com/xi/AP/Common/GDT}Percent" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="AccountingCodingBlockTypeCode" type="{http://sap.com/xi/AP/Common/GDT}AccountingCodingBlockTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="AccountingCodingBlockTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="AccountDeterminationExpenseGroupCode" type="{http://sap.com/xi/AP/Common/GDT}AccountDeterminationExpenseGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="AccountDeterminationExpenseGroupName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="GeneralLedgerAccountAliasCode" type="{http://sap.com/xi/AP/Common/GDT}GeneralLedgerAccountAliasCode" minOccurs="0"/&gt;
 *         &lt;element name="GeneralLedgerAccountAliasName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ProfitCentreID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="CostCentreID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="IndividualMaterialKey" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey" minOccurs="0"/&gt;
 *         &lt;element name="ProjectReference" type="{http://sap.com/xi/AP/Common/GDT}ProjectReference" minOccurs="0"/&gt;
 *         &lt;element name="ProjectReferenceProjectElementTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderReference" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderReferenceTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderReferenceItemTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderName" type="{http://sap.com/xi/AP/Common/GDT}EXTENDED_Name" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderItemDescription" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOrderReference" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOrderReferenceTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOrderReferenceItemTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOrderName" type="{http://sap.com/xi/AP/Common/GDT}EXTENDED_Name" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOrderItemDescription" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment", namespace = "http://sap.com/xi/AP/IS/CodingBlock/Global", propOrder = {
    "technicalID", "percent", "amount", "quantity", "accountingCodingBlockTypeCode", "accountingCodingBlockTypeName",
    "accountDeterminationExpenseGroupCode", "accountDeterminationExpenseGroupName", "generalLedgerAccountAliasCode",
    "generalLedgerAccountAliasName", "profitCentreID", "costCentreID", "individualMaterialKey", "projectReference",
    "projectReferenceProjectElementTypeName", "salesOrderReference", "salesOrderReferenceTypeName",
    "salesOrderReferenceItemTypeName", "salesOrderName", "salesOrderItemDescription", "serviceOrderReference",
    "serviceOrderReferenceTypeName", "serviceOrderReferenceItemTypeName", "serviceOrderName",
    "serviceOrderItemDescription"})
public class AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignment {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String technicalID;
    @XmlElement(name = "Percent")
    private BigDecimal percent;
    @XmlElement(name = "Amount")
    private Amount amount;
    @XmlElement(name = "Quantity")
    private Quantity quantity;
    @XmlElement(name = "AccountingCodingBlockTypeCode")
    private AccountingCodingBlockTypeCode accountingCodingBlockTypeCode;
    @XmlElement(name = "AccountingCodingBlockTypeName")
    private String accountingCodingBlockTypeName;
    @XmlElement(name = "AccountDeterminationExpenseGroupCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String accountDeterminationExpenseGroupCode;
    @XmlElement(name = "AccountDeterminationExpenseGroupName")
    private String accountDeterminationExpenseGroupName;
    @XmlElement(name = "GeneralLedgerAccountAliasCode")
    private GeneralLedgerAccountAliasCode generalLedgerAccountAliasCode;
    @XmlElement(name = "GeneralLedgerAccountAliasName")
    private String generalLedgerAccountAliasName;
    @XmlElement(name = "ProfitCentreID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String profitCentreID;
    @XmlElement(name = "CostCentreID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String costCentreID;
    @XmlElement(name = "IndividualMaterialKey")
    private AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey individualMaterialKey;
    @XmlElement(name = "ProjectReference")
    private ProjectReference projectReference;
    @XmlElement(name = "ProjectReferenceProjectElementTypeName")
    private String projectReferenceProjectElementTypeName;
    @XmlElement(name = "SalesOrderReference")
    private BusinessTransactionDocumentReference salesOrderReference;
    @XmlElement(name = "SalesOrderReferenceTypeName")
    private String salesOrderReferenceTypeName;
    @XmlElement(name = "SalesOrderReferenceItemTypeName")
    private String salesOrderReferenceItemTypeName;
    @XmlElement(name = "SalesOrderName")
    private EXTENDEDName salesOrderName;
    @XmlElement(name = "SalesOrderItemDescription")
    private SHORTDescription salesOrderItemDescription;
    @XmlElement(name = "ServiceOrderReference")
    private BusinessTransactionDocumentReference serviceOrderReference;
    @XmlElement(name = "ServiceOrderReferenceTypeName")
    private String serviceOrderReferenceTypeName;
    @XmlElement(name = "ServiceOrderReferenceItemTypeName")
    private String serviceOrderReferenceItemTypeName;
    @XmlElement(name = "ServiceOrderName")
    private EXTENDEDName serviceOrderName;
    @XmlElement(name = "ServiceOrderItemDescription")
    private SHORTDescription serviceOrderItemDescription;

    /**
     * Gets the value of the technicalID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTechnicalID() {
        return technicalID;
    }

    /**
     * Sets the value of the technicalID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTechnicalID(final String value) {
        this.technicalID = value;
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
     * Gets the value of the quantity property.
     *
     * @return possible object is {@link Quantity }
     *
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     *
     * @param value allowed object is {@link Quantity }
     *
     */
    public void setQuantity(final Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the accountingCodingBlockTypeCode property.
     *
     * @return possible object is {@link AccountingCodingBlockTypeCode }
     *
     */
    public AccountingCodingBlockTypeCode getAccountingCodingBlockTypeCode() {
        return accountingCodingBlockTypeCode;
    }

    /**
     * Sets the value of the accountingCodingBlockTypeCode property.
     *
     * @param value allowed object is {@link AccountingCodingBlockTypeCode }
     *
     */
    public void setAccountingCodingBlockTypeCode(final AccountingCodingBlockTypeCode value) {
        this.accountingCodingBlockTypeCode = value;
    }

    /**
     * Gets the value of the accountingCodingBlockTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAccountingCodingBlockTypeName() {
        return accountingCodingBlockTypeName;
    }

    /**
     * Sets the value of the accountingCodingBlockTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAccountingCodingBlockTypeName(final String value) {
        this.accountingCodingBlockTypeName = value;
    }

    /**
     * Gets the value of the accountDeterminationExpenseGroupCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAccountDeterminationExpenseGroupCode() {
        return accountDeterminationExpenseGroupCode;
    }

    /**
     * Sets the value of the accountDeterminationExpenseGroupCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAccountDeterminationExpenseGroupCode(final String value) {
        this.accountDeterminationExpenseGroupCode = value;
    }

    /**
     * Gets the value of the accountDeterminationExpenseGroupName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAccountDeterminationExpenseGroupName() {
        return accountDeterminationExpenseGroupName;
    }

    /**
     * Sets the value of the accountDeterminationExpenseGroupName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAccountDeterminationExpenseGroupName(final String value) {
        this.accountDeterminationExpenseGroupName = value;
    }

    /**
     * Gets the value of the generalLedgerAccountAliasCode property.
     *
     * @return possible object is {@link GeneralLedgerAccountAliasCode }
     *
     */
    public GeneralLedgerAccountAliasCode getGeneralLedgerAccountAliasCode() {
        return generalLedgerAccountAliasCode;
    }

    /**
     * Sets the value of the generalLedgerAccountAliasCode property.
     *
     * @param value allowed object is {@link GeneralLedgerAccountAliasCode }
     *
     */
    public void setGeneralLedgerAccountAliasCode(final GeneralLedgerAccountAliasCode value) {
        this.generalLedgerAccountAliasCode = value;
    }

    /**
     * Gets the value of the generalLedgerAccountAliasName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGeneralLedgerAccountAliasName() {
        return generalLedgerAccountAliasName;
    }

    /**
     * Sets the value of the generalLedgerAccountAliasName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGeneralLedgerAccountAliasName(final String value) {
        this.generalLedgerAccountAliasName = value;
    }

    /**
     * Gets the value of the profitCentreID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProfitCentreID() {
        return profitCentreID;
    }

    /**
     * Sets the value of the profitCentreID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProfitCentreID(final String value) {
        this.profitCentreID = value;
    }

    /**
     * Gets the value of the costCentreID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCostCentreID() {
        return costCentreID;
    }

    /**
     * Sets the value of the costCentreID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCostCentreID(final String value) {
        this.costCentreID = value;
    }

    /**
     * Gets the value of the individualMaterialKey property.
     *
     * @return possible object is
     *         {@link AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey
     *         }
     *
     */
    public AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey getIndividualMaterialKey() {
        return individualMaterialKey;
    }

    /**
     * Sets the value of the individualMaterialKey property.
     *
     * @param value allowed object is
     *              {@link AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey
     *              }
     *
     */
    public void setIndividualMaterialKey(
        final AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey value) {
        this.individualMaterialKey = value;
    }

    /**
     * Gets the value of the projectReference property.
     *
     * @return possible object is {@link ProjectReference }
     *
     */
    public ProjectReference getProjectReference() {
        return projectReference;
    }

    /**
     * Sets the value of the projectReference property.
     *
     * @param value allowed object is {@link ProjectReference }
     *
     */
    public void setProjectReference(final ProjectReference value) {
        this.projectReference = value;
    }

    /**
     * Gets the value of the projectReferenceProjectElementTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProjectReferenceProjectElementTypeName() {
        return projectReferenceProjectElementTypeName;
    }

    /**
     * Sets the value of the projectReferenceProjectElementTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProjectReferenceProjectElementTypeName(final String value) {
        this.projectReferenceProjectElementTypeName = value;
    }

    /**
     * Gets the value of the salesOrderReference property.
     *
     * @return possible object is {@link BusinessTransactionDocumentReference }
     *
     */
    public BusinessTransactionDocumentReference getSalesOrderReference() {
        return salesOrderReference;
    }

    /**
     * Sets the value of the salesOrderReference property.
     *
     * @param value allowed object is {@link BusinessTransactionDocumentReference }
     *
     */
    public void setSalesOrderReference(final BusinessTransactionDocumentReference value) {
        this.salesOrderReference = value;
    }

    /**
     * Gets the value of the salesOrderReferenceTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSalesOrderReferenceTypeName() {
        return salesOrderReferenceTypeName;
    }

    /**
     * Sets the value of the salesOrderReferenceTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSalesOrderReferenceTypeName(final String value) {
        this.salesOrderReferenceTypeName = value;
    }

    /**
     * Gets the value of the salesOrderReferenceItemTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSalesOrderReferenceItemTypeName() {
        return salesOrderReferenceItemTypeName;
    }

    /**
     * Sets the value of the salesOrderReferenceItemTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSalesOrderReferenceItemTypeName(final String value) {
        this.salesOrderReferenceItemTypeName = value;
    }

    /**
     * Gets the value of the salesOrderName property.
     *
     * @return possible object is {@link EXTENDEDName }
     *
     */
    public EXTENDEDName getSalesOrderName() {
        return salesOrderName;
    }

    /**
     * Sets the value of the salesOrderName property.
     *
     * @param value allowed object is {@link EXTENDEDName }
     *
     */
    public void setSalesOrderName(final EXTENDEDName value) {
        this.salesOrderName = value;
    }

    /**
     * Gets the value of the salesOrderItemDescription property.
     *
     * @return possible object is {@link SHORTDescription }
     *
     */
    public SHORTDescription getSalesOrderItemDescription() {
        return salesOrderItemDescription;
    }

    /**
     * Sets the value of the salesOrderItemDescription property.
     *
     * @param value allowed object is {@link SHORTDescription }
     *
     */
    public void setSalesOrderItemDescription(final SHORTDescription value) {
        this.salesOrderItemDescription = value;
    }

    /**
     * Gets the value of the serviceOrderReference property.
     *
     * @return possible object is {@link BusinessTransactionDocumentReference }
     *
     */
    public BusinessTransactionDocumentReference getServiceOrderReference() {
        return serviceOrderReference;
    }

    /**
     * Sets the value of the serviceOrderReference property.
     *
     * @param value allowed object is {@link BusinessTransactionDocumentReference }
     *
     */
    public void setServiceOrderReference(final BusinessTransactionDocumentReference value) {
        this.serviceOrderReference = value;
    }

    /**
     * Gets the value of the serviceOrderReferenceTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getServiceOrderReferenceTypeName() {
        return serviceOrderReferenceTypeName;
    }

    /**
     * Sets the value of the serviceOrderReferenceTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setServiceOrderReferenceTypeName(final String value) {
        this.serviceOrderReferenceTypeName = value;
    }

    /**
     * Gets the value of the serviceOrderReferenceItemTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getServiceOrderReferenceItemTypeName() {
        return serviceOrderReferenceItemTypeName;
    }

    /**
     * Sets the value of the serviceOrderReferenceItemTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setServiceOrderReferenceItemTypeName(final String value) {
        this.serviceOrderReferenceItemTypeName = value;
    }

    /**
     * Gets the value of the serviceOrderName property.
     *
     * @return possible object is {@link EXTENDEDName }
     *
     */
    public EXTENDEDName getServiceOrderName() {
        return serviceOrderName;
    }

    /**
     * Sets the value of the serviceOrderName property.
     *
     * @param value allowed object is {@link EXTENDEDName }
     *
     */
    public void setServiceOrderName(final EXTENDEDName value) {
        this.serviceOrderName = value;
    }

    /**
     * Gets the value of the serviceOrderItemDescription property.
     *
     * @return possible object is {@link SHORTDescription }
     *
     */
    public SHORTDescription getServiceOrderItemDescription() {
        return serviceOrderItemDescription;
    }

    /**
     * Sets the value of the serviceOrderItemDescription property.
     *
     * @param value allowed object is {@link SHORTDescription }
     *
     */
    public void setServiceOrderItemDescription(final SHORTDescription value) {
        this.serviceOrderItemDescription = value;
    }

}
