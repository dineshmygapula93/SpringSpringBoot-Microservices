package com.nt.recevier;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nt.model.Actor;

@Component
public class MessageRecevier {

	@JmsListener(destination = "testmq1")
	public void messageRead(Actor actor) {
		System.out.println("message :: " +actor);
	}
}
