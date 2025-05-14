package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("institute")
@Data
public class TrainingInstitute {
	@Value("#{T(java.lang.Math).round(T(java.lang.Math).random() * 99)}")
	private  Integer id;
	
	@Value("${inst.name}")
	private  String  name;
	@Value("${inst.addrs}")
	private   String  addrs;
	@Value("${inst.phone}")
	private  Long contact;
	@Value("${inst.email}")
	private   String email;
	@Value("${inst.category}")
	private   String  category;
	@Value("500032")
	private   String pinCode;
	
	
	@Value("${os.name}")
	private String  osName;
	@Value("${os.version}")
	private  String  osVersion;
	
	@Value("${Path}")
	private  String  pathData;
	
	
	@Value("#{cc.cjavaPrice + cc.ajavaPrice + cc.spbmsPrice +cc.oraclePrice + cc.awsPrice+ cc.devopsPrice + cc.angularPrice +cc.testingPrice}")
	private  Double  fsJavaPrice;  
	@Value("#{cc.spbmsPrice >10000 }")
	private  boolean  isSpbmsFeeCostly;
}
