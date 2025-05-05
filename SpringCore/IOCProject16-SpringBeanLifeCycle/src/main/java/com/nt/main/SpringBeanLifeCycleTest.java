package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.Appconfig;
import com.nt.sbeans.VoteEligiblityCheck;

public class SpringBeanLifeCycleTest {

	public static void main(String args[]) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);

		VoteEligiblityCheck vec = ctx.getBean(VoteEligiblityCheck.class);

		String msg = vec.verifyVotingElgiblity();

		System.out.println(msg);
		
		ctx.close();
	}
}
