package com.gps.GuardPrivacySystem.model.SearchManager;

import jakarta.persistence.*;

@Entity
@Table(name = "result")
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int result_id;
	private String title;
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "query_id")
	private SearchQuery searchQuery;

	//Getters e Setters
	public int getResult_id() {
		return result_id;
	}

	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public SearchQuery getSearchQuery() {
		return searchQuery;
	}

	public void setSearchQuery(SearchQuery searchQuery) {
		this.searchQuery = searchQuery;
	}

	@Override
	public String toString() {
		return "Result [result_id=" + result_id + ", title=" + title + ", content=" + content + ", searchQuery="
				+ searchQuery + ", getResult_id()=" + getResult_id() + ", getTitle()=" + getTitle() + ", getContent()="
				+ getContent() + ", getSearchQuery()=" + getSearchQuery() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}