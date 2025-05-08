package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.PayRollOperationsControl;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProject03LayeredAppRealTimeDiMiniProject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Desgination 1");
		String desgn1=sc.next();

		System.out.println("Enter the Desgination 2");
		String desgn2=sc.next();
		
		System.out.println("Enter the Desgination 3");
		String desgn3=sc.next();
		
		ApplicationContext ctx=SpringApplication.run(BootIocProject03LayeredAppRealTimeDiMiniProject.class, args);
		
		PayRollOperationsControl proc=ctx.getBean("payroll",PayRollOperationsControl.class);
		
	try {
		List<Employee> list=proc.processEmployeeDetailsByDesgn(desgn1, desgn2, desgn3);
		
		list.forEach(emp ->{
			System.out.println(emp);
		});
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}
