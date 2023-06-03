package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.service.UserService;


@Controller
public class ContactController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView contactform = new ModelAndView();
	
		contactform.setViewName("contact");
		
		return contactform;
	}
	
	
	@RequestMapping (path="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model ) {

		this.userservice.createUser(user);
		return "success";
	}

}
