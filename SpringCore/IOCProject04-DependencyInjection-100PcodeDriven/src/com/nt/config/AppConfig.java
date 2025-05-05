package com.nt.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("i am 0-param constructor of config class");
	}
	@Bean(name="localDate")
	public LocalDate createDate() {
		return LocalDate.now();
	}
}
