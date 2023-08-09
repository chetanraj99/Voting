package com.VotingSystem.Voting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.VotingSystem.Voting.entities.*;
import com.VotingSystem.Voting.services.*;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class MyController {
		
		@Autowired
		private VoterServices voterServices;

		@Autowired
		private AdminServices adminServices;
		
		
		@GetMapping("/home")
		public String home() {
			System.out.print("hello there");
			return "Welcome to the bootspring jpa online voting application.";
		}
		
		@PostMapping("/voters")
		public Voters addVoters(@RequestBody Voters voter) {
			return this.voterServices.addVoters(voter);
		}
		
		@PostMapping("/candidates")
		public Candidates addCandidates(@RequestBody Candidates candidates) {
			return this.adminServices.addCandidates(candidates);
		}
		
		@PostMapping("/admin")
		public Admin addAdmin(@RequestBody Admin admin) {
			return this.adminServices.addAdmin(admin);
		}
		
		@PutMapping("/voting/{voteId}")
		public String vote(@PathVariable String voteId) {
			return voterServices.voteToCandidates(Long.parseLong(voteId));
		}

}
