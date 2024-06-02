package com.gps.GuardPrivacySystem.model.PKBmanager;

import com.gps.GuardPrivacySystem.model.UserManager.UserManagement;
import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedback_id;
	private String message;
	
	//Relazione con UserManagement
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
    private UserManagement userManagement;

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

	public UserManagement getUtente() {
		return userManagement;
	}

	public void setUtente(UserManagement utente) {
		this.userManagement = utente;
	}

	@Override
	public String toString() {
		return "Feedback [feedback_id=" + feedback_id + ", message=" + message + ", userManagement=" + userManagement
				+ ", getFeedback_id()=" + getFeedback_id() + ", getMessage()=" + getMessage() + ", getUtente()="
				+ getUtente() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}