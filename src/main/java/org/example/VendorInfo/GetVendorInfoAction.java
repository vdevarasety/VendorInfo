package org.example.VendorInfo;

import org.example.VendorInfo.client.GetVendorDetails;

import com.oracle.xmlns.pcbpel.adapter.db.top.bam_dev.VendorinfoCollection;

public class GetVendorInfoAction {
	
	private String vendorId;
	private String vendorName;
	private String vendorType;
	private String vendorCity;
	
	public String getVendorCity() {
		return vendorCity;
	}

	public void setVendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}


	private static String SUCCESS = "SUCCESS";
	private static String FAIL = "FAIL";
	
	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorType() {
		return vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	
	/* Need to invoke a Webservice call to get the VendorInfo
	 */ 
	public String execute() throws InterruptedException {
		System.out.println("****** Inside Execute Method ****");
		GetVendorDetails getVendorDetails = new GetVendorDetails();		
		/*VendorinfoCollection vendorDetails = getVendorDetails.getVendorInfo(getVendorId());
		if (vendorDetails != null && vendorDetails.getVendorinfo() != null && vendorDetails.getVendorinfo().size() > 0 ) { //TODO change if the service executes and returns the record
			System.out.println(" **** Got the vendor Details Response Back");
			setVendorId( vendorDetails.getVendorinfo().get(0).getVendorid()) ; // TODO  Webservice response set
			setVendorName(vendorDetails.getVendorinfo().get(0).getVendorname().getValue()) ; 
			setVendorType(vendorDetails.getVendorinfo().get(0).getVendortype().getValue()) ;
			setVendorCity(vendorDetails.getVendorinfo().get(0).getVendorcity().getValue()) ; 

			return SUCCESS ;*/
			if (true) {
				setVendorId("12345") ; // TODO  Webservice response set
				setVendorName("Verizon") ; 
				setVendorType("Utility") ;
				setVendorCity("Atlanta") ; 
	
				return SUCCESS ;
		
		}
		else {
			return FAIL;
		}
		}
		
	
}
