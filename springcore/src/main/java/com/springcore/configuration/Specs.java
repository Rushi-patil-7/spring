package com.springcore.configuration;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Specs {
	
	private User user;
	
	
	private String mobileName;
	private String camera;

	private String price;
	
	public void content() {
		this.user.myname();	
	}
	
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Specs(User user, String mobileName, String camera, String price) {
		super();
		
		this.user = user;
		this.mobileName = mobileName;
		this.camera = camera;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Specs [ mobileName=" + mobileName + ", camera=" + camera + ", price=" + price  + "]";
	}
	
	
	
	
}
