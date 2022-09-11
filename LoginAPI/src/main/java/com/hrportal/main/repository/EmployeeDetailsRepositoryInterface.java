package com.hrportal.main.repository;

import com.hrportal.main.domain.EmployeeDetails;

public interface EmployeeDetailsRepositoryInterface {
	public EmployeeDetails getEmployeeDetailsByloginId(String loginId);

}
