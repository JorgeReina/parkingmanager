package com.rociojorge.parkingmanagerDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rociojorge.parkingmanagerDemo.user.User;

public class UserTests {
    
    private User user;

    @BeforeEach
        public void init(){
        this.user = new User ("David", "Hormigo", "Ramirez", "Profesor");
        }

    @Test
    public void check_user_nombre() {
        //Arrange
        String expected = "David";
        //Act
        String actual = user.getNombre();
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void check_apellido1() {
        //Arrange
        String expected = "Hormigo";
        //Act
        String actual = user.getApellido1();
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void check_apellido2() {
        //Arrange
        String expected = "Ramirez";
        //Act
        String actual = user.getApellido2();
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void check_rol() {
        //Arrange
        String expected = "Profesor";
        //Act
        String actual = user.getRol();
        //Assert
        assertEquals(expected, actual);
    }
}
