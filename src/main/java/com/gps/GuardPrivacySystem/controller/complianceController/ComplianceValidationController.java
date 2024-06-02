package com.gps.GuardPrivacySystem.controller.complianceController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gps.GuardPrivacySystem.model.ComplianceManager.ComplianceValidation;
//import com.gps.GuardPrivacySystem.model.ComplianceManager.Rule;
import com.gps.GuardPrivacySystem.repository.ComplianceValidationRepo.ComplianceValidationRepository;

@RestController
@RequestMapping("api/complianceValidations")
public class ComplianceValidationController {

	@Autowired
	private ComplianceValidationRepository complianceValidationRepository;
	
	//Operazioni CRUD:
	@GetMapping
	public List<ComplianceValidation> getAllComplianceValidations(){
		return complianceValidationRepository.findAll();
	}
	
	@PostMapping
	public ComplianceValidation createComplianceValidation(@RequestBody ComplianceValidation complianceValidation) {
		return complianceValidationRepository.save(complianceValidation);
	}
		
	@GetMapping("/{id}")
	public ResponseEntity<ComplianceValidation> getComplianceValidationById(@PathVariable Integer id) {
	    return complianceValidationRepository.findById(id)
	    		.map(complianceValidation -> ResponseEntity.ok().body(complianceValidation))
	            .orElse(ResponseEntity.notFound().build());
	}
		
	@PutMapping("/{id}")
	public ResponseEntity<ComplianceValidation> updateUser(@PathVariable Integer id, @RequestBody ComplianceValidation complianceValidationDetails) {
		return complianceValidationRepository.findById(id)
				.map(complianceValidation -> {
					complianceValidation.setRules(complianceValidationDetails.getRules());
	            ComplianceValidation updateComplianceValidation = complianceValidationRepository.save(complianceValidation);
	            return ResponseEntity.ok().body(updateComplianceValidation);
	            })
	            .orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteComplianceValidation(@PathVariable Integer id) {
		return complianceValidationRepository.findById(id)
	            .map(complianceValidation -> {
	            	complianceValidationRepository.delete(complianceValidation);
	            return ResponseEntity.ok().build();
	            })
	            .orElse(ResponseEntity.notFound().build());
	}
	
	//TODO: AGGIUNGERE @GetMapping("/validateCompliance")
	/*public boolean validateCompliance(criteria) {
		
	}*/
	
	//TODO: AGIGUNGERE @PutMapping("/updateRule")
	/*public void updateRule(int rule_id, Rule rule) {
		
	}*/
	
	//TODO: AGGIUNGERE @GetMapping("/complianceStatus"){
	/*public void getComplianceStatus(entity id) {
		
	}*/
}
