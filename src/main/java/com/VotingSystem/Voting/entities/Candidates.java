package com.VotingSystem.Voting.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Candidates {
		@Id
		long candidateId;
		String candidateName;
		long counting;
		
		public Candidates(long candidateId, String candidateName, long counting) {
			super();
			this.candidateId = candidateId;
			this.candidateName = candidateName;
			this.counting = counting;
		}
		
		public Candidates() {
			super();
		}
		
		public long getCandidateId() {
			return candidateId;
		}
		public void setCandidateId(long candidateId) {
			this.candidateId = candidateId;
		}
		public String getCandidateName() {
			return candidateName;
		}
		public void setCandidateName(String candidateName) {
			this.candidateName = candidateName;
		}
		public long getCounting() {
			return counting;
		}
		public void setCounting(long counting) {
			this.counting = counting;
		}
		@Override
		public String toString() {
			return "Candidates [candidateId=" + candidateId + ", candidateName=" + candidateName + ", counting="
					+ counting + ", getCandidateId()=" + getCandidateId() + ", getCandidateName()="
					+ getCandidateName() + ", getCounting()=" + getCounting() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
		
}
