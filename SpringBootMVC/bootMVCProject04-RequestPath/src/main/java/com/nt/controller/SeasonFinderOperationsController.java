package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinderService;

@Controller
@RequestMapping("/season")
public class SeasonFinderOperationsController {
	@Autowired
	private ISeasonFinderService seasonfinderservice;

	//@RequestMapping("/welcome")
	@RequestMapping
	public String showhome() {

		return "welcome";
	}

	@RequestMapping("/season")
	public String showSeason(Map<String, Object> map) {
		String season = seasonfinderservice.findSeason();
		map.put("resultmsg", season);
		return "display";
	}

//	@RequestMapping("/REPORT")
//	public String showreport() {
//		System.out.println("SeasonFinderOperationsController.showreport()");
//		return "show_report";
//	}

//	@RequestMapping("/report")
//	public String showreport1() {
//		System.out.println("SeasonFinderOperationsController.showreport()1");
//		return "show_report1";
//	}
	
//	@RequestMapping({"/report1","/report2","/report3"})
//	public String showreport2() {
//		System.out.println("SeasonFinderOperationsController.showreport()123");
//		return "show_report";
//	}
	
	
//	//@RequestMapping(value="report",method =RequestMethod.GET)
//	@GetMapping("/report")
//	public String showreportg() {
//		System.out.println("SeasonFinderOperationsController.showreport()123");
//		return "show_report";
//	}
	
//	//@RequestMapping(value="report",method =RequestMethod.POST)
//	@PostMapping("/report")
//	public String showreport() {
//		System.out.println("SeasonFinderOperationsController.showreport()123");
//		return "show_report";
//	}
	
//	@GetMapping("/report")
//	@PostMapping("/report")
//	public String showreportgp() {
//		System.out.println("SeasonFinderOperationsController.showreport()123");
//		return "show_report";
//	}
	
	
	//Ambiguty problem
//	@GetMapping("/report")
//	public String showreportgg() {
//		System.out.println("SeasonFinderOperationsController.showreport()123");
//		return "show_report";
//	}
//	
	@GetMapping("/report")
	public String showreportgg1() {
		System.out.println("SeasonFinderOperationsController.showreport()123");
		return "redirect:/test/report";
	}
}
