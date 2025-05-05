package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	
	@Autowired
	public LocalDate date;
	
	public String seasonFinder() {
	
	int month =date.getMonthValue();
	
	if(month >= 3 && month <=6) {
	return "Summer season"	;
	}
	else if(month >=7 && month <=11){
		return "Rainy season";
	}else
		return "Winter season";
	}
}
