package com.scl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scl.entity.MovieDetails;
import com.scl.repository.MovieDetailsRepository;

@Service
public class MovieDetailsServiceImpl implements MovieDetailsService {
	
	@Autowired
	private MovieDetailsRepository movieDetailsRepository;
	
	public List<MovieDetails> getMovie() {
		return  movieDetailsRepository.findAll();
	}

}
