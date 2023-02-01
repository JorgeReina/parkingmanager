package com.rociojorge.parkingmanagerDemo.user;
public class User {
    
    //private long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String rol;

    public User(String nombre, String apellido1, String apellido2, String rol) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.rol = rol;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public String rol() {
        return this.rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }

}
