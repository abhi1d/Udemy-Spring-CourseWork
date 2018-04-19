package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") //parent request mapping which make all the mapping to the sub mappings.
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
		
	// need a controller method to process the HTML form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	// new controller to read form data
	//add to  data model
	
	@RequestMapping("processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "yo! " + theName;
		// add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	
	@RequestMapping("processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,
			Model model) {
		
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Hey My Friend from v3! " + theName;
		// add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
}






