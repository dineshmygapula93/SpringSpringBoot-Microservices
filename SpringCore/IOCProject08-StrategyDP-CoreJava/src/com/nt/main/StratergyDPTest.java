package com.nt.main;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StratergyDPTest {
	public static void main(String args[]) {
		Flipkart fkpt = FlipkartFactory.getInstance("dhl");

		String msg = fkpt.Shopping(new String[] { "T-shirt", "Cap", "shoes" }, new Double[] { 233.3, 323.56, 424.43 });

		System.out.println(msg);

		System.out.println("==========================");
		
		
	}
}
