package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("bluedart")
public final class Bluedart implements ICourier {
	public String deliver(int oid) {
		System.out.println("Bluedart.deliver()");
		return oid + " order id is delivered using Bluedart courier Service";
	}
}
