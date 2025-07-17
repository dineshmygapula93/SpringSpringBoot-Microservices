package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.DoctorVO;

//@Component
public class UpdateObjectTestRunner implements CommandLineRunner {
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {

		String url = "http://localhost:9393/bootRestProject09-DoctorAPI/doctor-api/update";

		DoctorVO vo = new DoctorVO(25, "rajesh", "orho", 660.0, "MD");
		ObjectMapper mapper = new ObjectMapper();
		String json_content = mapper.writeValueAsString(vo);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(json_content, headers);

		
		ResponseEntity<String> resp = template.exchange(url, HttpMethod.PUT, entity, String.class);
		System.out.println("response content ::" + resp.getBody());
		System.out.println("response status code ::" + resp.getStatusCode());

		System.exit(0);

	}

}
