package org.example.VendorInfo;

import org.example.VendorInfo.client.GetVendorDetails;

public class UpdateVendorInfoAction {
	
	private static String UPDATE_REQ = "UPDATE";
	private static String DELETE_REQ = "DELETE";
	private static String FAIL = "FAIL";
	
	 private String update;
	 private String delete;
	 private String vendorId;
	 private String vendorName;
	 private String vendorType;
	 private String vendorCity;
	 
	 /**
	 * @return the vendorName
	 */
	public String getVendorName() {
		return vendorName;
	}



	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}



	/**
	 * @return the vendorType
	 */
	public String getVendorType() {
		return vendorType;
	}



	/**
	 * @param vendorType the vendorType to set
	 */
	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}



	/**
	 * @return the vendorCity
	 */
	public String getVendorCity() {
		return vendorCity;
	}



	/**
	 * @param vendorCity the vendorCity to set
	 */
	public void setVendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}



	public String getVendorId() {
		System.out.println("getVendorId = " + getVendorId());
		return vendorId;
	}



	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
		System.out.println("this.vendorId = " + this.vendorId);
	}

	/**
	 * @return the update
	 */
	public String getUpdate() {
		System.out.println("getUpdate = " + update);
		return update;
	}



	/**
	 * @param update the update to set
	 */
	public void setUpdate(String update) {
		this.update = update;
		System.out.println("Update = " + this.update);
	}



	/**
	 * @return the delete
	 */
	public String getDelete() {
		System.out.println("getDelete = " + delete);
		return delete;
	}



	/**
	 * @param delete the delete to set
	 */
	public void setDelete(String delete) {
		this.delete = delete;
		System.out.println("Delete = " + this.delete);
	}



	/**
	 * @param update the update to set
	 */
	



	public String execute() throws InterruptedException {
		String returnVal = null;
		GetVendorDetails vendorDetails = new GetVendorDetails();	
		System.out.println("VendorId.. = " + this.vendorId);
		System.out.println("VendorName.. = " + this.vendorName);
		System.out.println("VendorType.. = " + this.vendorType);
		System.out.println("City.. = " + this.vendorCity);
		
		if (update != null) {
			vendorDetails.updateVendorInfo(this.vendorId,this.vendorName,this.vendorType,this.vendorCity);
			returnVal = UPDATE_REQ;
		}
		/*else if (delete != null) {
			vendorDetails.updateVendorInfo(this.vendorId,this.vendorName,this.vendorType,this.vendorCity);
			returnVal = DELETE_REQ;
		}*/
		else 
			returnVal = FAIL;
		
		 return returnVal;
	}
	

}
