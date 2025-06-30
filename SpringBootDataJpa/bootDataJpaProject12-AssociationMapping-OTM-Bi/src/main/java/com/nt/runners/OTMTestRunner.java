package com.nt.runners;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;
import com.nt.service.ICustomerMgmtService;

@Component
public class OTMTestRunner implements CommandLineRunner {
	@Autowired
	private ICustomerMgmtService custservice;

	@Override
	public void run(String... args) throws Exception {

//		try {
//			Customer cust = new Customer("dinesh1", "hyd1");
//
//			PhoneNumber ph1 = new PhoneNumber(888888881L, "Airtel1", "Personal1");
//			PhoneNumber ph2 = new PhoneNumber(99999991L, "vi1", "office1");
//
//			ph1.setCust(cust);
//			ph2.setCust(cust);
//
//			cust.setPhones(Set.of(ph1, ph2));
//
//			String msg = custservice.registerCustomerWithPhoneNumbers(cust);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			PhoneNumber ph11 =new PhoneNumber(7777777777L,"Airtel","office");
//			PhoneNumber ph12 =new PhoneNumber(8888888888L,"jio","personel");
//			
//			Customer cust1 =new Customer("sai","hyd");
//			
//			ph11.setCust(cust1);
//			ph12.setCust(cust1);
//			
//			Set<PhoneNumber> childset =new HashSet();
//			childset.add(ph11);
//			childset.add(ph12);
//			
//			cust1.setPhones(childset);
//			List<PhoneNumber> list =Arrays.asList(ph11,ph12);
//			
//			String msg=custservice.registerPhoneNumbersWithCustomer(list);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			List<Customer> custlist =custservice.showCustomerWithPhoneNumbers();
//			
//			custlist.forEach(cust->{
//				System.out.println("Parent ::"+cust);
//				Set<PhoneNumber> childset =cust.getPhones();
//				childset.forEach(ph->{
//					System.out.println("child ::"+ph);
//				});
//				System.out.println("===================");
//			});
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			List<PhoneNumber> phonelist =custservice.showPhoneNumberwithCustomer();
//			phonelist.forEach(phn->{
//				System.out.println("childs ::"+phn);
//				Customer cust =phn.getCust();
//				System.out.println("Parents ::"+cust);
//				System.out.println("==================");
//			});
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			String msgd = custservice.removeCustomerWithPhoneNumber(1);
//			System.out.println(msgd);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			String msdpd = custservice.removePhoneNumberWithCustomer(List.of(1002, 1003));
//			System.out.println(msdpd);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			String msg =custservice.removeAllPhoneNumberOfACustomer(4);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			String msgone =custservice.removeOnePhoneNumberOfCustomer(1002);
//			System.out.println(msgone);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			PhoneNumber ph4 = new PhoneNumber();
//			ph4.setPhonenumber(66666666666L);
//			ph4.setProvider("Airtel");
//			ph4.setType("office");
//			
//			String msgadd =custservice.addNewPhoneNumberToCustomer(4, ph4);
//			System.out.println(msgadd);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			String  msg=custservice.removePhoneNumberAndTheirCustomers(4);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
