package com.nt.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("i am 0-param constructor of config class");
	}

	@Bean(name = "localDate")
	public LocalDate createDate() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
	}

	@Bean(name = "localDate1")
	public LocalDate createDate1() {
		System.out.println("AppConfig.createDate1()");
		return LocalDate.now();
	}

	//@Primary
	@Bean(name = "localDate2")
	public LocalDate createDate2() {
		System.out.println("AppConfig.createDate2()");
		return LocalDate.now();
	}
	@Primary
	@Bean(name = "localDate3")
	public LocalDate createDate3() {
		System.out.println("AppConfig.createDate3()");
		return LocalDate.now();
	}
	//@Primary
	@Bean(name = "localDate4")
	public LocalDate createDate4() {
		System.out.println("AppConfig.createDate4()");
		return LocalDate.now();
	}
}
