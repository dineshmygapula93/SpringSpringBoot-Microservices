package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;

public interface ICustomerMgmtService {
	public String registerCustomerWithPhoneNumbers(Customer customer);

	public String registerPhoneNumbersWithCustomer(List<PhoneNumber> list);

	public List<Customer> showCustomerWithPhoneNumbers();

	public List<PhoneNumber> showPhoneNumberwithCustomer();

	public String removeCustomerWithPhoneNumber(int cno);

	public String removePhoneNumberWithCustomer(List<Integer> ids);

	public String removeAllPhoneNumberOfACustomer(int id);

	public String removeOnePhoneNumberOfCustomer(int regno);
	
	public String addNewPhoneNumberToCustomer(int cno,PhoneNumber ph);
	
	public String removePhoneNumberAndTheirCustomers(int cno);
}
