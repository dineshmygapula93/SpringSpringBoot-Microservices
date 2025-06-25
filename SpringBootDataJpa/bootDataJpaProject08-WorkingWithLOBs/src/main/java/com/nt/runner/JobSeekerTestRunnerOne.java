package com.nt.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Component
public class JobSeekerTestRunnerOne implements CommandLineRunner {
	@Autowired
	private IJobSeekerMgmtService jobservice;

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Job Seeker Id");
		int id = sc.nextInt();
		try {
			JobSeeker js = jobservice.showJobSeeker(101);
			System.out.println(js.getJname() + " " + js.getJaddr() + " " + js.isIndian());

			byte[] photocontent = js.getPhoto();
			FileOutputStream fos = new FileOutputStream("d1_jpg");
			fos.write(photocontent);
			fos.flush();
			fos.close();

			char[] resumecontent = js.getResume();
			FileWriter writer = new FileWriter("d1_res.pdf");
			writer.write(resumecontent);
			writer.flush();
			writer.close();

			System.out.println("File are retrived from db background");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
