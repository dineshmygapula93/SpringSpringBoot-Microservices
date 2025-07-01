package com.nt.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;
import com.nt.repository.ICustomerRepository;
import com.nt.repository.IPhoneNumberRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerMgmtService implements ICustomerMgmtService {
	@Autowired
	private ICustomerRepository custrepo;
	@Autowired
	private IPhoneNumberRepository phonerepo;
	@Override
	public List<Object[]> showCustomersAndPhoneNumbersUsingJoins() {
		return custrepo.fetchCustomersAndPhoneNumbersDataUsingJoins();
	}
	@Override
	public List<Object[]> showPhoneNumbersAndCustomersUsingJoins() {
		return phonerepo.fetchPhoneNumbersAndCustomersDataUsingJoins();
	}

	}
