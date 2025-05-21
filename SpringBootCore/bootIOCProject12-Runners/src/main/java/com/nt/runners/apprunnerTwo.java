package com.nt.runners;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class apprunnerTwo implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("apprunnerTwo.run():: Start");
		System.out.println("==========Runner class two(Application Runner)===========");

		System.out.println("Non Option arguments" + args.getNonOptionArgs());

		Set<String> setdata = args.getOptionNames();
		
		System.out.println("Option Arguments"+setdata);
		

		System.out.println("apprunnerTwo.run():: end");
	}

}
