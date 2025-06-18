package com.nt.serivce;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankAccount;
import com.nt.repository.BankAccountRepository;

@Service
public class BankmgmtService implements IBankmgmtService {

	@Autowired
	private BankAccountRepository bankrepo;

	@Override
	public String withDraw(long accountNo, Double amount) {
		Optional<BankAccount> opt = bankrepo.findById(accountNo);
		if (opt.isPresent()) {
			BankAccount account = opt.get();
			account.setBalance(account.getBalance() - amount);
			bankrepo.save(account);
			return amount + " amount is withdraw from the account number " + accountNo;
		}
		return " account is not found for withdraw";
	}

	@Override
	public String deposite(long accountNo, Double amount) {
		Optional<BankAccount> opt = bankrepo.findById(accountNo);
		if (opt.isPresent()) {
			BankAccount account = opt.get();
			account.setBalance(account.getBalance() + amount);
			bankrepo.save(account);
			return amount + " amount is deposited into the account number" + accountNo;
		}
		return " account is not found for deposite";
	}

	@Override
	public String openBankAccount(BankAccount account) {
		long Account = bankrepo.save(account).getAccNo();
		return "Opened account number " + Account;
	}

	@Override
	public BankAccount showAccountDetailsByAccountNo(long accno) {
		return bankrepo.findById(accno).orElseThrow(()->new IllegalArgumentException());
	}

}
