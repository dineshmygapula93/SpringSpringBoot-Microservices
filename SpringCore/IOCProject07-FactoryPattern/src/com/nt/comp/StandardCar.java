package com.nt.comp;

public class StandardCar implements ICar {

	@Override
	public String drive(String user) {
		System.out.println("StandardCar.drive()");
		return "Drive the Standard car "+user;
	}

}
