package com.springcore.admin;

public class Address {


	private String address;
	private int plotno;

	public Address(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPlotno() {
		return plotno;
	}
	
	public void setPlotno(int plotno) {
		this.plotno = plotno;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", plotno=" + plotno + "]";
	}

}
