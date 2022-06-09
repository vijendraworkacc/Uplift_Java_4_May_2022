package com.te.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/app/c1")
public class ProjectControllerV1 {

	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	public String welcome(Model model) {
		String username = "Vijendra Singh";
		model.addAttribute("username", username);
		return "welcome";
	}

	@RequestMapping(path = "/welcome2", method = RequestMethod.GET)
	public String welcome(ModelMap modelMap) {
		String username = "Shristi Singh";
		modelMap.addAttribute("username", username);
		return "welcome";
	}

	@RequestMapping(path = "/welcome3", method = RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView();
		String name = "Rajneesh Kumar";
		modelAndView.addObject("name", name);
		modelAndView.setViewName("home");
		return modelAndView;
	}
}
