package com.gps.GuardPrivacySystem.controller.SearchController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import com.gps.GuardPrivacySystem.model.SearchManager.Result;
import com.gps.GuardPrivacySystem.model.SearchManager.SearchQuery;
import com.gps.GuardPrivacySystem.repository.SearchRepository;

@RestController
@RequestMapping("api/search")
public class SearchController {

	@Autowired
	private SearchRepository searchRepository;
	
	//Operazioni CRUD:
	@GetMapping
	public List<SearchQuery> getAllSearchQueries(){
		return searchRepository.findAll();
	}
	
	@PostMapping
	public SearchQuery createSearchQuery(@RequestBody SearchQuery searchQuery) {
		return searchRepository.save(searchQuery);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SearchQuery> getSearchQuryById(@PathVariable Integer id){
		return searchRepository.findById(id)
				.map(searchQuery -> ResponseEntity.ok().body(searchQuery))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<SearchQuery> updateSearchQuery(@PathVariable Integer id, @RequestBody SearchQuery searchQueryDetails){
		return searchRepository.findById(id)
				.map(searchQuery -> {
					searchQuery.setQuery(searchQuery.getQuery());
					searchQuery.setResults(searchQuery.getResults());
					SearchQuery updateSearchQuery = searchRepository.save(searchQuery);
					return ResponseEntity.ok().body(updateSearchQuery);
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteSearchQuery(@PathVariable Integer id){
		return searchRepository.findById(id)
				.map(searchQuery -> {
					searchRepository.delete(searchQuery);
					return ResponseEntity.ok().build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	/*public List<Result> executeQuery(){
		
	}*/
	
	/*public void saveSearch(query, userId) {
		
	}*/
}
