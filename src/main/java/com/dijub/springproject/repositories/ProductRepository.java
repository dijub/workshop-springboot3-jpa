package com.dijub.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dijub.springproject.entities.Product;

/**
 * ProductRepository
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
