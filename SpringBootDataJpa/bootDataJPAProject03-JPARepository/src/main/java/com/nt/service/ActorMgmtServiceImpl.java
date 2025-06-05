package com.nt.service;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service
public class ActorMgmtServiceImpl implements IActorMgmtService {

	@Autowired
	private IActorRepository actorrepo;

	@Override
	public String removeActorsByIds(Iterable<Integer> ids) {

		List<Actor> list = actorrepo.findAllById(ids);

		long count = list.size();

		if (count != 0) {
			actorrepo.deleteAllByIdInBatch(ids);
			return count + " number of records are found deleted";
		}
		return " no records are found deleted";
	}

	@Override
	public String removeAllActorsInBatch() {

		long count = actorrepo.count();
		actorrepo.deleteAllInBatch();
		return count + " number of records are deleted";
	}

	@Override
	public List<Actor> showActorsByData(Actor actor, boolean ascOrder, String... props) {
		Sort sort = Sort.by(ascOrder ? Sort.Direction.ASC : Sort.Direction.DESC, props);
		Example<Actor> example = Example.of(actor);
		return actorrepo.findAll(example, sort);
	}

	@Override
	public Actor showActorById(int id) {
		return actorrepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
	}

	@Override
	public Actor fetchActorById(int id) {
		Actor actor=actorrepo.getReferenceById(id);
		return actor;
	}

}
