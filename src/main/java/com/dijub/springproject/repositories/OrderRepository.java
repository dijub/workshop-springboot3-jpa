package com.dijub.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dijub.springproject.entities.Order;

/**
 * UserRepository
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

}
