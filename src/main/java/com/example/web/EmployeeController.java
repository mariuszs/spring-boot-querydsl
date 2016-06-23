package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.servicies.EmployeeService;

public class EmployeeController {
	
	@Autowired
	EmployeeService service;

}
