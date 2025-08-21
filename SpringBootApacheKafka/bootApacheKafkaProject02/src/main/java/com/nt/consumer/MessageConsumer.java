package com.nt.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nt.store.MessageStore;
@Component
public class MessageConsumer {
	@Autowired
	private MessageStore store;

	@KafkaListener(topics = "${app.tpc.name}", groupId = "grp1")
	public void readMessage(String msg) {
		
		store.addMessage(msg);
	}
}
