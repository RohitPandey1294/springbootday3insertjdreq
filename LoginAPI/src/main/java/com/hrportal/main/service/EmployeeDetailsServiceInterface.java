package com.hrportal.main.service;

import com.hrportal.main.domain.EmployeeDetails;

public interface EmployeeDetailsServiceInterface {
	public EmployeeDetails getEmployeeDetailsByloginId(String loginId);
}
