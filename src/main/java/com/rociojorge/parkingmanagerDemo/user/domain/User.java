package com.rociojorge.parkingmanagerDemo.user.domain;

import java.util.Set;

import com.rociojorge.parkingmanagerDemo.sorteo.domain.Sorteo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

/**
 * Objeto de usuarios
 * @author Jorge Reina Romero
 * @author Rocio Gonfaus Luengo
 * @since 12.04.2022
 * @version v0.1
 */

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Rol rol;
    @ManyToMany
    @JoinTable(
        name = "users_assigned",
        joinColumns = @JoinColumn(name="user_id"),
        inverseJoinColumns= @JoinColumn(name = "sorteo_id")
    )
    private Set<Sorteo> includeIn;

    /**
     * Constructor vacio
     */
    public User() {
        this("","","",null);
    }

    /**
     * Constructor con datos
     * @param nombre Nombre de usuario
     * @param apellido1 Primer apellido
     * @param apellido2 Segundo apellido
     * @param rol Rol de usuario
     */
    public User(String nombre, String apellido1, String apellido2, Rol rol) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.rol = rol;
    }

    /**
     * Getter nombre
     * @return Devuelve el valor de nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Getter Apellido1
     * @return Devuelve el valor de apellido1
     */
    public String getApellido1() {
        return this.apellido1;
    }

    /**
     * Getter apellido 2
     * @return Devuelve el valor de apellido2
     */
    public String getApellido2() {
        return this.apellido2;
    }

    /**
     * Getter rol
     * @return devuelve el valor de rol
     */
    public Rol getRol() {
        return this.rol;
    }

    /**
     * Setter nombre
     * @param nombre Modifica el valor de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter apellido1
     * @param apellido1 Modifica el valor de apellido1
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Setter apellido2
     * @param apellido2 Modifica el valor de apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    /**
     * Setter rol
     * @param rol Modifica el valor de rol
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
