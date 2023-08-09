package com.VotingSystem.Voting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VotingSystem.Voting.entities.Admin;

public interface AdminDao extends JpaRepository<Admin,Long>{

}
