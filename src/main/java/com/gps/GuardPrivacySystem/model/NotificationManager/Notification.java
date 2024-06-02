package com.gps.GuardPrivacySystem.model.NotificationManager;

import com.gps.GuardPrivacySystem.model.UserManager.UserManagement;

import jakarta.persistence.*;


@Table(name = "notification")
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int notification_id;
	private String message;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private UserManagement userManagement;

	//Getters e Setters
	public int getNotification_id() {
		return notification_id;
	}

	public void setNotification_id(int notification_id) {
		this.notification_id = notification_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserManagement getUserManagement() {
		return userManagement;
	}

	public void setUserManagement(UserManagement userManagement) {
		this.userManagement = userManagement;
	}

	@Override
	public String toString() {
		return "Notification [notification_id=" + notification_id + ", message=" + message + ", userManagement="
				+ userManagement + ", getNotification_id()=" + getNotification_id() + ", getMessage()=" + getMessage()
				+ ", getUserManagement()=" + getUserManagement() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	//Diagramma dice di mettere sendNotification() e createNotification()
	//Ma va nel controller
}
