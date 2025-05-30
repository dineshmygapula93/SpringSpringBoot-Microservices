package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class Appconfig {
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource createRdbms() {
		ResourceBundleMessageSource source=new ResourceBundleMessageSource();
		source.setBasename("com/nt/commons/App");
		return source;
	}
}
