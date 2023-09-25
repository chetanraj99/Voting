package com.VotingSystem.Voting.services;

import java.util.List;

import com.VotingSystem.Voting.entities.Voters;

public interface VoterServices {
	
	public List<Voters> getVoters();
	
	public Voters addVoters(Voters voter);
	
	public String voteToCandidates(long id);
}
