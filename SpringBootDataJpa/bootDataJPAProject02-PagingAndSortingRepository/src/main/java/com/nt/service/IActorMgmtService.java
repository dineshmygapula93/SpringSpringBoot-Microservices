package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.entity.Actor;

public interface IActorMgmtService {
	public Iterable<Actor> showActorsSorted(Boolean ascOrder, String... props);

	public Page<Actor> showActorsByPageNo(int pageNo, int pageSize);

	public Page<Actor> showActorsByPageNoAsSorted(int pageNo, int pageSize, Boolean ascOrder, String... props);

	public void showActorsDateByPagination(int pageSize);
}
