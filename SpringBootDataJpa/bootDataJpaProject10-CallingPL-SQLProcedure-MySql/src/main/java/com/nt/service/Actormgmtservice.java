package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service
public class Actormgmtservice implements IActorMgmtservice {

	@Autowired
	private EntityManager manager;

	@Override
	public List<Actor> showActorsByFeeRange(Double start, Double end) {
		StoredProcedureQuery query = manager.createStoredProcedureQuery("GET_ACTORS_FEE_RANGE", Actor.class);
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);

		query.setParameter(1, start);
		query.setParameter(2, end);

		List<Actor> list = query.getResultList();
		return list;
	}

}
