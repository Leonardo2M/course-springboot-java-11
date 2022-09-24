package com.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
