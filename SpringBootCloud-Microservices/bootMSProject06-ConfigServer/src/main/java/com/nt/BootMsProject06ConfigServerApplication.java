package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer		
public class BootMsProject06ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProject06ConfigServerApplication.class, args);
	}

}
