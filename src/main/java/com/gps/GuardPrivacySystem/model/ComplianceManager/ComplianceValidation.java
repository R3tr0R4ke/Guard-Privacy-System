package com.gps.GuardPrivacySystem.model.ComplianceManager;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "compliancevalidation")
public class ComplianceValidation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int compliance_id;
	
	//Relazione con Rule
	@OneToMany(mappedBy = "complianceValidation", cascade = CascadeType.ALL)
	private List<Rule> rules;
	
	//Relazione con CWE
	@OneToMany(mappedBy = "complianceValidation", cascade = CascadeType.ALL)
	private List<CWE> cwes;

	//Getters e Setters
	public int getCompliance_id() {
		return compliance_id;
	}

	public void setCompliance_id(int compliance_id) {
		this.compliance_id = compliance_id;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}
	
	public List<CWE> getCwes() {
		return cwes;
	}

	public void setCwes(List<CWE> cwes) {
		this.cwes = cwes;
	}

	@Override
	public String toString() {
		return "ComplianceValidation [compliance_id=" + compliance_id + ", rules=" + rules + ", getCompliance_id()="
				+ getCompliance_id() + ", getRules()=" + getRules() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	/*public boolean validateCompliance(criteria) {
		
	}*/
	
	/*public List<CWE> consultCWEforGDPRarticles(article){
		
	}*/
}
