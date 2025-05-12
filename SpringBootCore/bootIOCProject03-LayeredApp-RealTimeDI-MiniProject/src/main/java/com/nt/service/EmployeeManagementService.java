package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("EmpService")
public class EmployeeManagementService implements IEmployeeMangementService {

	@Autowired
	private IEmployeeDAO empDAO;

	public EmployeeManagementService() {
		System.out.println("EmployeeManagementService.EmployeeManagementService()");
	}

	@Override
	public List<Employee> showEmployeesByDesgn(String desgn1, String desgn2, String desgn3) throws Exception {
		System.out.println("EmployeeManagementService.showEmployeesByDesgn()");
		desgn1 = desgn1.toUpperCase();
		desgn2 = desgn2.toUpperCase();
		desgn3 = desgn3.toUpperCase();

		List<Employee> list = empDAO.getEmployeeDetails(desgn1, desgn2, desgn3);

		list.forEach(emp -> {
			emp.setGrossSalary((emp.getSalary()) + (emp.getSalary() * 0.4));
			emp.setNetSalary((emp.getSalary()) + (emp.getSalary() * 0.2));
		});
		return list;
	}

	@Override
	public String registerEmployee(Employee emp) throws Exception {
		int count = empDAO.insertEmployee(emp);
		return count == 0 ? "Employee is not registered" : "Employee is registered";
	}

}
