package com.springcore.initndestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class C {
	private int carId;
	private String modelName;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "C [carId=" + carId + ", modelName=" + modelName + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("init using annotation");
		
	}
	@PreDestroy
	public void end() {
		System.out.println("destroy using annotation");
	}
}
