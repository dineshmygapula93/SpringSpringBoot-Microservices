package com.nt.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Showreport {
	
	@Scheduled(cron ="0/10 * * * * *")
	public void showreport() {
		System.out.println("Showreport.showreport() "+new Date());
	}
}
