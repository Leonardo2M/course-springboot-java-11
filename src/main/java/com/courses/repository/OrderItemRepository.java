package com.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
