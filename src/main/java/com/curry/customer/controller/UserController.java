package com.curry.customer.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curry.customer.model.OrgUser;
import com.curry.customer.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	

@Autowired UserService userService;


	@GetMapping(path="/all")
	public List<OrgUser> getAllUsers(){	
		return userService.getAllUsers();
	}

	@GetMapping(path="/user/{id}")
	public OrgUser getUserById(@PathVariable int id){
		return  userService.getUserById(id);
	}

	@PostMapping(path="/users")
	public OrgUser saveUser(OrgUser user){
		return userService.saveUser(user);
	}

}
