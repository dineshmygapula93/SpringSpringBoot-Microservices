package com.nt.ms;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingMSClient;

@RestController
@RequestMapping("/cart-api")
public class CartServiceMSController {
	@Autowired
	private BillingMSClient comp;
	@Value("${db.user}")
	private String dbuser;
	@Value("${db.password}")
	private String dbpassword;

	@GetMapping("/cart")
	public ResponseEntity<String> cartOperation() {

		int oid = new Random().nextInt(10000);

		String items[] = new String[] { "shirt", "truoser" };

		String msg = Arrays.toString(items) + " are added to cart 	having order id " + oid;

		String billamt = comp.invokeDoBilling();
		return new ResponseEntity<String>(msg + "....." + billamt+" ......db user "+dbuser+".........."+dbpassword, HttpStatus.OK);
	}
}
