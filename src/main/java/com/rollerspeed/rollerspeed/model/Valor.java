package com.rollerspeed.rollerspeed.model;

public class Valor {

    private String nombre;
    private String descripcion;

    public Valor(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
}