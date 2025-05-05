package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wf")
public class WeekFinder {
	//@Qualifier("localDate")
	@Autowired
	private LocalDate localdate;

	public String showWeek() {
		int wno = localdate.getDayOfWeek().getValue();
		if (wno >= 1 && wno <= 5)
			return "Work hard ";
		else
			return "chill the weekend";
	}
}
