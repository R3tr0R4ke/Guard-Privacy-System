package com.gps.GuardPrivacySystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "patternexample")
public class PatternExample {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long example_id;
	private String description;
	
	//Relazione con Pattern
	@ManyToOne
	@JoinColumn(name = "pattern_id")
	private Pattern pattern;
	
	//Getters e setters
	public Long getExample_id() {
		return example_id;
	}

	public void setExample_id(Long example_id) {
		this.example_id = example_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pattern getPattern() {
		return pattern;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
}
