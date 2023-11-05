package com.curry.customer.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curry.customer.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
private List<User> users = new ArrayList<>();
	
	@GetMapping(path="/all")
	public List<User> getAllUsers(){		
		
		
		User user1 = new User(1,"johndoe","xyz123","johndoe@curry.com",false,"Contributor",LocalDate.now());
		User user2 = new User(2,"janedoe","xyz123","janedoe@curry.com",false,"Reader",LocalDate.now());
		User user3 = new User(3,"david","xyz123","david@curry.com",false,"Admin",LocalDate.now());
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		return users;
	}
	
	@GetMapping(path="/user/{id}")
	public User getAcountById(@PathVariable int id){
		
		Predicate<? super User> predicate = user -> user.getId() == id;
		return users.stream().filter(predicate ).findFirst().orElse(null);
	}

}
