package com.nt.Consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerApp {

	@KafkaListener(topics = "tpcfirst", groupId = "group2")
	public void read(String msg) {
		System.out.println("message : " + msg);
	}

}
