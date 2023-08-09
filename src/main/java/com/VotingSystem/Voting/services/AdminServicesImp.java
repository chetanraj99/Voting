package com.VotingSystem.Voting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VotingSystem.Voting.dao.*;
import com.VotingSystem.Voting.entities.*;
@Service
public class AdminServicesImp implements AdminServices {
	
	@Autowired
	private CandidatesDao candidatesDao;
	
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public Candidates addCandidates(Candidates candidates) {
		// TODO Auto-generated method stub
		candidatesDao.save(candidates);
		return candidates;
	}

	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.save(admin);
		return admin;
	}

	
}
