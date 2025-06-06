package com.nt.runners;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner {

	@Autowired
	private IActorRepository actorrepo;

	@Override
	public void run(String... args) throws Exception {
//		try {
//		Iterable<Actor> list=actorrepo.findByCategoryEquals("Drama");
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("==========================================");
//		try {
//			Iterable<Actor> list=actorrepo.readByCategoryIs("Comedy");
//				list.forEach(System.out::println);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		System.out.println("==========================================");
//		
//		try {
//			List<Actor> list=actorrepo.getByCategory("Horror");
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			List<Actor> list=actorrepo.findByFeeBetween(1000.00, 1500.00);
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			actorrepo.findByNameStartingWith("a").forEach(System.out::println);
//			System.out.println("==========================================");
//			actorrepo.findByNameEndingWith("i").forEach(System.out::println);
//			System.out.println("==========================================");
//			actorrepo.findByNameContaining("h").forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			actorrepo.findByCategoryInOrderByAsc(List.of("Drame","Action","Thriller")).forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			actorrepo.findByFeeBetweenAndAddrEquals(1000.00, 1500.00, "Mumbai").forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			actorrepo.findByNameLikeOrFeeLessThanEqual("%y", 1700.00).forEach(System.out::println);;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}	
		
		try {
			Optional<Actor> actornum =actorrepo.findByContactnumberEquals(9876543210l);
			if(actornum.isEmpty()) {
				System.out.println("Number not found");
			}else {
				System.out.println("Actor details ::"+actornum.get());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
