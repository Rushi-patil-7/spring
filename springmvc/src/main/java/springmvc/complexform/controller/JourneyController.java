package springmvc.complexform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc.complexform.service.Trainservice;

@Controller
public class JourneyController {
	@Autowired
	private Trainservice trainservice;
	
	@RequestMapping("/form")
	private ModelAndView form () {
		System.out.println("in the form controller");
		ModelAndView model = new ModelAndView();
		model.setViewName("trainform");
		
		return model;
	}
	
	@RequestMapping(path="/formprocess", method=RequestMethod.POST)
	private String journey(@ModelAttribute Passanger passanger, Model model) {
		System.out.println("iam in journey method");
		this.trainservice.createPassanger(passanger);
		
		return "happyjourney";
	}
	
}
