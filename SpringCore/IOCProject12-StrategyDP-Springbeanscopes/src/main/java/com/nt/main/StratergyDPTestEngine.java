package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vechile;
import com.nt.ston.Printer;

public class StratergyDPTestEngine {
		
	public static void main(String args []) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

		   Vechile vech =ctx.getBean("vechile",Vechile.class);
		   Vechile vech1 =ctx.getBean("vechile",Vechile.class);
		   
		   Printer prt =ctx.getBean("prnt",Printer.class);
		   Printer prt1 =ctx.getBean("prnt",Printer.class);
		   
		   vech.journey("hyd","vijy");
		   
		   System.out.println(vech.hashCode()+"      "+vech1.hashCode());
		   System.out.println(prt.hashCode()+"      "+prt1.hashCode());
	}



}
