package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Artist;
@Controller
public class DataRenderingOperationsController {

	@GetMapping("/process")
	public String showData(Map<String, Object> map) {

		map.put("name", "Dinu");
		map.put("age", 26);

		map.put("favColors", new String[] { "red", "yellow", "green" });
		map.put("friends", List.of("raja", "rani", "chary"));
		map.put("phones", Set.of(999999L, 54545454L, 54554544L));
		map.put("idDetails", Map.of("aadhar", 565656, "voterid", 5464646, "panNo", 565656));

		Artist artist1 = new Artist(1001, "Dinesh", "hyd", 89991.0);
		map.put("artistData", artist1);

		Artist artist2 = new Artist(1004, "Sai", "vizag", 89991.0);
		Artist artist3 = new Artist(1002, "Sri", "delhi", 19991.0);
		map.put("artistList", List.of(artist1, artist2, artist3));

		return "show_report";
	}
}
