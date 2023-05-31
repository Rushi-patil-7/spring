package com.springcore.styreotype.annotation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("restro")
public class Restro {
	@Value ("#{menulist}")
	private List<String> Menu;
	@Value ("#{pricelist}")
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
