package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingMSClient {

	@Autowired
	private LoadBalancerClient client;

	@Value("${spring.application.instance}")
	public String instanceid;

	@Value("${server.port}")
	public String port;

	public String invokeDoBilling() {
		ServiceInstance instance = client.choose("bootMSProject04-BillingMS-Provider");
		System.out.println("Load Balancer client obj class name "+client.getClass());
		URI baseuri = instance.getUri();

		String endpoint = baseuri + "/Billing-MS/billing-api/bill";

		RestTemplate template = new RestTemplate();

		ResponseEntity<String> response = template.exchange(endpoint, HttpMethod.GET, null, String.class);

		return response.getBody();
	}
}
