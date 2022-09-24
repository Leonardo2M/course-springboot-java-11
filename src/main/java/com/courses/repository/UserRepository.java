package com.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
