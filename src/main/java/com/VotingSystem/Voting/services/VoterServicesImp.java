package com.VotingSystem.Voting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VotingSystem.Voting.dao.*;
import com.VotingSystem.Voting.entities.*;


@Service
public class VoterServicesImp implements VoterServices {
	
	@Autowired
	private VotersDao voterDao;
	@Autowired
	private CandidatesDao candidateDao;
	
	@Override
	public Voters addVoters(Voters voter) {
		// TODO Auto-generated method stub
		voterDao.save(voter);
		return voter;
	}

	@Override
	public String voteToCandidates(long id) {
		Candidates candidate = candidateDao.findById(id).get();
		candidate.setCounting(candidate.getCounting()+1);
		candidateDao.save(candidate);
		return "You have voted successfully.";
	}

	@Override
	public List<Voters> getVoters() {
		// TODO Auto-generated method stub
		return voterDao.findAll();
	}

}
