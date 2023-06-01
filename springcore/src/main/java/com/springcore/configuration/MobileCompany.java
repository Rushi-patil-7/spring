package com.springcore.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileCompany {

	public static void main(String[] args) {
		
		
	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
	
	Specs spec  = context.getBean("getSpecs", Specs.class) ;
			
	spec.content() ;
	System.out.println(spec);
	
	}
}
