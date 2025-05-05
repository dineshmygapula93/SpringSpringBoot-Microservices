package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	// Direct value injection
	@Value("100")
	private int cno;
//  injecting the values  from properties file
	@Value("${cust.name}")
	private String name;
	@Value("${cust.address}")
	private String address;
	@Value("${cust.Billamt}")
	private Double BillAmount;
	// injecting the system property values
	@Value("${os.name}")
	private String os;
	@Value("${os.version}")
	private String version;

	// injecting env variable values
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", name=" + name + ", address=" + address + ", BillAmount=" + BillAmount
				+ ", os=" + os + ", version=" + version + ", pathData=" + pathData + "]";
	}

}
