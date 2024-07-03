package com.dijub.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dijub.springproject.entities.User;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
