package com.test.clentCode;

import com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev.BAMDEVPtt;
import com.oracle.xmlns.pcbpel.adapter.db.pocvendorinfo.vendorinfo.bam_dev.VendorinfoClientEp;
import com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev.BAMDEVSelectId;
import com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev.VendorinfoCollection;

public class ClientCode {

	public static void main(String[] args) {
		 
		
		VendorinfoClientEp vendorinfoClientEp = new VendorinfoClientEp();
		BAMDEVPtt bamDEV = vendorinfoClientEp.getBAMDEVPt();
		BAMDEVSelectId bamDEVSelectInputParameters = new BAMDEVSelectId();
		bamDEVSelectInputParameters.setId("12345");
		VendorinfoCollection infoCollection = bamDEV.bamDEVSelect(bamDEVSelectInputParameters);
		
          System.out.println("VendorId =" + infoCollection.getVendorinfo().get(0).getVendorid());
          System.out.println("VendorName  =" + infoCollection.getVendorinfo().get(0).getVendorname().getValue());
          System.out.println("City =" + infoCollection.getVendorinfo().get(0).getVendorcity().getValue());
          System.out.println("VType =" + infoCollection.getVendorinfo().get(0).getVendortype().getValue());
          
	}

}
