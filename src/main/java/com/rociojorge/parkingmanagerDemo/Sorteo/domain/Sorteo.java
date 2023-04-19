package com.rociojorge.parkingmanagerDemo.sorteo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Obejeto sorteo.
 * @author Jorge Reina Romero
 * @author Rocio Gonfaus Luengo
 * @since 12.04.2022
 * @version v0.1
 */
@Entity
public class Sorteo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descripcion;
    private String fecha;
    private Status estado;

    /**
     * Constructor vacio.
     */
    public Sorteo() {
        this("","",null);
    }

    /**
     * Constructor con datos.
     * @param descripcion Nombre del sorteo
     * @param fecha Fecha sorteo
     * @param estado Estado del sorteo
     */
    public Sorteo(String descripcion, String fecha, Status estado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }

    /**
     * Getter descripción.
     * @return  devuelve el valor de descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter descripcion 
     * @param descripcion Modifica el valor de descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter fecha.
     * @return  devuelve el valor de fecha.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Setter fecha 
     * @param descripcion Modifica el valor de fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Getter estado.
     * @return  devuelve el valor de esetado.
     */
    public Status getEstado() {
        return estado;
    }

    /**
     * Setter estado 
     * @param descripcion Modifica el valor de estado
     */
    public void setEstado(Status estado) {
        this.estado = estado;
    }

}
