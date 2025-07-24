package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMsProject03EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProject03EurekaserverApplication.class, args);
	}

}
