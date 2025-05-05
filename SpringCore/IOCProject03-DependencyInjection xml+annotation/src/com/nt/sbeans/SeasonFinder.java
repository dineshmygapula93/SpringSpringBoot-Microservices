package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	private LocalDate localdate;

	public LocalDate getLocaldate() {
		return localdate;
	}
	@Autowired
	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
		System.out.println("i am set method");
	}

	public String showSeason() {
		int month = localdate.getMonthValue();
		if (month < 2)
			return "Winter Season ";
		else if (month < 6)
			return "Summer Season ";
		else if (month < 9)
			return "Rainy";
		else
			return "Winter Season";
	}
}
