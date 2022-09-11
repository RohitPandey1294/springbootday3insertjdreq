package com.hrportal.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.domain.EmployeeDetails;
import com.hrportal.main.repository.EmployeeDetailsRepositoryInterface;

@Service
public class EmployeeDetailsServiceIMPL implements EmployeeDetailsServiceInterface {
	@Autowired
	private EmployeeDetailsRepositoryInterface employeeDetailsRepositoryInterface;

	@Override
	public EmployeeDetails getEmployeeDetailsByloginId(String loginId) {
		// TODO Auto-generated method stub
		return employeeDetailsRepositoryInterface.getEmployeeDetailsByloginId(loginId);
	}

}
