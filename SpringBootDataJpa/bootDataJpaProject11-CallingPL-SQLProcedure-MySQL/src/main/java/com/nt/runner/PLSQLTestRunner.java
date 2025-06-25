package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IAuthMgmtservice;

@Component
public class PLSQLTestRunner implements CommandLineRunner {

	@Autowired
	private IAuthMgmtservice authservice;

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("result ::" + authservice.login("sai", "hyd"));
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
}
