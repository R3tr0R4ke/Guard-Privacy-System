package com.gps.GuardPrivacySystem.model.UserManager;

import jakarta.persistence.*;

@Entity
@Table(name = "preferences")
public class Preferences {

	@Id
	private int user_id;	//id primario di userManagment
	
	//Relazione con UserManagement
	@OneToOne
	@MapsId
	@JoinColumn(name = "user_id")
	private UserManagement userManagement;
	
	private boolean notification_enabled;	//Ricorda di metterlo false di default

	//Getters e Setters
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public UserManagement getUserManagement() {
		return userManagement;
	}

	public void setUserManagement(UserManagement userManagement) {
		this.userManagement = userManagement;
	}

	public boolean isNotification_enabled() {
		return notification_enabled;
	}

	public void setNotification_enabled(boolean notification_enabled) {
		this.notification_enabled = notification_enabled;
	}

	@Override
	public String toString() {
		return "Preferences [user_id=" + user_id + ", userManagement=" + userManagement + ", notification_enabled="
				+ notification_enabled + ", getUser_id()=" + getUser_id() + ", getUserManagement()="
				+ getUserManagement() + ", isNotification_enabled()=" + isNotification_enabled() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}