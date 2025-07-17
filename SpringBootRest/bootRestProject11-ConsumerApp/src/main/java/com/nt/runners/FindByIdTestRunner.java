package com.nt.runners;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.BootRestProject11ConsumerAppApplication;
import com.nt.vo.DoctorVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class FindByIdTestRunner implements CommandLineRunner {

	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {

		String url = "http://localhost:9393/bootRestProject09-DoctorAPI/doctor-api/find/{id}";

//		ResponseEntity<String> response =template.getForEntity(url,String.class,23);
//		System.out.println("Response content ::"+response.getBody());
//		System.out.println("Response Status code ::"+response.getStatusCode	());
//		System.exit(0);

		String body = template.getForObject(url, String.class, 23);
		System.out.println("Response content ::" + body);

		ObjectMapper mapper = new ObjectMapper();
		DoctorVO vo = mapper.readValue(body, DoctorVO.class);
		System.out.println("Java Object data ::" + vo);
		System.exit(0);
	}
}
