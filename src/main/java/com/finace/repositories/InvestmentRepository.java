package com.finace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finace.model.Investment;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}