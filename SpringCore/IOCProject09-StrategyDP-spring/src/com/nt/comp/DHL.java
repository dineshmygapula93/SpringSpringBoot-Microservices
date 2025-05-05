package com.nt.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("DHL")
public final class DHL implements ICourier {
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return oid + " order id is delivered using DHL courier Service";
	}
}
