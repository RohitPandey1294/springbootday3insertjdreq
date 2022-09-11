package com.hrportal.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.domain.EmployeeDetails;

@Repository
public class EmployeeDetailsRepositoryIMPL implements EmployeeDetailsRepositoryInterface {
	private static final String GET_EMPLOYEE_DETAILS_BY_LOGIN_ID = "SELECT * FROM EMPLOYEE_DETAILS WHERE login_id=?";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public EmployeeDetails getEmployeeDetailsByloginId(String loginId) {
		System.out.println(loginId);
		EmployeeDetails employeeDetails = jdbcTemplate.queryForObject(GET_EMPLOYEE_DETAILS_BY_LOGIN_ID,
				new EmployeeDetailsRowMapper(),loginId);
		return employeeDetails;
	}

	

}
