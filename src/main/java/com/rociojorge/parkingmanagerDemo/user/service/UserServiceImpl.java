package com.rociojorge.parkingmanagerDemo.user.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rociojorge.parkingmanagerDemo.user.domain.*;

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

    @Override
    public void register(UserDao userDao) {

        User user = new User();
        BeanUtils.copyProperties(userDao, user);
        this.userRepository.save(user);
    }
    
}
