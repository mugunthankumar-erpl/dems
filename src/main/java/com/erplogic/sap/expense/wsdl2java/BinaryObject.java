
package com.erplogic.sap.expense.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * <pre>
 * *
 * </pre>
 *
 *
 * <p>
 * Java class for BinaryObject complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="BinaryObject"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *       &lt;attribute name="mimeCode" type="{http://sap.com/xi/BASIS/Global}MIMECode" /&gt;
 *       &lt;attribute name="characterSetCode" type="{http://sap.com/xi/BASIS/Global}CharacterSetCode" /&gt;
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryObject", namespace = "http://sap.com/xi/BASIS/Global", propOrder = {"value"})
public class BinaryObject {

    @XmlValue
    private byte[] value;
    @XmlAttribute(name = "mimeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String mimeCode;
    @XmlAttribute(name = "characterSetCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String characterSetCode;
    @XmlAttribute(name = "format")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String format;
    @XmlAttribute(name = "fileName")
    private String fileName;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    private String uri;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is byte[]
     */
    public void setValue(final byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the mimeCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMimeCode() {
        return mimeCode;
    }

    /**
     * Sets the value of the mimeCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMimeCode(final String value) {
        this.mimeCode = value;
    }

    /**
     * Gets the value of the characterSetCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * Sets the value of the characterSetCode property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCharacterSetCode(final String value) {
        this.characterSetCode = value;
    }

    /**
     * Gets the value of the format property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFormat(final String value) {
        this.format = value;
    }

    /**
     * Gets the value of the fileName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFileName(final String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the uri property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUri(final String value) {
        this.uri = value;
    }

}
