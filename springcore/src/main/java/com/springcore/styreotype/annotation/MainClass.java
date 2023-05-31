package com.springcore.styreotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/styreotype/annotation/stereoconfig.xml");
		Restro menu = con.getBean("restro" ,Restro.class);
//		Restro pricelist = con.getBean("mapping" ,Restro.class);
	
		System.out.println(menu.getMenu());
		System.out.println("_______________________________\n");
		System.out.println(menu.getPricing());

	}

}
