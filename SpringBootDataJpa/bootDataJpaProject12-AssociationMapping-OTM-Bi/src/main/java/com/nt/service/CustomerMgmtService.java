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
	public String registerCustomerWithPhoneNumbers(Customer customer) {
		int idvalue = custrepo.save(customer).getCno();
		return "Customer and phonenumbers saved with id " + idvalue;
	}

	@Override
	public String registerPhoneNumbersWithCustomer(List<PhoneNumber> list) {
		List<PhoneNumber> savedlist = phonerepo.saveAll(list);
		List<Integer> ids = savedlist.stream().map(PhoneNumber::getRegno).collect(Collectors.toList());
		return savedlist.size() + " no of phones are saved with ids values" + ids;
	}

	@Override
	public List<Customer> showCustomerWithPhoneNumbers() {
		return custrepo.findAll();
	}

	@Override
	public List<PhoneNumber> showPhoneNumberwithCustomer() {
		return phonerepo.findAll();
	}

	@Override
	public String removeCustomerWithPhoneNumber(int cno) {
		Customer custr = custrepo.findById(cno).orElseThrow(() -> new IllegalArgumentException("Invalid id"));
		custrepo.delete(custr);
		return cno + " Customer with phone number is deleted";
	}

	@Override
	public String removePhoneNumberWithCustomer(List<Integer> ids) {
		List<PhoneNumber> listphr = phonerepo.findAllById(ids);
		if (listphr.size() != 0) {
			phonerepo.deleteAllByIdInBatch(ids);
			return listphr.size() + " no of  phone number with Customer  is deleted";
		} else {
			return "Phone numbers are not found";	
		}
	}

	@Override
	public String removeAllPhoneNumberOfACustomer(int id) {
		Customer custrp =custrepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		Set<PhoneNumber> setphonechilds = custrp.getPhones();
		setphonechilds.forEach(ph->{
			ph.setCust(null);
		});
		phonerepo.deleteAllInBatch(setphonechilds);
		return id+" Customer All phone numbers are deleted";
	}

	@Override
	@Transactional
	public String removeOnePhoneNumberOfCustomer(int regno) {
		//Customer custone =custrepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		
		PhoneNumber phoneone =phonerepo.findById(regno).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		phoneone.setCust(null);
		
		phonerepo.save(phoneone);
		phonerepo.delete(phoneone);
		return phoneone.getPhonenumber()+" of customer  is deleled";
	}

	@Override
	@Transactional
	public String addNewPhoneNumberToCustomer(int cno, PhoneNumber ph) {
		Customer custo =custrepo.findById(cno).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		Set<PhoneNumber> childs =custo.getPhones();
		childs.add(ph);
		ph.setCust(custo);
		phonerepo.save(ph);
		custrepo.save(custo);
		return ph.getPhonenumber()+" Phone Number is added to customer number"+cno;
	}

	@Override
	public String removePhoneNumberAndTheirCustomers(int cno) {
	
		Customer  cust=custrepo.findById(cno).orElseThrow(()-> new IllegalArgumentException("invalid id"));
		
		Set<PhoneNumber> childs=cust.getPhones();
		
		childs.forEach(ph->{
			phonerepo.delete(ph);
		});
	 	return childs.size()+"  no.of  PhoneNumbers and their associated Customer is deleted";
	}

}
