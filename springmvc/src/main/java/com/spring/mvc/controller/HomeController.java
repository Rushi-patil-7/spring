package com.spring.mvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String Home(Model model) {
		
		model.addAttribute("roll_no", 1524);
		model.addAttribute("myname" ,"Rushi Patil");

	ArrayList<String> friend = new ArrayList();
		friend.add("Prajwal");
		friend.add("kuldeep");
		friend.add("chetan");
		friend.add("maddy");
		
		model.addAttribute("myfriend" ,friend);
		
		return "index";
	}
	
}
