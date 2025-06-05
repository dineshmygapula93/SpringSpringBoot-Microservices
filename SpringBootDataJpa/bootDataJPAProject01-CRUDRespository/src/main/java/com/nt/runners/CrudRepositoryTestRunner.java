package com.nt.runners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.ActorMgmtService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	ActorMgmtService actorservice;

	@Override
	public void run(String... args) throws Exception {

//		try {
//			Actor actor = new Actor();
//
//			actor.setName("dinesh2");
//			actor.setAddr("palakollu2");
//			actor.setCategory("hero2");
//			actor.setContactnumber(999999992l);
//			actor.setFee(5000002.0);
//
//			String msg = actorservice.registoryActor(actor);
//
//			System.out.println(msg);
//			
//			Long count =actorservice.showActorCount();
//			
//			String availmsg=actorservice.checkavailableactors(2);
//			
//			System.out.println(availmsg);
//			System.out.println(count);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			Actor actor1 =new Actor("dinesh11","palakollu4","hero4",99999L,5030013.0);
//			Actor actor2 =new Actor("dinesh12","palakollu5","hero5",999991L,5030023.0);
//			Actor actor3 =new Actor("dinesh13","palakollu6","hero6",999992L,5030033.0);
//			Actor actor4 =new Actor("dinesh14","palakollu7","hero7",999993L,503003.40);
//			
//			List<Actor> list=List.of(actor1,actor2,actor3,actor4);
//			
//			String entitesaved=actorservice.registoryActors(list);
//			System.out.println(entitesaved);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		Iterable<Actor> actorsall = actorservice.showAllActors();

		actorsall.forEach(System.out::println);

//		List<Integer> ids =new ArrayList();
//		ids.add(1054);
//		ids.add(1055);
//		ids.add(1056);
//		ids.add(11103);
//		ids.add(1103);
//		
//		Iterable<Actor> actorbyid=actorservice.showactorsbyid(ids);
//		actorbyid.forEach(System.out ::println);

//		
//		try {
//			String msgid=actorservice.showActorById(12);
//			System.out.println(msgid);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			Actor actor=actorservice.fetchActorById(12);	
//			System.out.println("Actor Details are ::"+actor);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
////		
//		try {
//			Actor actor=actorservice.getActorById(13);
//			System.out.println("Actor details are :: "+actor);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			String msgup=actorservice.updateActorFeeById(1052, 20.00f);
//			System.out.println(msgup);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		Actor actor =new Actor(952,"dinuu2","Mattaparru","superstar",999999912L,1283.33);
//		String msgupd=actorservice.updateActor(actor);
//		System.out.println(msgupd);

//		try {
//			String msgd=actorservice.deleteActorById(1052);
//			System.out.println(msgd);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//		try {
//			Actor actor =new Actor();
//			actor.setAid(952);
//			String msgad=actorservice.deleteActor(actor);
//			System.out.println(msgad);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {
			String msgdall = actorservice.deleteAllActors();
			System.out.println(msgdall);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
