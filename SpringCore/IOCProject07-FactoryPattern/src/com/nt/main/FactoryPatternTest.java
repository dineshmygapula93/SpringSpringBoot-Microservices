package com.nt.main;

import com.nt.comp.ICar;
import com.nt.factory.FactoryCar;

public class FactoryPatternTest {
	public static void main(String args[]) {

		FactoryCar fc = new FactoryCar();
		ICar car = fc.createCar("SuperCar");
		String s=car.drive("Dinesh");
		System.out.println(s);
	}
}
