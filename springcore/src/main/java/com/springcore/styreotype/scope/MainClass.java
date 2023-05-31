package com.springcore.styreotype.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/styreotype/scope/scope.xml");
		Hotel starter = con.getBean("maincourse" ,Hotel.class);
		Hotel maincourse = con.getBean("maincourse" ,Hotel.class);
		Hotel beverages= con.getBean("maincourse" ,Hotel.class);
		
		System.out.println(starter.getMenu());
		System.out.println("_______________________________\n");
		System.out.println(starter.hashCode());
		System.out.println(maincourse.hashCode());
		System.out.println(beverages.hashCode());
		System.out.println("_______________________________\n");
		System.out.println(beverages.getPricing());

	}

}
