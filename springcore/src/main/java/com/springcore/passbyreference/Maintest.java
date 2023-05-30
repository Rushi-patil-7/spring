package com.springcore.passbyreference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maintest {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/testing/refconfig.xml");
		context.registerShutdownHook();
		A name = (A) context.getBean("a1");
		
		System.out.println(name.getFirstname() +" " + name.getLastname().getLastname());
	}

}
