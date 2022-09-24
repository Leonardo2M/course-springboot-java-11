package com.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
