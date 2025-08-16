package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMailProject01Application {

	public static void main(String[] args) {
		System.out.println("BootMailProject01Application.main() start");
		SpringApplication.run(BootMailProject01Application.class, args);
		System.out.println("BootMailProject01Application.main() end");
	}

}
