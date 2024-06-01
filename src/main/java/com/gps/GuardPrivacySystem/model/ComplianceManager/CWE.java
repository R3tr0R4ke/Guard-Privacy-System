package com.gps.GuardPrivacySystem.model.ComplianceManager;

import jakarta.persistence.*;

@Entity
@Table(name = "cwe")
public class CWE {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cwe_id;
	private String description;
	
	//Getters e setters
	public int getCwe_id() {
		return cwe_id;
	}
	public void setCwe_id(int cwe_id) {
		this.cwe_id = cwe_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "CWE [cwe_id=" + cwe_id + ", description=" + description + ", getCwe_id()=" + getCwe_id()
				+ ", getDescription()=" + getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	//TODO: ELIMINARE QUESTI COMMENTI, I GETTERS E SETTERS AGISCONO PER QUESTO METODO, AGGIORNA DIAGRAMMI DI COMPONENTI QUINDI
	/*public CWE getCweDetails() {
	}*/
}