package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngg")
public class DesielEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("Engine Started");
		System.out.println("DesielEngine.startEngine()");
	}

	@Override
	public void stopEngine() {
		System.out.println("DesielEngine.stopEngine()");
		System.out.println("Engine stopped");
	}

}
