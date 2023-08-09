package com.VotingSystem.Voting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VotingSystem.Voting.entities.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates,Long>{

}
