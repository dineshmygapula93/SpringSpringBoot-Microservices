package com.nt.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentOperationsController {

//	@GetMapping("/report")
//	public String process(@RequestParam("sno") int sno, @RequestParam(value ="sname",required=false) String sname) {
//		System.out.println(sno + " id and name " + sname);
//		return "display";
//	}
	
//	@GetMapping("/report")
//	public String process1(@RequestParam int sno, @RequestParam(defaultValue="dinesh") String sname) {
//		System.out.println(sno + " id and name " + sname);
//		return "display";
//	}
	
	
//	@GetMapping("/report")
//	public String process2(@RequestParam int sno, @RequestParam String sname) {
//		System.out.println(sno + " id and name " + sname);
//		return "display";
//	}
	
//		@GetMapping("/report")
//	public  String  process3(@RequestParam(name="sadd") String[] addrs,
//			                                           @RequestParam(name="sadd") List<String> addrsList,
//			                                           @RequestParam(name="sadd") Set<String> addrsSet) {
//		System.out.println(Arrays.toString(addrs)+"....."+addrsList+"......"+addrsSet);
//		
//		return "display";
//	}
	
	@GetMapping("/report")
	public  String  process5(@RequestParam(name="sadd") String addrs) {
		System.out.println(addrs);
		//return LVN
		return "display";
	}
}
