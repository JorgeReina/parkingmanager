package com.rociojorge.parkingmanagerDemo.user.service;

import com.rociojorge.parkingmanagerDemo.core.exceptions.UserExistsException;
import com.rociojorge.parkingmanagerDemo.user.domain.*;

/**
 * Interfaz del servicio de usuario.
 * @author Jorge Reina Romero
 * @author Rocio Gonfaus Luengo
 * @since 12.04.2022
 * @version v0.1
 */
public interface UserService {
    
    /**
     * 
     * @return Devuelve todos los usuarios
     */
    public Iterable<User> getAll();

    /**
     * Registra los datos de UserDao
     * @param userDao
     */
    public void register(UserDao userDao) throws UserExistsException;

    public boolean userExits(String email);
    
}
