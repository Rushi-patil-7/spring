package com.spring.mvc.controller;

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
		
		//Setting a view
		model.setViewName("about");
		
		return model;
	}
}

