package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getEmployeeDetails(String desgn1, String desgn2, String desgn3) throws Exception;
}
