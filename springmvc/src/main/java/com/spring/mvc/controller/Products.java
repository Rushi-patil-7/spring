package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Products {
	@RequestMapping("/products")
	private ModelAndView products() {
		
		ModelAndView product1 = new ModelAndView();
		
		product1.addObject("productId" , 1234);
		product1.addObject("productName" ,"Refrigerator");
		product1.addObject("price" , 12000);
		
		
		List<String> pr = new ArrayList();
		pr.add("refrigerator");
		pr.add("TV");
		pr.add("laptops");
		pr.add("oven");
		pr.add("cooler");
		
		product1.addObject("productlist" , pr);
		
		product1.setViewName("products");
		return product1;
	}
	
}
