package com.springmvc.searchcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class SearchController {
	
	@RequestMapping("/search")
	public RedirectView searchController( @RequestParam("querybox") String query) {
		
		String url = "https://www.google.com/search?q=" +query;
		
		RedirectView rv = new RedirectView();
		rv.setUrl(url);
				
		return rv;
		
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("home controller works");
		return "home";
	}
	
	
}
