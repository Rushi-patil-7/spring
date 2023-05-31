package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Restro {

	private List<String> Menu;
	private Map<String, Double> pricing;

	public List getMenu() {
		return Menu;
	}

	public void setMenu(List<String> menu) {
		Menu = menu;
	}

	public Map<String, Double> getPricing() {
		return pricing;
	}

	public void setPricing(Map<String, Double> pricing) {
		this.pricing = pricing;
	}

	@Override
	public String toString() {
		return "Restro [Menu=" + Menu + ", pricing=" + pricing + "]";
	}

}
