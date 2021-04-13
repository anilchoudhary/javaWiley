package com.anil.assessment;

public class Customer {
	private String name;
	private String phoneNo;
	private String emailId;
	private String panNo;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the panNo
	 */
	public String getPanNo() {
		return panNo;
	}
	/**
	 * @param panNo the panNo to set
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	/**
	 * @param name
	 * @param phoneNo
	 * @param emailId
	 * @param panNo
	 */
	public Customer(String name, String phoneNo, String emailId, String panNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.panNo = panNo;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNo=" + phoneNo + ", emailId=" + emailId + ", panNo=" + panNo + "]";
	}
	
	
}
