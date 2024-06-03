package com.gps.GuardPrivacySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gps.GuardPrivacySystem.model.SearchManager.SearchQuery;

@Repository
public interface SearchRepository extends JpaRepository<SearchQuery, Integer>{
}