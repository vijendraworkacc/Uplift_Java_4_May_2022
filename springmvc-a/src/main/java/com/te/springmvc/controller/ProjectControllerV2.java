package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvc.model.EmployeeModel;

@Controller
@RequestMapping(path = "/app/c2")
public class ProjectControllerV2 {

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String phoneNumber = request.getParameter("phone_number");
		// TODO: Logic to save data in database!
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("phone_number", phoneNumber);
		return "home";
	}

	@RequestMapping(path = "/register2", method = RequestMethod.POST)
	public String register(@RequestParam("name") String name, @RequestParam("age") int age,
			@RequestParam("phone_number") String phoneNumber, Model model) {
		// TODO: Logic to save data in database!
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("phone_number", phoneNumber);
		return "home";
	}

	@RequestMapping(path = "/register3", method = RequestMethod.POST)
	public String register(@ModelAttribute EmployeeModel employeeModel, Model model) {
		// TODO: Logic to save data in database!
		model.addAttribute("name", employeeModel.getName());
		model.addAttribute("age", employeeModel.getAge());
		model.addAttribute("phone_number", employeeModel.getPhone_number());
		return "home";

	}

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

}
