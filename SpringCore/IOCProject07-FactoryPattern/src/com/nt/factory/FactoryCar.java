package com.nt.factory;

import com.nt.comp.ICar;
import com.nt.comp.LuxuryCar;
import com.nt.comp.StandardCar;
import com.nt.comp.SuperCar;

public class FactoryCar {
	
	public ICar createCar(String type) {
		ICar car=null;
		if(type.equalsIgnoreCase("luxury")) {
			car=new LuxuryCar();
		}else if(type.equalsIgnoreCase("SuperCar")) {
			car=new SuperCar();
		}else if(type.equalsIgnoreCase("Standard")) {
			car=new StandardCar();
		}else {
			car=null;
		}
		
		return car;
	}
}
