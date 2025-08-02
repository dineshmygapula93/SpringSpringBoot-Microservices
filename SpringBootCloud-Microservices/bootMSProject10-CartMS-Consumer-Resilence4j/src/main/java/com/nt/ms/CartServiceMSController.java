package com.nt.ms;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingMSClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cart-api")
@Slf4j
public class CartServiceMSController {
	@Autowired
	private BillingMSClient comp;

	@GetMapping("/cart")
	@CircuitBreaker(name = "CartMs", fallbackMethod = "billingMsFallback")
	public ResponseEntity<String> cartOperation() {
		log.debug("cart method start");
		int oid = new Random().nextInt(10000);

		String items[] = new String[] { "shirt", "truoser" };

		String msg = Arrays.toString(items) + " are added to cart 	having order id " + oid;
		log.info("cart items add in the cart");
		String billamt = comp.invokeDoBilling();
		log.debug("cart method start");
		return new ResponseEntity<String>(msg + "....." + billamt, HttpStatus.OK);
	}
	
	public ResponseEntity<String> billingMsFallback(Throwable t){
		System.out.println("CartServiceMSController.billingMsFallback()");
		return new ResponseEntity<String>("The problem in invoking the billing ms",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
