package com.springcore.initndestroy;

public class A {
	private String product;
	private double price;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "A [product=" + product + ", price=" + price + "]";
	}
	public void start() {
		System.out.println("Inside Init ");
	}
	public void end() {
		System.out.println("Inside destroy");
	}
}
