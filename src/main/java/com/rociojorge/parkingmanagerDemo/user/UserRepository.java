package com.rociojorge.parkingmanagerDemo.user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private ArrayList<User> user;
    public UserRepository() {
        user = new ArrayList<>();
    }

    public List<User> getAll() {
        
        this.user.clear();
        this.user.add(new User("Jorge", "Reina", "Romero", "Alumno"));
        this.user.add(new User("Rocio", "Gonfaus", "Luengo", "Alumno"));
        this.user.add(new User("David", "Hormigo", "Ramirez", "Profesor"));
        return this.user;

    }
    
}
