
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
 * Java class for
 * AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey
 * complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductTypeCode" type="{http://sap.com/xi/AP/Common/GDT}ProductTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ProductIdentifierTypeCode" type="{http://sap.com/xi/AP/Common/GDT}ProductIdentifierTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ProductIdentifierTypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey", namespace = "http://sap.com/xi/AP/IS/CodingBlock/Global", propOrder = {
    "productTypeCode", "productTypeName", "productIdentifierTypeCode", "productIdentifierTypeName", "productID"})
public class AccessAccountingCodingBlockDistributionAccountingCodingBlockAssignmentIndividualMaterialKey {

    @XmlElement(name = "ProductTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String productTypeCode;
    @XmlElement(name = "ProductTypeName")
    private String productTypeName;
    @XmlElement(name = "ProductIdentifierTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String productIdentifierTypeCode;
    @XmlElement(name = "ProductIdentifierTypeName")
    private String productIdentifierTypeName;
    @XmlElement(name = "ProductID")
    private ProductID productID;

    /**
     * Gets the value of the productTypeCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProductTypeCode(final String value) {
        this.productTypeCode = value;
    }

    /**
     * Gets the value of the productTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * Sets the value of the productTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProductTypeName(final String value) {
        this.productTypeName = value;
    }

    /**
     * Gets the value of the productIdentifierTypeCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProductIdentifierTypeCode() {
        return productIdentifierTypeCode;
    }

    /**
     * Sets the value of the productIdentifierTypeCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProductIdentifierTypeCode(final String value) {
        this.productIdentifierTypeCode = value;
    }

    /**
     * Gets the value of the productIdentifierTypeName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProductIdentifierTypeName() {
        return productIdentifierTypeName;
    }

    /**
     * Sets the value of the productIdentifierTypeName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProductIdentifierTypeName(final String value) {
        this.productIdentifierTypeName = value;
    }

    /**
     * Gets the value of the productID property.
     *
     * @return possible object is {@link ProductID }
     *
     */
    public ProductID getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     *
     * @param value allowed object is {@link ProductID }
     *
     */
    public void setProductID(final ProductID value) {
        this.productID = value;
    }

}
