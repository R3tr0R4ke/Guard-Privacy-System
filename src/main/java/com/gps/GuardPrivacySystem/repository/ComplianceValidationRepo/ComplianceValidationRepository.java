package com.gps.GuardPrivacySystem.repository.ComplianceValidationRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gps.GuardPrivacySystem.model.ComplianceManager.ComplianceValidation;

@Repository
public interface ComplianceValidationRepository extends JpaRepository<ComplianceValidation, Integer>{

}
