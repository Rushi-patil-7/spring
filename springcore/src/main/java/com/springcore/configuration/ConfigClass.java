package com.springcore.configuration;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.configuration")
public class ConfigClass {
	@Bean
	public User getUser() {
		
		return new User() ;
	}
	
	
	@Bean
	public Specs getSpecs() {
		
		Specs mobileSpec = new Specs(getUser(), "redmi" , "50mp" ,"32000");
		
		return mobileSpec;
	}
	
}
