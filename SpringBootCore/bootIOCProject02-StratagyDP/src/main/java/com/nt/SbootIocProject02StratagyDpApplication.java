package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Vechile;

@SpringBootApplication
public class SbootIocProject02StratagyDpApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SbootIocProject02StratagyDpApplication.class, args);
		
		Vechile vech=ctx.getBean(Vechile.class);
		
		vech.journey("Hyd", "palakollu");
	}

}
