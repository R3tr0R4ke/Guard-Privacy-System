package com.gps.GuardPrivacySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gps.GuardPrivacySystem.model.PKBSystem;

@Repository
public interface PKBSystemRepository extends JpaRepository<PKBSystem, Long>{

}
