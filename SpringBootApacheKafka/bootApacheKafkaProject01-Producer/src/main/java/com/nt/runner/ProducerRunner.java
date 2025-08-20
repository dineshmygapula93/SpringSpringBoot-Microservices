package com.nt.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerRunner implements CommandLineRunner {

	@Autowired
	private KafkaTemplate<String, String> template;

	@Value("${app.tpc.name}")
	private String topicName;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String msg = null;

		do {
			System.out.println("Enter any String");
			msg = sc.nextLine();
			template.send(topicName, msg);
		} while (!msg.equals("end"));
	}
}