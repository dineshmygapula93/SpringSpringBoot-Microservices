package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer-api")
public class CustomerOperations {


	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer(){
		System.out.println("CustomerOperations.registerCustomer()");
		return new ResponseEntity<String>("For Inseration Operation",HttpStatus.OK);
	}

	@GetMapping("/report")
	public ResponseEntity<String> showReport(){
		System.out.println("CustomerOperations.showReport()");
		return new ResponseEntity<String>("For Read Operation",HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateCustomer(){
		System.out.println("CustomerOperations.updateCustomer()");
		return new ResponseEntity<String>("For update Operation",HttpStatus.OK);
	}

	@PatchMapping("/updateemail")
	public ResponseEntity<String> updateCustomeremail(){
		System.out.println("CustomerOperations.updateCustomeremail()");
		return new ResponseEntity<String>("For email update Operation",HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer(){
		System.out.println("CustomerOperations.deleteCustomer()");
		return new ResponseEntity<String>("For delete Operation",HttpStatus.OK);
	}
}
