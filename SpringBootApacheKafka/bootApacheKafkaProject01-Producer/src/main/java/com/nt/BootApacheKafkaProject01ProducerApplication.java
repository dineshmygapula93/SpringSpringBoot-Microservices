package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BootApacheKafkaProject01ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApacheKafkaProject01ProducerApplication.class, args);
	}

}
