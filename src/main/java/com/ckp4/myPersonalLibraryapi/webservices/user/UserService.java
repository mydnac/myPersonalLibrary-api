package com.ckp4.myPersonalLibraryapi.webservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired UserRepository repository;

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getUserById(Long id){
        return repository.findById(id).get();
    }
}
