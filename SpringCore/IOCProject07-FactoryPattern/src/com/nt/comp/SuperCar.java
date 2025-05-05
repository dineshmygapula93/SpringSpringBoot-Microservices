package com.nt.comp;

public class SuperCar implements ICar {

	@Override
	public String drive(String user) {
		System.out.println("SuperCar.drive()");
		return "Drive the super car "+user;
	}

}
