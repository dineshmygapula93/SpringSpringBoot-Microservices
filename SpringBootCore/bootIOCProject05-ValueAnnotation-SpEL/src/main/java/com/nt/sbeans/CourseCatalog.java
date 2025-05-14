package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cc")
@Data
public class CourseCatalog {
	@Value("${cjava.fee}")
	private   Double   cjavaPrice;
	@Value("${ajava.fee}")
	private  Double    ajavaPrice;
	@Value("${oracle.fee}")
	private  Double    oraclePrice;
	@Value("${spbms.fee}")
	private  Double    spbmsPrice;
	@Value("${aws.fee}")
	private  Double    awsPrice;
	@Value("${devops.fee}")
	private  Double   devopsPrice;
	@Value("${angular.fee}")
	private  Double   angularPrice;
	@Value("${testing.fee}")
	private  Double   testingPrice;
	
}
