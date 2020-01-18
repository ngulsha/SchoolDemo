package com.scl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scl.entity.MovieDetails;

@Repository
public interface MovieDetailsRepository extends JpaRepository<MovieDetails, Integer> {

}
