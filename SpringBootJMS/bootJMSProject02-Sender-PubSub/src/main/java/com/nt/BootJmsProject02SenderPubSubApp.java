package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootJmsProject02SenderPubSubApp {

	public static void main(String[] args) {
		SpringApplication.run(BootJmsProject02SenderPubSubApp.class, args);

	}

}
