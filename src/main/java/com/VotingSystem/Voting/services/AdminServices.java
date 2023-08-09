package com.VotingSystem.Voting.services;

import com.VotingSystem.Voting.entities.Admin;
import com.VotingSystem.Voting.entities.Candidates;

public interface AdminServices {
	public Candidates addCandidates(Candidates candidates);
	
	public Admin addAdmin(Admin admin);
}
