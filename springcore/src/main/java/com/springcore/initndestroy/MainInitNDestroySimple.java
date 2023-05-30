package com.springcore.initndestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInitNDestroySimple {
	public static void main(String[] args) {	
	
		AbstractApplicationContext abcontext = new ClassPathXmlApplicationContext("com/springcore/initndestroy/initdestroyconfig.xml");
		abcontext.registerShutdownHook();
		
		A product =(A) abcontext.getBean("bysimple");
		B machine = (B) abcontext.getBean("byInterface");
		C car = (C) abcontext.getBean("byAnnotation");
		System.out.println(product);
		System.out.println(machine);
		System.out.println(car);
	}
}
