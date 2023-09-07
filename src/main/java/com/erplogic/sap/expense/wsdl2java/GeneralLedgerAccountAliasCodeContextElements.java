
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
 * Java class for GeneralLedgerAccountAliasCodeContextElements complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="GeneralLedgerAccountAliasCodeContextElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsageCode" type="{http://sap.com/xi/AP/Common/GDT}GeneralLedgerAccountAliasUsageCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralLedgerAccountAliasCodeContextElements", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "usageCode"})
public class GeneralLedgerAccountAliasCodeContextElements {

    @XmlElement(name = "UsageCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String usageCode;

    /**
     * Gets the value of the usageCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUsageCode() {
        return usageCode;
    }

    /**
     * Sets the value of the usageCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUsageCode(final String value) {
        this.usageCode = value;
    }

}
