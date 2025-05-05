package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime localtime;
	private LocalDate localdate;
	public WishMessageGenerator(LocalTime localtime, LocalDate localdate) {
		this.localtime = localtime;
		this.localdate = localdate;
		System.out.println("2 param constructor");
	}
	
	public String showWishMessage(String user) {
		 System.out.println("I am wish message method");
		 int hour=localtime.getHour();
		 if(hour<12)
			 return "good morning "+user;
		 else if(hour<16)
			 return "good afternoon "+user;
		 else if(hour<18)
			 return "good evening "+user;
		 else 
			 return "goog night "+user;
	 }
	 	public String showSeason() {
	 		int month=localdate.getMonthValue();
	 		if(month<2)
	 			 return"Winter Season ";
	 		 else if(month<6)
	 			 return "Summer Season ";
	 		 else if(month<9)
	 			 return "Rainy";
	 		 else 
	 			 return "Winter Season";
	 	}
	}
