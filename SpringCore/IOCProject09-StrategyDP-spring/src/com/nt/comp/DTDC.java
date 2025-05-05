package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourier {
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid + " order id is delivered using DTDC courier Service";
	}
}
