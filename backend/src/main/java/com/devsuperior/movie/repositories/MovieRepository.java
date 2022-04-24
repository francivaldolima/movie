package com.devsuperior.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
