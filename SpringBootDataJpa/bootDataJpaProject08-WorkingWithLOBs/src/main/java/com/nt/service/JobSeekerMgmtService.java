
package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Service
public class JobSeekerMgmtService implements IJobSeekerMgmtService {

	@Autowired
	private IJobSeekerRepository jobrepo;

	@Override
	public String registerJobSeeker(JobSeeker seeker) {
		int idval = jobrepo.save(seeker).getJid();
		return "JobSeeker is saved with id " + idval;
	}

}
