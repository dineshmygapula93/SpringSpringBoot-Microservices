package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestControllerOperations {

	@GetMapping("/report")
	public String showreportgg1() {
	System.out.println("TestControllerOperations.showreportgg1()");
		return "show_report1";
	}
}
