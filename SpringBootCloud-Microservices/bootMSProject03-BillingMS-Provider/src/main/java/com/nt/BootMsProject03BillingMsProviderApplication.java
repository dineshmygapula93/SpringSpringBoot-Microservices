package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMsProject03BillingMsProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProject03BillingMsProviderApplication.class, args);
	}

}
