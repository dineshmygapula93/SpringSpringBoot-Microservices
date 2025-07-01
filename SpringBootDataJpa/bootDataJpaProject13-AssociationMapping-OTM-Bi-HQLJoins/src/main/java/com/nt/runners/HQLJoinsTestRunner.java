package com.nt.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.ICustomerMgmtService;

@Component
public class HQLJoinsTestRunner implements CommandLineRunner {
	@Autowired
	private ICustomerMgmtService custservice;

	@Override
	public void run(String... args) throws Exception {

//		try {
//			List<Object[]> list = custservice.showCustomersAndPhoneNumbersUsingJoins();
//			list.forEach(row -> {
//				System.out.println(Arrays.toString(row));
//			});
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {
			List<Object[]> list = custservice.showPhoneNumbersAndCustomersUsingJoins();
			list.forEach(row -> {
				System.out.println(Arrays.toString(row));
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
