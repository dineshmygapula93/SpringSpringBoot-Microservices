package com.nt.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.nt.model.Actor;

@Component
public class MesseageSender implements CommandLineRunner {

	@Autowired
	private JmsTemplate template;

	@Override
	public void run(String... args) throws Exception {
		
		Actor actor =new Actor(1001,"Pawankalyan","hyd");
		
		template.convertAndSend("testmq1",actor);
		System.out.println("Message sent");
	}

}
