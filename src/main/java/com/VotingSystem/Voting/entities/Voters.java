package com.VotingSystem.Voting.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Voters {
		@Id
		String voterId;
		String name;
		String emailId;
		String psd;
		String phone_no;
		String aadharNo;
		
		public Voters(String voterId, String name, String emailId, String psd, String phone_no, String aadharNo) {
			super();
			this.voterId = voterId;
			this.name = name;
			this.emailId = emailId;
			this.psd = psd;
			this.phone_no = phone_no;
			this.aadharNo = aadharNo;
		}
		
		public Voters() {
			super();
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPsd() {
			return psd;
		}
		public void setPsd(String psd) {
			this.psd = psd;
		}
		public String getPhone_no() {
			return phone_no;
		}
		
		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
		}
		public String getVoterId() {
			return voterId;
		}
		public void setVoterId(String voterId) {
			this.voterId = voterId;
		}
		public String getAadharNo() {
			return aadharNo;
		}
		public void setAadharNo(String aadharNo) {
			this.aadharNo = aadharNo;
		}
		
		@Override
		public String toString() {
			return "Voters [name=" + name + ", emailId=" + emailId + ", psd=" + psd + ", phone_no=" + phone_no
					+ ", voterId=" + voterId + ", aadharNo=" + aadharNo + ", getName()=" + getName() + ", getEmailId()="
					+ getEmailId() + ", getPsd()=" + getPsd() + ", getPhone_no()=" + getPhone_no() + ", getVoterId()="
					+ getVoterId() + ", getAadharNo()=" + getAadharNo() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		
}
