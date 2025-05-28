package com.nt.runners;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(2)
public class apprunnerTwo implements ApplicationRunner,Ordered {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("apprunnerTwo.run():: Start");
		System.out.println("==========Runner class two(Application Runner)===========");

		System.out.println("Non Option arguments" + args.getNonOptionArgs());

		Set<String> setdata = args.getOptionNames();

		System.out.println("Option Arguments" + setdata);

		setdata.forEach((name) -> System.out.println(name + " " + args.getOptionValues(name)));

		System.out.println("apprunnerTwo.run():: end");
	}
	
	@Override
	public int getOrder() {
		return 1;
	}
}
