package com.nt.runners;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Component
public class QueryMethodsTestRunner implements CommandLineRunner {

	@Autowired
	private IActorRepository actorrepo;

	@Override
	public void run(String... args) throws Exception {

		try {
			actorrepo.showActorsByFeeRange(1000.0, 1500.0).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("===========================================================================");
		try {
			actorrepo.showActorsByCategory("Drama", "Horror", "comdey").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("===========================================================================");

		try {
			actorrepo.showActorsByAddr("Mumbai").forEach(row -> System.out.println(Arrays.toString(row)));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("===========================================================================");

		try {
			actorrepo.showActorsNameByFeeRange(1000, 1500).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("=========================");

		try {
			Optional<Actor> opt = actorrepo.showActorByMobileNumber(9876543237L);
			if (opt.isEmpty()) {
				System.out.println("Actor not found");
			} else {
				System.out.println(opt.get());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("=========================");
		try {
			Object obj = actorrepo.showActorDataByMobileNumber(9876543237L);

			Object row[] = (Object[]) obj;

			System.out.println("Actor id " + row[0]);
			System.out.println("Actor name " + row[1]);
			System.out.println("Actor contact number " + row[2]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=========================");

		try {
			String name = actorrepo.showActorNameByMobileNumber(9876543237L);
			System.out.println("Actor name " + name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
