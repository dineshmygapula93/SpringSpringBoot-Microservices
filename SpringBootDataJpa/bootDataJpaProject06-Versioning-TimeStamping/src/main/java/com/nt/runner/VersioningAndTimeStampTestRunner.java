package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BankAccount;
import com.nt.serivce.IBankmgmtService;

@Component
public class VersioningAndTimeStampTestRunner implements CommandLineRunner {

	@Autowired
	private IBankmgmtService bankservice;

	@Override
	public void run(String... args) throws Exception {
		
//		try {
//			BankAccount account=new BankAccount();
//			account.setBalance(10000.00);
//			account.setType("savings");
//			account.setAccountHolderName("Dinesh mygapula");
//			String msg=bankservice.openBankAccount(account);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		
//		try {
//			String msgw=bankservice.withDraw(10002L, 3500.00);
//			System.out.println(msgw);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			String msgw=bankservice.withDraw(10002L, 500.00);
			System.out.println(msgw);
			BankAccount bankaccount =bankservice.showAccountDetailsByAccountNo(10002L);
			System.out.println("Account is modified for  "+bankaccount.getUpdatecount());
			System.out.println("Account opened on ::"+bankaccount.getAccountopenedOn());
			System.out.println("Account is last opened on ::"+bankaccount.getLastoperationOn());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
