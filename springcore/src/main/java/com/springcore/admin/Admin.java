package com.springcore.admin;

public class Admin {
	
	private String adminId;
	private String adminName;
	private Address adminAddress;	
	private long adminContact;
	private Address ptno;
	 
	public Admin(String adminId, String adminName, Address adminAddress, long adminContact , Address ptno) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminAddress = adminAddress;
		this.adminContact = adminContact;
		this.ptno= ptno;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminAddress=" + adminAddress
				+ ", adminContact=" + adminContact +  ", adminPlot n0=" + ptno +"]";
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address getPtno() {
		return ptno;
	}
	public void setPtno(Address ptno) {
		this.ptno = ptno;
	}
	
	

}
