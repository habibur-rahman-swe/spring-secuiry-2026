package com.spring_security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_security.entity.Users;

public interface UserDetailsRepository extends JpaRepository<Users, Long> {
	Optional<Users> findByUsername(String username);
}
