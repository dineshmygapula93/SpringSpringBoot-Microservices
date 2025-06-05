package com.nt.service;

import java.util.List;
import java.util.Optional;
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

		Actor savedactor = actorrepo.save(actor);
		return savedactor.getAid() + "  is saved with id value";
	}

	@Override
	public Long showActorCount() {
		return actorrepo.count();
	}

	@Override
	public String checkavailableactors(int id) {
		boolean flag = actorrepo.existsById(id);
		return flag ? "Actor available " : "Actor unavaialbe";
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
		Iterable<Actor> savedentities = actorrepo.saveAll(entities);

		List<Integer> ids = StreamSupport.stream(entities.spliterator(), false).map(Actor::getAid)
				.collect(Collectors.toList());
		return ids.size() + " no of objects and with ids :: " + ids;
	}

	@Override
	public Iterable<Actor> showAllActors() {
		return actorrepo.findAll();
	}

	@Override
	public Iterable<Actor> showactorsbyid(Iterable<Integer> ids) {
		return actorrepo.findAllById(ids);
	}

	@Override
	public String showActorById(int id) {
		Optional<Actor> opt = actorrepo.findById(11);

		if (opt.isPresent()) {
			Actor actor = opt.get();
			return "Actor Details" + actor;
		} else
			return id + " Actor Not Found";
	}

//	@Override
//	public Actor fetchActorById(int id) {
//		Optional<Actor> opt =actorrepo.findById(id);
//		if(opt.isEmpty()) {
//			throw new IllegalArgumentException("Invalid id");
//		}else {
//		return opt.get();
//		}
//	}

	public Actor fetchActorById(int id) {
		Actor actor = actorrepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id"));
		return actor;
	}

	@Override
	public Actor getActorById(int id) {
		Actor actor = actorrepo.findById(id).orElse(new Actor("fake actor", "hyd", "stunt master", 999999L, 353.4));
		return actor;
	}

	@Override
	public String updateActorFeeById(int id, float hikepercentage) {
		Optional<Actor> opt = actorrepo.findById(id);
		if (opt.isEmpty()) {
			return "Actor not found";
		} else {
			Actor actor = opt.get();
			actor.setFee(actor.getFee() + actor.getFee() * hikepercentage / 100);
			actorrepo.save(actor);
			return "Actor fee is updated with new Fee";
		}
	}

	@Override
	public String updateActor(Actor actor) {
		actorrepo.save(actor);
		return "Actor Object is saved/upadated";
	}

	@Override
	public String deleteActorById(int id) {
		Optional<Actor> opt=actorrepo.findById(id);
		if(opt.isEmpty()) {
			return "id is not found for deletion";
		}else {
			actorrepo.deleteById(id);
			return id+" is founded and deleted";
		}
	}

	@Override
	public String deleteActor(Actor actor) {
		Optional<Actor> opt=actorrepo.findById(actor.getAid());
		if(opt.isEmpty()) {
			return "id is not found for deletion";
		}else {
			actorrepo.delete(actor);
			return actor.getAid()+" is founded and deleted";
		}
	}

	@Override
	public String deleteAllActors() {
		long count=actorrepo.count();
		actorrepo.deleteAll();
		return count+"number of deleted";
	}
}
