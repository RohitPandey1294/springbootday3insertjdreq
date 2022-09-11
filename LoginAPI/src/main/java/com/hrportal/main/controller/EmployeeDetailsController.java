package com.hrportal.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.domain.EmployeeDetails;
import com.hrportal.main.domain.JobDescription;
import com.hrportal.main.service.EmployeeDetailsServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("employeedetails")
public class EmployeeDetailsController {
	public EmployeeDetailsController() {
		System.out.println("EmployeeDetailsController object created");
	}

	@Autowired
	private EmployeeDetailsServiceInterface employeeDetailsServiceInterface;

	@RequestMapping(value = "employee/{loginId}", method = RequestMethod.GET)
	public EmployeeDetails getEmployeeDetailsByloginId(@PathVariable String loginId) {
		System.out.println("EmployeeDetailsByLoginId");
		return employeeDetailsServiceInterface.getEmployeeDetailsByloginId(loginId);
	}

}
