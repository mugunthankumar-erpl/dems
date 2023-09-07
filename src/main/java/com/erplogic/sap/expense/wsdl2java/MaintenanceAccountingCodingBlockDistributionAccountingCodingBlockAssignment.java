
package com.erplogic.sap.expense.wsdl2java;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for
 * MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerContractItemDescription" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="CustomerContractName" type="{http://sap.com/xi/AP/Common/GDT}EXTENDED_Name" minOccurs="0"/&gt;
 *         &lt;element name="CustomerContractReference" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="Percent" type="{http://sap.com/xi/AP/Common/GDT}Percent" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="AccountingCodingBlockTypeCode" type="{http://sap.com/xi/AP/Common/GDT}AccountingCodingBlockTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="AccountDeterminationExpenseGroupCode" type="{http://sap.com/xi/AP/Common/GDT}AccountDeterminationExpenseGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="GeneralLedgerAccountAliasCode" type="{http://sap.com/xi/AP/Common/GDT}GeneralLedgerAccountAliasCode" minOccurs="0"/&gt;
 *         &lt;element name="ProfitCentreID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="ProfitCentreUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CostCentreID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="CostCentreUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="IndividualMaterialKey" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey" minOccurs="0"/&gt;
 *         &lt;element name="IndividualMaterialUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ProjectTaskKey" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey" minOccurs="0"/&gt;
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
 *         &lt;element name="EmployeeID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CompanyID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="CompanyUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="FinancialFunctionUUID" type="{http://sap.com/xi/Common/DataTypes}UUID" minOccurs="0"/&gt;
 *         &lt;element name="FinancialFundUUID" type="{http://sap.com/xi/Common/DataTypes}UUID" minOccurs="0"/&gt;
 *         &lt;element name="FinancialFunctionID" type="{http://sap.com/xi/AP/FO/FundManagement/Global}FunctionID" minOccurs="0"/&gt;
 *         &lt;element name="FinancialFundID" type="{http://sap.com/xi/AP/FO/FundManagement/Global}FundID" minOccurs="0"/&gt;
 *         &lt;element name="CustomCode1" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}CodingBlockCustomField1Code" minOccurs="0"/&gt;
 *         &lt;element name="CustomCode2" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}CodingBlockCustomField2Code" minOccurs="0"/&gt;
 *         &lt;element name="CustomCode3" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}CodingBlockCustomField3Code" minOccurs="0"/&gt;
 *         &lt;element name="CustomObject1UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CustomObject1ID" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}CustomObjectID" minOccurs="0"/&gt;
 *         &lt;element name="CustomText1" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}CodingBlockCustomText" minOccurs="0"/&gt;
 *         &lt;element name="CostObjectReference" type="{http://sap.com/xi/AP/IS/CodingBlock/Global}AccountingObjectCheckItemCostObjectReference" minOccurs="0"/&gt;
 *         &lt;element name="GrantID" type="{http://sap.com/xi/AP/FO/GrantManagement/Global}GrantID" minOccurs="0"/&gt;
 *         &lt;element name="GrantUUID" type="{http://sap.com/xi/Common/DataTypes}UUID" minOccurs="0"/&gt;
 *         &lt;element name="LeaseContractReference" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment", namespace = "http://sap.com/xi/AP/IS/CodingBlock/Global", propOrder = {
    "customerContractItemDescription", "customerContractName", "customerContractReference", "technicalID", "percent",
    "amount", "quantity", "accountingCodingBlockTypeCode", "accountDeterminationExpenseGroupCode",
    "generalLedgerAccountAliasCode", "profitCentreID", "profitCentreUUID", "costCentreID", "costCentreUUID",
    "individualMaterialKey", "individualMaterialUUID", "projectTaskKey", "projectReference",
    "projectReferenceProjectElementTypeName", "salesOrderReference", "salesOrderReferenceTypeName",
    "salesOrderReferenceItemTypeName", "salesOrderName", "salesOrderItemDescription", "serviceOrderReference",
    "serviceOrderReferenceTypeName", "serviceOrderReferenceItemTypeName", "serviceOrderName",
    "serviceOrderItemDescription", "employeeID", "employeeUUID", "companyID", "companyUUID", "financialFunctionUUID",
    "financialFundUUID", "financialFunctionID", "financialFundID", "customCode1", "customCode2", "customCode3",
    "customObject1UUID", "customObject1ID", "customText1", "costObjectReference", "grantID", "grantUUID",
    "leaseContractReference"})
