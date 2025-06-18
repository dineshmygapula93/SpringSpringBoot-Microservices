package com.nt.serivce;

import com.nt.entity.BankAccount;

public interface IBankmgmtService {

	public String withDraw(long accountNo,Double amount);
	
	public String deposite(long accountNo,Double amount);
	
	public String openBankAccount(BankAccount account);
	
	public BankAccount showAccountDetailsByAccountNo(long accno);
}
