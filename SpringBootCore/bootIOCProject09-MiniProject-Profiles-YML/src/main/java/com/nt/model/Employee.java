package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	private Integer Empno;
	private String name;
	private String desgn;
	private Double salary;
	private Integer deptno;
	private Double grossSalary;
	private Double netSalary;
}
