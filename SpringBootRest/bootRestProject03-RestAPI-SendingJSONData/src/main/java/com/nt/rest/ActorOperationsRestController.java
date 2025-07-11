package com.nt.rest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.ActorDetails;
import com.nt.model.Address;

@RestController
@RequestMapping("/ActorOperations-api")
public class ActorOperationsRestController {

	@GetMapping("/addr")
	public ResponseEntity<Address> showAddressDetails() {
		System.out.println("ActorOperationsRestController.showAddressDetails()");
		Address address = new Address("2-22", "Sivalayam", "Mattaparru", 53000l);
		return new ResponseEntity<Address>(address, HttpStatus.OK);
	}

	@GetMapping("/actordetails")
	public ResponseEntity<ActorDetails> showactorDetails() {
		ActorDetails actordetails = new ActorDetails();
		Address address = new Address("2-22", "Sivalayam", "Mattaparru", 53000l);
		actordetails.setAid(101);
		actordetails.setAname("pawan");
		actordetails.setDob(LocalDate.of(1970, 9, 02));
		actordetails.setTob(LocalTime.of(06, 6));
		actordetails.setMobilenumber(888888888l);
		actordetails.setLaunchdatatime(LocalDateTime.of(1998, 7, 02, 10, 3));
		actordetails.setFavColor(new String[] { "red", "green", "blue" });
		actordetails.setFriends(List.of("Trivikram", "dinesh"));
		actordetails.setPhoneNumber(Set.of(99999998l, 9999988l));
		actordetails.setSingle(false);
		actordetails.setIdDetails(Map.of("voterid", 4333l, "Rationid", 533553));
		actordetails.setAddress(address);

		HttpHeaders header = new HttpHeaders();
		header.add("location", "hyd");
		return new ResponseEntity<ActorDetails>(actordetails, header, HttpStatus.OK);
	}

//	@GetMapping("/actordetails")
//	public ActorDetails showactorDetails(){
//		ActorDetails actordetails =new ActorDetails();
//		Address address=new Address("2-22","Sivalayam","Mattaparru",53000l);
//		actordetails.setAid(101);
//		actordetails.setAname("pawan");
//		actordetails.setDob(LocalDate.of(1970, 9, 02));
//		actordetails.setTob(LocalTime.of(06,6));
//		actordetails.setMobilenumber(888888888l);
//		actordetails.setLaunchdatatime(LocalDateTime.of(1998,7, 02,10,3));
//		actordetails.setFavColor(new String[]{"red","green","blue"});
//		actordetails.setFriends(List.of("Trivikram", "dinesh"));
//		actordetails.setPhoneNumber(Set.of(99999998l,9999988l));
//		actordetails.setSingle(false);
//		actordetails.setIdDetails(Map.of("voterid",4333l,"Rationid",533553));
//		actordetails.setAddress(address);
//		return actordetails;
//	}
	@GetMapping("/addresslist")
	public ResponseEntity<List<Address>> showAllAddresslist() {
		Address address1 = new Address("2-22", "Sivalayam", "Mattaparru", 53000l);
		Address address2 = new Address("2-23", "Sivalayam1", "Mattaparr1", 53400l);
		Address address3 = new Address("2-24", "Sivalayam2", "Mattaparru2", 53300l);
		return new ResponseEntity<List<Address>>(List.of(address1, address2, address3), HttpStatus.OK);
	}
}
