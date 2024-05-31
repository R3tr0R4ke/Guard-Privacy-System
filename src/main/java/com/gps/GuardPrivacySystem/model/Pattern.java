package com.gps.GuardPrivacySystem.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "pattern")
public class Pattern {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	
	//Relazione con PKBSystem
	@ManyToOne()
	@JoinColumn(name = "pkb_id", nullable = false)
	private PKBSystem pkbsystem;
	
	//Relazione con PatternExample
	@OneToMany(mappedBy = "pattern", cascade = CascadeType.ALL)
	private List<PatternExample> patternExampleList;
	
	//Getter e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<PatternExample> getPatternExampleList() {
		return patternExampleList;
	}

	public void setPatternExampleList(List<PatternExample> patternExampleList) {
		this.patternExampleList = patternExampleList;
	}

	public PKBSystem getPkbSystem() {
		return pkbsystem;
	}

	public void setPkbSystem(PKBSystem pkbSystem) {
		this.pkbsystem = pkbSystem;
	}
}