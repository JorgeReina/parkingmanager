package com.rociojorge.parkingmanagerDemo.user.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * Clase que representa a los usuarios.
 * @author Jorge Reina Romero
 * @author Rocio Gonfaus Luengo
 * @since 12.04.2022
 * @version v0.1
 */

public class UserDao {
    
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "El primer apellido es obligatorio")
    private String apellido1;
    private String apellido2;
    @Email(message = "El formato del correo no es adecuado")
    @NotBlank(message = "El correo no puede estar vacio")
    private String email;
    private Rol rol;

    /**
     * Constructor vacio.
     */
    public UserDao(){
        this("","","","",null);
    }

    /**
     * Constructor con datos
     * @param nombre Nombre de usuario
     * @param apellido1 Primer apellido
     * @param apellido2 Segundo apellido
     * @param rol Rol del usuario
     */
    public UserDao(String nombre, String apellido1, String apellido2, String email, Rol rol) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
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
     * Getter email
     * @return devuelve el valor de email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter email
     * @param email modifica el valor de email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter rol
     * @return devuelve el valor de rol
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * Setter rol
     * @param rol modifica el valor de rol
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }



}
