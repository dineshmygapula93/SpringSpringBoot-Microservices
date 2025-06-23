package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IPoliticianMgmtService;

@Component
public class PoliticianTestRunner implements CommandLineRunner {

	@Autowired
	private IPoliticianMgmtService politicianservice;

	@Override
	public void run(String... args) throws Exception {

//		try {
//			Politician pol = new Politician();
//
//			pol.setPname("yogi");
//			pol.setPaddr("up");
//			pol.setDob(LocalDate.of(1965, 5, 1));
//			pol.setTob(LocalTime.of(15, 20, 24));
//			pol.setDoj(LocalDateTime.of(1965, 4, 1, 10, 11, 25));
//			String msg=politicianservice.registerPolitician(pol);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {
			politicianservice.showAllPoliticians().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("Politician age " + politicianservice.calculatePoliticianAge(100));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
