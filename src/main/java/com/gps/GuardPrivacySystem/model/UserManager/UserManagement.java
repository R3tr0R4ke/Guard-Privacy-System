package com.gps.GuardPrivacySystem.model.UserManager;

import java.util.List;

import com.gps.GuardPrivacySystem.model.NotificationManager.Notification;
import com.gps.GuardPrivacySystem.model.PKBmanager.Feedback;
import jakarta.persistence.*;

@Entity
@Table(name = "usermanagement")
public class UserManagement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String username;
	private String password;
	private String email;
	private String role;
	
	//Relazione con GDPRTraining
	@OneToMany(mappedBy = "userManagement", cascade = CascadeType.ALL)
	private List<GDPRTraining> gdprTraining;
	
	//Relazione con Preferences
	@OneToOne(mappedBy = "userManagement", cascade = CascadeType.ALL, orphanRemoval = true)
	private Preferences preferences;
	
	//Relazione con Notification
	@OneToMany(mappedBy = "userManagement", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Notification> notifications;
	
	//Relazione con Feedback
	@OneToMany(mappedBy = "userManagement", cascade = CascadeType.ALL)
	private List<Feedback> feedbacks;
	
	//Getters e Setters
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public List<GDPRTraining> getGdprTraining() {
		return gdprTraining;
	}

	public void setGdprTraining(List<GDPRTraining> gdprTraining) {
		this.gdprTraining = gdprTraining;
	}

	public Preferences getPreferences() {
		return preferences;
	}

	public void setPreferences(Preferences preferences) {
		this.preferences = preferences;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}
	
	
}
