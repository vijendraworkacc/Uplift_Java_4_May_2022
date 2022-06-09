package com.te.mvclms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/c3")
public class MvcLmsController3 {

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

	/* View to Controller */
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		// TODO: Logic to save data in database!
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("age", age);
		return "welcome";
	}

	/* View to Controller */
	@RequestMapping(path = "/register2", method = RequestMethod.POST)
	public String register(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("age") int age, Model model) {
		// TODO: Logic to save data in database!
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("age", age);
		return "welcome";
	}
}
