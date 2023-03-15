package com.rociojorge.parkingmanagerDemo.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rociojorge.parkingmanagerDemo.user.domain.User;
import com.rociojorge.parkingmanagerDemo.user.domain.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> getAll() {
        return this.userRepository.findAll();
    }
    
}
