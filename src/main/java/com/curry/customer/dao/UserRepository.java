package com.curry.customer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curry.customer.model.OrgUser;

public interface UserRepository extends JpaRepository<OrgUser, Long>{

	//List<User> findByLastName(String lastName);

	OrgUser findById(long id);

}
