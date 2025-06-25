package com.nt.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

//@Component
public class JobSeekerTestRunner implements CommandLineRunner {
	@Autowired
	private IJobSeekerMgmtService jobservice;

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Job Seeker name");
		String name = sc.next();

		System.out.println("Enter Job Sekker Address");
		String Addr = sc.next();

		System.out.println("Is Job Seeker Is indian? ::");
		boolean flag = sc.nextBoolean();

		System.out.println("ENter the photo path");
		String photopath = sc.next().trim();

		System.out.println("Enter the resume path");
		String respath = sc.next().trim();

		InputStream is = new FileInputStream(photopath);
		byte[] photobytes = is.readAllBytes();

		File file = new File(respath);
		long length = file.length();
		Reader reader = new FileReader(file);
		char[] restext = new char[(int) length];
		reader.read();
		
		JobSeeker js =new JobSeeker("dinesh","hyd",true,restext,photobytes);
		
		try {
			String msg=jobservice.registerJobSeeker(js);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
