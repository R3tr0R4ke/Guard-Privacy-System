package com.gps.GuardPrivacySystem.model.SearchManager;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "searchquery")
public class SearchQuery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int query_id;
	private String query;
	
	//Relazione con Result
	@OneToMany(mappedBy = "pattern", cascade = CascadeType.ALL)
	private List<Result> results;

	//Getters e Setters
	public int getQuery_id() {
		return query_id;
	}

	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "SearchQuery [query_id=" + query_id + ", query=" + query + ", results=" + results + ", getQuery_id()="
				+ getQuery_id() + ", getQuery()=" + getQuery() + ", getResults()=" + getResults() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
} 