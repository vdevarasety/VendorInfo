package org.example.VendorInfo;

public class WelcomeUserAction {

	private String userName;
	private String password;
	
	
	private static String SUCCESS_REQ = "SUCCESS";
	private static String FAIL_REQ = "FAIL" ;
	

	

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}




	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}




	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}




	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}




	// all struts logic here
	public String execute()  {
		if ("Vayun".equalsIgnoreCase(userName) && "pwd".equalsIgnoreCase(password))
			return SUCCESS_REQ ;
		else
			return FAIL_REQ;

	}
}