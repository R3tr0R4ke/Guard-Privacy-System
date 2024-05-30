package com.gps.GuardPrivacySystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gps.GuardPrivacySystem.model.Utente;
import com.gps.GuardPrivacySystem.repository.UtenteRepository;

@RestController
@RequestMapping("/api/utenti")
public class UtenteController {

	@Autowired
	private UtenteRepository utenteRepository;
		
	@GetMapping
	public List<Utente> getAllUtenti(){
		return utenteRepository.findAll();
	}
	
	@PostMapping
	public Utente createUtente(@RequestBody Utente utente) {
		return utenteRepository.save(utente);
	}
		
	@GetMapping("/{id}")
	public ResponseEntity<Utente> getUserById(@PathVariable Long id) {
	    return utenteRepository.findById(id)
	    		.map(user -> ResponseEntity.ok().body(user))
	            .orElse(ResponseEntity.notFound().build());
	}
		
	@PutMapping("/{id}")
	public ResponseEntity<Utente> updateUser(@PathVariable Long id, @RequestBody Utente userDetails) {
		return utenteRepository.findById(id)
				.map(user -> {
	            user.setUsername(userDetails.getUsername());
	            user.setEmail(userDetails.getEmail());
	            Utente updatedUser = utenteRepository.save(user);
	            return ResponseEntity.ok().body(updatedUser);
	            })
	            .orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
		return utenteRepository.findById(id)
	            .map(user -> {
	            utenteRepository.delete(user);
	            return ResponseEntity.ok().build();
	            })
	            .orElse(ResponseEntity.notFound().build());
	}
}