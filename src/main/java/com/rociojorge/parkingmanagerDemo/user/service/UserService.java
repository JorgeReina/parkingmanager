package com.rociojorge.parkingmanagerDemo.user.service;

import com.rociojorge.parkingmanagerDemo.user.domain.*;

public interface UserService {
    
    public Iterable<User> getAll();

    public void register(UserDao userDao);
}
