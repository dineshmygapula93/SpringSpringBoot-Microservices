package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingMSClient {

	@Autowired
	private DiscoveryClient client;

	@Value("${spring.application.instance}")
	public String instanceid;

	@Value("${server.port}")
	public String port;

	public String invokeDoBilling() {
		List<ServiceInstance> listsi = client.getInstances("bootMSProject03-BillingMS-Provider");
		
		
		URI baseuri = listsi.get(0).getUri();
		
		String endpoint = baseuri + "/Billing-MS/billing-api/bill";

		RestTemplate template = new RestTemplate();

		ResponseEntity<String> response = template.exchange(endpoint, HttpMethod.GET, null, String.class);

		return response.getBody();
	}
}
