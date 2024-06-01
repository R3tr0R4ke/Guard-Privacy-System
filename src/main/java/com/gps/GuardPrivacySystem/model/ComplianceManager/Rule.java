package com.gps.GuardPrivacySystem.model.ComplianceManager;

import jakarta.persistence.*;

@Entity
@Table(name = "rule")
public class Rule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rule_id;
	private String description;
	
	@ManyToOne()
	@JoinColumn(name = "compliance_id", nullable = false)
	private ComplianceValidation complianceValidation;

	//Getters e setters
	public int getRule_id() {
		return rule_id;
	}

	public void setRule_id(int rule_id) {
		this.rule_id = rule_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ComplianceValidation getComplianceValidation() {
		return complianceValidation;
	}

	public void setComplianceValidation(ComplianceValidation complianceValidation) {
		this.complianceValidation = complianceValidation;
	}

	@Override
	public String toString() {
		return "Rule [rule_id=" + rule_id + ", description=" + description + ", complianceValidation="
				+ complianceValidation + ", getRule_id()=" + getRule_id() + ", getDescription()=" + getDescription()
				+ ", getComplianceValidation()=" + getComplianceValidation() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	/*public Rule getRuleDetails() {
		
	}*/
}