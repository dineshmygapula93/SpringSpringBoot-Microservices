package com.nt.comp;

public final class Bluedart implements ICourier {
	public String deliver(int oid) {
		System.out.println("Bluedart.deliver()");
		return oid + " order id is delivered using Bluedart courier Service";
	}
}
