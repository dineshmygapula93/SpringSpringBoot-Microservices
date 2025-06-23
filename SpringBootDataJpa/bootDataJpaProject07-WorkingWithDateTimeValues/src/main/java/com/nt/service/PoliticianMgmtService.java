package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Politician;
import com.nt.repository.IPoliticianRepository;

@Service
public class PoliticianMgmtService implements IPoliticianMgmtService {

	@Autowired
	private IPoliticianRepository politicianrepo;

	@Override
	public String registerPolitician(Politician politician) {
		int idval = politicianrepo.save(politician).getPid();
		return "The politician saved with id " + idval;
	}

	@Override
	public List<Politician> showAllPoliticians() {
		return politicianrepo.findAll();
	}

	@Override
	public double calculatePoliticianAge(int id) {
		return politicianrepo.getpoliticianageById(id);
	}

}
