package com.nt.service;

import java.util.List;

import com.nt.entity.Actor;

public interface IActorMgmtservice {
	public List<Actor> showActorsByFeeRange(Double start,Double end);
}
