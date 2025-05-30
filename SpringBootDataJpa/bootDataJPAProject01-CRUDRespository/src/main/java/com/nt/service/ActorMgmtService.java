package com.nt.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;
@Service
public class ActorMgmtService implements IActorMgmtService {

	@Autowired
	private IActorRepository actorrepo;

	@Override
	public String registoryActor(Actor actor) {
		
		Actor savedactor =actorrepo.save(actor);
		return savedactor.getAid()+"  is saved with id value";
	}

	@Override
	public Long showActorCount() {
		return actorrepo.count();
	}

	@Override
	public String checkavailableactors(int id) {
		boolean flag =actorrepo.existsById(id);
		return flag?"Actor available ":"Actor unavaialbe";
	}

//	@Override
//	public String registoryActors(Iterable<Actor> entities) {
//		
//		Iterable<Actor> savedentities =actorrepo.saveAll(entities);
//		
//		int count=0;
//		
//		List<Integer> ids=new ArrayList();
//		for(Actor entity:savedentities) {
//			count++;
//			ids.add(entity.getAid());
//		}
//		return count+" number of entities are saved with ids :"+ids;
//	}
	
	public String registoryActors(Iterable<Actor> entities) {
		Iterable<Actor> savedentities =actorrepo.saveAll(entities);
		
		List<Integer> ids=StreamSupport.stream(entities.spliterator(), false).map(Actor :: getAid).collect(Collectors.toList());	
		return ids.size()+" no of objects and with ids :: "+ids;
	}
	

	@Override
	public Iterable<Actor> showAllActors() {
		return actorrepo.findAll();
	}

	@Override
	public Iterable<Actor> showactorsbyid(Iterable<Integer> ids) {
		return actorrepo.findAllById(ids);
	}

}
