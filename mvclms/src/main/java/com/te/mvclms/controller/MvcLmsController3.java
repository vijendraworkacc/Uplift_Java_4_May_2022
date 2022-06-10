package com.te.mvclms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.mvclms.entity.dto.EmployeeDto;
import com.te.mvclms.entity.dto.EmployeeUpdateDto;
import com.te.mvclms.service.MvcLmsService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(path = "/c3")
@RequiredArgsConstructor
public class MvcLmsController3 {

	private final MvcLmsService mvcLmsService;

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

	@RequestMapping(path = "/employee", method = RequestMethod.GET)
	public String update() {
		return "update";
	}

	/* View to Controller */
	/* CREATE API */
	@RequestMapping(path = "/employee", method = RequestMethod.POST)
	public String register(@ModelAttribute EmployeeDto employeeDto, Model model) {

		/* Using service to use repository! */
		employeeDto = mvcLmsService.register(employeeDto);

		model.addAttribute("name", employeeDto.getName());
		model.addAttribute("email", employeeDto.getEmail());
		model.addAttribute("age", employeeDto.getAge());
		return "welcome";
	}

	/* READ API */
	@RequestMapping(path = "/employee/{employeeId}", method = RequestMethod.GET)
	public String getEmployeeDetails(@PathVariable int employeeId, Model model) {

		/* Using service to use repository to get data! */
		EmployeeDto employeeDto = mvcLmsService.getEmployeeDetails(employeeId);

		model.addAttribute("name", employeeDto.getName());
		model.addAttribute("email", employeeDto.getEmail());
		model.addAttribute("age", employeeDto.getAge());
		return "profile";
	}
	
	@RequestMapping(path = "/employee/read", method = RequestMethod.GET)
	public String findEmployee() {
		return "findEmployee";
	}
	
	/* READ API + FORM */
	@RequestMapping(path = "/employee/read", method = RequestMethod.POST)
	public String getEmployeeDetails2(@RequestParam(name = "employeeId") int employeeId, Model model) {

		/* Using service to use repository to get data! */
		EmployeeDto employeeDto = mvcLmsService.getEmployeeDetails(employeeId);

		model.addAttribute("name", employeeDto.getName());
		model.addAttribute("email", employeeDto.getEmail());
		model.addAttribute("age", employeeDto.getAge());
		return "profile";
	}

	/* UPDATE API */
	@RequestMapping(path = "/employee/update", method = RequestMethod.POST)
	public String updateEmployeeDetails(@ModelAttribute EmployeeUpdateDto employeeUpdateDto, Model model) {

		/* Using service to use repository to update data! */
		EmployeeDto employeeDto = mvcLmsService.updateEmployeeDetails(employeeUpdateDto.getEmployeeId(), employeeUpdateDto);

		model.addAttribute("name", employeeDto.getName());
		model.addAttribute("email", employeeDto.getEmail());
		model.addAttribute("age", employeeDto.getAge());
		return "welcome";
	}
	
	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	public String deleteEmployee() {
		return "deleteEmployee";
	}
	
	/* READ API + FORM */
	@RequestMapping(path = "/delete", method = RequestMethod.POST)
	public String deleteEmployee(@RequestParam(name = "employeeId") int employeeId, Model model) {
		/* Using service to use repository to delete data! */
		boolean isDeleted = mvcLmsService.deleteEmployee(employeeId);
		model.addAttribute("employeeId", employeeId);
		model.addAttribute("isDeleted", isDeleted);
		return "isDeleted";
	}

}
