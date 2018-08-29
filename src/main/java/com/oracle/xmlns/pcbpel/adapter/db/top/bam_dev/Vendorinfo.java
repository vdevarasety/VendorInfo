
package com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vendorinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vendorinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorid">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vendorname" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vendortype" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vendorcity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vendorinfo", propOrder = {
    "vendorid",
    "vendorname",
    "vendortype",
    "vendorcity"
})
public class Vendorinfo {

    @XmlElement(required = true)
    protected String vendorid;
    @XmlElementRef(name = "vendorname", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorname;
    @XmlElementRef(name = "vendortype", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendortype;
    @XmlElementRef(name = "vendorcity", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorcity;

    /**
     * Gets the value of the vendorid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorid() {
        return vendorid;
    }

    /**
     * Sets the value of the vendorid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorid(String value) {
        this.vendorid = value;
    }

    /**
     * Gets the value of the vendorname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorname() {
        return vendorname;
    }

    /**
     * Sets the value of the vendorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorname(JAXBElement<String> value) {
        this.vendorname = value;
    }

    /**
     * Gets the value of the vendortype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendortype() {
        return vendortype;
    }

    /**
     * Sets the value of the vendortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendortype(JAXBElement<String> value) {
        this.vendortype = value;
    }

    /**
     * Gets the value of the vendorcity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorcity() {
        return vendorcity;
    }

    /**
     * Sets the value of the vendorcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorcity(JAXBElement<String> value) {
        this.vendorcity = value;
    }

}
