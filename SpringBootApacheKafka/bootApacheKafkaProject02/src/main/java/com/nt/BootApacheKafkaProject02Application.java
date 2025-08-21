package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BootApacheKafkaProject02Application {

	public static void main(String[] args) {
		SpringApplication.run(BootApacheKafkaProject02Application.class, args);
	}

}
