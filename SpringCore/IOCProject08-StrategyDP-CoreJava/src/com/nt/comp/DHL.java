package com.nt.comp;

public final class DHL implements ICourier {
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return oid + " order id is delivered using DHL courier Service";
	}
}
