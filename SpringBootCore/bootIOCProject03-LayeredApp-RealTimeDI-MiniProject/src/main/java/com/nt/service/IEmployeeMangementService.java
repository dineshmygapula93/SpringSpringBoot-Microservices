package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeMangementService {
	public List<Employee> showEmployeesByDesgn(String desgn1,String desgn2,String desgn3) throws Exception;
}
