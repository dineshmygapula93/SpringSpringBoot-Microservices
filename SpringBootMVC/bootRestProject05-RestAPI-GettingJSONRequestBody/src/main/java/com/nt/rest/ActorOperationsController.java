package com.nt.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.ActorDetails;
import com.nt.model.Address;

@RestController
@RequestMapping("/Actor-api")
public class ActorOperationsController {
	@PostMapping("/registeraddr")
	public ResponseEntity<String> registorAddress(@RequestBody Address addr) {
		System.out.println("Adress ::" + addr);
		return new ResponseEntity<String>("model class obj" + addr, HttpStatus.OK);
	}
	
	@PostMapping("/registeractor")
	public ResponseEntity<String> registorActor(@RequestBody ActorDetails actordetails) {
		System.out.println("Actor ::" +actordetails);
		return new ResponseEntity<String>("model class obj" + actordetails, HttpStatus.OK);
	}
	
	@PostMapping("/addrlist")
	public ResponseEntity<String> registorAddresslist(@RequestBody List<Address> addrlist) {
		System.out.println("Address ::"+addrlist);
		return new ResponseEntity<String>("model class obj" + addrlist, HttpStatus.OK);
	}
}
