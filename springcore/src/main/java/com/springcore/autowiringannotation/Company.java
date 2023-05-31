package com.springcore.autowiringannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {
	public static void main(String[] args) {

	ApplicationContext context =new	ClassPathXmlApplicationContext("com/springcore/autowiringannotation/autoconfig.xml");
	Car car1 =	(Car) context.getBean("cardetails1");

	Car car2 =	(Car) context.getBean("cardetails2");

	Car car3 =	(Car) context.getBean("cardetails3");

	System.out.println(car1);
	System.out.println(car2);
	System.out.println(car3);
		
	}
}
