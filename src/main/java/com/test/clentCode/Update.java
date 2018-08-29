package com.test.clentCode;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev.BAMDEVPtt;
import com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev.VendorinfoClientEp;
import com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev.BAMDEVSelectId;
import com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev.ObjectFactory;
import com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev.Vendorinfo;
import com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev.VendorinfoCollection;

public class Update {

	public static void main(String[] args) {
		VendorinfoClientEp vendorinfoClientEp = new VendorinfoClientEp();
		BAMDEVPtt bamDEV = vendorinfoClientEp.getBAMDEVPt();
		BAMDEVSelectId bamDEVSelectInputParameters = new BAMDEVSelectId();
		//bamDEVSelectInputParameters.setId("12345");
		
		//VendorinfoCollection infoCollection = new VendorinfoCollection();
		ObjectFactory objectFactory = new ObjectFactory();
		Vendorinfo info = objectFactory.createVendorinfo();
		info.setVendorid("12345");
		
		JAXBElement<String> vendorCity = 
			    new JAXBElement(new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "vendorcity"), String.class, "Atlanta");

		JAXBElement<String> vendorType = 
			    new JAXBElement(new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "vendortype"), String.class, "Utility");
		
		JAXBElement<String> vendorName = 
			    new JAXBElement(new QName("http://xmlns.oracle.com/pcbpel/adapter/db/top/BAM_DEV", "vendorname"), String.class, "ATT");
		
		
		Vendorinfo Vendorinfo = new Vendorinfo();
		Vendorinfo.setVendorid("12345");
		
		Vendorinfo.setVendorcity(vendorCity);
		Vendorinfo.setVendortype(vendorType);
		Vendorinfo.setVendorname(vendorName);
		VendorinfoCollection infoCollection  = new VendorinfoCollection();
		//List<Vendorinfo> vendorInfoList =  infoCollection.getVendorinfo().add(Vendorinfo);
		 
				infoCollection.getVendorinfo().add(Vendorinfo);
		//infoCollection1.
		//VendorinfoCollection infoCollection = infoCollection.getVendorinfo();
		
		
		bamDEV.merge(infoCollection);
	//bamDEV.merge(infoCollection.getVendorinfo());
		
         /* System.out.println("VendorId =" + infoCollection.getVendorinfo().get(0).getVendorid());
          System.out.println("VendorName  =" + infoCollection.getVendorinfo().get(0).getVendorname().getValue());
          System.out.println("City =" + infoCollection.getVendorinfo().get(0).getVendorcity().getValue());
          System.out.println("VType =" + infoCollection.getVendorinfo().get(0).getVendortype().getValue());*/

	}
}
