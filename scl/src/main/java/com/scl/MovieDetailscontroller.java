package com.scl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scl.entity.MovieDetails;
import com.scl.service.MovieDetailsService;

@RestController
public class MovieDetailscontroller {
	
	@Autowired
	private MovieDetailsService movieDetailsService;
	@GetMapping("/getMovie")
	public  List<MovieDetails> getMovie() {
		return movieDetailsService.getMovie();
	}
}
