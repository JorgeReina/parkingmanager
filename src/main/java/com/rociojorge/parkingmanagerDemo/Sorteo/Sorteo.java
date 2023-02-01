package com.rociojorge.parkingmanagerDemo.Sorteo;

import java.util.Date;

public class Sorteo {
    
    private String descripcion;
    private Date fecha;
    private String estado;

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
