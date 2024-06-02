package com.gps.GuardPrivacySystem.controller.PKBController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*import com.gps.GuardPrivacySystem.model.PKBmanager.Feedback;
import com.gps.GuardPrivacySystem.model.PKBmanager.Pattern;
import com.gps.GuardPrivacySystem.model.PKBmanager.PatternExample;
import com.gps.GuardPrivacySystem.model.PKBmanager.Strategy;*/
import com.gps.GuardPrivacySystem.model.PKBmanager.PKBSystem;
import com.gps.GuardPrivacySystem.repository.PKBSystemRepository;

@RestController
@RequestMapping("api/pkb")
public class PKBController {

	@Autowired
	private PKBSystemRepository pkbSystemRepository; 
	
	
	//Operazioni CRUD:
	@GetMapping
	public List<PKBSystem> getAllPkbSystems(){
		return pkbSystemRepository.findAll();
	}
	
	@PostMapping
	public PKBSystem createPkbSystem(@RequestBody PKBSystem pkbSystem) {
		return pkbSystemRepository.save(pkbSystem);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PKBSystem> getPkbSystemById(@PathVariable Integer id){
		return pkbSystemRepository.findById(id)
				.map(pkbSystem -> ResponseEntity.ok().body(pkbSystem))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PKBSystem> updatePkbSystem(@PathVariable Integer id, @RequestBody PKBSystem pkbSystemDetails){
		return pkbSystemRepository.findById(id)
				.map(pkbSystem -> {
					pkbSystem.setName(pkbSystem.getName());
					pkbSystem.setPatterns(pkbSystem.getPatterns());
					pkbSystem.setStrategies(pkbSystem.getStrategies());
					PKBSystem updatePkbSystem = pkbSystemRepository.save(pkbSystem);
					return ResponseEntity.ok().body(updatePkbSystem);
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePkbSystem(@PathVariable Integer id){
		return pkbSystemRepository.findById(id)
				.map(pkbSystem -> {
					pkbSystemRepository.delete(pkbSystem);
					return ResponseEntity.ok().build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	//TODO: AGGIUNGERE METODI
	/*public List<Pattern> searchPattern(criteria){
		
	}*/
	
	/*public Strategy getStrategy(Strategy strategy_id) {
		
	}*/
	
	/*public void addPattern(Pattern pattern) {
		
	}*/
	
	/*public void updatePattern(@PathVariable Integer id, @RequestBody Pattern patternDetails) {
		
	}*/
	
	/*public void deletePattern(@PathVariable Integer id) {
		
	}*/
	
	/*public void submitFeedback(@RequestBody Feedback feedback) {
		
	}*/
	
	/*public List<PatternExample> getPatternExamples() {
		
	}*/
}
