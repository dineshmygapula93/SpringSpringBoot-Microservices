package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtservice;
@Component
public class PLSQLTestRunner implements CommandLineRunner{
	
	@Autowired
	private IActorMgmtservice actorservice;
	@Override
	public void run(String... args) throws Exception {
		
		
//		CREATE DEFINER=`root`@`localhost` PROCEDURE `GET_ACTORS_FEE_RANGE`(
//			    IN STARTFEE DECIMAL(10,2),
//			    IN ENDFEE DECIMAL(10,2)
//			)
//			BEGIN
//			    SELECT * FROM jpa_actor_info 
//			    WHERE FEE >= STARTFEE AND FEE <= ENDFEE;
//			END
		
		
		try {
			List<Actor> list=actorservice.showActorsByFeeRange(1500.00, 2000.00);
			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
