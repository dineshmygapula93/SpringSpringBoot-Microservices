package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.DoctorVO;
//@Component
public class FindAllTestRunner2 implements CommandLineRunner {
	
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		
		String url = "http://localhost:9393/bootRestProject09-DoctorAPI/doctor-api/all";
		
		ResponseEntity<String> response =template.exchange(url,HttpMethod.GET,null,String.class);
		System.out.println("Response content ::"+response.getBody());
		System.out.println("Response Status code ::"+response.getStatusCode	());
		
		ObjectMapper mapper = new ObjectMapper();
		List<DoctorVO> list=mapper.readValue(response.getBody(), new TypeReference<List<DoctorVO>>() {});
		System.out.println("Java List data ::" + list);
		System.exit(0);
	}

}
