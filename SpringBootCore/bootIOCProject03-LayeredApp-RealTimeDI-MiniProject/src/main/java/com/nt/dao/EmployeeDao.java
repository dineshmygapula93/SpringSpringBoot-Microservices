package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDao")
public class EmployeeDao implements IEmployeeDAO {
	private static final String Get_Emp_Desgn = "Select empno,ename,job,sal,deptno from emp where job in(?,?,?) order by job";
	@Autowired
	private DataSource ds;

	public EmployeeDao() {
		System.out.println("EmployeeDao.EmployeeDao()");
	}

	List<Employee> list;

	@Override
	public List<Employee> getEmployeeDetails(String desgn1, String desgn2, String desgn3) throws Exception {
		System.out.println("EmployeeDao.getEmployeeDetails()");
		try {
			Connection con = ds.getConnection();

			PreparedStatement ps = con.prepareStatement(Get_Emp_Desgn);
			ps.setString(1, desgn1);
			ps.setString(2, desgn2);
			ps.setString(3, desgn3);

			try (ResultSet rs = ps.executeQuery()) {
				list = new ArrayList();

				while (rs.next()) {
					Employee emp = new Employee();

					emp.setEmpno(rs.getInt(1));
					emp.setName(rs.getString(2));
					emp.setDesgn(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));

					list.add(emp);
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
