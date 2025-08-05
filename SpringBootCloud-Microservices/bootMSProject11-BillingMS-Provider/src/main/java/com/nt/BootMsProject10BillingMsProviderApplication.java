package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@Slf4j
public class BootMsProject10BillingMsProviderApplication {

	public static void main(String[] args) {
		log.debug("start of main method in billing app");
		SpringApplication.run(BootMsProject10BillingMsProviderApplication.class, args);
		log.debug("end of main method in billing app");
	}

}
