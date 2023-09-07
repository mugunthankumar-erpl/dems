
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
 * Java class for AccountingObjectCheckItemCostObjectReference complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="AccountingObjectCheckItemCostObjectReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CostObjectTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CostObjectTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="CostObjectID" type="{http://sap.com/xi/AP/Common/GDT}FinancialAccountingViewOfCostObjectID" minOccurs="0"/&gt;
 *         &lt;element name="CostObjectUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CostObjectDescription" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingObjectCheckItemCostObjectReference", namespace = "http://sap.com/xi/AP/IS/CodingBlock/Global", propOrder = {
    "costObjectTypeCode", "costObjectID", "costObjectUUID", "costObjectDescription"})
public class AccountingObjectCheckItemCostObjectReference {

    @XmlElement(name = "CostObjectTypeCode")
    private CostObjectTypeCode costObjectTypeCode;
    @XmlElement(name = "CostObjectID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String costObjectID;
    @XmlElement(name = "CostObjectUUID")
    private UUID costObjectUUID;
    @XmlElement(name = "CostObjectDescription")
    private MEDIUMDescription costObjectDescription;

    /**
     * Gets the value of the costObjectTypeCode property.
     *
     * @return possible object is {@link CostObjectTypeCode }
     *
     */
    public CostObjectTypeCode getCostObjectTypeCode() {
        return costObjectTypeCode;
    }

    /**
     * Sets the value of the costObjectTypeCode property.
     *
     * @param value allowed object is {@link CostObjectTypeCode }
     *
     */
    public void setCostObjectTypeCode(final CostObjectTypeCode value) {
        this.costObjectTypeCode = value;
    }

    /**
     * Gets the value of the costObjectID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCostObjectID() {
        return costObjectID;
    }

    /**
     * Sets the value of the costObjectID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCostObjectID(final String value) {
        this.costObjectID = value;
    }

    /**
     * Gets the value of the costObjectUUID property.
     *
     * @return possible object is {@link UUID }
     *
     */
    public UUID getCostObjectUUID() {
        return costObjectUUID;
    }

    /**
     * Sets the value of the costObjectUUID property.
     *
     * @param value allowed object is {@link UUID }
     *
     */
    public void setCostObjectUUID(final UUID value) {
        this.costObjectUUID = value;
    }

    /**
     * Gets the value of the costObjectDescription property.
     *
     * @return possible object is {@link MEDIUMDescription }
     *
     */
    public MEDIUMDescription getCostObjectDescription() {
        return costObjectDescription;
    }

    /**
     * Sets the value of the costObjectDescription property.
     *
     * @param value allowed object is {@link MEDIUMDescription }
     *
     */
    public void setCostObjectDescription(final MEDIUMDescription value) {
        this.costObjectDescription = value;
    }

}
