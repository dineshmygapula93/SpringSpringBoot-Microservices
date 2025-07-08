package com.nt.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinderService implements ISeasonFinderService {

	@Override
	public String findSeason() {
		LocalDate ldt = LocalDate.now();

		int month = ldt.getMonthValue();

		if (month >= 3 && month <= 6) {
			return "Summer season";
		} else if (month >= 7 && month <= 9) {
			return "Rainy Season";
		} else {
			return "Winter Season";
		}
	}

}
