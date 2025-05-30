package com.nt.service;

import com.nt.entity.Actor;

public interface IActorMgmtService {
	public String registoryActor(Actor actor);
	public Long showActorCount();
	public String checkavailableactors(int id);
	public String registoryActors(Iterable<Actor> entities);
	public Iterable<Actor> showAllActors();
	public Iterable<Actor> showactorsbyid(Iterable<Integer> ids);
}
