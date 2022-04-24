package com.devsuperior.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
