package com.finace.model;




import jakarta.persistence.*;

import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Portfolio> getPortfolios() {
		return portfolios;
	}

	public void setPortfolios(Set<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}

	private String password;
    
    @OneToMany(mappedBy = "user")
    private Set<Portfolio> portfolios;

  
}