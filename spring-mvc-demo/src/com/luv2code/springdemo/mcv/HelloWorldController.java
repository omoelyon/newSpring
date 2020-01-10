package com.luv2code.springdemo.mcv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//need a method to show the initial html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	//need a method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

}
