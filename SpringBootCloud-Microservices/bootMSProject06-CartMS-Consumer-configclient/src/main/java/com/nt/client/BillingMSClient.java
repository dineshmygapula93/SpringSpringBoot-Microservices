package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("bootMSProject06-BillingMS-Provider")
public interface BillingMSClient {
	
	@GetMapping("/Billing-MS/billing-api/bill")
	public String invokeDoBilling();
}
