package com.te.mvclms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/c1")
public class MvcLmsController1 {

	/* Controller to View */
	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	public String welcome(Model model) {
		String name = "Vijendra Singh";
		String email = "vijendra.s@testyantra.com";
		int age = 99;
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("age", age);
		return "welcome";
	}
	
	/* Controller to View */
	@RequestMapping(path = "/welcome2", method = RequestMethod.GET)
	public String welcome(ModelMap modelMap) {
		String name = "Vijendra Singh";
		String email = "vijendra.s@testyantra.com";
		int age = 99;
		modelMap.addAttribute("name", name);
		modelMap.addAttribute("email", email);
		modelMap.addAttribute("age", age);
		return "welcome";
	}
	
	/* Controller to View */
	@RequestMapping(path = "/welcome3", method = RequestMethod.GET)
	public ModelAndView welcome() {
		String name = "Vijendra Singh";
		String email = "vijendra.s@testyantra.com";
		int age = 99;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", name);
		modelAndView.addObject("email", email);
		modelAndView.addObject("age", age);
		modelAndView.setViewName("welcome");
		return modelAndView;
	}

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String contact() {
		return "contact";
	}

}
