package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(1)
public class apprunnerOne implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("apprunnerOne.run()::start");
		System.out.println("=======Runner Class One (CommandLineRunner)===========");
		System.out.println("The Command Line Arguments are " + Arrays.toString(args));

		System.out.println("apprunnerOne.run()::end");
	}
	
	@Override
	public int getOrder() {
		return 3;
	}
}
