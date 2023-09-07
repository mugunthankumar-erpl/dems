
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for StandardFaultMessageExtension complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="StandardFaultMessageExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardFaultMessageExtension", namespace = "http://sap.com/xi/AP/Common/Global", propOrder = {"log"})
public class StandardFaultMessageExtension {

    @XmlElement(name = "Log")
    private Log log;

    /**
     * Gets the value of the log property.
     *
     * @return possible object is {@link Log }
     */
    public Log getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     *
     * @param value allowed object is {@link Log }
     */
    public void setLog(final Log value) {
        this.log = value;
    }

}