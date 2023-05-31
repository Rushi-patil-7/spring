package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standalone.xml");
		Restro menu = con.getBean("drinks" ,Restro.class);
//		Restro item_price = con.getBean("pricing",Restro.class);
	
		System.out.println(menu);
		System.out.println(menu.getMenu().getClass().getName());
		System.out.println(menu.getPricing());
//		System.out.println(item_price);
//		System.out.println(item_price.getPricing().getClass().getName());

	}

}
