package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BankOperationsController {
	
	@GetMapping("/")
	public String showHome() {
		return "welcome";
	}
	
	@GetMapping("/balance")
	public String showBalance(Map<String ,Object> map) {
		double amount =new Random().nextDouble(10000121.0);
		map.put("balance", amount);
		return "show_balance";
	}
	
	@GetMapping("/offers")
	public String showOffer(Map<String,Object> map) {
		map.put("homeloan", "7%");
		map.put("Carloan", "10%");
		map.put("goldloan","3%");
		return "show_offers";
	}
	@GetMapping("/loan")
	public String showLoan() {
		return "show_loan";
	}
	@GetMapping("/denied")
	public String showDenied() {
		return "access_denied";
	}
}
