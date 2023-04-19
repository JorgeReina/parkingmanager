package com.rociojorge.parkingmanagerDemo.sorteo.domain;

public class SorteoDao {
    
    private String descripcion;
    private String fecha;
    private Status estado;

    public SorteoDao(){
        this("","",null);
    }

    public SorteoDao(String descripcion, String fecha, Status estado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Status getEstado() {
        return estado;
    }
    public void setEstado(Status estado) {
        this.estado = estado;
    }

}
