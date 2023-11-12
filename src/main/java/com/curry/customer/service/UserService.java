package com.curry.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curry.customer.dao.UserRepository;
import com.curry.customer.model.OrgUser;

@Service
public class UserService {

    UserRepository userRepo;

    public UserService(UserRepository userRepo){
        this.userRepo  = userRepo;
    }

    public List<OrgUser> getAllUsers(){
        return userRepo.findAll();
    }

    public OrgUser getUserById(long id){
        return userRepo.findById(id);
    }

    public OrgUser saveUser(OrgUser user){
        return userRepo.save(user);
    }
    
    public void deleteUser(long id){
        userRepo.deleteById(id);
    }
    
}
