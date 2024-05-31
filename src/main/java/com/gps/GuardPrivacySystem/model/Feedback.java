package com.gps.GuardPrivacySystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedback_id;
	private String message;
	
	//Relazione con PKBSystem
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
    private Utente usermanagement;

	//Getters e setters
	public int getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Utente getUtente() {
		return usermanagement;
	}

	public void setUtente(Utente utente) {
		this.usermanagement = utente;
	}
}