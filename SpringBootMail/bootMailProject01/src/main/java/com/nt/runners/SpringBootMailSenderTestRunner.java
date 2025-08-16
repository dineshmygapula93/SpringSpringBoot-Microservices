package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IPurchaseMgmtService;
@Component
public class SpringBootMailSenderTestRunner implements CommandLineRunner {
	@Autowired
	private IPurchaseMgmtService purchaseService;

	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("SpringBootMailSenderTestRunner.run()");
			String resultMsg = purchaseService.shopping(new String[] { "shirt", "trouser", "hat" },
					new Double[] { 4000.0, 5000.0, 3000.0 },
					new String[] { "dineshmygapula.mca@gmail.com","pilliraju9024@gmail.com","kulkarniabhitesh003@gmail.com"});
			System.out.println(resultMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
