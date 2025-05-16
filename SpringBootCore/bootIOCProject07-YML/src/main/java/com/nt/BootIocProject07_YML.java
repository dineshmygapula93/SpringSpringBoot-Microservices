package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.PersonDetails;

@SpringBootApplication
public class BootIocProject07_YML {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProject07_YML.class, args);
		
		PersonDetails pd=ctx.getBean("pdetails",PersonDetails.class);
		
		System.out.println(pd);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
