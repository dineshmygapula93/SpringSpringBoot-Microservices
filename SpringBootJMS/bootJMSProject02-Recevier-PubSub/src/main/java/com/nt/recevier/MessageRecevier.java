package com.nt.recevier;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageRecevier {

	@JmsListener(destination = "testmq")
	public void messageRead(String text) {
		System.out.println("message :: " + text);
	}
}
