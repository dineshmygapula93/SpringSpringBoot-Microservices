package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.PersonDetails;

@SpringBootApplication
public class BootIocProject06BulkInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProject06BulkInjectionApplication.class, args);
		
		PersonDetails pd=ctx.getBean("pdetails",PersonDetails.class);
		
		System.out.println(pd);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
