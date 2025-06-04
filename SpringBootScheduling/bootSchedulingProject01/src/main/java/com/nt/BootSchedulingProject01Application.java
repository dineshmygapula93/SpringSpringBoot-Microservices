package com.nt;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootSchedulingProject01Application {

	public static void main(String[] args) {
		System.out.println("BootSchedulingProject01Application.main() :: Start "+new Date());
		SpringApplication.run(BootSchedulingProject01Application.class, args);
		System.out.println("BootSchedulingProject01Application.main()  Thread info "+Thread.currentThread().getName());
		System.out.println("BootSchedulingProject01Application.main() :: End "+new Date());
	}

}
