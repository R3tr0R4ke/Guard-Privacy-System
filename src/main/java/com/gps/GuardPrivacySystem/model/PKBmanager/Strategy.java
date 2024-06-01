package com.gps.GuardPrivacySystem.model.PKBmanager;

import jakarta.persistence.*;

@Entity
@Table(name = "strategy")
public class Strategy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int strategy_id;
	private String name;
	private String Description;
	
	//Relazione con PKBSystem
	@ManyToOne
	@JoinColumn(name = "pkb_id", nullable = false)
	private PKBSystem pkbsystem;

	//Getters e setters
	public int getStrategy_id() {
		return strategy_id;
	}

	public void setStrategy_id(int strategy_id) {
		this.strategy_id = strategy_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public PKBSystem getPkbSystem() {
		return pkbsystem;
	}

	public void setPkbSystem(PKBSystem pkbSystem) {
		this.pkbsystem = pkbSystem;
	}
}