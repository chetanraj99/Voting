package com.VotingSystem.Voting.services;

import com.VotingSystem.Voting.entities.Voters;

public interface VoterServices {
	public Voters addVoters(Voters voter);
	
	public String voteToCandidates(long id);
}
