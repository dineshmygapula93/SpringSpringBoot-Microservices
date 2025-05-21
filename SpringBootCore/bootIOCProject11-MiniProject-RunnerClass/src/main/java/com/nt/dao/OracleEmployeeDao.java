package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository
@Profile({"prod","uat"})
public class OracleEmployeeDao implements IEmployeeDAO {
	private static final String Get_Emp_Desgn = "Select empno,ename,job,sal,deptno from emp where job in(?,?,?) order by job";
	private static final String insert_Emp_Query = "insert into emp(empno,ename,job,sal,deptno) values(emp_SEQ.nextval,?,?,?,?)";
	@Autowired
	private DataSource ds;

	public OracleEmployeeDao() {
		System.out.println("OracleEmployeeDao.EmployeeDao()");
	}

	List<Employee> list;

	@Override
	public List<Employee> getEmployeeDetails(String desgn1, String desgn2, String desgn3) throws Exception {
		System.out.println("OracleEmployeeDao.getEmployeeDetails()");
		System.out.println("Data source object class Name ::"+ds.getClass());
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

	@Override
	public int insertEmployee(Employee emp) throws Exception {
		int result = 0;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(insert_Emp_Query);) {
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getDesgn());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getDeptno());

			result = ps.executeUpdate();
			return result;
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
