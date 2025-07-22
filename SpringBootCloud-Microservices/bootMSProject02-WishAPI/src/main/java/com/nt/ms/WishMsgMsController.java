package com.nt.ms;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishMsgMsController {
	
	@Value("${spring.application.instance-id}")
	private String instanceid;
	
	@GetMapping("/display")
	public ResponseEntity<String> showWishMessage(){
		LocalDateTime ldt=LocalDateTime.now();
		
		int hour =ldt.getHour();
		
		String msg=null;
		
		if(hour <12) {
			msg ="Good Morning ";
		}else if(hour <16) {
			msg="Good Afternoon";
		}else if(hour <20){
			msg ="Good Evening";
		}else {
			msg ="Good night";
		}
		return new ResponseEntity<String>(msg+"--------->"+instanceid,HttpStatus.OK);
	}
}
