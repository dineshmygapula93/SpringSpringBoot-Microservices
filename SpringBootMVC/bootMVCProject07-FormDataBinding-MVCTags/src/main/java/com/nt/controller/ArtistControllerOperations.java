package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Artist;

@Controller
public class ArtistControllerOperations {

	@GetMapping("/")
	public String showhome() {
		return "welcome";
	}

	@GetMapping("/register")
	public String showArtistRegistrationPage(@ModelAttribute("artist") Artist artist) {
		System.out.println("ArtistControllerOperations.showArtistRegistrationPage()"+artist);
		return "register";
	}

	@PostMapping("/register")
	public String registerArtistRegistrationPage(Map<String, Object> map, @ModelAttribute Artist artist) {

		System.out.println("Model class obj(form data)" + artist);
		if (artist.getFee() > 200000.0)
			map.put("msg", "expensive Actor");
		else
			map.put("msg", "Affordable Actor");
		return "result";
	}
}
