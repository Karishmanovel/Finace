package com.finace.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.finace.model.Portfolio;
import com.finace.service.PortfolioService;

import java.util.List;

@RestController
@RequestMapping("/api/portfolios")
public class PortfolioController {
    @Autowired
    private PortfolioService portfolioService;

    @PostMapping
    public Portfolio createPortfolio(@RequestParam String username, @RequestParam String portfolioName) {
        return portfolioService.createPortfolio(username, portfolioName);
    }
    @GetMapping
    public List<Portfolio> getPortfolios(@RequestParam String username) {
        return portfolioService.getPortfolios(username);
    }
}