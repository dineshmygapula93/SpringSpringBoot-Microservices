package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PatchObjectTestRunner implements CommandLineRunner {
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {

		template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());

		String url = "http://localhost:9393/bootRestProject09-DoctorAPI/doctor-api/update/{id}/{percent}";

		ResponseEntity<String> resp = template.exchange(url, HttpMethod.PATCH, null, String.class, 23,20.0);
		System.out.println("response content ::" + resp.getBody());
		System.out.println("response status code ::" + resp.getStatusCode());

		System.exit(0);

	}

}
