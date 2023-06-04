package com.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	private int modelId;
	private String modelName;
	private double price;
	
	private Component component;

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public String toString() {
		return "Car [modelId=" + modelId + ", modelName=" + modelName + ", price=" + price + ", component=" + component
				+ "]";
	}

	public Car(int modelId, String modelName, double price, Component component) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.price = price;
		this.component = component;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
}
