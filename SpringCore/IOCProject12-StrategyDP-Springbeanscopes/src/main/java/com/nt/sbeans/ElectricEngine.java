package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg")
public final class ElectricEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("Engine Started");
		System.out.println("ElectircEngine.startEngine()");
	}

	@Override
	public void stopEngine() {
		System.out.println("ElectircEngine.stopEngine()");
		System.out.println("Engine stopped");
	}

}
