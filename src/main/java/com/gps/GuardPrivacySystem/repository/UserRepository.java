package com.gps.GuardPrivacySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gps.GuardPrivacySystem.model.UserManager.UserManagement;

@Repository
public interface UserRepository extends JpaRepository<UserManagement, Integer>{

}
