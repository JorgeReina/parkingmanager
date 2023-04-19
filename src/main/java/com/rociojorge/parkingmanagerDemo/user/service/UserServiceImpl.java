package com.rociojorge.parkingmanagerDemo.user.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rociojorge.parkingmanagerDemo.user.domain.*;

/**
 * Clase de implementacion de servicio de los usuarios
 * @author Jorge Reina Romero
 * @author Rocio Gonfaus Luengo
 * @since 12.04.2022
 * @version v0.1
 */
@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    /**
     * Constructor con datos
     * @param userRepository
     */
    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    /**
     * Devuelve todos los usaurios
     * @return todos los usuarios
     */
    @Override
    public Iterable<User> getAll() {
        return this.userRepository.findAll();
    }

    /**
     * Registra los usuarios
     * @param userdao 
     */
    @Override
    public void register(UserDao userDao) {

        User user = new User();
        BeanUtils.copyProperties(userDao, user);
        this.userRepository.save(user);
    }
    
}
