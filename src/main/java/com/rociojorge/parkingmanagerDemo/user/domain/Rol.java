package com.rociojorge.parkingmanagerDemo.user.domain;

public enum Rol {
    ALUMNO("Alumno"),
    PROFESOR("Profesor"),
    ADMINISTRADOR("Administrador");

    private final String displayName;
    private Rol(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return this.displayName;
    }
}
