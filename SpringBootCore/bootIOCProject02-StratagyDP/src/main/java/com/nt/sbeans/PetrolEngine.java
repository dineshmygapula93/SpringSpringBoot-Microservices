package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngg")
public class PetrolEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("Engine Started");
		System.out.println("PetrolEngine.startEngine()");
	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine.stopEngine()");
		System.out.println("Engine stopped");
	}

}
