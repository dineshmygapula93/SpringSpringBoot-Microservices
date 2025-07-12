package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer-api")
public class CustomerOperationsController {

//	@GetMapping("/report/{cno}/{cname}")
//	public ResponseEntity<String> showReport(@PathVariable("cno") int cno, @PathVariable("cname") String cname) {
//		System.out.println("CustomerOperationsController.showReport() ::" + cno + "..." + cname);
//		return new ResponseEntity<String>(cno + "....." + cname, HttpStatus.OK);
//	}

//	@GetMapping("/report/{cno}/{cname}")
//	public ResponseEntity<String> showReport(@PathVariable int cno, @PathVariable String cname) {
//		System.out.println("CustomerOperationsController.showReport() ::" + cno + "..." + cname);
//		return new ResponseEntity<String>(cno + "....." + cname, HttpStatus.OK);
//	}

	// @GetMapping({"/report/{cno}/{cname}","/report/{cno}","/report"})
	@GetMapping("/report/{cno}/{cname}")
	public ResponseEntity<String> showReport(@PathVariable(required = false) Integer cno,
			@PathVariable(required = false) String cname, @RequestParam String addr) {
		System.out.println("CustomerOperationsController.showReport() ::" + cno + "..." + cname + "..."+addr);
		return new ResponseEntity<String>(cno + "....." + cname +"..."+addr, HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{cno}/{cname}")
	public ResponseEntity<String> deleteCustomer(@PathVariable(required = false) Integer cno,
			@PathVariable(required = false) String cname, @RequestParam String addr) {
		System.out.println("CustomerOperationsController.deleteCustomer() ::" + cno + "..." + cname + "..."+addr);
		return new ResponseEntity<String>(cno + "....." + cname +"..."+addr, HttpStatus.OK);
	}
}
