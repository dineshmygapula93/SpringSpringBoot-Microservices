package com.nt.rest;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Season")
public class SeasonController {
	@GetMapping("/finder")
	public ResponseEntity<String> showmsg(){
		LocalDate ld=LocalDate.now();
		int month =ld.getMonthValue();
		String msg="";
		if(month >= 6 && month <= 12) {
			msg = "Rainy season";
		} else if(month >= 2 && month <= 5) {
			msg = "Summer season";
		}else {
			msg = "Winter season";
		}
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
