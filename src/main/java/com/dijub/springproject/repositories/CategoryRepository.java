package com.dijub.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dijub.springproject.entities.Category;

/**
 * CategoryRepository
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
