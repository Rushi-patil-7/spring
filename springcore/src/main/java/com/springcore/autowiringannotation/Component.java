package com.springcore.autowiringannotation;

public class Component {
	private String Engine;
	private String color;
	private String tyre;
	public String getEngine() {
		return Engine;
	}
	public void setEngine(String engine) {
		Engine = engine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTyre() {
		return tyre;
	}
	public void setTyre(String tyre) {
		this.tyre = tyre;
	}
	@Override
	public String toString() {
		return "Component [Engine=" + Engine + ", color=" + color + ", tyre=" + tyre + "]";
	}
	
	
}
