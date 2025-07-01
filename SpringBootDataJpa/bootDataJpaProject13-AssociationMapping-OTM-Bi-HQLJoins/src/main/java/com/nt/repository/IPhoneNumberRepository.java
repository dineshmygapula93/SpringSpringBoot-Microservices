package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.PhoneNumber;

public interface IPhoneNumberRepository extends JpaRepository<PhoneNumber,Integer>{
	//@Query("select ph.regno,ph.phonenumber,ph.type,ph.provider,cust.cno,cust.cname,cust.caddr from PhoneNumber ph inner join ph.customer cust")
	@Query("select ph.regno,ph.phonenumber,ph.type,ph.provider,cust.cno,cust.cname,cust.caddr from PhoneNumber ph right join ph.customer cust")
	public List<Object []> fetchPhoneNumbersAndCustomersDataUsingJoins();
}
