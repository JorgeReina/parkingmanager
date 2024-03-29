package com.rociojorge.parkingmanagerDemo.user.domain;

public class UserDao {
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String rol;

    public UserDao(){
        this("","","","");
    }

    public UserDao(String nombre, String apellido1, String apellido2, String rol) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }



}
