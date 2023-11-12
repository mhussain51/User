package com.curry.customer;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.curry.customer.dao.UserRepository;
import com.curry.customer.model.OrgUser;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}


  @Bean
  public CommandLineRunner demo(UserRepository repository) {
    return (args) -> {
      // save a few customers
      repository.save(new OrgUser(1,"johndoe","xyz123","johndoe@curry.com",false,"Contributor",LocalDate.now()));
      repository.save(new OrgUser(2,"janedoe","xyz123","janedoe@curry.com",false,"Reader",LocalDate.now()));
      repository.save(new OrgUser(3,"david","xyz123","david@curry.com",false,"Admin",LocalDate.now()));
     
      };
    } 

}

