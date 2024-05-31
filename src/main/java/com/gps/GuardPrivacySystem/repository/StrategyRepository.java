package com.gps.GuardPrivacySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gps.GuardPrivacySystem.model.Strategy;

@Repository
public interface StrategyRepository extends JpaRepository<Strategy, Long>{
}