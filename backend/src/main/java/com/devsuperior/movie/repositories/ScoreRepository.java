package com.devsuperior.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movie.entities.Score;
import com.devsuperior.movie.entities.ScorePk;


public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

}
