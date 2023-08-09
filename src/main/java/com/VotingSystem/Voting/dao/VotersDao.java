package com.VotingSystem.Voting.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.VotingSystem.Voting.entities.Voters;

public interface VotersDao extends JpaRepository<Voters,String>{

}