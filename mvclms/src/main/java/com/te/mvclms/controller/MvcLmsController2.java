package com.te.mvclms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/c2")
public class MvcLmsController2 {
	
	@RequestMapping(path = "/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public String about() {
		return "about";
	}
	
}
