package com.curry.customer.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
public class User {
	
	private int id;
	private String username;
	private String password;
	private String email;
	private boolean isBlocked;
	private String role;
	private LocalDate createdDate;
	
    public User(int id, String username, String password, String email, boolean isBlocked, String role, LocalDate createdDate) {
    	
    	this.id = id;
    	this.username = username;
    	this.password = password;
    	this.email = email;
    	this.isBlocked = isBlocked;
    	this.createdDate = createdDate;
    	this.role = role;
  	
    }
    
    @Override
    public String toString() {
    	return "USER [username = " + username + " email = " + email+ " isBlocked=" + isBlocked + "role= " + role + " createdDate= " + createdDate +  "]";
    	
    }
	

}
