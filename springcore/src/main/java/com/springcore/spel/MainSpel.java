package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MainSpel {
	public static void main(String[] args) throws Exception {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Temp temp = (Temp) con.getBean("temp");

		System.out.println(temp);
		
		
//		SpelExpressionParser parser = new SpelExpressionParser();
//		Expression exp = parser.parseExpression("5+5");
//		System.out.println(exp.getValue());
	}
}
