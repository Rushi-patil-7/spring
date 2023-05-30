package com.springcore.test;

public class Test {

	private String subId;
	private String std;
	private String subName;
	
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		System.out.println("setting subId");
		this.subId = subId;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		System.out.println("setting std");
		this.std = std;
	}
	public String getSubName() {
		
		return subName;
	}
	public void setSubName(String subName) {
		System.out.println("setting subName");
		this.subName = subName;
	}
	

	public Test() {
		super();
	}
	@Override
	public String toString() {
		return "Test [subId=" + subId + ", std=" + std + ", subName=" + subName + "]";
	}
	
	public void init() {
		System.out.println("Init method is called");
	}
	public void destroy() {
		System.out.println("destroy method is called");
	}
}
