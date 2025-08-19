package com.nt.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MesseageSender implements CommandLineRunner {

	@Autowired
	private JmsTemplate template;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * template.send("testmq", new MessageCreator() {
		 * 
		 * @Override public Message createMessage(Session session) throws JMSException {
		 * Message message = session.createTextMessage("Good Morning" + new Date());
		 * return message; } });
		 */
		template.sendAndReceive("testmq", ses -> ses.createTextMessage("Good Morning " + new Date()));
	}

}
