package com.nt.factory;

import com.nt.comp.Bluedart;
import com.nt.comp.DHL;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;
import com.nt.comp.ICourier;

public class FlipkartFactory {

	public static Flipkart getInstance(String couriertype) {
		System.out.println("FlipkartFactory.getInstance()");

		ICourier courier;

		if (couriertype.equalsIgnoreCase("dhl")) {
			courier = new DHL();
		} else if (couriertype.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		} else if (couriertype.equalsIgnoreCase("bluedart")) {
			courier = new Bluedart();
		} else {
			throw new IllegalArgumentException("Invalid courier type");
		}

		Flipkart flipkart = new Flipkart();
		flipkart.setCourier(courier);
		return flipkart;
	}
}
