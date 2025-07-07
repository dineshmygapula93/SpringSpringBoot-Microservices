package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinderService;

@Controller
public class SeasonFinderOperationsController {
	@Autowired
	private ISeasonFinderService seasonfinderservice;

	@RequestMapping("/welcome")
	public String showhome() {

		return "welcome";
	}

	@RequestMapping("/season")
	public String showSeason(Map<String ,Object> map) {
		String season =seasonfinderservice.findSeason();
		map.put("resultmsg",season);
		return "display";
	}
}
