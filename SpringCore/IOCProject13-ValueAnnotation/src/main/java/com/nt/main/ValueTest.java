package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Customer;

public class ValueTest {
	
	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Customer custm=ctx.getBean("customer",Customer.class);
		
		System.out.println(custm);
	}
}
