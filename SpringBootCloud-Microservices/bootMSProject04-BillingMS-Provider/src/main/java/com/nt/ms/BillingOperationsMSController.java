package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingOperationsMSController {

	@Value("${spring.application.instance}")
	public String instanceid;

	@Value("${server.port}")
	public String port;

	@GetMapping("/bill")
	public ResponseEntity<String> doBilling() {

		double billamount=0;
		try {
			billamount = new Random().nextDouble(1000000.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>(
				"Bill Amount ::" + billamount + " ..... Instance id " + instanceid + "....port " + port, HttpStatus.OK);
	}
}
