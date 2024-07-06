package com.dijub.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dijub.springproject.entities.OrderItem;

/**
 * OrderItemRepository
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
