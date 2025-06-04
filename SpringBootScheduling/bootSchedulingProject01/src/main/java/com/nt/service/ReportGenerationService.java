package com.nt.service;


import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportGenerationService {
	
//	@Scheduled(initialDelay=10000, fixedDelay =3000)
//	public void showReport() {
//		System.out.println("Report on ::"+new Date()+"Thread info "+Thread.currentThread().getName());
//	}
//	
//	
//	  @Scheduled(fixedDelay =3000) public void showReport1() {
//	  System.out.println("Report on 1 ::"+new Date()+"Thread info "+Thread.currentThread().getName());
//	  }
	 	
	
	
//	@Scheduled(fixedDelayString ="3000")
//	public void showReport2() {
//		System.out.println("Report on 2 ::"+new Date());
//	}
	
	
	
//	@Scheduled(fixedDelayString ="3000")
//	public void showReport3() {
//		System.out.println("Report on 2 started::"+new Date());
//		try {
//			Thread.sleep(10000);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Report on 2 ended::"+new Date());
//	}
	  
//	  @Scheduled(fixedRate =10000) public void showReport4() {
//		  System.out.println("Report on 2 started::"+new Date());
//			try {
//				Thread.sleep(15000);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//			System.out.println("Report on 2 ended::"+new Date());
//		  }
	
	
	
	//@Scheduled(cron="15 * * * * *")
	//@Scheduled(cron="* 16 * * * * ")
	//@Scheduled(cron="* 21 17 * * * ")
	@Scheduled(cron="0/20 * * * * *")
	public void showReport5() {
		System.out.println("Report on 5 ::"+new Date());
	}
	
	
	
/*
	    // Every Few Seconds / Minutes
	    @Scheduled(cron = "0/10 * * * * ?") // Every 10 seconds
	    @Scheduled(cron = "0/20 * * * * ?") // Every 20 seconds
	    @Scheduled(cron = "0 0/1 * * * ?")  // Every 1 minute
	    @Scheduled(cron = "0 0/5 * * * ?")  // Every 5 minutes

	    // Hourly / Between Hours
	    @Scheduled(cron = "0 0 * * * ?")         // Every hour
	    @Scheduled(cron = "0 0 9-17 * * ?")      // Every hour from 9 AM to 5 PM
	    @Scheduled(cron = "0 0/30 9-17 * * ?")   // Every 30 mins during work hours

	    // Daily
	    @Scheduled(cron = "0 0 0 * * ?")     // Midnight daily
	    @Scheduled(cron = "0 30 6 * * ?")    // 6:30 AM daily
	    @Scheduled(cron = "0 0 23 * * ?")    // 11 PM daily

	    // Weekly
	    @Scheduled(cron = "0 0 10 ? * MON")      // Every Monday at 10 AM
	    @Scheduled(cron = "0 0 9 ? * MON-FRI")   // Weekdays at 9 AM
	    @Scheduled(cron = "0 0 12 ? * SUN")      // Every Sunday at noon

	    // Monthly
	    @Scheduled(cron = "0 0 0 1 * ?")     // First day of month at midnight
	    @Scheduled(cron = "0 0 10 L * ?")    // Last day of month at 10 AM
	    @Scheduled(cron = "0 0 8 15 * ?")    // 15th of each month at 8 AM

	    // Advanced
	    @Scheduled(cron = "0 0 10 ? * 6L")     // Last Friday of the month at 10 AM
	    @Scheduled(cron = "0 0 10 ? * MON#2")  // 2nd Monday of the month at 10 AM
	    @Scheduled(cron = "0 0 0 1 1 ?")       // January 1st every year at midnight

	    // With Timezone
	    @Scheduled(cron = "0 0 9 * * ?", zone = "Asia/Kolkata") // Every day 9 AM IST
	    
*/	
	

		 	
}
