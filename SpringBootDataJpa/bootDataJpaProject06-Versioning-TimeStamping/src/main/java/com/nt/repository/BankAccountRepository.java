package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {

}
