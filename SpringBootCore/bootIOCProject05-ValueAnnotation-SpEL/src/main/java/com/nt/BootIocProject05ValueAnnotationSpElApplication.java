package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.TrainingInstitute;

@SpringBootApplication
public class BootIocProject05ValueAnnotationSpElApplication {

    private final TrainingInstitute instiute;

    BootIocProject05ValueAnnotationSpElApplication(TrainingInstitute instiute) {
        this.instiute = instiute;
    }

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProject05ValueAnnotationSpElApplication.class, args);
		
		TrainingInstitute ti=ctx.getBean("institute",TrainingInstitute.class);
		
		System.out.println(ti);
	}

}
