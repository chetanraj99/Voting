package com.VotingSystem.Voting.services;
import java.util.List;
import com.VotingSystem.Voting.entities.Admin;
import com.VotingSystem.Voting.entities.Candidates;

public interface AdminServices {
	public Candidates addCandidates(Candidates candidates);
	
	public List<Admin> getAdmins();
	
	public List<Candidates> getCandidates();
	
	public Admin addAdmin(Admin admin);
}
