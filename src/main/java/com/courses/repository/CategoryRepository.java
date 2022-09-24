package com.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
