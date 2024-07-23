package com.finace.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finace.model.Portfolio;
import com.finace.model.User;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    Portfolio findByNameAndUser(String name, User user);

	List<Portfolio> findAllByUser(User user);
}