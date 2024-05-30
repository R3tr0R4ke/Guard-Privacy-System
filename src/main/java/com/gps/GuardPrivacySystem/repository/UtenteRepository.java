package com.gps.GuardPrivacySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gps.GuardPrivacySystem.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long>{

}
