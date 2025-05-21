package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class apprunnerOne implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("apprunnerOne.run()::start");
		System.out.println("=======Runner Class One (CommandLineRunner)===========");
		System.out.println("The Command Line Arguments are "+Arrays.toString(args));

		System.out.println("apprunnerOne.run()::end");
	}

}
