package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
	
	@Autowired
	private ICourier courier;

	public Flipkart() {
		System.out.println("Flipkart.Flipkart() :: 0-param");
	}

	public void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	public String Shopping(String[] items, Double[] prices) {

		System.out.println("Flipkart.Shopping()");
		double billAmt = 0;
		for (double p : prices) {
			billAmt += p;
		}

		int oid = new Random().nextInt(2000);
		String msg = courier.deliver(oid);

		String finalmsg = Arrays.toString(items) + " are purchased of amount " + Arrays.toString(prices)
				+ "   Total BillAMount : " + billAmt;

		return finalmsg;
	}

}
