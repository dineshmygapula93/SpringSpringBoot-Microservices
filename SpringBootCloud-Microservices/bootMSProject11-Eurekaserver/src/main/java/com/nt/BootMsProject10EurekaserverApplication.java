package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMsProject10EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProject10EurekaserverApplication.class, args);
	}

}
