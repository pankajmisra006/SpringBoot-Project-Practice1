package com.practice.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.demo.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

	public Users findByusername(String username);
	
	
}
