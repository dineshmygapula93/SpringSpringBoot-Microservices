package com.nt.core;

import java.util.Date;
import java.util.Optional;

public class OptionalAPITest {

	public static Date showDatebyMonth(int month) {
		if (month > 12 || month < 1) {
			return null;
		} else {
			Date d = new Date();
			d.setMonth(month);
			return d;
		}
	}

	public static Optional<Date> showDatebyMonth1(int month) {
		if (month > 12 || month < 1) {
			return Optional.empty();
		} else {
			Date d = new Date();
			d.setMonth(month);
			return Optional.of(d);
		}
	}

	public static void main(String[] args) {
//			Date d=OptionalAPITest.showDatebyMonth(-11);

//			System.out.println("The month is "+d.getMonth());

		Optional<Date> opt = showDatebyMonth1(-10);

		if (opt.isPresent()) {
			Date d = opt.get();
			System.out.println("The sysdate ::" + d);
		} else {
			System.out.println("Wrong Month");
		}

	}

}
