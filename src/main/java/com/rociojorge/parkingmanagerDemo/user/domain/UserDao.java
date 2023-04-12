package com.rociojorge.parkingmanagerDemo.user.domain;

/**
 * Clase que representa a los usuarios.
 * @author Jorge Reina Romero
 * @author Rocio Gonfaus Luengo
 * @since 12.04.2022
 * @version v0.1
 */

public class UserDao {
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String rol;

    /**
     * Constructor vacio.
     */
    public UserDao(){
        this("","","","");
    }

    /**
     * Constructor con datos
     * @param nombre Nombre de usuario
     * @param apellido1 Primer apellido
     * @param apellido2 Segundo apellido
     * @param rol Rol del usuario
     */
    public UserDao(String nombre, String apellido1, String apellido2, String rol) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.rol = rol;
    }

    /**
     * getter nombre
     * @return devuelve el valor de nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter nombre
     * @param nombre modifica el valor de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter apellido1
     * @return devuelve el valor del apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Setter apellido1
     * @param apellido1 modifica el valor de apellido1
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Getter apellido2
     * @return devuelve el valor de apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Setter apellido2
     * @param apellido2 modifica el valor de apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Getter rol
     * @return devuelve el valor de rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * Setter rol
     * @param rol modifica el valor de rol
     */
    public void setRol(String rol) {
        this.rol = rol;
    }



}
