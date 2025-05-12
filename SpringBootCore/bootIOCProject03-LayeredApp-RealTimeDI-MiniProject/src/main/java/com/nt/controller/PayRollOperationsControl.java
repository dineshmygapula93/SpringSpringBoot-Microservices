package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMangementService;

@Controller("payroll")
public class PayRollOperationsControl {
	@Autowired
	private IEmployeeMangementService empservice;

	public PayRollOperationsControl() {
		System.out.println("PayRollOperationsControl.PayRollOperationsControl()");
	}

	public List<Employee> processEmployeeDetailsByDesgn(String desgn1, String desgn2, String desgn3) throws Exception {
		System.out.println("PayRollOperationsControl.processEmployeeDetailsByDesgn()");
		List<Employee> list = empservice.showEmployeesByDesgn(desgn1, desgn2, desgn3);
		return list;
	}

	public String processEmployeeForRegestriation(Employee emp) throws Exception {
		String message = empservice.registerEmployee(emp);
		return message;
	}

}
