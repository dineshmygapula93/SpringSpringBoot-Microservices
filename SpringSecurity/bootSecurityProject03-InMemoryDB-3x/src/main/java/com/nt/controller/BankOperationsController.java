package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankOperationsController {

	@GetMapping("/")
	public ResponseEntity<String> showHome() {
		return new ResponseEntity<String>("welcome page", HttpStatus.OK);
	}

	@GetMapping("/balance")
	@PreAuthorize("hasAnyAuthority('MANAGER','CUSTOMER')") 
	public ResponseEntity<String> showBalance() {
		double amount = new Random().nextDouble(10000121.0);
		return new ResponseEntity<String>("balance page balancd :" + amount, HttpStatus.OK);
	}

	@GetMapping("/offers")
	public ResponseEntity<String> showOffer(Map<String, Object> map) {
		map.put("homeloan", "7%");
		map.put("Carloan", "10%");
		map.put("goldloan", "3%");
		return new ResponseEntity<String>("offers page " + map, HttpStatus.OK);
	}

	@GetMapping("/loan")
	@PreAuthorize("hasAuthority('Manager')")
	public ResponseEntity<String> showLoan() {
		return new ResponseEntity<String>("loan page ", HttpStatus.OK);
	}

	@GetMapping("/denied")
	public ResponseEntity<String> showDenied() {
		return new ResponseEntity<String>("denied page ", HttpStatus.OK);
	}
}
