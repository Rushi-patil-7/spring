package com.spring.mvc.controller;


public class User {
	
	private String username;
	private String userEmail;
	private String feedback;
	private long mobile;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getuserEmail() {
		return userEmail;
	}
	public void setuserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userEmail=" + userEmail + ", feedback=" + feedback + ", mobile=" + mobile
				+ "]";
	}
	
	

}
