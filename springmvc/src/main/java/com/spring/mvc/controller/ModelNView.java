package com.spring.mvc.controller;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelNView {

	@RequestMapping("/about")
	public ModelAndView about() {
		// creating a object for model and view controller
		ModelAndView model = new ModelAndView();
		
		//setting the data
		model.addObject("education" , "Post graduate");
		model.addObject("name" ,"Rushikesh Masule");
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
		LocalDateTime time= LocalDateTime.now();
		
		model.addObject("time" , format.format(time));
		//Setting a view
		model.setViewName("about");
		
		return model;
	}
}