public class MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignment {

    @XmlElement(name = "CustomerContractItemDescription")
    private SHORTDescription customerContractItemDescription;
    @XmlElement(name = "CustomerContractName")
    private EXTENDEDName customerContractName;
    @XmlElement(name = "CustomerContractReference")
    private BusinessTransactionDocumentReference customerContractReference;
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
    @XmlElement(name = "AccountDeterminationExpenseGroupCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String accountDeterminationExpenseGroupCode;
    @XmlElement(name = "GeneralLedgerAccountAliasCode")
    private GeneralLedgerAccountAliasCode generalLedgerAccountAliasCode;
    @XmlElement(name = "ProfitCentreID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String profitCentreID;
    @XmlElement(name = "ProfitCentreUUID")
    private UUID profitCentreUUID;
    @XmlElement(name = "CostCentreID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String costCentreID;
    @XmlElement(name = "CostCentreUUID")
    private UUID costCentreUUID;
    @XmlElement(name = "IndividualMaterialKey")
    private MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey individualMaterialKey;
    @XmlElement(name = "IndividualMaterialUUID")
    private UUID individualMaterialUUID;
    @XmlElement(name = "ProjectTaskKey")
    private MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey projectTaskKey;
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
    @XmlElement(name = "EmployeeID")
    private EmployeeID employeeID;
    @XmlElement(name = "EmployeeUUID")
    private UUID employeeUUID;
    @XmlElement(name = "CompanyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String companyID;
    @XmlElement(name = "CompanyUUID")
    private UUID companyUUID;
    @XmlElement(name = "FinancialFunctionUUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String financialFunctionUUID;
    @XmlElement(name = "FinancialFundUUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String financialFundUUID;
    @XmlElement(name = "FinancialFunctionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String financialFunctionID;
    @XmlElement(name = "FinancialFundID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String financialFundID;
    @XmlElement(name = "CustomCode1")
    private CodingBlockCustomField1Code customCode1;
    @XmlElement(name = "CustomCode2")
    private CodingBlockCustomField2Code customCode2;
    @XmlElement(name = "CustomCode3")
    private CodingBlockCustomField3Code customCode3;
    @XmlElement(name = "CustomObject1UUID")
    private UUID customObject1UUID;
    @XmlElement(name = "CustomObject1ID")
    private CustomObjectID customObject1ID;
    @XmlElement(name = "CustomText1")
    private String customText1;
    @XmlElement(name = "CostObjectReference")
    private AccountingObjectCheckItemCostObjectReference costObjectReference;
    @XmlElement(name = "GrantID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String grantID;
    @XmlElement(name = "GrantUUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String grantUUID;
    @XmlElement(name = "LeaseContractReference")
    private BusinessTransactionDocumentReference leaseContractReference;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String actionCode;

    /**
     * Gets the value of the customerContractItemDescription property.
     *
     * @return possible object is {@link SHORTDescription }
     *
     */
    public SHORTDescription getCustomerContractItemDescription() {
        return customerContractItemDescription;
    }

    /**
     * Sets the value of the customerContractItemDescription property.
     *
     * @param value allowed object is {@link SHORTDescription }
     *
     */
    public void setCustomerContractItemDescription(final SHORTDescription value) {
        this.customerContractItemDescription = value;
    }

    /**
     * Gets the value of the customerContractName property.
     *
     * @return possible object is {@link EXTENDEDName }
     *
     */
    public EXTENDEDName getCustomerContractName() {
        return customerContractName;
    }

    /**
     * Sets the value of the customerContractName property.
     *
     * @param value allowed object is {@link EXTENDEDName }
     *
     */
    public void setCustomerContractName(final EXTENDEDName value) {
        this.customerContractName = value;
    }

    /**
     * Gets the value of the customerContractReference property.
     *
     * @return possible object is {@link BusinessTransactionDocumentReference }
     *
     */
    public BusinessTransactionDocumentReference getCustomerContractReference() {
        return customerContractReference;
    }

    /**
     * Sets the value of the customerContractReference property.
     *
     * @param value allowed object is {@link BusinessTransactionDocumentReference }
     *
     */
    public void setCustomerContractReference(final BusinessTransactionDocumentReference value) {
        this.customerContractReference = value;
    }

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
     * Gets the value of the profitCentreUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getProfitCentreUUID() {
        return profitCentreUUID;
    }

    /**
     * Sets the value of the profitCentreUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setProfitCentreUUID(final UUID value) {
        this.profitCentreUUID = value;
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
     * Gets the value of the costCentreUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getCostCentreUUID() {
        return costCentreUUID;
    }

    /**
     * Sets the value of the costCentreUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setCostCentreUUID(final UUID value) {
        this.costCentreUUID = value;
    }

    /**
     * Gets the value of the individualMaterialKey property.
     *
     * @return possible object is
     *         {@link MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey
     *         }
     *
     */
    public MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey getIndividualMaterialKey() {
        return individualMaterialKey;
    }

    /**
     * Sets the value of the individualMaterialKey property.
     *
     * @param value allowed object is
     *              {@link MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey
     *              }
     *
     */
    public void setIndividualMaterialKey(
        final MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey value) {
        this.individualMaterialKey = value;
    }

    /**
     * Gets the value of the individualMaterialUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getIndividualMaterialUUID() {
        return individualMaterialUUID;
    }

    /**
     * Sets the value of the individualMaterialUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setIndividualMaterialUUID(final UUID value) {
        this.individualMaterialUUID = value;
    }

    /**
     * Gets the value of the projectTaskKey property.
     *
     * @return possible object is
     *         {@link MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey
     *         }
     *
     */
    public MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey getProjectTaskKey() {
        return projectTaskKey;
    }

    /**
     * Sets the value of the projectTaskKey property.
     *
     * @param value allowed object is
     *              {@link MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey
     *              }
     *
     */
    public void setProjectTaskKey(
        final MaintenanceAccountingCodingBlockDistributionAccountingCodingBlockAssignmentProjectTaskKey value) {
        this.projectTaskKey = value;
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
     * Gets the value of the financialFunctionUUID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFinancialFunctionUUID() {
        return financialFunctionUUID;
    }

    /**
     * Sets the value of the financialFunctionUUID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFinancialFunctionUUID(final String value) {
        this.financialFunctionUUID = value;
    }

    /**
     * Gets the value of the financialFundUUID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFinancialFundUUID() {
        return financialFundUUID;
    }

    /**
     * Sets the value of the financialFundUUID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFinancialFundUUID(final String value) {
        this.financialFundUUID = value;
    }

    /**
     * Gets the value of the financialFunctionID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFinancialFunctionID() {
        return financialFunctionID;
    }

    /**
     * Sets the value of the financialFunctionID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFinancialFunctionID(final String value) {
        this.financialFunctionID = value;
    }

    /**
     * Gets the value of the financialFundID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFinancialFundID() {
        return financialFundID;
    }

    /**
     * Sets the value of the financialFundID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFinancialFundID(final String value) {
        this.financialFundID = value;
    }

    /**
     * Gets the value of the customCode1 property.
     *
     * @return possible object is {@link CodingBlockCustomField1Code }
     *
     */
    public CodingBlockCustomField1Code getCustomCode1() {
        return customCode1;
    }

    /**
     * Sets the value of the customCode1 property.
     *
     * @param value allowed object is {@link CodingBlockCustomField1Code }
     *
     */
    public void setCustomCode1(final CodingBlockCustomField1Code value) {
        this.customCode1 = value;
    }

    /**
     * Gets the value of the customCode2 property.
     *
     * @return possible object is {@link CodingBlockCustomField2Code }
     *
     */
    public CodingBlockCustomField2Code getCustomCode2() {
        return customCode2;
    }

    /**
     * Sets the value of the customCode2 property.
     *
     * @param value allowed object is {@link CodingBlockCustomField2Code }
     *
     */
    public void setCustomCode2(final CodingBlockCustomField2Code value) {
        this.customCode2 = value;
    }

    /**
     * Gets the value of the customCode3 property.
     *
     * @return possible object is {@link CodingBlockCustomField3Code }
     *
     */
    public CodingBlockCustomField3Code getCustomCode3() {
        return customCode3;
    }

    /**
     * Sets the value of the customCode3 property.
     *
     * @param value allowed object is {@link CodingBlockCustomField3Code }
     *
     */
    public void setCustomCode3(final CodingBlockCustomField3Code value) {
        this.customCode3 = value;
    }

    /**
     * Gets the value of the customObject1UUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getCustomObject1UUID() {
        return customObject1UUID;
    }

    /**
     * Sets the value of the customObject1UUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setCustomObject1UUID(final UUID value) {
        this.customObject1UUID = value;
    }

    /**
     * Gets the value of the customObject1ID property.
     *
     * @return possible object is {@link CustomObjectID }
     *
     */
    public CustomObjectID getCustomObject1ID() {
        return customObject1ID;
    }

    /**
     * Sets the value of the customObject1ID property.
     *
     * @param value allowed object is {@link CustomObjectID }
     *
     */
    public void setCustomObject1ID(final CustomObjectID value) {
        this.customObject1ID = value;
    }

    /**
     * Gets the value of the customText1 property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCustomText1() {
        return customText1;
    }

    /**
     * Sets the value of the customText1 property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCustomText1(final String value) {
        this.customText1 = value;
    }

    /**
     * Gets the value of the costObjectReference property.
     *
     * @return possible object is
     *         {@link AccountingObjectCheckItemCostObjectReference }
     *
     */
    public AccountingObjectCheckItemCostObjectReference getCostObjectReference() {
        return costObjectReference;
    }

    /**
     * Sets the value of the costObjectReference property.
     *
     * @param value allowed object is
     *              {@link AccountingObjectCheckItemCostObjectReference }
     *
     */
    public void setCostObjectReference(final AccountingObjectCheckItemCostObjectReference value) {
        this.costObjectReference = value;
    }

    /**
     * Gets the value of the grantID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGrantID() {
        return grantID;
    }

    /**
     * Sets the value of the grantID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGrantID(final String value) {
        this.grantID = value;
    }

    /**
     * Gets the value of the grantUUID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGrantUUID() {
        return grantUUID;
    }

    /**
     * Sets the value of the grantUUID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGrantUUID(final String value) {
        this.grantUUID = value;
    }

    /**
     * Gets the value of the leaseContractReference property.
     *
     * @return possible object is {@link BusinessTransactionDocumentReference }
     *
     */
    public BusinessTransactionDocumentReference getLeaseContractReference() {
        return leaseContractReference;
    }

    /**
     * Sets the value of the leaseContractReference property.
     *
     * @param value allowed object is {@link BusinessTransactionDocumentReference }
     *
     */
    public void setLeaseContractReference(final BusinessTransactionDocumentReference value) {
        this.leaseContractReference = value;
    }

    /**
     * Gets the value of the actionCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setActionCode(final String value) {
        this.actionCode = value;
    }

}
