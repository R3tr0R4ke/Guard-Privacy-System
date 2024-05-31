package com.gps.GuardPrivacySystem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import com.gps.GuardPrivacySystem.model.Strategy;
import com.gps.GuardPrivacySystem.repository.StrategyRepository;

@RestController
@RequestMapping("api/strategies")
public class StrategyController {

	@Autowired
	private StrategyRepository strategyRepository;
	
	@GetMapping
	public List<Strategy> getAllStrategy(){
		return strategyRepository.findAll();
	}
	
	@PostMapping
	public Strategy createStrategy(@RequestBody Strategy strategy) {
		return strategyRepository.save(strategy);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Strategy> getStrategyById(@PathVariable Long id){
		return strategyRepository.findById(id)
				.map(strategy -> ResponseEntity.ok().body(strategy))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Strategy> updateStrategy(@PathVariable Long id, @RequestBody Strategy strategyDetails){
		return strategyRepository.findById(id)
				.map(strategy -> {
					strategy.setName(strategyDetails.getName());
					strategy.setDescription(strategy.getDescription());
					strategy.setPkbSystem(strategy.getPkbSystem());
					Strategy updateStrategy = strategyRepository.save(strategy);
					return ResponseEntity.ok().body(updateStrategy);
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteStrategy(@PathVariable Long id){
		return strategyRepository.findById(id)
				.map(strategy -> {
					strategyRepository.delete(strategy);
					return ResponseEntity.ok().build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
}