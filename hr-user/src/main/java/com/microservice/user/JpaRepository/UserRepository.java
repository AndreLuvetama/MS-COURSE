package com.microservice.user.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.user.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
