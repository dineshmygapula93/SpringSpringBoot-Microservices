package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer ,Integer> {

}
