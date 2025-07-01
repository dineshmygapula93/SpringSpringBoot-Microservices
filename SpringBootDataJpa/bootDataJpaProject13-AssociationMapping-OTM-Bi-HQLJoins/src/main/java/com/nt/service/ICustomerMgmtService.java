package com.nt.service;

import java.util.List;

public interface ICustomerMgmtService {
	public List<Object[]> showCustomersAndPhoneNumbersUsingJoins();

	public List<Object[]> showPhoneNumbersAndCustomersUsingJoins();
}
