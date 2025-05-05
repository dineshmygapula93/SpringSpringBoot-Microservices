package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngg")
public class ElectircEngine implements IEngine {

    private final DesielEngine dEngg;

    ElectircEngine(DesielEngine dEngg) {
        this.dEngg = dEngg;
    }

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
