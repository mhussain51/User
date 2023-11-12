package com.curry.customer.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
@Table
public class OrgUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String username;

	@Column
	private String password;

	@Column
	private String email;

	@Column
	private boolean isBlocked;

	@Column
	private String role;

	@Column
	private LocalDate createdDate;


	
    public OrgUser(long id, String username, String password, String email, boolean isBlocked, String role, LocalDate createdDate) {
    	
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
