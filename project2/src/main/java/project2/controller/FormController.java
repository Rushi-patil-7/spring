package project2.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class FormController {

	@RequestMapping("/home")
	private String home() {
		
		System.out.println("I am in the home page");
		return "home";
	}
	
	@RequestMapping("/search")
	private RedirectView form(@RequestParam ("searchForm") String query) {
		
		String url = "https://www.google.com/search?q=" +query;
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl(url);
		
		return redirectView;
	}
	
}
