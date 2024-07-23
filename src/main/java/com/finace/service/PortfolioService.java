package com.finace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finace.model.Portfolio;
import com.finace.model.User;
import com.finace.repositories.PortfolioRepository;
import com.finace.repositories.UserRepository;

import java.util.List;

@Service
public class PortfolioService {
    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private UserRepository userRepository;

    public Portfolio createPortfolio(String username, String portfolioName) {
        User user = userRepository.findByUsername(username);
        Portfolio portfolio = new Portfolio();
        portfolio.setName(portfolioName);
        portfolio.setUser(user);
        return portfolioRepository.save(portfolio);
    }

    public List<Portfolio> getPortfolios(String username) {
        User user = userRepository.findByUsername(username);
        return portfolioRepository.findAllByUser(user);
    }
}