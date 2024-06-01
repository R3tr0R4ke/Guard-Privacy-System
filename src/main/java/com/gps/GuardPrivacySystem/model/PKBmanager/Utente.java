package com.gps.GuardPrivacySystem.model.PKBmanager;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "usermanagement")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private String email;
	private String role;
	
	@OneToMany(mappedBy = "usermanagement", cascade = CascadeType.ALL)
	private List<Feedback> feedbackList;
	
	//Getters e setters...
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public List<Feedback> getFeedbackList() {
		return feedbackList;
	}
	
	public void setFeedbackList(List<Feedback> feedbackList) {
		this.feedbackList = feedbackList;
	}
}
