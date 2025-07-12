package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer-api")
public class CustomerOperationsController {
	
//	@GetMapping("/report")
//	public ResponseEntity<String> showReport(@RequestParam("cno") int cno,@RequestParam("cname") String cname){
//	System.out.println("CustomerOperationsController.showReport() ::"+cno+"..."+cname);
//	return new ResponseEntity<String>(cno+"....."+cname,HttpStatus.OK);
//	}
	
//	@GetMapping("/report")
//	public ResponseEntity<String> showReport(int cno,String cname){
//	System.out.println("CustomerOperationsController.showReport() ::"+cno+"..."+cname);
//	return new ResponseEntity<String>(cno+"....."+cname,HttpStatus.OK);
//	}
	
	
	@GetMapping("/report")
	public ResponseEntity<String> showReport(@RequestParam(required=false,defaultValue = "111") int cno,@RequestParam(required=false,defaultValue = "rajesh") String cname){
	System.out.println("CustomerOperationsController.showReport() ::"+cno+"..."+cname);
	return new ResponseEntity<String>(cno+"....."+cname,HttpStatus.OK);
	}
}
