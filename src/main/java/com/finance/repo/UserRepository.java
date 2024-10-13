package com.finance.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
}
