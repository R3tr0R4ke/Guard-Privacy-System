package com.gps.GuardPrivacySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gps.GuardPrivacySystem.model.NotificationManager.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer>{
}