package com.webapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webapp.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT u from User u WHERE u.email =?1")
	User findByEmail(String email);

}
