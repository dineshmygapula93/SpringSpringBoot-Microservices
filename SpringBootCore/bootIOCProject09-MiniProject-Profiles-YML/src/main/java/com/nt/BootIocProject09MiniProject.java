package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.PayRollOperationsControl;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProject09MiniProject {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ApplicationContext ctx = SpringApplication.run(BootIocProject09MiniProject.class, args);

		PayRollOperationsControl proc = ctx.getBean("payroll", PayRollOperationsControl.class);

		System.out.println("Registering the employees");
		System.out.println("Enter the name :: ");
		String name = sc.next();
		System.out.println("Enter desgn :: ");
		String desgn = sc.next();
		System.out.println("Enter the salary :: ");
		Double salary = sc.nextDouble();

		System.out.println("Enter the deptno ::(10,20,30,40) ");
		Integer deptno = sc.nextInt();

		Employee emp = new Employee();
		emp.setName(name);
		emp.setDesgn(desgn);
		emp.setSalary(salary);
		emp.setDeptno(deptno);

		try {
			String msg = proc.processEmployeeForRegestriation(emp);
			System.out.println(msg);
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println("Internall problem --try again");
		}

		System.out.println("getting employee details by designations");

		System.out.println("Enter the Desgination 1");
		String desgn1 = sc.next();

		System.out.println("Enter the Desgination 2");
		String desgn2 = sc.next();

		System.out.println("Enter the Desgination 3");
		String desgn3 = sc.next();

		try {
			List<Employee> list = proc.processEmployeeDetailsByDesgn(desgn1, desgn2, desgn3);

			if (list.size() != 0) {
				list.forEach(empe -> {
					System.out.println(empe);
				});
			} else {
				System.out.println("No records are found");
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
