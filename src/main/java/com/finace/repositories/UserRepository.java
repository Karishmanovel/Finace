package com.finace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finace.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}



