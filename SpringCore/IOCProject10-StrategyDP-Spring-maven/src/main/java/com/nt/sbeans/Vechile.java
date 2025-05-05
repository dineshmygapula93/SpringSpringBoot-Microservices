package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vechile")
public class Vechile {



	@Autowired
	@Qualifier("dEngg")
	private IEngine engine;



	public void journey(String start, String destination) {

		engine.startEngine();
		System.out.println("Journey started at " + start);
		System.out.println("=========================");

		System.out.println("Journey ended at " + destination);
		engine.stopEngine();
	}
}
