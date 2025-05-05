package com.nt.comp;

public class LuxuryCar implements ICar {

	@Override
	public String drive(String user) {
		System.out.println("LuxuryCar.drive()");
		return "Drive the luxury car "+user;
	}

}
