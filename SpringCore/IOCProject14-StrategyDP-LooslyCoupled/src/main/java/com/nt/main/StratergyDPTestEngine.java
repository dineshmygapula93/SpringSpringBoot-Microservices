package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vechile;

public class StratergyDPTestEngine {
		
	public static void main(String args []) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

		   Vechile vech =ctx.getBean("vechile",Vechile.class);
		 
		   vech.journey("hyd","vijy");
	}



}
