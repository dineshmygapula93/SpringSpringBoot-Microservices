package com.nt.service;

import com.nt.entity.Actor;

public interface IActorMgmtService {
	public String registoryActor(Actor actor);

	public Long showActorCount();

	public String checkavailableactors(int id);

	public String registoryActors(Iterable<Actor> entities);

	public Iterable<Actor> showAllActors();

	public Iterable<Actor> showactorsbyid(Iterable<Integer> ids);

	public String showActorById(int id);

	public Actor fetchActorById(int id);

	public Actor getActorById(int id);

	public String updateActorFeeById(int id, float hikepercentage);

	public String updateActor(Actor actor);

	public String deleteActorById(int id);

	public String deleteActor(Actor actor);

	public String deleteAllActors();

}
