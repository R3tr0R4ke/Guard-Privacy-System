package com.gps.GuardPrivacySystem.model.PKBmanager;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "pkbsystem")
public class PKBSystem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pkb_id;
	private String name;
	
	//Relazione con Pattern
	@OneToMany(mappedBy = "pkbsystem", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Pattern> patterns;

	//Relazione con Strategy
	@OneToMany(mappedBy = "pkbsystem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Strategy> strategies;
	
	//Relazione con FeedBack
	/*@OneToOne(mappedBy = "pkbSystem", cascade = CascadeType.ALL, orphanRemoval = true)
	private Feedback feedback;*/
	
	//Relazione con Vulnerability
	/*@OneToOne(mappedBy = "pkbSystem", cascade = CascadeType.ALL, orphanRemoval = true)
	private Vulnerability vulnerability;*/

	public int getPkb_id() {
		return pkb_id;
	}

	public void setPkb_id(int pkb_id) {
		this.pkb_id = pkb_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Pattern> getPatterns() {
		return patterns;
	}

	public void setPatterns(List<Pattern> patterns) {
		this.patterns = patterns;
	}

	public List<Strategy> getStrategies() {
		return strategies;
	}

	public void setStrategies(List<Strategy> strategies) {
		this.strategies = strategies;
	}
}
