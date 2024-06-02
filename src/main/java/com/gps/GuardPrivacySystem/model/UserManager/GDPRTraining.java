package com.gps.GuardPrivacySystem.model.UserManager;

import jakarta.persistence.*;

@Entity
@Table(name = "gdprtraining")
public class GDPRTraining {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int training_id;
	private String status;
	
	//Relazione con UserManagement
	@ManyToOne()
	@JoinColumn(name = "user_id", nullable = false)
	private UserManagement userManagement;

	//Getters e Setters
	public int getTraining_id() {
		return training_id;
	}

	public void setTraining_id(int training_id) {
		this.training_id = training_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UserManagement getUserManagement() {
		return userManagement;
	}

	public void setUserManagement(UserManagement userManagement) {
		this.userManagement = userManagement;
	}

	@Override
	public String toString() {
		return "GDPRTraining [training_id=" + training_id + ", status=" + status + ", userManagement=" + userManagement
				+ ", getTraining_id()=" + getTraining_id() + ", getStatus()=" + getStatus() + ", getUserManagement()="
				+ getUserManagement() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}