package com.VotingSystem.Voting.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Admin {
	
	@Id
	long adminId;
	String adminName;
	String emailId;
	String psd;
	
	public Admin(long adminId, String adminName, String emailId, String psd) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.emailId = emailId;
		this.psd = psd;
	}
	
	public Admin() {
		super();
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
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

	@Override
	public String toString() {
		return "Admin [id=" + adminId + ", adminName=" + adminName + ", emailId=" + emailId + ", psd=" + psd + ", getId()="
				+ getAdminId() + ", getAdminName()=" + getAdminName() + ", getEmailId()=" + getEmailId() + ", getPsd()="
				+ getPsd() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
