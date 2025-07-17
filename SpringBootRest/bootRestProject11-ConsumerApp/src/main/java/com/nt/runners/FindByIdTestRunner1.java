package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.DoctorVO;
//@Component
public class FindByIdTestRunner1 implements CommandLineRunner {
	
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		
		String url = "http://localhost:9393/bootRestProject09-DoctorAPI/doctor-api/find/{id}";
		
		ResponseEntity<String> response =template.exchange(url,HttpMethod.GET,null,String.class,23);
		System.out.println("Response content ::"+response.getBody());
		System.out.println("Response Status code ::"+response.getStatusCode	());
		
		ObjectMapper mapper = new ObjectMapper();
		DoctorVO vo = mapper.readValue(response.getBody(), DoctorVO.class);
		System.out.println("Java Object data ::" + vo);
	}

}
