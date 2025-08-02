package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/billing-api")
@ConfigurationProperties(prefix = "org.nit")
@Slf4j
public class BillingOperationsMSController {

	@Value("${spring.application.instance}")
	public String instanceid;

	@Value("${server.port}")
	public String port;

	private String name;
	private String addrs;
	private long pincode;

	@GetMapping("/bill")
	public ResponseEntity<String> doBilling() {
		log.debug("Start of billing method");
		double billamount = new Random().nextDouble(1000000.0);
		log.info("Billing amount is generated");
		log.debug("Result is generateds");
		return new ResponseEntity<String>(
				"Bill Amount ::" + billamount + " ..... Instance id " + instanceid + "....port " + port, HttpStatus.OK);
	}
}
