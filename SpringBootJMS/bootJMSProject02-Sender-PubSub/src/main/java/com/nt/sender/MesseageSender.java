package com.nt.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MesseageSender {

	@Autowired
	private JmsTemplate template;


	@Scheduled(cron ="0/10 * * * * * ")
	public void send() {
		System.out.println("MesseageSender.send()");
		template.send("testmq", ses -> ses.createTextMessage("Good Morning " + new Date()));
	}

}
