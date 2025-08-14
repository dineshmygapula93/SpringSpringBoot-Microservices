package com.nt.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyPasswordEncoder {
	
	public static void main(String args[]) {
		BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
		String psw1 =encoder.encode("raja");
		String psw2=encoder.encode("rajesh");
		String psw3=encoder.encode("suresh");
		String psw4=encoder.encode("nagesh");
		
		System.out.println(psw1);
		System.out.println(psw2);
		System.out.println(psw3);
		System.out.println(psw4);
	}
}
