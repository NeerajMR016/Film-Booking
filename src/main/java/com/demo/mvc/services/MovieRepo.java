package com.demo.mvc.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mvc.beans.MovieDetails;

@Repository
public interface MovieRepo extends JpaRepository<MovieDetails, Long> {

}
