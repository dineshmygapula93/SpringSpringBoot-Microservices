package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Appconfig.AppConfig;
import com.nt.comp.Flipkart;

public class StratergyDPTest {
	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Flipkart fkpt =ctx.getBean("fpkt",Flipkart.class);
		String msg = fkpt.Shopping(new String[] { "T-shirt", "Cap", "shoes" }, new Double[] { 233.3, 323.56, 424.43 });

		System.out.println(msg);

		System.out.println("==========================");
		
		
	}
}
