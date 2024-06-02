package com.gps.GuardPrivacySystem.model.PKBmanager;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "pattern")
public class Pattern {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	
	//Relazione con PKBSystem
	@ManyToOne()
	@JoinColumn(name = "pkb_id", nullable = false)
	private PKBSystem pkbsystem;
	
	//Relazione con PatternExample
	@OneToMany(mappedBy = "pattern", cascade = CascadeType.ALL)
	private List<PatternExample> patternExamples;
	
	//Relazione con Vulnerability
	@OneToMany(mappedBy = "pattern", cascade = CascadeType.ALL)
	private List<Vulnerability> vulnerabilities;
	
	//TODO:DEVE AVERE UNA RELAZIONE CON PATTERN ALTRIMENTI NON COMPILA
	//CONSIDERARE DI USARLO ALTROVE
	//private List<String> mitigatedVulnerabilities;
	
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

	public List<PatternExample> getPatternExamples() {
		return patternExamples;
	}

	public void setPatternExamples(List<PatternExample> patternExamples) {
		this.patternExamples = patternExamples;
	}

	public PKBSystem getPkbSystem() {
		return pkbsystem;
	}

	public void setPkbSystem(PKBSystem pkbSystem) {
		this.pkbsystem = pkbSystem;
	}

	public PKBSystem getPkbsystem() {
		return pkbsystem;
	}

	public void setPkbsystem(PKBSystem pkbsystem) {
		this.pkbsystem = pkbsystem;
	}

	public List<Vulnerability> getVulnerabilities() {
		return vulnerabilities;
	}

	public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
		this.vulnerabilities = vulnerabilities;
	}

	/*public List<String> getMitigatedVulnerabilities() {
		return mitigatedVulnerabilities;
	}

	public void setMitigatedVulnerabilities(List<String> mitigatedVulnerabilities) {
		this.mitigatedVulnerabilities = mitigatedVulnerabilities;
	}*/
}