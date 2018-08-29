package org.example.VendorInfo.client;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev.BAMDEVSelectId;
import com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev.Vendorinfo;
import com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev.VendorinfoCollection;

public class GetVendorDetails {
	
	
public VendorinfoCollection getVendorInfo(String vendorId) {
	 
	System.out.println("Inside");
	com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev.VendorinfoClientEp vendorinfoClientEp = new com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev.VendorinfoClientEp();
	com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev.BAMDEVPtt bamDEV = vendorinfoClientEp.getBAMDEVPt();
	BAMDEVSelectId bamDEVSelectInputParameters = new BAMDEVSelectId();
	bamDEVSelectInputParameters.setId(vendorId);
	VendorinfoCollection infoCollection = bamDEV.bamDEVSelect(bamDEVSelectInputParameters);
	
     System.out.println("VendorId =" + infoCollection.getVendorinfo().get(0).getVendorid());
     System.out.println("VendorName  =" + infoCollection.getVendorinfo().get(0).getVendorname().getValue());
     System.out.println("City =" + infoCollection.getVendorinfo().get(0).getVendorcity().getValue());
     System.out.println("VType =" + infoCollection.getVendorinfo().get(0).getVendortype().getValue());
     
     return infoCollection;
}

public boolean updateVendorInfo(String vId , String vName ,String vType, String vCity) {
	
	System.out.println("VendorId.. = " + vId);
	System.out.println("@@ VendorNames.. = " + vName);
	System.out.println("VendorType.. = " + vType);
	System.out.println("City.. = " + vCity);
		try {
		
		
		System.out.println("Before JAXB Setting update VendorId..");
		JAXBElement<String> vendorCity = 
			    new JAXBElement(new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "vendorcity"), String.class, vCity);
	
		JAXBElement<String> vendorType = 
			    new JAXBElement(new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "vendortype"), String.class, vType);
		
		JAXBElement<String> vendorName = 
			    new JAXBElement(new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "vendorname"), String.class, vName);
		
		
		
		System.out.println("Before Setting update VendorId.. = " + vId);
		System.out.println("VendorName.. = " + vendorName);
		System.out.println("VendorType.. = " + vendorType);
		System.out.println("City.. = " + vendorCity);
		Vendorinfo Vendorinfo = new Vendorinfo();
		Vendorinfo.setVendorid(vId);
		Vendorinfo.setVendorcity(vendorCity);
		Vendorinfo.setVendortype(vendorType);
		Vendorinfo.setVendorname(vendorName);
		VendorinfoCollection infoCollection  = new VendorinfoCollection();
	
		infoCollection.getVendorinfo().add(Vendorinfo);
		
		com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev.VendorinfoClientEp vendorinfoClientEp = new com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev.VendorinfoClientEp();
		com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev.BAMDEVPtt bamDEV = vendorinfoClientEp.getBAMDEVPt();

		
			bamDEV.merge(infoCollection);
		}catch (Exception e) {
		System.out.println("Error Occured while processing Update Request " + e.getMessage());
	}

 return true;
}
}
