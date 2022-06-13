package com.te.learnspringrest3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.learnspringrest3.entity.dto.EmployeeDto;
import com.te.learnspringrest3.response.GeneralResponse;

@RestController
@RequestMapping(path = "/c1")
public class AppRestController {

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GeneralResponse> get() {
		return ResponseEntity.ok().body(new GeneralResponse(HttpStatus.OK, "Error Message!", "Message!", "Data!"));
	}

	@PostMapping(path = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GeneralResponse> register(@RequestBody EmployeeDto employeeDto) {
		return ResponseEntity.ok().body(new GeneralResponse(HttpStatus.OK, "Error Message!", "Message!", employeeDto));
	}
}
