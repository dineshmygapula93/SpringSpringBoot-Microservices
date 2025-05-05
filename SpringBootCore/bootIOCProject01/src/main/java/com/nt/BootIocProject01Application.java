package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIocProject01Application {
	
	@Bean("date")
	public LocalDate createdate() {
		System.out.println("BootIocProject01Application.createdate()");
		return LocalDate.now();
	}
	public static void main(String[] args) {
		System.out.println("BootIocProject01Application.main() start");
		ApplicationContext ctx = SpringApplication.run(BootIocProject01Application.class, args);
		
		SeasonFinder msg =ctx.getBean("sf",SeasonFinder.class);
		System.out.println("Season ::"+msg.seasonFinder());
		System.out.println("BootIocProject01Application.main() end ");
	}

}
