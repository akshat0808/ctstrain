package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;

@RestController
public class MovieController {
	
	 private static List<Movie> movieList = new ArrayList<>();
	    static {
	        movieList.add(new Movie(1, "Namastey London", "summary-1"));
	        movieList.add(new Movie(2, "URI", "summary-2"));
	        movieList.add(new Movie(3, "Ram Leela", "summary-3"));
	    }
	    @GetMapping("/movies")
	    public ResponseEntity<?> getMovies() {

	        return ResponseEntity.ok(movieList);

	    }
	    
	    
	    private Movie findMovie(int id) {
	        return movieList.stream()
	            .filter(movie -> movie.getId()
	                .equals(id))
	            .findFirst()
	            .orElse(null);
	    }
	    
	    
	    
	    @GetMapping("/movies/{id}")
	    public ResponseEntity<?> getMovie(@PathVariable int id) {

	        Movie movie = findMovie(id);
	        if (movie == null) {
	            return ResponseEntity.badRequest()
	                .body("Invalid movie id");
	        }

	        return ResponseEntity.ok(movie);

	    }
	
	

}
