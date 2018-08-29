
package com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BAMDEVSelectId_QNAME = new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "BAM_DEVSelect_id");
    private final static QName _VendorinfoCollection_QNAME = new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "VendorinfoCollection");
    private final static QName _VendorinfoVendorname_QNAME = new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "vendorname");
    private final static QName _VendorinfoVendorcity_QNAME = new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "vendorcity");
    private final static QName _VendorinfoVendortype_QNAME = new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "vendortype");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BAMDEVSelectId }
     * 
     */
    public BAMDEVSelectId createBAMDEVSelectId() {
        return new BAMDEVSelectId();
    }

    /**
     * Create an instance of {@link VendorinfoCollection }
     * 
     */
    public VendorinfoCollection createVendorinfoCollection() {
        return new VendorinfoCollection();
    }

    /**
     * Create an instance of {@link Vendorinfo }
     * 
     */
    public Vendorinfo createVendorinfo() {
        return new Vendorinfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BAMDEVSelectId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", name = "BAM_DEVSelect_id")
    public JAXBElement<BAMDEVSelectId> createBAMDEVSelectId(BAMDEVSelectId value) {
        return new JAXBElement<BAMDEVSelectId>(_BAMDEVSelectId_QNAME, BAMDEVSelectId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorinfoCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", name = "VendorinfoCollection")
    public JAXBElement<VendorinfoCollection> createVendorinfoCollection(VendorinfoCollection value) {
        return new JAXBElement<VendorinfoCollection>(_VendorinfoCollection_QNAME, VendorinfoCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", name = "vendorname", scope = Vendorinfo.class)
    public JAXBElement<String> createVendorinfoVendorname(String value) {
        return new JAXBElement<String>(_VendorinfoVendorname_QNAME, String.class, Vendorinfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", name = "vendorcity", scope = Vendorinfo.class)
    public JAXBElement<String> createVendorinfoVendorcity(String value) {
        return new JAXBElement<String>(_VendorinfoVendorcity_QNAME, String.class, Vendorinfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", name = "vendortype", scope = Vendorinfo.class)
    public JAXBElement<String> createVendorinfoVendortype(String value) {
        return new JAXBElement<String>(_VendorinfoVendortype_QNAME, String.class, Vendorinfo.class, value);
    }

}
