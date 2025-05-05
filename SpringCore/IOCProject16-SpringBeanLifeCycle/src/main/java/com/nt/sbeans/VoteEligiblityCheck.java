package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class VoteEligiblityCheck {

	@Value("${per.id}")
	private Integer id;

	@Value("${per.name}")
	private String name;

	@Value("${per.age}")
	private Integer age;

	private LocalDateTime dov;

	static {
		System.out.println("VoteEligiblityCheck.::Static block)");
	}

	public VoteEligiblityCheck() {
		System.out.println("VoteEligiblityCheck.VoteEligiblityCheck()");
	}

	@PostConstruct
	public void myinit() {
		System.out.println("VoteEligiblityCheck.myinit()");

		dov = LocalDateTime.now();

		if (age <= 0 || age >= 120) {
			throw new IllegalArgumentException("In	valid age");
		}
	}

	public String verifyVotingElgiblity() {
		System.out.println("VotingEligibilityCheck.verifyVotingElgiblity() (B.method)");
		if (age >= 18)
			return "Mr " + name + "  u  r elgible for Voting--> verified On::" + dov;
		else
			return "Mr " + name + "  u  r not elgible for Voting--> Verified On::" + dov;
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("VotingEligibilityCheck.myDestroy()");
		age = null;
		name = null;
		id = null;
	}

}
