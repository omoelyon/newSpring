package com.luv2code.springdemo.mcv;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	//need a method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
//	new controller method to read form data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String theName= request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "the shout  " + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		
		String result = "hey my friend from V3! "+ theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
}
