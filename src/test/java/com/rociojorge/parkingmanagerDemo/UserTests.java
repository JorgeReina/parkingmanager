package com.rociojorge.parkingmanagerDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rociojorge.parkingmanagerDemo.user.domain.Rol;
import com.rociojorge.parkingmanagerDemo.user.domain.User;

public class UserTests {
    
    private User user;

    @BeforeEach
        public void init(){
        this.user = new User ("David", "Hormigo", "Ramirez", Rol.PROFESOR);
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
        Rol actual = user.getRol();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void check_set_apellido1(){
        
        String expected = "McCallan";
        user.setApellido1("McCallan");
        String actual = user.getApellido1();
        assertEquals(actual,expected);

    }

    @Test
    public void check_set_apellido2(){
        
        String expected = "Bird";
        user.setApellido2("Bird");
        String actual = user.getApellido2();
        assertEquals(actual,expected);

    }

    @Test
    public void check_set_nombre(){
        
        String expected = "carlos";
        user.setNombre("carlos");
        String actual = user.getNombre();
        assertEquals(actual,expected);

    }

    @Test
    public void check_set_rol(){
        
        Rol expected = Rol.ALUMNO;
        user.setRol(Rol.ALUMNO);
        Rol actual = user.getRol();
        assertEquals(actual,expected);

    }
}
