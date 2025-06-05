package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class JPARepoTestRunner implements CommandLineRunner {

	@Autowired
	private IActorMgmtService actorservice;

	@Override
	public void run(String... args) throws Exception {
//
//		try {
//			String msgrm = actorservice.removeActorsByIds(List.of(49,50,51));
//			System.out.println(msgrm);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//	try {
//		String msgrmall=actorservice.removeAllActorsInBatch();
//		System.out.println(msgrmall);
//	} catch (Exception e) {
//		e.printStackTrace();
//	}

//		try {
//			Actor actor=new Actor();
//			actor.setCategory("Romance");
//			actor.setAddr("Hyderabad");
//			
//			List<Actor> list=actorservice.showActorsByData(actor, true,"category", "addr");
//			
//			list.forEach(System.out::println);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {
			Actor actor = actorservice.showActorById(23);
			System.out.println("classname :: " + actor.getClass() + "......." + actor.getClass().getSuperclass());
			System.out.println(actor);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Actor actor = actorservice.fetchActorById(10);
			System.out.println("classname :: " + actor.getClass() + "......." + actor.getClass().getSuperclass());
			//System.out.println(actor);
			System.out.println(actor.getName());
			System.out.println(actor.getCategory());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
